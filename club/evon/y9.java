package club.evon;

import club.evon.mixins.ClientPlayerInteractionManagerAccessor;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_2596;
import net.minecraft.class_7204;
import org.json.JSONException;

public final class y9 {
   private static String n;
   private static final long a = ds.a(-4416783675688375286L, -7711881775388358344L, MethodHandles.lookup().lookupClass()).a(207843652533673L);

   public static void f(class_2596<?> packet) {
      JD.D(var0);
   }

   public static void d(class_2596<?> packet) {
      ym.m.method_1562().method_52787(var0);
   }

   public static void r(class_7204 sequencedPacketCreator) {
      ((ClientPlayerInteractionManagerAccessor)ym.m.field_1761).callSendSequencedPacket(ym.m.field_1687, var0);
   }

   public static void B(class_2596<?> packet) {
      // $FF: Couldn't be decompiled
   }

   public static void g(class_2596<?> packet) {
      // $FF: Couldn't be decompiled
   }

   public static void W(class_2596<?> packet) {
      var0.method_65081(ym.m.method_1562());
   }

   public static void O(class_2596<?> packet) {
      long var1 = a ^ 56768064059714L;
      String var10000 = I();
      JC var4 = (JC)ym.m.method_1562().method_48296();
      String var3 = var10000;

      try {
         var4.evon$channelReadSilent(var0);
         if (var3 != null) {
            gQ.o(new gQ[5]);
         }

      } catch (JSONException var5) {
         throw a(var5);
      }
   }

   public static void p(String var0) {
      n = var0;
   }

   public static String I() {
      return n;
   }

   static {
      if (I() != null) {
         p("vxmAR");
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
