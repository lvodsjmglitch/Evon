package club.evon.mixins;

import java.util.Map;
import java.util.function.Consumer;
import net.minecraft.class_1923;
import net.minecraft.class_2540;
import net.minecraft.class_2818;
import net.minecraft.class_631;
import net.minecraft.class_2902.class_2903;
import net.minecraft.class_6603.class_6605;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_631.class})
public abstract class ClientChunkManagerMixin {
   @Inject(
      method = {"method_16020(IILnet/minecraft/class_2540;Ljava/util/Map;Ljava/util/function/Consumer;)Lnet/minecraft/class_2818;"},
      at = {@At("HEAD")}
   )
   private void onChunkLoad(int var1, int var2, class_2540 var3, Map<class_2903, long[]> var4, Consumer<class_6605> var5, CallbackInfoReturnable<class_2818> var6) {
   }

   @Inject(
      method = {"method_2859(Lnet/minecraft/class_1923;)V"},
      at = {@At("HEAD")}
   )
   private void onChunkUnload(class_1923 var1, CallbackInfo var2) {
   }
}
