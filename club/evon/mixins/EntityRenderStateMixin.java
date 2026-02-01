package club.evon.mixins;

import club.evon.Jk;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin({class_10017.class})
public final class EntityRenderStateMixin implements Jk {
   @Unique
   private class_1297 entity;

   private EntityRenderStateMixin() {
   }

   public class_1297 evon$getEntity() {
      return this.entity;
   }

   public void evon$setEntity(class_1297 entity) {
      this.entity = var1;
   }
}
