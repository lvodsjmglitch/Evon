package club.evon.mixins;

import club.evon.gi;
import net.minecraft.class_5223;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_5223.class})
public final class TextVisitFactoryMixin {
   @ModifyArg(
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_5223;method_27473(Ljava/lang/String;ILnet/minecraft/class_2583;Lnet/minecraft/class_2583;Lnet/minecraft/class_5224;)Z",
   ordinal = 0
),
      method = {"method_27472(Ljava/lang/String;ILnet/minecraft/class_2583;Lnet/minecraft/class_5224;)Z"},
      index = 0
   )
   private static String modifyText(String var0) {
      return gi.u(var0);
   }
}
