package club.evon;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

class vO extends Authenticator {
   final String i;
   final String y;

   vO(Ja var1, String var2, String var3) {
      this.i = var2;
      this.y = var3;
   }

   protected PasswordAuthentication getPasswordAuthentication() {
      return new PasswordAuthentication(this.i, this.y.toCharArray());
   }
}
