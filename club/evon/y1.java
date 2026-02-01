package club.evon;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.class_276;

public final class y1 {
   public static void B(class_276 sourceBuffer, class_276 destinationBuffer) {
      RenderSystem.getDevice().createCommandEncoder().copyTextureToTexture(var0.method_30277(), var1.method_30277(), 0, 0, 0, 0, 0, var1.field_1482, var1.field_1481);
   }
}
