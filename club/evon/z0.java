package club.evon;

import net.minecraft.class_243;

public final class VelocityUpdateEvent {
   private final float speed;
   private final class_243 movementInput;

   public float getSpeed() {
      return this.speed;
   }

   public class_243 getMovementInput() {
      return this.movementInput;
   }

   public VelocityUpdateEvent(float speed, class_243 movementInput) {
      this.speed = speed;
      this.movementInput = movementInput;
   }
}
