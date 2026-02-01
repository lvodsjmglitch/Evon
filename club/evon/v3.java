package club.evon;

import net.minecraft.class_2596;

public final class PacketReceiveEvent extends Event {
   private final class_2596<?> packet;
   private static gQ[] data;

   public class_2596<?> getPacket() {
      return this.packet;
   }

   public PacketReceiveEvent(class_2596<?> packet) {
      this.packet = packet;
   }

   public static void setData(gQ[] data) {
      PacketReceiveEvent.data = data;
   }

   public static gQ[] getData() {
      return data;
   }

   static {
      if (getData() == null) {
         setData(new gQ[3]);
      }

   }
}
