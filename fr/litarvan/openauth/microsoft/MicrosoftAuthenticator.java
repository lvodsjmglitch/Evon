package fr.litarvan.openauth.microsoft;

import fr.litarvan.openauth.microsoft.model.request.MinecraftLoginRequest;
import fr.litarvan.openauth.microsoft.model.request.XSTSAuthorizationProperties;
import fr.litarvan.openauth.microsoft.model.request.XboxLiveLoginProperties;
import fr.litarvan.openauth.microsoft.model.request.XboxLoginRequest;
import fr.litarvan.openauth.microsoft.model.response.MicrosoftRefreshResponse;
import fr.litarvan.openauth.microsoft.model.response.MinecraftLoginResponse;
import fr.litarvan.openauth.microsoft.model.response.MinecraftProfile;
import fr.litarvan.openauth.microsoft.model.response.MinecraftStoreResponse;
import fr.litarvan.openauth.microsoft.model.response.XboxLoginResponse;
import java.io.UnsupportedEncodingException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

public class MicrosoftAuthenticator {
   public static final String MICROSOFT_AUTHORIZATION_ENDPOINT = "https://login.live.com/oauth20_authorize.srf";
   public static final String MICROSOFT_TOKEN_ENDPOINT = "https://login.live.com/oauth20_token.srf";
   public static final String MICROSOFT_REDIRECTION_ENDPOINT = "https://login.live.com/oauth20_desktop.srf";
   public static final String XBOX_LIVE_AUTH_HOST = "user.auth.xboxlive.com";
   public static final String XBOX_LIVE_CLIENT_ID = "000000004C12AE6F";
   public static final String XBOX_LIVE_SERVICE_SCOPE = "service::user.auth.xboxlive.com::MBI_SSL";
   public static final String XBOX_LIVE_AUTHORIZATION_ENDPOINT = "https://user.auth.xboxlive.com/user/authenticate";
   public static final String XSTS_AUTHORIZATION_ENDPOINT = "https://xsts.auth.xboxlive.com/xsts/authorize";
   public static final String MINECRAFT_AUTH_ENDPOINT = "https://api.minecraftservices.com/authentication/login_with_xbox";
   public static final String CHANGE_NAME_ENDPOINT = "https://api.minecraftservices.com/minecraft/profile/name/";
   public static final String XBOX_LIVE_AUTH_RELAY = "http://auth.xboxlive.com";
   public static final String MINECRAFT_AUTH_RELAY = "rp://api.minecraftservices.com/";
   public static final String MINECRAFT_STORE_ENDPOINT = "https://api.minecraftservices.com/entitlements/mcstore";
   public static final String MINECRAFT_PROFILE_ENDPOINT = "https://api.minecraftservices.com/minecraft/profile";
   public static final String MINECRAFT_STORE_IDENTIFIER = "game_minecraft";
   private final HttpClient http = new HttpClient();

   public MicrosoftAuthResult loginWithCredentials(String email, String password) throws MicrosoftAuthenticationException {
      CookieHandler var3 = CookieHandler.getDefault();
      CookieHandler.setDefault(new CookieManager((CookieStore)null, CookiePolicy.ACCEPT_ALL));
      HashMap var4 = new HashMap();
      var4.put("login", var1);
      var4.put("loginfmt", var1);
      var4.put("passwd", var2);

      HttpURLConnection var5;
      try {
         PreAuthData var6 = this.preAuthRequest();
         var4.put("PPFT", var6.getPPFT());
         var5 = this.http.followRedirects(this.http.postForm(var6.getUrlPost(), var4));
      } finally {
         CookieHandler.setDefault(var3);
      }

      try {
         return this.loginWithTokens(this.extractTokens(var5.getURL().toString()));
      } catch (MicrosoftAuthenticationException var13) {
         try {
            if (this.match("identity/confirm", this.http.readResponse(var5)) != null) {
               throw new MicrosoftAuthenticationException("User has enabled double-authentication or must allow sign-in on https://account.live.com/activity");
            }
         } catch (MicrosoftAuthenticationException var12) {
            throw a(var12);
         }

         throw var13;
      }
   }

   public MicrosoftAuthResult loginWithRefreshToken(String refreshToken) throws MicrosoftAuthenticationException {
      Map var2 = this.getLoginParams();
      var2.put("refresh_token", var1);
      var2.put("grant_type", "refresh_token");
      MicrosoftRefreshResponse var3 = (MicrosoftRefreshResponse)this.http.postFormGetJson("https://login.live.com/oauth20_token.srf", var2, MicrosoftRefreshResponse.class);
      return this.loginWithTokens(new AuthTokens(var3.getAccessToken(), var3.getRefreshToken()));
   }

