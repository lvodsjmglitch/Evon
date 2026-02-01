package club.evon.mixins;

import club.evon.gH;
import club.evon.zy;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_2561;
import net.minecraft.class_897;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_897.class})
public abstract class EntityRendererMixin<T extends class_1297, S extends class_10017> {
   @Inject(
      method = {"method_62426(Lnet/minecraft/class_1297;)Lnet/minecraft/class_2561;"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onRenderLabel(T var1, CallbackInfoReturnable<class_2561> var2) {
      gH var3 = (gH)zy.p().q().R(gH.class);

      try {
         if (var3.f(var1)) {
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
