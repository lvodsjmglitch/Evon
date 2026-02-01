package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _b extends _h<W<?>> {
   private boolean F;
   private final _J R;
   private static final float j = 15.0F;
   private static final float W = 1.5F;
   private static final float d = 4.0F;
   private static final float Z = 5.5F;
   private static final float b = 3.5F;
   private static final Jz P;
   private static int f;
   private static final long c = ds.a(3200991764582825825L, 4325512052579121588L, MethodHandles.lookup().lookupClass()).a(250537358595669L);

   public _b(W<?> property) {
      super(var1);
      this.R = new _J(200, 0.0D, yn.LINEAR);
   }

   public void l(int mouseX, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void W(double mouseX, double mouseY, int button) {
      // $FF: Couldn't be decompiled
   }

   public float m() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var1 = c ^ 90635936556795L;
      q(0);
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var3.doFinal("¶\nÆÜâ-ê3<V`\u001a)\u0096+E".getBytes("ISO-8859-1"));
      String var6 = a(var5).intern();
      boolean var10001 = true;
      String var0 = var6;
      P = new Jz(var0);
   }

   public static void q(int var0) {
      f = var0;
   }

   public static int c() {
      return f;
   }

   public static int V() {
      int var0 = c();

      try {
         return var0 == 0 ? 78 : 0;
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
