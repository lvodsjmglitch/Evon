package club.evon;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class vJ<T extends gQ> {
   protected final String j;
   protected final T a;
   protected final ArrayList<B<?>> n = new ArrayList();
   private static int[] H;

   public final void j(B<?>... properties) {
      this.n.addAll(Arrays.asList(var1));
   }

   public void S() {
   }

   public void Y() {
   }

   public boolean V() {
      return this.v().d();
   }

   public final void m() {
      C.P(this);
      this.S();
   }

   public void z() {
      C.h(this);
      this.Y();
   }

   public String R() {
      return this.j;
   }

   public T v() {
      return this.a;
   }

   public ArrayList<B<?>> V() {
      return this.n;
   }

   public vJ(String name, T parent) {
      this.j = var1;
      this.a = var2;
   }

   public static void Y(int[] var0) {
      H = var0;
   }

   public static int[] n() {
      return H;
   }

   static {
      if (n() != null) {
         Y(new int[2]);
      }

   }
}
