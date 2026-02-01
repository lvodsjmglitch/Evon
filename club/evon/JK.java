package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import org.json.JSONException;

public final class JK {
   private static final String K;
   private static final int[] d;
   private final zv M = zy.p().s();
   private static final long a = ds.a(4502101003311413076L, 1589706966423719501L, MethodHandles.lookup().lookupClass()).a(63242139261496L);
   private static final String[] b;

   public void w(String fontName, A weight, String text, float x, float y, float size, int color, boolean shadow, float bloomAmount, int alignment) {
      // $FF: Couldn't be decompiled
   }

   public void y(String fontName, A weight, String text, float x, float y, float size, int color) {
      this.w(var1, var2, var3, var4, var5, var6, var7, false, 0.0F, 9);
   }

   public void e(String fontName, A weight, String text, float x, float y, float size, int color, boolean shadow) {
      this.w(var1, var2, var3, var4, var5, var6, var7, var8, 0.0F, 9);
   }

   public void e(String fontName, A weight, String text, float x, float y, float size, int color, boolean shadow, int alignment) {
      this.w(var1, var2, var3, var4, var5, var6, var7, var8, 0.0F, var9);
   }

   public void V(String fontName, String text, float x, float y, float size, int color, boolean shadow, int alignment) {
      this.w(var1, A.REGULAR, var2, var3, var4, var5, var6, var7, 0.0F, var8);
   }

   public void c(String fontName, String text, float x, float y, float size, int color, boolean shadow) {
      this.w(var1, A.REGULAR, var2, var3, var4, var5, var6, var7, 0.0F, 9);
   }

   public void W(String fontName, String text, float x, float y, float size, int color) {
      this.w(var1, A.REGULAR, var2, var3, var4, var5, var6, false, 0.0F, 9);
   }

   public void x(String fontName, A weight, String text, float x, float y, float size, int color1, int color2, boolean shadow, float bloomAmount, int alignment) {
      long var12 = a ^ 90358161433408L;
      float var15 = 0.0F;
      String var10000 = z7.r();
      int var16 = 0;
      String var14 = var10000;

      while(var16 < var3.length()) {
         Character var17 = var3.charAt(var16);
         String var18 = String.valueOf(var17);
         float var19 = this.Q(var1, var2, var18, var6, var11);
         int var20 = J6.t(new Color(var7), new Color(var8), 500.0D, (double)((float)var16 * 0.4F)).brighter().getRGB();
         this.w(var1, var2, var18, var4 + var15, var5, var6, var20, var9, var10, var11);
         var15 += var19;
         ++var16;
         if (var14 == null) {
            break;
         }
      }

   }

   public void x(String fontName, A weight, String text, float x, float y, float size, int color1, int color2, float alpha, boolean shadow, int bloomAmount, int alignment) {
      long var13 = a ^ 130336790484615L;
      String var10000 = z7.r();
      float var16 = 0.0F;
      int var17 = 0;
      String var15 = var10000;

      while(var17 < var3.length()) {
         Character var18 = var3.charAt(var17);
         String var19 = String.valueOf(var18);
         float var20 = this.Q(var1, var2, var19, var6, var12);
         Color var21 = J6.t(new Color(var7), new Color(var8), 500.0D, (double)((float)var17 * 0.75F)).brighter();
         Color var22 = J6.N(var21, (double)(var9 / 255.0F));
         this.w(var1, var2, var19, var4 + var16, var5, var6, var22.getRGB(), var10, (float)var11, var12);
         var16 += var20;
         ++var17;
         if (var15 == null) {
            break;
         }
      }

   }

   public float Q(String fontName, A weight, String text, float size, int alignment) {
      // $FF: Couldn't be decompiled
   }

   public float H(String fontName, A weight, String text, float size) {
      return this.Q(var1, var2, var3, var4, 9);
   }

   public float x(String fontName, String text, float size) {
      return this.Q(var1, A.REGULAR, var2, var3, 9);
   }

   public float L(String fontName, A weight, String text, float size, int alignment) {
      return this.P(var1, var2).q(var3, var4, var5);
   }

   public float b(String fontName, String text, float size, int alignment) {
      return this.L(var1, A.REGULAR, var2, var3, var4);
   }

   public float E(String fontName, String text, float size) {
      return this.L(var1, A.REGULAR, var2, var3, 9);
   }

   public float K(String fontName, A fontWeight, String text, float size) {
      return this.L(var1, var2, var3, var4, 9);
   }

   private z7 P(String var1, A var2) {
      return this.M.a(var1 + "-" + var2.g());
   }

   private String G(String param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 124893560926244L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "]¬>ðöë\u008c\u0003\u0018Jcñ»9\n\u0018ã7üÍÁ\u0081¥Ó×e§\u00811xPKÐ";
      int var8 = "]¬>ðöë\u008c\u0003\u0018Jcñ»9\n\u0018ã7üÍÁ\u0081¥Ó×e§\u00811xPKÐ".length();
      char var5 = '\b';
      int var4 = -1;

      label41:
      while(true) {
         ++var4;
         String var13 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var17;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  K = b[1];
                  d = new int[16];
                  int var11 = 0;

                  try {
                     while(var11 < 16) {
                        d[var11] = class_124.values()[var11].method_532();
                        ++var11;
                     }

                     return;
                  } catch (JSONException var12) {
                     throw a(var12);
                  }
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var17;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label41;
               }

               var6 = "\u0087\u009e\u0096\u0006j><¾\u0018Jcñ»9\n\u0018ã7üÍÁ\u0081¥Ó×e§\u00811xPKÐ";
               var8 = "\u0087\u009e\u0096\u0006j><¾\u0018Jcñ»9\n\u0018ã7üÍÁ\u0081¥Ó×e§\u00811xPKÐ".length();
               var5 = '\b';
               var4 = -1;
            }

            ++var4;
            var13 = var6.substring(var4, var4 + var5);
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
