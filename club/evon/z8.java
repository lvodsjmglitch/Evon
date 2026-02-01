package club.evon;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.lang.invoke.MethodHandles;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_241;
import org.json.JSONException;

public final class z8 {
   private static final DateTimeFormatter v;
   private String j;
   private String b;
   private String m;
   private int H;
   private final String F;
   private final File M;
   private static final long a = ds.a(2930774570581079650L, 8136882244849921743L, MethodHandles.lookup().lookupClass()).a(24517570845089L);
   private static final String[] c;

   public z8(String name) {
      String[] var2 = c;
      this.j = var2[11];
      this.b = var2[6];
      this.m = var2[6];
      this.H = _H.USER.v();
      this.F = var1;
      this.M = new File(new File(ym.m.field_1697, var2[20]), var1 + var2[4]);
   }

   public void b() {
      long var1 = a ^ 26560953396339L;
      boolean var3 = zB.O();

      try {
         this.M.createNewFile();
         JsonObject var4 = new JsonObject();
         JsonObject var5 = new JsonObject();
         String[] var23 = c;
         this.j = var23[16];
         this.b = zy.g().r();
         this.H = zy.g().M().v();
         this.m = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
         var5.addProperty(var23[0], this.j);
         var5.addProperty(var23[21], this.b);
         var5.addProperty(var23[23], this.H);
         var5.addProperty(var23[22], this.m);
         var4.add(var23[7], var5);
         JsonObject var6 = new JsonObject();
         Iterator var7 = zy.p().q().j().iterator();

         label144: {
            label143:
            do {
               int var10000 = var7.hasNext();

               gQ var8;
               JsonObject var9;
               label140:
               while(true) {
                  if (var10000 == 0) {
                     break label143;
                  }

                  var8 = (gQ)var7.next();
                  var9 = new JsonObject();
                  var23 = c;
                  var9.addProperty(var23[2], var8.d());
                  if (var3) {
                     break label144;
                  }

                  Iterator var10 = var8.V().iterator();

                  while(true) {
                     if (!var10.hasNext()) {
                        break label140;
                     }

                     B var11 = (B)var10.next();
                     Objects.requireNonNull(var11);
                     B var12 = var11;
                     byte var13 = 0;

                     label135: {
                        label134: {
                           label133: {
                              label132: {
                                 label131: {
                                    label130: {
                                       label155: {
                                          label128: {
                                             label127: {
                                                B var33;
                                                label126: {
                                                   try {
                                                      var33 = var12;
                                                      if (var3) {
                                                         break label126;
                                                      }

                                                      var10000 = var12.typeSwitch<invokedynamic>(var12, var13);
                                                      if (var3) {
                                                         break;
                                                      }
                                                   } catch (Throwable var27) {
                                                      throw a(var27);
                                                   }

                                                   switch(var10000) {
                                                   case 0:
                                                      var33 = var11;
                                                      break;
                                                   case 1:
                                                      break label127;
                                                   case 2:
                                                      break label128;
                                                   case 3:
                                                      break label155;
                                                   case 4:
                                                      break label130;
                                                   case 5:
                                                      break label131;
                                                   case 6:
                                                      break label132;
                                                   case 7:
                                                      break label133;
                                                   case 8:
                                                      break label134;
                                                   default:
                                                      break label135;
                                                   }
                                                }

                                                L var14 = (L)var33;
                                                JsonObject var15 = new JsonObject();
                                                var23 = c;
                                                var15.addProperty(var23[25], (Number)var14.J());
                                                var15.addProperty(var23[5], var14.h().name());
                                                var9.add(var14.S(), var15);
                                                if (!var3) {
                                                   break label135;
                                                }
                                             }

                                             t var32 = (t)var11;
                                             var9.addProperty(var11.S(), var32.I());
                                             if (!var3) {
                                                break label135;
                                             }
                                          }

                                          K var16 = (K)var11;
                                          JsonObject var17 = new JsonObject();
                                          t[] var18 = (t[])var16.J();
                                          int var19 = var18.length;
                                          int var20 = 0;

                                          label97: {
                                             while(var20 < var19) {
                                                t var21 = var18[var20];

                                                try {
                                                   var17.addProperty(var21.S(), var21.I());
                                                   ++var20;
                                                   if (var3) {
                                                      break label97;
                                                   }

                                                   if (var3) {
                                                      break;
                                                   }
                                                } catch (Throwable var26) {
                                                   throw a(var26);
                                                }
                                             }

                                             var9.add(var11.S(), var17);
                                          }

                                          if (!var3) {
                                             break label135;
                                          }
                                       }

                                       a var34 = (a)var11;
                                       var9.addProperty(var11.S(), (Number)var34.J());
                                       if (!var3) {
                                          break label135;
                                       }
                                    }

                                    i var35 = (i)var11;
                                    var9.addProperty(var11.S(), String.valueOf(var35.J()));
                                    if (!var3) {
                                       break label135;
                                    }
                                 }

                                 R var36 = (R)var11;
                                 JsonObject var37 = new JsonObject();
                                 var37.addProperty("x", ((class_241)var36.J()).field_1343);
                                 var37.addProperty("y", ((class_241)var36.J()).field_1342);
                                 var9.add(var36.S(), var37);
                                 if (!var3) {
                                    break label135;
                                 }
                              }

                              P var38 = (P)var11;
                              var9.addProperty(var11.S(), String.valueOf(((vJ)var38.J()).R()));
                              if (!var3) {
                                 break label135;
                              }
                           }

                           u var39 = (u)var11;
                           var9.addProperty(var11.S(), (String)var39.J());
                           if (!var3) {
                              break label135;
                           }
                        }

                        c var22 = (c)var11;
                        var9.addProperty(var11.S(), ((Color)var22.J()).getRGB());
                     }

                     if (var3) {
                        break label140;
                     }
                  }
               }

               var6.add(var8.x(), var9);
            } while(!var3);

            var23 = c;
            var4.add(var23[18], var6);
         }

         var23 = c;
         String var29 = var23[10];
         String var30 = yb.q(var23[10], ym.p.toJson(var4));
         BufferedWriter var31 = new BufferedWriter(new FileWriter(this.M, false));

         try {
            var31.write(var30);
         } catch (Throwable var25) {
            try {
               var31.close();
            } catch (Throwable var24) {
               var25.addSuppressed(var24);
            }

            throw var25;
         }

         var31.close();
      } catch (Exception var28) {
      }

   }

