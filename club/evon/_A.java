package club.evon;

import club.evon.launch.Loader;
import club.evon.launch.hidden.Hidden0;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import net.minecraft.class_1309;
import org.json.JSONException;

public final class _A extends _r {
   private final Set<UUID> X = ConcurrentHashMap.newKeySet();
   private final Set<Integer> j = ConcurrentHashMap.newKeySet();
   public static final Pattern V;
   public static final List<Pattern> U;
   private static int v;
   private static final long a;
   private static final String[] b;

   public _A() {
      super(b[9]);
   }

   public boolean j(class_1309 livingEntity) {
      // $FF: Couldn't be decompiled
   }

   @_S
   public native void d(v3 event);

   @_S
   public void I(vK event) {
      this.j.clear();
      this.X.clear();
   }

   @_S
   public void x(yN event) {
      // $FF: Couldn't be decompiled
   }

   public native boolean q(String teamName);

   static {
      Loader.attachNatives(1, _A.class);
      Hidden0.special_clinit_1_60(_A.class);
   }

   public static void O(int var0) {
      v = var0;
   }

   public static int e() {
      return v;
   }

   public static int M() {
      int var0 = e();

      try {
         return var0 == 0 ? 17 : 0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }
}
