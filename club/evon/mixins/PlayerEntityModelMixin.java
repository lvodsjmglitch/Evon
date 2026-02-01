package club.evon.mixins;

import net.minecraft.class_10055;
import net.minecraft.class_591;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin({class_591.class})
public final class PlayerEntityModelMixin {
   @ModifyVariable(
      method = {"method_62110(Lnet/minecraft/class_10055;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_10055 modifyThirdPersonRenderState(class_10055 param1) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
