package club.evon;

import club.evon.launch.LaunchProperties;
import club.evon.launch.Loader;
import club.evon.launch.hidden.Hidden0;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import org.json.JSONException;

public final class EvonClient {
   private static EvonClient instance;
   private static yh user;
   private static X x;
   private static final Executor executor;
   private static final Semaphore semaphore;
   private zv config;
   private ModuleManager moduleManager;
   private Jt L;
   private zB Q;
   private zn M;
   private v5 T;
   private JK D;
   private q p;
   private JR t;
   private static String data;
   private static final long a;
   private static final String[] b;
   private static final long c;

   private EvonClient() {
      this.initialize();
   }

   private native void initialize();

   public void shutdown() {
      long var1 = a ^ 35765058982584L;
      boolean var10000 = MinecraftHelper.isNotInitialized();
      this.Q.r().b();
      boolean var3 = var10000;

      try {
         F.n().z();
         if (var3) {
            gQ.o(new gQ[3]);
         }

      } catch (JSONException var4) {
         throw wrapException((Exception)var4);
      }
   }

   public static synchronized EvonClient getInstance() {
      long var0 = a ^ 40468979936592L;

      try {
         if (instance == null) {
            new EvonClient();
         }
      } catch (JSONException var2) {
         throw wrapException((Exception)var2);
      }

      return instance;
   }

   public zv getConfig() {
      return this.config;
   }

   public ModuleManager getModuleManager() {
      return this.moduleManager;
   }

   public Jt N() {
      return this.L;
   }

   public zB p() {
      return this.Q;
   }

   public zn H() {
      return this.M;
   }

   public v5 o() {
      return this.T;
   }

   public JK J() {
      return this.D;
   }

   public q Y() {
      return this.p;
   }

   public JR k() {
      return this.t;
   }

   public static yh getUser() {
      return user;
   }

   public static X getX() {
      return x;
   }

   public static void setX(X x) {
      EvonClient.x = x;
   }

   public static Executor getExecutor() {
      return executor;
   }

   public static Semaphore getSemaphore() {
      return semaphore;
   }

   // $FF: synthetic method
   private static void lambda$bootstrap$0(String var0) {
      l = new yh(LaunchProperties.username, "");
   }

   static {
      Loader.attachNatives(4, zy.class);
      Hidden0.special_clinit_4_190(zy.class);
   }

   public static void setData(String data) {
      EvonClient.data = data;
   }

   public static String getData() {
      return data;
   }

   private static Exception wrapException(Exception var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }
}
