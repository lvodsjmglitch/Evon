package club.evon.mixins;

import club.evon.E;
import club.evon._P;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import net.minecraft.class_10426;
import net.minecraft.class_10444;
import net.minecraft.class_11659;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_3881;
import net.minecraft.class_3883;
import net.minecraft.class_3887;
import net.minecraft.class_4587;
import net.minecraft.class_583;
import net.minecraft.class_989;
import org.joml.Quaternionfc;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin({class_989.class})
public abstract class HeldItemFeatureRendererMixin<S extends class_10426, M extends class_583<S> & class_3881> extends class_3887<S, M> {
   public HeldItemFeatureRendererMixin(class_3883<S, M> context) {
      super(var1);
   }

   @Inject(
      method = {"method_4192(Lnet/minecraft/class_10426;Lnet/minecraft/class_10444;Lnet/minecraft/class_1306;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At("HEAD")}
   )
   private void setThirdPersonStackRef(S var1, class_10444 var2, class_1306 var3, class_4587 var4, class_11659 var5, int var6, CallbackInfo var7, @Share("stack") LocalRef<class_1799> var8) {
      try {
         if (E.Y(var1)) {
            var8.set(((_P)var1).evon$getEntity().method_61420(var3));
         }

      } catch (JSONException var9) {
         throw a(var9);
      }
   }

   @ModifyArgs(
      method = {"method_4192(Lnet/minecraft/class_10426;Lnet/minecraft/class_10444;Lnet/minecraft/class_1306;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4587;method_46416(FFF)V"
)
   )
   private void translateThirdPersonBlock(Args var1, @Local(argsOnly = true) S var2, @Share("stack") LocalRef<class_1799> var3) {
      try {
         if (E.Y(var2)) {
            var1.setAll(new Object[]{(Float)var1.get(0) * -1.0F, 0.4375F, (Float)var1.get(2) / 10.0F * -1.0F});
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   @WrapWithCondition(
      method = {"method_4192(Lnet/minecraft/class_10426;Lnet/minecraft/class_10444;Lnet/minecraft/class_1306;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_4587;method_22907(Lorg/joml/Quaternionfc;)V"
)}
   )
   private boolean removeThirdPersonMultiplyTransformations(class_4587 var1, Quaternionfc var2, @Local(argsOnly = true) S var3, @Share("stack") LocalRef<class_1799> var4) {
      boolean var10000;
      try {
         if (!E.Y(var3)) {
            var10000 = true;
            return var10000;
         }
      } catch (JSONException var5) {
         throw a(var5);
      }

      var10000 = false;
      return var10000;
   }

   @Inject(
      method = {"method_4192(Lnet/minecraft/class_10426;Lnet/minecraft/class_10444;Lnet/minecraft/class_1306;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_10444;method_65604(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;III)V"
)}
   )
   private void applyThirdPersonBlockRotation(S param1, class_10444 param2, class_1306 param3, class_4587 param4, class_11659 param5, int param6, CallbackInfo param7) {
      // $FF: Couldn't be decompiled
   }

   @WrapOperation(
      method = {"method_17162(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_10426;FF)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_989;method_4192(Lnet/minecraft/class_10426;Lnet/minecraft/class_10444;Lnet/minecraft/class_1306;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"
)}
   )
   private void cancelShieldRender(class_989 param1, S param2, class_10444 param3, class_1306 param4, class_4587 param5, class_11659 param6, int param7, Operation<Void> param8) {
      // $FF: Couldn't be decompiled
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
