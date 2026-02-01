package club.evon.mixins;

import net.minecraft.class_304;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_304.class})
public interface KeyBindingAccessor {
   @Accessor("field_1661")
   int getTimesPressed();

   @Invoker("method_1425")
   void callReset();
}
