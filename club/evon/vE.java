package club.evon;

import net.minecraft.class_243;

public final class StepEvent extends Event {
   private final class_243 movement;

   public class_243 getMovement() {
      return this.movement;
   }

   public StepEvent(class_243 movement) {
      this.movement = movement;
   }
}
