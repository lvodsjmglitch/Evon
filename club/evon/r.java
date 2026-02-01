package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.hypixel.modapi.packet.HypixelPacket;
import net.hypixel.modapi.serializer.PacketSerializer;
import net.minecraft.class_2540;
import net.minecraft.class_2960;
import net.minecraft.class_8710;
import net.minecraft.class_9139;
import net.minecraft.class_8710.class_9154;

public class r implements class_8710 {
   private final class_9154<r> m;
   private final HypixelPacket T;
   private static int C;
   private static final long a = ds.a(20790114908014660L, 907453162469052850L, MethodHandles.lookup().lookupClass()).a(258806447308846L);
   private static final String b;

   public r(HypixelPacket packet) {
      long var2 = a ^ 18096136918215L;
      int var10000 = E();
      super();
      int var4 = var10000;

      try {
         this.m = new class_9154(class_2960.method_60654(var1.getIdentifier()));
         this.T = var1;
         if (var4 != 0) {
            gQ.o(new gQ[2]);
         }

      } catch (UnsupportedOperationException var5) {
         throw a(var5);
      }
   }

   private void T(class_2540 var1) {
      PacketSerializer var2 = new PacketSerializer(var1);
      this.T.write(var2);
   }

   public class_9154<? extends class_8710> method_56479() {
      return this.m;
   }

   public static class_9139<class_2540, r> k(class_9154<r> id) {
      return class_8710.method_56484(r::T, (var0x) -> {
         throw new UnsupportedOperationException(b);
      });
   }

   public static void v(int var0) {
      C = var0;
   }

   public static int G() {
      return C;
   }

   public static int E() {
      int var0 = G();

      try {
         return var0 == 0 ? 78 : 0;
      } catch (UnsupportedOperationException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 59094946872866L;
      v(124);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("ý\u008b¾\u0000ø\u0095\"sOV¤?s\u0005Ë\u009dyGÁ\u0090Ä1T\u009c\u009fÒ\u008a#_¾\u00844ÑÏw\u0084:\u0004?`".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
   }

   private static UnsupportedOperationException a(UnsupportedOperationException var0) {
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
