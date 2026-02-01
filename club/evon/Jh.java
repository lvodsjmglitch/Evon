package club.evon;

enum Jh {
   CLIENT,
   SERVER;

   private static final Jh[] E;

   private static Jh[] r() {
      return new Jh[]{CLIENT, SERVER};
   }

   static {
      String[] var0 = new String[2];
      int var4 = 0;
      String var3 = "h$?\u0000H\u001a\u0006x-$\u0013C\u001c";
      int var5 = "h$?\u0000H\u001a\u0006x-$\u0013C\u001c".length();
      char var2 = 6;
      int var1 = -1;

      while(true) {
         char[] var10002;
         label42: {
            ++var1;
            char[] var10003 = var3.substring(var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 117;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 117;
               var10006 = var6;
            } else {
               var10 = 117;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label42;
               }

               var10005 = var10003;
               var11 = 117;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 78;
                  break;
               case 1:
                  var22 = 20;
                  break;
               case 2:
                  var22 = 24;
                  break;
               case 3:
                  var22 = 35;
                  break;
               case 4:
                  var22 = 120;
                  break;
               case 5:
                  var22 = 61;
                  break;
               default:
                  var22 = 8;
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
            CLIENT = new Jh(var0[1], 0);
            SERVER = new Jh(var0[0], 1);
            E = r();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
