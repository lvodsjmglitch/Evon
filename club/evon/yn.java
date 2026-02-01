package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.function.DoubleFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public enum yn {
   LINEAR,
   DECELERATE,
   IN_BACK,
   IN_QUADRATIC,
   OUT_QUADRATIC,
   IN_OUT_QUADRATIC,
   IN_EXPONENT,
   OUT_EXPONENT,
   IN_OUT_EXPONENT,
   OUT_ELASTIC,
   IN_ELASTIC;

   private final DoubleFunction<Double> B;
   private static int[] q;
   private static final long a = ds.a(3768708869583401960L, -1717032343723295308L, MethodHandles.lookup().lookupClass()).a(201458224029828L);

   public DoubleFunction<Double> g() {
      return this.B;
   }

   private yn(DoubleFunction<Double> var3) {
      this.B = var3;
   }

   // $FF: synthetic method
   private static yn[] P() {
      return new yn[]{LINEAR, DECELERATE, IN_BACK, IN_QUADRATIC, OUT_QUADRATIC, IN_OUT_QUADRATIC, IN_EXPONENT, OUT_EXPONENT, IN_OUT_EXPONENT, OUT_ELASTIC, IN_ELASTIC};
   }

   static {
      int[] var10000 = new int[4];
      long var1 = a ^ 69505734791985L;
      Q(var10000);
      Cipher var3;
      Cipher var11 = var3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var11.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[11];
      int var8 = 0;
      String var7 = "\u0004?\u000e ÎÝúÄ×ù!hæ\u000e½Ñ\bê,\u008e\u001f`×¸w\u00104\u009bûtÓ¤\u0099'\u009d9h,Û\u0080\u0010P\u0010yäx\nV¦ÑdgZ¬þe\u0011øÏ\u0010\f\u0093ëÜ(\u0080\u0090××\u0091\nDQ\u0003\u0086\u0019\u0010CO\u009d L\r \u0015ÙÛ\u0099\u0017\u008bËä&\bÏ*\u0018R\u0014\u0081\u0018á\u0010ç´\u0003:Ñ\u0095\u0010~\u0093Ð ÕÿIS\u0017\u0010\u0000]x\u0018Ö\u0010\u0005Q°ï¥*ß\u0007\u00019";
      int var9 = "\u0004?\u000e ÎÝúÄ×ù!hæ\u000e½Ñ\bê,\u008e\u001f`×¸w\u00104\u009bûtÓ¤\u0099'\u009d9h,Û\u0080\u0010P\u0010yäx\nV¦ÑdgZ¬þe\u0011øÏ\u0010\f\u0093ëÜ(\u0080\u0090××\u0091\nDQ\u0003\u0086\u0019\u0010CO\u009d L\r \u0015ÙÛ\u0099\u0017\u008bËä&\bÏ*\u0018R\u0014\u0081\u0018á\u0010ç´\u0003:Ñ\u0095\u0010~\u0093Ð ÕÿIS\u0017\u0010\u0000]x\u0018Ö\u0010\u0005Q°ï¥*ß\u0007\u00019".length();
      char var6 = 16;
      int var5 = -1;

      label28:
      while(true) {
         ++var5;
         String var12 = var7.substring(var5, var5 + var6);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var3.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var10).intern();
            switch(var10001) {
            case 0:
               var0[var8++] = var16;
               if ((var5 += var6) >= var9) {
                  LINEAR = new yn(var0[1], 0, (var0x) -> {
                     return -2.0D * Math.pow(var0x, 3.0D) + 3.0D * Math.pow(var0x, 2.0D);
                  });
                  DECELERATE = new yn(var0[5], 1, (var0x) -> {
                     return -Math.pow(var0x, 2.0D) + var0x * 2.0D;
                  });
                  IN_BACK = new yn(var0[6], 2, (var0x) -> {
                     return 2.718281828459045D * Math.pow(var0x, 3.0D) - 2.718281828459045D * Math.pow(var0x, 2.0D) + Math.pow(var0x, 2.0D);
                  });
                  IN_QUADRATIC = new yn(var0[7], 3, (var0x) -> {
                     return Math.pow(var0x, 2.0D);
                  });
                  OUT_QUADRATIC = new yn(var0[3], 4, (var0x) -> {
                     return var0x * 2.0D - Math.pow(var0x, 2.0D);
                  });
                  IN_OUT_QUADRATIC = new yn(var0[10], 5, (param0) -> {
                     // $FF: Couldn't be decompiled
                  });
                  IN_EXPONENT = new yn(var0[8], 6, (param0) -> {
                     // $FF: Couldn't be decompiled
                  });
                  OUT_EXPONENT = new yn(var0[9], 7, (param0) -> {
                     // $FF: Couldn't be decompiled
                  });
                  IN_OUT_EXPONENT = new yn(var0[2], 8, (param0) -> {
                     // $FF: Couldn't be decompiled
                  });
                  OUT_ELASTIC = new yn(var0[4], 9, (param0) -> {
                     // $FF: Couldn't be decompiled
                  });
                  IN_ELASTIC = new yn(var0[0], 10, (param0) -> {
                     // $FF: Couldn't be decompiled
                  });
                  return;
               }

               var6 = var7.charAt(var5);
               break;
            default:
               var0[var8++] = var16;
               if ((var5 += var6) < var9) {
                  var6 = var7.charAt(var5);
                  continue label28;
               }

               var7 = "\u0098\t$&\u0006c\u0000\u0094_æ\u007fÇqVÿ\u0002\u0018`ÐÂ´$Ïn\u008aZ\u0095ö\u0019\u0099õ\u008c¨Ê\u0019¢L©#\u0099¯";
               var9 = "\u0098\t$&\u0006c\u0000\u0094_æ\u007fÇqVÿ\u0002\u0018`ÐÂ´$Ïn\u008aZ\u0095ö\u0019\u0099õ\u008c¨Ê\u0019¢L©#\u0099¯".length();
               var6 = 16;
               var5 = -1;
            }

            ++var5;
            var12 = var7.substring(var5, var5 + var6);
            var10001 = 0;
         }
      }
   }

   public static void Q(int[] var0) {
      q = var0;
   }

   public static int[] B() {
      return q;
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
