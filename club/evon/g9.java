package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class g9 extends gQ {
   private final a X;
   private final t O;
   private final t T;
   private final t o;
   private final t B;
   private final t q;
   private boolean K;
   private int C;
   private static final long a = ds.a(-7419810335924511826L, -123218502087126991L, MethodHandles.lookup().lookupClass()).a(271450839725129L);
   private static final String[] b;

   public g9() {
      long var1 = a ^ 23109573999205L;
      String[] var4 = b;
      super(var4[0], var4[4], zo.PLAYER);
      this.X = new a(var4[3], 0.0D, 1.0D, 10.0D, 1.0D);
      this.O = new t(var4[5], true);
      this.T = new t(var4[2], true);
      this.o = new t(var4[7], true);
      boolean var10000 = gr.A();
      this.B = new t(var4[6], true);
      this.q = new t(var4[1], true);
      this.g(new B[]{this.X, this.O, this.T, this.o, this.B, this.q});
      boolean var3 = var10000;

      try {
         if (var3) {
            gQ.o(new gQ[3]);
         }

      } catch (JSONException var5) {
         throw a(var5);
      }
   }

   @_S
   private void x(yN param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void H(vA param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 66464601605127L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "\u00ad\u0005\u008dh]b7+7\u0091ÊXt¥ôu\u0010H\u0098\n\u0092çZ\u000e\u009b5m§ÒÙ´Ðo\u0018\u001eL\u0001ö®?¨\böð\u00902ÃQ$®¡\u008b(¾ÞïÛ\u0003\bÍùøh1\u0080pÄ\u0018A\u008b\u0089EÊ\bp\u0095Ü`\bdó2õ\u009a\u001aÆ#ÚÖ¿µ0\u0010\u001eL\u0001ö®?¨\b+(ÓKç\u0004\u0085æ";
      int var8 = "\u00ad\u0005\u008dh]b7+7\u0091ÊXt¥ôu\u0010H\u0098\n\u0092çZ\u000e\u009b5m§ÒÙ´Ðo\u0018\u001eL\u0001ö®?¨\böð\u00902ÃQ$®¡\u008b(¾ÞïÛ\u0003\bÍùøh1\u0080pÄ\u0018A\u008b\u0089EÊ\bp\u0095Ü`\bdó2õ\u009a\u001aÆ#ÚÖ¿µ0\u0010\u001eL\u0001ö®?¨\b+(ÓKç\u0004\u0085æ".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "\u001eL\u0001ö®?¨\b\u001aøL¹êÇ =\u0010\u001eL\u0001ö®?¨\bÙ\u0096\n\u0005¡¨ûQ";
               var8 = "\u001eL\u0001ö®?¨\b\u001aøL¹êÇ =\u0010\u001eL\u0001ö®?¨\bÙ\u0096\n\u0005¡¨ûQ".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
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
