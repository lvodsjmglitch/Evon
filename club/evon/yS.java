package club.evon;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_304;
import org.json.JSONException;

public final class KeyBindingManager {
   private final Map<class_304, KeyBindingWrapper> wrappers = new HashMap();
   private final KeyBindingWrapper attackKey;
   private final KeyBindingWrapper useKey;
   private static KeyBindingManager instance;
   private static boolean initialized;

   private KeyBindingManager() {
      this.attackKey = this.registerWrapper(new KeyBindingWrapper(MinecraftHelper.client.field_1690.field_1886));
      this.useKey = this.registerWrapper(new KeyBindingWrapper(MinecraftHelper.client.field_1690.field_1904));
   }

   private <T extends KeyBindingWrapper> T registerWrapper(T wrapper) {
      this.wrappers.put(wrapper.getKeyBinding(), wrapper);
      return wrapper;
   }

   public void update() {
      this.attackKey.update();
      this.useKey.update();
   }

   public static KeyBindingWrapper getWrapper(class_304 binding) {
      return instance.wrappers.get(binding);
   }

   public static KeyBindingWrapper getAttackKey() {
      return instance.attackKey;
   }

   public static KeyBindingWrapper getUseKey() {
      return instance.useKey;
   }

   public static void initialize() {
      instance = new KeyBindingManager();
   }

   public static KeyBindingManager getInstance() {
      return instance;
   }

   public static void setInitialized(boolean value) {
      initialized = value;
   }

   public static boolean isInitialized() {
      return initialized;
   }

   public static boolean isNotInitialized() {
      boolean value = isInitialized();

      try {
         return !value;
      } catch (JSONException var1) {
         throw wrapException(var1);
      }
   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }

   static {
      if (isNotInitialized()) {
         setInitialized(true);
      }

   }
}
