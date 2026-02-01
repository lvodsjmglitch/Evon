package club.evon;

import java.lang.invoke.MethodHandles;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.X509TrustManager;

class y implements X509TrustManager {
   final X509Certificate a;
   private static final long b = ds.a(-4721661126915182747L, -8913755371104441312L, MethodHandles.lookup().lookupClass()).a(170459808947974L);
   private static final String[] c;

   y(zO var1, X509Certificate var2) {
      this.a = var2;
   }

   public X509Certificate[] getAcceptedIssuers() {
      return new X509Certificate[]{this.a};
   }

   public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
      this.p(var1);
   }

   public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
      this.p(var1);
   }

   private void p(X509Certificate[] param1) throws CertificateException {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = b ^ 94259985305659L;
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
      String var6 = "\u008b³\u008a]ëû³Ê»\b\u001eÇO«Pe\u0003\b[ê'»\u0087m\u0018\u008b³\u008a]ëû³Ê»\b\u001eÇO«Pe\u0003\b[ê'»\u0087m";
      int var8 = "\u008b³\u008a]ëû³Ê»\b\u001eÇO«Pe\u0003\b[ê'»\u0087m\u0018\u008b³\u008a]ëû³Ê»\b\u001eÇO«Pe\u0003\b[ê'»\u0087m".length();
      char var5 = 24;
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

   private static CertificateExpiredException a(CertificateExpiredException var0) {
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
