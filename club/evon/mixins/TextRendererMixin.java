package club.evon.mixins;

import club.evon.gi;
import club.evon.yU;
import club.evon.zy;
import net.minecraft.class_327;
import net.minecraft.class_5481;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin({class_327.class})
public abstract class TextRendererMixin {
   @ModifyArg(
      method = {"method_1727(Ljava/lang/String;)I"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_5225;method_27482(Ljava/lang/String;)F"
),
      index = 0
   )
   @Nullable
   private String injectNameProtectWidthA(@Nullable String param1) {
      // $FF: Couldn't be decompiled
   }

   @ModifyArg(
      method = {"method_30880(Lnet/minecraft/class_5481;)I"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_5225;method_30875(Lnet/minecraft/class_5481;)F"
),
      index = 0
   )
   private class_5481 injectNameProtectWidthB(class_5481 var1) {
      try {
         return (class_5481)(((gi)zy.p().q().R(gi.class)).d() ? new yU(var1) : var1);
      } catch (JSONException var2) {
         throw a(var2);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
