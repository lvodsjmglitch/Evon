package club.evon;

import net.hypixel.data.type.ServerType;
import net.hypixel.modapi.HypixelModAPI;
import net.hypixel.modapi.packet.impl.clientbound.event.ClientboundLocationPacket;
import org.jetbrains.annotations.Nullable;

public final class yE {
   private static final yE y = new yE();
   private boolean v;
   @Nullable
   private vh L;
   @Nullable
   private vh x;

   public yE() {
      HypixelModAPI var1 = HypixelModAPI.getInstance();
      var1.subscribeToEventPacket(ClientboundLocationPacket.class);
      var1.createHandler(ClientboundLocationPacket.class, this::I);
   }

   public static yE i() {
      return y;
   }

   @Nullable
   public vh e() {
      return this.L;
   }

   public void B(@Nullable vh currentLocation) {
      this.L = var1;
   }

   @Nullable
   public vh M() {
      return this.x;
   }

   private void I(ClientboundLocationPacket var1) {
      this.x = this.L;
      this.L = new vh(var1.getServerName(), (ServerType)var1.getServerType().orElse((Object)null), (String)var1.getLobbyName().orElse((Object)null), (String)var1.getMode().orElse((Object)null), (String)var1.getMap().orElse((Object)null));
   }
}
