package fr.litarvan.openauth.microsoft.model.request;

public class XboxLoginRequest<T> {
   private final T Properties;
   private final String RelyingParty;
   private final String TokenType;

   public XboxLoginRequest(T Properties, String RelyingParty, String TokenType) {
      this.Properties = var1;
      this.RelyingParty = var2;
      this.TokenType = var3;
   }

   public T getProperties() {
      return this.Properties;
   }

   public String getSiteName() {
      return this.RelyingParty;
   }

   public String getTokenType() {
      return this.TokenType;
   }
}
