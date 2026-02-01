package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class gO extends gQ {
   private final i<V> w;
   private final a h;
   private final a k;
   private final a A;
   private final a F;
   private final i<g5> t;
   private final i<_l> o;
   private final U U;
   private final a V;
   private List<class_243> c;
   private static final long a = ds.a(-7909538573051001964L, 606872955968449798L, MethodHandles.lookup().lookupClass()).a(60257572950831L);
   private static final String[] b;

   public gO() {
      String[] var1 = b;
      super(var1[3], var1[6], zo.COMBAT);
      this.w = new i(var1[8], club.evon.V.LEGACY);
      this.h = new a(var1[0], 10.0D, 1.0D, 100.0D, 1.0D);
      this.k = new a(var1[2], 5.0D, 0.5D, 9.5D, 0.5D);
      this.A = new a(var1[5], 12.0D, 1.0D, 20.0D, 1.0D);
      this.F = new a(var1[9], 15.0D, 1.0D, 20.0D, 1.0D);
      this.t = new i(var1[7], g5.SINGLE);
      this.o = new i(var1[1], _l.DISTANCE);
      this.U = new U();
      this.V = new a(var1[4], 1.0D, 1.0D, 100.0D, 1.0D);
      this.c = new ArrayList();
      this.A.q(() -> {
         long var1 = a ^ 75329264502146L;
         String[] var3 = gI.m();

         boolean var10000;
         label32: {
            try {
               var10000 = ((V)this.w.J()).equals(club.evon.V.MODERN);
               if (var3 != null) {
                  return var10000;
               }

               if (!var10000) {
                  break label32;
               }
            } catch (MatchException var4) {
               throw a(var4);
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      });
      this.F.q(() -> {
         long var1 = a ^ 76431439453311L;
         String[] var3 = gI.m();

         boolean var10000;
         label32: {
            try {
               var10000 = ((V)this.w.J()).equals(club.evon.V.MODERN);
               if (var3 != null) {
                  return var10000;
               }

               if (!var10000) {
                  break label32;
               }
            } catch (MatchException var4) {
               throw a(var4);
            }

            var10000 = false;
            return var10000;
         }

         var10000 = true;
         return var10000;
      });
      this.g(new B[]{this.w, this.A, this.F, this.h, this.o, this.t, this.U, this.V});
   }

   public void W() {
      super.W();
   }

   @_S
   private void i(_D param1) {
      // $FF: Couldn't be decompiled
   }

   private double s(class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   private ArrayList<class_243> L(class_243 param1, class_243 param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean Q(class_2338 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 107182384975702L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[10];
      int var7 = 0;
      String var6 = "\u0016\u0014F¬é»\n\u009fÌï%X,wq1\u0010\u0091R\u0096ÏX\u0019Sø¿£\u008cç~P8ü\u0010¯\u0011\u009fkåÀ@»D½µA)ðÕ§\u0010÷\u0091^¤*å\u0095L9¿\f\u0084\u0012(\u008e\u0080\u0010µ\u0085H\u009c\u0097ÃßMº\u009fe/u\u0003ø\u008f\bC¥Ý¨ï<ÈA(\u0084Õð/Ú\u0001\u0000GÈg@\u001a\u001d;üaûÇ×´Ó¡bêì\u0083\u000f³,C\u0015\u008b¼g4Uòg´q\u00108Á§x\t\u000bè=l%å6SèÉ)";
      int var8 = "\u0016\u0014F¬é»\n\u009fÌï%X,wq1\u0010\u0091R\u0096ÏX\u0019Sø¿£\u008cç~P8ü\u0010¯\u0011\u009fkåÀ@»D½µA)ðÕ§\u0010÷\u0091^¤*å\u0095L9¿\f\u0084\u0012(\u008e\u0080\u0010µ\u0085H\u009c\u0097ÃßMº\u009fe/u\u0003ø\u008f\bC¥Ý¨ï<ÈA(\u0084Õð/Ú\u0001\u0000GÈg@\u001a\u001d;üaûÇ×´Ó¡bêì\u0083\u000f³,C\u0015\u008b¼g4Uòg´q\u00108Á§x\t\u000bè=l%å6SèÉ)".length();
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
                  b = var9;
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

               var6 = "Ù\u0019N\u008fpC:Ä~ºFíÆë\fõ\bú\u0088U\u001cÎ\u0086È-";
               var8 = "Ù\u0019N\u008fpC:Ä~ºFíÆë\fõ\bú\u0088U\u001cÎ\u0086È-".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static MatchException a(MatchException var0) {
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
