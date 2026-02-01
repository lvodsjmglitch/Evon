package fr.litarvan.openauth.microsoft.model.response;

public class MinecraftLoginResponse {
   private final String username;
   private final String access_token;
   private final String token_type;
   private final long expires_in;

   public MinecraftLoginResponse(String username, String access_token, String token_type, long expires_in) {
      this.username = var1;
      this.access_token = var2;
      this.token_type = var3;
      this.expires_in = var4;
   }

   public String getUsername() {
      return this.username;
   }

   public String getAccessToken() {
      return this.access_token;
   }

   public String getTokenType() {
      return this.token_type;
   }

   public long getExpiresIn() {
      return this.expires_in;
   }
}
