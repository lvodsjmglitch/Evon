package club.evon;

import net.minecraft.class_2596;

public class PacketSendEvent extends Event {
   private class_2596<?> packet;

   public class_2596<?> getPacket() {
      return this.packet;
   }

   public void setPacket(class_2596<?> packet) {
      this.packet = packet;
   }

   public PacketSendEvent(class_2596<?> packet) {
      this.packet = packet;
   }
}
