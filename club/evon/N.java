package club.evon;

enum N {
   VANILLA,
   HYPIXEL;

   private static final N[] m;

   private static N[] y() {
      return new N[]{VANILLA, HYPIXEL};
   }

   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "\u0013\u0007A\u001bIG7\u0007\r\u001f_\u001b]N:";
      int var5 = "\u0013\u0007A\u001bIG7\u0007\r\u001f_\u001b]N:".length();
      char var2 = 7;
      int var1 = -1;

      while(true) {
         char[] var10002;
         label42: {
            ++var1;
            char[] var10003 = var3.substring(var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 89;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 89;
               var10006 = var6;
            } else {
               var10 = 89;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label42;
               }

               var10005 = var10003;
               var11 = 89;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 28;
                  break;
               case 1:
                  var22 = 31;
                  break;
               case 2:
                  var22 = 86;
                  break;
               case 3:
                  var22 = 11;
                  break;
               case 4:
                  var22 = 92;
                  break;
               case 5:
                  var22 = 82;
                  break;
               default:
                  var22 = 47;
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
            VANILLA = new N(var0[0], 0);
            HYPIXEL = new N(var0[1], 1);
            m = y();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
