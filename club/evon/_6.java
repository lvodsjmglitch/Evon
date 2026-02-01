package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_304;
import org.json.JSONException;

public final class _6 {
   private final class_304 x;
   private boolean c;
   private boolean g;
   private int T;
   private boolean J = true;
   private static int p;
   private static final long a = ds.a(-852647286984373716L, -5868646223759761421L, MethodHandles.lookup().lookupClass()).a(107938235820726L);

   public _6(class_304 keyBinding) {
      this.x = var1;
   }

   public void V() {
      long var1 = a ^ 46240538115728L;
      this.c = false;
      int var10000 = X();
      this.T = 0;
      int var3 = var10000;

      try {
         this.g = true;
         if (gQ.q() == null) {
            ++var3;
            b(var3);
         }

      } catch (JSONException var4) {
         throw a(var4);
      }
   }

   public void l() {
      this.Q(true, 0);
   }

   public void Q(boolean pressed, int holdTicks) {
      this.c = var1;
      this.T = var2;
   }

   public boolean e() {
      // $FF: Couldn't be decompiled
   }

   public boolean O() {
      // $FF: Couldn't be decompiled
   }

   public boolean d() {
      return this.c;
   }

   public void r() {
      // $FF: Couldn't be decompiled
   }

   public int n() {
      return this.T;
   }

   public boolean b() {
      return this.g;
   }

   public boolean M() {
      // $FF: Couldn't be decompiled
   }

   public void i(boolean showSwings) {
      this.J = var1;
   }

   public class_304 L() {
      return this.x;
   }

   public static void b(int var0) {
      p = var0;
   }

   public static int Q() {
      return p;
   }

   public static int X() {
      int var0 = Q();

      try {
         return var0 == 0 ? 123 : 0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      if (Q() == 0) {
         b(34);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
