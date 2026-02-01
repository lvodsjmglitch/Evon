package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;

public class _t extends _h<c> {
   private boolean J;
   private final _J n;
   private static final float G = 15.0F;
   private static final float O = 1.5F;
   private static final float f = 4.0F;
   private static final float v = 5.5F;
   private static final float H = 3.5F;
   private static final float Q = 1.5F;
   private static final float T = 4.5F;
   private float s;
   private float R;
   private float F;
   private final float[] x;
   private float W;
   private float w;
   private float r;
   private float B;
   private float q;
   private float C;
   private boolean j;
   private boolean A;
   private static final Jz P;
   private static final Jz b;
   private final _J d;
   private final _J S;
   private static final long c = ds.a(-8021135135880900202L, 1059405015486360869L, MethodHandles.lookup().lookupClass()).a(80470329099150L);
   private static final String[] g;

   public _t(c property) {
      super(var1);
      this.n = new _J(200, 0.0D, yn.LINEAR);
      this.x = new float[3];
      this.d = new _J(200, 0.0D, yn.LINEAR);
      this.S = new _J(200, 0.0D, yn.LINEAR);
      Color var2 = (Color)var1.J();
      Color.RGBtoHSB(var2.getRed(), var2.getGreen(), var2.getBlue(), this.x);
   }

   public void l(int mouseX, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   private static void x(float var0, float var1, float var2, float var3, float var4) {
      y8.j();
      y8.B(var0, var1);
      NVGPaint var5 = NVGPaint.calloc();
      int var6 = b.R();
      NanoVG.nvgImagePattern(y8.I, 0.0F, 0.0F, var2, var3, 0.0F, var6, 1.0F, var5);
      NanoVG.nvgBeginPath(y8.I);
      NanoVG.nvgRoundedRectVarying(y8.I, 0.0F, 0.0F, var2, var3, var4, var4, var4, var4);
      NanoVG.nvgFillPaint(y8.I, var5);
      NanoVG.nvgFill(y8.I);
      var5.free();
      y8.g();
   }

   private void h(float param1, float param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   public void W(double mouseX, double mouseY, int button) {
      // $FF: Couldn't be decompiled
   }

   public float m() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = c ^ 125960193609147L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "\u0095\u000eW\u001fæQÏ°VO\u001cþ\u0088#ÊV\u0010Õv}\u0081B\u00ad\u008b¼pJ´\u0006¨¢Ê\u009f\u0018G\ro\u0098\u0019oNj\u001e»ºñln*Ù¸ºD ;yvÖ";
      int var8 = "\u0095\u000eW\u001fæQÏ°VO\u001cþ\u0088#ÊV\u0010Õv}\u0081B\u00ad\u008b¼pJ´\u0006¨¢Ê\u009f\u0018G\ro\u0098\u0019oNj\u001e»ºñln*Ù¸ºD ;yvÖ".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var13 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var13;
         if ((var4 += var5) >= var8) {
            g = var9;
            String[] var11 = g;
            P = new Jz(var11[0]);
            b = new Jz(var11[1]);
            return;
         }

         var5 = var6.charAt(var4);
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
