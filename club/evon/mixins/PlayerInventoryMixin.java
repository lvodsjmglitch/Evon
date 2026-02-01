package club.evon.mixins;

import club.evon.C;
import club.evon.vW;
import net.minecraft.class_1661;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1661.class})
public final class PlayerInventoryMixin {
   @Inject(
      method = {"method_61496(I)V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_1661;field_7545:I"
)},
      cancellable = true
   )
   private void hookSlotChangeMethod(int var1, CallbackInfo var2) {
      vW var3 = new vW(var1);

      try {
         C.Z(var3);
         if (var3.e()) {
            var2.cancel();
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
