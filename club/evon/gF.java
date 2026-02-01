package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class gF extends gQ {
   private final P v;
   private static final long a = ds.a(-83002513257894001L, -2289527869585906092L, MethodHandles.lookup().lookupClass()).a(67764790372985L);
   private static final String[] b;

   public gF() {
      String[] var1 = b;
      super(var1[4], var1[3], zo.COMBAT);
      this.v = new P(var1[5], new vJ[]{new yk(var1[2], this), new y5(var1[0], this), new ys(var1[1], this)});
      this.g(new B[]{this.v});
   }

   public boolean D() {
      // $FF: Couldn't be decompiled
   }

   public String O() {
      return ((vJ)this.v.J()).R();
   }

   public vJ<?> Z() {
      return (vJ)this.v.J();
   }

   static {
      long var0 = a ^ 45513403795768L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "ëA\u000féG\u0098ÒW\bfË°\u009ap¥S\u0087\bEK\u0014è@pò\u0096 G¿\u0095î\u0085îçÝ¦_±ø ¸Ø\u009e\u0018û¹Bh'\u0097s5\u009a*Oø_\u008d\u008f";
      int var8 = "ëA\u000féG\u0098ÒW\bfË°\u009ap¥S\u0087\bEK\u0014è@pò\u0096 G¿\u0095î\u0085îçÝ¦_±ø ¸Ø\u009e\u0018û¹Bh'\u0097s5\u009a*Oø_\u008d\u008f".length();
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

               var6 = "o*]ÆW¥/\u008aÕÀ«vá~\u0002Ö\b\u0099Ñ$\u009aäÝ\u0084í";
               var8 = "o*]ÆW¥/\u008aÕÀ«vá~\u0002Ö\b\u0099Ñ$\u009aäÝ\u0084í".length();
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
