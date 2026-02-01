package club.evon;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public class _h<T extends B<?>> extends _V {
   private final T a;
   private static int i;
   private static final long e = ds.a(-3734372755062442346L, -6016942586133173802L, MethodHandles.lookup().lookupClass()).a(27808592885690L);

   public _h(T property) {
      long var2 = e ^ 50113782123357L;
      super();
      int var10000 = R();
      this.a = var1;
      int var4 = var10000;

      try {
         if (gQ.q() == null) {
            ++var4;
            k(var4);
         }

      } catch (JSONException var5) {
         throw b(var5);
      }
   }

   public void l(int mouseX, int mouseY) {
      long var3 = e ^ 32385928775654L;
      int var10000 = t();
      float var6 = this.j();
      float var7 = this.F();
      Js.a.U(this.a.S(), var6 + 4.5F, var7 + 3.5F, 7.5F, this.Y().getRGB());
      int var5 = var10000;

      try {
         if (var5 == 0) {
            gQ.o(new gQ[3]);
         }

      } catch (JSONException var8) {
         throw b(var8);
      }
   }

   public boolean l() {
      return this.a.G();
   }

   protected Color Y() {
      return Js.X;
   }

   protected T d() {
      return this.a;
   }

   public static void k(int var0) {
      i = var0;
   }

   public static int R() {
      return i;
   }

   public static int t() {
      int var0 = R();

      try {
         return var0 == 0 ? 87 : 0;
      } catch (JSONException var1) {
         throw b(var1);
      }
   }

   static {
      if (t() == 0) {
         k(118);
      }

   }

   private static JSONException b(JSONException var0) {
      return var0;
   }
}
