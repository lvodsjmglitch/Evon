package club.evon;

enum _l {
   DISTANCE,
   HEALTH,
   HURTTIME;

   private static final _l[] x;

   private static _l[] n() {
      return new _l[]{DISTANCE, HEALTH, HURTTIME};
   }

   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\b?\\@a`v\u0005\b\u0004#]@tgx\u0005\u0006\b/OXaa";
      int var5 = "\b?\\@a`v\u0005\b\u0004#]@tgx\u0005\u0006\b/OXaa".length();
      char var2 = '\b';
      int var1 = -1;

      while(true) {
         char[] var10002;
         label42: {
            ++var1;
            char[] var10003 = var3.substring(var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 87;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 87;
               var10006 = var6;
            } else {
               var10 = 87;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label42;
               }

               var10005 = var10003;
               var11 = 87;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 23;
                  break;
               case 1:
                  var22 = 61;
                  break;
               case 2:
                  var22 = 89;
                  break;
               case 3:
                  var22 = 67;
                  break;
               case 4:
                  var22 = 98;
                  break;
               case 5:
                  var22 = 126;
                  break;
               default:
                  var22 = 108;
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
            DISTANCE = new _l(var0[1], 0);
            HEALTH = new _l(var0[2], 1);
            HURTTIME = new _l(var0[0], 2);
            x = n();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
