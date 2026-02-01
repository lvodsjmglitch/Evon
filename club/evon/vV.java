package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4d;
import org.joml.Vector4f;
import org.json.JSONException;
import org.lwjgl.opengl.GL11C;

public final class RenderHelper {
   public static final Matrix4f projectionMatrix = new Matrix4f();
   public static final Matrix4f modelViewMatrix = new Matrix4f();
   public static final Matrix4f viewMatrix = new Matrix4f();
   private static final long a = ds.a(4193218418251250369L, 475105229866009643L, MethodHandles.lookup().lookupClass()).a(91593564010288L);

   public static Vector4d Q(List<class_243> bounds) {
      // $FF: Couldn't be decompiled
   }

   public static Vector4d u(class_1297 entity) {
      // $FF: Couldn't be decompiled
   }

   public static class_243 getEntityPosition(class_1297 entity) {
      float var1 = MinecraftHelper.client.method_61966().method_60637(false);
      class_243 var2 = MinecraftHelper.client.field_1773.method_19418().method_19326();
      double var3 = class_3532.method_16436((double)var1, var0.field_6014, var0.method_23317()) - var2.field_1352;
      double var5 = class_3532.method_16436((double)var1, var0.field_6036, var0.method_23318()) - var2.field_1351;
      double var7 = class_3532.method_16436((double)var1, var0.field_5969, var0.method_23321()) - var2.field_1350;
      return new class_243(var3, var5, var7);
   }

   public static class_243[] getEntityBounds(class_1297 entity) {
      class_243 var1 = getEntityPosition(entity);
      double var2 = var1.field_1352;
      double var4 = var1.field_1351;
      double var6 = var1.field_1350;
      double var8 = m(var0);
      double var10 = (double)var0.method_17681() / 1.7D;
      class_238 var12 = new class_238(var2 - var10, var4, var6 - var10, var2 + var10, var4 + var8, var6 + var10);
      return new class_243[]{new class_243(var12.field_1323, var12.field_1322, var12.field_1321), new class_243(var12.field_1323, var12.field_1325, var12.field_1321), new class_243(var12.field_1320, var12.field_1322, var12.field_1321), new class_243(var12.field_1320, var12.field_1325, var12.field_1321), new class_243(var12.field_1323, var12.field_1322, var12.field_1324), new class_243(var12.field_1323, var12.field_1325, var12.field_1324), new class_243(var12.field_1320, var12.field_1322, var12.field_1324), new class_243(var12.field_1320, var12.field_1325, var12.field_1324)};
   }

   private static double m(class_1297 param0) {
      // $FF: Couldn't be decompiled
   }

   public static class_243 worldToScreen(class_243 position) {
      int[] viewport = new int[4];
      GL11C.glGetIntegerv(2978, viewport);
      Vector4f vec = (new Vector4f((float)position.field_1352, (float)position.field_1351, (float)position.field_1350, 0.0F)).mul(viewMatrix);
      Matrix4f proj = new Matrix4f(projectionMatrix);
      Vector3f result = new Vector3f();
      proj.project(vec.x, vec.y, vec.z, viewport, result);
      double scale = (double)MinecraftHelper.client.method_22683().method_4495();
      return new class_243((double)result.x / scale, (double)((float)MinecraftHelper.client.method_22683().method_4507() - result.y) / scale, (double)result.z);
   }

   private static JSONException wrapException(JSONException var0) {
      return var0;
   }
}
