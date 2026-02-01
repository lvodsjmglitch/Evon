package club.evon;

public class _C extends _R {
   private static final String b;

   public _C() {
      super(b, "", "");
   }

   public boolean x(String... args) {
      return false;
   }

   static {
      char[] var10003 = "\f\u000f(voVi".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 69;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 69;
         var10006 = var0;
      } else {
         var4 = 69;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            b = var6;
            return;
         }

         var10005 = var10003;
         var5 = 69;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 43;
            break;
         case 1:
            var16 = 35;
            break;
         case 2:
            var16 = 10;
            break;
         case 3:
            var16 = 71;
            break;
         case 4:
            var16 = 79;
            break;
         case 5:
            var16 = 107;
            break;
         default:
            var16 = 88;
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
               b = var6;
               return;
            }

            var10005 = var10002;
            var5 = var4;
            var10006 = var0;
         }
      }
   }
}
