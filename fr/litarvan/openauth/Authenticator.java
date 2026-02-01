package fr.litarvan.openauth;

import com.google.gson.Gson;
import fr.litarvan.openauth.model.AuthAgent;
import fr.litarvan.openauth.model.AuthError;
import fr.litarvan.openauth.model.request.AuthRequest;
import fr.litarvan.openauth.model.request.InvalidateRequest;
import fr.litarvan.openauth.model.request.RefreshRequest;
import fr.litarvan.openauth.model.request.SignoutRequest;
import fr.litarvan.openauth.model.request.ValidateRequest;
import fr.litarvan.openauth.model.response.AuthResponse;
import fr.litarvan.openauth.model.response.RefreshResponse;
import java.io.IOException;
import java.net.Proxy;

public class Authenticator {
   @Deprecated
   public static final String MOJANG_AUTH_URL = "https://authserver.mojang.com/";
   private final String authURL;
   private final AuthPoints authPoints;

   public Authenticator(String authURL, AuthPoints authPoints) {
      this.authURL = var1;
      this.authPoints = var2;
   }

   public AuthResponse authenticate(AuthAgent agent, String username, String password, String clientToken) throws AuthenticationException {
      return this.authenticate(var1, var2, var3, var4, Proxy.NO_PROXY);
   }

   public AuthResponse authenticate(AuthAgent agent, String username, String password, String clientToken, Proxy proxy) throws AuthenticationException {
      AuthRequest var6 = new AuthRequest(var1, var2, var3, var4);
      return (AuthResponse)this.sendRequest(var6, AuthResponse.class, this.authPoints.getAuthenticatePoint(), var5);
   }

   public RefreshResponse refresh(String accessToken, String clientToken) throws AuthenticationException {
      return this.refresh(var1, var2, Proxy.NO_PROXY);
   }

   public RefreshResponse refresh(String accessToken, String clientToken, Proxy proxy) throws AuthenticationException {
      RefreshRequest var4 = new RefreshRequest(var1, var2);
      return (RefreshResponse)this.sendRequest(var4, RefreshResponse.class, this.authPoints.getRefreshPoint(), var3);
   }

   public void validate(String accessToken) throws AuthenticationException {
      this.validate(var1, Proxy.NO_PROXY);
   }

   public void validate(String accessToken, Proxy proxy) throws AuthenticationException {
      ValidateRequest var3 = new ValidateRequest(var1);
      this.sendRequest(var3, (Class)null, this.authPoints.getValidatePoint(), var2);
   }

   public void signout(String username, String password) throws AuthenticationException {
      this.signout(var1, var2, Proxy.NO_PROXY);
   }

   public void signout(String username, String password, Proxy proxy) throws AuthenticationException {
      SignoutRequest var4 = new SignoutRequest(var1, var2);
      this.sendRequest(var4, (Class)null, this.authPoints.getSignoutPoint(), var3);
   }

   public void invalidate(String accessToken, String clientToken) throws AuthenticationException {
      this.invalidate(var1, var2, Proxy.NO_PROXY);
   }

   public void invalidate(String accessToken, String clientToken, Proxy proxy) throws AuthenticationException {
      InvalidateRequest var4 = new InvalidateRequest(var1, var2);
      this.sendRequest(var4, (Class)null, this.authPoints.getInvalidatePoint(), var3);
   }

   private Object sendRequest(Object var1, Class<?> var2, String var3) throws AuthenticationException {
      return this.sendRequest(var1, var2, var3, Proxy.NO_PROXY);
   }

   private Object sendRequest(Object var1, Class<?> var2, String var3, Proxy var4) throws AuthenticationException {
      Gson var5 = new Gson();

      String var6;
      try {
         var6 = this.sendPostRequest(this.authURL + var3, var5.toJson(var1), var4);
      } catch (IOException var9) {
         throw new AuthenticationException(new AuthError("Can't send the request : " + var9.getClass().getName(), var9.getMessage(), "Unknown"));
      }

      try {
         return var2 != null ? var5.fromJson(var6, var2) : null;
      } catch (IOException var8) {
         throw a(var8);
      }
   }

   private String sendPostRequest(String var1, String var2) throws AuthenticationException, IOException {
      return this.sendPostRequest(var1, var2, Proxy.NO_PROXY);
   }

   private String sendPostRequest(String param1, String param2, Proxy param3) throws AuthenticationException, IOException {
      // $FF: Couldn't be decompiled
   }

   private static IOException a(IOException var0) {
      return var0;
   }
}
