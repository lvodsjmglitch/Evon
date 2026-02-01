package club.evon;

import java.util.ArrayList;

class gR extends ArrayList<String> {
   final _4 x;
   private static final String[] a;

   gR(_4 var1) {
      this.x = var1;
      String[] var2 = a;
      this.add(var2[1]);
      this.add(var2[0]);
   }

   static {
      String[] var5 = new String[2];
      int var3 = 0;
      String var2 = "\u0017a`JL\u001b~ZolEZ\u0005\u0019\u0017a`JL\u001b~TlmQD^|\u0019?bAQ\u0014,Vml\u001a";
      int var4 = "\u0017a`JL\u001b~ZolEZ\u0005\u0019\u0017a`JL\u001b~TlmQD^|\u0019?bAQ\u0014,Vml\u001a".length();
      char var1 = '\r';
      int var0 = -1;

      while(true) {
         char[] var10002;
         label41: {
            ++var0;
            char[] var10003 = var2.substring(var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 38;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 38;
               var10006 = var6;
            } else {
               var10 = 38;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label41;
               }

               var10005 = var10003;
               var11 = 38;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 31;
                  break;
               case 1:
                  var22 = 37;
                  break;
               case 2:
                  var22 = 47;
                  break;
               case 3:
                  var22 = 2;
                  break;
               case 4:
                  var22 = 14;
                  break;
               case 5:
                  var22 = 29;
                  break;
               default:
                  var22 = 100;
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
