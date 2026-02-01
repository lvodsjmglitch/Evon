package fr.litarvan.openauth.microsoft.model.response;

public class XboxLoginResponse {
   private final String IssueInstant;
   private final String NotAfter;
   private final String Token;
   private final XboxLoginResponse$XboxLiveLoginResponseClaims DisplayClaims;

   public XboxLoginResponse(String IssueInstant, String NotAfter, String Token, XboxLoginResponse$XboxLiveLoginResponseClaims DisplayClaims) {
      this.IssueInstant = var1;
      this.NotAfter = var2;
      this.Token = var3;
      this.DisplayClaims = var4;
   }

   public String getIssueInstant() {
      return this.IssueInstant;
   }

   public String getNotAfter() {
      return this.NotAfter;
   }

   public String getToken() {
      return this.Token;
   }

   public XboxLoginResponse$XboxLiveLoginResponseClaims getDisplayClaims() {
      return this.DisplayClaims;
   }
}
