package club.evon;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import net.minecraft.class_3532;
import org.json.JSONException;

public final class J6 {
   private static int o;
   private static final long a = ds.a(-1226132674947104492L, 595309295658165290L, MethodHandles.lookup().lookupClass()).a(160484078706940L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d = new HashMap(13);

   public static Color N(Color color, double percentage) {
      var1 = class_3532.method_15350(var1, 0.0D, 1.0D);
      return new Color(var0.getRed(), var0.getGreen(), var0.getBlue(), (int)(var1 * 255.0D));
   }

   public static Color V(Color color, float factor) {
      return new Color(Math.max((int)((float)var0.getRed() * var1), 0), Math.max((int)((float)var0.getGreen() * var1), 0), Math.max((int)((float)var0.getBlue() * var1), 0), var0.getAlpha());
   }

   public static Color b(Color color) {
      return new Color(class_3532.method_15340(var0.getRed(), 0, 255), class_3532.method_15340(var0.getGreen(), 0, 255), class_3532.method_15340(var0.getBlue(), 0, 255), class_3532.method_15340(var0.getAlpha(), 0, 255));
   }

   public static Color b(Color color1, Color color2, double percentage) {
      var2 = class_3532.method_15350(var2, 0.0D, 1.0D);
      return new Color((int)class_3532.method_16436(var2, (double)var0.getRed(), (double)var1.getRed()), (int)class_3532.method_16436(var2, (double)var0.getGreen(), (double)var1.getGreen()), (int)class_3532.method_16436(var2, (double)var0.getBlue(), (double)var1.getBlue()), (int)class_3532.method_16436(var2, (double)var0.getAlpha(), (double)var1.getAlpha()));
   }

   public static class_124 R(Color color) {
      // $FF: Couldn't be decompiled
   }

   public static Color W(int decimal) {
      long var1 = a ^ 43870821065604L;
      int var3 = (var0 & true.h<invokedynamic>(25227, 6840652215877792837L ^ var1)) >> 16;
      int var4 = (var0 & true.h<invokedynamic>(5880, 5913954883786407988L ^ var1)) >> 8;
      int var5 = var0 & 255;
      return new Color(var3, var4, var5);
   }

   public static double J(Color color1, Color color2) {
      int var2 = var0.getRed() + var1.getRed() >> 1;
      int var3 = var0.getRed() - var1.getRed();
      int var4 = var0.getGreen() - var1.getGreen();
      int var5 = var0.getBlue() - var1.getBlue();
      return Math.sqrt((double)(((512 + var2) * var3 * var3 >> 8) + 4 * var4 * var4 + ((767 - var2) * var5 * var5 >> 8)));
   }

   public static Color t(Color color1, Color color2, double milliseconds, double offset) {
      return b(var0, var1, Math.sin((double)System.currentTimeMillis() / var2 - var4) * 0.5D + 0.5D);
   }

   public static Color M(Color color1, Color color2, double milliseconds) {
      return t(var0, var1, var2, 0.0D);
   }

   public static class_124 D(int color) {
      // $FF: Couldn't be decompiled
   }

   public static int x(float health) {
      long var1 = a ^ 82695364801668L;
      return Color.HSBtoRGB(var0 / 3.0F, 0.65F, 1.0F) | true.h<invokedynamic>(22588, 5694375182170266102L ^ var1);
   }

   public static int[] s(int hex) {
      return new int[]{var0 >> 16 & 255, var0 >> 8 & 255, var0 & 255, var0 >> 24 & 255};
   }

   public static Color z(int decimal) {
      long var1 = a ^ 128951538205227L;
      return new Color((var0 & true.h<invokedynamic>(13206, 6471253276291515636L ^ var1)) >> 16, (var0 & true.h<invokedynamic>(21117, 141528656642975005L ^ var1)) >> 8, var0 & 255);
   }

   public static int U(int color, float opacity) {
      var1 = Math.min(1.0F, Math.max(0.0F, var1));
      Color var2 = new Color(var0);
      return (new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), (int)((float)var2.getAlpha() * var1))).getRGB();
   }

   public static int i(Color color) {
      int var1 = var0.getRed();
      int var2 = var0.getGreen();
      int var3 = var0.getBlue();
      int var4 = var0.getAlpha();
      return (var1 << 16) + (var2 << 8) + var3 + (var4 << 24);
   }

   public static void T(int var0) {
      o = var0;
   }

   public static int M() {
      return o;
   }

   public static int g() {
      int var0 = M();

      try {
         return var0 == 0 ? 45 : 0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 14035030487844L;
      T(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[5];
      int var5 = 0;
      String var6 = "mÕ\u0002§7\u009aþ9\u0001\u0018ú}Í\u0092`Dï@N¸\u0098Ýg³";
      int var7 = "mÕ\u0002§7\u009aþ9\u0001\u0018ú}Í\u0092`Dï@N¸\u0098Ýg³".length();
      int var4 = 0;

      label23:
      while(true) {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         long[] var13 = var8;
         var10001 = var5++;
         long var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte var16 = -1;

         while(true) {
            long var10 = var14;
            byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
            long var18 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
            switch(var16) {
            case 0:
               var13[var10001] = var18;
               if (var4 >= var7) {
                  b = var8;
                  c = new Integer[5];
                  return;
               }
               break;
            default:
               var13[var10001] = var18;
               if (var4 < var7) {
                  continue label23;
               }

               var6 = "Ò¨ñÍ|]\u001cûÍ\r\u009b¹Ñ-25";
               var7 = "Ò¨ñÍ|]\u001cûÍ\r\u009b¹Ñ-25".length();
               var4 = 0;
            }

            var10001 = var4;
            var4 += 8;
            var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
            var13 = var8;
            var10001 = var5++;
            var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
            var16 = 0;
         }
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2714;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("club/evon/J6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("club/evon/J6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
