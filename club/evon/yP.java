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

public final class yP {
   private final Map<Type, CopyOnWriteArrayList<z1>> f = new HashMap();
   private static gQ[] V;
   private static final long a = ds.a(-7422857683936330028L, 3074906052788739506L, MethodHandles.lookup().lookupClass()).a(156229016609415L);

   public void u(Object object) {
      long var2 = a ^ 65944007266492L;
      Method[] var4 = var1.getClass().getDeclaredMethods();
      int var5 = var4.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         Method var7 = var4[var6];

         try {
            if (!var7.isAnnotationPresent(_S.class)) {
               continue;
            }
         } catch (RuntimeException var12) {
            throw a(var12);
         }

         _S var8 = (_S)var7.getDeclaredAnnotation(_S.class);

         try {
            if (!var7.canAccess(var1)) {
               var7.setAccessible(true);
            }
         } catch (RuntimeException var11) {
            throw a(var11);
         }

         Class var9 = var7.getParameterTypes()[0];
         z1 var10 = new z1(var1, var7, var8.h());
         ((CopyOnWriteArrayList)this.f.computeIfAbsent(var9, (var0) -> {
            return new CopyOnWriteArrayList();
         })).add(var10);
      }

      this.N();
   }

   private void N() {
      long var1 = a ^ 85662799425762L;
      Iterator var3 = this.f.values().iterator();

      while(var3.hasNext()) {
         CopyOnWriteArrayList var4 = (CopyOnWriteArrayList)var3.next();
         var4.sort(Comparator.comparingInt(z1::k));
      }

   }

   public void X(Object object) {
      long var2 = a ^ 73004777450324L;
      Iterator var4 = this.f.values().iterator();

      while(var4.hasNext()) {
         CopyOnWriteArrayList var5 = (CopyOnWriteArrayList)var4.next();
         var5.removeIf((var1x) -> {
            return var1x.p().equals(var1);
         });
      }

      this.N();
   }

   public <T> void F(T event) {
      long var2 = a ^ 109522585646289L;
      CopyOnWriteArrayList var4 = (CopyOnWriteArrayList)this.f.getOrDefault(var1.getClass(), (Object)null);

      try {
         if (var4 == null || var4.isEmpty()) {
            return;
         }
      } catch (IllegalAccessException var10) {
         throw a(var10);
      }

      try {
         Iterator var5 = var4.iterator();

         while(var5.hasNext()) {
            z1 var6 = (z1)var5.next();
            var6.M().invoke(var6.p(), var1);
            if (var1 instanceof vt) {
               vt var7 = (vt)var1;

               try {
                  if (var7.e()) {
                     break;
                  }
               } catch (IllegalAccessException var8) {
                  throw a(var8);
               }
            }
         }
      } catch (InvocationTargetException | IllegalAccessException var9) {
         throw new RuntimeException(var9);
      }

   }

   public static void M(gQ[] var0) {
      V = var0;
   }

   public static gQ[] u() {
      return V;
   }

   static {
      if (u() != null) {
         M(new gQ[5]);
      }

   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
