package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import net.minecraft.class_1792;
import org.json.JSONException;

public final class y4 extends vJ<gj> {
   private int B;
   private int Q;
   private boolean l;
   private boolean V;
   private boolean D;
   private final HashMap<class_1792, Integer> s = new I(this);
   private static int F;
   private static final long b = ds.a(5109690774020636072L, 149500965223101160L, MethodHandles.lookup().lookupClass()).a(229108175590763L);

   public y4(String name, gj parent) {
      super(var1, var2);
   }

   @_S
   private void W(_D param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean W() {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void b(J0 param1) {
      // $FF: Couldn't be decompiled
   }

   @_S
   private void W(yN param1) {
      // $FF: Couldn't be decompiled
   }

   private int D() {
      // $FF: Couldn't be decompiled
   }

   public static void V(int var0) {
      F = var0;
   }

   public static int P() {
      return F;
   }

   public static int s() {
      int var0 = P();

      try {
         return var0 == 0 ? 52 : 0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      if (P() != 0) {
         V(6);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
