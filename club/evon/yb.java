package club.evon;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class yb {
   private static final String[] a;

   public static String q(String key, String data) throws Exception {
      byte[] var2 = var0.getBytes(StandardCharsets.UTF_8);
      String[] var6 = a;
      SecretKeySpec var3 = new SecretKeySpec(var2, var6[3]);
      Cipher var4 = Cipher.getInstance(var6[1]);
      var4.init(1, var3);
      byte[] var5 = var4.doFinal(var1.getBytes(StandardCharsets.UTF_8));
      return Base64.getEncoder().encodeToString(var5);
   }

   public static String J(String key, String encryptedData) throws Exception {
      byte[] var2 = var0.getBytes(StandardCharsets.UTF_8);
      String[] var7 = a;
      SecretKeySpec var3 = new SecretKeySpec(var2, var7[0]);
      Cipher var4 = Cipher.getInstance(var7[2]);
      var4.init(2, var3);
      byte[] var5 = Base64.getDecoder().decode(var1);
      byte[] var6 = var4.doFinal(var5);
      return new String(var6, StandardCharsets.UTF_8);
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "|Xy\u0014|Xy{-@f\u0012Ma\u0017;6t\\yN=\u0006d";
      int var4 = "|Xy\u0014|Xy{-@f\u0012Ma\u0017;6t\\yN=\u0006d".length();
      char var1 = 3;
      int var0 = -1;

      label55:
      while(true) {
         byte var10000 = 81;
         ++var0;
         String var10001 = var2.substring(var0, var0 + var1);
         byte var10002 = -1;

         while(true) {
            char[] var13;
            label50: {
               char[] var14 = var10001.toCharArray();
               int var10004 = var14.length;
               int var6 = 0;
               byte var17 = var10000;
               byte var16 = var10000;
               var13 = var14;
               int var10 = var10004;
               char[] var18;
               int var10006;
               if (var10004 <= 1) {
                  var18 = var14;
                  var10006 = var6;
               } else {
                  var16 = var10000;
                  var10 = var10004;
                  if (var10004 <= var6) {
                     break label50;
                  }

                  var18 = var14;
                  var10006 = var6;
               }

               while(true) {
                  char var27 = var18[var10006];
                  byte var28;
                  switch(var6 % 7) {
                  case 0:
                     var28 = 108;
                     break;
                  case 1:
                     var28 = 76;
                     break;
                  case 2:
                     var28 = 123;
                     break;
                  case 3:
                     var28 = 5;
                     break;
                  case 4:
                     var28 = 57;
                     break;
                  case 5:
                     var28 = 82;
                     break;
                  default:
                     var28 = 117;
                  }

                  var18[var10006] = (char)(var27 ^ var17 ^ var28);
                  ++var6;
                  if (var16 == 0) {
                     var10006 = var16;
                     var18 = var13;
                     var17 = var16;
                  } else {
                     if (var10 <= var6) {
                        break;
                     }

                     var18 = var13;
                     var17 = var16;
                     var10006 = var6;
                  }
               }
            }

            String var20 = (new String(var13)).intern();
            switch(var10002) {
            case 0:
               var5[var3++] = var20;
               if ((var0 += var1) >= var4) {
                  a = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            default:
               var5[var3++] = var20;
               if ((var0 += var1) < var4) {
                  var1 = var2.charAt(var0);
                  continue label55;
               }

               var2 = "UqPR\u0004iO;dH>\u0012\u001f]uPg\u0014/M\u0003UqP";
               var4 = "UqPR\u0004iO;dH>\u0012\u001f]uPg\u0014/M\u0003UqP".length();
               var1 = 20;
               var0 = -1;
            }

            var10000 = 120;
            ++var0;
            var10001 = var2.substring(var0, var0 + var1);
            var10002 = 0;
         }
      }
   }
}
