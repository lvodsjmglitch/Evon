package club.evon.mixins;

import club.evon.C;
import club.evon.ds;
import club.evon.gv;
import club.evon.vc;
import club.evon.ym;
import club.evon.zy;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1268;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1320;
import net.minecraft.class_1937;
import net.minecraft.class_6880;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({class_1309.class})
public abstract class LivingEntityMixin extends class_1297 {
   @Shadow
   public int field_6228;
   @Shadow
   public float field_6250;
   @Shadow
   public float field_6212;
   private static final long a = ds.a(-574741364660145740L, -417458646480008180L, MethodHandles.lookup().lookupClass()).a(201437681801141L);
   private static final long b;

   public LivingEntityMixin(class_1299<?> type, class_1937 world) {
      super(var1, var2);
   }

   @Shadow
   protected abstract void method_6043();

   @Shadow
   public abstract boolean method_6115();

   @Shadow
   public abstract double method_45325(class_6880<class_1320> var1);

   @Shadow
   public abstract boolean method_6059(class_6880<class_1291> var1);

   @Shadow
   public abstract class_1293 method_6112(class_6880<class_1291> var1);

   @Redirect(
      method = {"method_6007()V"},
      at = @At(
   value = "FIELD",
   target = "Lnet/minecraft/class_1309;field_6228:I",
   opcode = 181,
   ordinal = 1
)
   )
   private void modifyJumpingCooldown(class_1309 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @Inject(
      method = {"method_6043()V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void jumpHead(CallbackInfo var1) {
      try {
         if (this != ym.m.field_1724) {
            return;
         }
      } catch (JSONException var4) {
         throw a(var4);
      }

      vc var2 = new vc(this.method_5624());

      try {
         C.Z(var2);
         if (var2.e()) {
            var1.cancel();
         }

      } catch (JSONException var3) {
         throw a(var3);
      }
   }

   @ModifyConstant(
      method = {"method_6028()I"},
      constant = {@Constant(
   intValue = 6
)}
   )
   private int modifyHandSwingDuration(int var1) {
      gv var2 = (gv)zy.p().q().R(gv.class);

      int var10000;
      try {
         if (var2.d()) {
            var10000 = (int)((float)var1 * var2.d());
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = var1;
      return var10000;
   }

   @Redirect(
      method = {"method_7329(Lnet/minecraft/class_1799;ZZ)Lnet/minecraft/class_1542;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_6104(Lnet/minecraft/class_1268;)V"
)
   )
   private void redirectDropSwing(class_1309 param1, class_1268 param2) {
      // $FF: Couldn't be decompiled
   }

   @Redirect(
      method = {"method_6043()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_36454()F"
)
   )
   private float redirectYaw(class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 36533481501564L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -9218813711732707894L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var7 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      b = var7;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
