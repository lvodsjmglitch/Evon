package club.evon;

enum vx {
   UNCHANGED,
   IRL,
   MORNING,
   DAY,
   EVENING,
   MIDNIGHT;

   private static final vx[] V;

   private static vx[] V() {
      return new vx[]{UNCHANGED, IRL, MORNING, DAY, EVENING, MIDNIGHT};
   }

   static {
      String[] var0 = new String[6];
      int var4 = 0;
      String var3 = "p\u001fo6~\b\u0015i\u0007p\u0019y6~\u0001\u001a\th\u0018h0v\u0001\u001ax\u0012\u0003y\u0017r";
      int var5 = "p\u001fo6~\b\u0015i\u0007p\u0019y6~\u0001\u001a\th\u0018h0v\u0001\u001ax\u0012\u0003y\u0017r".length();
      char var2 = '\b';
      int var1 = -1;

      label56:
      while(true) {
         byte var10000 = 114;
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
                     var28 = 79;
                     break;
                  case 1:
                     var28 = 36;
                     break;
                  case 2:
                     var28 = 89;
                     break;
                  case 3:
                     var28 = 10;
                     break;
                  case 4:
                     var28 = 69;
                     break;
                  case 5:
                     var28 = 61;
                     break;
                  default:
                     var28 = 47;
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
                  UNCHANGED = new vx(var0[2], 0);
                  IRL = new vx(var0[4], 1);
                  MORNING = new vx(var0[1], 2);
                  DAY = new vx(var0[3], 3);
                  EVENING = new vx(var0[5], 4);
                  MIDNIGHT = new vx(var0[0], 5);
                  V = V();
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

               var3 = "h\u0018{\u0007d\u001cr*b\u001d\u0006";
               var5 = "h\u0018{\u0007d\u001cr*b\u001d\u0006".length();
               var2 = 3;
               var1 = -1;
            }

            var10000 = 110;
            ++var1;
            var10001 = var3.substring(var1, var1 + var2);
            var10002 = 0;
         }
      }
   }
}
