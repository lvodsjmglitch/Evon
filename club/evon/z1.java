package club.evon;

import java.lang.reflect.Method;

public final class z1 extends Record {
   private final Object p;
   private final Method m;
   private final int k;

   public z1(Object object, Method eventListener, int priority) {
      this.p = var1;
      this.m = var2;
      this.k = -var3;
   }

   public final String toString() {
      return this.toString<invokedynamic>(this);
   }

   public final int hashCode() {
      return this.hashCode<invokedynamic>(this);
   }

   public final boolean equals(Object o) {
      return this.equals<invokedynamic>(this, var1);
   }

   public Object p() {
      return this.p;
   }

   public Method M() {
      return this.m;
   }

   public int k() {
      return this.k;
   }
}
