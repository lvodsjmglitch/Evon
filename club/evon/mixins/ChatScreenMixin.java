package club.evon.mixins;

import club.evon.zJ;
import net.minecraft.class_11909;
import net.minecraft.class_4069;
import net.minecraft.class_408;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_408.class})
public abstract class ChatScreenMixin implements class_4069 {
   @Inject(
      method = {"method_25402(Lnet/minecraft/class_11909;Z)Z"},
      at = {@At("HEAD")}
   )
   private void hookMouseClicked(class_11909 var1, boolean var2, CallbackInfoReturnable<Boolean> var3) {
      zJ.Q().S(var1);
   }

   public boolean method_25406(class_11909 click) {
      try {
         if (var1.method_74245() == 0) {
            zJ.Q().n();
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      return super.method_25406(var1);
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
