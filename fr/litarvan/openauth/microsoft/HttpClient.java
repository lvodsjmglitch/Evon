package fr.litarvan.openauth.microsoft;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import org.json.JSONObject;

public class HttpClient {
   public static final String MIME_TYPE_JSON = "application/json";
   public static final String MIME_TYPE_URLENCODED_FORM = "application/x-www-form-urlencoded";
   private final Gson gson = new Gson();

   public String getText(String url, Map<String, String> params) throws MicrosoftAuthenticationException {
      return this.readResponse(this.createConnection(var1 + "?" + this.buildParams(var2)));
   }

   public String readPost(String url, Map<String, Object> params, String contentType) throws MicrosoftAuthenticationException {
      return this.readResponse(this.post(var1, var3, "*/*", this.buildParamsStr(var2)));
   }

   public String readPost(String url, Map<String, Object> params, String contentType, String accept) throws MicrosoftAuthenticationException {
      return this.readJson(this.post(var1, var3, var4, this.buildParamsStr(var2)));
   }

   public String readPost(String url, JSONObject params, String contentType) throws MicrosoftAuthenticationException {
      HttpURLConnection var4 = this.post(var1, var3, "*/*", var2.toString());
      return this.readJson(var4);
   }

   public String readPost(String url, JSONObject params, String contentType, String accept) throws MicrosoftAuthenticationException {
      HttpURLConnection var5 = this.post(var1, var3, var4, var2.toString());
      return this.readJson(var5);
   }

   public <T> T getJson(String url, String token, Class<T> responseClass) throws MicrosoftAuthenticationException {
      HttpURLConnection var4 = this.createConnection(var1);
      var4.addRequestProperty("Authorization", "Bearer " + var2);
      var4.addRequestProperty("Accept", "application/json");
      return this.readJson(var4, var3);
   }

   public HttpURLConnection postForm(String url, Map<String, String> params) throws MicrosoftAuthenticationException {
      return this.post(var1, "application/x-www-form-urlencoded", "*/*", this.buildParams(var2));
   }

   public <T> T postJson(String url, Object request, Class<T> responseClass) throws MicrosoftAuthenticationException {
      HttpURLConnection var4 = this.post(var1, "application/json", "application/json", this.gson.toJson(var2));
      return this.readJson(var4, var3);
   }

   public <T> T postFormGetJson(String url, Map<String, String> params, Class<T> responseClass) throws MicrosoftAuthenticationException {
      return this.readJson(this.postForm(var1, var2), var3);
   }

   protected HttpURLConnection post(String url, String contentType, String accept, String data) throws MicrosoftAuthenticationException {
      HttpURLConnection var5 = this.createConnection(var1);
      var5.setDoOutput(true);
      var5.addRequestProperty("Content-Type", var2);
      var5.addRequestProperty("Accept", var3);

      try {
         var5.setRequestMethod("POST");
         var5.getOutputStream().write(var4.getBytes());
         return var5;
      } catch (IOException var7) {
         throw new MicrosoftAuthenticationException(var7);
      }
   }

   protected HttpURLConnection put(String url) throws MicrosoftAuthenticationException {
      HttpURLConnection var2 = this.createConnection(var1);
      var2.setDoOutput(true);

      try {
         var2.setRequestMethod("PUT");
         return var2;
      } catch (IOException var4) {
         throw new MicrosoftAuthenticationException(var4);
      }
   }

   protected <T> T readJson(HttpURLConnection connection, Class<T> responseType) throws MicrosoftAuthenticationException {
      return this.gson.fromJson(this.readResponse(var1), var2);
   }

   protected String readJson(HttpURLConnection connection) throws MicrosoftAuthenticationException {
      return this.readResponse(var1);
   }

   protected String readResponse(HttpURLConnection connection) throws MicrosoftAuthenticationException {
      String var2 = var1.getHeaderField("Location");

      try {
         if (var2 != null) {
            return this.readResponse(this.createConnection(var2));
         }
      } catch (Throwable var15) {
         throw a(var15);
      }

      StringBuilder var3 = new StringBuilder();

      try {
         Object var4 = var1.getInputStream();
         if (this.checkUrl(var1.getURL())) {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            byte[] var7 = new byte[8192];

            while(true) {
               int var6;
               int var10000 = var6 = ((InputStream)var4).read(var7, 0, var7.length);

               try {
                  if (var10000 == -1) {
                     break;
                  }

                  var5.write(var7, 0, var6);
               } catch (Throwable var10) {
                  throw a(var10);
               }
            }

            byte[] var8 = var5.toString("UTF-8").replaceAll("integrity ?=", "integrity.disabled=").replaceAll("setAttribute\\(\"integrity\"", "setAttribute(\"integrity.disabled\"").getBytes(StandardCharsets.UTF_8);
            var4 = new ByteArrayInputStream(var8);
         }

         try {
            BufferedReader var16 = new BufferedReader(new InputStreamReader((InputStream)var4));

            try {
               while(true) {
                  String var17;
                  String var18 = var17 = var16.readLine();

                  try {
                     if (var18 == null) {
                        break;
                     }

                     var3.append(var17).append('\n');
                  } catch (Throwable var11) {
                     throw a(var11);
                  }
               }
            } catch (Throwable var12) {
               try {
                  var16.close();
               } catch (Throwable var9) {
                  var12.addSuppressed(var9);
               }

               throw var12;
            }

            var16.close();
         } catch (IOException var13) {
            throw new MicrosoftAuthenticationException(var13);
         }
      } catch (IOException var14) {
         throw new RuntimeException(var14);
      }

      return var3.toString();
   }

   private boolean checkUrl(URL param1) {
      // $FF: Couldn't be decompiled
   }

   protected HttpURLConnection followRedirects(HttpURLConnection connection) throws MicrosoftAuthenticationException {
      String var2 = var1.getHeaderField("Location");
      if (var2 != null) {
         var1 = this.followRedirects(this.createConnection(var2));
      }

      return var1;
   }

   protected String buildParamsStr(Map<String, Object> params) {
      StringBuilder var2 = new StringBuilder();
      var1.forEach((var1x, var2x) -> {
         try {
            if (var2.length() > 0) {
               var2.append('&');
            }
         } catch (UnsupportedEncodingException var5) {
            throw a(var5);
         }

         try {
            var2.append(var1x).append('=').append(URLEncoder.encode(var2x.toString(), "UTF-8"));
         } catch (UnsupportedEncodingException var4) {
         }

      });
      return var2.toString();
   }

   protected String buildParams(Map<String, String> params) {
      StringBuilder var2 = new StringBuilder();
      var1.forEach((var1x, var2x) -> {
         try {
            if (var2.length() > 0) {
               var2.append('&');
            }
         } catch (UnsupportedEncodingException var5) {
            throw a(var5);
         }

         try {
            var2.append(var1x).append('=').append(URLEncoder.encode(var2x, "UTF-8"));
         } catch (UnsupportedEncodingException var4) {
         }

      });
      return var2.toString();
   }

   protected HttpURLConnection createConnection(String url) throws MicrosoftAuthenticationException {
      HttpURLConnection var2;
      try {
         var2 = (HttpURLConnection)(new URL(var1)).openConnection();
      } catch (IOException var4) {
         throw new MicrosoftAuthenticationException(var4);
      }

      String var3 = "Mozilla/5.0 (XboxReplay; XboxLiveAuth/3.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36";
      var2.setRequestProperty("Accept-Language", "en-US");
      var2.setRequestProperty("Accept-Charset", "UTF-8");
      var2.setRequestProperty("User-Agent", var3);
      return var2;
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }
}
