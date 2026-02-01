package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import org.json.JSONException;

public final class _f {
   private final HashMap<String, Jx> V;
   private static String[] v;
   private static final long a = ds.a(-2161248144975047482L, -1293900846984056735L, MethodHandles.lookup().lookupClass()).a(198515108822797L);

   public _f() {
      long var1 = a ^ 40498346555118L;
      String[] var10000 = S();
      super();
      String[] var3 = var10000;

      try {
         this.V = new HashMap();
         if (var3 == null) {
            gQ.o(new gQ[1]);
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   private void j(String var1, Jx var2) {
   }

   public HashMap<String, Jx> n() {
      return this.V;
   }

   public static void J(String[] var0) {
      v = var0;
   }

   public static String[] S() {
      return v;
   }

   static {
      if (S() == null) {
         J(new String[4]);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
