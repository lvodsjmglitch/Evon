package club.evon.mixins;

import com.mojang.blaze3d.buffers.GpuBuffer;
import java.util.Map;
import net.minecraft.class_283;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_283.class})
public interface PostEffectPassAccessor {
   @Accessor("field_60123")
   Map<String, GpuBuffer> getUniformBuffers();

   @Accessor("field_53926")
   String getId();
}
