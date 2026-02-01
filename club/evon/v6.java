package club.evon;

public enum v6 {
   NONE,
   GAMMA,
   NIGHT_VISION;

   private static final v6[] V;

   private static v6[] i() {
      return new v6[]{NONE, GAMMA, NIGHT_VISION};
   }

   static {
      String[] var0 = new String[3];
      int var4 = 0;
      String var3 = "=C\r9\u00054M\u000e1f\f=E\u00044sc\u000e:_\n3i";
      int var5 = "=C\r9\u00054M\u000e1f\f=E\u00044sc\u000e:_\n3i".length();
      char var2 = 4;
      int var1 = -1;

      while(true) {
         char[] var10002;
         label42: {
            ++var1;
            char[] var10003 = var3.substring(var1, var1 + var2).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 63;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 63;
               var10006 = var6;
            } else {
               var10 = 63;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label42;
               }

               var10005 = var10003;
               var11 = 63;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 76;
                  break;
               case 1:
                  var22 = 51;
                  break;
               case 2:
                  var22 = 124;
                  break;
               case 3:
                  var22 = 67;
                  break;
               case 4:
                  var22 = 24;
                  break;
               case 5:
                  var22 = 3;
                  break;
               default:
                  var22 = 103;
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
            NONE = new v6(var0[0], 0);
            GAMMA = new v6(var0[1], 1);
            NIGHT_VISION = new v6(var0[2], 2);
            V = i();
            return;
         }

         var2 = var3.charAt(var1);
      }
   }
}
