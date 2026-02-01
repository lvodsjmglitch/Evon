package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.function.BooleanSupplier;
import org.json.JSONException;

public abstract class B<T> {
   private final String Q;
   private BooleanSupplier U;
   private T d;
   private static String[] D;
   private static final long a = ds.a(-7637434297370900796L, 1589824554498848735L, MethodHandles.lookup().lookupClass()).a(171254262767149L);

   public B(String name, T value) {
      this.Q = var1;
      this.d = var2;
   }

   public final void q(BooleanSupplier visible) {
      this.U = var1;
   }

   public final boolean G() {
      // $FF: Couldn't be decompiled
   }

   public List<B<?>> H() {
      return null;
   }

   public String S() {
      return this.Q;
   }

   public BooleanSupplier b() {
      return this.U;
   }

   public T J() {
      return this.d;
   }

   public void P(T value) {
      this.d = var1;
   }

   public static void T(String[] var0) {
      D = var0;
   }

   public static String[] Q() {
      return D;
   }

   static {
      if (Q() != null) {
         T(new String[1]);
      }

   }

   private static JSONException b(JSONException var0) {
      return var0;
   }
}
