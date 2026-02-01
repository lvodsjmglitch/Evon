package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import org.json.JSONException;

public final class yx extends vJ<gy> {
   private static final int B;
   private static final int V;
   private static final int x;
   private static final int k;
   private static final int A;
   private static final float X = 7.5F;
   private static final float R = 0.6F;
   private static final float Q = 1.2F;
   private static final float h = 11.875F;
   private static final float C = 12.325F;
   private static final float E = 5.5F;
   private static final float b = 3.5F;
   private static final float m = 1.75F;
   private static final Color W;
   private static final Color J;
   private static final Color p;
   private static final Color I;
   private static final zv K;
   private static final z7 t;
   private static final z7 U;
   private static final String L;
   private class_1799 z;
   private boolean d;
   private final _J l;
   private _J S;
   private static final long c = ds.a(8688014846328325965L, 6976953675668626840L, MethodHandles.lookup().lookupClass()).a(135672095553839L);
   private static final String[] e;

   public yx(String name, gy parent) {
      super(var1, var2);
      this.l = new _J(200, 0.0D, yn.LINEAR);
      this.S = new _J(200, 0.0D, yn.LINEAR);
   }

   public void Y() {
      long var1 = c ^ 103589225040602L;
      gQ[] var10000 = club.evon.d.j();
      super.Y();
      gQ[] var3 = var10000;

      try {
         this.d = false;
         if (var3 == null) {
            gQ.o(new gQ[1]);
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   private class_1799 H() {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void S(e param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void q(yf param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void A(zx param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = c ^ 121766985493889L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "¯©\u001bÑÛs\u0095\"\u0010\u009b¿RÉA\u0018>îÃ¦\u001f\u0010\u0014w\u00003\u0010\u009b¿RÉA\u0018>îÃ¦\u001f\u0010\u0014w\u00003\u0010k\u009c\bÊLD\\É\u0089V>ÌÉ\u0006!ç";
      int var19 = "¯©\u001bÑÛs\u0095\"\u0010\u009b¿RÉA\u0018>îÃ¦\u001f\u0010\u0014w\u00003\u0010\u009b¿RÉA\u0018>îÃ¦\u001f\u0010\u0014w\u00003\u0010k\u009c\bÊLD\\É\u0089V>ÌÉ\u0006!ç".length();
      char var16 = '\b';
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var23 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var29;
               if ((var15 += var16) >= var19) {
                  e = var20;
                  L = e[1];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var11 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[4];
                  int var4 = 0;
                  String var5 = "\u00966\u009a*Yð°\u009b\u00152(Ç\u007f\t\u001a\u0093";
                  int var6 = "\u00966\u009a*Yð°\u009b\u00152(Ç\u007f\t\u001a\u0093".length();
                  int var3 = 0;

                  label36:
                  while(true) {
                     int var27 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var27, var3).getBytes("ISO-8859-1");
                     long[] var26 = var0;
                     var27 = var4++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var26[var27] = var34;
                           if (var3 >= var6) {
                              x = (int)var0[3];
                              B = (int)var0[0];
                              k = (int)var0[1];
                              A = (int)var0[1];
                              V = (int)var0[2];
                              W = J6.N(Color.WHITE, 0.05D);
                              J = J6.N(new Color(35, 35, 35), 0.30000001192092896D);
                              p = J6.N(Color.WHITE, 0.25D);
                              I = J6.N(Color.WHITE, 0.3499999940395355D);
                              K = zy.p().s();
                              String[] var22 = e;
                              t = K.a(var22[3]);
                              U = K.a(var22[4]);
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var3 < var6) {
                              continue label36;
                           }

                           var5 = "®\u008cd\u009dpç°\u001f\u00853óÒäÍrÒ";
                           var6 = "®\u008cd\u009dpç°\u001f\u00853óÒäÍrÒ".length();
                           var3 = 0;
                        }

                        var27 = var3;
                        var3 += 8;
                        var7 = var5.substring(var27, var3).getBytes("ISO-8859-1");
                        var26 = var0;
                        var27 = var4++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var29;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "ãSæ³\u0001Ê\u00ad×wû,CìvV¨\bªH\u0010CÜ\u0090\u0087³";
               var19 = "ãSæ³\u0001Ê\u00ad×wû,CìvV¨\bªH\u0010CÜ\u0090\u0087³".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var23 = var17.substring(var15, var15 + var16);
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
