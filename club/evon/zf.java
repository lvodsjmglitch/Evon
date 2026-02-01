package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

final class zf {
   private static final float k = 0.25F;
   private static final int I;
   private static final int j;
   private static final int Z;
   private final k p;
   private static final Color s;
   final gU d;
   private static final long a = ds.a(2758395506554900871L, -6605111819448346015L, MethodHandles.lookup().lookupClass()).a(244706317924223L);

   private zf(gU var1, k var2) {
      this.d = var1;
      this.p = var2;
   }

   private boolean o(float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var1 = a ^ 80077223269624L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[3];
      int var6 = 0;
      String var7 = "«\u0098[ó/\u00adgh£ a+ì9Ð\u009aÂÔ\u001a¬KwÊ¬";
      int var8 = "«\u0098[ó/\u00adgh£ a+ì9Ð\u009aÂÔ\u001a¬KwÊ¬".length();
      int var5 = 0;

      do {
         int var10001 = var5;
         var5 += 8;
         byte[] var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
         var10001 = var6++;
         long var10 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte[] var12 = var3.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
         long var10004 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
         boolean var13 = true;
         var0[var10001] = var10004;
      } while(var5 < var8);

      I = (int)var0[2];
      j = (int)var0[0];
      Z = (int)var0[1];
      s = J6.N(Color.WHITE, 0.25D);
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
