package club.evon;

import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public class K extends B<t[]> {
   private static boolean q;
   private static final long b = ds.a(1547606234334889385L, -2161277111399607946L, MethodHandles.lookup().lookupClass()).a(189139624876006L);

   public K(String name, t... value) {
      super(var1, var2);
   }

   public t C(String name) {
      long var2 = b ^ 3126941603427L;
      t[] var4 = (t[])this.J();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         t var7 = var4[var6];

         try {
            if (var7.S().equalsIgnoreCase(var1)) {
               return var7;
            }
         } catch (JSONException var8) {
            throw a(var8);
         }
      }

      return null;
   }

   public static void T(boolean var0) {
      q = var0;
   }

   public static boolean M() {
      return q;
   }

   public static boolean q() {
      boolean var0 = M();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      if (M()) {
         T(true);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
