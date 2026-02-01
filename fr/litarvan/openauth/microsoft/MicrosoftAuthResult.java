package fr.litarvan.openauth.microsoft;

import fr.litarvan.openauth.microsoft.model.response.MinecraftProfile;

public class MicrosoftAuthResult {
   private final MinecraftProfile profile;
   private final String accessToken;
   private final String refreshToken;

   public MicrosoftAuthResult(MinecraftProfile profile, String accessToken, String refreshToken) {
      this.profile = var1;
      this.accessToken = var2;
      this.refreshToken = var3;
   }

   public MicrosoftAuthResult(MinecraftProfile profile, String accessToken) {
      this.profile = var1;
      this.accessToken = var2;
      this.refreshToken = null;
   }

   public MinecraftProfile getProfile() {
      return this.profile;
   }

   public String getAccessToken() {
      return this.accessToken;
   }

   public String getRefreshToken() {
      return this.refreshToken;
   }
}
