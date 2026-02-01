package club.evon;

public final class gz extends gQ {
   private final a P;
   private final a Z;
   private static final String[] a;

   public gz() {
      String[] var1 = a;
      super(var1[3], var1[0], zo.COMBAT);
      this.P = new a(var1[2], 3.0D, 3.0D, 6.0D, 0.05D);
      this.Z = new a(var1[1], 4.5D, 4.5D, 6.0D, 0.05D);
      this.g(new B[]{this.P, this.Z});
   }

   public double x() {
      return (Double)this.P.J();
   }

   public double v() {
      return (Double)this.Z.J();
   }

   static {
      String[] var5 = new String[4];
      int var3 = 0;
      String var2 = "`\u000b\u000bS\u0002\u0007rB\u0017\u001e\\\u0006\t}J\r\u001eX\u0017\u00031W\n\u0005SE\u0006;P\u0017\u000bS\u0006\u0007\u0011a\u000f\u0005^\u000eB\u0002O\u0002\tXE07B\u0000\u0002";
      int var4 = "`\u000b\u000bS\u0002\u0007rB\u0017\u001e\\\u0006\t}J\r\u001eX\u0017\u00031W\n\u0005SE\u0006;P\u0017\u000bS\u0006\u0007\u0011a\u000f\u0005^\u000eB\u0002O\u0002\tXE07B\u0000\u0002".length();
      char var1 = '"';
      int var0 = -1;

      label55:
      while(true) {
         byte var10000 = 16;
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
                     var28 = 51;
                     break;
                  case 1:
                     var28 = 115;
                     break;
                  case 2:
                     var28 = 122;
                     break;
                  case 3:
                     var28 = 45;
                     break;
                  case 4:
                     var28 = 117;
                     break;
                  case 5:
                     var28 = 114;
                     break;
                  default:
                     var28 = 66;
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

               var2 = "\u000eev<ys\u001a\u0002ev0\u007fkY?+P0liR\u0005\u0019nc6e";
               var4 = "\u000eev<ys\u001a\u0002ev0\u007fkY?+P0liR\u0005\u0019nc6e".length();
               var1 = 21;
               var0 = -1;
            }

            var10000 = 120;
            ++var0;
            var10001 = var2.substring(var0, var0 + var1);
            var10002 = 0;
         }
      }
   }
}
