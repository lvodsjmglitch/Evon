package club.evon.mixins;

import club.evon.C;
import club.evon.vA;
import club.evon.ym;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_10185;
import net.minecraft.class_304;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_743.class})
public final class KeyboardInputMixin extends class_744 {
   @Unique
   private vA moveInputEvent;

   private KeyboardInputMixin() {
   }

   @Redirect(
      method = {"method_3129()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_304;method_1434()Z",
   ordinal = 4
)
   )
   private boolean hookMoveInputEventJump(class_304 param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_3129()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_743;method_40218(ZZ)F",
   ordinal = 0
)
   )
   private float hookMoveInputEventForward(boolean var1, boolean var2) {
      float var10000;
      try {
         if (this.moveInputEvent == null) {
            var10000 = 0.0F;
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = this.moveInputEvent.f();
      return var10000;
   }

   @Redirect(
      method = {"method_3129()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_743;method_40218(ZZ)F",
   ordinal = 1
)
   )
   private float hookMoveInputEventStrafe(boolean var1, boolean var2) {
      float var10000;
      try {
         if (this.moveInputEvent == null) {
            var10000 = 0.0F;
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = this.moveInputEvent.Z();
      return var10000;
   }

   @ModifyExpressionValue(
      method = {"method_3129()V"},
      at = {@At(
   value = "NEW",
   target = "(ZZZZZZZ)Lnet/minecraft/class_10185;"
)}
   )
   private class_10185 modifyInput(class_10185 var1) {
      class_10185 var10000;
      class_10185 var10001;
      boolean var10002;
      label31: {
         try {
            this.moveInputEvent = new vA(getMovementMultiplier(ym.m.field_1690.field_1894.method_1434(), ym.m.field_1690.field_1881.method_1434()), getMovementMultiplier(ym.m.field_1690.field_1913.method_1434(), ym.m.field_1690.field_1849.method_1434()), ym.m.field_1690.field_1903.method_1434(), var1.comp_3164());
            C.Z(this.moveInputEvent);
            var10000 = new class_10185;
            var10001 = var10000;
            if (this.moveInputEvent.f() > 0.0F) {
               var10002 = true;
               break label31;
            }
         } catch (JSONException var2) {
            throw a(var2);
         }

         var10002 = false;
      }

      var10001.<init>(var10002, this.moveInputEvent.f() < 0.0F, this.moveInputEvent.Z() > 0.0F, this.moveInputEvent.Z() < 0.0F, this.moveInputEvent.Y(), this.moveInputEvent.b(), var1.comp_3165());
      return var10000;
   }

   @Unique
   private static float getMovementMultiplier(boolean var0, boolean var1) {
      try {
         if (var0 == var1) {
            return 0.0F;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      float var10000;
      try {
         if (var0) {
            var10000 = 1.0F;
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = -1.0F;
      return var10000;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
