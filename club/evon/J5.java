package club.evon;

enum J5 {
   SINGLE,
   SWITCH;

   private static final J5[] v;

   private static J5[] Q() {
      return new J5[]{SINGLE, SWITCH};
   }

   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "+J\fA/\u001e\u0006+T\u000bR \u0013";
      int var5 = "+J\fA/\u001e\u0006+T\u000bR \u0013".length();
      char var2 = 6;
      int var1 = -1;

      while(true) {
         char[] var10002;
         label42: {
            ++var1;
            char[] var10003 = var3.substring(var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 45;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 45;
               var10006 = var6;
            } else {
               var10 = 45;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label42;
               }

               var10005 = var10003;
               var11 = 45;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 85;
                  break;
               case 1:
                  var22 = 48;
                  break;
               case 2:
                  var22 = 104;
                  break;
               case 3:
                  var22 = 56;
                  break;
               case 4:
                  var22 = 65;
                  break;
               case 5:
                  var22 = 123;
                  break;
               default:
                  var22 = 39;
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
            SINGLE = new J5(var0[1], 0);
            SWITCH = new J5(var0[0], 1);
            v = Q();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
