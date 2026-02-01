package club.evon;

import org.json.JSONException;

public class Event implements EventMarker {
   private boolean cancelled;
   private static boolean defaultCancelled;

   public void cancel() {
      this.cancelled = true;
   }

   public void setCancelled(boolean canceled) {
      this.cancelled = canceled;
   }

   public boolean isCancelled() {
      return this.cancelled;
   }

   public static void setDefaultCancelled(boolean value) {
      defaultCancelled = value;
   }

   public static boolean isDefaultCancelled() {
      return defaultCancelled;
   }

   public static boolean isDefaultNotCancelled() {
      boolean value = isDefaultCancelled();

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
      if (!isDefaultNotCancelled()) {
         setDefaultCancelled(true);
      }

   }
}
