package club.evon.mixins;

import club.evon.C;
import club.evon.RotationManager;
import club.evon.SprintModule;
import club.evon.SwingHandEvent;
import club.evon.UseSlowdownEvent;
import club.evon.MovementEvent;
import club.evon.PostMovementEvent;
import club.evon.ClientPlayerEntityAccessor;
import club.evon.MoveEvent;
import club.evon.EvonClient;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.mojang.authlib.GameProfile;
import net.minecraft.class_1268;
import net.minecraft.class_1313;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_2879;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_744;
import net.minecraft.class_746;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_746.class})
public abstract class ClientPlayerEntityMixin extends class_1657 implements ClientPlayerEntityAccessor {
   @Shadow
   public class_744 field_3913;
   @Unique
   private MovementEvent motionEvent;
   @Shadow
   private float field_3922;
   @Shadow
   public double field_3926;
   @Shadow
   public double field_3940;
   @Shadow
   public double field_3924;
   @Shadow
   public float field_3941;
   @Shadow
   public float field_3925;
   @Shadow
   public int field_3923;
   @Final
   @Shadow
   public class_634 field_3944;
   @Shadow
   public boolean field_3920;
   @Shadow
   public boolean field_53040;
   @Shadow
   public boolean field_3927;
   @Final
   @Shadow
   private class_310 field_3937;
   @Unique
   private boolean prevHandSwinging;
   @Unique
   private int prevHandSwingTicks;

   public ClientPlayerEntityMixin(class_1937 world, GameProfile profile) {
      super(var1, var2);
   }

   @Shadow
   protected abstract void method_3148(float var1, float var2);

   @Shadow
   public abstract void method_5784(class_1313 var1, class_243 var2);

   @Shadow
   public abstract boolean method_6115();

   @Shadow
   public abstract boolean method_5715();

   @Shadow
   public abstract boolean method_20303();

   @Shadow
   public abstract void method_46742();

   @Shadow
   public abstract boolean method_3134();

   @Shadow
   private static class_241 method_67271(class_241 var0) {
      return null;
   }

