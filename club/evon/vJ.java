package club.evon;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class ModuleBase<T extends gQ> {
   protected final String name;
   protected final T parent;
   protected final ArrayList<Property<?>> properties = new ArrayList();
   private static int[] data;

   public final void addProperties(Property<?>... properties) {
      this.properties.addAll(Arrays.asList(properties));
   }

   public void onEnable() {
   }

   public void onDisable() {
   }

   public boolean isEnabled() {
      return this.getParent().d();
   }

   public final void register() {
      C.P(this);
      this.onEnable();
   }

   public void unregister() {
      C.h(this);
      this.onDisable();
   }

   public String getName() {
      return this.name;
   }

   public T getParent() {
      return this.parent;
   }

   public ArrayList<Property<?>> getProperties() {
      return this.properties;
   }

   public ModuleBase(String name, T parent) {
      this.name = name;
      this.parent = parent;
   }

   public static void setData(int[] data) {
      ModuleBase.data = data;
   }

   public static int[] getData() {
      return data;
   }

   static {
      if (getData() != null) {
         setData(new int[2]);
      }

   }
}
