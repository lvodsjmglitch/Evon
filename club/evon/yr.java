package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_2350.class_2351;
import org.json.JSONException;

public final class yr implements JL {
   private class_243 g;
   private static final long a = ds.a(9140996949755137159L, 9114223504151018911L, MethodHandles.lookup().lookupClass()).a(66798765978680L);

   public float i() {
      return (float)Math.sqrt(this.g.method_10216() * this.g.method_10216() + this.g.method_10215() * this.g.method_10215());
   }

   public void e(double speed) {
      // $FF: Couldn't be decompiled
   }

   public void D(double speed, float yaw) {
      long var4 = a ^ 91579877329962L;
      yN.O();
      this.g = new class_243((double)(-class_3532.method_15374(var3)) * var1, this.g.method_10214(), (double)class_3532.method_15362(var3) * var1);

      try {
         ym.m.field_1724.method_18799(this.g.method_38499(class_2351.field_11052, ym.m.field_1724.method_18798().method_10214()));
         if (gQ.q() == null) {
            yN.w(new int[3]);
         }

      } catch (JSONException var7) {
         throw a(var7);
      }
   }

   public class_243 a() {
      return this.g;
   }

   public void D(class_243 movement) {
      this.g = var1;
   }

   public yr(class_243 movement) {
      this.g = var1;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
