package club.evon.mixins;

import club.evon.RotationManager;
import net.minecraft.class_1297;
import net.minecraft.class_4050;
import net.minecraft.class_4184;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_4184.class})
public abstract class CameraMixin {
   @Shadow
   private boolean field_18719;
   @Shadow
   private float field_18718;
   @Shadow
   private float field_18717;
   @Shadow
   private float field_18721;
   @Shadow
   private float field_18722;
   @Unique
   private class_4050 prevPose;

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @Redirect(
      method = {"method_19321(Lnet/minecraft/class_1922;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_5705(F)F"
)
   )
   private float redirectYaw(class_1297 var1, float var2) {
      return RotationManager.getRotationHelper().getYaw(var1.method_5705(var2));
   }

   @Redirect(
      method = {"method_19321(Lnet/minecraft/class_1922;Lnet/minecraft/class_1297;ZZF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_5695(F)F"
)
   )
   private float redirectPitch(class_1297 var1, float var2) {
      return RotationManager.getRotationHelper().getPitch(var1.method_5695(var2));
   }

   @Shadow
   public abstract class_1297 method_19331();

   @Inject(
      method = {"method_19317()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_4184;field_18722:F",
   opcode = 181
)},
      cancellable = true
   )
   private void modifyCameraY(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
