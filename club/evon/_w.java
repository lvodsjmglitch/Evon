package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_5250;

public class _w extends _R {
   private static final long b = ds.a(6088672933651899385L, -8594369125145436059L, MethodHandles.lookup().lookupClass()).a(50313270581088L);
   private static final String[] c;

   public _w() {
      String[] var1 = c;
      super(var1[1], var1[0], "");
   }

   public boolean x(String... args) {
      long var2 = b ^ 16742701217547L;
      String var10000 = _Q.a();
      List var5 = Jw.a().s();
      String var10001 = String.valueOf(class_124.field_1080);
      String var10002 = String.valueOf(class_124.field_1065);
      String var10003 = String.valueOf(class_124.field_1067);
      int var10004 = var5.size();
      String var10005 = String.valueOf(class_124.field_1070);
      String var8 = String.valueOf(class_124.field_1080);
      String var9 = var10005;
      int var10 = var10004;
      String var11 = var10003;
      String var12 = var10002;
      String[] var13 = c;
      x.G(var10001 + var13[3] + var12 + var11 + var13[6] + var10 + var13[4] + var9 + var8 + var13[2]);
      Iterator var6 = var5.iterator();
      String var4 = var10000;

      while(var6.hasNext()) {
         w var7 = (w)var6.next();
         class_5250 var14 = class_2561.method_43470(var7.f()).method_54663(var7.i().A().method_27716());
         var10001 = var7.X();
         var10003 = c[5];
         x.B(var14.method_10852(class_2561.method_43470(var10003 + var10001 + ")").method_27692(class_124.field_1080)));
         if (var4 != null) {
            gQ.o(new gQ[1]);
            break;
         }
      }

      return true;
   }

   static {
      long var0 = b ^ 38725423580910L;
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
      String var6 = "\u001bR@^ñ\u009aLluø*\u008c½Nõ\u009b_gÿ\u0016\u0018AÝ8\b±\u008c?\u0000¨°ÍÖ\u0018É\u0004Ãÿà\u000fz6\\Od\u009aÙ\u0098\u001f\u0081_ý\u0084z\u001e\u0099\u009bO\u0018\u0087¶Sl\u0019\u0087gÑ\u0006Ú¬M¢R\u0019 úß\u000flî\u0004\u009fø\u0010â\u0007m)¨OÌÞÑ\u0016ôTþ¥^6";
      int var8 = "\u001bR@^ñ\u009aLluø*\u008c½Nõ\u009b_gÿ\u0016\u0018AÝ8\b±\u008c?\u0000¨°ÍÖ\u0018É\u0004Ãÿà\u000fz6\\Od\u009aÙ\u0098\u001f\u0081_ý\u0084z\u001e\u0099\u009bO\u0018\u0087¶Sl\u0019\u0087gÑ\u0006Ú¬M¢R\u0019 úß\u000flî\u0004\u009fø\u0010â\u0007m)¨OÌÞÑ\u0016ôTþ¥^6".length();
      char var5 = 24;
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
                  c = var9;
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

               var6 = "\u0089Ù\u008f8m÷¦%\bLA(\u001e¢%\u0006;";
               var8 = "\u0089Ù\u008f8m÷¦%\bLA(\u001e¢%\u0006;".length();
               var5 = '\b';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
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
