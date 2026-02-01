package fr.litarvan.openauth.microsoft;

import java.io.IOException;

public class MicrosoftAuthenticationException extends Exception {
   public MicrosoftAuthenticationException(String message) {
      super(var1);
   }

   public MicrosoftAuthenticationException(IOException cause) {
      super("I/O exception thrown during Microsoft HTTP requests", var1);
   }

   public MicrosoftAuthenticationException(Throwable cause) {
      super(var1);
   }
}
