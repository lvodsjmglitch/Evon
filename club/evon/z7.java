package club.evon;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;

public final class z7 {
   private final long a;
   private final String v;
   private final ByteBuffer C;
   public static boolean h;
   private static String l;
   private static final long b = ds.a(-1684887590496467845L, 8094525656688395030L, MethodHandles.lookup().lookupClass()).a(205488354545760L);
   private static final long[] c;
   private static final Integer[] d;
   private static final Map e = new HashMap(13);

   public z7(String name, String filePath) {
      // $FF: Couldn't be decompiled
   }

   public void U(String text, float x, float y, float size, int color) {
      this.a(var1, var2, var3, var4, var5, false, 0.0F, 9);
   }

   public void q(String text, float x, float y, float size, int color, boolean shadow) {
      this.a(var1, var2, var3, var4, var5, var6, 0.0F, 9);
   }

   public void y(String text, float x, float y, float size, int color, boolean shadow, int alignment) {
      this.a(var1, var2, var3, var4, var5, var6, 0.0F, var7);
   }

   public void a(String text, float x, float y, float size, int color, boolean shadow, float bloomAmount, int alignment) {
      long var9 = b ^ 39050120792836L;
      String var11 = r();

      int var10000;
      label54: {
         try {
            var10000 = h;
            if (var11 == null) {
               break label54;
            }

            if (var10000 != 0) {
               return;
            }
         } catch (RuntimeException var17) {
            throw a(var17);
         }

         var1 = gi.u(var1);
         NanoVG.nvgFontFace(this.a, this.v);
         NanoVG.nvgFontSize(this.a, var4);
         NanoVG.nvgTextAlign(this.a, var8);
         float var19;
         var10000 = (var19 = var7 - 0.0F) == 0.0F ? 0 : (var19 < 0.0F ? -1 : 1);
      }

      label44: {
         label43: {
            try {
               if (var11 == null) {
                  break label44;
               }

               if (var10000 <= 0) {
                  break label43;
               }
            } catch (RuntimeException var16) {
               throw a(var16);
            }

            int var12 = var5 >> 24 & 255;
            int var13 = var12 << 24 | var5 & true.i<invokedynamic>(10650, 2507661905515371012L ^ var9);
            NVGColor var14 = y8.V(var13);
            NanoVG.nvgFontBlur(this.a, var7);
            NanoVG.nvgFillColor(this.a, var14);
            NanoVG.nvgText(this.a, var2, var3, var1);
            var14.free();
            NanoVG.nvgFontBlur(this.a, 0.0F);
         }

         var10000 = var6;
      }

      NVGColor var18;
      label35: {
         label34: {
            try {
               if (var11 == null) {
                  break label35;
               }

               if (var10000 == 0) {
                  break label34;
               }
            } catch (RuntimeException var15) {
               throw a(var15);
            }

            var18 = y8.V((var5 & true.i<invokedynamic>(15734, 6594561646322077418L ^ var9)) >> 2 | var5 & true.i<invokedynamic>(10525, 4247450479474432640L ^ var9));
            NanoVG.nvgFillColor(this.a, var18);
            NanoVG.nvgText(this.a, var2 + 0.5F, var3 + 0.5F, var1);
            var18.free();
         }

         var10000 = var5;
      }

      var18 = y8.V(var10000);
      NanoVG.nvgFillColor(this.a, var18);
      NanoVG.nvgText(this.a, var2, var3, var1);
      var18.free();
   }

   public float C(String text, float size, int alignment) {
      // $FF: Couldn't be decompiled
   }

   public float y(String text, float size) {
      return this.C(var1, var2, 9);
   }

   public float q(String text, float size, int alignment) {
      // $FF: Couldn't be decompiled
   }

   public float i(String text, float size) {
      // $FF: Couldn't be decompiled
   }

   public static void A(String var0) {
      l = var0;
   }

   public static String r() {
      return l;
   }

   static {
      long var0 = b ^ 98495648254539L;
      A("Zd6Az");
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var8 = new long[3];
      int var5 = 0;
      String var6 = "Ôk\u007fÁ\u0095Tç]Å\u00ad[]¤íjì\u001e¥¸¿8\u0014Êú";
      int var7 = "Ôk\u007fÁ\u0095Tç]Å\u00ad[]¤íjì\u001e¥¸¿8\u0014Êú".length();
      int var4 = 0;

      do {
         int var10001 = var4;
         var4 += 8;
         byte[] var9 = var6.substring(var10001, var4).getBytes("ISO-8859-1");
         var10001 = var5++;
         long var10 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
         byte[] var12 = var2.doFinal(new byte[]{(byte)((int)(var10 >>> 56)), (byte)((int)(var10 >>> 48)), (byte)((int)(var10 >>> 40)), (byte)((int)(var10 >>> 32)), (byte)((int)(var10 >>> 24)), (byte)((int)(var10 >>> 16)), (byte)((int)(var10 >>> 8)), (byte)((int)var10)});
         long var10004 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
         boolean var13 = true;
         var8[var10001] = var10004;
      } while(var4 < var7);

      c = var8;
      d = new Integer[3];
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20389;
      if (d[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = c[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("club/evon/z7", var14);
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
         throw new RuntimeException("club/evon/z7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
