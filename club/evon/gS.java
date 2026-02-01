package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2338.class_2339;
import org.json.JSONException;

public final class gS extends gQ {
   private final i<N> K;
   private final i<M> r;
   private final i<Jh> F;
   private final a l;
   private final t f;
   private final t g;
   private final t N;
   public yZ a;
   private int M;
   private yB v;
   private Map<Integer, Integer> L;
   private int W;
   private static gQ[] t;
   private static final long b = ds.a(3751320022054999890L, 7520342242938223979L, MethodHandles.lookup().lookupClass()).a(281353567190965L);
   private static final String[] c;

   public gS() {
      String[] var1 = c;
      super(var1[0], var1[6], zo.MOTION);
      this.K = new i(var1[4], club.evon.N.HYPIXEL);
      this.r = new i(var1[8], club.evon.M.CLIENT);
      this.F = new i(var1[2], Jh.CLIENT);
      this.l = new a(var1[7], 5.0D, 1.0D, 10.0D, 0.1D);
      this.f = new t(var1[5], true);
      this.g = new t(var1[1], true);
      this.N = new t(var1[3], true);
      this.l.q(() -> {
         long var1 = b ^ 101511242052405L;
         gQ[] var3 = z();

         boolean var10000;
         label32: {
            try {
               var10000 = ((N)this.K.J()).equals(club.evon.N.HYPIXEL);
               if (var3 != null) {
                  return var10000;
               }

               if (!var10000) {
                  break label32;
               }
            } catch (JSONException var4) {
               throw a(var4);
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      });
      this.g(new B[]{this.K, this.r, this.F, this.l, this.f, this.g, this.N});
   }

   protected void H() {
      this.L = null;
      this.W = 0;
      super.H();
   }

   protected void W() {
      // $FF: Couldn't be decompiled
   }

   @_S
   public void M(J0 event) {
      // $FF: Couldn't be decompiled
   }

   public boolean m() {
      // $FF: Couldn't be decompiled
   }

   @_S
   public void s(vq event) {
      // $FF: Couldn't be decompiled
   }

   @_S(
      h = 1
   )
   public void Q(vA event) {
      // $FF: Couldn't be decompiled
   }

   @_S(
      h = 1
   )
   public void X(_D event) {
      // $FF: Couldn't be decompiled
   }

   @_S(
      h = 1
   )
   public void J(yN event) {
      // $FF: Couldn't be decompiled
   }

   private boolean B() {
      // $FF: Couldn't be decompiled
   }

   @_S
   public void t(v3 event) {
      // $FF: Couldn't be decompiled
   }

   private int b() {
      // $FF: Couldn't be decompiled
   }

   private void m() {
      // $FF: Couldn't be decompiled
   }

   private yB Z(za param1, class_243 param2) {
      // $FF: Couldn't be decompiled
   }

   private yZ d() {
      return this.Q(ym.m.field_1724.method_24515().method_33096(this.M).method_10074(), ym.m.field_1724);
   }

   private yZ Q(class_2338 var1, class_1657 var2) {
      long var3 = b ^ 13155191969379L;
      gQ[] var5 = z();
      if (ym.m.field_1687.method_8320(var1).method_45474()) {
         class_2339 var6 = new class_2339();
         ArrayList var7 = new ArrayList();
         byte var8 = 5;
         int var9 = 0;

         label155:
         while(true) {
            int var10000 = var9;

            ArrayList var31;
            label160: {
               boolean var30;
               label151:
               while(true) {
                  if (var10000 > -var8) {
                     var30 = false;
                     if (var5 != null) {
                        break;
                     }

                     int var10 = 0;

                     label146:
                     do {
                        var10000 = var10;

                        label143:
                        while(true) {
                           if (var10000 >= var8) {
                              break label146;
                           }

                           var10000 = 0;
                           if (var5 != null) {
                              continue label151;
                           }

                           int var11 = 0;

                           while(true) {
                              var10000 = var11;

                              label138:
                              while(true) {
                                 if (var10000 >= var8) {
                                    break label143;
                                 }

                                 int[] var12 = new int[]{1, -1};
                                 int var13 = var12.length;
                                 var10000 = 0;
                                 if (var5 != null) {
                                    continue label143;
                                 }

                                 int var14 = 0;

                                 while(true) {
                                    var10000 = var14;

                                    label133:
                                    while(true) {
                                       if (var10000 >= var13) {
                                          break label138;
                                       }

                                       int var15 = var12[var14];
                                       var6.method_10103(var1.method_10263() + var10 * var15, var1.method_10264() + var9 * var15, var1.method_10260() + var11 * var15);
                                       var10000 = ym.m.field_1687.method_8320(var6).method_45474();
                                       if (var5 != null) {
                                          continue label138;
                                       }

                                       if (var10000 == 0) {
                                          break;
                                       }

                                       class_2350[] var16 = class_2350.values();
                                       int var17 = var16.length;
                                       int var18 = 0;

                                       while(true) {
                                          label168: {
                                             if (var18 >= var17) {
                                                break label133;
                                             }

                                             class_2350 var19 = var16[var18];
                                             class_2338 var20 = var6.method_10093(var19);

                                             try {
                                                if (var5 != null) {
                                                   break label168;
                                                }

                                                var10000 = ym.m.field_1687.method_8320(var20).method_45474();
                                                if (var5 != null) {
                                                   break;
                                                }
                                             } catch (JSONException var24) {
                                                throw a(var24);
                                             }

                                             try {
                                                if (var10000 == 0) {
                                                   var7.add(new za(var20, var19.method_10153()));
                                                }
                                             } catch (JSONException var25) {
                                                throw a(var25);
                                             }

                                             ++var18;
                                          }

                                          if (var5 != null) {
                                             break label133;
                                          }
                                       }
                                    }

                                    ++var14;
                                    if (var5 != null) {
                                       break label138;
                                    }
                                 }
                              }

                              ++var11;
                              if (var5 != null) {
                                 break label143;
                              }
                           }
                        }

                        ++var10;
                     } while(var5 == null);

                     --var9;
                     if (var5 == null) {
                        continue label155;
                     }
                  }

                  try {
                     var31 = var7;
                     if (var5 != null) {
                        break label160;
                     }

                     var30 = var7.isEmpty();
                     break;
                  } catch (JSONException var22) {
                     throw a(var22);
                  }
               }

               try {
                  if (var30) {
                     return null;
                  }
               } catch (JSONException var23) {
                  throw a(var23);
               }

               var31 = var7;
            }

            var31.sort(Comparator.comparingDouble((var1x) -> {
               return var1x.i.method_10093(var1x.q).method_10262(var1);
            }));
            class_243 var26 = var2.method_73189().method_1031(0.0D, (double)var2.method_5751(), 0.0D);
            Iterator var27 = var7.iterator();

            do {
               if (!var27.hasNext()) {
                  return null;
               }

               za var28 = (za)var27.next();
               yB var29 = this.Z(var28, var26);

               try {
                  if (var29 != null) {
                     return new yZ(var28, var29);
                  }
               } catch (JSONException var21) {
                  throw a(var21);
               }
            } while(var5 == null);

            return null;
         }
      } else {
         return null;
      }
   }

   public static void X(gQ[] var0) {
      t = var0;
   }

   public static gQ[] z() {
      return t;
   }

   static {
      long var0 = b ^ 131830794415927L;
      X((gQ[])null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "\u0084\u0006cíæ\u0011¥_5\u0007ÇÙ¶\u0089ÕA\u0010þk\u0099Ësóet\\wÞg¥lêq\u0010ÜÏÎ\u009e5ÑËù\u0082\u0006\u0089\u008f\u0011\u001aØ-\b\fnp>ÔÕßÖ\bíã¹U\u000fåá)\bÚ·S3\u001eÛ\u0095 (\u0003X\u001bÂQì¬Ãð@rß³a\u0090<y\u0006Ø±®H\b@ÿë¥°ÝìN[¨©³\u0089\u000e\u0001á*";
      int var8 = "\u0084\u0006cíæ\u0011¥_5\u0007ÇÙ¶\u0089ÕA\u0010þk\u0099Ësóet\\wÞg¥lêq\u0010ÜÏÎ\u009e5ÑËù\u0082\u0006\u0089\u008f\u0011\u001aØ-\b\fnp>ÔÕßÖ\bíã¹U\u000fåá)\bÚ·S3\u001eÛ\u0095 (\u0003X\u001bÂQì¬Ãð@rß³a\u0090<y\u0006Ø±®H\b@ÿë¥°ÝìN[¨©³\u0089\u000e\u0001á*".length();
      char var5 = 16;
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

               var6 = "·g¢\u008a+\u001f\u0097\u0097\u009e\nÐëD[:J\u0010\u000e¢¶\u0006Ï\u0012]\u0090\u0014éfw\u0092;0'";
               var8 = "·g¢\u008a+\u001f\u0097\u0097\u009e\nÐëD[:J\u0010\u000e¢¶\u0006Ï\u0012]\u0090\u0014éfw\u0092;0'".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static JSONException a(JSONException var0) {
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
