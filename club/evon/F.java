package club.evon;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class F implements h {
   private final List<String> S = new ArrayList();
   public static F g;
   private static final long a = ds.a(-1142650502126622993L, 2087992797001403969L, MethodHandles.lookup().lookupClass()).a(75537303633683L);
   private static final String[] b;

   public void z() {
      String[] var9 = b;
      File var1 = new File(ym.u, var9[1]);

      try {
         var1.createNewFile();
         JsonObject var2 = new JsonObject();
         JsonArray var3 = new JsonArray();
         List var10000 = this.S;
         Objects.requireNonNull(var3);
         var10000.forEach(var3::add);
         var2.add(var9[2], var3);
         String var4 = var9[4];
         String var5 = yb.q(var9[4], ym.p.toJson(var2));
         BufferedWriter var6 = new BufferedWriter(new FileWriter(var1, false));

         try {
            var6.write(var5);
         } catch (Throwable var11) {
            try {
               var6.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }

            throw var11;
         }

         var6.close();
      } catch (Exception var12) {
         var12.fillInStackTrace();
      }

   }

   public void n() {
      long var1 = a ^ 67287861349829L;
      String[] var8 = b;
      File var3 = new File(ym.u, var8[0]);

      try {
         if (!var3.exists()) {
            return;
         }
      } catch (Throwable var14) {
         throw a(var14);
      }

      try {
         StringBuilder var4 = new StringBuilder();
         BufferedReader var5 = new BufferedReader(new FileReader(var3));

         String var6;
         try {
            while(true) {
               String var10000 = var6 = var5.readLine();

               try {
                  if (var10000 == null) {
                     break;
                  }

                  var4.append(var6);
               } catch (Throwable var11) {
                  throw a(var11);
               }
            }
         } catch (Throwable var12) {
            try {
               var5.close();
            } catch (Throwable var9) {
               var12.addSuppressed(var9);
            }

            throw var12;
         }

         var5.close();

         String var15;
         try {
            var8 = b;
            var6 = var8[5];
            var15 = yb.J(var8[4], var4.toString());
         } catch (Exception var10) {
            return;
         }

         JsonObject var16 = (JsonObject)ym.p.fromJson(var15, JsonObject.class);
         if (var16 == null) {
            return;
         }

         var16.get(b[3]).getAsJsonArray().forEach((var1x) -> {
            this.S.add(var1x.getAsString());
         });
      } catch (Exception var13) {
         var13.fillInStackTrace();
      }

   }

   public void c(String name) {
      // $FF: Couldn't be decompiled
   }

   public void Q(String string) {
      this.S.remove(var1.toLowerCase());
   }

   public boolean x(String string) {
      return this.S.contains(var1.toLowerCase());
   }

   public static void u() {
      g = new F();
   }

   public List<String> n() {
      return this.S;
   }

   public static F n() {
      return g;
   }

   static {
      long var0 = a ^ 45328041178527L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "ñ)è iJò\u007fFËñ\fI\u0017P÷\u0010ñ)è iJò\u007fFËñ\fI\u0017P÷\bDFø¿É\u0097\u0090v\bDFø¿É\u0097\u0090v";
      int var8 = "ñ)è iJò\u007fFËñ\fI\u0017P÷\u0010ñ)è iJò\u007fFËñ\fI\u0017P÷\bDFø¿É\u0097\u0090v\bDFø¿É\u0097\u0090v".length();
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
                  b = var9;
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

               var6 = "\u0084z\t;$åÎ\u0097asl[@úuÃ\u0083JLÛ Máèd4\u0080ç\u0087N´jÎ\u001e¶\u0007£c®C(\u0084z\t;$åÎ\u0097asl[@úuÃ\u0083JLÛ Máèd4\u0080ç\u0087N´jÎ\u001e¶\u0007£c®C";
               var8 = "\u0084z\t;$åÎ\u0097asl[@úuÃ\u0083JLÛ Máèd4\u0080ç\u0087N´jÎ\u001e¶\u0007£c®C(\u0084z\t;$åÎ\u0097asl[@úuÃ\u0083JLÛ Máèd4\u0080ç\u0087N´jÎ\u001e¶\u0007£c®C".length();
               var5 = '(';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
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
