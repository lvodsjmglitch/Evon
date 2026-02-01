package club.evon;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1297;
import net.minecraft.class_2960;
import org.json.JSONException;

public final class ge extends gQ {
   private final t L;
   private final i<_z> f;
   private final c C;
   private final a Z;
   private static final class_2960 X;
   private static class_1297 W;
   private static final long a = ds.a(-9039634628400386717L, 4381480740343462356L, MethodHandles.lookup().lookupClass()).a(60643695010173L);
   private static final String[] b;
   private static final long[] c;
   private static final Integer[] d;
   private static final Map g;

   public ge() {
      String[] var1 = b;
      super(var1[2], var1[5], zo.RENDER);
      this.L = new t(var1[4], true);
      this.f = new i(var1[7], _z.THEMED);
      this.C = new c(var1[0], new Color(172, 13, 61));
      this.Z = new a(var1[3], 75.0D, 15.0D, 100.0D, 5.0D);
      this.g(new B[]{this.L, this.f, this.C, this.Z});
      this.C.q(() -> {
         long var1 = a ^ 83064561445069L;

         boolean var10000;
         try {
            if (this.f.J() == _z.CUSTOM) {
               var10000 = true;
               return var10000;
            }
         } catch (JSONException var3) {
            throw a(var3);
         }

         var10000 = false;
         return var10000;
      });
   }

   @_S
   private void u(vX param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void i(_5 param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void o(S param1) {
      // $FF: Couldn't be decompiled
   }

   public static class_1297 m() {
      return W;
   }

   public static void i(class_1297 entity) {
      W = var0;
   }

   static {
      long var11 = a ^ 69114584160547L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "Û\u008e\n!\u009d7ó\u008c\bgZ$\r\u0090\u008bS#\b'\u0095±\u001bØDÓÕ\bÖ`û\u0088hÇp0\u0010S¾ñ\u0006R\u0015HrÃ\u008f¹\u0011>Þ©Ï T¯d\u000eì\u0084b%{P\u008d\u0003-\u0016þ f+w\u0090\u008d®¡Xûå\f°\u007fGÐÊ";
      int var19 = "Û\u008e\n!\u009d7ó\u008c\bgZ$\r\u0090\u008bS#\b'\u0095±\u001bØDÓÕ\bÖ`û\u0088hÇp0\u0010S¾ñ\u0006R\u0015HrÃ\u008f¹\u0011>Þ©Ï T¯d\u000eì\u0084b%{P\u008d\u0003-\u0016þ f+w\u0090\u008d®¡Xûå\f°\u007fGÐÊ".length();
      char var16 = '\b';
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var23 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var23.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "\u0003\u0002T\u0010Ò\u001d\u0012g<ÿB¶`\ns\u0014";
                  int var5 = "\u0003\u0002T\u0010Ò\u001d\u0012g<ÿB¶`\ns\u0014".length();
                  int var2 = 0;

                  do {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var26 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var30 = true;
                     var6[var26] = var10004;
                  } while(var2 < var5);

                  c = var6;
                  d = new Integer[2];
                  String[] var22 = b;
                  X = class_2960.method_60655(var22[1], var22[6]);
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "Üô\u009eV\u009f\u008cëÚg}\u008b\u0019Õt²ÌÍbneGäö\u0007\u0010\u0081hh3\u007f/0ÓïÜE¬\u009cÿ\u0003,";
               var19 = "Üô\u009eV\u009f\u008cëÚg}\u008b\u0019Õt²ÌÍbneGäö\u0007\u0010\u0081hh3\u007f/0ÓïÜE¬\u009cÿ\u0003,".length();
               var16 = 24;
               var15 = -1;
            }

            ++var15;
            var23 = var17.substring(var15, var15 + var16);
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7901;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = c[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("club/evon/ge", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("club/evon/ge" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
