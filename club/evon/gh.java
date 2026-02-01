package club.evon;

public final class gh extends gQ {
   private final P j;
   private static final String[] a;

   public gh() {
      String[] var1 = a;
      super(var1[0], var1[1], zo.MISC);
      this.j = new P(var1[4], new vJ[]{new yD(var1[2], this), new y_(var1[3], this), new yl(var1[5], this)});
      this.g(new B[]{this.j});
   }

   public String O() {
      return ((vJ)this.j.J()).R();
   }

   static {
      String[] var5 = new String[6];
      int var3 = 0;
      String var2 = "QS\t-!V\\g\u001aQS\t-!V\\f\u001a\u001b\"7SZ}_\u001b8cYQpY\u0011?m\u0007]C\n%;_U\tVO\u0018) HXsN";
      int var4 = "QS\t-!V\\g\u001aQS\t-!V\\f\u001a\u001b\"7SZ}_\u001b8cYQpY\u0011?m\u0007]C\n%;_U\tVO\u0018) HXsN".length();
      char var1 = '\b';
      int var0 = -1;

      label55:
      while(true) {
         byte var10000 = 87;
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
                     var28 = 66;
                     break;
                  case 1:
                     var28 = 109;
                     break;
                  case 2:
                     var28 = 45;
                     break;
                  case 3:
                     var28 = 27;
                     break;
                  case 4:
                     var28 = 20;
                     break;
                  case 5:
                     var28 = 109;
                     break;
                  default:
                     var28 = 110;
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

               var2 = "p}6\u0001\u000b~g0\u0001\b`p[frV";
               var4 = "p}6\u0001\u000b~g0\u0001\b`p[frV".length();
               var1 = 4;
               var0 = -1;
            }

            var10000 = 127;
            ++var0;
            var10001 = var2.substring(var0, var0 + var1);
            var10002 = 0;
         }
      }
   }
}
