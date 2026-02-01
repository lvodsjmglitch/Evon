package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_241;
import org.json.JSONException;

public final class AimHelper {
   private class_241 targetRotation;
   private boolean isActive;
   private boolean isAiming;
   private Float speed;
   private class_241 tickRotation;
   private boolean isLocked;
   private boolean shouldStop;
   private static final long a = ds.a(1610306107844463212L, -5040084140541418240L, MethodHandles.lookup().lookupClass()).a(273123445007295L);

   public AimHelper() {
      club.evon.C.P(this);
   }

   @_S
   public void onRender(v8 event) {
      // $FF: Couldn't be decompiled
   }

   @_S(
      h = 8
   )
   public void onTick(yN event) {
      // $FF: Couldn't be decompiled
   }

   public boolean isActive() {
      // $FF: Couldn't be decompiled
   }

   public void setTickRotation(class_241 tickRotation) {
      this.tickRotation = tickRotation;
   }

   public void stop() {
      // $FF: Couldn't be decompiled
   }

   private void updateRotation() {
      // $FF: Couldn't be decompiled
   }

   private void updateFromHelper() {
      RotationHelper helper = RotationManager.getRotationHelper();
      this.targetRotation = helper.getRotation();
   }

   public void aimAt(class_241 targetRotation, float speed) {
      long var3 = a ^ 94807084029947L;
      this.targetRotation = targetRotation;
      this.speed = speed;
      String var10000 = RotationHelper.getData();
      this.isAiming = true;
      this.isActive = true;
      String var5 = var10000;

      try {
         this.updateRotation();
         if (var5 == null) {
            gQ.o(new gQ[4]);
         }

      } catch (JSONException var6) {
         throw wrapException(var6);
      }
   }

   public void cancel() {
      this.shouldStop = true;
   }

   public class_241 getTargetRotation() {
      return this.targetRotation;
   }

   public boolean isCurrentlyActive() {
      return this.isActive;
   }

   public boolean isAiming() {
      return this.isAiming;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
