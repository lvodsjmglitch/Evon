package club.evon;

import java.lang.invoke.MethodHandles;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.hypixel.modapi.packet.ClientboundHypixelPacket;

public interface zd {
   Event<zd> c = EventFactory.createArrayBacked(zd.class, (var0) -> {
      return (var1) -> {
         long var2 = a ^ 140191175262255L;
         int[] var10000 = vD.t();
         zd[] var5 = var0;
         int var6 = var0.length;
         int[] var4 = var10000;
         int var7 = 0;

         while(var7 < var6) {
            zd var8 = var5[var7];
            var8.F(var1);
            ++var7;
            if (var4 == null) {
               break;
            }
         }

      };
   });
   long a = ds.a(3783073214294293191L, 4488657649544500483L, MethodHandles.lookup().lookupClass()).a(68284986910069L);

   void F(ClientboundHypixelPacket var1);
}
