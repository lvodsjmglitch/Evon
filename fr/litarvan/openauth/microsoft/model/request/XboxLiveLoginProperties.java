package fr.litarvan.openauth.microsoft.model.request;

public class XboxLiveLoginProperties {
   private final String AuthMethod;
   private final String SiteName;
   private final String RpsTicket;

   public XboxLiveLoginProperties(String AuthMethod, String SiteName, String RpsTicket) {
      this.AuthMethod = var1;
      this.SiteName = var2;
      this.RpsTicket = var3;
   }

   public String getAuthMethod() {
      return this.AuthMethod;
   }

   public String getSiteName() {
      return this.SiteName;
   }

   public String getRpsTicket() {
      return this.RpsTicket;
   }
}
