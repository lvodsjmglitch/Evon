package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class gT extends gQ {
   private final u d;
   private final a j;
   private final Z P;
   private boolean M;
   private static final long a = ds.a(-4279829268810019461L, 2644575792255286326L, MethodHandles.lookup().lookupClass()).a(22106569852574L);
   private static final String[] b;
   private static final long c;

   public gT() {
      String[] var1 = b;
      super(var1[1], var1[3], zo.MISC);
      this.d = new u(var1[5], "");
      this.j = new a(var1[0], 500.0D, 500.0D, 1000.0D, 50.0D);
      this.P = new Z();
      this.g(new B[]{this.d, this.j});
   }

   @_S
   private void I(yN param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 67748435269811L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "yþ\u001cð\u001a\u009aÉ\u008a\u0010\u0094\u0095Pé\u0097ô3[HÊqAsIíV\b\u009f\u008eÝ³Û\u001a\u0000ô \u0007¢\u0086/hR<9åxû-a\u0012Û¿2Íq\u0013Ò´Té¤ª\u000fW_¹*-";
      int var13 = "yþ\u001cð\u001a\u009aÉ\u008a\u0010\u0094\u0095Pé\u0097ô3[HÊqAsIíV\b\u009f\u008eÝ³Û\u001a\u0000ô \u0007¢\u0086/hR<9åxû-a\u0012Û¿2Íq\u0013Ò´Té¤ª\u000fW_¹*-".length();
      char var10 = '\b';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -8681018460799195877L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  c = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "\u008aûT´[Ñk\u001e\u0093\u009c\u0017Ø´~RÝ\u0010Q¼ó+X/\u001f£<^EÊ®u¨ö";
               var13 = "\u008aûT´[Ñk\u001e\u0093\u009c\u0017Ø´~RÝ\u0010Q¼ó+X/\u001f£<^EÊ®u¨ö".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
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
