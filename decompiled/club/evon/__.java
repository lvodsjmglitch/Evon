/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.J4
 *  club.evon.ds
 *  club.evon.gQ
 *  net.minecraft.class_1922
 *  net.minecraft.class_2266
 *  net.minecraft.class_2281
 *  net.minecraft.class_2336
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2354
 *  net.minecraft.class_2389
 *  net.minecraft.class_243
 *  net.minecraft.class_2482
 *  net.minecraft.class_2484
 *  net.minecraft.class_2506
 *  net.minecraft.class_2510
 *  net.minecraft.class_2533
 *  net.minecraft.class_2544
 *  net.minecraft.class_2665
 *  net.minecraft.class_2667
 *  net.minecraft.class_5555
 *  org.json.JSONException
 */
package club.evon;

import club.evon.J4;
import club.evon.ds;
import club.evon.gQ;
import club.evon.ym;
import club.evon.z5;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Comparator;
import net.minecraft.class_1922;
import net.minecraft.class_2266;
import net.minecraft.class_2281;
import net.minecraft.class_2336;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2354;
import net.minecraft.class_2389;
import net.minecraft.class_243;
import net.minecraft.class_2482;
import net.minecraft.class_2484;
import net.minecraft.class_2506;
import net.minecraft.class_2510;
import net.minecraft.class_2533;
import net.minecraft.class_2544;
import net.minecraft.class_2665;
import net.minecraft.class_2667;
import net.minecraft.class_5555;
import org.json.JSONException;

public final class __ {
    private final class_243 I;
    private final class_243 Z;
    private ArrayList<class_243> i;
    private final ArrayList<z5> x;
    private final ArrayList<z5> w;
    private final double q = 9.5;
    private static String X;
    private static final long a;

    public __(class_243 class_2432, class_243 class_2433) {
        long l = a ^ 0x4AAA64E47234L;
        this.i = new ArrayList();
        this.x = new ArrayList();
        this.w = new ArrayList();
        this.q = 9.5;
        this.I = class_2432;
        String string = __.M();
        try {
            this.Z = class_2433;
            if (gQ.q() == null) {
                __.J("dVLwmb");
            }
        }
        catch (JSONException jSONException) {
            throw __.a(jSONException);
        }
    }

