package club.evon;

import net.minecraft.class_1309;

public abstract class _r implements h {
   private _W c;
   private final String J;
   private static int[] S;

   public boolean j(class_1309 livingEntity) {
      return true;
   }

   public final void J() {
      C.P(this);
   }

   public final void s() {
      C.h(this.c);
      C.h(this);
   }

   public _r(String name) {
      this.J = var1;
   }

   public void t(_W proxyServer) {
      this.c = var1;
   }

   public String I() {
      return this.J;
   }

   public static void o(int[] var0) {
      S = var0;
   }

   public static int[] h() {
      return S;
   }

   static {
      if (h() == null) {
         o(new int[1]);
      }

   }
}
