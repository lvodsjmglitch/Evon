package club.evon;

import java.util.ArrayList;

class zQ extends ArrayList<String> {
   final _Q K;
   private static final String a;

   zQ(_Q var1) {
      this.K = var1;
      this.add(a);
   }

   static {
      char[] var10003 = "(@Vs\u001d\u0004,r\t\u0018\u007f\u0010C\"`O\u001a".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 84;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 84;
         var10006 = var0;
      } else {
         var4 = 84;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            a = var6;
            return;
         }

         var10005 = var10003;
         var5 = 84;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 82;
            break;
         case 1:
            var16 = 125;
            break;
         case 2:
            var16 = 112;
            break;
         case 3:
            var16 = 68;
            break;
         case 4:
            var16 = 42;
            break;
         case 5:
            var16 = 56;
            break;
         default:
            var16 = 25;
         }

         var10005[var10006] = (char)(var15 ^ var5 ^ var16);
         ++var0;
         if (var4 == 0) {
            var10006 = var4;
            var10005 = var10002;
            var5 = var4;
         } else {
            if (var1 <= var0) {
               var6 = (new String(var10002)).intern();
               var3 = true;
               a = var6;
               return;
            }

            var10005 = var10002;
            var5 = var4;
            var10006 = var0;
         }
      }
   }
}
