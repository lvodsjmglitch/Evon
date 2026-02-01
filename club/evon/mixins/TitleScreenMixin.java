package club.evon.mixins;

import club.evon.Y;
import club.evon.y8;
import club.evon.zL;
import net.minecraft.class_11909;
import net.minecraft.class_332;
import net.minecraft.class_442;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_442.class})
public class TitleScreenMixin {
   @Inject(
      method = {"method_25394(Lnet/minecraft/class_332;IIF)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void render(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      try {
         var5.cancel();
         if (Y.d() == null) {
            Y.S(zL.c());
         }
      } catch (JSONException var6) {
         throw a(var6);
      }

      y8.l();
      Y.o((float)var2, (float)var3);
      y8.S(true);
   }

   @Inject(
      method = {"method_25402(Lnet/minecraft/class_11909;Z)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void mouseClicked(class_11909 var1, boolean var2, CallbackInfoReturnable<Boolean> var3) {
      try {
         var3.setReturnValue(false);
         var3.cancel();
         if (Y.d() == null) {
            return;
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      Y.P(var1.comp_4798(), var1.comp_4799(), var1.method_74245());
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
