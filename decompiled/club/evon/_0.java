/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.JV
 *  club.evon.Jd
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.vU
 *  club.evon.yB
 *  com.google.common.base.Predicate
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_238
 *  net.minecraft.class_239
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_241
 *  net.minecraft.class_243
 *  net.minecraft.class_3532
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONException
 */
package club.evon;

import club.evon.JV;
import club.evon.Jd;
import club.evon._v;
import club.evon.ds;
import club.evon.gQ;
import club.evon.vU;
import club.evon.yB;
import club.evon.ym;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_241;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

public final class _0 {
    private static int[] T;
    private static final long a;

    public static class_241 I(class_241 class_2412, class_241 class_2413, float f, float f2) {
        double d;
        double d2;
        double d3;
        float f3;
        float f4;
        block4: {
            block5: {
                long l = a ^ 0x45A79AD02164L;
                f4 = class_3532.method_15393((float)(class_2413.field_1343 - class_2412.field_1343)) * f;
                f3 = (class_2413.field_1342 - class_2412.field_1342) * f;
                d3 = Math.sqrt(f4 * f4 + f3 * f3);
                String[] stringArray = Jd.K();
                try {
                    try {
                        d2 = d3;
                        d = 0.0;
                        if (stringArray == null) break block4;
                        if (d2 != d) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw _0.a(jSONException);
                    }
                    return new class_241(class_2412.field_1343 + f4, class_2412.field_1342 + f3);
                }
                catch (JSONException jSONException) {
                    throw _0.a(jSONException);
                }
            }
            d2 = f4;
            d = d3;
        }
        double d4 = Math.abs(d2 / d);
        double d5 = Math.abs((double)f3 / d3);
        double d6 = (double)f2 * d4;
        double d7 = (double)f2 * d5;
        float f5 = (float)Math.max(Math.min((double)f4, d6), -d6);
        float f6 = (float)Math.max(Math.min((double)f3, d7), -d7);
        return new class_241(class_2412.field_1343 + f5, class_2412.field_1342 + f6);
    }

    public static class_241 t() {
        return new class_241(ym.m.field_1724.method_36454(), ym.m.field_1724.method_36455());
    }

    public static double P(double d, double d2) {
        return (float)(d / d2) / 0.15f;
    }

    public static class_241 S(class_241 class_2412, class_241 class_2413) {
        double d = (Double)ym.m.field_1690.method_42495().method_41753() * (double)0.6f + (double)0.2f;
        double d2 = d * d * d * 8.0;
        double d3 = d2 * (double)0.15f;
        float f = class_2412.field_1343 - class_2413.field_1343;
        float f2 = class_2412.field_1342 - class_2413.field_1342;
        float f3 = class_2413.field_1343 + (float)((double)Math.round((double)f / d3) * d3);
        float f4 = class_2413.field_1342 + (float)((double)Math.round((double)f2 / d3) * d3);
        return new class_241(f3, f4);
    }

    public static float J(double d) {
        double d2 = (Double)ym.m.field_1690.method_42495().method_41753() * (double)0.6f + (double)0.2f;
        double d3 = d2 * d2 * d2 * 8.0;
        return (float)(_0.P(d, d3) * d3) * 0.15f;
    }

    public static class_241 E(class_241 class_2412) {
        return _0.s(_0.S(class_2412, _0.t()));
    }

    public static class_241 s(class_241 class_2412) {
        return new class_241(_0.J(class_2412.field_1343), _0.J(class_2412.field_1342));
    }

    public static class_241 m(class_241 class_2412) {
        class_241 class_2413 = _0.E(class_2412);
        float f = _0.s(class_2413.field_1343, ym.m.field_1724.method_36454());
        return new class_241(f, class_2413.field_1342);
    }

    public static float s(float f, float f2) {
        return f2 + class_3532.method_15393((float)(f - f2));
    }

