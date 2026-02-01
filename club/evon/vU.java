package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1675;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_638;
import net.minecraft.class_9779;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.json.JSONException;

public final class vU {
   private static final long a = ds.a(8666196602261477191L, -648997360529390021L, MethodHandles.lookup().lookupClass()).a(37190023248001L);

   public static class_239 x(class_1297 entity, double distance, class_9779 renderTickCounter, boolean includeFluids, float[] rotations) {
      long var6 = a ^ 8975887551907L;
      class_243 var8 = _0.A(var3.method_60637(false), var0);
      class_243 var9 = _0.l(var5[1], var5[0]);
      class_243 var10 = var8.method_1031(var9.field_1352 * var1, var9.field_1351 * var1, var9.field_1350 * var1);

      class_638 var10000;
      class_3959 var10001;
      class_3959 var10002;
      class_243 var10003;
      class_243 var10004;
      class_3960 var10005;
      class_242 var10006;
      label17: {
         try {
            var10000 = ym.m.field_1687;
            var10001 = new class_3959;
            var10002 = var10001;
            var10003 = var8;
            var10004 = var10;
            var10005 = class_3960.field_17559;
            if (var4) {
               var10006 = class_242.field_1347;
               break label17;
            }
         } catch (JSONException var11) {
            throw a(var11);
         }

         var10006 = class_242.field_1348;
      }

      var10002.<init>(var10003, var10004, var10005, var10006, var0);
      return var10000.method_17742(var10001);
   }

   public static boolean A(class_2350 facing, class_2338 position, boolean strict, float reach, float yaw, float pitch) {
      // $FF: Couldn't be decompiled
   }

   public static class_3965 A(class_1297 entity, double distance, float[] rotations, class_2338 blockPos, class_2680 state) {
      class_243 var6 = var0.method_33571();
      class_243 var7 = _0.l(var3[1], var3[0]);
      class_243 var8 = var6.method_1031(var7.field_1352 * var1, var7.field_1351 * var1, var7.field_1350 * var1);
      return ym.m.field_1687.method_17745(var6, var8, var4, var5.method_26172(ym.m.field_1687, var4, class_3726.method_16195(var0)), var5);
   }

   public static class_239 r(double maxDistance, float tickDelta, boolean includeFluids, float yaw, float pitch) {
      class_243 var6 = _0.A(var2, ym.m.field_1724);
      return R(var0, var3, var4, var5, var6);
   }

   public static class_239 R(double maxDistance, boolean includeFluids, float yaw, float pitch, class_243 start) {
      long var6 = a ^ 86166017073147L;
      class_243 var8 = _0.l(var4, var3);
      class_243 var9 = var5.method_1031(var8.field_1352 * var0, var8.field_1351 * var0, var8.field_1350 * var0);

      class_638 var10000;
      class_3959 var10001;
      class_3959 var10002;
      class_243 var10003;
      class_243 var10004;
      class_3960 var10005;
      class_242 var10006;
      label17: {
         try {
            var10000 = ym.m.field_1687;
            var10001 = new class_3959;
            var10002 = var10001;
            var10003 = var5;
            var10004 = var9;
            var10005 = class_3960.field_17559;
            if (var2) {
               var10006 = class_242.field_1347;
               break label17;
            }
         } catch (JSONException var10) {
            throw a(var10);
         }

         var10006 = class_242.field_1348;
      }

      var10002.<init>(var10003, var10004, var10005, var10006, ym.m.field_1724);
      return var10000.method_17742(var10001);
   }

   public static class_3966 d(double maxDistance, float tickDelta, float yaw, float pitch, Predicate<class_1297> predicate) {
      return o(var0, _0.A(var2, ym.m.field_1724), var3, var4, var5);
   }

   public static class_3966 o(double maxDistance, class_243 start, float yaw, float pitch, Predicate<class_1297> predicate) {
      class_243 var6 = _0.l(var4, var3);
      class_243 var7 = var2.method_1031(var6.field_1352 * var0, var6.field_1351 * var0, var6.field_1350 * var0);
      class_238 var8 = ym.m.field_1724.method_5829().method_18804(var6.method_1021(var0)).method_1009(1.0D, 1.0D, 1.0D);
      return class_1675.method_18075(ym.m.field_1724, var2, var7, var8, var5, class_3532.method_33723(var0));
   }

   public static class_239 j(double distance, float[] rotations, class_9779 renderTickCounter, boolean includeFluids) {
      return x(ym.m.field_1724, var0, var3, var4, var2);
   }

   public static class_3965 D(double distance, float[] rotations, class_2338 blockPos, class_2680 state) {
      return A(ym.m.field_1724, var0, var2, var3, var4);
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
