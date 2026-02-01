package club.evon;

public final class gY extends gQ {
   private final P W;
   private static final String[] a;

   public gY() {
      String[] var1 = a;
      super(var1[3], var1[0], zo.MOTION);
      this.W = new P(var1[2], new vJ[]{new yQ(var1[1], this)});
      this.g(new B[]{this.W});
   }

   public String O() {
      return ((vJ)this.W.J()).R();
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "Yd\u001bN\\n|*u\u001cS]wn~}\nF^vv$\u0007\\u\u0007N^vn";
      int var4 = "Yd\u001bN\\n|*u\u001cS]wn~}\nF^vv$\u0007\\u\u0007N^vn".length();
      char var1 = 22;
      int var0 = -1;

      label55:
      while(true) {
         byte var10000 = 38;
         ++var0;
         String var10001 = var2.substring(var0, var0 + var1);
         byte var10002 = -1;

         while(true) {
            char[] var13;
            label50: {
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
                     break label50;
                  }

                  var18 = var14;
                  var10006 = var6;
               }

               while(true) {
                  char var27 = var18[var10006];
                  byte var28;
                  switch(var6 % 7) {
                  case 0:
                     var28 = 44;
                     break;
                  case 1:
                     var28 = 50;
                     break;
                  case 2:
                     var28 = 79;
                     break;
                  case 3:
                     var28 = 1;
                     break;
                  case 4:
                     var28 = 20;
                     break;
                  case 5:
                     var28 = 60;
                     break;
                  default:
                     var28 = 41;
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
               var5[var3++] = var20;
               if ((var0 += var1) >= var4) {
                  a = var5;
                  return;
               }

               var1 = var2.charAt(var0);
               break;
            default:
               var5[var3++] = var20;
               if ((var0 += var1) < var4) {
                  var1 = var2.charAt(var0);
                  continue label55;
               }

               var2 = "\u00059O\u0000\u0005\u001b&N\u0000\u0014";
               var4 = "\u00059O\u0000\u0005\u001b&N\u0000\u0014".length();
               var1 = 4;
               var0 = -1;
            }

            var10000 = 100;
            ++var0;
            var10001 = var2.substring(var0, var0 + var1);
            var10002 = 0;
         }
      }
   }
}
