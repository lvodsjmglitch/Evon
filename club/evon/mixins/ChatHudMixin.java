package club.evon.mixins;

import club.evon.Jw;
import club.evon.w;
import club.evon.ym;
import java.util.ArrayList;
import java.util.Iterator;
import net.minecraft.class_124;
import net.minecraft.class_2583;
import net.minecraft.class_338;
import net.minecraft.class_5481;
import net.minecraft.class_742;
import net.minecraft.class_303.class_7590;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_338.class})
public abstract class ChatHudMixin {
   @Unique
   private static class_2583 GRAY_STYLE;
   private static final String a;

   @Redirect(
      method = {"method_71991(ILnet/minecraft/class_332;FIIILnet/minecraft/class_303$class_7590;IF)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_303$class_7590;comp_896()Lnet/minecraft/class_5481;"
)
   )
   private class_5481 appendSocketUsernames(class_7590 var1) {
      try {
         if (GRAY_STYLE == null) {
            GRAY_STYLE = class_2583.field_24360.method_10977(class_124.field_1080);
         }
      } catch (JSONException var16) {
         throw a(var16);
      }

      ArrayList var2 = new ArrayList();
      StringBuilder var3 = new StringBuilder();
      var1.comp_896().accept((var2x, var3x, var4x) -> {
         var2.add(class_5481.method_30747(String.valueOf((char)var4x), var3x));
         var3.append((char)var4x);
         return true;
      });
      String var4 = var3.toString();
      int var5 = 0;
      Iterator var6 = ym.m.field_1687.method_18456().iterator();

      label56:
      while(var6.hasNext()) {
         class_742 var7 = (class_742)var6.next();
         String var8 = null;
         var8 = var7.method_5477().getString();
         int var9 = 0;

         while(true) {
            int var10;
            while(true) {
               var10 = var4.indexOf(var8, var9);

               try {
                  if (var10 == -1) {
                     continue label56;
                  }
               } catch (JSONException var13) {
                  throw a(var13);
               }

               if (var10 > 0) {
                  char var11 = var4.charAt(var10 - 1);

                  try {
                     if (var11 != ' ' && var11 != '<') {
                        break;
                     }
                  } catch (JSONException var15) {
                     throw a(var15);
                  }
               }

               w var17 = Jw.a().B(var8);

               try {
                  if (var17 == null) {
                     continue label56;
                  }
               } catch (JSONException var14) {
                  throw a(var14);
               }

               int var12 = var10 + var8.length();
               var2.add(var12 + var5, class_5481.method_34909(new class_5481[]{class_5481.method_30747(a, GRAY_STYLE), class_5481.method_30747(var17.f(), class_2583.field_24360.method_27703(var17.i().A())), class_5481.method_30747(")", GRAY_STYLE)}));
               var9 = var12;
               ++var5;
            }

            var9 = var10 + var8.length();
         }
      }

      return class_5481.method_30749(var2);
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }

   static {
      char[] var10003 = "8\u007f".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 70;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 70;
         var10006 = var0;
      } else {
         var4 = 70;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            a = var6;
            return;
         }

         var10005 = var10003;
         var5 = 70;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 94;
            break;
         case 1:
            var16 = 17;
            break;
         case 2:
            var16 = 31;
            break;
         case 3:
            var16 = 53;
            break;
         case 4:
            var16 = 89;
            break;
         case 5:
            var16 = 99;
            break;
         default:
            var16 = 17;
         }

         var10005[var10006] = (char)(var15 ^ var5 ^ var16);
         ++var0;
         if (var4 == 0) {
            var10006 = var4;
            var10005 = var10002;
            var5 = var4;
         } else {
            if (var1 <= var0) {
               var6 = (new String(var10002)).intern();
               var3 = true;
               a = var6;
               return;
            }

            var10005 = var10002;
            var5 = var4;
            var10006 = var0;
         }
      }
   }
}
