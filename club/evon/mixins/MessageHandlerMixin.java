package club.evon.mixins;

import club.evon.C;
import club.evon.vi;
import club.evon.zT;
import java.util.UUID;
import net.minecraft.class_2561;
import net.minecraft.class_7594;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_7594.class})
public abstract class MessageHandlerMixin {
   @Shadow
   protected abstract UUID method_44734(class_2561 var1);

   @ModifyArg(
      method = {"method_45745(Lnet/minecraft/class_2556$class_7602;Lnet/minecraft/class_2561;Ljava/time/Instant;)Z"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_338;method_1812(Lnet/minecraft/class_2561;)V"
)
   )
   private class_2561 modifyDisguisedChatLambda(class_2561 var1) {
      vi var2 = new vi(var1, zT.CHAT_MESSAGE);
      C.Z(var2);
      var1 = var2.G();
      return var1;
   }

   @ModifyArg(
      method = {"method_44943(Lnet/minecraft/class_2556$class_7602;Lnet/minecraft/class_7471;Lnet/minecraft/class_2561;Lcom/mojang/authlib/GameProfile;ZLjava/time/Instant;)Z"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_338;method_44811(Lnet/minecraft/class_2561;Lnet/minecraft/class_7469;Lnet/minecraft/class_7591;)V"
)
   )
   private class_2561 modifyChatMessage(class_2561 var1) {
      vi var2 = new vi(var1, zT.CHAT_MESSAGE);
      C.Z(var2);
      var1 = var2.G();
      return var1;
   }

   @ModifyArg(
      method = {"method_44736(Lnet/minecraft/class_2561;Z)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_338;method_1812(Lnet/minecraft/class_2561;)V"
)
   )
   private class_2561 modifyGameMessage(class_2561 var1) {
      vi var2 = new vi(var1, zT.GAME_MESSAGE, this.method_44734(var1));
      C.Z(var2);
      var1 = var2.G();
      return var1;
   }
}
