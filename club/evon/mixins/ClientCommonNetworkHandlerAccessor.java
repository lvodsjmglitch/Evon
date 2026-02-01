package club.evon.mixins;

import java.util.Map;
import net.minecraft.class_2960;
import net.minecraft.class_8673;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin({class_8673.class})
public interface ClientCommonNetworkHandlerAccessor {
   @Accessor("field_48399")
   Map<class_2960, byte[]> getServerCookies();
}
