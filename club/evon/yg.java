package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public enum yg {
   COOKIE,
   MICROSOFT,
   TOKEN;

   private final int z;
   private static final yg[] y;
   private static final long a = ds.a(2232692036552261504L, -1231381566105632913L, MethodHandles.lookup().lookupClass()).a(134329616971700L);

   private yg(int var3) {
      this.z = var3;
   }

   public static yg q(int level) {
      // $FF: Couldn't be decompiled
   }

   public int M() {
      return this.z;
   }

   private static yg[] c() {
      return new yg[]{COOKIE, MICROSOFT, TOKEN};
   }

   static {
      long var1 = a ^ 34261045509269L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[3];
      int var8 = 0;
      String var7 = "ñZ5¥\u008fõºáô(,ûF7ßÎ\b|6\u001e\u009dà#\u009f\n\bßì\u0000Ý¹ÝqE";
      int var9 = "ñZ5¥\u008fõºáô(,ûF7ßÎ\b|6\u001e\u009dà#\u009f\n\bßì\u0000Ý¹ÝqE".length();
      char var6 = 16;
      int var5 = -1;

      while(true) {
         ++var5;
         byte[] var10 = var3.doFinal(var7.substring(var5, var5 + var6).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var0[var8++] = var12;
         if ((var5 += var6) >= var9) {
            COOKIE = new yg(var0[1], 0, 0);
            MICROSOFT = new yg(var0[0], 1, 1);
            TOKEN = new yg(var0[2], 2, 2);
            y = c();
            return;
         }

         var6 = var7.charAt(var5);
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
