package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_2568.class_10613;
import org.json.JSONException;

public final class x {
   private static final String m;
   private static final String k;
   private static boolean Z;
   private static final long a = ds.a(-7331911096442181225L, 478237071930209408L, MethodHandles.lookup().lookupClass()).a(154066742979624L);

   public static void g(Object message) {
      String var10000 = m;
      u(class_2561.method_43470(var10000 + var0.toString()));
   }

   public static void u(class_2561 message) {
      // $FF: Couldn't be decompiled
   }

   public static void G(Object message) {
      u(class_2561.method_43470(var0.toString()));
   }

   public static void B(class_2561 message) {
      // $FF: Couldn't be decompiled
   }

   public static void x(String message) {
      // $FF: Couldn't be decompiled
   }

   public static void l(String message) {
      // $FF: Couldn't be decompiled
   }

   public static void y(String message, Runnable action) {
      class_5250 var2 = class_2561.method_43470(m + var0).method_10862(class_2583.field_24360.method_10958(new yT(var1)));
      ym.m.field_1705.method_1743().method_1812(var2);
   }

   public static void G(String message, Runnable action) {
      class_5250 var2 = class_2561.method_43470(var0).method_10862(class_2583.field_24360.method_10958(new yT(var1)));
      ym.m.field_1705.method_1743().method_1812(var2);
   }

   public static void T(String message, class_2561 hoveredText) {
      class_5250 var2 = class_2561.method_43470(m + var0).method_10862(class_2583.field_24360.method_10949(new class_10613(var1)));
      ym.m.field_1705.method_1743().method_1812(var2);
   }

   public static void k(String message) {
      ym.m.field_1705.method_1743().method_1812(class_2561.method_30163(k + var0));
   }

   static {
      long var1 = a ^ 51684202199583L;
      m(true);
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var8 = 0;
      String var7 = "\\\u008d\u0080ù:^{.\baÊT;=\\§Û";
      int var9 = "\\\u008d\u0080ù:^{.\baÊT;=\\§Û".length();
      char var6 = '\b';
      int var5 = -1;

      label28:
      while(true) {
         ++var5;
         String var19 = var7.substring(var5, var5 + var6);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var3.doFinal(var19.getBytes("ISO-8859-1"));
            String var23 = a(var10).intern();
            switch(var10001) {
            case 0:
               var0[var8++] = var23;
               if ((var5 += var6) >= var9) {
                  var19 = String.valueOf(class_124.field_1080);
                  String var21 = String.valueOf(class_124.field_1068);
                  var23 = String.valueOf(class_124.field_1067);
                  String var25 = String.valueOf(class_124.field_1080);
                  String var11 = String.valueOf(class_124.field_1070);
                  String var12 = var25;
                  String var13 = var23;
                  String var14 = var21;
                  m = var19 + "[" + var14 + var13 + var0[1] + var12 + var0[2] + var11;
                  var19 = String.valueOf(class_124.field_1080);
                  var21 = String.valueOf(class_124.field_1061);
                  var23 = String.valueOf(class_124.field_1067);
                  var25 = String.valueOf(class_124.field_1080);
                  String var15 = String.valueOf(class_124.field_1070);
                  String var16 = var25;
                  String var17 = var23;
                  String var18 = var21;
                  k = var19 + "[" + var18 + var17 + var0[0] + var16 + var0[3] + var15;
                  return;
               }

               var6 = var7.charAt(var5);
               break;
            default:
               var0[var8++] = var23;
               if ((var5 += var6) < var9) {
                  var6 = var7.charAt(var5);
                  continue label28;
               }

               var7 = "Åf>Tù\u008aÌ;\bÅf>Tù\u008aÌ;";
               var9 = "Åf>Tù\u008aÌ;\bÅf>Tù\u008aÌ;".length();
               var6 = '\b';
               var5 = -1;
            }

            ++var5;
            var19 = var7.substring(var5, var5 + var6);
            var10001 = 0;
         }
      }
   }

   public static void m(boolean var0) {
      Z = var0;
   }

   public static boolean k() {
      return Z;
   }

   public static boolean d() {
      boolean var0 = k();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a(var1);
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
