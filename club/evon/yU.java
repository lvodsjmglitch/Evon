package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.class_2583;
import net.minecraft.class_5224;
import net.minecraft.class_5481;
import org.json.JSONException;

public class yU implements class_5481 {
   private final List<Q> Y;
   private static final long a = ds.a(-6719074980873505722L, 2937267724529178991L, MethodHandles.lookup().lookupClass()).a(210696054763605L);

   public yU(class_5481 original) {
      // $FF: Couldn't be decompiled
   }

   public boolean accept(class_5224 visitor) {
      // $FF: Couldn't be decompiled
   }

   private static boolean lambda$new$0(List var0, int var1, class_2583 var2, int var3) {
      long var4 = a ^ 51790860051519L;

      List var10000;
      Q var10001;
      Q var10002;
      class_2583 var10003;
      boolean var10004;
      label17: {
         try {
            var10000 = var0;
            var10001 = new Q;
            var10002 = var10001;
            var10003 = var2;
            if (var2.method_10973() != null) {
               var10004 = true;
               break label17;
            }
         } catch (JSONException var6) {
            throw a(var6);
         }

         var10004 = false;
      }

      var10002.<init>(var10003, var10004, var3);
      var10000.add(var10001);
      return true;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
