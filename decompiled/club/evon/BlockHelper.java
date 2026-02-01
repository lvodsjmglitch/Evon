/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.RotationManager
 *  club.evon.StringArrayHelper
 *  club.evon.Jp
 *  club.evon.ObfuscationHelper
 *  club.evon.gg
 *  net.minecraft.class_1294
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 *  net.minecraft.class_5611
 *  org.json.JSONException
 */
package club.evon;

import club.evon.RotationManager;
import club.evon.StringArrayHelper;
import club.evon.Jp;
import club.evon.RotationMathHelper;
import club.evon.ObfuscationHelper;
import club.evon.gg;
import club.evon.MinecraftHelper;
import club.evon.EvonClient;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1294;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5611;
import org.json.JSONException;

public final class BlockHelper {
    public static final double S = -0.0784000015258789;
    public static final double l = -0.09800000190734864;
    private static String[] Property;
    private static final long FontWeight;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean r() {
        float f;
        block18: {
            block17: {
                class_310 class_3102;
                String[] stringArray;
                block15: {
                    block16: {
                        block14: {
                            long l = FontWeight ^ 0x6D274DAC686EL;
                            stringArray = StringArrayHelper.K();
                            try {
                                try {
                                    class_3102 = MinecraftHelper.m;
                                    if (stringArray == null) break block14;
                                    if (class_3102.field_1724 == null) return false;
                                }
                                catch (JSONException jSONException) {
                                    throw zP.FontWeight(jSONException);
                                }
                                class_3102 = MinecraftHelper.m;
                            }
                            catch (JSONException jSONException) {
                                throw zP.FontWeight(jSONException);
                            }
                        }
                        try {
                            try {
                                if (stringArray == null) break block15;
                                if (class_3102.field_1687 != null) break block16;
                                return false;
                            }
                            catch (JSONException jSONException) {
                                throw zP.FontWeight(jSONException);
                            }
                        }
                        catch (JSONException jSONException) {
                            throw zP.FontWeight(jSONException);
                        }
                    }
                    class_3102 = MinecraftHelper.m;
                }
                try {
                    try {
                        try {
                            float f2 = class_3102.field_1724.field_6250 - 0.0f;
                            f = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
                            if (stringArray == null) return (boolean)f;
                            if (f != false) break block17;
                        }
                        catch (JSONException jSONException) {
                            throw zP.FontWeight(jSONException);
                        }
                        float f3 = MinecraftHelper.m.field_1724.field_6212 - 0.0f;
                        f = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                        if (stringArray == null) return (boolean)f;
                    }
                    catch (JSONException jSONException) {
                        throw zP.FontWeight(jSONException);
                    }
                    if (f == false) break block18;
                }
                catch (JSONException jSONException) {
                    throw zP.FontWeight(jSONException);
                }
            }
            f = 1.0f;
            return (boolean)f;
        }
        f = 0.0f;
        return (boolean)f;
    }

    public static void y(double d) {
        long l = FontWeight ^ 0x9261680D52CL;
        if (zP.r()) {
            double[] dArray = RotationMathHelper.S((float)zP.u(RotationManager.M().d(MinecraftHelper.m.field_1724.method_36454())), d);
            MinecraftHelper.m.field_1724.method_18800(dArray[0], MinecraftHelper.m.field_1724.method_18798().method_10214(), dArray[1]);
        }
    }

    public static void P(double d, double d2) {
        long l = FontWeight ^ 0x1590EEA5F435L;
        d2 /= 100.0;
        d2 = class_3532.method_15350((double)d2, (double)0.0, (double)1.0);
        class_243 class_2432 = MinecraftHelper.m.field_1724.method_18798();
        try {
            zP.y(d);
            if (zP.r()) {
                MinecraftHelper.m.field_1724.method_18800(class_3532.method_16436((double)d2, (double)class_2432.method_10216(), (double)MinecraftHelper.m.field_1724.method_18798().method_10216()), MinecraftHelper.m.field_1724.method_18798().method_10214(), class_3532.method_16436((double)d2, (double)class_2432.method_10215(), (double)MinecraftHelper.m.field_1724.method_18798().method_10215()));
            }
        }
        catch (JSONException jSONException) {
            throw zP.FontWeight(jSONException);
        }
    }

