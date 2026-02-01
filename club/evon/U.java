package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import org.json.JSONException;

public class U extends K {
   private static final long c = ds.a(2259159214908744531L, -6142039429461866456L, MethodHandles.lookup().lookupClass()).a(235886601809483L);
   private static final String[] e;

   public U() {
      String[] var1 = e;
      super(var1[5], new t(var1[7], true), new t(var1[0], true), new t(var1[8], true), new t(var1[1], true), new t(var1[9], true));
   }

   public List<class_1309> r(double searchRange) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = c ^ 44076192163154L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[11];
      int var7 = 0;
      String var6 = "Ëñ\u0083éÕ_\u001dK\u0010òe'R:âÜ<Q>\u0082ù\u0099\u0017ñ\u001a\bËñ\u0083éÕ_\u001dK\u0010kOÉ¦d\u0089\u0017®\u001ejq\u008cù\u008bÕ¡\b²Á\u0004\u000fx\u0092¼ö\bÄ\u007fg\u0015Þú1O\u0010òe'R:âÜ<Q>\u0082ù\u0099\u0017ñ\u001a\b²Á\u0004\u000fx\u0092¼ö\b¾\u0012\u009f9\u0087è£f";
      int var8 = "Ëñ\u0083éÕ_\u001dK\u0010òe'R:âÜ<Q>\u0082ù\u0099\u0017ñ\u001a\bËñ\u0083éÕ_\u001dK\u0010kOÉ¦d\u0089\u0017®\u001ejq\u008cù\u008bÕ¡\b²Á\u0004\u000fx\u0092¼ö\bÄ\u007fg\u0015Þú1O\u0010òe'R:âÜ<Q>\u0082ù\u0099\u0017ñ\u001a\b²Á\u0004\u000fx\u0092¼ö\b¾\u0012\u009f9\u0087è£f".length();
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
                  e = var9;
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

               var6 = "kOÉ¦d\u0089\u0017®\u001ejq\u008cù\u008bÕ¡\b¾\u0012\u009f9\u0087è£f";
               var8 = "kOÉ¦d\u0089\u0017®\u001ejq\u008cù\u008bÕ¡\b¾\u0012\u009f9\u0087è£f".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static JSONException c(JSONException var0) {
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
