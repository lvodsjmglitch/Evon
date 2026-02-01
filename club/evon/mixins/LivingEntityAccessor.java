package club.evon.mixins;

import net.minecraft.class_1309;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_1309.class})
public interface LivingEntityAccessor {
   @Mutable
   @Accessor("field_6222")
   void setItemUseTimeLeft(int var1);

   @Accessor("field_6282")
   boolean isJumping();

   @Invoker("method_61428")
   void callTravelMidAir(class_243 var1);

   @Invoker("method_6106")
   float callGetJumpVelocity();

   @Accessor("field_6228")
   void setJumpingCooldown(int var1);
}
