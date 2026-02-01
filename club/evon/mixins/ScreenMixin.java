package club.evon.mixins;

import club.evon.Y;
import club.evon.yT;
import net.minecraft.class_11908;
import net.minecraft.class_2558;
import net.minecraft.class_2583;
import net.minecraft.class_310;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_437.class})
public abstract class ScreenMixin {
   @Shadow
   protected class_310 field_22787;

   @Inject(
      method = {"method_25404(Lnet/minecraft/class_11908;)Z"},
      at = {@At("HEAD")}
   )
   private void hookKeyPressed(class_11908 var1, CallbackInfoReturnable<Boolean> var2) {
      Y.S(var1.method_74228());
   }

   @Inject(
      method = {"method_25430(Lnet/minecraft/class_2583;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void handleTextClick(class_2583 style, CallbackInfoReturnable<Boolean> cir) {
      if (var1 != null) {
         class_2558 var5 = var1.method_10970();
         if (var5 instanceof yT) {
            yT var3 = (yT)var5;
            yT var10000 = var3;

            Runnable var8;
            try {
               var8 = var10000.Rj();
            } catch (Throwable var7) {
               throw new MatchException(var7.toString(), var7);
            }

            Runnable var6 = var8;
            var6.run();
            var2.setReturnValue(true);
         }
      }

   }
}
