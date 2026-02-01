package club.evon;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_10192;
import net.minecraft.class_1263;
import net.minecraft.class_1304;
import net.minecraft.class_1703;
import net.minecraft.class_1743;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_3489;
import net.minecraft.class_6862;
import net.minecraft.class_9334;
import org.json.JSONException;

public final class gA extends gQ {
   private final a X;
   private final a g;
   private final t j;
   private final t I;
   private final t W;
   private final K s;
   private final List<class_2338> q;
   private final Z h;
   private class_2338 V;
   private class_1703 v;
   private static final long a = ds.a(2302825606386358576L, -533522060519409110L, MethodHandles.lookup().lookupClass()).a(197307248928637L);
   private static final String[] b;

   public gA() {
      String[] var1 = b;
      super(var1[7], var1[1], zo.PLAYER);
      this.X = new a(var1[8], 50.0D, 0.0D, 1000.0D, 10.0D);
      this.g = new a(var1[5], 10.0D, 1.0D, 20.0D, 1.0D);
      this.j = new t(var1[6], true);
      this.I = new t(var1[0], true);
      this.W = new t(var1[3], false);
      this.s = new K(var1[2], new t[]{this.j, this.I, this.W});
      this.q = new ArrayList();
      this.h = new Z();
      a var10000 = this.g;
      t var10001 = this.W;
      Objects.requireNonNull(var10001);
      var10000.q(var10001::I);
      this.g(new B[]{this.X, this.s, this.g});
   }

   public void W() {
      this.q.clear();
      super.W();
   }

   @_S(
      h = 1
   )
   private void I(yN param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean g(class_1799 stack, Map<class_1304, class_1799> bestChestArmor, class_1799 bestChestSword, class_1799 bestChestPickaxe, class_1799 bestChestAxe) {
      // $FF: Couldn't be decompiled
   }

   public Map<class_1304, class_1799> h(class_1263 chest) {
      IntStream var10000 = IntStream.range(0, var1.method_5439());
      Objects.requireNonNull(var1);
      return (Map)var10000.mapToObj(var1::method_5438).filter(JQ::F).map((var0) -> {
         long var1 = a ^ 61559626974239L;
         boolean var10000 = gr.a();
         class_10192 var4 = (class_10192)var0.method_57353().method_58694(class_9334.field_54196);
         boolean var3 = var10000;

         class_10192 var6;
         Entry var7;
         label32: {
            label22: {
               try {
                  var6 = var4;
                  if (!var3) {
                     break label32;
                  }

                  if (var4 == null) {
                     break label22;
                  }
               } catch (JSONException var5) {
                  throw a(var5);
               }

               var6 = var4;
               break label32;
            }

            var7 = null;
            return var7;
         }

         var7 = Map.entry(var6.comp_3174(), var0);
         return var7;
      }).filter(Objects::nonNull).collect(HashMap::new, (var0, var1x) -> {
         var0.merge((class_1304)var1x.getKey(), (class_1799)var1x.getValue(), (param0, nullx) -> {
            // $FF: Couldn't be decompiled
         });
      }, HashMap::putAll);
   }

   public class_1799 z(class_1263 chest) {
      IntStream var10000 = IntStream.range(0, var1.method_5439());
      Objects.requireNonNull(var1);
      return (class_1799)var10000.mapToObj(var1::method_5438).filter((var0) -> {
         return var0.method_31573(class_3489.field_42611);
      }).max(Comparator.comparingDouble(JQ::F)).orElse(class_1799.field_8037);
   }

   public class_1799 d(class_1263 chest, class_6862<class_1792> tag) {
      IntStream var10000 = IntStream.range(0, var1.method_5439());
      Objects.requireNonNull(var1);
      return (class_1799)var10000.mapToObj(var1::method_5438).filter((var1x) -> {
         return var1x.method_31573(var2);
      }).max(Comparator.comparingDouble(JQ::N)).orElse(class_1799.field_8037);
   }

   private class_1799 H() {
      return (class_1799)IntStream.range(0, 9).mapToObj((var0) -> {
         return ym.m.field_1724.method_31548().method_5438(var0);
      }).filter((var0) -> {
         return var0.method_31573(class_3489.field_42611);
      }).max(Comparator.comparingDouble(JQ::F)).orElse(class_1799.field_8037);
   }

   private class_1799 d(class_6862<class_1792> var1) {
      return (class_1799)IntStream.range(0, 9).mapToObj((var0) -> {
         return ym.m.field_1724.method_31548().method_5438(var0);
      }).filter((var1x) -> {
         return var1x.method_31573(var1);
      }).max(Comparator.comparingDouble(JQ::N)).orElse(class_1799.field_8037);
   }

   private class_1799 l() {
      return (class_1799)IntStream.range(0, 9).mapToObj((var0) -> {
         return ym.m.field_1724.method_31548().method_5438(var0);
      }).filter((var0) -> {
         return var0.method_7909() instanceof class_1743;
      }).max(Comparator.comparingDouble(JQ::N)).orElse(class_1799.field_8037);
   }

   @_S(
      h = 1
   )
   private void d(vp var1) {
   }

   @_S(
      h = 1
   )
   private void L(_D param1) {
      // $FF: Couldn't be decompiled
   }

   @_S(
      h = 1
   )
   private void S(vK var1) {
      this.q.clear();
   }

   private void C() {
      // $FF: Couldn't be decompiled
   }

   private boolean o() {
      // $FF: Couldn't be decompiled
   }

   private boolean R(String param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 28967776540421L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[9];
      int var7 = 0;
      String var6 = "cÅ¢Û\u0088 nèûziÕ$òö= ¢¾GÖ\u0017î\bÀ¤#z\u0017¨\n}¯À\u009b\u001e:\u0006\u009a\u009c\u000e}/Ì~Î°\u0002o\bÝÿ\u0002¼ÙÛ\u0094\u0007\bïy«\u008dCy´\u0087\bt$Û¤©p\u000b\b\bÀvS<\u001cª\u009d¢\bÚ\u001a\r¨vj$Þ";
      int var8 = "cÅ¢Û\u0088 nèûziÕ$òö= ¢¾GÖ\u0017î\bÀ¤#z\u0017¨\n}¯À\u009b\u001e:\u0006\u009a\u009c\u000e}/Ì~Î°\u0002o\bÝÿ\u0002¼ÙÛ\u0094\u0007\bïy«\u008dCy´\u0087\bt$Û¤©p\u000b\b\bÀvS<\u001cª\u009d¢\bÚ\u001a\r¨vj$Þ".length();
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
                  b = var9;
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

               var6 = "!rôÓÞ±º\u0005\u008eÎ]]<Rä»\b\u007f\u0012p\u009dÿão ";
               var8 = "!rôÓÞ±º\u0005\u008eÎ]]<Rä»\b\u007f\u0012p\u009dÿão ".length();
               var5 = 16;
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
