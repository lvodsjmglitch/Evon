package club.evon;

public enum JT {
   NONE,
   DEFAULT,
   FULL;

   private static final JT[] L;

   private static JT[] O() {
      return new JT[]{NONE, DEFAULT, FULL};
   }

   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "\u0003\u0015'`wa.\u0004\t\u001f/d\u0004\u0001\u0005-m";
      int var5 = "\u0003\u0015'`wa.\u0004\t\u001f/d\u0004\u0001\u0005-m".length();
      char var2 = 7;
      int var1 = -1;

      while(true) {
         char[] var10002;
         label42: {
            ++var1;
            char[] var10003 = var3.substring(var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 17;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 17;
               var10006 = var6;
            } else {
               var10 = 17;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label42;
               }

               var10005 = var10003;
               var11 = 17;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 86;
                  break;
               case 1:
                  var22 = 65;
                  break;
               case 2:
                  var22 = 112;
                  break;
               case 3:
                  var22 = 48;
                  break;
               case 4:
                  var22 = 51;
                  break;
               case 5:
                  var22 = 60;
                  break;
               default:
                  var22 = 107;
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
            NONE = new JT(var0[1], 0);
            DEFAULT = new JT(var0[0], 1);
            FULL = new JT(var0[2], 2);
            L = O();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
