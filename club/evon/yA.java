package club.evon;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GL33;

public final class yA {
   private static final int[] x;
   private static final int[] r;
   private static int w;
   private static int R;
   private static int A;
   private static int W;
   private static int I;
   private static int f;
   private static final Map<Integer, Boolean> g;
   private static final Map<Integer, Integer> q;
   private static int P;
   private static int N;
   private static int t;
   private static int s;
   private static int M;
   private static int e;
   private static final int[] X;
   private static final int[] T;
   private static final long a = ds.a(-8613179827614970658L, -8789608914223750868L, MethodHandles.lookup().lookupClass()).a(96895019453676L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   private yA() {
   }

   public static void i() {
      long var0 = a ^ 38162974200000L;
      w = GL32.glGetInteger(true.u<invokedynamic>(2437, 5946646867354010773L ^ var0));
      R = GL32.glGetInteger(true.u<invokedynamic>(11999, 4893126753104782286L ^ var0));
      A = GL32.glGetInteger(true.u<invokedynamic>(17801, 7823325491394676873L ^ var0));
      W = GL32.glGetInteger(true.u<invokedynamic>(10483, 6327013691170121192L ^ var0));
      f = GL32.glGetInteger(true.u<invokedynamic>(13034, 697729725499211760L ^ var0));
      I = GL32.glGetInteger(true.u<invokedynamic>(19565, 130327712949961056L ^ var0));
      Arrays.stream(x).forEach((var0x) -> {
         g.put(var0x, GL32.glIsEnabled(var0x));
      });
      Arrays.stream(r).forEach((var0x) -> {
         q.put(var0x, GL32.glGetInteger(var0x));
      });
      P = GL32.glGetInteger(true.u<invokedynamic>(3132, 4486533184416235817L ^ var0));
      N = GL32.glGetInteger(true.u<invokedynamic>(22969, 724211873218598074L ^ var0));
      t = GL32.glGetInteger(true.u<invokedynamic>(9471, 1066406179001952763L ^ var0));
      s = GL32.glGetInteger(true.u<invokedynamic>(8947, 7184920994182033404L ^ var0));
      M = GL32.glGetInteger(true.u<invokedynamic>(16781, 7574657214840441999L ^ var0));
      e = GL32.glGetInteger(true.u<invokedynamic>(6839, 824579680201398194L ^ var0));
      GL32.glGetIntegerv(2978, X);
      GL32.glGetIntegerv(3088, T);
   }

   public static void V() {
      long var0 = a ^ 119525995281300L;
      GL32.glUseProgram(R);
      GL32.glBindTexture(3553, A);
      GL33.glBindSampler(0, W);
      GL32.glActiveTexture(w);
      GL32.glBindVertexArray(I);
      GL32.glBindBuffer(true.u<invokedynamic>(6538, 2946919902463885258L ^ var0), f);
      GL32.glBlendEquationSeparate(M, e);
      GL32.glBlendFuncSeparate(P, N, t, s);
      Arrays.stream(x).forEach((param0) -> {
         // $FF: Couldn't be decompiled
      });
      Arrays.stream(r).forEach((var0x) -> {
         GL32.glPixelStorei(var0x, (Integer)q.get(var0x));
      });
      GL32.glViewport(X[0], X[1], X[2], X[3]);
      GL32.glScissor(T[0], T[1], T[2], T[3]);
   }

   static {
      long var11 = a ^ 101199292061339L;
      d = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long[] var6 = new long[27];
      int var3 = 0;
      String var4 = "ù\"Y\u008bMu[Ú^\u0087${(ýÜ\u009d\u000f\u0019²®¥(\u0001ç½!\u0092ÿà\u009cÁÉÐAvxà(D\u0093ÆÀé\n6þ qò(óÛ¯Ð\u00ad\u001e¦ZÜ\u0006\u000eº\u00113º²àªp\u009aí\u000bZ\u0015\u0003GÈÄ_ßR\u008fêÕyü&É\u000b¬\u008b¯\u009dv\u001a5Î\u0082~\u009b9&^¨í¿\t\u0084W;\u0098\u0004\u009e\u0001\u000eeû\u001ey-íïk\u0080?û©¯³\u0090æ\u0014;rÍ\u0003TÕ\u0000Lô3\u0086+¹æë[\u007f³58S\u0011~6\u001b\u0096\u001a¿eòB´\u00191\u0005Ûût\u0001Vîd\u00947L7Á\u0011!þ&¿×\u0095*\u00870¦²I\u008dôwu\tÈ{¹";
      int var5 = "ù\"Y\u008bMu[Ú^\u0087${(ýÜ\u009d\u000f\u0019²®¥(\u0001ç½!\u0092ÿà\u009cÁÉÐAvxà(D\u0093ÆÀé\n6þ qò(óÛ¯Ð\u00ad\u001e¦ZÜ\u0006\u000eº\u00113º²àªp\u009aí\u000bZ\u0015\u0003GÈÄ_ßR\u008fêÕyü&É\u000b¬\u008b¯\u009dv\u001a5Î\u0082~\u009b9&^¨í¿\t\u0084W;\u0098\u0004\u009e\u0001\u000eeû\u001ey-íïk\u0080?û©¯³\u0090æ\u0014;rÍ\u0003TÕ\u0000Lô3\u0086+¹æë[\u007f³58S\u0011~6\u001b\u0096\u001a¿eòB´\u00191\u0005Ûût\u0001Vîd\u00947L7Á\u0011!þ&¿×\u0095*\u00870¦²I\u008dôwu\tÈ{¹".length();
      int var2 = 0;

      label23:
      while(true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var13 = var6;
         var10001 = var3++;
         long var14 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
         byte var16 = -1;

         while(true) {
            long var8 = var14;
            byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
            long var18 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
            switch(var16) {
            case 0:
               var13[var10001] = var18;
               if (var2 >= var5) {
                  b = var6;
                  c = new Integer[27];
                  x = new int[]{3042, 3058, 2884, true.u<invokedynamic>(11623, 4517699572931192362L ^ var11), 2929, 3024, true.u<invokedynamic>(9687, 6450324148583853709L ^ var11), 2848, true.u<invokedynamic>(1531, 1807953430532247225L ^ var11), true.u<invokedynamic>(4809, 5149514706708027781L ^ var11), 10754, 10753, 2881, true.u<invokedynamic>(31635, 637988098861052102L ^ var11), true.u<invokedynamic>(24544, 78585401705665714L ^ var11), true.u<invokedynamic>(7809, 3046518719271491036L ^ var11), true.u<invokedynamic>(3819, 820246747859895735L ^ var11), true.u<invokedynamic>(25093, 7850426335940913493L ^ var11), true.u<invokedynamic>(7514, 5581207742028174857L ^ var11), 3089, 2960};
                  r = new int[]{3328, 3329, 3330, true.u<invokedynamic>(17899, 4548392654486802106L ^ var11), 3332, 3331, true.u<invokedynamic>(25506, 5300106157861415157L ^ var11), 3333, 3312, 3313, 3314, true.u<invokedynamic>(28499, 757260621016540186L ^ var11), 3316, 3315, true.u<invokedynamic>(19453, 470625371423342773L ^ var11), 3317};
                  w = 0;
                  R = 0;
                  A = 0;
                  W = 0;
                  I = 0;
                  f = 0;
                  g = new HashMap();
                  q = new HashMap();
                  P = 0;
                  N = 0;
                  t = 0;
                  s = 0;
                  M = 0;
                  e = 0;
                  X = new int[4];
                  T = new int[4];
                  return;
               }
               break;
            default:
               var13[var10001] = var18;
               if (var2 < var5) {
                  continue label23;
               }

               var4 = "ë\u0087mµ/I\u009f\u000149oà\u0019\u009e®\b";
               var5 = "ë\u0087mµ/I\u009f\u000149oà\u0019\u009e®\b".length();
               var2 = 0;
            }

            var10001 = var2;
            var2 += 8;
            var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
            var13 = var6;
            var10001 = var3++;
            var14 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
            var16 = 0;
         }
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25115;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("club/evon/yA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
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
         throw new RuntimeException("club/evon/yA" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
