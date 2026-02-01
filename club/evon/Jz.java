package club.evon;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.nanovg.NanoVG;

public final class Jz {
   private final int y;
   private static String k;
   private static final long a = ds.a(-4843057052595714381L, 8829702774997097026L, MethodHandles.lookup().lookupClass()).a(266379547031351L);
   private static final String[] b;

   public Jz(InputStream inputStream) {
      long var2 = a ^ 33159825989620L;
      super();
      if (var1 == null) {
         String[] var6 = b;
         throw new RuntimeException(var6[2]);
      } else {
         try {
            byte[] var4 = var1.readAllBytes();
            ByteBuffer var5 = ByteBuffer.allocateDirect(var4.length).put(var4);

            try {
               var5.flip();
               this.y = NanoVG.nvgCreateImageMem(y8.I, 32, var5);
               if (this.y == 0) {
                  throw new RuntimeException(b[0]);
               }
            } catch (IOException var7) {
               throw a(var7);
            }

            var1.close();
         } catch (IOException var8) {
            throw new RuntimeException(var8);
         }
      }
   }

   public Jz(String filePath) {
      this(Jz.class.getResourceAsStream(b[1] + var1));
   }

   public int R() {
      return this.y;
   }

   public static void O(String var0) {
      k = var0;
   }

   public static String K() {
      return k;
   }

   static {
      long var0 = a ^ 54838136132040L;
      O("q62GCb");
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "gôd\u0002>Æ3WÃS?iN\u0083\u0083¢9b;ÔE\u008eÖ\u0010\u0018\u0087¦ß_*Ì\u008e[y*â½ýO\u009e/\u0084$Èo\u009câ\u001aâ\u0018ç\u008e4\u0099ÿ»ø¿ójT\u000b\u009a/ \u0080AöÕ ´X¾7";
      int var8 = "gôd\u0002>Æ3WÃS?iN\u0083\u0083¢9b;ÔE\u008eÖ\u0010\u0018\u0087¦ß_*Ì\u008e[y*â½ýO\u009e/\u0084$Èo\u009câ\u001aâ\u0018ç\u008e4\u0099ÿ»ø¿ójT\u000b\u009a/ \u0080AöÕ ´X¾7".length();
      char var5 = 24;
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

   private static IOException a(IOException var0) {
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
