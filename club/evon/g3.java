package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1799;
import org.json.JSONException;

public final class g3 extends gQ {
   private final ya O;
   private final ya k;
   private int z;
   private int j;
   private boolean X;
   private static final long a = ds.a(-7384214343184835666L, 4948546694156851612L, MethodHandles.lookup().lookupClass()).a(239271009507545L);
   private static final String[] b;
   private static final long c;

   public g3() {
      long var1 = a ^ 115300415670187L;
      String[] var4 = b;
      super(var4[1], var4[3], zo.MOTION);
      gS.z();
      this.O = new ya(Jl.h());
      this.k = new ya(JD.M());

      try {
         if (gQ.q() == null) {
            gS.X(new gQ[3]);
         }

      } catch (JSONException var5) {
         throw a(var5);
      }
   }

   public void W() {
      long var1 = a ^ 67252559026730L;
      this.z = (int)c;
      this.j = 0;
      this.X = false;
      super.W();
   }

   public void H() {
      this.O.j();
      this.k.j();
      super.H();
   }

   @_S
   private void Q(v3 param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void P(_D param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean l(class_1799 param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void C(yN param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = a ^ 47720639073390L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "\n\u009e¥-È÷Áv\u009e«D\u009aÞX¹9\u0010æ\u001aÅ\u0015\u0086:åS\u009dÅþÚ\u00839Ò0";
      int var13 = "\n\u009e¥-È÷Áv\u009e«D\u009aÞX¹9\u0010æ\u001aÅ\u0015\u0086:åS\u009dÅþÚ\u00839Ò0".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -4156515820564852650L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  c = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "b sç\u0084\u001fÝ\u000brn\u0093\b\u008a!\u0004()ÿ¾\u009eÓ¨8eºñ¨\rpu\u0086Þ\u0081¨ë@ë\u001dy-\u0018Y\u0097³_\u0090\u008e\u00adøz\u0098ØÝäI\u001a\u000b;OùC\u0017\u001aÀÉ";
               var13 = "b sç\u0084\u001fÝ\u000brn\u0093\b\u008a!\u0004()ÿ¾\u009eÓ¨8eºñ¨\rpu\u0086Þ\u0081¨ë@ë\u001dy-\u0018Y\u0097³_\u0090\u008e\u00adøz\u0098ØÝäI\u001a\u000b;OùC\u0017\u001aÀÉ".length();
               var10 = '(';
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
