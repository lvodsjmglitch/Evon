package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class gq extends gQ {
   private final a s;
   private final K d;
   private static final long a = ds.a(7371572217725923052L, 3525567367814759008L, MethodHandles.lookup().lookupClass()).a(172172167401164L);
   private static final String[] b;

   public gq() {
      String[] var1 = b;
      super(var1[7], var1[4], zo.PLAYER);
      this.s = new a(var1[3], 0.0D, 0.0D, 4.0D, 1.0D);
      this.d = new K(var1[0], new t[]{new t(var1[6], true), new t(var1[5], true)});
      this.g(new B[]{this.s, this.d});
   }

   @_S
   private void u(vg param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 51234296764963L;
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
      String var6 = "r\u0081Î³$°V»\u0010¼å\u0019ìQ\u0011Zx+\u0088V\u0082¼¦]¥\bPG\u0002nWnZ\u0001\u0010åë=\u0012°ºÍ\u000b\u0003Ý\u0015±ó\\/S\u0018LJMnßKAÿ\u0004Ðºú£(cBD©)+ \u0015 \"\u0010¼å\u0019ìQ\u0011Zx+\u0088V\u0082¼¦]¥";
      int var8 = "r\u0081Î³$°V»\u0010¼å\u0019ìQ\u0011Zx+\u0088V\u0082¼¦]¥\bPG\u0002nWnZ\u0001\u0010åë=\u0012°ºÍ\u000b\u0003Ý\u0015±ó\\/S\u0018LJMnßKAÿ\u0004Ðºú£(cBD©)+ \u0015 \"\u0010¼å\u0019ìQ\u0011Zx+\u0088V\u0082¼¦]¥".length();
      char var5 = '\b';
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

               var6 = "PG\u0002nWnZ\u0001\u0010*±Ëêè*kR¾·Ow¿0Û«";
               var8 = "PG\u0002nWnZ\u0001\u0010*±Ëêè*kR¾·Ow¿0Û«".length();
               var5 = '\b';
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
