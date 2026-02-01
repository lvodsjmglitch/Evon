package fr.litarvan.openauth.model;

public class AuthError {
   private String error;
   private String errorMessage;
   private String cause;

   public AuthError(String error, String errorMessage, String cause) {
      this.error = var1;
      this.errorMessage = var2;
      this.cause = var3;
   }

   public String getError() {
      return this.error;
   }

   public String getErrorMessage() {
      return this.errorMessage;
   }

   public String getCause() {
      return this.cause;
   }
}
