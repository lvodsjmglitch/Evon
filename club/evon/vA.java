package club.evon;

import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public final class vA extends vt {
   private float H;
   private float I;
   private boolean U;
   private boolean c;
   private static final long a = ds.a(-4976458137127410524L, -2821013885746833051L, MethodHandles.lookup().lookupClass()).a(82255045382799L);

   public void f() {
      this.H = 0.0F;
      this.I = 0.0F;
      this.U = false;
      this.c = false;
   }

   public boolean d() {
      // $FF: Couldn't be decompiled
   }

   public float f() {
      return this.H;
   }

   public float Z() {
      return this.I;
   }

   public boolean Y() {
      return this.U;
   }

   public boolean b() {
      return this.c;
   }

   public void x(float forward) {
      this.H = var1;
   }

   public void X(float sideways) {
      this.I = var1;
   }

   public void d(boolean jump) {
      this.U = var1;
   }

   public void k(boolean sneak) {
      this.c = var1;
   }

   public vA(float forward, float sideways, boolean jump, boolean sneak) {
      this.H = var1;
      this.I = var2;
      this.U = var3;
      this.c = var4;
   }

   private static JSONException b(JSONException var0) {
      return var0;
   }
}
