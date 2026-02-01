package club.evon;

import java.lang.invoke.MethodHandles;
import net.hypixel.data.type.ServerType;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

public final class vh extends Record {
   private final String y;
   @Nullable
   private final ServerType b;
   @Nullable
   private final String h;
   @Nullable
   private final String s;
   @Nullable
   private final String v;
   private static final long a = ds.a(-6473258005651327509L, 4095316299414946426L, MethodHandles.lookup().lookupClass()).a(24991682417778L);

   public vh(String serverName, @Nullable ServerType serverType, @Nullable String lobbyName, @Nullable String mode, @Nullable String map) {
      long var6 = a ^ 13302994118126L;
      int var10000 = _A.e();
      super();
      this.y = var1;
      this.b = var2;
      int var8 = var10000;

      try {
         this.h = var3;
         this.s = var4;
         this.v = var5;
         if (var8 == 0) {
            gQ.o(new gQ[4]);
         }

      } catch (JSONException var9) {
         throw a(var9);
      }
   }

   public boolean N() {
      long var1 = a ^ 120969852679003L;

      boolean var10000;
      try {
         if (this.h != null) {
            var10000 = true;
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = false;
      return var10000;
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

   public String Y() {
      return this.y;
   }

   @Nullable
   public ServerType B() {
      return this.b;
   }

   @Nullable
   public String H() {
      return this.h;
   }

   @Nullable
   public String S() {
      return this.s;
   }

   @Nullable
   public String v() {
      return this.v;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
