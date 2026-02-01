package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public class yQ extends vJ<gY> {
   private final a R;
   private final a h;
   private final a M;
   private final a V;
   private final K K;
   private final K N;
   private final t k;
   private final i<y7> w;
   private static String t;
   private static final long b = ds.a(8936311814699350348L, -6702605063317353278L, MethodHandles.lookup().lookupClass()).a(247519395502672L);
   private static final String[] c;

   public yQ(String name, gY parent) {
      super(var1, var2);
      String[] var3 = c;
      this.R = new a(var3[0], 0.42D, 0.05D, 1.0D, 0.01D);
      this.h = new a(var3[13], 5.0D, 1.0D, 10.0D, 1.0D);
      this.M = new a(var3[12], 0.1D, 0.01D, 1.0D, 0.01D);
      this.V = new a(var3[1], 1.0D, 0.1D, 2.0D, 0.1D);
      this.K = new K(var3[6], new t[]{new t(var3[2], false), new t(var3[10], false)});
      this.N = new K(var3[4], new t[]{new t(var3[9], false), new t(var3[7], false)});
      this.k = new t(var3[8], false);
      this.w = new i(var3[5], y7.JUMP);
      this.k.q(() -> {
         return ((y7)this.w.J()).equals(y7.GROUND);
      });
      a var10000 = this.R;
      t var10001 = this.K.C(var3[2]);
      Objects.requireNonNull(var10001);
      var10000.q(var10001::I);
      var10000 = this.M;
      var10001 = this.K.C(var3[10]);
      Objects.requireNonNull(var10001);
      var10000.q(var10001::I);
      var10000 = this.h;
      var10001 = this.K.C(var3[10]);
      Objects.requireNonNull(var10001);
      var10000.q(var10001::I);
      this.j(new B[]{this.w, this.N, this.V, this.k, this.K, this.R, this.M, this.h});
   }

   public void Y() {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void F(vc param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void C(z0 param1) {
      // $FF: Couldn't be decompiled
   }

   public static void p(String var0) {
      t = var0;
   }

   public static String q() {
      return t;
   }

   static {
      long var0 = b ^ 117525232477353L;
      p((String)null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[14];
      int var7 = 0;
      String var6 = "Ý\t\u0015ã¤ùÈQt³\u0084Ó\u001e{Ë'\bB7@\b\u0094\u0017Sê\u0010Ý\t\u0015ã¤ùÈQt³\u0084Ó\u001e{Ë'\u0010wÝ\r1úç?ê/¼%ç>kz®\u0018¼\\ëe±28¥n\u009eá\u009c§Ó\u009a¯.I\u008a{Súçæ\u00109\u008c\r/_³§IuH\u0010ý~~T\u0019\u0010\u009f\u0004æî/¡×*\\\u0019\u0004t4\u0081\u0090b\u0010wÝ\r1úç?ê/¼%ç>kz®\bi\u001fS\u001f§ \u0012§\u0010µk\u0006Ð\u008e±Üu\u0095ÇUL\u0080*e\u008e\u0010\u0097\u0099\u009eK\u0017Ôõ\u0093\u000e1Þjx^£®\u0010µk\u0006Ð\u008e±Üu\u0095ÇUL\u0080*e\u008e";
      int var8 = "Ý\t\u0015ã¤ùÈQt³\u0084Ó\u001e{Ë'\bB7@\b\u0094\u0017Sê\u0010Ý\t\u0015ã¤ùÈQt³\u0084Ó\u001e{Ë'\u0010wÝ\r1úç?ê/¼%ç>kz®\u0018¼\\ëe±28¥n\u009eá\u009c§Ó\u009a¯.I\u008a{Súçæ\u00109\u008c\r/_³§IuH\u0010ý~~T\u0019\u0010\u009f\u0004æî/¡×*\\\u0019\u0004t4\u0081\u0090b\u0010wÝ\r1úç?ê/¼%ç>kz®\bi\u001fS\u001f§ \u0012§\u0010µk\u0006Ð\u008e±Üu\u0095ÇUL\u0080*e\u008e\u0010\u0097\u0099\u009eK\u0017Ôõ\u0093\u000e1Þjx^£®\u0010µk\u0006Ð\u008e±Üu\u0095ÇUL\u0080*e\u008e".length();
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

               var6 = "\u0097\u0099\u009eK\u0017Ôõ\u0093\u000e1Þjx^£®\u0010\u0017ó#*ÕàB9p\u009fÚO5åÞ7";
               var8 = "\u0097\u0099\u009eK\u0017Ôõ\u0093\u000e1Þjx^£®\u0010\u0017ó#*ÕàB9p\u009fÚO5åÞ7".length();
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
