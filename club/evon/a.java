package club.evon;

import net.minecraft.class_3532;

public final class a extends B<Double> {
   private final Double N;
   private final Double q;
   private final Double l;
   private static gQ[] g;

   public a(String name, double defaultValue, double minimumValue, double maximumValue, double incrementalValue) {
      super(var1, var2);
      this.N = var4;
      this.q = var6;
      this.l = var8;
   }

   public void g(Double value) {
      double var2 = 1.0D / this.l;
      super.P((double)Math.round(class_3532.method_15350(var1, this.N, this.q) * var2) / var2);
   }

   public Double J() {
      return this.N;
   }

   public Double j() {
      return this.q;
   }

   public Double B() {
      return this.l;
   }

   public static void R(gQ[] var0) {
      g = var0;
   }

   public static gQ[] X() {
      return g;
   }

   static {
      if (X() != null) {
         R(new gQ[2]);
      }

   }
}
