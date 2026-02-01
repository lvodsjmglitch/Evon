package club.evon.mixins;

import club.evon.C;
import club.evon._d;
import club.evon.gl;
import club.evon.vD;
import club.evon.vY;
import club.evon.vn;
import club.evon.vv;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_636;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_636.class})
public final class ClientPlayerInteractionManagerMixin implements _d {
   @Unique
   private static final String SYNC_TARGET;
   @Shadow
   private class_2338 field_3714;
   @Shadow
   private float field_3715;

   @Inject(
      method = {"method_2925()V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void hookCancelBlockBreaking(CallbackInfo var1) {
      vY var2 = new vY();

      try {
         C.Z(var2);
         if (var2.e()) {
            var1.cancel();
         }

      } catch (JSONException var3) {
         throw a(var3);
      }
   }

   @Inject(
      method = {"method_2922(Lnet/minecraft/class_2338;)Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void redirectCurrentlyBreaking(class_2338 param1, CallbackInfoReturnable<Boolean> param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_2927()V"},
      at = {@At("HEAD")}
   )
   private void tick(CallbackInfo var1) {
      vD.a().U();
   }

   @Inject(
      method = {"method_2918(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V",
   shift = Shift.AFTER
)}
   )
   private void hookAttackEvent(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      C.Z(new vn(var2));
   }

   public class_2338 evon$getCurrentBreakingPos() {
      return this.field_3714;
   }

   public float evon$currentBreakingProgress() {
      return this.field_3715;
   }

   @Unique
   private static void gate(class_636 var0, gl var1) {
      vv var2 = new vv(var1);

      try {
         C.Z(var2);
         if (!var2.e()) {
            ((ClientPlayerInteractionManagerAccessor)var0).callSyncSelectedSlot();
         }

      } catch (JSONException var3) {
         throw a(var3);
      }
   }

   @Redirect(
      method = {"method_2902(Lnet/minecraft/class_2338;Lnet/minecraft/class_2350;)Z"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$updateBlockBreakingProgress(class_636 var1) {
      gate(var1, gl.UPDATE_BLOCK_BREAKING_PROGRESS);
   }

   @Redirect(
      method = {"method_2927()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$tick(class_636 var1) {
      gate(var1, gl.TICK);
   }

   @Redirect(
      method = {"method_2896(Lnet/minecraft/class_746;Lnet/minecraft/class_1268;Lnet/minecraft/class_3965;)Lnet/minecraft/class_1269;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$interactBlock(class_636 var1) {
      gate(var1, gl.INTERACT_BLOCK);
   }

   @Redirect(
      method = {"method_2919(Lnet/minecraft/class_1657;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$interactItem(class_636 var1) {
      gate(var1, gl.INTERACT_ITEM);
   }

   @Redirect(
      method = {"method_2918(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$attackEntity(class_636 var1) {
      gate(var1, gl.ATTACK_ENTITY);
   }

   @Redirect(
      method = {"method_2905(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$interactEntity(class_636 var1) {
      gate(var1, gl.INTERACT_ENTITY);
   }

   @Redirect(
      method = {"method_2917(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;Lnet/minecraft/class_3966;Lnet/minecraft/class_1268;)Lnet/minecraft/class_1269;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$interactEntityAtLocation(class_636 var1) {
      gate(var1, gl.INTERACT_ENTITY_AT_LOCATION);
   }

   @Redirect(
      method = {"method_2897(Lnet/minecraft/class_1657;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_636;method_2911()V"
)
   )
   private void redirect$stopUsingItem(class_636 var1) {
      gate(var1, gl.STOP_USING_ITEM);
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   static {
      char[] var10003 = "\u001fmN(]\u000f~=fH.\u0013\u0004c|`G5\u0017\fc|mN(\u0005\re8,h0\u001b\u0007y'SG=\u000b\u0007e\u001am_9\u0000\u0003t'jD2?\u0003y2dN.I\u0011n=`x9\u001e\u0007t'fO\u000f\u001e\rc{*}".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 72;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      String var10000;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 72;
         var10006 = var0;
      } else {
         var4 = 72;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            SYNC_TARGET = var6;
            var10000 = SYNC_TARGET;
            return;
         }

         var10005 = var10003;
         var5 = 72;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 27;
            break;
         case 1:
            var16 = 75;
            break;
         case 2:
            var16 = 99;
            break;
         case 3:
            var16 = 20;
            break;
         case 4:
            var16 = 58;
            break;
         case 5:
            var16 = 42;
            break;
         default:
            var16 = 95;
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
               SYNC_TARGET = var6;
               var10000 = SYNC_TARGET;
               return;
            }

            var10005 = var10002;
            var5 = var4;
            var10006 = var0;
         }
      }
   }
}
