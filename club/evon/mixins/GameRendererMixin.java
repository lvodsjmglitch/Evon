package club.evon.mixins;

import club.evon.C;
import club.evon.ResolutionChangeHelper;
import club.evon.RenderWorldEvent;
import club.evon.ResolutionChangeEvent;
import club.evon.RenderHelper;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3300;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4599;
import net.minecraft.class_751;
import net.minecraft.class_757;
import net.minecraft.class_759;
import net.minecraft.class_766;
import net.minecraft.class_9779;
import net.minecraft.class_239.class_240;
import org.joml.Matrix4f;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_757.class})
public abstract class GameRendererMixin {
   @Mutable
   @Shadow
   @Final
   public class_759 field_4012;
   @Shadow
   @Final
   @Mutable
   private final class_4599 field_20948;
   @Shadow
   @Final
   @Mutable
   private final class_310 field_4015;
   @Shadow
   @Final
   private class_4184 field_18765;
   @Unique
   private boolean passThroughBlocks;
   @Mutable
   @Shadow
   @Final
   protected class_751 field_60579;
   @Mutable
   @Shadow
   @Final
   protected class_766 field_60580;
   private static final String a;

   @Shadow
   public abstract void method_3190(float var1);

   @Inject(
      method = {"<init>(Lnet/minecraft/class_310;Lnet/minecraft/class_759;Lnet/minecraft/class_4599;Lnet/minecraft/class_776;)V"},
      at = {@At("RETURN")}
   )
   private void replaceCubeMapRenderer(CallbackInfo var1) {
      this.field_60579 = new class_751(class_2960.method_60654(a));
      this.field_60580 = new class_766(this.field_60579);
   }

   public GameRendererMixin(class_310 client, class_759 heldItemRenderer, class_3300 resourceManager, class_4599 buffers) {
      this.field_4015 = var1;
      this.field_4012 = var2;
      this.field_20948 = var4;
   }

   @Redirect(
      method = {"method_56153(Lnet/minecraft/class_1297;DDF)Lnet/minecraft/class_239;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_239;method_17783()Lnet/minecraft/class_239$class_240;"
)
   )
   private class_240 redirectBlockHitResultType(class_239 var1) {
      try {
         if (this.passThroughBlocks) {
            this.passThroughBlocks = false;
            return class_240.field_1333;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      return var1.method_17783();
   }

   @Redirect(
      method = {"method_56153(Lnet/minecraft/class_1297;DDF)Lnet/minecraft/class_239;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_243;method_1025(Lnet/minecraft/class_243;)D",
   ordinal = 0
)
   )
   private double redirectPassedThroughBlockDistance(class_243 param1, class_243 param2, @Local(ordinal = 1,argsOnly = true) double param3, @Local(argsOnly = true) float param5) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_3169(II)V"},
      at = {@At("HEAD")}
   )
   private void onResized(int var1, int var2, CallbackInfo var3) {
      C.Z(new ResolutionChangeEvent(var1, var2));
      ResolutionChangeHelper.onResize(var1, var2);
   }

   @Inject(
      method = {"method_3192(Lnet/minecraft/class_9779;Z)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_437;method_47413(Lnet/minecraft/class_332;IIF)V"
)},
      cancellable = true
   )
   private void onRenderScreen(class_9779 var1, boolean var2, CallbackInfo var3) {
   }

   @Inject(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lcom/mojang/blaze3d/systems/RenderSystem;setProjectionMatrix(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lnet/minecraft/class_10366;)V",
   ordinal = 1,
   shift = Shift.BEFORE
)}
   )
   private void injectRenderWorld(class_9779 var1, CallbackInfo var2, @Local(ordinal = 0) Matrix4f var3, @Local(ordinal = 1) Matrix4f var4) {
      class_4587 var5 = new class_4587();
      var5.method_34425(var4);
      C.Z(new RenderWorldEvent(var1.method_60637(false), var5));
      RenderHelper.projectionMatrix.set(var3);
      RenderHelper.modelViewMatrix.set(RenderSystem.getModelViewMatrix());
      RenderHelper.viewMatrix.set(var5.method_23760().method_23761());
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   static {
      char[] var10003 = "g(4&+0#l1))|!mr?5'c!/c".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 15;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 15;
         var10006 = var0;
      } else {
         var4 = 15;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            a = var6;
            return;
         }

         var10005 = var10003;
         var5 = 15;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 13;
            break;
         case 1:
            var16 = 81;
            break;
         case 2:
            var16 = 84;
            break;
         case 3:
            var16 = 71;
            break;
         case 4:
            var16 = 30;
            break;
         case 5:
            var16 = 79;
            break;
         default:
            var16 = 77;
         }

         var10005[var10006] = (char)(var15 ^ var5 ^ var16);
         ++var0;
         if (var4 == 0) {
            var10006 = var4;
            var10005 = var10002;
            var5 = var4;
         } else {
            if (var1 <= var0) {
               var6 = (new String(var10002)).intern();
               var3 = true;
               a = var6;
               return;
            }

            var10005 = var10002;
            var5 = var4;
            var10006 = var0;
         }
      }
   }
}
