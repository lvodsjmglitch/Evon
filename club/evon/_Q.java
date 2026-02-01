package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _Q extends _R {
   public static boolean j;
   private static String n;
   private static final long b = ds.a(2336031094235391668L, -4717139131064411366L, MethodHandles.lookup().lookupClass()).a(99622615881018L);
   private static final String[] c;

   public _Q() {
      String[] var1 = c;
      super(var1[4], var1[5], "");
   }

   public boolean x(String[] arguments) {
      // $FF: Couldn't be decompiled
   }

   public ArrayList<String> X() {
      return new zQ(this);
   }

   static {
      long var0 = b ^ 1067756640664L;
      q((String)null);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[6];
      int var7 = 0;
      String var6 = "ò{«oÕ\u0098\u0080\u0090\u008b]wnã\bpî\u0093Ö\u0090NÒ³\u008cF\bTÒ\u001a_@Æc4\bÃÞnFSRG\u009b(RªAõ\u0093à\nQÕ\u0015%\u009aáþc.Ý\u0004-XßóbzCgýêx«bî¥u\u00adRò:\u001cØ";
      int var8 = "ò{«oÕ\u0098\u0080\u0090\u008b]wnã\bpî\u0093Ö\u0090NÒ³\u008cF\bTÒ\u001a_@Æc4\bÃÞnFSRG\u009b(RªAõ\u0093à\nQÕ\u0015%\u009aáþc.Ý\u0004-XßóbzCgýêx«bî¥u\u00adRò:\u001cØ".length();
      char var5 = 24;
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
                  j = true;
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

               var6 = "zb¾ÁíÌG\u0094(Ù\u0080à¼m\u0094Cn\u0089,\u0016\u001cÖ\u009bn\u0006Ëâ<ó.\u001e^ ãåÈÌ\u0096N,þÔ\u0019\u009f\u0098Ãà\u00ad\u0085";
               var8 = "zb¾ÁíÌG\u0094(Ù\u0080à¼m\u0094Cn\u0089,\u0016\u001cÖ\u009bn\u0006Ëâ<ó.\u001e^ ãåÈÌ\u0096N,þÔ\u0019\u009f\u0098Ãà\u00ad\u0085".length();
               var5 = '\b';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   public static void q(String var0) {
      n = var0;
   }

   public static String a() {
      return n;
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
