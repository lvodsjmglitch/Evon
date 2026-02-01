package club.evon.mixins;

import club.evon.C;
import club.evon.ve;
import club.evon.ym;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import net.minecraft.class_243;
import net.minecraft.class_2664;
import net.minecraft.class_2743;
import net.minecraft.class_634;
import net.minecraft.class_746;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_634.class})
public final class ClientPlayNetworkHandlerMixin {
   @Inject(
      method = {"method_45729(Ljava/lang/String;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onSendChatMessage(String param1, CallbackInfo param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_11132(Lnet/minecraft/class_2743;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_5750(Lnet/minecraft/class_243;)V"
)},
      cancellable = true
   )
   private void hookVelocityUpdate(class_2743 var1, CallbackInfo var2) {
      try {
         if (var1.method_11818() != ym.m.field_1724.method_5628()) {
            return;
         }
      } catch (JSONException var5) {
         throw a(var5);
      }

      ve var3 = new ve(var1.method_73085(), false);

      try {
         C.Z(var3);
         if (!var3.e()) {
            ym.m.field_1724.method_5750(var3.B());
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      var2.cancel();
   }

   @Inject(
      method = {"method_11124(Lnet/minecraft/class_2664;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_2664;comp_2884()Ljava/util/Optional;"
)},
      cancellable = true
   )
   private void hookVelocityUpdateExplosion(class_2664 var1, CallbackInfo var2) {
      var1.comp_2884().ifPresent((var1x) -> {
         class_243 var2x = ym.m.field_1724.method_18798().method_1019(var1x);
         ve var3 = new ve(var2x, true);

         try {
            C.Z(var3);
            if (!var3.e()) {
               ym.m.field_1724.method_45319(var3.B());
            }
         } catch (JSONException var4) {
            throw a(var4);
         }

         var2.cancel();
      });
   }

   @WrapWithCondition(
      method = {"method_11102(Lnet/minecraft/class_2645;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_3137()V"
)}
   )
   private boolean preventScreenClose(class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
