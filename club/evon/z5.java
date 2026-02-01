package club.evon;

import java.util.ArrayList;
import net.minecraft.class_243;

public final class z5 {
   private class_243 p;
   private z5 B;
   private ArrayList<class_243> H;
   private double V;
   private double M;
   private double w;

   public class_243 W() {
      return this.p;
   }

   public z5 u() {
      return this.B;
   }

   public ArrayList<class_243> v() {
      return this.H;
   }

   public double J() {
      return this.V;
   }

   public double M() {
      return this.M;
   }

   public double p() {
      return this.w;
   }

   public void o(class_243 loc) {
      this.p = var1;
   }

   public void I(z5 parent) {
      this.B = var1;
   }

   public void y(ArrayList<class_243> path) {
      this.H = var1;
   }

   public void K(double squareDistanceToFromTarget) {
      this.V = var1;
   }

   public void L(double cost) {
      this.M = var1;
   }

   public void o(double totalCost) {
      this.w = var1;
   }

   public z5(class_243 loc, z5 parent, ArrayList<class_243> path, double squareDistanceToFromTarget, double cost, double totalCost) {
      this.p = var1;
      this.B = var2;
      this.H = var3;
      this.V = var4;
      this.M = var6;
      this.w = var8;
   }
}
