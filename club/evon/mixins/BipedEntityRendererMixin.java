package club.evon.mixins;

import club.evon._P;
import net.minecraft.class_10034;
import net.minecraft.class_10442;
import net.minecraft.class_1309;
import net.minecraft.class_909;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_909.class})
public final class BipedEntityRendererMixin {
   @Inject(
      method = {"method_62461(Lnet/minecraft/class_1309;Lnet/minecraft/class_10034;FLnet/minecraft/class_10442;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_10426;method_65577(Lnet/minecraft/class_1309;Lnet/minecraft/class_10426;Lnet/minecraft/class_10442;)V",
   shift = Shift.AFTER
)}
   )
   private static void updateEntityField(class_1309 var0, class_10034 var1, float var2, class_10442 var3, CallbackInfo var4) {
      ((_P)var1).evon$setEntity(var0);
   }
}
