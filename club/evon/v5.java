package club.evon;

import java.util.ArrayList;
import java.util.List;

public final class v5 {
   private final List<Ju> D = new ArrayList();
   private static gQ[] x;

   public v5() {
      C.P(this);
   }

   public y6 V() {
      return new y6(this);
   }

   public static void D(gQ[] var0) {
      x = var0;
   }

   public static gQ[] T() {
      return x;
   }

   static {
      if (T() == null) {
         D(new gQ[2]);
      }

   }
}
