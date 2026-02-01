package club.evon;

public final class ItemUseCooldownEvent extends Event {
   private int cooldown;

   public int getCooldown() {
      return this.cooldown;
   }

   public void setCooldown(int coolDown) {
      this.cooldown = coolDown;
   }

   public ItemUseCooldownEvent(int coolDown) {
      this.cooldown = coolDown;
   }
}
