package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.json.JSONException;

public final class __ {
   private final class_243 I;
   private final class_243 Z;
   private ArrayList<class_243> i;
   private final ArrayList<z5> x;
   private final ArrayList<z5> w;
   private final double q;
   private static String X;
   private static final long a = ds.a(2935054107701506152L, 8682702040783530450L, MethodHandles.lookup().lookupClass()).a(71981386653375L);

   public __(class_243 startVec3d, class_243 endVec3d) {
      long var3 = a ^ 82095697588788L;
      super();
      M();
      this.i = new ArrayList();
      this.x = new ArrayList();
      this.w = new ArrayList();
      this.q = 9.5D;
      this.I = var1;

      try {
         this.Z = var2;
         if (gQ.q() == null) {
            J("dVLwmb");
         }

      } catch (JSONException var6) {
         throw a(var6);
      }
   }

   public void i() {
      this.s(1000, 4);
   }

   public void s(int loops, int depth) {
      // $FF: Couldn't be decompiled
   }

   private class_243 v(class_243 var1) {
      return new class_243(Math.floor(var1.method_10216()), Math.floor(var1.method_10214()), Math.floor(var1.method_10215()));
   }

   public static boolean y(class_243 loc, boolean checkGround) {
      return z((int)var0.method_10216(), (int)var0.method_10214(), (int)var0.method_10215(), var1);
   }

   public static boolean z(int x, int y, int z, boolean checkGround) {
      // $FF: Couldn't be decompiled
   }

   private static boolean V(class_2338 param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean B(class_2338 param0) {
      // $FF: Couldn't be decompiled
   }

   public z5 y(class_243 loc) {
      // $FF: Couldn't be decompiled
   }

   public boolean y(z5 parent, class_243 loc, double cost) {
      // $FF: Couldn't be decompiled
   }

   public class_243 q() {
      return this.I;
   }

   public class_243 w() {
      return this.Z;
   }

   public ArrayList<class_243> F() {
      return this.i;
   }

   public ArrayList<z5> u() {
      return this.x;
   }

   public ArrayList<z5> Q() {
      return this.w;
   }

   public double N() {
      Objects.requireNonNull(this);
      return 9.5D;
   }

   public static void J(String var0) {
      X = var0;
   }

   public static String M() {
      return X;
   }

   static {
      if (M() != null) {
         J("cIsT");
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
