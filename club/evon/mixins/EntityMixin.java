package club.evon.mixins;

import club.evon.C;
import club.evon.StepEvent;
import club.evon.MinecraftHelper;
import club.evon.VelocityUpdateEvent;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1297.class})
public abstract class EntityMixin {
   @Shadow
   public float field_5982;
   @Shadow
   public float field_6004;
   @Shadow
   public boolean field_5976;
   @Shadow
   private class_1937 field_6002;

   @Shadow
   public abstract double method_23317();

   @Shadow
   public abstract double method_23318();

   @Shadow
   public abstract double method_23321();

   @Shadow
   public abstract float method_36454();

   @Shadow
   public abstract float method_36455();

   @Shadow
   public abstract boolean method_5869();

   @Final
   @Shadow
   public abstract class_238 method_5829();

   @Shadow
   public abstract class_243 method_18798();

   @Shadow
   public abstract boolean method_24828();

   @Shadow
   public abstract boolean method_5765();

   @Shadow
   public abstract class_243 method_73189();

   @Inject(
      method = {"method_36456(F)V"},
      at = {@At("HEAD")}
   )
   private void setYaw(float var1, CallbackInfo var2) {
      this.checkRotation();
   }

   @Inject(
      method = {"method_36457(F)V"},
      at = {@At("HEAD")}
   )
   private void setPitch(float var1, CallbackInfo var2) {
      this.checkRotation();
   }

   @Redirect(
      method = {"method_5724(FLnet/minecraft/class_243;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_36454()F"
)
   )
   private float redirectYaw(class_1297 param1) {
      // $FF: Couldn't be decompiled
   }

   @Unique
   private void checkRotation() {
      // $FF: Couldn't be decompiled
   }

   @ModifyExpressionValue(
      method = {"method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_66247()Z"
)}
   )
   private boolean fixFallDistanceCalculation(boolean var1) {
      try {
         return this == MinecraftHelper.getClient().field_1724 ? true : var1;
      } catch (JSONException var2) {
         throw a(var2);
      }
   }

   @Inject(
      method = {"method_17835(Lnet/minecraft/class_243;)Lnet/minecraft/class_243;"},
      at = {@At(
   value = "RETURN",
   ordinal = 0
)},
      cancellable = true
   )
   private void onStep(class_243 var1, CallbackInfoReturnable<class_243> var2) {
      try {
         if (this != MinecraftHelper.getClient().field_1724) {
            return;
         }
      } catch (JSONException var5) {
         throw a(var5);
      }

      StepEvent event = new StepEvent((class_243)var2.getReturnValue());

      try {
         C.Z(event);
         if (event.isCancelled()) {
            var2.setReturnValue(class_243.field_1353);
            return;
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      var2.setReturnValue(event.getMovement());
   }

   @Inject(
      method = {"method_5724(FLnet/minecraft/class_243;)V"},
      at = {@At("TAIL")}
   )
   private void hookUpdateVelocityTail(float var1, class_243 var2, CallbackInfo var3) {
      try {
         if (this == MinecraftHelper.getClient().field_1724) {
            C.Z(new VelocityUpdateEvent(var1, var2));
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
