package club.evon.mixins;

import club.evon.JF;
import club.evon.JV;
import club.evon.vD;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_11659;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_759.class})
public abstract class HeldItemRendererMixin {
   @Shadow
   private class_1799 field_4047;
   @Shadow
   private float field_4043;

   @Shadow
   protected abstract void method_3217(class_4587 var1, class_1306 var2, float var3);

   @Inject(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4587;method_22903()V",
   shift = Shift.AFTER
)}
   )
   private void hookRenderFirstPersonItem(class_742 param1, float param2, float param3, class_1268 param4, float param5, class_1799 param6, float param7, class_4587 param8, class_11659 param9, int param10, CallbackInfo param11) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hideShield(class_742 param1, float param2, float param3, class_1268 param4, float param5, class_1799 param6, float param7, class_4587 param8, class_11659 param9, int param10, CallbackInfo param11) {
      // $FF: Couldn't be decompiled
   }

   @ModifyArg(
      method = {"method_3220()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_3532;method_15363(FFF)F",
   ordinal = 2
),
      index = 0
   )
   private float modifyMainHandEquipProgress(float param1, @Local(ordinal = 0) class_1799 param2) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_3220()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_7261(F)F"
)
   )
   private float redirectGetAttackCooldown(class_746 var1, float var2) {
      return ((JF)var1).evon$getVisualAttackCooldownProgress(var2);
   }

   @ModifyArg(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_3224(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V",
   ordinal = 3
),
      index = 2
   )
   private float applyEquipOffset(float param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V",
   ordinal = 1
)}
   )
   private void applySwordBlockingTransformation(class_742 param1, float param2, float param3, class_1268 param4, float param5, class_1799 param6, float param7, class_4587 param8, class_11659 param9, int param10, CallbackInfo param11) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_65816(FFLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void cancelSwingArm(float param1, float param2, class_4587 param3, int param4, class_1306 param5, CallbackInfo param6) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1799;method_7909()Lnet/minecraft/class_1792;"
)
   )
   private class_1792 cancelBlockTransformation(class_1799 param1, @Local(argsOnly = true) class_4587 param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_3224(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V",
   ordinal = 2,
   shift = Shift.AFTER
)}
   )
   private void applyEatingAndDrinkingOffset(class_742 param1, float param2, float param3, class_1268 param4, float param5, class_1799 param6, float param7, class_4587 param8, class_11659 param9, int param10, CallbackInfo param11) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3228(Lnet/minecraft/class_742;FFLnet/minecraft/class_1268;FLnet/minecraft/class_1799;FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_3224(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V",
   ordinal = 4,
   shift = Shift.AFTER
)}
   )
   private void applyBowOffset(class_742 param1, float param2, float param3, class_1268 param4, float param5, class_1799 param6, float param7, class_4587 param8, class_11659 param9, int param10, CallbackInfo param11) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_5705(F)F"
)
   )
   private float redirectItemYaw(class_746 var1, float var2) {
      return JV.M().d(var1.method_5705(var2));
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_5695(F)F"
)
   )
   private float redirectItemPitch(class_746 var1, float var2) {
      return JV.M().Q(var1.method_5695(var2));
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_746;field_3931:F",
   opcode = 180
)
   )
   private float redirectItemLastRenderYaw(class_746 var1) {
      return JV.M().v(var1.field_3931);
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_746;field_3914:F",
   opcode = 180
)
   )
   private float redirectItemLastRenderPitch(class_746 var1) {
      return JV.M().m(var1.field_3914);
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_746;field_3932:F",
   opcode = 180
)
   )
   private float redirectItemRenderYaw(class_746 var1) {
      return JV.M().b(var1.field_3932);
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_746;field_3916:F",
   opcode = 180
)
   )
   private float redirectItemRenderPitch(class_746 var1) {
      return JV.M().U(var1.field_3916);
   }

   @Redirect(
      method = {"method_3220()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"
)
   )
   private class_1799 getMainHandStack(class_746 var1) {
      return vD.a().q(var1);
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
