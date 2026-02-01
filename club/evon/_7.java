package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _7 extends _h<t> {
   private final _J t;
   private static final int l;
   private static final int R;
   private static final float k = 4.5F;
   private static final long b = ds.a(-107387567328905744L, 9117640952729115700L, MethodHandles.lookup().lookupClass()).a(52277748006280L);

   public _7(t property) {
      long var2 = b ^ 124634672364600L;
      super(var1);
      this.t = new _J(200, var1.I() ? 1.0D : 0.0D, yn.LINEAR);
   }

   public void l(int mouseX, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void W(double mouseX, double mouseY, int button) {
      long var6 = b ^ 50109261662572L;
      int var8 = _b.V();

      try {
         if (var5 != 0) {
            return;
         }
      } catch (JSONException var11) {
         throw a(var11);
      }

      t var9 = (t)this.d();

      t var10000;
      boolean var10001;
      label27: {
         label26: {
            try {
               var10000 = var9;
               var10001 = var9.I();
               if (var8 == 0) {
                  break label27;
               }

               if (!var10001) {
                  break label26;
               }
            } catch (JSONException var10) {
               throw a(var10);
            }

            var10001 = false;
            break label27;
         }

         var10001 = true;
      }

      var10000.P(var10001);
   }

   protected Color Y() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var1 = b ^ 123918956262061L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var0 = new long[2];
      int var6 = 0;
      String var7 = "[·\u001dv\u008b¯SlS²m®\u0097Y\u008bU";
      int var8 = "[·\u001dv\u008b¯SlS²m®\u0097Y\u008bU".length();
      int var5 = 0;

      do {
         int var10001 = var5;
         var5 += 8;
         byte[] var9 = var7.substring(var10001, var5).getBytes("ISO-8859-1");
         var10001 = var6++;
         long var10 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte[] var12 = var3.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
         long var10004 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
         boolean var13 = true;
         var0[var10001] = var10004;
      } while(var5 < var8);

      R = (int)var0[1];
      l = (int)var0[0];
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
