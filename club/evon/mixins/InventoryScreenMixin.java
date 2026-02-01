package club.evon.mixins;

import net.minecraft.class_1309;
import net.minecraft.class_332;
import net.minecraft.class_490;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_490.class})
public final class InventoryScreenMixin {
   private InventoryScreenMixin() {
   }

   @Inject(
      method = {"method_2486(Lnet/minecraft/class_332;IIIIIFFFLnet/minecraft/class_1309;)V"},
      at = {@At("HEAD")}
   )
   private static void hookDrawEntityHead(class_332 param0, int param1, int param2, int param3, int param4, int param5, float param6, float param7, float param8, class_1309 param9, CallbackInfo param10) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_2486(Lnet/minecraft/class_332;IIIIIFFFLnet/minecraft/class_1309;)V"},
      at = {@At("TAIL")}
   )
   private static void hookDrawEntityTail(class_332 param0, int param1, int param2, int param3, int param4, int param5, float param6, float param7, float param8, class_1309 param9, CallbackInfo param10) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
