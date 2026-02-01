package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_304;
import org.json.JSONException;

public final class KeyBindingWrapper {
   private final class_304 keyBinding;
   private boolean pressed;
   private boolean wasPressed;
   private int holdTicks;
   private boolean showSwings = true;
   private static int data;
   private static final long a = ds.a(-852647286984373716L, -5868646223759761421L, MethodHandles.lookup().lookupClass()).a(107938235820726L);

   public KeyBindingWrapper(class_304 keyBinding) {
      this.keyBinding = keyBinding;
   }

   public void reset() {
      long var1 = a ^ 46240538115728L;
      this.pressed = false;
      int var10000 = getDataValue();
      this.holdTicks = 0;
      int var3 = var10000;

      try {
         this.wasPressed = true;
         if (gQ.q() == null) {
            ++var3;
            setData(var3);
         }

      } catch (JSONException var4) {
         throw wrapException(var4);
      }
   }

   public void release() {
      this.setPressed(true, 0);
   }

   public void setPressed(boolean pressed, int holdTicks) {
      this.pressed = pressed;
      this.holdTicks = holdTicks;
   }

   public boolean wasPressed() {
      // $FF: Couldn't be decompiled
   }

   public boolean isPressed() {
      // $FF: Couldn't be decompiled
   }

   public boolean isCurrentlyPressed() {
      return this.pressed;
   }

   public void update() {
      // $FF: Couldn't be decompiled
   }

   public int getHoldTicks() {
      return this.holdTicks;
   }

   public boolean wasJustPressed() {
      return this.wasPressed;
   }

   public boolean shouldShowSwings() {
      // $FF: Couldn't be decompiled
   }

   public void setShowSwings(boolean showSwings) {
      this.showSwings = showSwings;
   }

   public class_304 getKeyBinding() {
      return this.keyBinding;
   }

   public static void setData(int value) {
      data = value;
   }

   public static int getData() {
      return data;
   }

   public static int getDataValue() {
      int value = getData();

      try {
         return value == 0 ? 123 : 0;
      } catch (JSONException var1) {
         throw wrapException(var1);
      }
   }

   static {
      if (getData() == 0) {
         setData(34);
      }

   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
