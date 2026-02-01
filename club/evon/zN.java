package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public class zN {
   private float U;
   private float o;
   private final float N;
   private final float J;
   private final float F;
   private final _J K;
   private final _J u;
   private static final Color R;
   private final String z;
   private final String p;
   private final UUID M;
   private final yg x;
   private static final long a = ds.a(2029814519829821927L, -3245157692221882753L, MethodHandles.lookup().lookupClass()).a(60255473608234L);
   private static final String[] b;

   public zN(String username, String token, UUID uuid, yg type, float width, float height, float radius) {
      this.K = new _J(200, 0.0D, yn.LINEAR);
      this.u = new _J(100, 0.0D, yn.LINEAR);
      this.z = var1;
      this.p = var2;
      this.M = var3;
      this.x = var4;
      this.N = var5;
      this.J = var6;
      this.F = var7;
      this.u.N(0.0D);
   }

   public void m(float x, float y, double mouseX, double mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void N(Consumer<zN> consumer) {
      var1.accept(this.c());
   }

   public zN c() {
      return new zN(this.z, this.p, this.M, this.x, this.N, this.J, this.F);
   }

   public float t() {
      return this.U;
   }

   public float X() {
      return this.o;
   }

   public float u() {
      return this.N;
   }

   public float C() {
      return this.J;
   }

   public float P() {
      return this.F;
   }

   public String M() {
      return this.z;
   }

   public String A() {
      return this.p;
   }

   static {
      long var0 = a ^ 31796176610115L;
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
      String var6 = "N.\u001fÛtvÌ\u0091\"^d\u001eë\u0003\u0088Ì\bJæo\u00184\u0015¸\u008b";
      int var8 = "N.\u001fÛtvÌ\u0091\"^d\u001eë\u0003\u0088Ì\bJæo\u00184\u0015¸\u008b".length();
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
                  R = J6.N(Color.WHITE, 0.15000000596046448D);
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

               var6 = "s_\u0010í9u\u001eiÀ\naàðÐøÃ\u0010Gzñ\u001d?xË\u008cTJ\tÛ¿óúY";
               var8 = "s_\u0010í9u\u001eiÀ\naàðÐøÃ\u0010Gzñ\u001d?xË\u008cTJ\tÛ¿óúY".length();
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
