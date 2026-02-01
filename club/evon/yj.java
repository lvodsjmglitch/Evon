package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_241;
import org.json.JSONException;

public final class RotationHelper {
   private class_241 rotation;
   private boolean isTicking;
   private float yaw;
   private float pitch;
   private float prevYaw;
   private float prevPitch;
   private static String data;
   private static final long a = ds.a(7791061390677093680L, 1494291138135756402L, MethodHandles.lookup().lookupClass()).a(57421458649807L);

   public RotationHelper() {
      C.P(this);
   }

   @_S(
      h = 1
   )
   public void onRender(v8 event) {
      // $FF: Couldn't be decompiled
   }

   private void updateRotation() {
      this.rotation = _0.t();
      this.yaw = MinecraftHelper.client.field_1724.field_3931;
      this.pitch = MinecraftHelper.client.field_1724.field_3932;
      this.prevYaw = MinecraftHelper.client.field_1724.field_3914;
      this.prevPitch = MinecraftHelper.client.field_1724.field_3916;
   }

   public void update() {
      // $FF: Couldn't be decompiled
   }

   public void stopTicking() {
      this.isTicking = false;
   }

   public void reset() {
      // $FF: Couldn't be decompiled
   }

   public float getYaw(float fallback) {
      // $FF: Couldn't be decompiled
   }

   public float getPitch(float fallback) {
      // $FF: Couldn't be decompiled
   }

   public float getPrevYaw(float fallback) {
      // $FF: Couldn't be decompiled
   }

   public float getPrevPitch(float fallback) {
      // $FF: Couldn't be decompiled
   }

   public float getYawDelta(float fallback) {
      // $FF: Couldn't be decompiled
   }

   public float getPitchDelta(float fallback) {
      // $FF: Couldn't be decompiled
   }

   public class_241 getRotation() {
      // $FF: Couldn't be decompiled
   }

   public void setRotation(class_241 rotation) {
      this.rotation = rotation;
   }

   public void setTicking(boolean ticking) {
      this.isTicking = ticking;
   }

   public static void setData(String value) {
      data = value;
   }

   public static String getData() {
      return data;
   }

   static {
      if (getData() == null) {
         setData("xAAvWc");
      }

   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