    public static boolean g(class_1297 class_12972, float f) {
        double d;
        block2: {
            block3: {
                long l = a ^ 0x6F7C08B8843FL;
                class_241 class_2412 = _0.q(class_12972.method_33571());
                double d2 = class_3532.method_15356((float)JV.M().d(ym.m.field_1724.method_36454()), (float)class_2412.field_1343);
                String[] stringArray = Jd.K();
                double d3 = class_3532.method_15356((float)JV.M().Q(ym.m.field_1724.method_36455()), (float)class_2412.field_1342);
                try {
                    double d4 = d2 + d3 - (double)f;
                    d = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
                    if (stringArray == null) break block2;
                    if (d > 0) break block3;
                }
                catch (JSONException jSONException) {
                    throw _0.a(jSONException);
                }
                d = 1.0;
                break block2;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    @Nullable
    public static yB A(class_1309 class_13092, class_243 class_2432, double d) {
        ArrayList arrayList;
        block19: {
            ArrayList<yB> arrayList2;
            block16: {
                class_241 class_2412;
                block21: {
                    long l = a ^ 0x7218F0D212B3L;
                    com.google.common.base.Predicate predicate = class_12972 -> {
                        boolean bl;
                        long l = a ^ 0x9C2F2704639L;
                        try {
                            bl = class_12972 == class_13092;
                        }
                        catch (JSONException jSONException) {
                            throw _0.a(jSONException);
                        }
                        return bl;
                    };
                    String[] stringArray = Jd.K();
                    class_238 class_2382 = class_13092.method_5829().method_1014((double)class_13092.method_5871());
                    class_243 class_2433 = class_2382.method_1005();
                    double d2 = class_2382.method_17939();
                    double d3 = class_2382.method_17940();
                    double d4 = class_2382.method_17941();
                    arrayList2 = new ArrayList<yB>();
                    class_241 class_2413 = _0.q(class_2432);
                    float f = (float)_v.F((double)0.01, (double)0.05);
                    class_241 class_2414 = new class_241(_v.b((float)(-f), (float)f), _v.b((float)(-f), (float)f));
                    class_241 class_2415 = class_2413.method_35586(class_2414);
                    class_2412 = _0.m(class_2415);
                    class_3966 class_39662 = vU.d((double)d, (float)1.0f, (float)class_2412.field_1343, (float)class_2412.field_1342, (Predicate)predicate);
                    try {
                        if (class_39662 != null) {
                            return new yB(class_2412, (class_239)class_39662);
                        }
                    }
                    catch (JSONException jSONException) {
                        throw _0.a(jSONException);
                    }
                    float f2 = 8.0f - (float)Math.random() * 0.25f;
                    double d5 = d2;
                    double d6 = -d5;
                    while (d6 < d5) {
                        block17: {
                            double d7;
                            double d8 = d3;
                            if (stringArray == null) break block16;
                            for (double d9 = -d8; d9 < d8; d9 += d8 / (double)f2) {
                                double d10 = d4;
                                d7 = -d10;
                                if (stringArray == null) break block17;
                                double d11 = d7;
                                while (d11 < d10) {
                                    block18: {
                                        block20: {
                                            class_243 class_2434 = new class_243(d6, d9, d11);
                                            class_243 class_2435 = class_2433.method_1019(class_2434);
                                            class_241 class_2416 = _0.m(_0.q(class_2435));
                                            class_3966 class_39663 = vU.d((double)d, (float)1.0f, (float)class_2416.field_1343, (float)class_2416.field_1342, (Predicate)predicate);
                                            try {
                                                try {
                                                    try {
                                                        if (stringArray == null) break block18;
                                                        arrayList = class_39663;
                                                        if (stringArray == null) break block19;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw _0.a(jSONException);
                                                    }
                                                    if (arrayList == null) break block20;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw _0.a(jSONException);
                                                }
                                                arrayList2.add(new yB(class_2416, (class_239)class_39663));
                                            }
                                            catch (JSONException jSONException) {
                                                throw _0.a(jSONException);
                                            }
                                        }
                                        d11 += d10 / (double)f2;
                                    }
                                    if (stringArray != null) continue;
                                }
                                if (stringArray != null) continue;
                            }
                            d7 = d6 = d6 + d5 / (double)f2;
                        }
                        if (stringArray != null) continue;
                    }
                    try {
                        try {
                            arrayList = arrayList2;
                            if (stringArray == null) break block19;
                            if (!arrayList.isEmpty()) break block21;
                        }
                        catch (JSONException jSONException) {
                            throw _0.a(jSONException);
                        }
                        return null;
                    }
                    catch (JSONException jSONException) {
                        throw _0.a(jSONException);
                    }
                }
                arrayList2.sort(Comparator.comparingDouble(yB2 -> _0.e(yB2.nU(), class_2412)));
            }
            arrayList = arrayList2.getFirst();
        }
        return (yB)arrayList;
    }

    @Nullable
    public static yB s(class_1297 class_12972, class_243 class_2432, double d) {
        yB yB3;
        ArrayList arrayList;
        block22: {
            ArrayList<yB> arrayList2;
            block19: {
                class_241 class_2412;
                block24: {
                    long l = a ^ 0x4E748400B246L;
                    com.google.common.base.Predicate predicate = class_12973 -> {
                        boolean bl;
                        long l = a ^ 0x199CBA77DC31L;
                        try {
                            bl = class_12973 == class_12972;
                        }
                        catch (JSONException jSONException) {
                            throw _0.a(jSONException);
                        }
                        return bl;
                    };
                    class_238 class_2382 = class_12972.method_5829().method_1014((double)class_12972.method_5871());
                    String[] stringArray = Jd.K();
                    class_243 class_2433 = class_2382.method_1005();
                    double d2 = class_2382.method_17939();
                    double d3 = class_2382.method_17940();
                    double d4 = class_2382.method_17941();
                    arrayList2 = new ArrayList<yB>();
                    class_241 class_2413 = _0.q(class_2432);
                    float f = (float)_v.F((double)0.01, (double)0.05);
                    class_241 class_2414 = new class_241(_v.b((float)(-f), (float)f), _v.b((float)(-f), (float)f));
                    class_241 class_2415 = class_2413.method_35586(class_2414);
                    class_2412 = _0.m(class_2415);
                    class_3966 class_39662 = vU.d((double)d, (float)1.0f, (float)class_2412.field_1343, (float)class_2412.field_1342, (Predicate)predicate);
                    try {
                        if (class_39662 != null) {
                            return new yB(class_2412, (class_239)class_39662);
                        }
                    }
                    catch (JSONException jSONException) {
                        throw _0.a(jSONException);
                    }
                    float f2 = 8.0f - (float)Math.random() * 0.25f;
                    double d5 = d2;
                    double d6 = -d5;
                    while (d6 < d5) {
                        block20: {
                            double d7;
                            double d8 = d3;
                            if (stringArray == null) break block19;
                            for (double d9 = -d8; d9 < d8; d9 += d8 / (double)f2) {
                                double d10 = d4;
                                d7 = -d10;
                                if (stringArray == null) break block20;
                                double d11 = d7;
                                while (d11 < d10) {
                                    block21: {
                                        block23: {
                                            class_243 class_2434 = new class_243(d6, d9, d11);
                                            class_243 class_2435 = class_2433.method_1019(class_2434);
                                            class_241 class_2416 = _0.m(_0.q(class_2435));
                                            class_3966 class_39663 = vU.d((double)d, (float)1.0f, (float)class_2416.field_1343, (float)class_2416.field_1342, (Predicate)predicate);
                                            try {
                                                try {
                                                    try {
                                                        if (stringArray == null) break block21;
                                                        arrayList = class_39663;
                                                        if (stringArray == null) break block22;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw _0.a(jSONException);
                                                    }
                                                    if (arrayList == null) break block23;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw _0.a(jSONException);
                                                }
                                                arrayList2.add(new yB(class_2416, (class_239)class_39663));
                                            }
                                            catch (JSONException jSONException) {
                                                throw _0.a(jSONException);
                                            }
                                        }
                                        d11 += d10 / (double)f2;
                                    }
                                    if (stringArray != null) continue;
                                }
                                if (stringArray != null) continue;
                            }
                            d7 = d6 = d6 + d5 / (double)f2;
                        }
                        if (stringArray != null) continue;
                    }
                    try {
                        try {
                            arrayList = arrayList2;
                            if (stringArray == null) break block22;
                            if (!arrayList.isEmpty()) break block24;
                        }
                        catch (JSONException jSONException) {
                            throw _0.a(jSONException);
                        }
                        return null;
                    }
                    catch (JSONException jSONException) {
                        throw _0.a(jSONException);
                    }
                }
                arrayList2.sort(Comparator.comparingDouble(yB2 -> _0.e(yB2.nU(), class_2412)));
            }
            arrayList = arrayList2.getFirst();
        }
        try {
            yB3 = (yB)arrayList;
            if (gQ.q() == null) {
                Jd.k((String[])new String[3]);
            }
        }
        catch (JSONException jSONException) {
            throw _0.a(jSONException);
        }
        return yB3;
    }

    public static class_241 q(class_243 class_2432) {
        return _0.g(ym.m.field_1724.method_33571(), class_2432);
    }

    public static class_241 g(class_243 class_2432, class_243 class_2433) {
        double d = class_2433.method_10216() - class_2432.method_10216();
        double d2 = class_2433.method_10214() - class_2432.method_10214();
        double d3 = class_2433.method_10215() - class_2432.method_10215();
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f = (float)Math.toDegrees(-Math.atan2(d, d3));
        float f2 = (float)(-Math.toDegrees(Math.atan2(d2, d4)));
        return new class_241(f, f2);
    }

    public static class_243 l(float f, float f2) {
        float f3 = f * ((float)Math.PI / 180);
        float f4 = -f2 * 0.01745329f;
        float f5 = class_3532.method_15362((float)f4);
        float f6 = class_3532.method_15374((float)f4);
        float f7 = class_3532.method_15362((float)f3);
        float f8 = class_3532.method_15374((float)f3);
        return new class_243((double)(f6 * f7), (double)(-f8), (double)(f5 * f7));
    }

    public static double[] S(float f, double d) {
        return new double[]{(double)(-class_3532.method_15374((float)f)) * d, (double)class_3532.method_15362((float)f) * d};
    }

    public static class_243 A(float f, class_1297 class_12972) {
        double d = class_3532.method_16436((double)f, (double)class_12972.field_6014, (double)class_12972.method_23317());
        double d2 = class_3532.method_16436((double)f, (double)class_12972.field_6036, (double)class_12972.method_23318()) + (double)class_12972.method_5751();
        double d3 = class_3532.method_16436((double)f, (double)class_12972.field_5969, (double)class_12972.method_23321());
        return new class_243(d, d2, d3);
    }

    public static class_241 K(class_2338 class_23382, class_2350 class_23502) {
        class_241 class_2412;
        long l = a ^ 0x147ABE2046DL;
        float f = (float)((double)class_23382.method_10263() + 0.5 - ym.m.field_1724.method_23317() + (double)class_23502.method_10148() * 0.5);
        String[] stringArray = Jd.K();
        float f2 = (float)(ym.m.field_1724.method_23318() + (double)ym.m.field_1724.method_18381(ym.m.field_1724.method_18376()) - (double)class_23382.method_10264() - (double)class_23502.method_10164() * 0.5);
        float f3 = (float)((double)class_23382.method_10260() + 0.5 - ym.m.field_1724.method_23321() + (double)class_23502.method_10165() * 0.5);
        double d = class_3532.method_15355((float)(f * f + f3 * f3));
        float f4 = (float)Math.toDegrees(-Math.atan2(f, f3));
        float f5 = (float)Math.toDegrees(Math.atan((double)f2 / d));
        try {
            class_2412 = new class_241(f4, f5);
            if (stringArray == null) {
                gQ.o((gQ[])new gQ[4]);
            }
        }
        catch (JSONException jSONException) {
            throw _0.a(jSONException);
        }
        return class_2412;
    }

    @Nullable
    public static yB I(class_2338 class_23382, class_2350 class_23502, class_241 class_2412, class_243 class_2432) {
        ArrayList arrayList;
        block26: {
            ArrayList<yB> arrayList2;
            block23: {
                block29: {
                    long l = a ^ 0x2D4082642F2AL;
                    class_238 class_2382 = new class_238(class_23382);
                    class_243 class_2433 = class_2382.method_1005();
                    double d = class_2382.method_17939();
                    double d2 = class_2382.method_17940();
                    double d3 = class_2382.method_17941();
                    arrayList2 = new ArrayList<yB>();
                    float f = 8.0f;
                    double d4 = d;
                    double d5 = -d4;
                    String[] stringArray = Jd.K();
                    while (d5 < d4) {
                        block24: {
                            double d6;
                            double d7 = d2;
                            if (stringArray == null) break block23;
                            for (double d8 = -d7; d8 < d7; d8 += d7 / 8.0) {
                                double d9 = d3;
                                d6 = -d9;
                                if (stringArray == null) break block24;
                                double d10 = d6;
                                while (d10 < d9) {
                                    block25: {
                                        block27: {
                                            class_239 class_2392;
                                            class_239 class_2393;
                                            class_241 class_2413;
                                            block28: {
                                                class_243 class_2434 = new class_243(d5, d8, d10);
                                                class_243 class_2435 = class_2433.method_1019(class_2434);
                                                class_2413 = _0.m(_0.q(class_2435));
                                                class_2393 = vU.R((double)ym.m.field_1724.method_55754(), (boolean)false, (float)class_2413.field_1343, (float)class_2413.field_1342, (class_243)class_2432);
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (stringArray == null) break block25;
                                                                    arrayList = class_2393;
                                                                    if (stringArray == null) break block26;
                                                                }
                                                                catch (JSONException jSONException) {
                                                                    throw _0.a(jSONException);
                                                                }
                                                                if (arrayList == null) break block27;
                                                            }
                                                            catch (JSONException jSONException) {
                                                                throw _0.a(jSONException);
                                                            }
                                                            class_2392 = class_2393;
                                                            if (stringArray == null) break block28;
                                                        }
                                                        catch (JSONException jSONException) {
                                                            throw _0.a(jSONException);
                                                        }
                                                        if (class_2392.method_17783() != class_239.class_240.field_1332) break block27;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw _0.a(jSONException);
                                                    }
                                                    class_2392 = class_2393;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw _0.a(jSONException);
                                                }
                                            }
                                            class_3965 class_39652 = (class_3965)class_2392;
                                            class_2338 class_23383 = class_39652.method_17777();
                                            class_2350 class_23503 = class_39652.method_17780();
                                            try {
                                                try {
                                                    try {
                                                        if (stringArray == null) break block25;
                                                        if (!class_23383.equals((Object)class_23382)) break block27;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw _0.a(jSONException);
                                                    }
                                                    if (class_23503 != class_23502) break block27;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw _0.a(jSONException);
                                                }
                                                arrayList2.add(new yB(class_2413, class_2393));
                                            }
                                            catch (JSONException jSONException) {
                                                throw _0.a(jSONException);
                                            }
                                        }
                                        d10 += d9 / 8.0;
                                    }
                                    if (stringArray != null) continue;
                                }
                                if (stringArray != null) continue;
                            }
                            d6 = d5 = d5 + d4 / 8.0;
                        }
                        if (stringArray != null) continue;
                    }
                    try {
                        try {
                            arrayList = arrayList2;
                            if (stringArray == null) break block26;
                            if (!arrayList.isEmpty()) break block29;
                        }
                        catch (JSONException jSONException) {
                            throw _0.a(jSONException);
                        }
                        return null;
                    }
                    catch (JSONException jSONException) {
                        throw _0.a(jSONException);
                    }
                }
                arrayList2.sort(Comparator.comparingDouble(yB2 -> _0.e(yB2.nU(), class_2412)));
            }
            arrayList = arrayList2.getFirst();
        }
        return (yB)arrayList;
    }

    public static float e(class_241 class_2412, class_241 class_2413) {
        return class_3532.method_15356((float)class_2412.field_1343, (float)class_2413.field_1343) + Math.abs(class_2412.field_1342 - class_2413.field_1342);
    }

    public static class_243 H() {
        float f = ym.m.field_1724.method_18381(ym.m.field_1724.method_18376());
        return new class_243(ym.m.field_1724.method_23317(), ym.m.field_1724.method_23318() + (double)f, ym.m.field_1724.method_23321());
    }

    public static class_243 n(class_1297 class_12972) {
        class_243 class_2432 = _0.H();
        float f = 0.0f;
        class_238 class_2382 = class_12972.method_5829().method_1014((double)f);
        double d = class_3532.method_15350((double)class_2432.method_10216(), (double)class_2382.field_1323, (double)class_2382.field_1320);
        double d2 = class_3532.method_15350((double)class_2432.method_10214(), (double)class_2382.field_1322, (double)class_2382.field_1325);
        double d3 = class_3532.method_15350((double)class_2432.method_10215(), (double)class_2382.field_1321, (double)class_2382.field_1324);
        return new class_243(d, d2, d3);
    }

    public static void A(int[] nArray) {
        T = nArray;
    }

    public static int[] Q() {
        return T;
    }

    static {
        a = ds.a((long)2653888023721052553L, (long)1927434815995557523L, MethodHandles.lookup().lookupClass()).a(135791588455464L);
        if (_0.Q() != null) {
            _0.A(new int[2]);
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
