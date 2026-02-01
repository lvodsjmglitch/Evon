package club.evon;

enum vl {
   MODERN,
   LEGACY;

   private static final vl[] i;

   private static vl[] g() {
      return new vl[]{MODERN, LEGACY};
   }

   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\f\rXr9\u0001\u0006\r\u0007[v(\u0016";
      int var5 = "\f\rXr9\u0001\u0006\r\u0007[v(\u0016".length();
      char var2 = 6;
      int var1 = -1;

      while(true) {
         char[] var10002;
         label42: {
            ++var1;
            char[] var10003 = var3.substring(var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 105;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 105;
               var10006 = var6;
            } else {
               var10 = 105;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label42;
               }

               var10005 = var10003;
               var11 = 105;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 41;
                  break;
               case 1:
                  var22 = 33;
                  break;
               case 2:
                  var22 = 118;
                  break;
               case 3:
                  var22 = 90;
                  break;
               case 4:
                  var22 = 19;
                  break;
               case 5:
                  var22 = 49;
                  break;
               default:
                  var22 = 61;
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
         var0[var4++] = var12;
         if ((var1 += var2) >= var5) {
            MODERN = new vl(var0[1], 0);
            LEGACY = new vl(var0[0], 1);
            i = g();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
