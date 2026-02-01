package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import net.minecraft.class_2561;
import org.json.JSONException;

public final class vi extends vt {
   private class_2561 i;
   private zT w;
   private UUID C;
   private static boolean x;
   private static final long a = ds.a(4918192767441285790L, -1683407685036759468L, MethodHandles.lookup().lookupClass()).a(220360309038175L);

   public vi(class_2561 text, zT messageType) {
      this.i = var1;
      this.w = var2;
   }

   public class_2561 G() {
      return this.i;
   }

   public zT B() {
      return this.w;
   }

   public UUID p() {
      return this.C;
   }

   public void z(class_2561 text) {
      this.i = var1;
   }

   public void d(zT type) {
      this.w = var1;
   }

   public void V(UUID sender) {
      this.C = var1;
   }

   public vi(class_2561 text, zT type, UUID sender) {
      // $FF: Couldn't be decompiled
   }

   public static void e(boolean var0) {
      x = var0;
   }

   public static boolean i() {
      return x;
   }

   public static boolean q() {
      boolean var0 = i();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw b(var1);
      }
   }

   static {
      if (!i()) {
         e(true);
      }

   }

   private static JSONException b(JSONException var0) {
      return var0;
   }
}
