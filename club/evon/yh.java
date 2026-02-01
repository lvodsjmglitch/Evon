package club.evon;

import com.google.gson.Gson;
import java.net.URI;
import java.net.URISyntaxException;

public final class yh {
   private final Gson g;
   private zO X;
   private String p;
   private static int[] k;
   private static final String[] a;

   public yh(String username, String hardwareId) {
      int[] var10000 = b();
      super();
      this.g = new Gson();
      int[] var3 = var10000;

      String[] var5;
      try {
         var5 = a;
         this.X = new zO(new URI(var5[1]), var1, "");
      } catch (URISyntaxException var7) {
         var5 = a;
         _o.a(var5[0], var5[2], 0);
         System.exit(0);
      }

      try {
         if (var3 == null) {
            gQ.o(new gQ[3]);
         }

      } catch (URISyntaxException var6) {
         throw a(var6);
      }
   }

   public Gson b() {
      return this.g;
   }

   public zO Z() {
      return this.X;
   }

   public String v() {
      return this.p;
   }

   public void u(zO websocket) {
      this.X = var1;
   }

   public void K(String keepAlive) {
      this.p = var1;
   }

   public static void i(int[] var0) {
      k = var0;
   }

   public static int[] b() {
      return k;
   }

   private static URISyntaxException a(URISyntaxException var0) {
      return var0;
   }

   static {
      String[] var5 = new String[3];
      int[] var10000 = new int[2];
      int var3 = 0;
      String var2 = "Gv2&.\u0014uw3ssLwwp(g9\u0015yl*#%)\u0001\u0015Cq4!9\rbkg!=5\fx\"b! 0\u0006r";
      int var4 = "Gv2&.\u0014uw3ssLwwp(g9\u0015yl*#%)\u0001\u0015Cq4!9\rbkg!=5\fx\"b! 0\u0006r".length();
      char var1 = 5;
      int var0 = -1;
      i(var10000);

      while(true) {
         char[] var10002;
         label41: {
            ++var0;
            char[] var10003 = var2.substring(var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 103;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 103;
               var10006 = var6;
            } else {
               var10 = 103;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label41;
               }

               var10005 = var10003;
               var11 = 103;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 101;
                  break;
               case 1:
                  var22 = 99;
                  break;
               case 2:
                  var22 = 39;
                  break;
               case 3:
                  var22 = 46;
                  break;
               case 4:
                  var22 = 59;
                  break;
               case 5:
                  var22 = 4;
                  break;
               default:
                  var22 = 113;
               }

               var10005[var10006] = (char)(var21 ^ var11 ^ var22);
               ++var6;
               if (var10 == 0) {
                  var10006 = var10;
                  var10005 = var10002;
                  var11 = var10;
               } else {
                  if (var7 <= var6) {
                     break;
                  }

                  var10005 = var10002;
                  var11 = var10;
                  var10006 = var6;
               }
            }
         }

         String var12 = (new String(var10002)).intern();
         boolean var9 = true;
         var5[var3++] = var12;
         if ((var0 += var1) >= var4) {
            a = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}
