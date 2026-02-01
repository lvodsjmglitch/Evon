package club.evon.mixins;

import net.minecraft.class_757;
import net.minecraft.class_9920;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_757.class})
public interface GameRendererAccessor {
   @Mutable
   @Accessor("field_53066")
   class_9920 getPool();
}
