package club.evon;

import net.minecraft.class_2596;

public final class v3 extends vt {
   private final class_2596<?> B;
   private static gQ[] X;

   public class_2596<?> d() {
      return this.B;
   }

   public v3(class_2596<?> packet) {
      this.B = var1;
   }

   public static void M(gQ[] var0) {
      X = var0;
   }

   public static gQ[] Y() {
      return X;
   }

   static {
      if (Y() == null) {
         M(new gQ[3]);
      }

   }
}
