package fr.litarvan.openauth.microsoft.model.request;

public class XSTSAuthorizationProperties {
   private final String SandboxId;
   private final String[] UserTokens;

   public XSTSAuthorizationProperties(String SandboxId, String[] UserTokens) {
      this.SandboxId = var1;
      this.UserTokens = var2;
   }

   public String getSandboxId() {
      return this.SandboxId;
   }

   public String[] getUserTokens() {
      return this.UserTokens;
   }
}
