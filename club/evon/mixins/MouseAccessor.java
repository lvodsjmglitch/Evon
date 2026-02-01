package club.evon.mixins;

import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_312.class})
public interface MouseAccessor {
   @Accessor("field_1791")
   void setLeftButtonClicked(boolean var1);

   @Accessor("field_1790")
   void setMiddleButtonClicked(boolean var1);

   @Accessor("field_1788")
   void setRightButtonClicked(boolean var1);
}
