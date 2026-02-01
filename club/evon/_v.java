package club.evon;

import java.lang.invoke.MethodHandles;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.random.RandomGenerator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _v {
   public static final Random i;
   private static int[] F;
   private static final long a = ds.a(-8163310480882230063L, -6165268878804743527L, MethodHandles.lookup().lookupClass()).a(163558218700234L);
   private static final String b;

   public static float p(float a, float b, float c) {
      return var0 + var2 * (var1 - var0);
   }

   public static double s(double value, int places) {
      return (new BigDecimal(var0)).setScale(Math.max(var2, 0), RoundingMode.HALF_UP).stripTrailingZeros().doubleValue();
   }

   public static int T(double value) {
      return String.valueOf(var0).split(b)[1].length();
   }

   public static int j(int min, int max) {
      // $FF: Couldn't be decompiled
   }

   public static boolean E(int percentChance) {
      // $FF: Couldn't be decompiled
   }

   public static int L(int bound) {
      return i.nextInt(var0);
   }

   public static float M(float min, float max, float rand) {
      // $FF: Couldn't be decompiled
   }

   public static double r(double min, double max, double rand) {
      // $FF: Couldn't be decompiled
   }

   public static double F(double min, double max) {
      return r(var0, var2, i.nextDouble());
   }

   public static float b(float min, float max) {
      return M(var0, var1, i.nextFloat());
   }

   public static int q(int min, int max) {
      long var2 = a ^ 27921173282102L;
      int[] var4 = Y();

      int var10000;
      int var10001;
      label20: {
         try {
            var10000 = var0;
            var10001 = var1;
            if (var4 != null) {
               return var10000 + var10001;
            }

            if (var0 <= var1) {
               break label20;
            }
         } catch (JSONException var6) {
            throw a(var6);
         }

         int var5 = var1;
         var1 = var0;
         var0 = var5;
      }

      var10000 = var0;
      var10001 = (var1 - var0) * RandomGenerator.getDefault().nextInt();
      return var10000 + var10001;
   }

   static {
      long var0 = a ^ 131474424509156L;
      d((int[])null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("\u000fB&2\u0015\u0004¹;".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
      i = new Random();
   }

   public static void d(int[] var0) {
      F = var0;
   }

   public static int[] Y() {
      return F;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }
}
