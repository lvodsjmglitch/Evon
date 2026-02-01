package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class yk extends vJ<gF> {
   private final a S;
   private final a L;
   private static final long b = ds.a(-7164705671545325393L, -5859146186701934495L, MethodHandles.lookup().lookupClass()).a(130445786260074L);
   private static final String[] c;

   public yk(String name, gF parent) {
      super(var1, var2);
      String[] var3 = c;
      this.S = new a(var3[0], 0.0D, 0.0D, 100.0D, 1.0D);
      this.L = new a(var3[1], 0.0D, 0.0D, 100.0D, 1.0D);
      this.j(new B[]{this.S, this.L});
   }

   @_S
   private void x(v3 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = b ^ 80673762059193L;
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
      String var6 = "òÕ7èq\u0016U\u0090³!nÞ'\u0087ð8\u00105uª~âU¬þe3 ó\u008aæ×¥";
      int var8 = "òÕ7èq\u0016U\u0090³!nÞ'\u0087ð8\u00105uª~âU¬þe3 ó\u008aæ×¥".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            c = var9;
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
