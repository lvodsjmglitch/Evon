package club.evon;

import com.google.gson.JsonObject;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public class vR {
   private final int E;
   private static boolean B;
   private static final long a = ds.a(-1003818311562048336L, 1644579813301606455L, MethodHandles.lookup().lookupClass()).a(212988692095059L);
   private static final String[] b;

   protected vR(int id) {
      // $FF: Couldn't be decompiled
   }

   public JsonObject e() {
      long var1 = a ^ 62787196909742L;
      JsonObject var4 = new JsonObject();
      boolean var10000 = V();
      String[] var5 = b;
      var4.addProperty(var5[1], this.E);
      var4.addProperty(var5[0], System.currentTimeMillis());
      boolean var3 = var10000;

      try {
         if (!var3) {
            gQ.o(new gQ[4]);
         }

         return var4;
      } catch (JSONException var6) {
         throw a(var6);
      }
   }

   public static void d(boolean var0) {
      B = var0;
   }

   public static boolean I() {
      return B;
   }

   public static boolean V() {
      boolean var0 = I();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 95271832304406L;
      d(false);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[2];
      int var7 = 0;
      String var6 = "Àf\u008c%hÙ'ò\bÉ1pX¼\u0083F\u008f";
      int var8 = "Àf\u008c%hÙ'ò\bÉ1pX¼\u0083F\u008f".length();
      char var5 = '\b';
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            return;
         }

         var5 = var6.charAt(var4);
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
