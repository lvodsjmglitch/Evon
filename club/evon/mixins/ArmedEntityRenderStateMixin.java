package club.evon.mixins;

import net.minecraft.class_10426;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_10426.class})
public final class ArmedEntityRenderStateMixin {
   @Redirect(
      method = {"method_65577(Lnet/minecraft/class_1309;Lnet/minecraft/class_10426;Lnet/minecraft/class_10442;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_61420(Lnet/minecraft/class_1306;)Lnet/minecraft/class_1799;"
)
   )
   private static class_1799 hookGetStackInArm(class_1309 param0, class_1306 param1) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
