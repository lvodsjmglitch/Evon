package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_2350.class_2351;
import org.json.JSONException;

public final class MoveEvent implements EventMarker {
   private class_243 movement;
   private static final long a = ds.a(9140996949755137159L, 9114223504151018911L, MethodHandles.lookup().lookupClass()).a(66798765978680L);

   public float getSpeed() {
      return (float)Math.sqrt(this.movement.method_10216() * this.movement.method_10216() + this.movement.method_10215() * this.movement.method_10215());
   }

   public void setSpeed(double speed) {
      // $FF: Couldn't be decompiled
   }

   public void setSpeedAndYaw(double speed, float yaw) {
      long var4 = a ^ 91579877329962L;
      TickEvent.reset();
      this.movement = new class_243((double)(-class_3532.method_15374(yaw)) * speed, this.movement.method_10214(), (double)class_3532.method_15362(yaw) * speed);

      try {
         MinecraftHelper.client.field_1724.method_18799(this.movement.method_38499(class_2351.field_11052, MinecraftHelper.client.field_1724.method_18798().method_10214()));
         if (gQ.q() == null) {
            TickEvent.setData(new int[3]);
         }

      } catch (JSONException var7) {
         throw wrapException(var7);
      }
   }

   public class_243 getMovement() {
      return this.movement;
   }

   public void setMovement(class_243 movement) {
      this.movement = movement;
   }

   public MoveEvent(class_243 movement) {
      this.movement = movement;
   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