   public void C() {
      // $FF: Couldn't be decompiled
   }

   public void f() {
      this.w(false);
   }

   public void w(boolean loadKeybinds) {
      // $FF: Couldn't be decompiled
   }

   private <T extends Enum<T>> void e(B<?> var1, String var2) {
      long var3 = a ^ 37417767879201L;
      i var5 = (i)var1;
      Iterator var6 = var5.C().iterator();

      while(var6.hasNext()) {
         Enum var7 = (Enum)var6.next();

         try {
            if (var7.name().equals(String.valueOf(var2))) {
               var5.P(var7);
            }
         } catch (JSONException var8) {
            throw a((Throwable)var8);
         }
      }

   }

   private void D(B<?> var1, String var2) {
      long var3 = a ^ 126083537980668L;
      P var5 = (P)var1;
      Iterator var6 = var5.b().iterator();

      while(var6.hasNext()) {
         vJ var7 = (vJ)var6.next();

         try {
            if (var7.R().equals(String.valueOf(var2))) {
               var5.n(var7);
            }
         } catch (JSONException var8) {
            throw a((Throwable)var8);
         }
      }

   }

   private void P(B<?> var1, String var2) {
      long var3 = a ^ 86646614688461L;
      L var5 = (L)var1;
      zq[] var6 = zq.values();
      int var7 = var6.length;

      for(int var8 = 0; var8 < var7; ++var8) {
         zq var9 = var6[var8];

         try {
            if (var9.name().equals(String.valueOf(var2))) {
               var5.v(var9);
            }
         } catch (JSONException var10) {
            throw a((Throwable)var10);
         }
      }

   }

