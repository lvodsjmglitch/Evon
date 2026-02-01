package club.evon;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_2246;
import net.minecraft.class_2248;

public enum zt {
   DIAMOND,
   GOLD,
   EMERALD,
   IRON,
   REDSTONE,
   LAPIS,
   COAL;

   private final Color Y;
   private final List<class_2248> X;
   private static final zt[] Q;

   private zt(Color var3, class_2248... var4) {
      this.Y = var3;
      this.X = Arrays.asList(var4);
   }

   public Color w() {
      return this.Y;
   }

   public List<class_2248> Q() {
      return this.X;
   }

   private static zt[] C() {
      return new zt[]{DIAMOND, GOLD, EMERALD, IRON, REDSTONE, LAPIS, COAL};
   }

   static {
      String[] var0 = new String[7];
      int var4 = 0;
      String var3 = "\u001e:\"\u001a\u0005\u00154>\u0017\u0013\b\u000b0*\r\u0014\u000bw\u001c\u0007\u001c8+\f\u0001\b}\u0007\u001d</\u0013\u000f\n}";
      int var5 = "\u001e:\"\u001a\u0005\u00154>\u0017\u0013\b\u000b0*\r\u0014\u000bw\u001c\u0007\u001c8+\f\u0001\b}\u0007\u001d</\u0013\u000f\n}".length();
      char var2 = 4;
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
                     var28 = 76;
                     break;
                  case 1:
                     var28 = 96;
                     break;
                  case 2:
                     var28 = 123;
                     break;
                  case 3:
                     var28 = 75;
                     break;
                  case 4:
                     var28 = 85;
                     break;
                  case 5:
                     var28 = 81;
                     break;
                  default:
                     var28 = 44;
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
                  DIAMOND = new zt(var0[4], 0, new Color(47, 223, 223), new class_2248[]{class_2246.field_10442, class_2246.field_29029});
                  GOLD = new zt(var0[0], 1, new Color(223, 214, 47), new class_2248[]{class_2246.field_10571, class_2246.field_29026});
                  EMERALD = new zt(var0[3], 2, new Color(30, 181, 45), new class_2248[]{class_2246.field_10013, class_2246.field_29220});
                  IRON = new zt(var0[5], 3, new Color(189, 139, 69), new class_2248[]{class_2246.field_10212, class_2246.field_29027});
                  REDSTONE = new zt(var0[2], 4, new Color(223, 47, 47), new class_2248[]{class_2246.field_10080, class_2246.field_29030});
                  LAPIS = new zt(var0[1], 5, new Color(47, 103, 223), new class_2248[]{class_2246.field_10090, class_2246.field_29028});
                  COAL = new zt(var0[6], 6, new Color(23, 19, 19), new class_2248[]{class_2246.field_10418, class_2246.field_29219});
                  Q = C();
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

               var3 = "#\u0014\u0012#\u0004)\t\u001c!";
               var5 = "#\u0014\u0012#\u0004)\t\u001c!".length();
               var2 = 4;
               var1 = -1;
            }

            var10000 = 38;
            ++var1;
            var10001 = var3.substring(var1, var1 + var2);
            var10002 = 0;
         }
      }
   }
}
