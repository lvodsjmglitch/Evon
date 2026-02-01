package club.evon;

public final class L extends B<Integer> {
   private zq H;
   private static final String b;

   public L(String name, Integer defaultValue, zq bindMode) {
      super(var1, var2);
      this.H = var3;
   }

   public L(Integer defaultValue, zq bindMode) {
      super(b, var1);
      this.H = var2;
   }

   public L(Integer defaultValue) {
      this(var1, zq.TOGGLE);
   }

   public zq h() {
      return this.H;
   }

   public void v(zq bindMode) {
      this.H = var1;
   }

   static {
      char[] var10003 = "\u007f)'\"".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var4 = 55;
      char[] var10002 = var10003;
      int var1 = var10004;
      boolean var3;
      byte var5;
      String var6;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var5 = 55;
         var10006 = var0;
      } else {
         var4 = 55;
         var1 = var10004;
         if (var10004 <= var0) {
            var6 = (new String(var10003)).intern();
            var3 = true;
            b = var6;
            return;
         }

         var10005 = var10003;
         var5 = 55;
         var10006 = var0;
      }

      while(true) {
         char var15 = var10005[var10006];
         byte var16;
         switch(var0 % 7) {
         case 0:
            var16 = 10;
            break;
         case 1:
            var16 = 119;
            break;
         case 2:
            var16 = 126;
            break;
         case 3:
            var16 = 113;
            break;
         case 4:
            var16 = 101;
            break;
         case 5:
            var16 = 84;
            break;
         default:
            var16 = 4;
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
