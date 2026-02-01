package club.evon.mixins;

import club.evon.zy;
import net.minecraft.class_419;
import net.minecraft.class_9812;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_419.class})
public class DisconnectedScreenMixin {
   @Shadow
   @Final
   private class_9812 field_52131;

   @Inject(
      method = {"method_25426()V"},
      at = {@At("TAIL")}
   )
   private void checkBan(CallbackInfo var1) {
      zy.p().Y().b(this.field_52131);
   }

   @Inject(
      method = {"method_25426()V"},
      at = {@At("HEAD")}
   )
   private void injectDisconnectEvent(CallbackInfo var1) {
   }
}
