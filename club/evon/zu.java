package club.evon;

import club.evon.mixins.LivingEntityAccessor;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_745;
import org.json.JSONException;

public final class zu {
   private class_745 O;
   private final class_1657 u;
   private static final long a = ds.a(-7202785198274869615L, 8505584687477441829L, MethodHandles.lookup().lookupClass()).a(259977089517111L);
   private static final String b;

   public zu(class_1657 player) {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   public void J(int tickCount) {
      long var2 = a ^ 34380166441222L;
      String[] var10000 = Jd.K();
      LivingEntityAccessor var5 = (LivingEntityAccessor)this.O;
      String[] var4 = var10000;
      int var6 = 0;

      while(var6 < var1) {
         var5.callTravelMidAir(new class_243((double)this.u.field_6212, (double)this.u.field_6227, (double)this.u.field_6250));
         ++var6;
         if (var4 == null) {
            break;
         }
      }

   }

   public void n() {
      this.J(1);
   }

   public class_745 q() {
      return this.O;
   }

   static {
      long var0 = a ^ 10401801849147L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var4 = var2.doFinal("®\u0098¯\u0014÷¯à¨,sÉ9<|#£YË½¸ñ¶W$".getBytes("ISO-8859-1"));
      String var5 = a(var4).intern();
      boolean var10001 = true;
      b = var5;
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
