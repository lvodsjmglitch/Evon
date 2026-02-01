package club.evon;

public final class GameLoopEvent {
   private final boolean isTick;

   public GameLoopEvent(boolean isTick) {
      this.isTick = isTick;
   }

   public boolean isTick() {
      return this.isTick;
   }
}
