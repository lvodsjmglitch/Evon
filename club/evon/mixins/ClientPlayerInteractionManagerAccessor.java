package club.evon.mixins;

import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_7204;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin({class_636.class})
public interface ClientPlayerInteractionManagerAccessor {
   @Invoker("method_41931")
   void callSendSequencedPacket(class_638 var1, class_7204 var2);

   @Invoker("method_2911")
   void callSyncSelectedSlot();

   @Mutable
   @Accessor("field_3715")
   float getCurBlockDamageMP();

   @Mutable
   @Accessor("field_3715")
   void setCurBlockDamageMP(float var1);
}
