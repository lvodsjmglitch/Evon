package club.evon;

import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;

public final class yL {
   private final ImmutableClassToInstanceMap<gQ> V;
   private static String[] u;
   private static final long a = ds.a(-4296797870919973100L, -6427448338481363843L, MethodHandles.lookup().lookupClass()).a(197882230620820L);

   public yL(gQ... modules) {
      long var2 = a ^ 43608719049431L;
      super();
      Builder var4 = new Builder();
      gQ[] var5 = var1;
      int var6 = var1.length;

      for(int var7 = 0; var7 < var6; ++var7) {
         gQ var8 = var5[var7];
         var4.put(var8.getClass(), var8);
      }

      this.V = var4.build();
      C.P(this);
   }

   @_S
   private void u(vT param1) {
      // $FF: Couldn't be decompiled
   }

   public Collection<gQ> j() {
      return this.V.values();
   }

   public gQ i(String name) {
      long var2 = a ^ 58352523420747L;
      String[] var4 = zo.k();

      try {
         gQ var10000 = (gQ)this.j().stream().filter((var1x) -> {
            return var1x.x().replace(" ", "").equalsIgnoreCase(var1.replace(" ", ""));
         }).findFirst().orElse((Object)null);
         if (gQ.q() == null) {
            zo.Q(new String[5]);
         }

         return var10000;
      } catch (JSONException var5) {
         throw a(var5);
      }
   }

   public List<gQ> J(zo category) {
      // $FF: Couldn't be decompiled
   }

   public <T extends gQ> T R(Class<T> clazz) {
      return (gQ)this.V.getInstance(var1);
   }

   public static void d(String[] var0) {
      u = var0;
   }

   public static String[] q() {
      return u;
   }

   static {
      if (q() != null) {
         d(new String[5]);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
