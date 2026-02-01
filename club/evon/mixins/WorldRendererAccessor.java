package club.evon.mixins;

import net.minecraft.class_4604;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_761.class})
public interface WorldRendererAccessor {
   @Mutable
   @Accessor("field_4056")
   class_4604 getFrustum();
}
