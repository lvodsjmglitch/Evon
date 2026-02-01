package club.evon.mixins;

import net.minecraft.class_1937;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_3908;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_2281.class})
public interface ChestBlockAccessor {
   @Mutable
   @Invoker("method_17454")
   class_3908 callCreateScreenHandlerFactory(class_2680 var1, class_1937 var2, class_2338 var3);
}
