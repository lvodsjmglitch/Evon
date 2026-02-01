package club.evon;

import org.json.JSONException;

public final class RotationManager {
   private static final RotationHelper rotationHelper = new RotationHelper();
   private static final AimHelper aimHelper = new AimHelper();
   private static int data;

   public static RotationHelper getRotationHelper() {
      return rotationHelper;
   }

   public static AimHelper getAimHelper() {
      return aimHelper;
   }

   static {
      setData(31);
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
         return value == 0 ? 74 : 0;
      } catch (JSONException var1) {
         throw wrapException(var1);
      }
   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
