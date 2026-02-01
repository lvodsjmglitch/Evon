package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_304;
import net.minecraft.class_3675;

public final class Jd {
   public static final List<class_304> Q;
   private static final class_2248[] Z;
   private static String[] M;
   private static final long a = ds.a(8540334931391742467L, 5401164305590167529L, MethodHandles.lookup().lookupClass()).a(95684620546381L);

   public static int R() {
      // $FF: Couldn't be decompiled
   }

   private static boolean s(int param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean a() {
      // $FF: Couldn't be decompiled
   }

   public static boolean v() {
      return l(0.0D, 0.0D);
   }

   public static boolean l(double offsetX, double offsetZ) {
      class_238 var4 = ym.m.field_1724.method_5829().method_989(var0, -(ym.m.field_1724.method_5829().method_17940() + 1.0D), var2);
      return class_2338.method_29715(var4).noneMatch((param0) -> {
         // $FF: Couldn't be decompiled
      });
   }

   public static boolean G(class_1657 player) {
      class_238 var1 = var0.method_5829().method_989(0.0D, -(var0.method_5829().method_17940() + 1.0D), 0.0D);
      return class_2338.method_29715(var1).noneMatch((param1) -> {
         // $FF: Couldn't be decompiled
      });
   }

   public static String I(class_1309 entity) {
      long var1 = a ^ 40416940727930L;
      String[] var3 = K();

      label28: {
         class_2561 var10000;
         try {
            var10000 = var0.method_5476();
            if (var3 == null) {
               return var10000.getString();
            }

            if (var10000 != null) {
               break label28;
            }
         } catch (MatchException var5) {
            throw a(var5);
         }

         var10000 = var0.method_5477();
         return var10000.getString();
      }

      l var4 = new l();
      var0.method_5476().method_30937().accept(var4);
      return var4.f();
   }

   public static boolean n(String brandString) {
      // $FF: Couldn't be decompiled
   }

   public static int I() {
      // $FF: Couldn't be decompiled
   }

   public static class_243 z(class_243 from, class_238 box) {
      double var2 = Math.max(var1.field_1323, Math.min(var0.method_10216(), var1.field_1320));
      double var4 = Math.max(var1.field_1322, Math.min(var0.method_10214(), var1.field_1325));
      double var6 = Math.max(var1.field_1321, Math.min(var0.method_10215(), var1.field_1324));
      return new class_243(var2, var4, var6);
   }

   public static class_243 L(class_243 from, class_1309 entity) {
      return z(var0, var1.method_5829().method_1014((double)var1.method_5871()));
   }

   public static class_243 p(class_243 from, class_1297 entity) {
      return z(var0, var1.method_5829().method_1014((double)var1.method_5871()));
   }

   public static double A(class_1309 entity) {
      class_243 var1 = ym.m.field_1724.method_33571();
      return var1.method_1022(z(var1, var0.method_5829().method_1014((double)var0.method_5871())));
   }

   public static double y(class_1297 entity) {
      class_243 var1 = ym.m.field_1724.method_33571();
      return var1.method_1022(z(var1, var0.method_5829().method_1014((double)var0.method_5871())));
   }

   public static class_238 C(class_2338 blockPos) {
      // $FF: Couldn't be decompiled
   }

   public static double X(class_2338 blockPos) {
      class_243 var1 = ym.m.field_1724.method_33571();
      class_238 var2 = C(var0);
      class_243 var3 = z(var1, var2);
      return var1.method_1022(var3);
   }

   public static boolean p(double posY, class_238 playerBox) {
      class_238 var3 = new class_238(var2.field_1323, var0, var2.field_1321, var2.field_1320, var2.field_1325, var2.field_1324);
      return b(var3);
   }

   public static boolean b(class_238 box) {
      return class_2338.method_29715(var0).noneMatch((param1) -> {
         // $FF: Couldn't be decompiled
      });
   }

   public static boolean o(class_238 playerBox) {
      return p(0.0D, var0.method_1009(-0.005D, 0.0D, -0.005D));
   }

   public static boolean A() {
      return o(ym.m.field_1724.method_5829());
   }

   public static class_2248 S() {
      // $FF: Couldn't be decompiled
   }

   public static class_2338 x() {
      // $FF: Couldn't be decompiled
   }

   public static float A() {
      long var0 = a ^ 20432972206143L;
      float var2 = 3.0F;
      if (ym.m.field_1724.method_6059(class_1294.field_5913)) {
         var2 += (float)(ym.m.field_1724.method_6112(class_1294.field_5913).method_5578() + 1);
      }

      return var2;
   }

   public static boolean F(int keyCode) {
      return class_3675.method_15987(ym.m.method_22683(), var0);
   }

   public static boolean Z(class_304 keyBinding) {
      return F(var0.method_1429().method_1444());
   }

   public static boolean i(int button) {
      // $FF: Couldn't be decompiled
   }

   public static void s() {
      Q.forEach((var0) -> {
         class_304.method_1416(var0.method_1429(), Z(var0));
      });
   }

   public static void I() {
      Q.forEach((var0) -> {
         class_304.method_1416(var0.method_1429(), false);
      });
   }

   public static boolean e(double offsetX, double offsetY, double offsetZ) {
      long var6 = a ^ 50413612940831L;
      String[] var8 = K();

      boolean var10000;
      label32: {
         try {
            var10000 = b(ym.m.field_1724.method_5829().method_989(var0, var2, var4));
            if (var8 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (MatchException var9) {
            throw a(var9);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public static boolean t() {
      long var0 = a ^ 10273837857566L;
      String[] var2 = K();

      boolean var10000;
      label32: {
         try {
            var10000 = b(ym.m.field_1724.method_5829());
            if (var2 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (MatchException var3) {
            throw a(var3);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public static boolean K(class_1309 entity, class_1309 entity1) {
      // $FF: Couldn't be decompiled
   }

   public static double w(class_1799 stack) {
      // $FF: Couldn't be decompiled
   }

   public static double o(class_1799 stack) {
      // $FF: Couldn't be decompiled
   }

   public static double F(class_1799 stack) {
      // $FF: Couldn't be decompiled
   }

   public static boolean l(class_1657 player) {
      // $FF: Couldn't be decompiled
   }

   public static boolean N(class_1657 player) {
      return class_2338.method_29715(var0.method_5829()).anyMatch((var0x) -> {
         class_2680 var1 = ym.m.field_1687.method_8320(var0x);
         return Arrays.asList(Z).contains(var1.method_26204());
      });
   }

   public static boolean R(class_1657 player) {
      return class_2338.method_29715(var0.method_5829()).anyMatch((var0x) -> {
         return ym.m.field_1687.method_8320(var0x).method_27852(class_2246.field_10343);
      });
   }

   public static boolean x() {
      return R(ym.m.field_1724);
   }

   public static boolean X() {
      return l(ym.m.field_1724);
   }

   static {
      String[] var10000 = new String[5];
      Q = List.of(ym.m.field_1690.field_1894, ym.m.field_1690.field_1881, ym.m.field_1690.field_1913, ym.m.field_1690.field_1849, ym.m.field_1690.field_1903);
      k(var10000);
      Z = new class_2248[]{class_2246.field_10343, class_2246.field_10164, class_2246.field_10036};
   }

   public static void k(String[] var0) {
      M = var0;
   }

   public static String[] K() {
      return M;
   }

   private static MatchException a(MatchException var0) {
      return var0;
   }
}
