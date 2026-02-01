package fr.litarvan.openauth.model.response;

import fr.litarvan.openauth.model.AuthProfile;

public class RefreshResponse {
   private String accessToken;
   private String clientToken;
   private AuthProfile selectedProfile;

   public RefreshResponse(String accessToken, String clientToken, AuthProfile selectedProfile) {
      this.accessToken = var1;
      this.clientToken = var2;
      this.selectedProfile = var3;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public String getClientToken() {
      return this.clientToken;
   }

   public AuthProfile getSelectedProfile() {
      return this.selectedProfile;
   }
}
