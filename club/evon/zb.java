package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class zb extends zi {
   private final yY G;
   private final Object Z;
   private static final Color j;
   private static final int T;
   private static final long c = ds.a(4768731035077664933L, -7448957784393494081L, MethodHandles.lookup().lookupClass()).a(222183740185078L);
   private static final String d;

   public zb(yY type) {
      long var2 = c ^ 7478868227078L;
      boolean var4 = yY.k();
      super(var1 == yY.ACCOUNTS ? 141.0F : (var1 == yY.EXIT ? 42.0F : 187.5F), 28.0F, 10.0F);
      this.G = var1;
      this.Z = var1.Y;
      if (gQ.q() == null) {
         boolean var10000;
         label25: {
            try {
               if (var4) {
                  var10000 = false;
                  break label25;
               }
            } catch (JSONException var5) {
               throw a(var5);
            }

            var10000 = true;
         }

         yY.v(var10000);
      }

   }

   public void M(float x, float y, double mouseX, double mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void y() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var7 = c ^ 121382745387998L;
      Cipher var9;
      Cipher var10000 = var9 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var7 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var10 = 1; var10 < 8; ++var10) {
         var10003[var10] = (byte)((int)(var7 << var10 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var11 = var9.doFinal("Û®0©¤÷\u009dCÀía\u0006Ø\u001c¾\u0087".getBytes("ISO-8859-1"));
      String var12 = a(var11).intern();
      boolean var10001 = true;
      d = var12;
      Cipher var2;
      var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      var10002 = SecretKeyFactory.getInstance("DES");
      var10003 = new byte[]{(byte)((int)(var7 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var7 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -2601572365135034715L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var13 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      var10001 = true;
      long var0 = var13;
      T = (int)var0;
      j = J6.N(Color.WHITE, 0.800000011920929D);
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
