package club.evon.mixins;

import club.evon.C;
import club.evon.vB;
import net.minecraft.class_2338;
import net.minecraft.class_852;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_852.class})
public abstract class ChunkOcclusionDataBuilderMixin {
   @Inject(
      method = {"method_3682(Lnet/minecraft/class_2338;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onMarkClosed(class_2338 var1, CallbackInfo var2) {
      vB var3 = new vB();

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
