package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class zR {
   private final List<G> P = new ArrayList();
   private G F = null;
   private G X = null;
   private final _J Z;
   private final _J Y;
   private static final int G;
   private static boolean B;
   private static final long a = ds.a(1943702086962889459L, 9099558297037298444L, MethodHandles.lookup().lookupClass()).a(85040886356169L);

   public zR() {
      this.Z = new _J(200, 0.0D, yn.DECELERATE);
      this.Y = new _J(200, 0.0D, yn.DECELERATE);
   }

   public boolean f() {
      long var1 = a ^ 122377758516435L;

      boolean var10000;
      try {
         if (this.F != null) {
            var10000 = true;
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = false;
      return var10000;
   }

   public boolean S() {
      long var1 = a ^ 81922787672976L;

      boolean var10000;
      try {
         if (this.X != null) {
            var10000 = true;
            return var10000;
         }
      } catch (JSONException var3) {
         throw a(var3);
      }

      var10000 = false;
      return var10000;
   }

   public void W(R currentDragging, float screenWidth, float screenHeight) {
      long var4 = a ^ 113415372778347L;
      this.a();
      float var7 = var1.H();
      float var8 = var1.Q();
      boolean var10000 = N();
      float var9 = var7 / 2.0F;
      boolean var6 = var10000;
      float var10 = var8 / 2.0F;

      try {
         this.p(List.of(new G(yo.HORIZONTAL, var2 / 2.0F + var9 + 15.0F), new G(yo.HORIZONTAL, var2 / 2.0F - var9 - 15.0F), new G(yo.HORIZONTAL, var2 / 2.0F + var9), new G(yo.HORIZONTAL, var2 / 2.0F - var9), new G(yo.VERTICAL, var3 / 2.0F + var10 + 15.0F), new G(yo.VERTICAL, var3 / 2.0F - var10 - 15.0F), new G(yo.VERTICAL, var3 / 2.0F + var10), new G(yo.VERTICAL, var3 / 2.0F - var10), new G(yo.HORIZONTAL, var2 / 2.0F), new G(yo.VERTICAL, var3 / 2.0F)));
         if (var6) {
            gQ.o(new gQ[4]);
         }

      } catch (JSONException var11) {
         throw a(var11);
      }
   }

   public void a() {
      this.P.clear();
      this.F = null;
      this.X = null;
   }

   public void B(G snap) {
      this.P.add(var1);
   }

   public void p(List<G> snaps) {
      this.P.addAll(var1);
   }

   public float G(float x, float elementWidth) {
      // $FF: Couldn't be decompiled
   }

   public float M(float y, float elementHeight) {
      // $FF: Couldn't be decompiled
   }

   public void q(int screenWidth, int screenHeight, float elementX, float elementY, float elementWidth, float elementHeight) {
      // $FF: Couldn't be decompiled
   }

   public _J V() {
      return this.Z;
   }

   public _J N() {
      return this.Y;
   }

   public static void W(boolean var0) {
      B = var0;
   }

   public static boolean N() {
      return B;
   }

   public static boolean Q() {
      boolean var0 = N();

      try {
         return !var0;
      } catch (JSONException var1) {
         throw a(var1);
      }
   }

   static {
      long var2 = a ^ 126092827155608L;
      W(false);
      Cipher var4;
      Cipher var10000 = var4 = Cipher.getInstance("DES/CBC/NoPadding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var2 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var5 = 1; var5 < 8; ++var5) {
         var10003[var5] = (byte)((int)(var2 << var5 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      long var6 = 5600156737998839203L;
      byte[] var8 = var4.doFinal(new byte[]{(byte)((int)(var6 >>> 56)), (byte)((int)(var6 >>> 48)), (byte)((int)(var6 >>> 40)), (byte)((int)(var6 >>> 32)), (byte)((int)(var6 >>> 24)), (byte)((int)(var6 >>> 16)), (byte)((int)(var6 >>> 8)), (byte)((int)var6)});
      long var9 = ((long)var8[0] & 255L) << 56 | ((long)var8[1] & 255L) << 48 | ((long)var8[2] & 255L) << 40 | ((long)var8[3] & 255L) << 32 | ((long)var8[4] & 255L) << 24 | ((long)var8[5] & 255L) << 16 | ((long)var8[6] & 255L) << 8 | (long)var8[7] & 255L;
      boolean var10001 = true;
      long var0 = var9;
      G = (int)var0;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
