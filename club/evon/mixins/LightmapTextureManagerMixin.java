package club.evon.mixins;

import net.minecraft.class_765;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_765.class})
public final class LightmapTextureManagerMixin {
   @Redirect(
      method = {"method_3313(F)V"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/lang/Double;floatValue()F",
   ordinal = 1
)
   )
   public float redirectGammaValue(Double d) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