    public static float y() {
        class_5611 class_56112 = new class_5611((float)MinecraftHelper.m.field_1724.field_6014, (float)MinecraftHelper.m.field_1724.field_5969);
        class_5611 class_56113 = new class_5611((float)MinecraftHelper.m.field_1724.method_23317(), (float)MinecraftHelper.m.field_1724.method_23321());
        class_5611 class_56114 = new class_5611(class_56113.method_32118() - class_56112.method_32118(), class_56113.method_32119() - class_56112.method_32119());
        return (float)Math.toDegrees((Math.atan2(-class_56114.method_32118(), class_56114.method_32119()) + 6.2831854820251465) % 6.2831854820251465);
    }

    public static double StaticEventBus() {
        return Math.abs(Math.sqrt(Math.pow(MinecraftHelper.m.field_1724.method_23317() - MinecraftHelper.m.field_1724.field_6014, 2.0) + Math.pow(MinecraftHelper.m.field_1724.method_23321() - MinecraftHelper.m.field_1724.field_5969, 2.0)));
    }

    public static double Z() {
        return zP.StaticEventBus() * (double)Jp.EventDispatcher().w() * 20.0;
    }

    public static double w() {
        double d;
        long l = FontWeight ^ 0x42D17F503963L;
        try {
            d = MinecraftHelper.m.field_1724.method_24828() ? 0.48 : 0.2873;
        }
        catch (JSONException jSONException) {
            throw zP.FontWeight(jSONException);
        }
        return zP.Q(d);
    }

    public static double Q(double d) {
        block5: {
            int n;
            block4: {
                long l = FontWeight ^ 0x7FCD1EB8B2AAL;
                String[] stringArray = StringArrayHelper.K();
                try {
                    try {
                        n = MinecraftHelper.m.field_1724.method_6059(class_1294.field_5904);
                        if (stringArray == null) break block4;
                        if (n == 0) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw zP.FontWeight(jSONException);
                    }
                    n = MinecraftHelper.m.field_1724.method_6112(class_1294.field_5904).method_5578() + 1;
                }
                catch (JSONException jSONException) {
                    throw zP.FontWeight(jSONException);
                }
            }
            int n2 = n;
            d *= 1.0 + (double)n2 * 0.035;
        }
        return d;
    }

    public static double Q() {
        double d;
        block7: {
            double d2;
            int n;
            block6: {
                long l = FontWeight ^ 0x41C77A02BCCBL;
                d = 0.59;
                String[] stringArray = StringArrayHelper.K();
                try {
                    try {
                        n = MinecraftHelper.m.field_1724.method_6059(class_1294.field_5904);
                        if (stringArray == null) break block6;
                        if (n == 0) break block7;
                    }
                    catch (JSONException jSONException) {
                        throw zP.FontWeight(jSONException);
                    }
                    n = MinecraftHelper.m.field_1724.method_6112(class_1294.field_5904).method_5578();
                }
                catch (JSONException jSONException) {
                    throw zP.FontWeight(jSONException);
                }
            }
            try {
                d2 = n >= 1 ? 0.089 : 0.065;
            }
            catch (JSONException jSONException) {
                throw zP.FontWeight(jSONException);
            }
            double d3 = d2;
            d += (double)(MinecraftHelper.m.field_1724.method_6112(class_1294.field_5904).method_5578() + 1) * d3;
        }
        return d;
    }

    public static double O() {
        return Math.sqrt(Math.pow(MinecraftHelper.m.field_1724.method_18798().method_10216(), 2.0) + Math.pow(MinecraftHelper.m.field_1724.method_18798().method_10215(), 2.0));
    }

    public static float U() {
        return zP.W(RotationManager.M().d(MinecraftHelper.m.field_1724.method_36454()));
    }

    public static double I() {
        return zP.u(RotationManager.M().d(MinecraftHelper.m.field_1724.method_36454()));
    }

