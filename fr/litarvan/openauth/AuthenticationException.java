package fr.litarvan.openauth;

import fr.litarvan.openauth.model.AuthError;

public class AuthenticationException extends Exception {
   private AuthError model;

   public AuthenticationException(AuthError model) {
      super(var1.getErrorMessage());
      this.model = var1;
   }

   public AuthError getErrorModel() {
      return this.model;
   }
}
