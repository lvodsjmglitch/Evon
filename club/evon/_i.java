package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _i extends _h<K> {
   private static final float q = 1.5F;
   private static final float V = 5.5F;
   private static final float B = 3.5F;
   private static final Jz g;
   private final _J x;
   private boolean J;
   private final List<zW> I;
   private static final long b = ds.a(1608722433268995802L, 9089471009773710593L, MethodHandles.lookup().lookupClass()).a(278900251169498L);

   public _i(K property) {
      long var2 = b ^ 88377054211440L;
      super(var1);
      this.x = new _J(200, 0.0D, yn.LINEAR);
      int var10000 = _b.V();
      this.I = new ArrayList();
      int var4 = var10000;
      t[] var5 = (t[])var1.J();
      int var6 = var5.length;
      int var7 = 0;

      while(var7 < var6) {
         t var8 = var5[var7];
         this.I.add(new _3(var8));
         ++var7;
         if (var4 == 0) {
            break;
         }
      }

   }

   public void l(int mouseX, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void W(double mouseX, double mouseY, int button) {
      // $FF: Couldn't be decompiled
   }

   public float m() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var1 = b ^ 139860082272855L;
      Cipher var3;
      Cipher var10000 = var3 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var1 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var4 = 1; var4 < 8; ++var4) {
         var10003[var4] = (byte)((int)(var1 << var4 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      byte[] var5 = var3.doFinal(")ÿ\r¦R\u0002§iÐÀnïl\u000bÏü".getBytes("ISO-8859-1"));
      String var6 = a(var5).intern();
      boolean var10001 = true;
      String var0 = var6;
      g = new Jz(var0);
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
