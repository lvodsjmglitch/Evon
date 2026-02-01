package club.evon;

public final class gX extends gQ {
   private final P W;
   private static final String[] a;

   public gX() {
      String[] var1 = a;
      super(var1[0], var1[2], zo.COMBAT);
      this.W = new P(var1[1], new vJ[]{new vZ(var1[3], this)});
      this.g(new B[]{this.W});
   }

   public String O() {
      return ((vJ)this.W.J()).R();
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "S_KzV\u0006 |\rjgK\u0004]BFk";
      int var4 = "S_KzV\u0006 |\rjgK\u0004]BFk".length();
      char var1 = '\f';
      int var0 = -1;

      label55:
      while(true) {
         byte var10000 = 73;
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
                     var28 = 89;
                     break;
                  case 1:
                     var28 = 100;
                     break;
                  case 2:
                     var28 = 107;
                     break;
                  case 3:
                     var28 = 71;
                     break;
                  case 4:
                     var28 = 118;
                     break;
                  case 5:
                     var28 = 44;
                     break;
                  default:
                     var28 = 8;
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

               var2 = "\u0005\u0019\u00123NWb(\b\u001a<\u000fX0)\u0015\u0007,@\t\u0002\t\u0011:\rFq'\b";
               var4 = "\u0005\u0019\u00123NWb(\b\u001a<\u000fX0)\u0015\u0007,@\t\u0002\t\u0011:\rFq'\b".length();
               var1 = 19;
               var0 = -1;
            }

            var10000 = 24;
            ++var0;
            var10001 = var2.substring(var0, var0 + var1);
            var10002 = 0;
         }
      }
   }
}
