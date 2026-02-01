package club.evon;

import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public final class v8 {
   private double W;
   private double r;
   private final double D;
   private final boolean O;
   private boolean M;
   private static final long a = ds.a(4654467361225359953L, -8020401843385128164L, MethodHandles.lookup().lookupClass()).a(77885243135431L);

   public v8(double deltaX, double deltaY, double sensitivityMultiplier, boolean unlockCursorRun) {
      long var8 = a ^ 121747458811304L;
      super();
      boolean var10000 = vi.q();
      this.D = var5;
      this.r = var3;
      boolean var10 = var10000;

      try {
         this.W = var1;
         this.O = var7;
         if (var10) {
            gQ.o(new gQ[1]);
         }

      } catch (JSONException var11) {
         throw a(var11);
      }
   }

   public double M() {
      return this.W;
   }

   public double L() {
      return this.r;
   }

   public double O() {
      return this.D;
   }

   public boolean C() {
      return this.O;
   }

   public boolean w() {
      return this.M;
   }

   public void k(double deltaX) {
      this.W = var1;
   }

   public void m(double deltaY) {
      this.r = var1;
   }

   public void H(boolean handled) {
      this.M = var1;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
