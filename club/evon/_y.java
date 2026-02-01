package club.evon;

public enum _y {
   BLOCKABLE,
   USEABLE,
   BOW,
   NONE;

   private static final _y[] Z;

   private static _y[] n() {
      return new _y[]{BLOCKABLE, USEABLE, BOW, NONE};
   }

   static {
      String[] var0 = new String[4];
      int var4 = 0;
      String var3 = "As{*\u0003Msb";
      int var5 = "As{*\u0003Msb".length();
      char var2 = 4;
      int var1 = -1;

      label56:
      while(true) {
         byte var10000 = 36;
         ++var1;
         String var10001 = var3.substring(var1, var1 + var2);
         byte var10002 = -1;

         while(true) {
            char[] var13;
            label51: {
               char[] var14 = var10001.toCharArray();
               int var10004 = var14.length;
               int var6 = 0;
               byte var17 = var10000;
               byte var16 = var10000;
               var13 = var14;
               int var10 = var10004;
               char[] var18;
               int var10006;
               if (var10004 <= 1) {
                  var18 = var14;
                  var10006 = var6;
               } else {
                  var16 = var10000;
                  var10 = var10004;
                  if (var10004 <= var6) {
                     break label51;
                  }

                  var18 = var14;
                  var10006 = var6;
               }

               while(true) {
                  char var27 = var18[var10006];
                  byte var28;
                  switch(var6 % 7) {
                  case 0:
                     var28 = 43;
                     break;
                  case 1:
                     var28 = 24;
                     break;
                  case 2:
                     var28 = 17;
                     break;
                  case 3:
                     var28 = 75;
                     break;
                  case 4:
                     var28 = 115;
                     break;
                  case 5:
                     var28 = 19;
                     break;
                  default:
                     var28 = 26;
                  }

                  var18[var10006] = (char)(var27 ^ var17 ^ var28);
                  ++var6;
                  if (var16 == 0) {
                     var10006 = var16;
                     var18 = var13;
                     var17 = var16;
                  } else {
                     if (var10 <= var6) {
                        break;
                     }

                     var18 = var13;
                     var17 = var16;
                     var10006 = var6;
                  }
               }
            }

            String var20 = (new String(var13)).intern();
            switch(var10002) {
            case 0:
               var0[var4++] = var20;
               if ((var1 += var2) >= var5) {
                  BLOCKABLE = new _y(var0[3], 0);
                  USEABLE = new _y(var0[2], 1);
                  BOW = new _y(var0[1], 2);
                  NONE = new _y(var0[0], 3);
                  Z = n();
                  return;
               }

               var2 = var3.charAt(var1);
               break;
            default:
               var0[var4++] = var20;
               if ((var1 += var2) < var5) {
                  var2 = var3.charAt(var1);
                  continue label56;
               }

               var3 = "'\u0012\rSh\u0006\u0006\t0\r\u0007Qa\u000b\u0001>\u0004";
               var5 = "'\u0012\rSh\u0006\u0006\t0\r\u0007Qa\u000b\u0001>\u0004".length();
               var2 = 7;
               var1 = -1;
            }

            var10000 = 89;
            ++var1;
            var10001 = var3.substring(var1, var1 + var2);
            var10002 = 0;
         }
      }
   }
}
