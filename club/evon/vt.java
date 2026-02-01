package club.evon;

import org.json.JSONException;

public class vt implements JL {
   private boolean g;
   private static boolean b;

   public void K() {
      this.g = true;
   }

   public void h(boolean canceled) {
      this.g = var1;
   }

   public boolean e() {
      return this.g;
   }

   public static void q(boolean var0) {
      b = var0;
   }

   public static boolean u() {
      return b;
   }

   public static boolean A() {
      boolean var0 = u();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   static {
      if (!A()) {
         q(true);
      }

   }
}
