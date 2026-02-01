package club.evon;

import net.minecraft.class_332;

public final class RenderEvent implements EventMarker {
   private final class_332 drawContext;
   private final float tickDelta;

   public class_332 getDrawContext() {
      return this.drawContext;
   }

   public float getTickDelta() {
      return this.tickDelta;
   }

   public RenderEvent(class_332 drawContext, float tickDelta) {
      this.drawContext = drawContext;
      this.tickDelta = tickDelta;
   }
}
