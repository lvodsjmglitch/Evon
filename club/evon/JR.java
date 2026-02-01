package club.evon;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_320;

public class JR {
   private final JsonObject q;
   private static final File R;
   private static String[] y;
   private static final long a = ds.a(6539205575775434221L, -1725987794627875826L, MethodHandles.lookup().lookupClass()).a(234683605392071L);
   private static final String[] b;

   public JR() {
      long var1 = a ^ 99941820891313L;
      super();
      if (!R.exists()) {
         this.q = new JsonObject();
      } else {
         StringBuilder var3 = new StringBuilder();

         String var5;
         try {
            BufferedReader var4 = new BufferedReader(new FileReader(R));

            while(true) {
               try {
                  String var10000 = var5 = var4.readLine();

                  try {
                     if (var10000 != null) {
                        var3.append(var5);
                        continue;
                     }
                  } catch (Throwable var10) {
                     throw a(var10);
                  }
               } catch (Throwable var11) {
                  try {
                     var4.close();
                  } catch (Throwable var8) {
                     var11.addSuppressed(var8);
                  }

                  throw var11;
               }

               var4.close();
               break;
            }
         } catch (IOException var12) {
            throw new RuntimeException(var12);
         }

         String var13;
         try {
            String[] var7 = b;
            var5 = var7[0];
            var13 = yb.J(var7[0], var3.toString());
         } catch (Exception var9) {
            this.q = new JsonObject();
            return;
         }

         this.q = JsonParser.parseString(var13).getAsJsonObject();
      }
   }

   public void n(class_320 session, yg level) {
      long var3 = a ^ 85927092200120L;
      String[] var5 = X();

      try {
         if (this.q.has(var1.method_1676())) {
            return;
         }
      } catch (Throwable var14) {
         throw a(var14);
      }

      JsonArray var6 = new JsonArray();
      var6.add(var1.method_1676());
      var6.add(var1.method_1674());
      var6.add(var1.method_44717().toString());
      var6.add(var2.M());
      this.q.add(var1.method_1676(), var6);
      zV.n().g(var6);

      try {
         BufferedWriter var7 = new BufferedWriter(new FileWriter(R, false));

         try {
            var7.write(this.q.toString());
         } catch (Throwable var12) {
            try {
               var7.close();
            } catch (Throwable var10) {
               var12.addSuppressed(var10);
            }

            throw var12;
         }

         var7.close();
      } catch (IOException var13) {
         throw new RuntimeException(var13);
      }

      try {
         if (gQ.q() == null) {
            Z(new String[5]);
         }

      } catch (Throwable var11) {
         throw a(var11);
      }
   }

   public void C(String username) {
      // $FF: Couldn't be decompiled
   }

   public JsonObject c() {
      return this.q;
   }

   static {
      String[] var10000 = new String[2];
      long var0 = a ^ 6403962651358L;
      Z(var10000);
      Cipher var2;
      Cipher var12 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var12.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[4];
      int var7 = 0;
      String var6 = "K\u009a\u0096n{_X\u001b\u0090ìÉC&\u009f;Î&9(ÍÒ\u0004\u0080Ã ¸5\u0092KB®\t\n\u0003ÇæüÙ0=\u0010»ì½\u0013üµ\u0006paä\u0082\\\u009elÌÿ";
      int var8 = "K\u009a\u0096n{_X\u001b\u0090ìÉC&\u009f;Î&9(ÍÒ\u0004\u0080Ã ¸5\u0092KB®\t\n\u0003ÇæüÙ0=\u0010»ì½\u0013üµ\u0006paä\u0082\\\u009elÌÿ".length();
      char var5 = '(';
      int var4 = -1;

      label27:
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
                  String[] var11 = b;
                  R = new File(new File(ym.m.field_1697, var11[3]), var11[1]);
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var17;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "K\u009a\u0096n{_X\u001b\u0090ìÉC&\u009f;Î&9(ÍÒ\u0004\u0080Ã ¸5\u0092KB®\t\n\u0003ÇæüÙ0=\b\nôÕ\u000e\u0088\u0095OD";
               var8 = "K\u009a\u0096n{_X\u001b\u0090ìÉC&\u009f;Î&9(ÍÒ\u0004\u0080Ã ¸5\u0092KB®\t\n\u0003ÇæüÙ0=\b\nôÕ\u000e\u0088\u0095OD".length();
               var5 = '(';
               var4 = -1;
            }

            ++var4;
            var13 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   public static void Z(String[] var0) {
      y = var0;
   }

   public static String[] X() {
      return y;
   }

   private static Throwable a(Throwable var0) {
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
