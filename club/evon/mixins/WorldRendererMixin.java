package club.evon.mixins;

import club.evon.z3;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_4604;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_761.class})
public final class WorldRendererMixin {
   @Redirect(
      method = {"method_62907()Lnet/minecraft/class_279;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_310;method_29611()Z"
)
   )
   private boolean redirectFabulousGraphics() {
      return true;
   }

   @Inject(
      method = {"method_22710(Lnet/minecraft/class_9922;Lnet/minecraft/class_9779;ZLnet/minecraft/class_4184;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V"},
      at = {@At(
   value = "INVOKE_ASSIGN",
   target = "Lnet/minecraft/class_761;method_32133(Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lnet/minecraft/class_243;)Lnet/minecraft/class_4604;",
   shift = Shift.AFTER
)}
   )
   private void evon$hookFrustum$render(CallbackInfo var1, @Local class_4604 var2) {
      z3.q(var2);
   }
}
