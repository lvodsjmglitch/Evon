package club.evon;

public enum zo {
   COMBAT,
   MOTION,
   PLAYER,
   RENDER,
   MISC;

   private final String m = T.O(this.name());
   private static String[] A;

   public final String toString() {
      return this.m;
   }

   // $FF: synthetic method
   private static zo[] R() {
      return new zo[]{COMBAT, MOTION, PLAYER, RENDER, MISC};
   }

   static {
      String[] var0 = new String[5];
      int var4 = 0;
      String var3 = "xsqN*z\u0006vshE$`\u0004xuvD";
      int var5 = "xsqN*z\u0006vshE$`\u0004xuvD".length();
      Q((String[])null);
      char var2 = 6;
      int var1 = -1;

      label56:
      while(true) {
         byte var10000 = 66;
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
                     var28 = 119;
                     break;
                  case 1:
                     var28 = 126;
                     break;
                  case 2:
                     var28 = 103;
                     break;
                  case 3:
                     var28 = 69;
                     break;
                  case 4:
                     var28 = 39;
                     break;
                  case 5:
                     var28 = 118;
                     break;
                  default:
                     var28 = 1;
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
                  COMBAT = new zo(var0[1], 0);
                  MOTION = new zo(var0[0], 1);
                  PLAYER = new zo(var0[4], 2);
                  RENDER = new zo(var0[3], 3);
                  MISC = new zo(var0[2], 4);
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

               var3 = "MSAi\nL\u0006OZNt\nL";
               var5 = "MSAi\nL\u0006OZNt\nL".length();
               var2 = 6;
               var1 = -1;
            }

            var10000 = 104;
            ++var1;
            var10001 = var3.substring(var1, var1 + var2);
            var10002 = 0;
         }
      }
   }

   public static void Q(String[] var0) {
      A = var0;
   }

   public static String[] k() {
      return A;
   }
}
