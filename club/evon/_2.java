package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _2 extends _h<P> {
   private boolean Z;
   private final _J P;
   private static final float l = 15.0F;
   private static final float k = 1.5F;
   private static final float G = 4.0F;
   private static final float r = 5.5F;
   private static final float F = 3.5F;
   private static final Jz c;
   private static final long b = ds.a(1213891450403488564L, 4210274733815323801L, MethodHandles.lookup().lookupClass()).a(4142828261847L);

   public _2(P property) {
      super(var1);
      this.P = new _J(200, 0.0D, yn.LINEAR);
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
      long var1 = b ^ 117802506216324L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var3.doFinal("h¨+S»Î0?+Â\u007f\u0001j\u008cs\u0087".getBytes("ISO-8859-1"));
      String var6 = a(var5).intern();
      boolean var10001 = true;
      String var0 = var6;
      c = new Jz(var0);
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
