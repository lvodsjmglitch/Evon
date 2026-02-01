package club.evon;

import org.json.JSONException;

public final class JV {
   private static final yj i = new yj();
   private static final zk a = new zk();
   private static int B;

   public static yj M() {
      return i;
   }

   public static zk O() {
      return a;
   }

   static {
      f(31);
   }

   public static void f(int var0) {
      B = var0;
   }

   public static int N() {
      return B;
   }

   public static int o() {
      int var0 = N();

      try {
         return var0 == 0 ? 74 : 0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
