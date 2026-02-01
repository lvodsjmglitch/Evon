package club.evon.mixins;

import net.minecraft.class_315;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_315.class})
public class GameOptionsMixin {
   @Inject(
      method = {"method_57703()I"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void setMenuBackgroundBlurrinessValue(CallbackInfoReturnable<Integer> callbackInfo) {
      var1.setReturnValue(5);
   }
}
