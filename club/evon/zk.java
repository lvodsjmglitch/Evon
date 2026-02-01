package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_241;
import org.json.JSONException;

public final class zk {
   private class_241 d;
   private boolean T;
   private boolean P;
   private Float j;
   private class_241 f;
   private boolean C;
   private boolean n;
   private static final long a = ds.a(1610306107844463212L, -5040084140541418240L, MethodHandles.lookup().lookupClass()).a(273123445007295L);

   public zk() {
      club.evon.C.P(this);
   }

   @_S
   public void f(v8 event) {
      // $FF: Couldn't be decompiled
   }

   @_S(
      h = 8
   )
   public void N(yN event) {
      // $FF: Couldn't be decompiled
   }

   public boolean l() {
      // $FF: Couldn't be decompiled
   }

   public void P(class_241 tickRotation) {
      this.f = var1;
   }

   public void H() {
      // $FF: Couldn't be decompiled
   }

   private void b() {
      // $FF: Couldn't be decompiled
   }

   private void h() {
      yj var1 = JV.M();
      this.d = var1.U();
   }

   public void L(class_241 targetRotation, float speed) {
      long var3 = a ^ 94807084029947L;
      this.d = var1;
      this.j = var2;
      String var10000 = yj.K();
      this.P = true;
      this.T = true;
      String var5 = var10000;

      try {
         this.b();
         if (var5 == null) {
            gQ.o(new gQ[4]);
         }

      } catch (JSONException var6) {
         throw a(var6);
      }
   }

   public void K() {
      this.n = true;
   }

   public class_241 Y() {
      return this.d;
   }

   public boolean b() {
      return this.T;
   }

   public boolean B() {
      return this.P;
   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
