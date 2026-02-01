package club.evon;

import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_265;
import net.minecraft.class_2680;

public final class PostMovementEvent extends Event {
   private class_2680 blockState;
   private class_2338 blockPos;
   private class_265 shape;
   private final List<class_265> extraVoxelShapes;

   public class_2680 getBlockState() {
      return this.blockState;
   }

   public class_2338 getBlockPos() {
      return this.blockPos;
   }

   public class_265 getShape() {
      return this.shape;
   }

   public List<class_265> getExtraVoxelShapes() {
      return this.extraVoxelShapes;
   }

   public void setBlockState(class_2680 blockState) {
      this.blockState = blockState;
   }

   public void setBlockPos(class_2338 blockPos) {
      this.blockPos = blockPos;
   }

   public void setShape(class_265 shape) {
      this.shape = shape;
   }

   public PostMovementEvent(class_2680 blockState, class_2338 blockPos, class_265 shape, List<class_265> extraVoxelShapes) {
      this.blockState = blockState;
      this.blockPos = blockPos;
      this.shape = shape;
      this.extraVoxelShapes = extraVoxelShapes;
   }
}
