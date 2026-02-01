package club.evon;

import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.lang.invoke.MethodHandles;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;

public final class ModuleManager {
   private final ImmutableClassToInstanceMap<gQ> modules;
   private static String[] data;
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

      this.modules = var4.build();
      C.P(this);
   }

   @_S
   private void onTick(vT event) {
      // $FF: Couldn't be decompiled
   }

   public Collection<gQ> getModules() {
      return this.modules.values();
   }

   public gQ getModuleByName(String name) {
      long var2 = a ^ 58352523420747L;
      String[] var4 = zo.k();

      try {
         gQ module = (gQ)this.getModules().stream().filter((m) -> {
            return m.x().replace(" ", "").equalsIgnoreCase(name.replace(" ", ""));
         }).findFirst().orElse((Object)null);
         if (gQ.q() == null) {
            zo.Q(new String[5]);
         }

         return module;
      } catch (JSONException var5) {
         throw wrapException(var5);
      }
   }

   public List<gQ> getModulesByCategory(zo category) {
      // $FF: Couldn't be decompiled
   }

   public <T extends gQ> T getModule(Class<T> clazz) {
      return (gQ)this.modules.getInstance(clazz);
   }

   public static void setData(String[] data) {
      ModuleManager.data = data;
   }

   public static String[] getData() {
      return data;
   }

   static {
      if (getData() != null) {
         setData(new String[5]);
      }

   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
