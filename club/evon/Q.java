package club.evon;

import net.minecraft.class_2583;

final class Q extends Record {
   private final class_2583 d;
   private final boolean c;
   private final int x;

   private Q(class_2583 var1, boolean var2, int var3) {
      this.d = var1;
      this.c = var2;
      this.x = var3;
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

   public class_2583 d() {
      return this.d;
   }

   public boolean C() {
      return this.c;
   }

   public int x() {
      return this.x;
   }
}
