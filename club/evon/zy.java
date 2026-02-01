package club.evon;

import club.evon.launch.LaunchProperties;
import club.evon.launch.Loader;
import club.evon.launch.hidden.Hidden0;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import org.json.JSONException;

public final class zy {
   private static zy z;
   private static yh l;
   private static X x;
   private static final Executor g;
   private static final Semaphore h;
   private zv B;
   private yL X;
   private Jt L;
   private zB Q;
   private zn M;
   private v5 T;
   private JK D;
   private q p;
   private JR t;
   private static String i;
   private static final long a;
   private static final String[] b;
   private static final long c;

   private zy() {
      this.d();
   }

   private native void d();

   public void m() {
      long var1 = a ^ 35765058982584L;
      boolean var10000 = ym.I();
      this.Q.r().b();
      boolean var3 = var10000;

      try {
         F.n().z();
         if (var3) {
            gQ.o(new gQ[3]);
         }

      } catch (JSONException var4) {
         throw a((Exception)var4);
      }
   }

   public static synchronized zy p() {
      long var0 = a ^ 40468979936592L;

      try {
         if (z == null) {
            new zy();
         }
      } catch (JSONException var2) {
         throw a((Exception)var2);
      }

      return z;
   }

   public zv s() {
      return this.B;
   }

   public yL q() {
      return this.X;
   }

   public Jt N() {
      return this.L;
   }

   public zB p() {
      return this.Q;
   }

   public zn H() {
      return this.M;
   }

   public v5 o() {
      return this.T;
   }

   public JK J() {
      return this.D;
   }

   public q Y() {
      return this.p;
   }

   public JR k() {
      return this.t;
   }

   public static yh g() {
      return l;
   }

   public static X g() {
      return x;
   }

   public static void s(X user) {
      x = var0;
   }

   public static Executor O() {
      return g;
   }

   public static Semaphore I() {
      return h;
   }

   // $FF: synthetic method
   private static void lambda$bootstrap$0(String var0) {
      l = new yh(LaunchProperties.username, var0);
   }

   static {
      Loader.attachNatives(4, zy.class);
      Hidden0.special_clinit_4_190(zy.class);
   }

   public static void f(String var0) {
      i = var0;
   }

   public static String E() {
      return i;
   }

   private static Exception a(Exception var0) {
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
