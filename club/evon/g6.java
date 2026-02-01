package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_3489;
import org.json.JSONException;

public final class g6 extends gQ {
   private final a p;
   private final a A;
   private final a c;
   private final t N;
   private final U g;
   private final ya a;
   private static final long b = ds.a(3848888668947419599L, 5495971044139838018L, MethodHandles.lookup().lookupClass()).a(47792584135694L);
   private static final String[] d;

   public g6() {
      String[] var1 = d;
      super(var1[1], var1[5], zo.COMBAT);
      this.p = new a(var1[0], 3.0D, 0.0D, 8.0D, 0.1D);
      this.A = new a(var1[2], 3.0D, 0.0D, 8.0D, 0.1D);
      this.c = new a(var1[6], 250.0D, 50.0D, 1000.0D, 10.0D);
      this.N = new t(var1[4], true);
      this.g = new U();
      this.a = new ya(JD.M());
      this.g(new B[]{this.p, this.A, this.c, this.N, this.g});
   }

   protected void H() {
      this.T();
      super.H();
   }

   @_S
   private void G(vG param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean s(class_2596<?> param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean g() {
      return vD.a().q(ym.m.field_1724).method_31573(class_3489.field_42611);
   }

   @_S(
      h = -2
   )
   private void G(yN param1) {
      // $FF: Couldn't be decompiled
   }

   private void i(long var1) {
      this.a.L(var1);
   }

   private boolean O() {
      // $FF: Couldn't be decompiled
   }

   private boolean w() {
      return this.a.i();
   }

   private void T() {
      this.a.j();
   }

   public String O() {
      int var10000 = ((Double)this.c.J()).intValue();
      return var10000 + d[3];
   }

   public a z() {
      return this.p;
   }

   public a x() {
      return this.A;
   }

   public a B() {
      return this.c;
   }

   public t c() {
      return this.N;
   }

   public U f() {
      return this.g;
   }

   public ya E() {
      return this.a;
   }

   static {
      long var0 = b ^ 128842331257270L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[7];
      int var7 = 0;
      String var6 = "äçü\u008b×üÜ(\u0084¼j\u009b±YXb\u0010T\f@\u0010\u0099¨\u000fÝæ0\u0097ÎD<i\u000b\u0010¤òC\\\u0001üfBoõiçi¢\u0083\u0011\b\u001a©\u000e7\u001d7\u0005\u0088\u0010\u008f3O¯Ö¬üM\u0091ù|Ö\u0010\u000fÝ\f";
      int var8 = "äçü\u008b×üÜ(\u0084¼j\u009b±YXb\u0010T\f@\u0010\u0099¨\u000fÝæ0\u0097ÎD<i\u000b\u0010¤òC\\\u0001üfBoõiçi¢\u0083\u0011\b\u001a©\u000e7\u001d7\u0005\u0088\u0010\u008f3O¯Ö¬üM\u0091ù|Ö\u0010\u000fÝ\f".length();
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
                  d = var9;
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

               var6 = "cê\u0012þ\u001evÔ¤2¬È?\u0096!#\u0090¤gF¡×a?\u001e\b¾ýjUl°Rn";
               var8 = "cê\u0012þ\u001evÔ¤2¬È?\u0096!#\u0090¤gF¡×a?\u001e\b¾ýjUl°Rn".length();
               var5 = 24;
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
