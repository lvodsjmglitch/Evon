package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class gN extends gQ {
   private final t K;
   private static final long a = ds.a(4573692154986861408L, -2428180130820311696L, MethodHandles.lookup().lookupClass()).a(248528987965867L);
   private static final String[] b;

   public gN() {
      String[] var1 = b;
      super(var1[2], var1[1], zo.PLAYER);
      this.K = new t(var1[0], false);
      this.g(new B[]{this.K});
   }

   @_S
   private void f(_D param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 97872560906053L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "¥þ[Å9\u008añÖ(SñnÝ*è½\u0014Ü¹\tÙä+f<XúÒ!{¡A\u0090îé\u0001Àÿ\u0097D\u009e«H§äõ]#·\u0010wÜ|\u00ad\u0085\u0012Øµ^ÓT$\u009by\u0016µ";
      int var8 = "¥þ[Å9\u008añÖ(SñnÝ*è½\u0014Ü¹\tÙä+f<XúÒ!{¡A\u0090îé\u0001Àÿ\u0097D\u009e«H§äõ]#·\u0010wÜ|\u00ad\u0085\u0012Øµ^ÓT$\u009by\u0016µ".length();
      char var5 = '\b';
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            return;
         }

         var5 = var6.charAt(var4);
      }
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
