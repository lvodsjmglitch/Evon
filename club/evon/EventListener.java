package club.evon;

import java.lang.reflect.Method;

public final class EventListener extends Record {
   private final Object object;
   private final Method method;
   private final int priority;

   public EventListener(Object object, Method method, int priority) {
      this.object = object;
      this.method = method;
      this.priority = -priority;
   }

   public final String toString() {
      return this.toString<invokedynamic>(this);
   }

   public final int hashCode() {
      return this.hashCode<invokedynamic>(this);
   }

   public final boolean equals(Object o) {
      return this.equals<invokedynamic>(this, o);
   }

   public Object getObject() {
      return this.object;
   }

   public Method getMethod() {
      return this.method;
   }

   public int getPriority() {
      return this.priority;
   }
}
