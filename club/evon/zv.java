package club.evon;

import java.util.HashMap;

public final class zv {
   private final HashMap<String, z7> o = new HashMap();
   private static String U;
   private static final String[] a;

   public z7 a(String name) {
      return (z7)this.o.computeIfAbsent(var1, (var1x) -> {
         String[] var2 = a;
         System.out.println(var2[0] + var1);
         return new z7(var1, var2[1] + var1 + var2[2]);
      });
   }

   public static void W(String var0) {
      U = var0;
   }

   public static String f() {
      return U;
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\u001dH\nZ&q\u000f(H\u0005U:\"\u0010!\\\r\\'\"\u001a!S\u001d\u0003c\u0012a\\\u001aJ&v\u000faX\u001fV--\u001a!S\u001d\u0016\u0004`I\u001d_";
      int var4 = "\u001dH\nZ&q\u000f(H\u0005U:\"\u0010!\\\r\\'\"\u001a!S\u001d\u0003c\u0012a\\\u001aJ&v\u000faX\u001fV--\u001a!S\u001d\u0016\u0004`I\u001d_".length();
      W("C3UVI");
      char var1 = 26;
      int var0 = -1;

      while(true) {
         char[] var10002;
         label41: {
            ++var0;
            char[] var10003 = var2.substring(var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 77;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 77;
               var10006 = var6;
            } else {
               var10 = 77;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label41;
               }

               var10005 = var10003;
               var11 = 77;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 3;
                  break;
               case 1:
                  var22 = 112;
                  break;
               case 2:
                  var22 = 36;
                  break;
               case 3:
                  var22 = 116;
                  break;
               case 4:
                  var22 = 14;
                  break;
               case 5:
                  var22 = 79;
                  break;
               default:
                  var22 = 49;
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
         var5[var3++] = var12;
         if ((var0 += var1) >= var4) {
            a = var5;
            return;
         }

         var1 = var2.charAt(var0);
      }
   }
}
