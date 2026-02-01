package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import org.json.JSONException;

public final class HotbarManager implements HotbarManagerInterface {
   private int currentItem;
   private int targetItem;
   private boolean isSwitching;
   private int previousItem;
   private int switchCount;
   private JT silenceMode;
   private static HotbarManager instance;
   private static int[] data;
   private static final long a = ds.a(8682007984308715884L, 1786917264607341101L, MethodHandles.lookup().lookupClass()).a(38966575154361L);

   public HotbarManager() {
      this.silenceMode = JT.DEFAULT;
   }

   public HotbarManager setCurrentItem(int currentItem) {
      // $FF: Couldn't be decompiled
   }

   public HotbarManager setSilenceMode(JT silence) {
      this.silenceMode = silence;
      return this;
   }

   public void setCurrentItemValue(int currentItem) {
      this.currentItem = currentItem;
   }

   public void reset() {
      this.previousItem = -1;
      this.reset(true, true);
   }

   public void reset(boolean reset, boolean check) {
      // $FF: Couldn't be decompiled
   }

   public void incrementSwitch() {
      this.reset(true, true);
      ++this.switchCount;
   }

   public class_1799 getItem(class_746 player) {
      // $FF: Couldn't be decompiled
   }

   public int getItemIndex(class_1661 inventory) {
      // $FF: Couldn't be decompiled
   }

   public int getCurrentItem() {
      return this.currentItem;
   }

   public static void initialize() {
      instance = new HotbarManager();
   }

   public int getCurrentItemValue() {
      return this.currentItem;
   }

   public int getTargetItem() {
      return this.targetItem;
   }

   public boolean isSwitching() {
      return this.isSwitching;
   }

   public int getPreviousItem() {
      return this.previousItem;
   }

   public int getSwitchCount() {
      return this.switchCount;
   }

   public JT getSilenceMode() {
      return this.silenceMode;
   }

   public static HotbarManager getInstance() {
      return instance;
   }

   public static void setData(int[] data) {
      HotbarManager.data = data;
   }

   public static int[] getData() {
      return data;
   }

   static {
      if (getData() == null) {
         setData(new int[3]);
      }

   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
