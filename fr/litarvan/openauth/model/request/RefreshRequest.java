package fr.litarvan.openauth.model.request;

public class RefreshRequest {
   private String accessToken;
   private String clientToken;

   public RefreshRequest(String accessToken, String clientToken) {
      this.accessToken = var1;
      this.clientToken = var2;
   }

   public void setAccessToken(String accessToken) {
      this.accessToken = var1;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public void setClientToken(String clientToken) {
      this.clientToken = var1;
   }

   public String getClientToken() {
      return this.clientToken;
   }
}
