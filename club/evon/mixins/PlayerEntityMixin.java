package club.evon.mixins;

import club.evon.C;
import club.evon.JF;
import club.evon.JT;
import club.evon.Jd;
import club.evon.gz;
import club.evon.vD;
import club.evon.vr;
import club.evon.vz;
import club.evon.ym;
import club.evon.zy;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1536;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_5134;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_1657.class})
public abstract class PlayerEntityMixin extends class_1309 implements JF {
   @Shadow
   @Nullable
   public class_1536 field_7513;
   @Unique
   private int visualLastAttackedTicks;
   @Unique
   private class_1799 visualSelectedItem;
   private vr keepSprintEvent;

   protected PlayerEntityMixin(class_1299<? extends class_1309> entityType, class_1937 world) {
      super(var1, var2);
   }

   @Inject(
      method = {"method_5773()V"},
      at = {@At("TAIL")}
   )
   private void incrementTicks(CallbackInfo var1) {
      if (this == ym.m.field_1724) {
         vz var2 = vz.r();

         try {
            if (this.method_24828()) {
               var2.Y = 0;
               ++var2.K;
               return;
            }
         } catch (JSONException var3) {
            throw a(var3);
         }

         ++var2.Y;
         var2.K = 0;
      }

   }

   @Inject(
      method = {"method_7350()V"},
      at = {@At("TAIL")}
   )
   private void resetVisualLastAttackedTicks(CallbackInfo var1) {
      this.visualLastAttackedTicks = 0;
   }

   @Inject(
      method = {"method_5773()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1657;method_6047()Lnet/minecraft/class_1799;"
)}
   )
   private void checkVisualItemStackEquality(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_7305(Lnet/minecraft/class_2680;)Z"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_7391()Lnet/minecraft/class_1799;"
)
   )
   private class_1799 redirectHandStack(class_1661 param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_7351(Lnet/minecraft/class_2680;)F"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_7391()Lnet/minecraft/class_1799;"
)
   )
   private class_1799 redirectHandStack2(class_1661 param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_5773()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1657;method_7350()V"
)
   )
   private void onSwapLastAttackedTicksReset(class_1657 var1) {
      this.field_6273 = 0;
   }

   @Inject(
      method = {"method_5773()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_1657;field_6273:I",
   ordinal = 0
)}
   )
   private void incrementLastAttackedTicks(CallbackInfo var1) {
      ++this.visualLastAttackedTicks;
   }

   @Unique
   private float getVisualAttackCooldownProgressPerTick() {
      vD var3 = vD.a();

      double var1;
      label30: {
         try {
            if (var3.x() && var3.d() != JT.NONE) {
               break label30;
            }
         } catch (JSONException var4) {
            throw a(var4);
         }

         var1 = this.method_45325(class_5134.field_23723);
         return (float)(1.0D / var1 * 20.0D);
      }

      var1 = Jd.w(var3.q(ym.m.field_1724));
      return (float)(1.0D / var1 * 20.0D);
   }

   @Unique
   public float evon$getVisualAttackCooldownProgress(float baseTime) {
      return class_3532.method_15363(((float)this.visualLastAttackedTicks + var1) / this.getVisualAttackCooldownProgressPerTick(), 0.0F, 1.0F);
   }

   @Inject(
      method = {"method_7324(Lnet/minecraft/class_1297;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1657;method_18799(Lnet/minecraft/class_243;)V"
)}
   )
   private void hookKeepSprint(class_1297 var1, CallbackInfo var2) {
      this.keepSprintEvent = new vr();
      C.Z(this.keepSprintEvent);
   }

   @ModifyArg(
      method = {"method_7324(Lnet/minecraft/class_1297;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1657;method_5728(Z)V"
)
   )
   private boolean hookKeepSprintState(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @ModifyArg(
      method = {"method_7324(Lnet/minecraft/class_1297;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1657;method_18799(Lnet/minecraft/class_243;)V"
)
   )
   private class_243 hookKeepSprintVelocity(class_243 param1) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_55755()D"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hookEntityReach(CallbackInfoReturnable<Double> var1) {
      gz var2 = (gz)zy.p().q().R(gz.class);

      try {
         if (var2.d()) {
            var1.setReturnValue(var2.x());
         }

      } catch (JSONException var3) {
         throw a(var3);
      }
   }

   @Inject(
      method = {"method_55754()D"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hookBlockReach(CallbackInfoReturnable<Double> var1) {
      gz var2 = (gz)zy.p().q().R(gz.class);

      try {
         if (var2.d()) {
            var1.setReturnValue(var2.v());
         }

      } catch (JSONException var3) {
         throw a(var3);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
