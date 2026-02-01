package club.evon;

public final class gm extends gQ {
   private final a k;
   private static final String[] a;

   public gm() {
      String[] var1 = a;
      super(var1[2], var1[1], zo.MISC);
      this.k = new a(var1[0], 1.0D, 0.1D, 10.0D, 0.01D);
      this.g(new B[]{this.k});
   }

   public void H() {
      Jp.H().p(1.0F);
      super.H();
   }

   @_S
   private void J(yN var1) {
      Jp.H().p(((Double)this.k.J()).floatValue());
   }

   static {
      String[] var5 = new String[3];
      int var3 = 0;
      String var2 = "\":\u0016\r\u001d\u001f\":\u0016\r\u001d\u007fS\u0001j\u001c\u001aY,J\u001e=S\f\u0016(HQ>\u001b\rY8G\u001c/]\u0005%#\u001e\r\u000b";
      int var4 = "\":\u0016\r\u001d\u001f\":\u0016\r\u001d\u007fS\u0001j\u001c\u001aY,J\u001e=S\f\u0016(HQ>\u001b\rY8G\u001c/]\u0005%#\u001e\r\u000b".length();
      char var1 = 5;
      int var0 = -1;

      while(true) {
         char[] var10002;
         label41: {
            ++var0;
            char[] var10003 = var2.substring(var0, var0 + var1).toCharArray();
            int var10004 = var10003.length;
            int var6 = 0;
            byte var10 = 37;
            var10002 = var10003;
            int var7 = var10004;
            byte var11;
            char[] var10005;
            int var10006;
            if (var10004 <= 1) {
               var10005 = var10003;
               var11 = 37;
               var10006 = var6;
            } else {
               var10 = 37;
               var7 = var10004;
               if (var10004 <= var6) {
                  break label41;
               }

               var10005 = var10003;
               var11 = 37;
               var10006 = var6;
            }

            while(true) {
               char var21 = var10005[var10006];
               byte var22;
               switch(var6 % 7) {
               case 0:
                  var22 = 84;
                  break;
               case 1:
                  var22 = 111;
                  break;
               case 2:
                  var22 = 86;
                  break;
               case 3:
                  var22 = 77;
                  break;
               case 4:
                  var22 = 92;
                  break;
               case 5:
                  var22 = 122;
                  break;
               default:
                  var22 = 3;
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
