package club.evon;

import net.minecraft.class_2338;
import net.minecraft.class_2350;

public class v0 {
   private final class_2338 t;
   private double Y;

   private v0(class_2338 var1) {
      this.t = var1;
      this.I();
   }

   private v0 q(class_2350 var1) {
      return new v0(this.t.method_10093(var1));
   }

   private void I() {
      this.Y = Jd.X(this.t);
   }

   public class_2338 J() {
      return this.t;
   }
}
