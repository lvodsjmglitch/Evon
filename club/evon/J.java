package club.evon;

import club.evon.mixins.MinecraftClientAccessor;
import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import java.lang.invoke.MethodHandles;
import java.util.Optional;
import net.minecraft.class_320;

public final class J {
   private String r;
   private String j;
   private String n;
   private String Q;
   private static final long a = ds.a(-6338126182549272719L, 5955266365164259289L, MethodHandles.lookup().lookupClass()).a(224127752516094L);

   public boolean l() {
      // $FF: Couldn't be decompiled
   }

   public void g() {
      long var1 = a ^ 117498909458344L;
      int[] var3 = _v.Y();

      try {
         if (!this.l()) {
            return;
         }
      } catch (Exception var12) {
         throw a(var12);
      }

      MinecraftClientAccessor var4 = (MinecraftClientAccessor)ym.m;

      class_320 var6;
      String var10000;
      label101: {
         label89: {
            try {
               var10000 = this.j;
               if (var3 != null) {
                  break label101;
               }

               if (var10000 != null) {
                  break label89;
               }
            } catch (Exception var11) {
               throw a(var11);
            }

            var10000 = this.r;
            break label101;
         }

         try {
            MicrosoftAuthResult var5 = _c.d.loginWithRefreshToken(this.j);

            label56: {
               try {
                  if (var3 != null) {
                     break label56;
                  }

                  if (var5 == null) {
                     return;
                  }
               } catch (Exception var7) {
                  throw a(var7);
               }

               this.j = var5.getRefreshToken();
            }

            var6 = new class_320(var5.getProfile().getName(), _c.N(var5.getProfile().getId()), var5.getAccessToken(), Optional.empty(), Optional.empty());
            var4.setSession(var6);
         } catch (Exception var8) {
         }

         return;
      }

      label80: {
         label79: {
            try {
               if (var3 != null) {
                  break label80;
               }

               if (var10000 == null) {
                  break label79;
               }
            } catch (Exception var10) {
               throw a(var10);
            }

            var10000 = this.r;
            break label80;
         }

         class_320 var13 = new class_320(this.Q, _c.N(this.n), "0", Optional.empty(), Optional.empty());
         var4.setSession(var13);
         return;
      }

      J var14 = _c.r(var10000);

      J var15;
      label69: {
         try {
            var15 = var14;
            if (var3 != null) {
               break label69;
            }

            if (var14 == null) {
               return;
            }
         } catch (Exception var9) {
            throw a(var9);
         }

         this.Q = var14.Q;
         this.n = var14.n;
         var15 = this;
      }

      var15.r = var14.c();
      var6 = new class_320(this.Q, _c.N(this.n), this.r, Optional.empty(), Optional.empty());
      var4.setSession(var6);
   }

   public String c() {
      return this.r;
   }

   public String t() {
      return this.j;
   }

   public String x() {
      return this.n;
   }

   public String F() {
      return this.Q;
   }

   public void v(String token) {
      this.r = var1;
   }

   public void L(String newRefreshToken) {
      this.j = var1;
   }

   public void V(String uuid) {
      this.n = var1;
   }

   public void X(String username) {
      this.Q = var1;
   }

   public J(String token, String newRefreshToken, String uuid, String username) {
      this.r = var1;
      this.j = var2;
      this.n = var3;
      this.Q = var4;
   }

   private static Exception a(Exception var0) {
      return var0;
   }
}
