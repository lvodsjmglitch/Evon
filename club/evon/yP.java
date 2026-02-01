package club.evon;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventBus {
   private final Map<Type, CopyOnWriteArrayList<EventListener>> listeners = new HashMap();
   private static gQ[] data;
   private static final long a = ds.a(-7422857683936330028L, 3074906052788739506L, MethodHandles.lookup().lookupClass()).a(156229016609415L);

   public void register(Object listener) {
      long var2 = a ^ 65944007266492L;
      Method[] methods = listener.getClass().getDeclaredMethods();
      int methodCount = methods.length;

      for(int i = 0; i < methodCount; ++i) {
         Method method = methods[i];

         try {
            if (!method.isAnnotationPresent(EventListener.class)) {
               continue;
            }
         } catch (RuntimeException var12) {
            throw wrapException(var12);
         }

         EventListener annotation = method.getDeclaredAnnotation(EventListener.class);

         try {
            if (!method.canAccess(listener)) {
               method.setAccessible(true);
            }
         } catch (RuntimeException var11) {
            throw wrapException(var11);
         }

         Class<?> eventType = method.getParameterTypes()[0];
         EventListener listenerWrapper = new EventListener(listener, method, annotation.h());
         ((CopyOnWriteArrayList)this.listeners.computeIfAbsent(eventType, (type) -> {
            return new CopyOnWriteArrayList();
         })).add(listenerWrapper);
      }

      this.sortListeners();
   }

   private void sortListeners() {
      long var1 = a ^ 85662799425762L;
      Iterator var3 = this.listeners.values().iterator();

      while(var3.hasNext()) {
         CopyOnWriteArrayList var4 = (CopyOnWriteArrayList)var3.next();
         var4.sort(Comparator.comparingInt(EventListener::getPriority));
      }

   }

   public void unregister(Object listener) {
      long var2 = a ^ 73004777450324L;
      Iterator var4 = this.listeners.values().iterator();

      while(var4.hasNext()) {
         CopyOnWriteArrayList var5 = (CopyOnWriteArrayList)var4.next();
         var5.removeIf((wrapper) -> {
            return wrapper.getObject().equals(listener);
         });
      }

      this.sortListeners();
   }

   public <T> void dispatch(T event) {
      long var2 = a ^ 109522585646289L;
      CopyOnWriteArrayList listeners = (CopyOnWriteArrayList)this.listeners.getOrDefault(event.getClass(), (Object)null);

      try {
         if (listeners == null || listeners.isEmpty()) {
            return;
         }
      } catch (IllegalAccessException var10) {
         throw wrapException(var10);
      }

      try {
         Iterator iterator = listeners.iterator();

         while(iterator.hasNext()) {
            EventListener listenerWrapper = (EventListener)iterator.next();
            listenerWrapper.getMethod().invoke(listenerWrapper.getObject(), event);
            if (event instanceof Event) {
               Event eventObj = (Event)event;

               try {
                  if (eventObj.isCancelled()) {
                     break;
                  }
               } catch (IllegalAccessException var8) {
                  throw wrapException(var8);
               }
            }
         }
      } catch (InvocationTargetException | IllegalAccessException var9) {
         throw new RuntimeException(var9);
      }

   }

   public static void setData(gQ[] data) {
      EventBus.data = data;
   }

   public static gQ[] getData() {
      return data;
   }

   static {
      if (getData() != null) {
         setData(new gQ[5]);
      }

   }

   private static Exception wrapException(Exception var0) {
      return var0;
   }
}
