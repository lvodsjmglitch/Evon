package club.evon.mixins;

import club.evon.C;
import club.evon.J0;
import club.evon._6;
import club.evon._D;
import club.evon._E;
import club.evon._Y;
import club.evon.vD;
import club.evon.vF;
import club.evon.vK;
import club.evon.vg;
import club.evon.y3;
import club.evon.yF;
import club.evon.yN;
import club.evon.yS;
import club.evon.zy;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalBooleanRef;
import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_239;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_437;
import net.minecraft.class_542;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({class_310.class})
public abstract class MinecraftClientMixin {
   @Shadow
   private int field_1752;
   @Shadow
   protected int field_1771;
   @Shadow
   @Nullable
   public class_239 field_1765;
   @Shadow
   @Nullable
   public class_746 field_1724;

   @Shadow
   protected abstract boolean method_1536();

   private MinecraftClientMixin() {
   }

   @Inject(
      method = {"<init>(Lnet/minecraft/class_542;)V"},
      at = {@At("TAIL")}
   )
   private void init(class_542 var1, CallbackInfo var2) {
      zy.p();
   }

   @Inject(
      method = {"method_1508()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_6115()Z",
   ordinal = 0
)}
   )
   private void handleInputEventsMouse(CallbackInfo var1) {
      C.Z(new _D());
   }

   @Inject(
      method = {"method_1508()V"},
      at = {@At("TAIL")}
   )
   private void handleInputEventsTail(CallbackInfo var1) {
      yS.y().h();
      C.Z(new vF());
   }

   @Redirect(
      method = {"method_1536()Z"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_6104(Lnet/minecraft/class_1268;)V"
)
   )
   private void redirectAttackSwings(class_746 var1, class_1268 var2) {
      _6 var3 = yS.J();

      try {
         if (var3.M()) {
            var1.method_6104(var2);
            return;
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      ((yF)var1).evon$swingHandServerside(var2);
   }

   @Redirect(
      method = {"method_1583()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_6104(Lnet/minecraft/class_1268;)V"
)
   )
   private void redirectUseSwings(class_746 var1, class_1268 var2) {
      _6 var3 = yS.e();

      try {
         if (var3.M()) {
            var1.method_6104(var2);
            return;
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      ((yF)var1).evon$swingHandServerside(var2);
   }

   @Inject(
      method = {"method_1507(Lnet/minecraft/class_437;)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_304;method_1437()V",
   shift = Shift.AFTER
)}
   )
   private void hookSetScreen(class_437 param1, CallbackInfo param2) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_1508()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_61496(I)V"
)
   )
   private void redirectSelectedSlot(class_1661 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_1508()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_315;field_26845:Lnet/minecraft/class_304;",
   shift = Shift.BEFORE
)}
   )
   private void postSlotHandleInput(CallbackInfo var1) {
      vD.a().y(false, false);
   }

   @Redirect(
      method = {"method_1508()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_304;method_1434()Z"
)
   )
   private boolean redirectIsPressed(class_304 var1) {
      _6 var2 = yS.t(var1);

      try {
         if (var2 != null) {
            return var2.O();
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      return var1.method_1434();
   }

   @Redirect(
      method = {"method_1508()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_304;method_1436()Z"
),
      slice = @Slice(
   from = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_315;field_1904:Lnet/minecraft/class_304;",
   ordinal = 1
),
   to = @At("TAIL")
)
   )
   private boolean redirectWasPressed(class_304 var1) {
      _6 var2 = yS.t(var1);

      try {
         if (var2 != null) {
            return var2.e();
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      return var1.method_1436();
   }

   @Redirect(
      method = {"method_1508()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_304;method_1436()Z",
   ordinal = 11
)
   )
   private boolean redirectUsingAttack(class_304 var1, @Local LocalBooleanRef var2) {
      try {
         if (!this.isSwingWhileUsing() || !yS.J().e()) {
            return false;
         }
      } catch (JSONException var5) {
         throw a(var5);
      }

      boolean var3 = var2.get();
      boolean var4 = var3 | this.method_1536();
      var2.set(var4);
      return true;
   }

   @Inject(
      method = {"method_1583()V"},
      at = {@At("HEAD")}
   )
   private void hookItemUse(CallbackInfo var1) {
   }

   @Inject(
      method = {"method_1508()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_315;field_1904:Lnet/minecraft/class_304;",
   ordinal = 1
)}
   )
   private void onItemUseMouseHandle(CallbackInfo param1) {
      // $FF: Couldn't be decompiled
   }

   @Unique
   private boolean isSwingWhileUsing() {
      return false;
   }

   @Inject(
      method = {"method_1523(Z)V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_310;method_5383()V",
   shift = Shift.BEFORE
)}
   )
   private void onGameLoop(boolean var1, CallbackInfo var2, @Local(ordinal = 0) int var3) {
      y3 var10000;
      y3 var10001;
      boolean var10002;
      label16: {
         try {
            var10000 = new y3;
            var10001 = var10000;
            if (var3 > 0) {
               var10002 = true;
               break label16;
            }
         } catch (JSONException var4) {
            throw a(var4);
         }

         var10002 = false;
      }

      var10001.<init>(var10002);
      C.Z(var10000);
   }

   @Inject(
      method = {"method_1574()V"},
      at = {@At("HEAD")}
   )
   private void tickHead(CallbackInfo var1) {
      C.Z(new yN());
   }

   @Inject(
      method = {"method_1481(Lnet/minecraft/class_638;)V"},
      at = {@At("HEAD")}
   )
   private void hookJoinWorld(class_638 var1, CallbackInfo var2) {
      C.Z(new vK());
   }

   @Inject(
      method = {"method_1574()V"},
      at = {@At("TAIL")}
   )
   private void tickTail(CallbackInfo var1) {
      C.Z(new _Y());
   }

   @Inject(
      method = {"method_55505()V"},
      at = {@At("HEAD")}
   )
   private void disconnected(CallbackInfo var1) {
      C.Z(new _E());
   }

   @Inject(
      method = {"method_47596()Z"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void disableTelemetry(CallbackInfoReturnable<Boolean> var1) {
      var1.setReturnValue(false);
   }

   @Inject(
      method = {"method_15993()V"},
      at = {@At("HEAD")}
   )
   private void resolutionChange(CallbackInfo var1) {
   }

   @Inject(
      method = {"method_1583()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1269$class_9860;comp_2909()Lnet/minecraft/class_1269$class_9861;",
   ordinal = 1
)}
   )
   private void hookBlockPlaceEvent(CallbackInfo var1, @Local class_3965 var2) {
      C.Z(new J0(var2));
   }

   @Redirect(
      method = {"method_1583()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_3215(Lnet/minecraft/class_1268;)V",
   ordinal = 0
)
   )
   private void redirectResetEquipProgress(class_759 param1, class_1268 param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_1583()V"},
      at = {@At(
   value = "FIELD",
   target = "Lnet/minecraft/class_310;field_1752:I",
   shift = Shift.AFTER
)},
      cancellable = true
   )
   private void injectItemUseCooldown(CallbackInfo var1) {
      vg var2 = new vg(4);

      try {
         C.Z(var2);
         if (var2.e()) {
            var1.cancel();
            return;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      this.field_1752 = var2.m();
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