   public String E() {
      return this.j;
   }

   public String o() {
      return this.b;
   }

   public String P() {
      return this.m;
   }

   public int j() {
      return this.H;
   }

   public String V() {
      return this.F;
   }

   public File o() {
      return this.M;
   }

   static {
      long var0 = a ^ 140490824541646L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[26];
      int var7 = 0;
      String var6 = "¬\\\u0003Fã\u0080]ª\b\u0088@\u0007°ö\u0088Õo\b\u0087\u0085ë\n\u001dÉ×ã\b\u0087\u0085ë\n\u001dÉ×ã\b¯¾þVï4óã\b\u008aÆ¯Ù¹í\u0082¥\böæD{ö\u008a{^\bÝ¬\f nóz\u000f\bÝ¬\f nóz\u000f\b\u0089Öi!\u001cLBÎ(\\\u009coy\u0016?\r´,¡\u0016ÃÅl-}7¬ö\u001d\u0096¯ä\u00035Ý\u009a\u0016f»÷ã©\nhº©Ì\u0004r\böæD{ö\u008a{^(\\\u009coy\u0016?\r´,¡\u0016ÃÅl-}7¬ö\u001d\u0096¯ä\u00035Ý\u009a\u0016f»÷ã©\nhº©Ì\u0004r\b\u008aÆ¯Ù¹í\u0082¥\b.ü\bÒ»Xs}\b\u0086v\u0016\u0006\u000bGËé\bñ\u0091W*\u0001\u0096Jþ\b8Vãü\u0019¸é2\b8Vãü\u0019¸é2\u0010!\u0085{ªZ(\\ SÀWt\u0097ö\u001b¯\u0010\u0006óúlåE\u0095.s¡<ø\u0016ýg\u008a\b\u0086v\u0016\u0006\u000bGËé\b\u0088@\u0007°ö\u0088Õo\b\u0089Öi!\u001cLBÎ";
      int var8 = "¬\\\u0003Fã\u0080]ª\b\u0088@\u0007°ö\u0088Õo\b\u0087\u0085ë\n\u001dÉ×ã\b\u0087\u0085ë\n\u001dÉ×ã\b¯¾þVï4óã\b\u008aÆ¯Ù¹í\u0082¥\böæD{ö\u008a{^\bÝ¬\f nóz\u000f\bÝ¬\f nóz\u000f\b\u0089Öi!\u001cLBÎ(\\\u009coy\u0016?\r´,¡\u0016ÃÅl-}7¬ö\u001d\u0096¯ä\u00035Ý\u009a\u0016f»÷ã©\nhº©Ì\u0004r\böæD{ö\u008a{^(\\\u009coy\u0016?\r´,¡\u0016ÃÅl-}7¬ö\u001d\u0096¯ä\u00035Ý\u009a\u0016f»÷ã©\nhº©Ì\u0004r\b\u008aÆ¯Ù¹í\u0082¥\b.ü\bÒ»Xs}\b\u0086v\u0016\u0006\u000bGËé\bñ\u0091W*\u0001\u0096Jþ\b8Vãü\u0019¸é2\b8Vãü\u0019¸é2\u0010!\u0085{ªZ(\\ SÀWt\u0097ö\u001b¯\u0010\u0006óúlåE\u0095.s¡<ø\u0016ýg\u008a\b\u0086v\u0016\u0006\u000bGËé\b\u0088@\u0007°ö\u0088Õo\b\u0089Öi!\u001cLBÎ".length();
      char var5 = '\b';
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  c = var9;
                  v = DateTimeFormatter.ofPattern(c[19]);
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "¬\\\u0003Fã\u0080]ª\b.ü\bÒ»Xs}";
               var8 = "¬\\\u0003Fã\u0080]ª\b.ü\bÒ»Xs}".length();
               var5 = '\b';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }
}
