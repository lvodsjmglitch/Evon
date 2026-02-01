package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class Ju {
   private final String E;
   private final String M;
   private final zU L;
   private final long C;
   private static final int Y;
   private static final int x;
   private static final int w;
   private static final int F;
   private static final float q = 1.5F;
   private static final float a = 3.0F;
   private static final float y = 10.5F;
   private static final Color W;
   private static final Color O;
   private static final Color u;
   private final Z P;
   private static final long b = ds.a(-1577199037375129448L, -9078439179547574758L, MethodHandles.lookup().lookupClass()).a(180543178568271L);

   Ju(zU var1, long var2, String var4, String var5) {
      long var6 = b ^ 139442579730692L;
      super();
      this.P = new Z();
      v5.T();
      this.L = var1;

      try {
         this.C = var2;
         this.E = var4;
         this.M = var5;
         if (gQ.q() == null) {
            v5.D(new gQ[5]);
         }

      } catch (JSONException var9) {
         throw a(var9);
      }
   }

   static {
      long var1 = b ^ 18599511615437L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[4];
      int var6 = 0;
      String var7 = "h\u009c\u000fT\u0081B³\u0001ß·«HS¹_]";
      int var8 = "h\u009c\u000fT\u0081B³\u0001ß·«HS¹_]".length();
      int var5 = 0;

      label23:
      while(true) {
         int var10001 = var5;
         var5 += 8;
         byte[] var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
         long[] var13 = var0;
         var10001 = var6++;
         long var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte var16 = -1;

         while(true) {
            long var10 = var14;
            byte[] var12 = var3.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
            long var18 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
            switch(var16) {
            case 0:
               var13[var10001] = var18;
               if (var5 >= var8) {
                  x = (int)var0[1];
                  F = (int)var0[0];
                  Y = (int)var0[2];
                  w = (int)var0[3];
                  W = new Color(68, 68, 68, 45);
                  O = J6.N(Color.WHITE, 0.15000000596046448D);
                  u = J6.N(Color.BLACK, 0.44999998807907104D);
                  return;
               }
               break;
            default:
               var13[var10001] = var18;
               if (var5 < var8) {
                  continue label23;
               }

               var7 = "I\u0094\b0ðå}õ!ù\u008eú\u0080k\u000er";
               var8 = "I\u0094\b0ðå}õ!ù\u008eú\u0080k\u000er".length();
               var5 = 0;
            }

            var10001 = var5;
            var5 += 8;
            var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
            var13 = var0;
            var10001 = var6++;
            var14 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
            var16 = 0;
         }
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
