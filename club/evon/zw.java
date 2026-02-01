package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

public final class zw {
   private final J_<?> G;
   @Nullable
   private final zM y;
   private final List<zp> d;
   private static final long a = ds.a(1921436192998728942L, -271328302396168585L, MethodHandles.lookup().lookupClass()).a(255454477389516L);

   public zw(J_<?> networkBlockage, @Nullable zM packetValidator) {
      long var3 = a ^ 70927842804816L;
      ya.g();
      super();

      try {
         this.d = new ArrayList();
         this.G = var1;
         this.y = var2;
         if (gQ.q() == null) {
            ya.W(new gQ[5]);
         }

      } catch (JSONException var6) {
         throw a(var6);
      }
   }

   public zw(J_<?> networkBlockage) {
      this(var1, (zM)null);
   }

   public void w() {
      gQ[] var10000 = ya.g();
      List var2;
      synchronized(var2 = this.d){}
      gQ[] var1 = var10000;
      boolean var6 = false;

      try {
         var6 = true;
         this.d.add(this.G.v((yy)null, this.y));
         var6 = false;
      } finally {
         if (var6) {
            ;
         }
      }

      try {
         if (var1 != null) {
            gQ.o(new gQ[1]);
         }

      } catch (JSONException var7) {
         throw a(var7);
      }
   }

   public void A(int count) {
      long var2 = a ^ 33696853792463L;
      gQ[] var10000 = ya.g();
      List var5;
      synchronized(var5 = this.d){}
      gQ[] var4 = var10000;

      try {
         while(!this.d.isEmpty() && var1 > 0) {
            zp var6 = (zp)this.d.removeFirst();
            this.G.n(var6);
            --var1;
            if (var4 != null) {
               break;
            }
         }

      } finally {
         ;
      }
   }

   public void l() {
      long var1 = a ^ 8883992886260L;
      gQ[] var10000 = ya.g();
      List var4;
      synchronized(var4 = this.d){}
      gQ[] var3 = var10000;

      try {
         while(!this.d.isEmpty()) {
            zp var5 = (zp)this.d.removeFirst();

            try {
               this.G.n(var5);
               if (var3 == null && var3 == null) {
                  continue;
               }
               break;
            } catch (JSONException var9) {
               throw a(var9);
            }
         }

      } finally {
         ;
      }
   }

   public boolean Y() {
      long var1 = a ^ 108861219813293L;
      gQ[] var10000 = ya.g();
      List var4;
      synchronized(var4 = this.d){}
      gQ[] var3 = var10000;

      try {
         boolean var10;
         label58: {
            try {
               var10 = this.d.isEmpty();
               if (var3 != null) {
                  return var10;
               }

               if (!var10) {
                  break label58;
               }
            } catch (JSONException var8) {
               throw a(var8);
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

   public int u() {
      synchronized(this.d) {
         return this.d.size();
      }
   }

   public List<zp> a() {
      return this.d;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
