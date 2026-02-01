package club.evon;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;

public final class vS extends vt {
   private class_2680 s;
   private class_2338 W;
   private class_265 t;
   private final List<class_265> q;

   public class_2680 w() {
      return this.s;
   }

   public class_2338 X() {
      return this.W;
   }

   public class_265 N() {
      return this.t;
   }

   public List<class_265> j() {
      return this.q;
   }

   public void I(class_2680 blockState) {
      this.s = var1;
   }

   public void O(class_2338 blockPos) {
      this.W = var1;
   }

   public void f(class_265 shape) {
      this.t = var1;
   }

   public vS(class_2680 blockState, class_2338 blockPos, class_265 shape, List<class_265> extraVoxelShapes) {
      this.s = var1;
      this.W = var2;
      this.t = var3;
      this.q = var4;
   }
}
