package club.evon.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_10034;
import net.minecraft.class_3881;
import net.minecraft.class_3882;
import net.minecraft.class_572;
import net.minecraft.class_583;
import net.minecraft.class_630;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({class_572.class})
public abstract class BipedEntityModelMixin<T extends class_10034> extends class_583<T> implements class_3881, class_3882 {
   @Final
   @Shadow
   public class_630 field_3398;

   private BipedEntityModelMixin(class_630 var1) {
      super(var1);
   }

   @WrapOperation(
      method = {"method_54131(Lnet/minecraft/class_630;Z)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_3532;method_15363(FFF)F"
)}
   )
   private float fixThirdPersonBlockRotation(float param1, float param2, float param3, Operation<Float> param4) {
      // $FF: Couldn't be decompiled
   }

   @WrapOperation(
      method = {"method_30155(Lnet/minecraft/class_10034;Lnet/minecraft/class_572$class_573;)V", "method_30154(Lnet/minecraft/class_10034;Lnet/minecraft/class_572$class_573;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_572;method_54131(Lnet/minecraft/class_630;Z)V"
)}
   )
   private void fixThirdPersonBlockPosition(class_572<?> param1, class_630 param2, boolean param3, Operation<Void> param4, @Local(argsOnly = true) T param5) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
