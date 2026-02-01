package club.evon.mixins;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_746.class})
public interface ClientPlayerEntityAccessor {
   @Accessor("field_23093")
   void setInSneakingPose(boolean var1);

   @Accessor("field_3926")
   double getLastXClient();

   @Accessor("field_3940")
   double getLastYClient();

   @Accessor("field_3924")
   double getLastZClient();

   @Mutable
   @Accessor("field_3926")
   void setLastXClient(double var1);

   @Mutable
   @Accessor("field_3940")
   void setLastYClient(double var1);

   @Mutable
   @Accessor("field_3924")
   void setLastZClient(double var1);

   @Mutable
   @Accessor("field_3941")
   void setLastYawClient(float var1);

   @Mutable
   @Accessor("field_3925")
   void setLastPitchClient(float var1);

   @Mutable
   @Accessor("field_3920")
   void setLastOnGround(boolean var1);

   @Accessor("field_3941")
   float getLastYawClient();

   @Accessor("field_3925")
   float getLastPitchClient();

   @Accessor("field_3920")
   boolean isLastOnGround();

   @Accessor("field_3919")
   boolean getLastSprinting();

   @Accessor("field_3923")
   int getTicksSinceLastPositionPacketSent();

   @Mutable
   @Accessor("field_3919")
   void setLastSprinting(boolean var1);

   @Mutable
   @Accessor("field_3923")
   void setTicksSinceLastPositionPacketSent(int var1);

   @Invoker("method_3136")
   void callSendMovementPackets();

   @Invoker("method_48300")
   boolean callCanStartSprinting();
}
