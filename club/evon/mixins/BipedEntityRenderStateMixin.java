package club.evon.mixins;

import club.evon._P;
import net.minecraft.class_10034;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({class_10034.class})
public final class BipedEntityRenderStateMixin implements _P {
   @Unique
   public class_1309 entity;

   public class_1309 evon$getEntity() {
      return this.entity;
   }

   public void evon$setEntity(class_1309 entity) {
      this.entity = var1;
   }
}
