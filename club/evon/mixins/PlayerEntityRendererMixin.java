package club.evon.mixins;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_591;
import net.minecraft.class_742;
import net.minecraft.class_922;
import net.minecraft.class_5617.class_5618;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_1007.class})
public abstract class PlayerEntityRendererMixin extends class_922<class_742, class_10055, class_591> {
   private PlayerEntityRendererMixin(class_5618 var1, class_591 var2, float var3) {
      super(var1, var2, var3);
   }

   @Redirect(
      method = {"method_4210(Lnet/minecraft/class_11890;Lnet/minecraft/class_1799;Lnet/minecraft/class_1268;)Lnet/minecraft/class_572$class_573;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1799;method_7960()Z"
)
   )
   private static boolean cancelShieldPose(class_1799 param0, @Local(argsOnly = true) class_1268 param1) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