    public void i() {
        this.s(1000, 4);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void s(int var1_1, int var2_2) {
        block53: {
            var3_3 = __.a ^ 78966118361386L;
            v0 = __.M();
            this.i.clear();
            this.w.clear();
            var5_4 = v0;
            var6_5 = new ArrayList<class_243>();
            var6_5.add(this.I);
            this.w.add(new z5(this.I, null, var6_5, this.I.method_1025(this.Z), 0.0, 0.0));
            var7_6 = 0;
            block44: while (true) {
                v1 = var7_6;
                v2 = var1_1;
                block45: while (v1 < v2) {
                    block54: {
                        block55: {
                            this.w.sort((Comparator<z5>)new J4());
                            var8_7 = 0;
                            try {
                                try {
                                    try {
                                        try {
                                            v3 = this.w;
                                            if (var5_4 != null) break block53;
                                            if (var5_4 != null) break block54;
                                        }
                                        catch (JSONException v4) {
                                            throw __.a(v4);
                                        }
                                        if (!v3.isEmpty()) break block55;
                                    }
                                    catch (JSONException v5) {
                                        throw __.a(v5);
                                    }
                                    if (var5_4 == null) break block44;
                                }
                                catch (JSONException v6) {
                                    throw __.a(v6);
                                }
                                gQ.o((gQ[])new gQ[3]);
                            }
                            catch (JSONException v7) {
                                throw __.a(v7);
                            }
                        }
                        v8 = new ArrayList<z5>(this.w);
                    }
                    block46: for (E v9 : v8) {
                        block62: {
                            block59: {
                                block61: {
                                    block47: while (true) {
                                        var10_9 = (z5)v9 /* !! */ ;
                                        v10 = ++var8_7;
                                        if (var5_4 == null) {
                                            v2 = var2_2;
                                            if (var5_4 != null) continue block45;
                                            try {
                                                try {
                                                    if (v10 > v2 && var5_4 == null) break block46;
                                                }
                                                catch (JSONException v11) {
                                                    throw __.a(v11);
                                                }
                                                this.w.remove(var10_9);
                                                v10 = (int)this.x.add(var10_9);
                                            }
                                            catch (JSONException v12) {
                                                throw __.a(v12);
                                            }
                                        }
                                        var11_10 = class_2350.values();
                                        var12_11 = ((class_2350[])var11_10).length;
                                        var13_13 = 0;
                                        while (var13_13 < var12_11) {
                                            block56: {
                                                block57: {
                                                    var14_14 = var11_10[var13_13];
                                                    try {
                                                        if (var5_4 != null) break block56;
                                                        v9 /* !! */  = var14_14;
                                                        if (var5_4 != null) continue block47;
                                                    }
                                                    catch (JSONException v13) {
                                                        throw __.a(v13);
                                                    }
                                                    try {
                                                        try {
                                                            if (v9 /* !! */  != class_2350.field_11033) {
                                                                if (var14_14 != class_2350.field_11036) break block57;
                                                            }
                                                            ** GOTO lbl106
                                                        }
                                                        catch (JSONException v14) {
                                                            throw __.a(v14);
                                                        }
                                                        if (var5_4 != null) {
                                                        }
                                                        ** GOTO lbl106
                                                    }
                                                    catch (JSONException v15) {
                                                        throw __.a(v15);
                                                    }
                                                }
                                                var15_15 = this.v(var10_9.W().method_43206(var14_14, 1.0));
                                                try {
                                                    block58: {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var5_4 != null) break block56;
                                                                    if (!__.y(var15_15, false)) break block58;
                                                                }
                                                                catch (JSONException v16) {
                                                                    throw __.a(v16);
                                                                }
                                                                if (!this.y(var10_9, var15_15, 0.0)) break block58;
                                                            }
                                                            catch (JSONException v17) {
                                                                throw __.a(v17);
                                                            }
                                                            if (var5_4 == null) break block44;
                                                        }
                                                        catch (JSONException v18) {
                                                            throw __.a(v18);
                                                        }
                                                    }
                                                    ++var13_13;
                                                }
                                                catch (JSONException v19) {
                                                    throw __.a(v19);
                                                }
                                            }
                                            if (var5_4 == null) continue;
                                        }
                                        break;
                                    }
                                    var11_10 = this.v(var10_9.W().method_1031(0.0, 1.0, 0.0));
                                    try {
                                        block60: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            v20 = var11_10;
                                                            if (var5_4 != null) break block59;
                                                            if (!__.y(v20, false)) break block60;
                                                        }
                                                        catch (JSONException v21) {
                                                            throw __.a(v21);
                                                        }
                                                        v22 = this;
                                                        v23 = var10_9;
                                                        if (var5_4 != null) break block61;
                                                    }
                                                    catch (JSONException v24) {
                                                        throw __.a(v24);
                                                    }
                                                    if (!v22.y(v23, var11_10, 0.0)) break block60;
                                                }
                                                catch (JSONException v25) {
                                                    throw __.a(v25);
                                                }
                                                if (var5_4 == null) break block44;
                                            }
                                            catch (JSONException v26) {
                                                throw __.a(v26);
                                            }
                                        }
                                        v22 = this;
                                        v23 = var10_9;
                                    }
                                    catch (JSONException v27) {
                                        throw __.a(v27);
                                    }
                                }
                                v20 = v22.v(v23.W().method_1031(0.0, -1.0, 0.0));
                            }
                            var12_12 = v20;
                            try {
                                try {
                                    v28 = __.y(var12_12, false);
                                    if (var5_4 != null) break block62;
                                    if (v28) {
                                    }
                                    ** GOTO lbl169
                                }
                                catch (JSONException v29) {
                                    throw __.a(v29);
                                }
                                v28 = this.y(var10_9, var12_12, 0.0);
                            }
                            catch (JSONException v30) {
                                throw __.a(v30);
                            }
                        }
                        try {
                            try {
                                if (v28 && var5_4 == null) break block44;
                            }
                            catch (JSONException v31) {
                                throw __.a(v31);
                            }
lbl169:
                            // 2 sources

                            if (var5_4 == null) continue;
                            break;
                        }
                        catch (JSONException v32) {
                            throw __.a(v32);
                        }
                    }
                    ++var7_6;
                    if (var5_4 == null) continue block44;
                }
                break;
            }
            v3 = this.x;
        }
        v3.sort((Comparator<z5>)new J4());
        this.i = this.x.get(0).v();
    }

    private class_243 v(class_243 class_2432) {
        return new class_243(Math.floor(class_2432.method_10216()), Math.floor(class_2432.method_10214()), Math.floor(class_2432.method_10215()));
    }

    public static boolean y(class_243 class_2432, boolean bl) {
        return __.z((int)class_2432.method_10216(), (int)class_2432.method_10214(), (int)class_2432.method_10215(), bl);
    }

    public static boolean z(int n, int n2, int n3, boolean bl) {
        boolean bl2;
        block23: {
            block19: {
                String string;
                block21: {
                    class_2338 class_23382;
                    block20: {
                        block18: {
                            long l = a ^ 0x468567EB6C86L;
                            class_23382 = new class_2338(n, n2, n3);
                            string = __.M();
                            try {
                                try {
                                    bl2 = __.V(class_23382);
                                    if (string != null) break block18;
                                    if (bl2) break block19;
                                }
                                catch (JSONException jSONException) {
                                    throw __.a(jSONException);
                                }
                                bl2 = __.V(class_23382.method_10084());
                            }
                            catch (JSONException jSONException) {
                                throw __.a(jSONException);
                            }
                        }
                        try {
                            try {
                                if (string != null) break block20;
                                if (bl2) break block19;
                            }
                            catch (JSONException jSONException) {
                                throw __.a(jSONException);
                            }
                            bl2 = __.V(class_23382.method_10074());
                        }
                        catch (JSONException jSONException) {
                            throw __.a(jSONException);
                        }
                    }
                    try {
                        block22: {
                            try {
                                try {
                                    try {
                                        if (string != null) break block21;
                                        if (bl2) break block22;
                                    }
                                    catch (JSONException jSONException) {
                                        throw __.a(jSONException);
                                    }
                                    bl2 = bl;
                                    if (string != null) break block21;
                                }
                                catch (JSONException jSONException) {
                                    throw __.a(jSONException);
                                }
                                if (bl2) break block19;
                            }
                            catch (JSONException jSONException) {
                                throw __.a(jSONException);
                            }
                        }
                        bl2 = __.B(class_23382.method_10074());
                    }
                    catch (JSONException jSONException) {
                        throw __.a(jSONException);
                    }
                }
                try {
                    if (string != null) break block23;
                    if (!bl2) break block19;
                }
                catch (JSONException jSONException) {
                    throw __.a(jSONException);
                }
                bl2 = true;
                break block23;
            }
            bl2 = false;
        }
        return bl2;
    }

    private static boolean V(class_2338 class_23382) {
        boolean bl;
        block64: {
            block66: {
                block65: {
                    String string;
                    block62: {
                        long l = a ^ 0x5EBA9A7BA217L;
                        string = __.M();
                        try {
                            block63: {
                                try {
                                    try {
                                        try {
                                            bl = ym.m.field_1687.method_8320(class_23382).method_51367();
                                            if (string != null) break block62;
                                            if (!bl) break block63;
                                        }
                                        catch (JSONException jSONException) {
                                            throw __.a(jSONException);
                                        }
                                        bl = ym.m.field_1687.method_8320(class_23382).method_26234((class_1922)ym.m.field_1687, class_23382);
                                        if (string != null) break block64;
                                    }
                                    catch (JSONException jSONException) {
                                        throw __.a(jSONException);
                                    }
                                    if (bl) break block65;
                                }
                                catch (JSONException jSONException) {
                                    throw __.a(jSONException);
                                }
                            }
                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2482;
                        }
                        catch (JSONException jSONException) {
                            throw __.a(jSONException);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                if (string != null) break block64;
                                                                                                                                if (bl) break block65;
                                                                                                                            }
                                                                                                                            catch (JSONException jSONException) {
                                                                                                                                throw __.a(jSONException);
                                                                                                                            }
                                                                                                                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2510;
                                                                                                                            if (string != null) break block64;
                                                                                                                        }
                                                                                                                        catch (JSONException jSONException) {
                                                                                                                            throw __.a(jSONException);
                                                                                                                        }
                                                                                                                        if (bl) break block65;
                                                                                                                    }
                                                                                                                    catch (JSONException jSONException) {
                                                                                                                        throw __.a(jSONException);
                                                                                                                    }
                                                                                                                    bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2266;
                                                                                                                    if (string != null) break block64;
                                                                                                                }
                                                                                                                catch (JSONException jSONException) {
                                                                                                                    throw __.a(jSONException);
                                                                                                                }
                                                                                                                if (bl) break block65;
                                                                                                            }
                                                                                                            catch (JSONException jSONException) {
                                                                                                                throw __.a(jSONException);
                                                                                                            }
                                                                                                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2281;
                                                                                                            if (string != null) break block64;
                                                                                                        }
                                                                                                        catch (JSONException jSONException) {
                                                                                                            throw __.a(jSONException);
                                                                                                        }
                                                                                                        if (bl) break block65;
                                                                                                    }
                                                                                                    catch (JSONException jSONException) {
                                                                                                        throw __.a(jSONException);
                                                                                                    }
                                                                                                    bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2336;
                                                                                                    if (string != null) break block64;
                                                                                                }
                                                                                                catch (JSONException jSONException) {
                                                                                                    throw __.a(jSONException);
                                                                                                }
                                                                                                if (bl) break block65;
                                                                                            }
                                                                                            catch (JSONException jSONException) {
                                                                                                throw __.a(jSONException);
                                                                                            }
                                                                                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2484;
                                                                                            if (string != null) break block64;
                                                                                        }
                                                                                        catch (JSONException jSONException) {
                                                                                            throw __.a(jSONException);
                                                                                        }
                                                                                        if (bl) break block65;
                                                                                    }
                                                                                    catch (JSONException jSONException) {
                                                                                        throw __.a(jSONException);
                                                                                    }
                                                                                    bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2389;
                                                                                    if (string != null) break block64;
                                                                                }
                                                                                catch (JSONException jSONException) {
                                                                                    throw __.a(jSONException);
                                                                                }
                                                                                if (bl) break block65;
                                                                            }
                                                                            catch (JSONException jSONException) {
                                                                                throw __.a(jSONException);
                                                                            }
                                                                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2354;
                                                                            if (string != null) break block64;
                                                                        }
                                                                        catch (JSONException jSONException) {
                                                                            throw __.a(jSONException);
                                                                        }
                                                                        if (bl) break block65;
                                                                    }
                                                                    catch (JSONException jSONException) {
                                                                        throw __.a(jSONException);
                                                                    }
                                                                    bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2544;
                                                                    if (string != null) break block64;
                                                                }
                                                                catch (JSONException jSONException) {
                                                                    throw __.a(jSONException);
                                                                }
                                                                if (bl) break block65;
                                                            }
                                                            catch (JSONException jSONException) {
                                                                throw __.a(jSONException);
                                                            }
                                                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_5555;
                                                            if (string != null) break block64;
                                                        }
                                                        catch (JSONException jSONException) {
                                                            throw __.a(jSONException);
                                                        }
                                                        if (bl) break block65;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw __.a(jSONException);
                                                    }
                                                    bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2665;
                                                    if (string != null) break block64;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw __.a(jSONException);
                                                }
                                                if (bl) break block65;
                                            }
                                            catch (JSONException jSONException) {
                                                throw __.a(jSONException);
                                            }
                                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2667;
                                            if (string != null) break block64;
                                        }
                                        catch (JSONException jSONException) {
                                            throw __.a(jSONException);
                                        }
                                        if (bl) break block65;
                                    }
                                    catch (JSONException jSONException) {
                                        throw __.a(jSONException);
                                    }
                                    bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2506;
                                    if (string != null) break block64;
                                }
                                catch (JSONException jSONException) {
                                    throw __.a(jSONException);
                                }
                                if (bl) break block65;
                            }
                            catch (JSONException jSONException) {
                                throw __.a(jSONException);
                            }
                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2533;
                            if (string != null) break block64;
                        }
                        catch (JSONException jSONException) {
                            throw __.a(jSONException);
                        }
                        if (!bl) break block66;
                    }
                    catch (JSONException jSONException) {
                        throw __.a(jSONException);
                    }
                }
                bl = true;
                break block64;
            }
            bl = false;
        }
        return bl;
    }

    private static boolean B(class_2338 class_23382) {
        boolean bl;
        block8: {
            block7: {
                String string;
                block6: {
                    long l = a ^ 0x2496C8ED766AL;
                    string = __.M();
                    try {
                        try {
                            bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2354;
                            if (string != null) break block6;
                            if (bl) break block7;
                        }
                        catch (JSONException jSONException) {
                            throw __.a(jSONException);
                        }
                        bl = ym.m.field_1687.method_8320(class_23382).method_26204() instanceof class_2544;
                    }
                    catch (JSONException jSONException) {
                        throw __.a(jSONException);
                    }
                }
                try {
                    if (string != null) break block8;
                    if (bl) break block7;
                }
                catch (JSONException jSONException) {
                    throw __.a(jSONException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public z5 y(class_243 var1_1) {
        var2_2 = __.a ^ 85327920705210L;
        var5_3 = this.x.iterator();
        var4_4 = __.M();
        while (var5_3.hasNext()) {
            block30: {
                block32: {
                    block31: {
                        block29: {
                            var6_5 = var5_3.next();
                            try {
                                try {
                                    try {
                                        cfr_temp_0 = var6_5.W().method_10216() - var1_1.method_10216();
                                        v0 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                        if (var4_4 == null) {
                                            if (var4_4 != null) break block29;
                                        }
                                        ** GOTO lbl55
                                    }
                                    catch (JSONException v1) {
                                        throw __.a(v1);
                                    }
                                    if (v0) break block30;
                                }
                                catch (JSONException v2) {
                                    throw __.a(v2);
                                }
                                cfr_temp_1 = var6_5.W().method_10214() - var1_1.method_10214();
                                v3 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                            }
                            catch (JSONException v4) {
                                throw __.a(v4);
                            }
                        }
                        try {
                            try {
                                try {
                                    if (var4_4 != null) break block31;
                                    if (v3 != false) break block30;
                                }
                                catch (JSONException v5) {
                                    throw __.a(v5);
                                }
                                v6 = var6_5;
                                if (var4_4 != null) break block32;
                            }
                            catch (JSONException v7) {
                                throw __.a(v7);
                            }
                            cfr_temp_2 = v6.W().method_10215() - var1_1.method_10215();
                            v3 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                        }
                        catch (JSONException v8) {
                            throw __.a(v8);
                        }
                    }
                    if (v3 != false) break block30;
                    v6 = var6_5;
                }
                return v6;
            }
            if (var4_4 == null) continue;
        }
        var5_3 = this.w.iterator();
        do {
            block35: {
                block34: {
                    block33: {
                        v0 = var5_3.hasNext();
lbl55:
                        // 2 sources

                        if (!v0) break;
                        var6_5 = var5_3.next();
                        try {
                            try {
                                cfr_temp_3 = var6_5.W().method_10216() - var1_1.method_10216();
                                v9 = cfr_temp_3 == 0.0 ? 0 : (cfr_temp_3 > 0.0 ? 1 : -1);
                                if (var4_4 != null) break block33;
                                if (v9 != false) continue;
                            }
                            catch (JSONException v10) {
                                throw __.a(v10);
                            }
                            cfr_temp_4 = var6_5.W().method_10214() - var1_1.method_10214();
                            v9 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                        }
                        catch (JSONException v11) {
                            throw __.a(v11);
                        }
                    }
                    try {
                        try {
                            try {
                                if (var4_4 != null) break block34;
                                if (v9 != false) continue;
                            }
                            catch (JSONException v12) {
                                throw __.a(v12);
                            }
                            v13 = var6_5;
                            if (var4_4 != null) break block35;
                        }
                        catch (JSONException v14) {
                            throw __.a(v14);
                        }
                        cfr_temp_5 = v13.W().method_10215() - var1_1.method_10215();
                        v9 = cfr_temp_5 == 0.0 ? 0 : (cfr_temp_5 > 0.0 ? 1 : -1);
                    }
                    catch (JSONException v15) {
                        throw __.a(v15);
                    }
                }
                if (v9 != false) continue;
                v13 = var6_5;
            }
            return v13;
        } while (var4_4 == null);
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public boolean y(z5 var1_1, class_243 var2_2, double var3_3) {
        block36: {
            block35: {
                block30: {
                    block34: {
                        block33: {
                            block31: {
                                block28: {
                                    block29: {
                                        var5_4 = __.a ^ 48929926431630L;
                                        var8_5 = this.y(var2_2);
                                        var9_6 = var3_3;
                                        var7_7 = __.M();
                                        try {
                                            v0 = var1_1;
                                            if (var7_7 != null) break block28;
                                            if (v0 == null) break block29;
                                        }
                                        catch (JSONException v1) {
                                            throw __.a(v1);
                                        }
                                        var9_6 += var1_1.p();
                                    }
                                    v0 = var8_5;
                                }
                                try {
                                    block32: {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var7_7 != null) break block30;
                                                                    if (v0 == null) {
                                                                    }
                                                                    ** GOTO lbl92
                                                                }
                                                                catch (JSONException v2) {
                                                                    throw __.a(v2);
                                                                }
                                                                cfr_temp_0 = var2_2.method_10216() - this.Z.method_10216();
                                                                v3 = cfr_temp_0 == 0.0 ? 0 : (cfr_temp_0 > 0.0 ? 1 : -1);
                                                                if (var7_7 != null) break block31;
                                                            }
                                                            catch (JSONException v4) {
                                                                throw __.a(v4);
                                                            }
                                                            if (v3 != false) break block32;
                                                        }
                                                        catch (JSONException v5) {
                                                            throw __.a(v5);
                                                        }
                                                        cfr_temp_1 = var2_2.method_10214() - this.Z.method_10214();
                                                        v3 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 > 0.0 ? 1 : -1);
                                                        if (var7_7 != null) break block31;
                                                    }
                                                    catch (JSONException v6) {
                                                        throw __.a(v6);
                                                    }
                                                    if (v3 != false) break block32;
                                                }
                                                catch (JSONException v7) {
                                                    throw __.a(v7);
                                                }
                                                cfr_temp_2 = var2_2.method_10215() - this.Z.method_10215();
                                                v3 = cfr_temp_2 == 0.0 ? 0 : (cfr_temp_2 > 0.0 ? 1 : -1);
                                                if (var7_7 != null) break block33;
                                            }
                                            catch (JSONException v8) {
                                                throw __.a(v8);
                                            }
                                            if (v3 != false) {
                                            }
                                            ** GOTO lbl74
                                        }
                                        catch (JSONException v9) {
                                            throw __.a(v9);
                                        }
                                    }
                                    v3 = (cfr_temp_3 = var2_2.method_1025(this.Z) - 9.5) == 0.0 ? 0 : (cfr_temp_3 < 0.0 ? -1 : 1);
                                }
                                catch (JSONException v10) {
                                    throw __.a(v10);
                                }
                            }
                            try {
                                try {
                                    if (var7_7 != null) break block33;
                                    if (v3 > 0) break block34;
                                }
                                catch (JSONException v11) {
                                    throw __.a(v11);
                                }
lbl74:
                                // 2 sources

                                this.i.clear();
                                this.i = var1_1.v();
                                this.i.add(var2_2);
                                v3 = (double)true;
                            }
                            catch (JSONException v12) {
                                throw __.a(v12);
                            }
                        }
                        return (boolean)v3;
                    }
                    var11_8 = new ArrayList<class_243>(var1_1.v());
                    try {
                        var11_8.add(var2_2);
                        this.w.add(new z5(var2_2, var1_1, var11_8, var2_2.method_1025(this.Z), var3_3, var9_6));
                        if (var7_7 == null) break block35;
lbl92:
                        // 2 sources

                        v0 = var8_5;
                    }
                    catch (JSONException v13) {
                        throw __.a(v13);
                    }
                }
                try {
                    cfr_temp_4 = v0.M() - var3_3;
                    v14 = cfr_temp_4 == 0.0 ? 0 : (cfr_temp_4 > 0.0 ? 1 : -1);
                    if (var7_7 != null) break block36;
                    if (v14 <= 0) break block35;
                }
                catch (JSONException v15) {
                    throw __.a(v15);
                }
                var11_8 = new ArrayList<class_243>(var1_1.v());
                var11_8.add(var2_2);
                var8_5.o(var2_2);
                var8_5.I(var1_1);
                var8_5.y(var11_8);
                var8_5.K(var2_2.method_1025(this.Z));
                var8_5.L(var3_3);
                var8_5.o(var9_6);
            }
            v14 = (double)false;
        }
        return (boolean)v14;
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
        return this.q;
    }

    public static void J(String string) {
        X = string;
    }

    public static String M() {
        return X;
    }

    static {
        a = ds.a((long)2935054107701506152L, (long)8682702040783530450L, MethodHandles.lookup().lookupClass()).a(71981386653375L);
        if (__.M() != null) {
            __.J("cIsT");
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