   @Inject(
      method = {"method_66282()V"},
      at = {@At("TAIL")}
   )
   private void tickNewAi(CallbackInfo var1) {
      try {
         if (this.method_3134()) {
            RotationManager.getRotationHelper().update();
         }

      } catch (JSONException var2) {
         throw a(var2);
      }
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At("HEAD")}
   )
   private void sendMovementPacketsHead(CallbackInfo var1) {
      try {
         if (!this.method_3134()) {
            return;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      this.motionEvent = new MovementEvent(this.method_23317(), this.method_5829().field_1322, this.method_23321(), this.method_36454(), this.method_36455(), this.field_5982, this.field_6004, this.method_24828());
      C.Z(this.motionEvent);
   }

   @Inject(
      method = {"method_3136()V"},
      at = {@At("TAIL")}
   )
   private void sendMovementPacketsTail(CallbackInfo var1) {
      try {
         if (!this.method_3134()) {
            return;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      C.Z(new PostMovementEvent());
   }

   @Redirect(
      method = {"method_5773()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_36454()F"
)
   )
   private float injectTick$getYaw(class_746 var1) {
      float var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_36454();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.getYaw();
      return var10000;
   }

   @Redirect(
      method = {"method_5773()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_36455()F"
)
   )
   private float injectTick$getPitch(class_746 var1) {
      float var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_36455();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.getPitch();
      return var10000;
   }

   @Redirect(
      method = {"method_3136()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_36454()F"
)
   )
   private float injectSendMovement$getYaw(class_746 var1) {
      float var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_36454();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.getYaw();
      return var10000;
   }

   @Redirect(
      method = {"method_3136()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_36455()F"
)
   )
   private float injectSendMovement$getPitch(class_746 var1) {
      float var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_36455();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.getPitch();
      return var10000;
   }

   @Redirect(
      method = {"method_3136()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_23317()D"
)
   )
   private double injectSendMovement$getX(class_746 var1) {
      double var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_23317();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.getX();
      return var10000;
   }

   @Redirect(
      method = {"method_3136()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_23318()D"
)
   )
   private double injectSendMovement$getY(class_746 var1) {
      double var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_23318();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.getY();
      return var10000;
   }

   @Redirect(
      method = {"method_3136()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_23321()D"
)
   )
   private double injectSendMovement$getZ(class_746 var1) {
      double var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_23321();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.getZ();
      return var10000;
   }

   @Redirect(
      method = {"method_3136()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_24828()Z"
)
   )
   private boolean injectSendMovement$isOnGround(class_746 var1) {
      boolean var10000;
      try {
         if (this.motionEvent == null) {
            var10000 = var1.method_24828();
            return var10000;
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      var10000 = this.motionEvent.isOnGround();
      return var10000;
   }

   @Redirect(
      method = {"method_3136()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_73189()Lnet/minecraft/class_243;"
)
   )
   private class_243 hookSendMovementPacketsGetPos(class_746 var1) {
      try {
         if (this.motionEvent == null) {
            return var1.method_73189();
         }
      } catch (JSONException var2) {
         throw a(var2);
      }

      return new class_243(this.motionEvent.getX(), this.motionEvent.getY(), this.motionEvent.getZ());
   }

   @ModifyExpressionValue(
      method = {"method_48300()Z"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_744;method_20622()Z"
)}
   )
   private boolean modifyIsWalking(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @ModifyExpressionValue(
      method = {"method_6007()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_744;method_20622()Z"
)}
   )
   private boolean modifyMovement(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @WrapWithCondition(
      method = {"method_6007()V"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_5728(Z)V",
   ordinal = 3
)}
   )
   private boolean wrapSetSprinting(class_746 var1, boolean var2) {
      boolean var10000;
      try {
         if (!((SprintModule)EvonClient.getInstance().getModuleManager().getModule(SprintModule.class)).isEnabled()) {
            var10000 = true;
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = false;
      return var10000;
   }

   @Inject(
      method = {"method_6104(Lnet/minecraft/class_1268;)V"},
      at = {@At("HEAD")}
   )
   private void hookSwingHandHead(class_1268 var1, CallbackInfo var2) {
      this.prevHandSwinging = this.field_6252;
      this.prevHandSwingTicks = this.field_6279;
   }

   @Inject(
      method = {"method_6104(Lnet/minecraft/class_1268;)V"},
      at = {@At("TAIL")}
   )
   private void hookSwingHandTail(class_1268 var1, CallbackInfo var2) {
      SwingHandEvent event = new SwingHandEvent(var1);

      try {
         C.Z(event);
         if (event.isCancelled()) {
            this.field_6252 = this.prevHandSwinging;
            this.field_6279 = this.prevHandSwingTicks;
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   @Redirect(
      method = {"method_48300()Z"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_6115()Z"
)
   )
   private boolean hookAllowSprint(class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_67270(Lnet/minecraft/class_241;)Lnet/minecraft/class_241;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_241;method_35582(F)Lnet/minecraft/class_241;",
   ordinal = 1
)
   )
   private class_241 redirectUseSlowdown(class_241 var1, float var2) {
      UseSlowdownEvent event = new UseSlowdownEvent();

      class_241 var10000;
      float var10001;
      try {
         C.Z(event);
         var10000 = var1;
         if (event.isCancelled()) {
            var10001 = 1.0F;
            return var10000.method_35582(var10001);
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      var10001 = var2;
      return var10000.method_35582(var10001);
   }

   @ModifyVariable(
      method = {"method_5784(Lnet/minecraft/class_1313;Lnet/minecraft/class_243;)V"},
      at = @At("HEAD"),
      name = {"arg2"},
      ordinal = 0,
      index = 2,
      argsOnly = true
   )
   private class_243 move(class_243 var1, class_1313 var2) {
      MoveEvent event = new MoveEvent(var1);
      C.Z(event);
      return event.getMovement();
   }

   @Unique
   public void evon$swingHandClientside(class_1268 hand) {
      super.method_6104(var1);
   }

   @Unique
   public void evon$swingHandServerside(class_1268 hand) {
      this.field_3944.method_52787(new class_2879(var1));
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
