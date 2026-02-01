package club.evon;

import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public final class _J {
   private final Z D = new Z();
   private double Q;
   private double s;
   private double o;
   private int Z;
   private yn d;
   private static int T;
   private static final long a = ds.a(-1386605988870332117L, -5136400215793006666L, MethodHandles.lookup().lookupClass()).a(95496031201189L);

   public _J(int duration, double targetValue, yn easing) {
      this.Z = var1;
      this.o = var2;
      this.d = var4;
   }

   public Double y() {
      // $FF: Couldn't be decompiled
   }

   public void I() {
      // $FF: Couldn't be decompiled
   }

   public void u(double value) {
      this.N(var1);
      this.I();
   }

   public boolean K() {
      return this.D.o((long)this.Z);
   }

   public void N(double targetValue) {
      // $FF: Couldn't be decompiled
   }

   public void T() {
      long var1 = a ^ 56938172480950L;
      yn.B();
      this.s = this.Q;

      try {
         this.D.a();
         if (gQ.q() == null) {
            yn.Q(new int[5]);
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   public Z B() {
      return this.D;
   }

   public double K() {
      return this.s;
   }

   public double z() {
      return this.o;
   }

   public int U() {
      return this.Z;
   }

   public yn v() {
      return this.d;
   }

   public void F(double startValue) {
      this.s = var1;
   }

   public void l(int duration) {
      this.Z = var1;
   }

   public void g(yn easing) {
      this.d = var1;
   }

   public static void L(int var0) {
      T = var0;
   }

   public static int M() {
      return T;
   }

   public static int N() {
      int var0 = M();

      try {
         return var0 == 0 ? 1 : 0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      if (N() != 0) {
         L(91);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
