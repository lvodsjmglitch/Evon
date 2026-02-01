package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public class y0 extends vJ<g2> {
   private final a P;
   private final a N;
   private final K b;
   private static int[] v;
   private static final long c = ds.a(-7429886322995266278L, 1787916858046986109L, MethodHandles.lookup().lookupClass()).a(129042387448601L);
   private static final String[] d;

   public y0(String name, g2 parent) {
      super(var1, var2);
      String[] var3 = d;
      this.P = new a(var3[6], 1.0D, 0.0D, 9.5D, 0.01D);
      this.N = new a(var3[0], 1.0D, 0.0D, 9.5D, 0.01D);
      this.b = new K(var3[4], new t[]{new t(var3[1], false), new t(var3[5], false)});
      this.j(new B[]{this.b, this.P, this.N});
   }

   public void S() {
      super.S();
   }

   public void Y() {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void f(z0 param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   public void W(vA event) {
      var1.k(false);
   }

   public static void H(int[] var0) {
      v = var0;
   }

   public static int[] O() {
      return v;
   }

   static {
      long var0 = c ^ 120600468818104L;
      H((int[])null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "p¼\u009cÃýµ{ðÿv¡¹]o\u0003\u0093\u0010µA\u0010\u008eÔGT\u0014â+hPîÔ\u0005M\u0010µA\u0010\u008eÔGT\u0014â+hPîÔ\u0005M\u0010\rÀG\u0087\u009ey\u0092\u00adâ\u001e\u0081µ»¶lj\u0018³²\u0018\\\u0007\u008b{Åí\\\u0081FÕíÏÝ:\u009e\u001cíyUñ ";
      int var8 = "p¼\u009cÃýµ{ðÿv¡¹]o\u0003\u0093\u0010µA\u0010\u008eÔGT\u0014â+hPîÔ\u0005M\u0010µA\u0010\u008eÔGT\u0014â+hPîÔ\u0005M\u0010\rÀG\u0087\u009ey\u0092\u00adâ\u001e\u0081µ»¶lj\u0018³²\u0018\\\u0007\u008b{Åí\\\u0081FÕíÏÝ:\u009e\u001cíyUñ ".length();
      char var5 = 16;
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
                  d = var9;
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

               var6 = "\rÀG\u0087\u009ey\u0092\u00adâ\u001e\u0081µ»¶lj\u0018°÷Ü#\u0019§\u0083þ\u0082ù|\u0084;!i\u009aM\u001a\u0098?\u0010µè«";
               var8 = "\rÀG\u0087\u009ey\u0092\u00adâ\u001e\u0081µ»¶lj\u0018°÷Ü#\u0019§\u0083þ\u0082ù|\u0084;!i\u009aM\u001a\u0098?\u0010µè«".length();
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
