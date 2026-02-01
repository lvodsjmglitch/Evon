package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class gi extends gQ {
   private final t k;
   private final t U;
   private final u G;
   private String W;
   private static int C;
   private static final long a = ds.a(9195903288609568342L, -2562169259792948185L, MethodHandles.lookup().lookupClass()).a(60583251367732L);
   private static final String[] b;

   public gi() {
      String[] var1 = b;
      super(var1[9], var1[5], zo.MISC);
      this.k = new t(var1[11], true);
      this.U = new t(var1[21], true);
      this.G = new u(var1[2], var1[13]);
      u var10000 = this.G;
      t var10001 = this.k;
      Objects.requireNonNull(var10001);
      var10000.q(var10001::I);
      this.g(new B[]{this.k, this.G, this.U});
   }

   private List<String> b() {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void M(vi param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void d(vK var1) {
      this.W = null;
   }

   public static String u(String original) {
      // $FF: Couldn't be decompiled
   }

   public static void y(int var0) {
      C = var0;
   }

   public static int t() {
      return C;
   }

   public static int S() {
      int var0 = t();

      try {
         return var0 == 0 ? 44 : 0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 108692482933393L;
      y(0);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[23];
      int var7 = 0;
      String var6 = "\u009ct&-Æ·ník3\u0013Çdk\u00037\u0018(D£\u000b×\u0086ÖØ\u0014`ìÕ\rCÂmÏ¼{;G¯}á\u0010à\u001e\u0003í\u0012ûâ\u0006$Zl§Á\u0095`.\b\u0083Ê¸sÑû±É\u0018(D£\u000b×\u0086ÖØ\u0014`ìÕ\rCÂmÏ¼{;G¯}á0J~\u0083a\u0013dX¿ÊúS2½#7ë©BM%l\u0083½à\u008fG\u0016¡fåþ=\u001c*¬\u0095¢_<\u001eT<bÿÛÒ\u001e£\b\u0080hLª\u0012yM\u0089\u0010(D£\u000b×\u0086ÖØ{ÃV\u0014×\u0097Â©\b¡xà\u0099\u0006òTÊ\u0010\u00024NK\u0080\u000b\u0012hiÒ*Gkd\u00adó\b*ù©\u009d´\u008b8í\u0010\u0006\u001eFÖ\u001b¦¼\u0093,aÁ\u0080h%z´\u0010(D£\u000b×\u0086ÖØ9ój\"L°Ó|\b\fèûê¶jê\u0082\b\f<\u0011d_\u0085ß<\b¡xà\u0099\u0006òTÊ\b\u007f[\\Óz\u0012W\u008b\b\f<\u0011d_\u0085ß<\b_\b$#ºç!z\u0018ú)Äz\u0096Å\u00128´\u001eí\u0091ÕN üâ/`&Õ=²\u0007\bJ\u0096?ä\u0088òå+";
      int var8 = "\u009ct&-Æ·ník3\u0013Çdk\u00037\u0018(D£\u000b×\u0086ÖØ\u0014`ìÕ\rCÂmÏ¼{;G¯}á\u0010à\u001e\u0003í\u0012ûâ\u0006$Zl§Á\u0095`.\b\u0083Ê¸sÑû±É\u0018(D£\u000b×\u0086ÖØ\u0014`ìÕ\rCÂmÏ¼{;G¯}á0J~\u0083a\u0013dX¿ÊúS2½#7ë©BM%l\u0083½à\u008fG\u0016¡fåþ=\u001c*¬\u0095¢_<\u001eT<bÿÛÒ\u001e£\b\u0080hLª\u0012yM\u0089\u0010(D£\u000b×\u0086ÖØ{ÃV\u0014×\u0097Â©\b¡xà\u0099\u0006òTÊ\u0010\u00024NK\u0080\u000b\u0012hiÒ*Gkd\u00adó\b*ù©\u009d´\u008b8í\u0010\u0006\u001eFÖ\u001b¦¼\u0093,aÁ\u0080h%z´\u0010(D£\u000b×\u0086ÖØ9ój\"L°Ó|\b\fèûê¶jê\u0082\b\f<\u0011d_\u0085ß<\b¡xà\u0099\u0006òTÊ\b\u007f[\\Óz\u0012W\u008b\b\f<\u0011d_\u0085ß<\b_\b$#ºç!z\u0018ú)Äz\u0096Å\u00128´\u001eí\u0091ÕN üâ/`&Õ=²\u0007\bJ\u0096?ä\u0088òå+".length();
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

               var6 = "\bó¨ôm´Î+\u0005N´õÞ2Ìu\u00187\u009c\u0093ØÄ=M×ïÝ\u0005tçi-þ<£\u008eê\u0098¥r£";
               var8 = "\bó¨ôm´Î+\u0005N´õÞ2Ìu\u00187\u009c\u0093ØÄ=M×ïÝ\u0005tçi-þ<£\u008eê\u0098¥r£".length();
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
