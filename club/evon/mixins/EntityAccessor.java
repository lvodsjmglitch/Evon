package club.evon.mixins;

import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_1297.class})
public interface EntityAccessor {
   @Accessor("field_22467")
   void setPos(class_243 var1);

   @Invoker("method_65341")
   class_238 callCalculateDefaultBoundingBox(class_243 var1);
}
