package club.evon;

public enum _k {
   V1_7,
   V1_8,
   DOWNWARDS,
   SWANG,
   PUSH,
   DIVE;

   private final String O;
   private static final _k[] H;

   private _k(String var3) {
      this.O = var3;
   }

   public String toString() {
      return this.O;
   }

   private static _k[] n() {
      return new _k[]{V1_7, V1_8, DOWNWARDS, SWANG, PUSH, DIVE};
   }

   static {
      String[] var0 = new String[12];
      int var4 = 0;
      String var3 = "\u0005>Y\u001fhg\u0015%\"\u0004\u0011$]\u0019\u0003p\u007f\u0019\u0004\u0017`qF\u0004\u0005\u0018x4\u0003p\u007f\u0016\u0005\u0012\u0006o?X\u0004\u0011\u0004}9\u0004\u0017`qI\t\u0005\u001ey?HG5\u0005\u0002";
      int var5 = "\u0005>Y\u001fhg\u0015%\"\u0004\u0011$]\u0019\u0003p\u007f\u0019\u0004\u0017`qF\u0004\u0005\u0018x4\u0003p\u007f\u0016\u0005\u0012\u0006o?X\u0004\u0011\u0004}9\u0004\u0017`qI\t\u0005\u001ey?HG5\u0005\u0002".length();
      char var2 = '\t';
      int var1 = -1;

      label56:
      while(true) {
         byte var10000 = 21;
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
                     var28 = 84;
                     break;
                  case 1:
                     var28 = 68;
                     break;
                  case 2:
                     var28 = 59;
                     break;
                  case 3:
                     var28 = 100;
                     break;
                  case 4:
                     var28 = 10;
                     break;
                  case 5:
                     var28 = 19;
                     break;
                  default:
                     var28 = 114;
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
                  V1_7 = new _k(var0[3], 0, var0[2]);
                  V1_8 = new _k(var0[8], 1, var0[5]);
                  DOWNWARDS = new _k(var0[9], 2, var0[0]);
                  SWANG = new _k(var0[6], 3, var0[10]);
                  PUSH = new _k(var0[7], 4, var0[1]);
                  DIVE = new _k(var0[4], 5, var0[11]);
                  H = n();
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

               var3 = "-\u0019p G\u0004:\u0007g+";
               var5 = "-\u0019p G\u0004:\u0007g+".length();
               var2 = 5;
               var1 = -1;
            }

            var10000 = 42;
            ++var1;
            var10001 = var3.substring(var1, var1 + var2);
            var10002 = 0;
         }
      }
   }
}
