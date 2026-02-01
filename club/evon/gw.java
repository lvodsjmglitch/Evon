package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class gw extends gQ {
   private final i<gd> x;
   private final a I;
   private final a J;
   private final a k;
   private final t a;
   private final t h;
   private final t T;
   private final U f;
   private static final long b = ds.a(-7732553074326409303L, 6204871669318015272L, MethodHandles.lookup().lookupClass()).a(37641908761926L);
   private static final String[] c;

   public gw() {
      long var1 = b ^ 42142966265505L;
      String[] var4 = c;
      super(var4[2], var4[4], zo.COMBAT);
      String[] var10000 = gI.m();
      this.x = new i(var4[5], gd.NORMAL);
      this.I = new a(var4[7], 3.0D, 3.0D, 8.0D, 0.05D);
      this.J = new a(var4[6], 180.0D, 1.0D, 180.0D, 1.0D);
      this.k = new a(var4[1], 5.0D, 1.0D, 10.0D, 0.1D);
      String[] var3 = var10000;

      try {
         this.a = new t(var4[0], true);
         this.h = new t(var4[8], true);
         this.T = new t(var4[3], true);
         this.f = new U();
         this.g(new B[]{this.x, this.I, this.J, this.k, this.h, this.a, this.f});
         if (var3 != null) {
            gQ.o(new gQ[4]);
         }

      } catch (JSONException var5) {
         throw a(var5);
      }
   }

   @_S
   private void W(zx var1) {
      long var2 = b ^ 85917870150675L;
      if (this.T.I()) {
      }

   }

   @_S
   private void s(yN param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean D() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = b ^ 19569244162752L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0019,%ì0MáÕik ß¦\u0011BÅ\u0010\u0011S¶}\u0006x\u0004\t Åèpv¨>\u001c\u0010\u001f+F\u0006\u008d\u000e'$~mv\u0090ñÚÀ\u008e\u0010¨Önû|þ2©wµñ¡é\u0096\u0090à\u0018ùK\u0087?c1oxÿ~\u0099ó\"ó\u0080ÀIÒcù\"îu\"\u0010\u0011S¶}\u0006x\u0004\t¡9«\t\u001eÊQË\baMíÀÕÂól";
      int var8 = "\u0019,%ì0MáÕik ß¦\u0011BÅ\u0010\u0011S¶}\u0006x\u0004\t Åèpv¨>\u001c\u0010\u001f+F\u0006\u008d\u000e'$~mv\u0090ñÚÀ\u008e\u0010¨Önû|þ2©wµñ¡é\u0096\u0090à\u0018ùK\u0087?c1oxÿ~\u0099ó\"ó\u0080ÀIÒcù\"îu\"\u0010\u0011S¶}\u0006x\u0004\t¡9«\t\u001eÊQË\baMíÀÕÂól".length();
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
                  c = var9;
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

               var6 = "\u008cX\u0085y¿£7±\u0010¸Ù¿\u0097~x[Ç\u0093\u008c·\u0016¥¥¨|";
               var8 = "\u008cX\u0085y¿£7±\u0010¸Ù¿\u0097~x[Ç\u0093\u008c·\u0016¥¥¨|".length();
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
