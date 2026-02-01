package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_1294;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_5611;
import org.json.JSONException;

public final class zP {
   public static final double S = -0.0784000015258789D;
   public static final double l = -0.09800000190734864D;
   private static String[] b;
   private static final long a = ds.a(-5407000040528493229L, 7560797617165900201L, MethodHandles.lookup().lookupClass()).a(14377130244443L);

   public static boolean r() {
      // $FF: Couldn't be decompiled
   }

   public static void y(double speed) {
      long var2 = a ^ 10059190949164L;
      if (r()) {
         double[] var4 = _0.S((float)u(JV.M().d(ym.m.field_1724.method_36454())), var0);
         ym.m.field_1724.method_18800(var4[0], ym.m.field_1724.method_18798().method_10214(), var4[1]);
      }

   }

   public static void P(double speed, double percentage) {
      long var4 = a ^ 23712223327285L;
      var2 /= 100.0D;
      var2 = class_3532.method_15350(var2, 0.0D, 1.0D);
      class_243 var6 = ym.m.field_1724.method_18798();

      try {
         y(var0);
         if (r()) {
            ym.m.field_1724.method_18800(class_3532.method_16436(var2, var6.method_10216(), ym.m.field_1724.method_18798().method_10216()), ym.m.field_1724.method_18798().method_10214(), class_3532.method_16436(var2, var6.method_10215(), ym.m.field_1724.method_18798().method_10215()));
         }

      } catch (JSONException var7) {
         throw a(var7);
      }
   }

   public static float y() {
      class_5611 var0 = new class_5611((float)ym.m.field_1724.field_6014, (float)ym.m.field_1724.field_5969);
      class_5611 var1 = new class_5611((float)ym.m.field_1724.method_23317(), (float)ym.m.field_1724.method_23321());
      class_5611 var2 = new class_5611(var1.method_32118() - var0.method_32118(), var1.method_32119() - var0.method_32119());
      return (float)Math.toDegrees((Math.atan2((double)(-var2.method_32118()), (double)var2.method_32119()) + 6.2831854820251465D) % 6.2831854820251465D);
   }

   public static double C() {
      return Math.abs(Math.sqrt(Math.pow(ym.m.field_1724.method_23317() - ym.m.field_1724.field_6014, 2.0D) + Math.pow(ym.m.field_1724.method_23321() - ym.m.field_1724.field_5969, 2.0D)));
   }

   public static double Z() {
      return C() * (double)Jp.H().w() * 20.0D;
   }

   public static double w() {
      long var0 = a ^ 73467551562083L;

      double var10000;
      try {
         if (ym.m.field_1724.method_24828()) {
            var10000 = 0.48D;
            return Q(var10000);
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = 0.2873D;
      return Q(var10000);
   }

   public static double Q(double speed) {
      // $FF: Couldn't be decompiled
   }

   public static double Q() {
      // $FF: Couldn't be decompiled
   }

   public static double O() {
      return Math.sqrt(Math.pow(ym.m.field_1724.method_18798().method_10216(), 2.0D) + Math.pow(ym.m.field_1724.method_18798().method_10215(), 2.0D));
   }

   public static float U() {
      return W(JV.M().d(ym.m.field_1724.method_36454()));
   }

   public static double I() {
      return u(JV.M().d(ym.m.field_1724.method_36454()));
   }

   public static float W(float yaw) {
      // $FF: Couldn't be decompiled
   }

   public static double u(float yaw) {
      return Math.toRadians((double)W(var0));
   }

   public static double s(float rotationYaw, double moveForward, double moveStrafing) {
      // $FF: Couldn't be decompiled
   }

   public static double R(double yaw) {
      // $FF: Couldn't be decompiled
   }

   public static double O(double motion) {
      return (var0 - 0.08D) * 0.98D;
   }

   public static double F(double motion, int ticks) {
      long var3 = a ^ 115400177733822L;
      String[] var5 = Jd.K();

      try {
         if (var2 == 0) {
            return var0;
         }
      } catch (JSONException var9) {
         throw a(var9);
      }

      double var6 = var0;
      int var8 = 0;

      double var10000;
      while(true) {
         if (var8 < var2) {
            var10000 = O(var6);
            if (var5 == null) {
               break;
            }

            var6 = var10000;
            ++var8;
            if (var5 != null) {
               continue;
            }
         }

         var10000 = var6;
         break;
      }

      return var10000;
   }

   public static boolean u(double height) {
      // $FF: Couldn't be decompiled
   }

   public static boolean P() {
      return u((double)Math.round(ym.m.field_1724.method_23318() + (double)ym.m.field_1724.method_18381(ym.m.field_1724.method_18376())));
   }

   public static float A() {
      long var0 = a ^ 72137043674974L;
      float var2 = 3.0F;
      if (ym.m.field_1724.method_6059(class_1294.field_5913)) {
         var2 += (float)(ym.m.field_1724.method_6112(class_1294.field_5913).method_5578() + 1);
      }

      return var2;
   }

   public static void p(String[] var0) {
      b = var0;
   }

   public static String[] e() {
      return b;
   }

   static {
      if (e() == null) {
         p(new String[3]);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
