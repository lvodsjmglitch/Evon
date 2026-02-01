package club.evon;

import club.evon.mixins.MinecraftClientAccessor;
import java.lang.invoke.MethodHandles;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_320;

public final class z2 extends zi {
   private final yH d;
   private final String K;
   private static final z7 B;
   private static final long c = ds.a(-4774314177763851829L, -4456769795295851523L, MethodHandles.lookup().lookupClass()).a(169018434702714L);
   private static final String[] e;

   public z2(yH type, float width, float height, float radius) {
      super(var2, var3, var4);
      this.d = var1;
      this.K = var1.M + e[1];
   }

   public void M(float x, float y, double mouseX, double mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void y() {
      long var1 = c ^ 100898437176963L;
      String var3 = yH.v();

      label41: {
         label58: {
            try {
               if (var3 != null) {
                  return;
               }

               switch(this.d.ordinal()) {
               case 0:
                  break label58;
               case 1:
                  break label41;
               case 2:
                  break;
               default:
                  return;
               }
            } catch (Exception var9) {
               throw a(var9);
            }

            zD.R();
            return;
         }

         try {
            zD.V((var0) -> {
            });
            return;
         } catch (Exception var8) {
            throw new RuntimeException(var8);
         }
      }

      try {
         MinecraftClientAccessor var4 = (MinecraftClientAccessor)ym.m;
         v_ var5 = zD.g();
         if (var5 != null) {
            class_320 var6 = new class_320(var5.k(), zD.c(var5.K()), var5.c(), Optional.empty(), Optional.empty());
            var4.setSession(var6);
            zy.p().k().n(var6, yg.TOKEN);
         }
      } catch (Exception var7) {
         throw new RuntimeException(var7);
      }

   }

   static {
      long var0 = c ^ 77408763752590L;
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
      String var6 = "Á¸\u0095Î-\tû\u0098°\u0096ÌHK\u0014O\u007f\b¾\u0082;\u0018ÅÄû´";
      int var8 = "Á¸\u0095Î-\tû\u0098°\u0096ÌHK\u0014O\u007f\b¾\u0082;\u0018ÅÄû´".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            e = var9;
            B = zy.p().s().a(e[0]);
            return;
         }

         var5 = var6.charAt(var4);
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
