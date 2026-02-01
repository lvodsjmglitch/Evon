package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class Js {
   public static final int N;
   public static final Color V;
   public static final Color X;
   public static final Color n;
   public static final int I;
   public static final int C;
   public static final float o = 4.5F;
   public static final float i = 4.5F;
   public static final float A = 3.5F;
   public static final zv p;
   public static final z7 a;

   static {
      long var12 = ds.a(1635261272000714949L, -9167018688101132574L, MethodHandles.lookup().lookupClass()).a(13232626504881L) ^ 40892137039685L;
      Cipher var14;
      Cipher var10000 = var14 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var12 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var15 = 1; var15 < 8; ++var15) {
         var10003[var15] = (byte)((int)(var12 << var15 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var16 = var14.doFinal("òìí%\u001cÌÃ\u0083ÍÅU\u001eqªtC".getBytes("ISO-8859-1"));
      String var18 = a(var16).intern();
      boolean var10001 = true;
      String var11 = var18;
      Cipher var1;
      var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var12 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var12 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "¸Nºß\u0011º\u0003¬\u0004\"±\u0094x½Îæ";
      int var6 = "¸Nºß\u0011º\u0003¬\u0004\"±\u0094x½Îæ".length();
      int var3 = 0;

      do {
         int var17 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var17, var3).getBytes("ISO-8859-1");
         var17 = var4++;
         long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
         long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         boolean var19 = true;
         var0[var17] = var10004;
      } while(var3 < var6);

      C = (int)var0[0];
      N = (int)var0[1];
      I = (int)var0[0];
      V = new Color(15, 15, 15);
      X = new Color(215, 215, 215);
      n = J6.N(Color.WHITE, 0.05000000074505806D);
      p = new zv();
      a = p.a(var11);
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
