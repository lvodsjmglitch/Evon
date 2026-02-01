package club.evon;

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
import org.json.JSONException;

public final class gP extends gQ {
   private final i<vx> R;
   private final i<v6> M;
   private long w;
   private long v;
   private static final long a = ds.a(808974600185147880L, 4496837085969300501L, MethodHandles.lookup().lookupClass()).a(272180593492914L);
   private static final String[] b;
   private static final long c;
   private static final long[] d;
   private static final Long[] f;
   private static final Map g;

   public gP() {
      String[] var1 = b;
      super(var1[2], var1[0], zo.RENDER);
      this.R = new i(var1[1], vx.IRL);
      this.M = new i(var1[3], v6.NONE);
      this.g(new B[]{this.R, this.M});
   }

   @_S
   private void J(v3 param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void g(yN param1) {
      // $FF: Couldn't be decompiled
   }

   protected void H() {
      // $FF: Couldn't be decompiled
   }

   public boolean y() {
      return ((v6)this.M.J()).equals(v6.GAMMA);
   }

   private void p() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 110324125365924L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[4];
      int var23 = 0;
      String var22 = "ãQ5!ën\u008e\u009b\u0016Ö\u0093fÉ\u0095ØOúqÒ7©ªEq/f\u0093ßÝ²×²\u0010\u0091¾¯iþ°\u000fhß¿¬\nÚ @ý";
      int var24 = "ãQ5!ën\u008e\u009b\u0016Ö\u0093fÉ\u0095ØOúqÒ7©ªEq/f\u0093ßÝ²×²\u0010\u0091¾¯iþ°\u000fhß¿¬\nÚ @ý".length();
      char var21 = ' ';
      int var20 = -1;

      label66:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var34 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var34;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var16 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var13 = 4792879600793211400L;
                  byte[] var15 = var11.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                  long var36 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                  boolean var31 = true;
                  c = var36;
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "ÅË{pª\u008fÖ /!·Ü¥üRT\u000b~Ö\u001f\u0087^ÎWfj\u000bïÏNï\f\u0081õW¥\u0014~º\u0091óº\u001a¥\u0005ñÙ\u0019";
                  int var5 = "ÅË{pª\u008fÖ /!·Ü¥üRT\u000b~Ö\u001f\u0087^ÎWfj\u000bïÏNï\f\u0081õW¥\u0014~º\u0091óº\u001a¥\u0005ñÙ\u0019".length();
                  int var2 = 0;

                  label42:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var30 = var6;
                     var33 = var3++;
                     var36 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var8 = var36;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var39 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var33] = var39;
                           if (var2 >= var5) {
                              d = var6;
                              f = new Long[8];
                              return;
                           }
                           break;
                        default:
                           var30[var33] = var39;
                           if (var2 < var5) {
                              continue label42;
                           }

                           var4 = "¦¹F\u0093ö\u00adNÆë#ãLÈØGV";
                           var5 = "¦¹F\u0093ö\u00adNÆë#ãLÈØGV".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var30 = var6;
                        var33 = var3++;
                        var36 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var34;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label66;
               }

               var22 = "ë\u001d7qê|Z«²cû]rÀ\\x\u0010òu\u0099\u0084²~M\u00139\u0012Ave\u008aõp";
               var24 = "ë\u001d7qê|Z«²cû]rÀ\\x\u0010òu\u0099\u0084²~M\u00139\u0012Ave\u008aõp".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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

   private static long a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19947;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = d[var3];
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
            throw new RuntimeException("club/evon/gP", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static long a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = a(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("club/evon/gP" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
