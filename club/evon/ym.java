package club.evon;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import net.minecraft.class_310;
import org.json.JSONException;

public final class MinecraftHelper {
   public static final class_310 client;
   public static final File configDir;
   public static final Gson gson;
   private static boolean initialized;

   static {
      if (!isInitialized()) {
         setInitialized(true);
      }

      char[] var10003 = "\b2o\n\u0004,".toCharArray();
      int var10004 = var10003.length;
      int var1 = 0;
      byte var5 = 114;
      char[] var10002 = var10003;
      int var2 = var10004;
      String var0;
      boolean var4;
      char[] var6;
      String var7;
      byte var10;
      int var10005;
      char var10006;
      byte var10007;
      char var10008;
      if (var10004 <= 1) {
         var6 = var10003;
         var10005 = var1;
         var10008 = var10003[var1];
         var10007 = 114;
         var10006 = var10008;
         switch(var1 % 7) {
         case 0:
            var10 = 85;
            break;
         case 1:
            var10 = 5;
            break;
         case 2:
            var10 = 107;
            break;
         case 3:
            var10 = 23;
            break;
         case 4:
            var10 = 24;
            break;
         case 5:
            var10 = 113;
            break;
         default:
            var10 = 83;
         }
      } else {
         var5 = 114;
         var2 = var10004;
         if (var10004 <= var1) {
            var7 = (new String(var10003)).intern();
            var4 = true;
            var0 = var7;
            client = class_310.method_1551();
            configDir = new File(client.field_1697, var0);
            gson = (new GsonBuilder()).setPrettyPrinting().generateNonExecutableJson().create();
            return;
         }

         var6 = var10003;
         var10005 = var1;
         var10008 = var10003[var1];
         var10007 = 114;
         var10006 = var10008;
         switch(var1 % 7) {
         case 0:
            var10 = 85;
            break;
         case 1:
            var10 = 5;
            break;
         case 2:
            var10 = 107;
            break;
         case 3:
            var10 = 23;
            break;
         case 4:
            var10 = 24;
            break;
         case 5:
            var10 = 113;
            break;
         default:
            var10 = 83;
         }
      }

      while(true) {
         while(true) {
            var6[var10005] = (char)(var10006 ^ var10007 ^ var10);
            ++var1;
            if (var5 == 0) {
               var6 = var10002;
               var10005 = var5;
               var10008 = var10002[var5];
               var10007 = var5;
               var10006 = var10008;
               switch(var1 % 7) {
               case 0:
                  var10 = 85;
                  break;
               case 1:
                  var10 = 5;
                  break;
               case 2:
                  var10 = 107;
                  break;
               case 3:
                  var10 = 23;
                  break;
               case 4:
                  var10 = 24;
                  break;
               case 5:
                  var10 = 113;
                  break;
               default:
                  var10 = 83;
               }
            } else {
               if (var2 <= var1) {
                  var7 = (new String(var10002)).intern();
                  var4 = true;
                  var0 = var7;
                  client = class_310.method_1551();
                  configDir = new File(client.field_1697, var0);
                  gson = (new GsonBuilder()).setPrettyPrinting().generateNonExecutableJson().create();
                  return;
               }

               var6 = var10002;
               var10005 = var1;
               var10008 = var10002[var1];
               var10007 = var5;
               var10006 = var10008;
               switch(var1 % 7) {
               case 0:
                  var10 = 85;
                  break;
               case 1:
                  var10 = 5;
                  break;
               case 2:
                  var10 = 107;
                  break;
               case 3:
                  var10 = 23;
                  break;
               case 4:
                  var10 = 24;
                  break;
               case 5:
                  var10 = 113;
                  break;
               default:
                  var10 = 83;
               }
            }
         }
      }
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

   public static class_310 getClient() {
      return client;
   }

   public static File getConfigDir() {
      return configDir;
   }

   public static Gson getGson() {
      return gson;
   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}

