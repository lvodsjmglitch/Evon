package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_583;
import org.json.JSONException;

public final class S {
   private final class_583 w;
   private final class_4587 N;
   private final class_4588 L;
   private final int p;
   private final int F;
   private boolean J;
   private static final long a = ds.a(-4290666306662234176L, 6635139558346916269L, MethodHandles.lookup().lookupClass()).a(98009725107128L);

   public S(class_583 model, class_4587 matrices, class_4588 vertexConsumer, int light, int overlay) {
      long var6 = a ^ 51975144001241L;
      super();
      this.J = true;
      this.w = var1;
      this.N = var2;
      this.L = var3;
      String var10000 = zx.t();
      this.p = var4;
      String var8 = var10000;

      try {
         this.F = var5;
         if (var8 != null) {
            gQ.o(new gQ[5]);
         }

      } catch (JSONException var9) {
         throw a(var9);
      }
   }

   public class_583 m() {
      return this.w;
   }

   public class_4587 p() {
      return this.N;
   }

   public class_4588 M() {
      return this.L;
   }

   public int b() {
      return this.p;
   }

   public int g() {
      return this.F;
   }

   public boolean T() {
      return this.J;
   }

   public void D(boolean state) {
      this.J = var1;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
