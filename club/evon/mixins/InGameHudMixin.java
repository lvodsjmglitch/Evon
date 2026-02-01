package club.evon.mixins;

import club.evon.C;
import club.evon._g;
import club.evon.e;
import club.evon.f;
import club.evon.g8;
import club.evon.vD;
import club.evon.y8;
import club.evon.yf;
import club.evon.ym;
import club.evon.z7;
import club.evon.zx;
import club.evon.zy;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import net.minecraft.class_1041;
import net.minecraft.class_10799;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_266;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_329.class})
public abstract class InGameHudMixin {
   @Shadow
   private int field_2023;
   private static final String a;

   @Redirect(
      method = {"method_1748()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_7391()Lnet/minecraft/class_1799;"
)
   )
   private class_1799 getMainHandStack(class_1661 param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_1759(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_67532()I"
)
   )
   private int onRenderHotbarSlot(class_1661 var1) {
      return vD.a().U(var1);
   }

   @Inject(
      method = {"method_1753(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      at = {@At("HEAD")}
   )
   private void render(class_332 var1, class_9779 var2, CallbackInfo var3) {
      float var4 = var2.method_60637(false);
      C.Z(new f(var1, var4));
      this.applyPostProcessing(var1, var4);
      class_1041 var5 = ym.m.method_22683();
      int var6 = var5.method_4486();
      int var7 = var5.method_4502();
      double var8 = ym.m.field_1729.method_1603() * ((double)var6 / (double)var5.method_4480());
      double var10 = ym.m.field_1729.method_1604() * ((double)var7 / (double)var5.method_4507());
      y8.l();
      y8.p(0.0F, 0.0F, (float)var6, (float)var7, y8.n);
      C.Z(new zx(var1, var4, var8, var10));
      y8.S(true);
      C.Z(new yf(var1, var4));
      RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(_g.Y().method_30277(), 0, _g.Y().method_30278(), 1.0D);
   }

   @Inject(
      method = {"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void injectRenderScoreboardSidebar(class_332 drawContext, class_266 objective, CallbackInfo ci) {
      g8 var4 = (g8)zy.p().q().R(g8.class);

      try {
         if (var4.d()) {
            var4.e(var1);
         }
      } catch (JSONException var5) {
         throw a(var5);
      }

      var3.cancel();
   }

   @Unique
   public void renderScoreboardRect(class_332 drawContext) {
      g8 var2 = (g8)zy.p().q().R(g8.class);

      try {
         if (var2.d()) {
            var2.u(var1, false);
         }

      } catch (JSONException var3) {
         throw a(var3);
      }
   }

   @Inject(
      method = {"method_1765(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void noRenderPotions(class_332 var1, class_9779 var2, CallbackInfo var3) {
      var3.cancel();
   }

   @Unique
   private void applyPostProcessing(class_332 var1, float var2) {
      CommandEncoder var10000;
      Supplier var10001;
      GpuTextureView var10002;
      OptionalInt var10003;
      GpuTextureView var10004;
      label37: {
         try {
            z7.h = true;
            _g.M();
            var10000 = RenderSystem.getDevice().createCommandEncoder();
            var10001 = () -> {
               return a;
            };
            var10002 = _g.Y().method_71639();
            var10003 = OptionalInt.empty();
            if (_g.Y().field_1478) {
               var10004 = _g.Y().method_71640();
               break label37;
            }
         } catch (Throwable var8) {
            throw a(var8);
         }

         var10004 = null;
      }

      RenderPass var3 = var10000.createRenderPass(var10001, var10002, var10003, var10004, OptionalDouble.empty());

      try {
         var3.setPipeline(class_10799.field_56879);
         y8.l();
         C.Z(new e(var1, var2));
         y8.S(false);
      } catch (Throwable var7) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var3 != null) {
         var3.close();
      }

      _g.z();
      z7.h = false;
   }

   @Inject(
      method = {"method_1736(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void renderCrosshair(class_332 var1, class_9779 var2, CallbackInfo var3) {
      try {
         if (ym.m.field_1755 == zy.p().H()) {
            var3.cancel();
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   @Redirect(
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1657;method_6079()Lnet/minecraft/class_1799;"
),
      method = {"method_1759(Lnet/minecraft/class_332;Lnet/minecraft/class_9779;)V"}
   )
   public class_1799 hideOffhandSlot(class_1657 player) {
      // $FF: Couldn't be decompiled
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   static {
      char[] var10003 = "\u001bR*p+\u0006d1_!z4".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 67;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 67;
         var10006 = var0;
      } else {
         var4 = 67;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            a = var6;
            return;
         }

         var10005 = var10003;
         var5 = 67;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 26;
            break;
         case 1:
            var16 = 125;
            break;
         case 2:
            var16 = 6;
            break;
         case 3:
            var16 = 92;
            break;
         case 4:
            var16 = 5;
            break;
         case 5:
            var16 = 101;
            break;
         default:
            var16 = 116;
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
