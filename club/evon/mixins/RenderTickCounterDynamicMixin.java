package club.evon.mixins;

import club.evon.Jp;
import net.minecraft.class_9779.class_9781;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_9781.class})
public final class RenderTickCounterDynamicMixin {
   @Shadow
   private float field_51958;

   @Inject(
      method = {"method_60639(J)I"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_9779$class_9781;field_51962:J",
   opcode = 181
)}
   )
   private void onBeingRenderTick(long var1, CallbackInfoReturnable<Integer> var3) {
      this.field_51958 *= Jp.H().w();
   }
}