   public MicrosoftAuthResult loginWithTokens(AuthTokens tokens) throws MicrosoftAuthenticationException {
      XboxLoginResponse var2 = this.xboxLiveLogin(var1.getAccessToken());
      XboxLoginResponse var3 = this.xstsLogin(var2.getToken());
      String var4 = var3.getDisplayClaims().getUsers()[0].getUserHash();
      MinecraftLoginResponse var5 = this.minecraftLogin(var4, var3.getToken());
      MinecraftStoreResponse var6 = (MinecraftStoreResponse)this.http.getJson("https://api.minecraftservices.com/entitlements/mcstore", var5.getAccessToken(), MinecraftStoreResponse.class);

      try {
         if (Arrays.stream(var6.getItems()).noneMatch((var0) -> {
            return var0.getName().equals("game_minecraft");
         })) {
            throw new MicrosoftAuthenticationException("Player didn't buy Minecraft Java Edition or did not migrate its account");
         }
      } catch (MicrosoftAuthenticationException var8) {
         throw a(var8);
      }

      MinecraftProfile var7 = (MinecraftProfile)this.http.getJson("https://api.minecraftservices.com/minecraft/profile", var5.getAccessToken(), MinecraftProfile.class);
      return new MicrosoftAuthResult(var7, var5.getAccessToken(), var1.getRefreshToken());
   }

   protected PreAuthData preAuthRequest() throws MicrosoftAuthenticationException {
      Map var1 = this.getLoginParams();
      var1.put("display", "touch");
      var1.put("locale", "en");
      String var2 = this.http.getText("https://login.live.com/oauth20_authorize.srf", var1);
      String var3 = this.match("sFTTag:'.*value=\"([^\"]*)\"", var2);
      String var4 = this.match("urlPost: ?'(.+?(?='))", var2);
      return new PreAuthData(var3, var4);
   }

   protected XboxLoginResponse xboxLiveLogin(String accessToken) throws MicrosoftAuthenticationException {
      XboxLiveLoginProperties var2 = new XboxLiveLoginProperties("RPS", "user.auth.xboxlive.com", var1);
      XboxLoginRequest var3 = new XboxLoginRequest(var2, "http://auth.xboxlive.com", "JWT");
      return (XboxLoginResponse)this.http.postJson("https://user.auth.xboxlive.com/user/authenticate", var3, XboxLoginResponse.class);
   }

   protected XboxLoginResponse xstsLogin(String xboxLiveToken) throws MicrosoftAuthenticationException {
      XSTSAuthorizationProperties var2 = new XSTSAuthorizationProperties("RETAIL", new String[]{var1});
      XboxLoginRequest var3 = new XboxLoginRequest(var2, "rp://api.minecraftservices.com/", "JWT");
      return (XboxLoginResponse)this.http.postJson("https://xsts.auth.xboxlive.com/xsts/authorize", var3, XboxLoginResponse.class);
   }

   protected MinecraftLoginResponse minecraftLogin(String userHash, String xstsToken) throws MicrosoftAuthenticationException {
      MinecraftLoginRequest var3 = new MinecraftLoginRequest(String.format("XBL3.0 x=%s;%s", var1, var2));
      return (MinecraftLoginResponse)this.http.postJson("https://api.minecraftservices.com/authentication/login_with_xbox", var3, MinecraftLoginResponse.class);
   }

   protected Map<String, String> getLoginParams() {
      HashMap var1 = new HashMap();
      var1.put("client_id", "000000004C12AE6F");
      var1.put("redirect_uri", "https://login.live.com/oauth20_desktop.srf");
      var1.put("scope", "service::user.auth.xboxlive.com::MBI_SSL");
      var1.put("response_type", "token");
      return var1;
   }

   protected AuthTokens extractTokens(String url) throws MicrosoftAuthenticationException {
      return new AuthTokens(this.extractValue(var1, "access_token"), this.extractValue(var1, "refresh_token"));
   }

   protected String extractValue(String url, String key) throws MicrosoftAuthenticationException {
      String var3 = this.match(var2 + "=([^&]*)", var1);

      try {
         if (var3 == null) {
            throw new MicrosoftAuthenticationException("Invalid credentials or tokens " + var2);
         }
      } catch (UnsupportedEncodingException var6) {
         throw a(var6);
      }

      try {
         return URLDecoder.decode(var3, "UTF-8");
      } catch (UnsupportedEncodingException var5) {
         throw new MicrosoftAuthenticationException(var5);
      }
   }

   protected String match(String regex, String content) {
      Matcher var3 = Pattern.compile(var1).matcher(var2);

      try {
         if (!var3.find()) {
            return null;
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      return var3.group(1);
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
