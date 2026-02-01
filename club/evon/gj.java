package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class gj extends gQ {
   private final P q;
   private double t;
   private static final long a = ds.a(-4336028479516388178L, -6732806901898002747L, MethodHandles.lookup().lookupClass()).a(82363207050736L);
   private static final String[] b;

   public gj() {
      String[] var1 = b;
      super(var1[5], var1[2], zo.PLAYER);
      this.q = new P(var1[4], new vJ[]{new yu(var1[0], this), new y4(var1[1], this), new yw(var1[3], this)});
      this.g(new B[]{this.q});
   }

   @_S
   public void o(vq event) {
      long var2 = a ^ 38708097416919L;

      try {
         if (ym.m.field_1724.field_6017 == 0.0D) {
            this.M();
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   public void M() {
      this.t = ym.m.field_1724.field_6017;
   }

   public double h() {
      // $FF: Couldn't be decompiled
   }

   protected void W() {
      this.t = 0.0D;
      super.W();
   }

   public String O() {
      return ((vJ)this.q.J()).R();
   }

   static {
      long var0 = a ^ 58654812707456L;
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
      String var6 = "³]ì\u0094g§\u007f1\bSd\u000b5FYÃü\u0018}uÍ¶485©ö\u008cÜå\u0092üöÙ%qò\u0014÷ \u00970\u0010ï\u001e<A\u0018äÑx\u0019§á\u001aV\u00140¨";
      int var8 = "³]ì\u0094g§\u007f1\bSd\u000b5FYÃü\u0018}uÍ¶485©ö\u008cÜå\u0092üöÙ%qò\u0014÷ \u00970\u0010ï\u001e<A\u0018äÑx\u0019§á\u001aV\u00140¨".length();
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

               var6 = "×£\u000b\u0015Cã\u001dc\bÝ]+\u0090²\u000bNó";
               var8 = "×£\u000b\u0015Cã\u001dc\bÝ]+\u0090²\u000bNó".length();
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
