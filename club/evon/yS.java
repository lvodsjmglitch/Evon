package club.evon;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_304;
import org.json.JSONException;

public final class yS {
   private final Map<class_304, _6> m = new HashMap();
   private final _6 R;
   private final _6 g;
   private static yS n;
   private static boolean V;

   private yS() {
      this.R = this.I(new _6(ym.m.field_1690.field_1886));
      this.g = this.I(new _6(ym.m.field_1690.field_1904));
   }

   private <T extends _6> T I(T var1) {
      this.m.put(var1.L(), var1);
      return var1;
   }

   public void h() {
      this.R.r();
      this.g.r();
   }

   public static _6 t(class_304 binding) {
      return (_6)n.m.get(var0);
   }

   public static _6 J() {
      return n.R;
   }

   public static _6 e() {
      return n.g;
   }

   public static void C() {
      n = new yS();
   }

   public static yS y() {
      return n;
   }

   public static void p(boolean var0) {
      V = var0;
   }

   public static boolean C() {
      return V;
   }

   public static boolean p() {
      boolean var0 = C();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   static {
      if (p()) {
         p(true);
      }

   }
}
