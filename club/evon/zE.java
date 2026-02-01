package club.evon;

import io.netty.channel.ChannelFuture;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11653;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2598;
import net.minecraft.class_2915;
import net.minecraft.class_437;
import net.minecraft.class_635;
import net.minecraft.class_6368;
import net.minecraft.class_6370;
import net.minecraft.class_639;
import net.minecraft.class_642;
import net.minecraft.class_9099;
import net.minecraft.class_9112;
import net.minecraft.class_642.class_8678;

public final class zE implements h {
   private final String U;
   private CompletableFuture<yt> y;
   private String e;
   private final ExecutorService v;
   private final Pattern k;
   private static zE a;
   private static final long b = ds.a(-8924784802156313973L, 4613851900784897891L, MethodHandles.lookup().lookupClass()).a(180521940672872L);
   private static final String[] c;
   private static final long[] d;
   private static final Long[] f;
   private static final Map g;

   public zE() {
      String[] var1 = c;
      this.U = var1[1];
      this.v = Executors.newCachedThreadPool((var0) -> {
         Thread var1 = new Thread(var0, c[2]);
         var1.setDaemon(true);
         return var1;
      });
      this.k = Pattern.compile(var1[5]);
   }

   @_S
   private void G(v3 param1) {
      // $FF: Couldn't be decompiled
   }

   public yt I(v_ login) {
      long var2 = b ^ 85764296955436L;
      this.y = new CompletableFuture();
      this.v.execute(() -> {
         this.G(var1);
      });

      yt var5;
      try {
         yt var4 = (yt)this.y.get(true.y<invokedynamic>(26756, 9041053682633843313L ^ var2), TimeUnit.SECONDS);
         return var4;
      } catch (Exception var9) {
         var5 = yt.UNKNOWN;
      } finally {
         this.y = null;
      }

      return var5;
   }

   private void G(v_ var1) {
      long var2 = b ^ 45967800642958L;
      String var4 = vz.O();

      try {
         String[] var9 = c;
         Optional var5 = class_6370.field_33745.method_36907(class_639.method_2950(var9[4])).map(class_6368::method_36902);

         Object var10000;
         label30: {
            label29: {
               try {
                  var10000 = var5;
                  if (var4 != null) {
                     break label30;
                  }

                  if (var5.isEmpty()) {
                     break label29;
                  }
               } catch (Exception var10) {
                  throw a((Throwable)var10);
               }

               var10000 = var5.get();
               break label30;
            }

            this.y.complete(yt.UNBANNED);
            return;
         }

         InetSocketAddress var6 = (InetSocketAddress)var10000;
         class_2535 var7 = new class_2535(class_2598.field_11942);
         var7.method_53505(ym.m.method_53526().method_53544());
         ChannelFuture var8 = class_2535.method_52271(var6, ym.m.field_1690.method_1639(), var7);
         var8.syncUninterruptibly();
         String var10001 = var6.getHostName();
         int var10002 = var6.getPort();
         var9 = c;
         var7.method_56326(var10001, var10002, class_9099.field_48247, class_9099.field_48248, new class_635(var7, ym.m, new class_642(var9[1], var9[1], class_8678.field_45611), (class_437)null, false, (Duration)null, this::H, new class_11653(), (class_9112)null), false);
         var7.method_10743(new class_2915(var1.k(), zD.c(var1.K())));
      } catch (Exception var11) {
         this.y.completeExceptionally(var11);
      }

   }

   private void H(class_2561 param1) {
      // $FF: Couldn't be decompiled
   }

   public long S(String input) {
      long var2 = b ^ 14082970627044L;
      Matcher var4 = this.k.matcher(var1.toLowerCase().trim());

      try {
         if (!var4.matches()) {
            return 0L;
         }
      } catch (MatchException var13) {
         throw a((Throwable)var13);
      }

      long var5 = this.X(var4, 1);
      long var7 = this.X(var4, 2);
      long var9 = this.X(var4, 3);
      long var11 = this.X(var4, 4);
      return ((var5 * true.y<invokedynamic>(7057, 2992664134239497391L ^ var2) + var7) * true.y<invokedynamic>(15806, 5230867305777400450L ^ var2) + var9) * true.y<invokedynamic>(6273, 6243281496272187326L ^ var2) + var11;
   }

   private long X(Matcher param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static void T() {
      a = new zE();
      C.P(a);
   }

   public static zE T() {
      return a;
   }

   static {
      long var11 = b ^ 134486671204452L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "9æe¤HaZ\u0091o\u001cTÏtx\r\u0091$Uuè5MðX\u0018\u0086-Æüt@çI&\u007fXFá!\u0014\u0099Jèê§è\u001e55\u0010kÃÀÈUæ\u0001{\u001ccH²¹Ùì(\u0018Å\u0084\u0017¿óÿQ\u008a*\u0084\u0014%í\u0003Ò\u008bÍ3\u000b/a\u0091\u0097ü\u0018\u0086-Æüt@çI&\u007fXFá!\u0014\u0099Jèê§è\u001e558b\u0094\u009c\u0096£I\u0087û\u00ad¹÷øÅ(!XÁôfR\u0014ýj\u0002Ò^Á\r\u001c\u009aÍ>*P W9Ñ\u0091ü.>&KÇÈ\u0018\u009dKF\u0011±Ï\u0015´]";
      int var19 = "9æe¤HaZ\u0091o\u001cTÏtx\r\u0091$Uuè5MðX\u0018\u0086-Æüt@çI&\u007fXFá!\u0014\u0099Jèê§è\u001e55\u0010kÃÀÈUæ\u0001{\u001ccH²¹Ùì(\u0018Å\u0084\u0017¿óÿQ\u008a*\u0084\u0014%í\u0003Ò\u008bÍ3\u000b/a\u0091\u0097ü\u0018\u0086-Æüt@çI&\u007fXFá!\u0014\u0099Jèê§è\u001e558b\u0094\u009c\u0096£I\u0087û\u00ad¹÷øÅ(!XÁôfR\u0014ýj\u0002Ò^Á\r\u001c\u009aÍ>*P W9Ñ\u0091ü.>&KÇÈ\u0018\u009dKF\u0011±Ï\u0015´]".length();
      char var16 = 24;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  c = var20;
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "ü\tîcâlh»¥\u0017ð\u00947_$¬";
                  int var5 = "ü\tîcâlh»¥\u0017ð\u00947_$¬".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              d = var6;
                              f = new Long[4];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "©\u0011\u000b¡4¸1±\rÚ°À\u000fÑÓö";
                           var5 = "©\u0011\u000b¡4¸1±\rÚ°À\u000fÑÓö".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "¾\u0012\u0092\u0094t®\rÜÅq\u0097512ý\u000e\u0087Ù\u0093ït\bÓJ0®Mq\u0097£íà=!«Õ\u00898¿î?ìu¬=|Ç\u0087Ê¦©\u0004\fa\u00ad<Ò\u0001àt4\fó\rôY/ã¤-\u008b\n\u0017";
               var19 = "¾\u0012\u0092\u0094t®\rÜÅq\u0097512ý\u000e\u0087Ù\u0093ït\bÓJ0®Mq\u0097£íà=!«Õ\u00898¿î?ìu¬=|Ç\u0087Ê¦©\u0004\fa\u00ad<Ò\u0001àt4\fó\rôY/ã¤-\u008b\n\u0017".length();
               var16 = 24;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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

   private static long a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16701;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = d[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("club/evon/zE", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static long a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = a(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("club/evon/zE" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
