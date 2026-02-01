package club.evon.mixins;

import club.evon.JV;
import club.evon.v8;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_11910;
import net.minecraft.class_1661;
import net.minecraft.class_312;
import net.minecraft.class_315;
import net.minecraft.class_746;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_312.class})
public final class MouseMixin {
   @Shadow
   private double field_1789;
   @Shadow
   private double field_1787;
   @Unique
   private v8 event;
   @Unique
   private boolean unlockCursorRun;

   private MouseMixin() {
   }

   @Inject(
      method = {"method_1601(JLnet/minecraft/class_11910;I)V"},
      at = {@At("HEAD")}
   )
   private void onMouseButton(long param1, class_11910 param3, int param4, CallbackInfo param5) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_1598(JDD)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_61496(I)V"
)
   )
   private void setSelectedSlot(class_1661 param1, int param2, @Local int param3) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_1606(D)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_315;field_1914:Z",
   opcode = 180
)
   )
   private boolean redirectCheck(class_315 param1, @Local(ordinal = 3) double param2) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_55793()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_312;method_1613()Z"
)
   )
   private boolean redirectTickCursorLock(class_312 var1) {
      try {
         if (var1.method_1613()) {
            return true;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      try {
         if (JV.O().l()) {
            this.unlockCursorRun = true;
            return true;
         } else {
            return false;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }
   }

   @Inject(
      method = {"method_1606(D)V"},
      at = {@At("TAIL")}
   )
   private void updateMouseTail(double var1, CallbackInfo var3) {
      JV.M().H();
      this.unlockCursorRun = false;
      this.event = null;
   }

   @Redirect(
      method = {"method_1606(D)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_31550()Z"
)
   )
   private boolean redirectCheck(class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_1606(D)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_312;field_1789:D",
   opcode = 180
)
   )
   private double redirectCursorX(class_312 var1) {
      double var10000;
      try {
         if (this.event == null) {
            var10000 = 0.0D;
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.event.M();
      return var10000;
   }

   @Redirect(
      method = {"method_1606(D)V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_312;field_1787:D",
   opcode = 180
)
   )
   private double redirectCursorY(class_312 var1) {
      double var10000;
      try {
         if (this.event == null) {
            var10000 = 0.0D;
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.event.L();
      return var10000;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
