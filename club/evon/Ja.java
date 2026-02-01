package club.evon;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public class Ja {
   private final HttpClient i;
   private static boolean T;
   private static final long a = ds.a(3752942853629995391L, -3864147593648568278L, MethodHandles.lookup().lookupClass()).a(142355324843636L);
   private static final String[] b;
   private static final long c;

   public Ja(String proxyHost, int proxyPort, String proxyUsername, String proxyPassword) {
      long var5 = a ^ 118645982320614L;
      boolean var10000 = Q();
      super();
      boolean var7 = var10000;
      vk var8 = new vk(this, var1, var2);
      vO var9 = new vO(this, var3, var4);

      try {
         this.i = HttpClient.newBuilder().proxy(var8).authenticator(var9).connectTimeout(Duration.ofSeconds(c)).build();
         if (var7) {
            gQ.o(new gQ[5]);
         }

      } catch (JSONException var10) {
         throw a((Exception)var10);
      }
   }

   public String x(String url) throws IOException, InterruptedException {
      HttpRequest var2 = HttpRequest.newBuilder().uri(URI.create(var1)).GET().build();
      HttpResponse var3 = this.i.send(var2, BodyHandlers.ofString());
      return (String)var3.body();
   }

   public String d(String url, String jsonBody, Map<String, String> headers) throws IOException, InterruptedException {
      // $FF: Couldn't be decompiled
   }

   public static void H(boolean var0) {
      T = var0;
   }

   public static boolean W() {
      return T;
   }

   public static boolean Q() {
      boolean var0 = W();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a((Exception)var1);
      }
   }

   static {
      long var5 = a ^ 51692287383945L;
      H(true);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[2];
      int var12 = 0;
      String var11 = "9+ö>\u0083\u000fr\u008c[\u00114\u009e\u0098\u0098Ò¦`\u001b\u0000\u009e\u0018\u0019\u0001·\u0010\u0095ÿ?\u0012\u0004\u0082-/\u009c\u001a¤9ÚI\u0018Û";
      int var13 = "9+ö>\u0083\u000fr\u008c[\u00114\u009e\u0098\u0098Ò¦`\u001b\u0000\u009e\u0018\u0019\u0001·\u0010\u0095ÿ?\u0012\u0004\u0082-/\u009c\u001a¤9ÚI\u0018Û".length();
      char var10 = 24;
      int var9 = -1;

      while(true) {
         ++var9;
         byte[] var15 = var7.doFinal(var11.substring(var9, var9 + var10).getBytes("ISO-8859-1"));
         String var17 = a(var15).intern();
         boolean var10001 = true;
         var14[var12++] = var17;
         if ((var9 += var10) >= var13) {
            b = var14;
            Cipher var0;
            var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
            var10002 = SecretKeyFactory.getInstance("DES");
            var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

            for(int var1 = 1; var1 < 8; ++var1) {
               var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
            }

            var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
            long var2 = -5912371693972776889L;
            byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
            long var19 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
            var10001 = true;
            c = var19;
            return;
         }

         var10 = var11.charAt(var9);
      }
   }

   private static Exception a(Exception var0) {
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
