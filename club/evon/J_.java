package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

public abstract class J_<T extends class_2547> {
   private final List<zp> F = new ArrayList();
   private final List<_G> Y = new ArrayList();
   private long p;
   protected final Object n = new Object();
   private static String d;
   private static final long a = ds.a(-710086680365985718L, 6257072623610823175L, MethodHandles.lookup().lookupClass()).a(84923891464150L);

   public zp B() {
      return this.v((yy)null, (zM)null);
   }

   public zp v(yy packetTransformer, zM packetValidator) {
      return this.a(var1, var2, false);
   }

   public zp a(yy packetTransformer, zM packetValidator, boolean priority) {
      long var4 = a ^ 109423438090695L;
      String var10000 = d();
      Object var7;
      synchronized(var7 = this.n){}
      String var6 = var10000;
      boolean var11 = false;

      zp var13;
      try {
         var11 = true;
         zp var8 = new zp(var1, var2, var3, this.o());
         this.F.add(var8);
         var13 = var8;
         var11 = false;
      } finally {
         if (var11) {
            ;
         }
      }

      if (var6 == null) {
         gQ.o(new gQ[4]);
      }

      return var13;
   }

   private long o() {
      // $FF: Couldn't be decompiled
   }

   public void n(zp networkBlock) {
      // $FF: Couldn't be decompiled
   }

   private void w(@Nullable Long param1, @Nullable yy param2) {
      // $FF: Couldn't be decompiled
   }

   protected abstract void x(class_2535 var1, class_2596<?> var2);

   public boolean E(class_2596<?> packet) {
      // $FF: Couldn't be decompiled
   }

   private void z() {
      synchronized(this.n) {
         this.F.sort(Comparator.comparingLong(zp::i));
         this.Y.sort(Comparator.comparingLong(_G::h));
      }
   }

   public void o() {
      synchronized(this.n) {
         this.F.clear();
         this.Y.clear();
         this.p = 0L;
      }
   }

   public boolean N() {
      long var1 = a ^ 49920674834622L;
      String var10000 = d();
      Object var4;
      synchronized(var4 = this.n){}
      String var3 = var10000;

      try {
         boolean var10;
         label58: {
            try {
               var10 = this.F.isEmpty();
               if (var3 == null) {
                  return var10;
               }

               if (!var10) {
                  break label58;
               }
            } catch (JSONException var8) {
               throw b(var8);
            }

            var10 = false;
            return var10;
         }

         var10 = true;
         return var10;
      } finally {
         ;
      }
   }

   public List<zp> K() {
      return this.F;
   }

   public List<_G> m() {
      return this.Y;
   }

   public long P() {
      return this.p;
   }

   public Object a() {
      return this.n;
   }

   public static void g(String var0) {
      d = var0;
   }

   public static String d() {
      return d;
   }

   static {
      if (d() == null) {
         g("PGdYO");
      }

   }

   private static JSONException b(JSONException var0) {
      return var0;
   }
}
