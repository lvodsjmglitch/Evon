package club.evon;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import org.json.JSONException;

public final class vD implements h {
   private int d;
   private int i;
   private boolean I;
   private int q;
   private int S;
   private JT F;
   private static vD U;
   private static int[] B;
   private static final long a = ds.a(8682007984308715884L, 1786917264607341101L, MethodHandles.lookup().lookupClass()).a(38966575154361L);

   public vD() {
      this.F = JT.DEFAULT;
   }

   public vD w(int currentItem) {
      // $FF: Couldn't be decompiled
   }

   public vD W(JT silence) {
      this.F = var1;
      return this;
   }

   public void w(int currentItem) {
      this.d = var1;
   }

   public void y() {
      this.q = -1;
      this.y(true, true);
   }

   public void y(boolean reset, boolean check) {
      // $FF: Couldn't be decompiled
   }

   public void U() {
      this.y(true, true);
      ++this.S;
   }

   public class_1799 q(class_746 player) {
      // $FF: Couldn't be decompiled
   }

   public int U(class_1661 inventory) {
      // $FF: Couldn't be decompiled
   }

   public int s() {
      return this.d;
   }

   public static void d() {
      U = new vD();
   }

   public int I() {
      return this.d;
   }

   public int h() {
      return this.i;
   }

   public boolean x() {
      return this.I;
   }

   public int d() {
      return this.q;
   }

   public int X() {
      return this.S;
   }

   public JT d() {
      return this.F;
   }

   public static vD a() {
      return U;
   }

   public static void O(int[] var0) {
      B = var0;
   }

   public static int[] t() {
      return B;
   }

   static {
      if (t() == null) {
         O(new int[3]);
      }

   }

   private static JSONException a(JSONException var0) {
      return var0;
   }
}
