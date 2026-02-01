package club.evon;

import java.lang.invoke.MethodHandles;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.hypixel.modapi.error.ErrorReason;

public interface z6 {
   Event<z6> l = EventFactory.createArrayBacked(z6.class, (var0) -> {
      return (var1, var2) -> {
         long var3 = a ^ 3288760371333L;
         z6[] var6 = var0;
         int[] var10000 = vD.t();
         int var7 = var0.length;
         int var8 = 0;
         int[] var5 = var10000;

         while(var8 < var7) {
            z6 var9 = var6[var8];
            var9.e(var1, var2);
            ++var8;
            if (var5 == null) {
               break;
            }
         }

      };
   });
   long a = ds.a(302543381095523222L, 5829185379141425254L, MethodHandles.lookup().lookupClass()).a(277347648242665L);

   void e(String var1, ErrorReason var2);
}
