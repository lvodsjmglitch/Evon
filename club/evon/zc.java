package club.evon;

import java.util.ArrayList;

class zc extends ArrayList<String> {
   final _u v;
   private static final String[] a;

   zc(_u var1) {
      this.v = var1;
      String[] var2 = a;
      this.add(var2[1]);
      this.add(var2[0]);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "h\u00066b;!-fY5e.<e4\u00004c+-+*\tvj2$.#\u0017g#h\u00066b;!-fY5c<,e5\u0004/ir:/+\n/ichv%\n7j4/t";
      int var4 = "h\u00066b;!-fY5e.<e4\u00004c+-+*\tvj2$.#\u0017g#h\u00066b;!-fY5c<,e5\u0004/ir:/+\n/ichv%\n7j4/t".length();
      char var1 = 31;
      int var0 = -1;

      while(true) {
         char[] var10002;
         label41: {
            ++var0;
            char[] var10003 = var2.substring(var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 102;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 102;
               var10006 = var6;
            } else {
               var10 = 102;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label41;
               }

               var10005 = var10003;
               var11 = 102;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 32;
                  break;
               case 1:
                  var22 = 3;
                  break;
               case 2:
                  var22 = 63;
                  break;
               case 3:
                  var22 = 106;
                  break;
               case 4:
                  var22 = 59;
                  break;
               case 5:
                  var22 = 46;
                  break;
               default:
                  var22 = 44;
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
