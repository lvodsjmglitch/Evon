package club.evon;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class y6 {
   private zU A;
   private long u;
   private String i;
   private String S;
   final v5 g;
   private static final long a = ds.a(-7869442229636266171L, -1571784210483553932L, MethodHandles.lookup().lookupClass()).a(124736450698795L);
   private static final long b;

   public y6(final v5 this$0) {
      long var2 = a ^ 64939434372750L;
      this.g = var1;
      super();
      this.u = b;
   }

   public y6 P() {
      return new y6(this.g);
   }

   public y6 b(zU type) {
      this.A = var1;
      return this;
   }

   public y6 w(long duration) {
      this.u = var1;
      return this;
   }

   public y6 A(String title) {
      this.i = var1;
      return this;
   }

   public y6 m(String subtitle) {
      this.S = var1;
      return this;
   }

   public void d() {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 138816968376678L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var4 = -2923565896800146995L;
      byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
      long var7 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
      boolean var10001 = true;
      b = var7;
   }

   private static IllegalStateException a(IllegalStateException var0) {
      return var0;
   }
}
