package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _X extends _R {
   private static final long b = ds.a(4014946694970223715L, 7416656690003381369L, MethodHandles.lookup().lookupClass()).a(72888976638111L);
   private static final String[] c;

   public _X() {
      String[] var1 = c;
      super(var1[5], var1[2], var1[1]);
   }

   public boolean x(String[] arguments) {
      // $FF: Couldn't be decompiled
   }

   public ArrayList<String> X() {
      return new z_(this);
   }

   static {
      long var0 = b ^ 115030422276796L;
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
      String var6 = "ÖËÎ\u0006I\u0086\u0082f¹8¨ïÒ×\u0013p\u008d\u0002±¤?y0ò\u0010\u007f\u009d¡rKÂûèA\u0017BØÍ»ÔÌ \u0089\u000eiHK\u0016\u0098¸¦\u001az\u0012ÛSÌÜÒ\u000b§NÀÛÉ\u0017?·Ãø5YÒ\u001d\b÷-È¯ÊTàZ";
      int var8 = "ÖËÎ\u0006I\u0086\u0082f¹8¨ïÒ×\u0013p\u008d\u0002±¤?y0ò\u0010\u007f\u009d¡rKÂûèA\u0017BØÍ»ÔÌ \u0089\u000eiHK\u0016\u0098¸¦\u001az\u0012ÛSÌÜÒ\u000b§NÀÛÉ\u0017?·Ãø5YÒ\u001d\b÷-È¯ÊTàZ".length();
      char var5 = 24;
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

               var6 = "¡[\u00918ý)l3'òÍwh¢\u0095í\b¹d½ÙVú¹\u0007";
               var8 = "¡[\u00918ý)l3'òÍwh¢\u0095í\b¹d½ÙVú¹\u0007".length();
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
