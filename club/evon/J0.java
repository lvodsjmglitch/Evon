package club.evon;

import net.minecraft.class_3965;

public final class BlockPlaceEvent {
   private final class_3965 blockHitResult;

   public class_3965 getBlockHitResult() {
      return this.blockHitResult;
   }

   public BlockPlaceEvent(class_3965 blockHitResult) {
      this.blockHitResult = blockHitResult;
   }
}
