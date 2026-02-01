package club.evon.mixins;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.class_10197;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4722;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_10197.class})
public abstract class EquipmentRendererMixin {
   @WrapOperation(
      method = {"method_64078(Lnet/minecraft/class_10186$class_10190;Lnet/minecraft/class_5321;Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_1799;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;II)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1921;method_25448(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1921;"
)}
   )
   private class_1921 evon$useOldArmorDamageLayer(class_2960 param1, Operation<class_1921> param2) {
      // $FF: Couldn't be decompiled
   }

   @ModifyArg(
      method = {"method_64078(Lnet/minecraft/class_10186$class_10190;Lnet/minecraft/class_5321;Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_1799;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_11785;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"
),
      index = 5
   )
   private int evon$modifyArmorUv(int var1) {
      return this.evon$applyOldDamageUv(var1);
   }

   @Redirect(
      method = {"method_64078(Lnet/minecraft/class_10186$class_10190;Lnet/minecraft/class_5321;Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_1799;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_2960;II)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4722;method_48480(Z)Lnet/minecraft/class_1921;"
)
   )
   private class_1921 evon$oldTrimLayer(boolean var1) {
      return class_1921.method_28116(class_4722.field_42071);
   }

   @Unique
   private int evon$applyOldDamageUv(int param1) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
