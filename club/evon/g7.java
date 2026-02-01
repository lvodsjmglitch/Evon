package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class g7 extends gQ {
   private Thread X;
   private String F;
   private final String y;
   private static final long a = ds.a(-2966013744116731734L, 914387926295893131L, MethodHandles.lookup().lookupClass()).a(229055504824844L);
   private static final String[] b;
   private static final long c;

   public g7() {
      String[] var1 = b;
      super(var1[4], var1[2], zo.MISC);
      this.y = var1[5];
   }

   public void W() {
      long var1 = a ^ 75366536833880L;
      this.X = new Thread(this::a, b[0]);
      int var10000 = gi.t();
      this.X.start();
      int var3 = var10000;

      try {
         super.W();
         if (gQ.q() == null) {
            ++var3;
            gi.y(var3);
         }

      } catch (JSONException var4) {
         throw a((Exception)var4);
      }
   }

   public void H() {
      // $FF: Couldn't be decompiled
   }

   private void a() {
      // $FF: Couldn't be decompiled
   }

   private void B(long var1) throws InterruptedException {
      Thread.sleep(var1);
   }

   public void K(String serverID) {
      this.F = var1;
   }

   static {
      long var5 = a ^ 104354233936668L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "WÐª0\u0014üªvÛw\u00894Ýê\n´R[\u008b¦\u009d\"1\b\b\u0017ùºÙ(ªÜ³ Ä\u001eÏ bR¾ï\u001d\u009f{®\u0080Ht®ÇÀ_§¤\u0015K\u0087\u009b'\u0081'd\u0005ùÎ\u0010Ü¼\u0090\u0087\u0080y>\u0080ò5ëØ^iU÷";
      int var13 = "WÐª0\u0014üªvÛw\u00894Ýê\n´R[\u008b¦\u009d\"1\b\b\u0017ùºÙ(ªÜ³ Ä\u001eÏ bR¾ï\u001d\u009f{®\u0080Ht®ÇÀ_§¤\u0015K\u0087\u009b'\u0081'd\u0005ùÎ\u0010Ü¼\u0090\u0087\u0080y>\u0080ò5ëØ^iU÷".length();
      char var10 = 24;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 2639889354596095220L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  c = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "WÐª0\u0014üªvK\u0014¿ìfZ\u0016p8÷µöò¯\u001fD\f\u0097»9\u0087,\u0004\u008aQ«§c!ýÉ\u007fçÆ#÷¨:\u001ax\t«\u0094\u007f5îß·b³ ö\u001eà\u0015uîßÀÍim\u0011\u0017o";
               var13 = "WÐª0\u0014üªvK\u0014¿ìfZ\u0016p8÷µöò¯\u001fD\f\u0097»9\u0087,\u0004\u008aQ«§c!ýÉ\u007fçÆ#÷¨:\u001ax\t«\u0094\u007f5îß·b³ ö\u001eà\u0015uîßÀÍim\u0011\u0017o".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
