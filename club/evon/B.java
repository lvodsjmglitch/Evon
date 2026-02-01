package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.function.BooleanSupplier;
import org.json.JSONException;

public abstract class Property<T> {
   private final String name;
   private BooleanSupplier visible;
   private T value;
   private static String[] data;
   private static final long a = ds.a(-7637434297370900796L, 1589824554498848735L, MethodHandles.lookup().lookupClass()).a(171254262767149L);

   public Property(String name, T value) {
      this.name = name;
      this.value = value;
   }

   public final void setVisible(BooleanSupplier visible) {
      this.visible = visible;
   }

   public final boolean isVisible() {
      // $FF: Couldn't be decompiled
   }

   public List<Property<?>> getSubProperties() {
      return null;
   }

   public String getName() {
      return this.name;
   }

   public BooleanSupplier getVisible() {
      return this.visible;
   }

   public T getValue() {
      return this.value;
   }

   public void setValue(T value) {
      this.value = value;
   }

   public static void setData(String[] data) {
      Property.data = data;
   }

   public static String[] getData() {
      return data;
   }

   static {
      if (getData() != null) {
         setData(new String[1]);
      }

   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
