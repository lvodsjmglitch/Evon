package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class gg extends gQ {
   private final a y;
   private final i<gK> N;
   private final i<D> b;
   private final t p;
   public Float x;
   private boolean v;
   private boolean W;
   private boolean V;
   private boolean C;
   private static final long a = ds.a(2809122120495705999L, -248166363936353262L, MethodHandles.lookup().lookupClass()).a(150596068482651L);
   private static final String[] c;

   public gg() {
      String[] var1 = c;
      super(var1[4], var1[2], zo.MOTION);
      this.y = new a(var1[1], 3.0D, 0.1D, 6.0D, 0.1D);
      this.N = new i(var1[0], gK.CIRCLE);
      this.b = new i(var1[3], D.SPACE);
      this.p = new t(var1[5], false);
      this.g(new B[]{this.N, this.b, this.p, this.y});
   }

   public void H() {
      this.x = null;
      super.H();
   }

   @_S
   private void O(z0 param1) {
      // $FF: Couldn't be decompiled
   }

   public Float y() {
      return this.x;
   }

   public boolean N() {
      return this.v;
   }

   public boolean y() {
      return this.W;
   }

   public boolean b() {
      return this.V;
   }

   public boolean Z() {
      return this.C;
   }

   static {
      long var0 = a ^ 9036460118174L;
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
      String var6 = "ÊÜ\u0082\u001aîÀûom¯\"\u0095a\u0001\u008eC\b\u0093\u0007'È÷\u0087\u0084é\u0018\u009eü`MÃ$Çy¾¹¨ÌæR\u0084ó*d\u0006\u000fûÄ7À\u0010ð\n¢\u008aäZi\u0087\u0016¶jªwK¼U";
      int var8 = "ÊÜ\u0082\u001aîÀûom¯\"\u0095a\u0001\u008eC\b\u0093\u0007'È÷\u0087\u0084é\u0018\u009eü`MÃ$Çy¾¹¨ÌæR\u0084ó*d\u0006\u000fûÄ7À\u0010ð\n¢\u008aäZi\u0087\u0016¶jªwK¼U".length();
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

               var6 = "`àd¡\u0095_*ù¿f=ç\u0001|\u0083¬\u0010cÓ\u000e¢ ëÓa|Uì\u001euè\u0086*";
               var8 = "`àd¡\u0095_*ù¿f=ç\u0001|\u0083¬\u0010cÓ\u000e¢ ëÓa|Uì\u001euè\u0086*".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
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
