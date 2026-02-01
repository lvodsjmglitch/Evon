package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import org.json.JSONException;

public final class gU extends gQ {
   private class_1309 F;
   private final _J I;
   private final _J a;
   private final _J r;
   private final _J G;
   private static final float t = 5.0F;
   private static final float i = 6.0F;
   private static final float V = 3.5F;
   private static final float R = 5.5F;
   private static final float x = 118.0F;
   private static final float d = 37.5F;
   private static final float v = 5.5F;
   private static final float j = 24.5F;
   private static final float g = 1.0F;
   private static final float b = 2.0F;
   private static final float J = 5.5F;
   private static final float w = 2.6666667F;
   private static final Color M;
   private float C;
   private final zf[] c;
   private static final Jz N;
   private static final zv k;
   private static final z7 h;
   private static final z7 D;
   private static final float q = 2.5F;
   private static final Color E;
   private static final Color L;
   private final R P;
   private static final long f = ds.a(9215283521949744867L, 5101181048801492530L, MethodHandles.lookup().lookupClass()).a(94656787526455L);
   private static final String[] l;

   public gU() {
      String[] var1 = l;
      super(var1[5], var1[1], zo.RENDER);
      this.I = new _J(50, 0.0D, yn.LINEAR);
      this.a = new _J(150, 0.0D, yn.LINEAR);
      this.r = new _J(350, 0.0D, yn.LINEAR);
      this.G = new _J(400, 0.0D, yn.LINEAR);
      this.C = 118.0F;
      this.c = new zf[]{new zf(this, club.evon.k.BLOCKING), new zf(this, club.evon.k.STRENGTH)};
      this.P = new R(0.55F, 0.5F);
      this.g(new B[]{this.P});
   }

   protected void H() {
      this.F = null;
      super.H();
   }

   @_S
   private void r(e param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void l(zx param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = f ^ 4465423770684L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "Ú\u000b\u008a³¬ª°o¦¾v}véø\u0087\u0018\\\u0094.\u0081ò±\bÁª\u008a\"ê\u000eYnF©\u0090\u0092AÖ\u001fØî\b\u001cáçûî÷£½\u0010µ\u009eqX+x\u0094íe\u0012Ñ\u0082å54U\u0010~\u0016\u001d4c§O`\u0015]-ÿ\f\u0016§\u0000\u0010Ò\u0081\u000f\u0003ð\u0088O\u0099|Ú\u0096ôjí\u0085!";
      int var8 = "Ú\u000b\u008a³¬ª°o¦¾v}véø\u0087\u0018\\\u0094.\u0081ò±\bÁª\u008a\"ê\u000eYnF©\u0090\u0092AÖ\u001fØî\b\u001cáçûî÷£½\u0010µ\u009eqX+x\u0094íe\u0012Ñ\u0082å54U\u0010~\u0016\u001d4c§O`\u0015]-ÿ\f\u0016§\u0000\u0010Ò\u0081\u000f\u0003ð\u0088O\u0099|Ú\u0096ôjí\u0085!".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var12 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var16;
               if ((var4 += var5) >= var8) {
                  l = var9;
                  M = J6.N(new Color(0, 0, 0), 0.25D);
                  String[] var11 = l;
                  N = new Jz(var11[7]);
                  k = zy.p().s();
                  h = k.a(var11[6]);
                  D = k.a(var11[0]);
                  E = J6.N(Color.WHITE, 0.05000000074505806D);
                  L = J6.N(new Color(35, 35, 35), 0.30000001192092896D);
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var16;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "\u0013\u0000\u0015mø+¦\u0082ìw\u008c\u0090¸Ùw\f\u0010Jgµw©>Óv#3Â».2{{";
               var8 = "\u0013\u0000\u0015mø+¦\u0082ìw\u008c\u0090¸Ùw\f\u0010Jgµw©>Óv#3Â».2{{".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var12 = var6.substring(var4, var4 + var5);
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
