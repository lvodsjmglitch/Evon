package club.evon.mixins;

import club.evon.C;
import club.evon.gs;
import club.evon.z4;
import net.minecraft.class_1297;
import net.minecraft.class_638;
import net.minecraft.class_1297.class_5529;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_638.class})
public final class ClientWorldMixin {
   @Inject(
      method = {"method_53875(Lnet/minecraft/class_1297;)V"},
      at = {@At("RETURN")}
   )
   public void injectAddEntity(class_1297 entity, CallbackInfo ci) {
      gs var3 = new gs(var1);
      C.Z(var3);
   }

   @Inject(
      method = {"method_2945(ILnet/minecraft/class_1297$class_5529;)V"},
      at = {@At("RETURN")}
   )
   public void injectRemoveEntity(int entityId, class_5529 removalReason, CallbackInfo callbackInfo) {
      z4 var4 = new z4(var1);
      C.Z(var4);
   }
}
