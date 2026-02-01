package club.evon;

import java.util.ArrayList;

class z_ extends ArrayList<String> {
   final _X u;
   private static final String a;

   z_(_X var1) {
      this.u = var1;
      this.add(a);
   }

   static {
      char[] var10003 = "\u0000RX\u001b\u001e<i\u000e\u001b[\u0016\u0013'aK\u0019".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 59;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 59;
         var10006 = var0;
      } else {
         var4 = 59;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            a = var6;
            return;
         }

         var10005 = var10003;
         var5 = 59;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 21;
            break;
         case 1:
            var16 = 28;
            break;
         case 2:
            var16 = 13;
            break;
         case 3:
            var16 = 66;
            break;
         case 4:
            var16 = 76;
            break;
         case 5:
            var16 = 105;
            break;
         default:
            var16 = 54;
         }

         var10005[var10006] = (char)(var15 ^ var5 ^ var16);
         ++var0;
         if (var4 == 0) {
            var10006 = var4;
            var10005 = var10002;
            var5 = var4;
         } else {
            if (var1 <= var0) {
               var6 = (new String(var10002)).intern();
               var3 = true;
               a = var6;
               return;
            }

            var10005 = var10002;
            var5 = var4;
            var10006 = var0;
         }
      }
   }
}
