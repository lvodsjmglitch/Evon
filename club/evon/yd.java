package club.evon;

import org.json.JSONException;

public final class yd extends vJ<gn> {
   private static boolean W;

   public yd(String name, gn parent) {
      super(var1, var2);
   }

   @_S
   private void p(vj var1) {
      var1.K();
   }

   public static void b(boolean var0) {
      W = var0;
   }

   public static boolean t() {
      return W;
   }

   public static boolean v() {
      boolean var0 = t();

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
      if (v()) {
         b(true);
      }

   }
}
