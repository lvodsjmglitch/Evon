package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_4587;
import org.json.JSONException;

public final class gv extends gQ {
   private final t V;
   private final i<_k> I;
   private final t b;
   private final t j;
   private final t E;
   private final a x;
   private final a w;
   private final a T;
   private final a C;
   private final t i;
   private final t h;
   private final t g;
   private final t Z;
   private static boolean J;
   private static final long a = ds.a(4329367893975766615L, -4022575976129799186L, MethodHandles.lookup().lookupClass()).a(153071035264542L);
   private static final String[] c;

   public gv() {
      String[] var1 = c;
      super(var1[11], var1[0], zo.RENDER);
      this.V = new t(var1[13], true);
      this.I = new i(var1[5], _k.V1_7);
      this.b = new t(var1[10], true);
      this.j = new t(var1[4], true);
      this.E = new t(var1[8], false);
      this.x = new a(var1[9], 1.0D, 0.1D, 2.0D, 0.1D);
      this.w = new a(var1[3], 0.0D, -2.0D, 2.0D, 0.05D);
      this.T = new a(var1[12], 0.0D, -2.0D, 2.0D, 0.05D);
      this.C = new a(var1[6], 0.0D, -2.0D, 2.0D, 0.05D);
      this.i = new t(var1[7], true);
      this.h = new t(var1[14], true);
      this.g = new t(var1[1], false);
      this.Z = new t(var1[2], false);
      this.B(true);
      this.I.q(this::x);
      this.g(new B[]{this.V, this.I, this.b, this.j, this.E, this.x, this.w, this.T, this.C, this.i, this.h, this.g, this.Z});
   }

   public boolean b() {
      return this.g.I();
   }

   public boolean L() {
      return this.E.I();
   }

   public float d() {
      return ((Double)this.x.J()).floatValue();
   }

   public boolean x() {
      return this.V.I();
   }

   public boolean j() {
      return this.Z.I();
   }

   public boolean I() {
      return this.i.I();
   }

   public boolean G() {
      return this.j.I();
   }

   public boolean w() {
      return this.b.I();
   }

   public float D() {
      return ((Double)this.w.J()).floatValue();
   }

   public float z() {
      return ((Double)this.T.J()).floatValue();
   }

   public float x() {
      return ((Double)this.C.J()).floatValue();
   }

   public boolean V() {
      return this.h.I();
   }

   public void d(class_4587 matrices, float swingProgress) {
      // $FF: Couldn't be decompiled
   }

   public static void V(boolean var0) {
      J = var0;
   }

   public static boolean N() {
      return J;
   }

   public static boolean i() {
      boolean var0 = N();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      long var0 = a ^ 45994281528893L;
      V(false);
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[15];
      int var7 = 0;
      String var6 = "[\u000b\u0007l¦®¬\u0082¦\u0099£=\u0004¶\u0014§^\u008aü¯3û¼ð,\u0091©\u0013'¡\u008f\u0010\u001a]Ó#&\r(=\u0010_æ\u009eòÏ\u0005\u0085Ø\u008c\u0099,å\u0081[Êë\u0010Ö¨çä\u008d$Ý4;Ö²¾\u0098zsÐ\u0010#ÏÉ\u0099U\u0096E\u0082Y]=,S°\u0085\u009d\u0018e¸\u0005îèjs\u0013h²\u001e\u0081)\u008d ,_ÿ¬\u0000i\n¿ï\u0010ù\b±ÇÒ\"F\u0013\u0016÷\u0000aöò»o\u0010n\u001f8=]\u0005ã\u0018\u0014\u0090>Ñ0Æñk\u0010;¾û\u0089\u008ewt?64u#ó\"ÿû\u0010ÔrË-dÈ¹ÆÜRùä²¬?=\u0018\u0000\u0087\u0084ð\"ê¼\u001e1\u0015«\u0013ÄÍùn\u008dùóg´\u008cj\u0098\u0010¤\u0095ìðÂA(]\u008d\u0006Pðè\u0003»µ\u0010\u000f¦x¼ü(dú«DQx÷±qO\u0010\u0014[ì²ÔÈTÑ:ÆS½\u00adGv\u0007";
      int var8 = "[\u000b\u0007l¦®¬\u0082¦\u0099£=\u0004¶\u0014§^\u008aü¯3û¼ð,\u0091©\u0013'¡\u008f\u0010\u001a]Ó#&\r(=\u0010_æ\u009eòÏ\u0005\u0085Ø\u008c\u0099,å\u0081[Êë\u0010Ö¨çä\u008d$Ý4;Ö²¾\u0098zsÐ\u0010#ÏÉ\u0099U\u0096E\u0082Y]=,S°\u0085\u009d\u0018e¸\u0005îèjs\u0013h²\u001e\u0081)\u008d ,_ÿ¬\u0000i\n¿ï\u0010ù\b±ÇÒ\"F\u0013\u0016÷\u0000aöò»o\u0010n\u001f8=]\u0005ã\u0018\u0014\u0090>Ñ0Æñk\u0010;¾û\u0089\u008ewt?64u#ó\"ÿû\u0010ÔrË-dÈ¹ÆÜRùä²¬?=\u0018\u0000\u0087\u0084ð\"ê¼\u001e1\u0015«\u0013ÄÍùn\u008dùóg´\u008cj\u0098\u0010¤\u0095ìðÂA(]\u008d\u0006Pðè\u0003»µ\u0010\u000f¦x¼ü(dú«DQx÷±qO\u0010\u0014[ì²ÔÈTÑ:ÆS½\u00adGv\u0007".length();
      char var5 = '(';
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

               var6 = "ÉúôRÛÅq¬o\fn7I1õå\u0018Ä\u0018±\u001e¤p\u0089)¬¾SÎ6ÍÌ7\u009dù\u0003\u008eÚ\u0092^q";
               var8 = "ÉúôRÛÅq¬o\fn7I1õå\u0018Ä\u0018±\u001e¤p\u0089)¬¾SÎ6ÍÌ7\u009dù\u0003\u008eÚ\u0092^q".length();
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
