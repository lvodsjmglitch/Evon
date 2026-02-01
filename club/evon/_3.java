package club.evon;

import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public class _3 extends _V {
   private final t Y;
   private final _J W;
   private static String[] g;
   private static final long a = ds.a(-999579470410755135L, -7183248333826353285L, MethodHandles.lookup().lookupClass()).a(40656597054842L);

   public _3(t property) {
      long var2 = a ^ 2986692982970L;
      t();
      super();

      try {
         this.W = new _J(200, 0.0D, yn.LINEAR);
         this.Y = var1;
         if (gQ.q() == null) {
            s(new String[5]);
         }

      } catch (JSONException var5) {
         throw a(var5);
      }
   }

   public void l(int mouseX, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void W(double mouseX, double mouseY, int button) {
      // $FF: Couldn't be decompiled
   }

   public boolean l() {
      return this.Y.G();
   }

   public static void s(String[] var0) {
      g = var0;
   }

   public static String[] t() {
      return g;
   }

   static {
      if (t() != null) {
         s(new String[4]);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