    /*
     * Unable to fully structure code
     */
    public static float W(float var0) {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block20: {
                                block21: {
                                    var1_1 = zP.FontWeight ^ 48327877734347L;
                                    var4_2 = EvonClient.p().q().R(gg.class);
                                    var3_3 = StringArrayHelper.K();
                                    try {
                                        try {
                                            try {
                                                v0 = var4_2.d();
                                                if (var3_3 == null) break block20;
                                                if (!v0) break block21;
                                            }
                                            catch (JSONException PreMovementEvent) {
                                                throw zP.FontWeight(PreMovementEvent);
                                            }
                                            v0 = var4_2.Z();
                                            if (var3_3 == null) break block20;
                                        }
                                        catch (JSONException PacketSendEvent) {
                                            throw zP.FontWeight(PacketSendEvent);
                                        }
                                        if (!v0) break block21;
                                    }
                                    catch (JSONException PacketReceiveEvent) {
                                        throw zP.FontWeight(PacketReceiveEvent);
                                    }
                                    var0 = var4_2.y().floatValue();
                                }
                                v0 = MinecraftHelper.m.field_1690.field_1881.method_1434();
                            }
                            if (v0) {
                                var0 += 180.0f;
                            }
                            var5_4 = 1.0f;
                            try {
                                v4 = MinecraftHelper.m.field_1690.field_1881.method_1434();
                                if (var3_3 == null) break block22;
                                if (v4) {
                                }
                                ** GOTO lbl40
                            }
                            catch (JSONException v5) {
                                throw zP.FontWeight(v5);
                            }
                            var5_4 = -0.5f;
                            try {
                                if (var3_3 != null) break block23;
lbl40:
                                // 2 sources

                                v4 = MinecraftHelper.m.field_1690.field_1894.method_1434();
                            }
                            catch (JSONException v6) {
                                throw zP.FontWeight(v6);
                            }
                        }
                        try {
                            if (var3_3 == null) break block24;
                            if (!v4) break block23;
                        }
                        catch (JSONException v7) {
                            throw zP.FontWeight(v7);
                        }
                        var5_4 = 0.5f;
                    }
                    v4 = MinecraftHelper.m.field_1690.field_1913.method_1434();
                }
                try {
                    if (var3_3 == null) break block25;
                    if (v4) {
                    }
                    ** GOTO lbl65
                }
                catch (JSONException v8) {
                    throw zP.FontWeight(v8);
                }
                var0 -= 90.0f * var5_4;
                try {
                    if (var3_3 != null) break block26;
lbl65:
                    // 2 sources

                    v4 = MinecraftHelper.m.field_1690.field_1849.method_1434();
                }
                catch (JSONException v9) {
                    throw zP.FontWeight(v9);
                }
            }
            if (v4) {
                var0 += 90.0f * var5_4;
            }
        }
        return var0;
    }

    public static double u(float f) {
        return Math.toRadians(zP.W(f));
    }

    /*
     * Unable to fully structure code
     */
    public static double s(float var0, double var1_1, double var3_2) {
        block18: {
            block16: {
                block17: {
                    block15: {
                        block14: {
                            block13: {
                                var5_3 = zP.FontWeight ^ 71461793956293L;
                                var7_4 = StringArrayHelper.K();
                                if (var1_1 < 0.0) {
                                    var0 += 180.0f;
                                }
                                var8_5 = 1.0f;
                                try {
                                    cfr_temp_0 = var1_1 - 0.0;
                                    v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 < 0.0 ? -1 : 1);
                                    if (var7_4 == null) break block13;
                                    if (v0 < 0) {
                                    }
                                    ** GOTO lbl18
                                }
                                catch (JSONException PreMovementEvent) {
                                    throw zP.FontWeight(PreMovementEvent);
                                }
                                var8_5 = -0.5f;
                                try {
                                    if (var7_4 != null) break block14;
lbl18:
                                    // 2 sources

                                    v0 = (cfr_temp_1 = var1_1 - 0.0) == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                }
                                catch (JSONException PacketSendEvent) {
                                    throw zP.FontWeight(PacketSendEvent);
                                }
                            }
                            try {
                                if (var7_4 == null) break block15;
                                if (v0 <= 0) break block14;
                            }
                            catch (JSONException PacketReceiveEvent) {
                                throw zP.FontWeight(PacketReceiveEvent);
                            }
                            var8_5 = 0.5f;
                        }
                        v0 = (cfr_temp_2 = var3_2 - 0.0) == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                    }
                    try {
                        if (var7_4 == null) break block16;
                        if (v0 <= 0) break block17;
                    }
                    catch (JSONException v4) {
                        throw zP.FontWeight(v4);
                    }
                    var0 -= 90.0f * var8_5;
                }
                try {
                    v5 = var3_2;
                    if (var7_4 == null) break block18;
                    cfr_temp_3 = v5 - 0.0;
                    v0 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                }
                catch (JSONException v6) {
                    throw zP.FontWeight(v6);
                }
            }
            if (v0 < 0) {
                var0 += 90.0f * var8_5;
            }
            v5 = Math.toRadians(var0);
        }
        return v5;
    }

    /*
     * Unable to fully structure code
     */
    public static double R(double var0) {
        block17: {
            block16: {
                block15: {
                    block14: {
                        block13: {
                            var2_1 = zP.FontWeight ^ 55690248049145L;
                            var5_2 = 1.0;
                            var4_3 = StringArrayHelper.K();
                            try {
                                cfr_temp_0 = MinecraftHelper.m.field_1724.field_6250 - 0.0f;
                                v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                if (var4_3 == null) break block13;
                                if (v0 < 0) {
                                }
                                ** GOTO lbl17
                            }
                            catch (JSONException PreMovementEvent) {
                                throw zP.FontWeight(PreMovementEvent);
                            }
                            var0 += 180.0;
                            var5_2 = -0.5;
                            try {
                                if (var4_3 != null) break block14;
lbl17:
                                // 2 sources

                                v0 = (cfr_temp_1 = MinecraftHelper.m.field_1724.field_6250 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                            }
                            catch (JSONException PacketSendEvent) {
                                throw zP.FontWeight(PacketSendEvent);
                            }
                        }
                        try {
                            if (var4_3 == null) break block15;
                            if (v0 <= 0) break block14;
                        }
                        catch (JSONException PacketReceiveEvent) {
                            throw zP.FontWeight(PacketReceiveEvent);
                        }
                        var5_2 = 0.5;
                    }
                    v0 = (cfr_temp_2 = MinecraftHelper.m.field_1724.field_6212 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                }
                try {
                    if (var4_3 == null) break block16;
                    if (v0 > 0) {
                    }
                    ** GOTO lbl42
                }
                catch (JSONException v4) {
                    throw zP.FontWeight(v4);
                }
                var0 -= 90.0 * var5_2;
                try {
                    if (var4_3 != null) break block17;
lbl42:
                    // 2 sources

                    v0 = (cfr_temp_3 = MinecraftHelper.m.field_1724.field_6212 - 0.0f) == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                }
                catch (JSONException v5) {
                    throw zP.FontWeight(v5);
                }
            }
            if (v0 < 0) {
                var0 += 90.0 * var5_2;
            }
        }
        return Math.toRadians(var0);
    }

    public static double O(double d) {
        return (d - 0.08) * 0.98;
    }

    public static double F(double d, int n) {
        double d2;
        block5: {
            long l = FontWeight ^ 0x68F4B299D0BEL;
            String[] stringArray = StringArrayHelper.K();
            try {
                if (n == 0) {
                    return d;
                }
            }
            catch (JSONException jSONException) {
                throw zP.FontWeight(jSONException);
            }
            double d3 = d;
            for (int i = 0; i < n; ++i) {
                d2 = zP.O(d3);
                if (stringArray != null) {
                    d3 = d2;
                    if (stringArray != null) continue;
                }
                break block5;
            }
            d2 = d3;
        }
        return d2;
    }

    public static boolean u(double d) {
        boolean bl;
        block5: {
            long l = FontWeight ^ 0xC2CA2C9C4CBL;
            int n = 0;
            String[] stringArray = StringArrayHelper.K();
            while ((double)n < d) {
                block7: {
                    boolean bl2;
                    block6: {
                        try {
                            try {
                                bl = MinecraftHelper.m.field_1687.method_8320(MinecraftHelper.m.field_1724.method_24515().method_10087(n)).method_26215();
                                if (stringArray == null) break block5;
                                if (stringArray == null) break block6;
                            }
                            catch (JSONException jSONException) {
                                throw zP.FontWeight(jSONException);
                            }
                            if (bl) break block7;
                        }
                        catch (JSONException jSONException) {
                            throw zP.FontWeight(jSONException);
                        }
                        bl2 = true;
                    }
                    return bl2;
                }
                ++n;
                if (stringArray != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean P() {
        return zP.u((double)Math.round(MinecraftHelper.m.field_1724.method_23318() + (double)MinecraftHelper.m.field_1724.method_18381(MinecraftHelper.m.field_1724.method_18376())));
    }

    public static float FontWeight() {
        long l = FontWeight ^ 0x419BB6DD075EL;
        float f = 3.0f;
        if (MinecraftHelper.m.field_1724.method_6059(class_1294.field_5913)) {
            f += (float)(MinecraftHelper.m.field_1724.method_6112(class_1294.field_5913).method_5578() + 1);
        }
        return f;
    }

    public static void p(String[] stringArray) {
        Property = stringArray;
    }

    public static String[] RenderEvent() {
        return Property;
    }

    static {
        FontWeight = ObfuscationHelper.FontWeight((long)-5407000040528493229L, (long)7560797617165900201L, MethodHandles.lookup().lookupClass()).FontWeight(14377130244443L);
        if (zP.RenderEvent() == null) {
            zP.p(new String[3]);
        }
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
