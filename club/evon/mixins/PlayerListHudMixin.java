package club.evon.mixins;

import club.evon.Jw;
import club.evon.w;
import java.util.List;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_2564;
import net.minecraft.class_355;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import net.minecraft.class_8828;
import org.json.JSONException;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin({class_355.class})
public abstract class PlayerListHudMixin {
   @Unique
   private static class_2561 GRAY_OPENING_PARENTHESIS;
   @Unique
   private static class_2561 GRAY_CLOSING_PARENTHESIS;
   @Unique
   private static class_2561 EMPTY_TEXT;

   @Redirect(
      method = {"method_1919(Lnet/minecraft/class_332;ILnet/minecraft/class_269;Lnet/minecraft/class_266;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_355;method_1918(Lnet/minecraft/class_640;)Lnet/minecraft/class_2561;"
)
   )
   private class_2561 redirectPlayerName(class_355 var1, class_640 var2) {
      Jw var3 = Jw.a();
      w var4 = var3.B(var2.method_2966().name());
      class_2561 var5 = var1.method_1918(var2);

      try {
         if (var4 == null) {
            return var5;
         }
      } catch (JSONException var6) {
         throw a(var6);
      }

      try {
         if (GRAY_OPENING_PARENTHESIS == null) {
            GRAY_OPENING_PARENTHESIS = class_2561.method_43470(" " + String.valueOf(class_124.field_1080) + "(");
            GRAY_CLOSING_PARENTHESIS = class_2561.method_43470(String.valueOf(class_124.field_1080) + ")");
            EMPTY_TEXT = class_2561.method_43473();
         }
      } catch (JSONException var7) {
         throw a(var7);
      }

      return class_2564.method_37112(List.of(var5, GRAY_OPENING_PARENTHESIS, class_5250.method_43477(class_8828.method_54232(var4.f())).method_54663(var4.i().A().method_27716()), GRAY_CLOSING_PARENTHESIS), EMPTY_TEXT);
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
