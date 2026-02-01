/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.JD
 *  club.evon.JQ
 *  club.evon.J_
 *  club.evon.Jd
 *  club.evon._y
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.gn
 *  club.evon.v3
 *  club.evon.vF
 *  club.evon.vJ
 *  club.evon.vj
 *  club.evon.ya
 *  club.evon.yd
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 *  org.json.JSONException
 */
package club.evon;

import club.evon.JD;
import club.evon.JQ;
import club.evon.J_;
import club.evon.Jd;
import club.evon._D;
import club.evon._S;
import club.evon._v;
import club.evon._y;
import club.evon.ds;
import club.evon.gQ;
import club.evon.gn;
import club.evon.v3;
import club.evon.vF;
import club.evon.vJ;
import club.evon.vj;
import club.evon.yN;
import club.evon.yS;
import club.evon.ya;
import club.evon.yd;
import club.evon.ym;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.json.JSONException;

public final class yK
extends vJ<gn> {
    private final ya B;
    private boolean v;
    private boolean X;
    private boolean y;
    private boolean k;
    private int K;
    private int m;
    private static final long b = ds.a((long)-955909401725039209L, (long)4224076206311915267L, MethodHandles.lookup().lookupClass()).a(52756485912127L);

    public yK(String string, gn gn2) {
        long l = b ^ 0x178A7479B6BEL;
        super(string, (gQ)gn2);
        this.B = new ya((J_)JD.M());
        this.K = -1;
        boolean bl = yd.v();
        try {
            if (bl) {
                gQ.o((gQ[])new gQ[5]);
            }
        }
        catch (JSONException jSONException) {
            throw yK.a(jSONException);
        }
    }

    /*
     * Unable to fully structure code
     */
    @_S
    public void K(vj var1_1) {
        block10: {
            block11: {
                block9: {
                    var2_2 = yK.b ^ 60882788211262L;
                    var4_3 = yd.t();
                    try {
                        try {
                            try {
                                v0 = ((gn)this.v()).O();
                                v1 = _y.BOW;
                                if (!var4_3) break block9;
                                if (v0 == v1) break block10;
                            }
                            catch (JSONException v2) {
                                throw yK.a(v2);
                            }
                            v3 = this;
                            if (!var4_3) break block11;
                        }
                        catch (JSONException v4) {
                            throw yK.a(v4);
                        }
                        v0 = ((gn)v3.v()).O();
                        v1 = _y.USEABLE;
                    }
                    catch (JSONException v5) {
                        throw yK.a(v5);
                    }
                }
                if (v0 != v1) ** GOTO lbl29
                v3 = this;
            }
            try {
                if (!v3.B.i()) break block10;
lbl29:
                // 2 sources

                var1_1.K();
            }
            catch (JSONException v6) {
                throw yK.a(v6);
            }
        }
    }

    @_S
    public void p(v3 v32) {
        block12: {
            class_746 class_7462;
            block13: {
                class_2596 class_25962;
                boolean bl;
                block11: {
                    long l = b ^ 0x35C66A758207L;
                    class_2596 class_25963 = v32.d();
                    bl = yd.v();
                    try {
                        try {
                            class_25962 = class_25963;
                            if (bl) break block11;
                            if (!(class_25962 instanceof class_2663)) break block12;
                        }
                        catch (JSONException jSONException) {
                            throw yK.a(jSONException);
                        }
                        class_25962 = class_25963;
                    }
                    catch (JSONException jSONException) {
                        throw yK.a(jSONException);
                    }
                }
                class_2663 class_26632 = (class_2663)class_25962;
                try {
                    try {
                        class_7462 = ym.m.field_1724;
                        if (bl) break block13;
                        if (class_7462 == null) break block12;
                    }
                    catch (JSONException jSONException) {
                        throw yK.a(jSONException);
                    }
                    class_7462 = class_26632.method_11469((class_1937)ym.m.field_1687);
                }
                catch (JSONException jSONException) {
                    throw yK.a(jSONException);
                }
            }
            try {
                if (class_7462 == ym.m.field_1724) {
                    this.K();
                }
            }
            catch (JSONException jSONException) {
                throw yK.a(jSONException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @_S
    public void T(yN var1_1) {
        block19: {
            block21: {
                block20: {
                    block18: {
                        block16: {
                            block17: {
                                var2_2 = yK.b ^ 119130036677915L;
                                var4_3 = yd.v();
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var4_3) break block16;
                                                if (ym.m.field_1724 != null) {
                                                }
                                                ** GOTO lbl30
                                            }
                                            catch (JSONException v0) {
                                                throw yK.a(v0);
                                            }
                                            v1 = ym.m;
                                            if (var4_3) break block17;
                                        }
                                        catch (JSONException v2) {
                                            throw yK.a(v2);
                                        }
                                        if (v1.field_1755 == null) {
                                        }
                                        ** GOTO lbl30
                                    }
                                    catch (JSONException v3) {
                                        throw yK.a(v3);
                                    }
                                    v1 = ym.m;
                                }
                                catch (JSONException v4) {
                                    throw yK.a(v4);
                                }
                            }
                            try {
                                if (v1.method_18506() == null) break block18;
lbl30:
                                // 3 sources

                                this.o();
                            }
                            catch (JSONException v5) {
                                throw yK.a(v5);
                            }
                        }
                        this.K();
                    }
                    try {
                        try {
                            if (gQ.q() != null) break block19;
                            if (!var4_3) break block20;
                        }
                        catch (JSONException v6) {
                            throw yK.a(v6);
                        }
                        v7 = false;
                        break block21;
                    }
                    catch (JSONException v8) {
                        throw yK.a(v8);
                    }
                }
                v7 = true;
            }
            yd.b((boolean)v7);
        }
    }

    private void P() {
        this.B.m();
    }

    private void K() {
        this.B.j();
    }

    private void o() {
        this.v = false;
        this.X = false;
        this.K = -1;
    }

    @_S
    public void n(vF vF2) {
        block18: {
            class_310 class_3102;
            block19: {
                boolean bl;
                block17: {
                    yK yK2;
                    boolean bl2;
                    block15: {
                        block16: {
                            long l = b ^ 0x174B0C2BEB2L;
                            bl2 = yd.t();
                            try {
                                block14: {
                                    try {
                                        try {
                                            if (ym.m.field_1724 == null) break block14;
                                            yK2 = this;
                                            if (!bl2) break block15;
                                        }
                                        catch (JSONException jSONException) {
                                            throw yK.a(jSONException);
                                        }
                                        if (((gn)yK2.v()).O() == _y.BLOCKABLE) break block16;
                                    }
                                    catch (JSONException jSONException) {
                                        throw yK.a(jSONException);
                                    }
                                }
                                return;
                            }
                            catch (JSONException jSONException) {
                                throw yK.a(jSONException);
                            }
                        }
                        yK2 = this;
                    }
                    try {
                        try {
                            try {
                                bl = yK2.v;
                                if (!bl2) break block17;
                                if (!bl) break block18;
                            }
                            catch (JSONException jSONException) {
                                throw yK.a(jSONException);
                            }
                            class_3102 = ym.m;
                            if (!bl2) break block19;
                        }
                        catch (JSONException jSONException) {
                            throw yK.a(jSONException);
                        }
                        bl = class_3102.field_1724.method_6115();
                    }
                    catch (JSONException jSONException) {
                        throw yK.a(jSONException);
                    }
                }
                try {
                    if (!bl) break block18;
                    this.P();
                    class_3102 = ym.m;
                }
                catch (JSONException jSONException) {
                    throw yK.a(jSONException);
                }
            }
            class_3102.field_1761.method_2897((class_1657)ym.m.field_1724);
            yS.J().V();
            this.v = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    @_S(h=1)
    public void R(_D var1_1) {
        block40: {
            block34: {
                block35: {
                    block41: {
                        block39: {
                            block38: {
                                block37: {
                                    block36: {
                                        block32: {
                                            block33: {
                                                var2_2 = yK.b ^ 87786769207723L;
                                                var4_3 = yd.v();
                                                try {
                                                    try {
                                                        if (var4_3) break block32;
                                                        if (ym.m.field_1724 != null) break block33;
                                                    }
                                                    catch (JSONException v0) {
                                                        throw yK.a(v0);
                                                    }
                                                    return;
                                                }
                                                catch (JSONException v1) {
                                                    throw yK.a(v1);
                                                }
                                            }
                                            this.X = false;
                                        }
                                        var5_4 = yS.e();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                v2 = this;
                                                                if (var4_3) break block34;
                                                                if (((gn)v2.v()).O() == _y.BLOCKABLE) {
                                                                }
                                                                ** GOTO lbl91
                                                            }
                                                            catch (JSONException v3) {
                                                                throw yK.a(v3);
                                                            }
                                                            v4 = var5_4.O();
                                                            if (var4_3) break block35;
                                                        }
                                                        catch (JSONException v5) {
                                                            throw yK.a(v5);
                                                        }
                                                        if (v4) {
                                                        }
                                                        ** GOTO lbl78
                                                    }
                                                    catch (JSONException v6) {
                                                        throw yK.a(v6);
                                                    }
                                                    v7 = ym.m.field_1724.method_6115();
                                                    if (var4_3) break block36;
                                                }
                                                catch (JSONException v8) {
                                                    throw yK.a(v8);
                                                }
                                                if (!v7) break block37;
                                            }
                                            catch (JSONException v9) {
                                                throw yK.a(v9);
                                            }
                                            v7 = this.B.i();
                                        }
                                        catch (JSONException v10) {
                                            throw yK.a(v10);
                                        }
                                    }
                                    if (v7) break block40;
                                }
                                var6_5 = Jd.S();
                                try {
                                    try {
                                        v11 = JQ.t((class_2248)var6_5);
                                        if (var4_3) break block38;
                                        if (v11) break block39;
                                    }
                                    catch (JSONException v12) {
                                        throw yK.a(v12);
                                    }
                                    v11 = ym.m.field_1761.method_2923();
                                }
                                catch (JSONException v13) {
                                    throw yK.a(v13);
                                }
                            }
                            if (!v11) break block41;
                        }
                        return;
                    }
                    try {
                        this.v = true;
                        var5_4.l();
                        if (!var4_3) break block40;
lbl78:
                        // 2 sources

                        v4 = ym.m.field_1724.method_6115();
                    }
                    catch (JSONException v14) {
                        throw yK.a(v14);
                    }
                }
                try {
                    try {
                        if (v4) break block40;
                        this.K();
                        if (!var4_3) break block40;
                    }
                    catch (JSONException v15) {
                        throw yK.a(v15);
                    }
lbl91:
                    // 2 sources

                    v2 = this;
                }
                catch (JSONException v16) {
                    throw yK.a(v16);
                }
            }
            v2.K();
        }
    }

    public void Y() {
        this.K();
        this.o();
        super.Y();
    }

    private int c() {
        int n;
        block12: {
            int n2;
            boolean bl;
            int n3;
            block10: {
                int n4;
                long l = b ^ 0x1444DE6FD622L;
                n3 = _v.L((int)8);
                bl = yd.t();
                for (n2 = n3; n2 < 9; ++n2) {
                    int n5;
                    block11: {
                        try {
                            try {
                                n4 = this.x(n2) ? 1 : 0;
                                if (!bl) break block10;
                                if (!bl) break block11;
                            }
                            catch (JSONException jSONException) {
                                throw yK.a(jSONException);
                            }
                            if (n4 == 0) continue;
                        }
                        catch (JSONException jSONException) {
                            throw yK.a(jSONException);
                        }
                        n5 = n2;
                    }
                    return n5;
                }
                n4 = n2 = n3 - 1;
            }
            while (n2 >= 0) {
                block14: {
                    int n6;
                    block13: {
                        try {
                            try {
                                n = this.x(n2) ? 1 : 0;
                                if (!bl) break block12;
                                if (!bl) break block13;
                            }
                            catch (JSONException jSONException) {
                                throw yK.a(jSONException);
                            }
                            if (n == 0) break block14;
                        }
                        catch (JSONException jSONException) {
                            throw yK.a(jSONException);
                        }
                        n6 = n2;
                    }
                    return n6;
                }
                --n2;
                if (bl) continue;
            }
            n = n3;
        }
        return n;
    }

    private boolean x(int n) {
        boolean bl;
        block12: {
            block14: {
                block13: {
                    boolean bl2;
                    class_1661 class_16612;
                    block11: {
                        int n2;
                        block10: {
                            long l = b ^ 0x164FD1CD8AD8L;
                            class_16612 = ym.m.field_1724.method_31548();
                            bl2 = yd.t();
                            try {
                                try {
                                    n2 = n;
                                    if (!bl2) break block10;
                                    if (n2 != class_16612.method_67532()) break block11;
                                }
                                catch (JSONException jSONException) {
                                    throw yK.a(jSONException);
                                }
                                n2 = 0;
                            }
                            catch (JSONException jSONException) {
                                throw yK.a(jSONException);
                            }
                        }
                        return n2 != 0;
                    }
                    class_1799 class_17992 = (class_1799)class_16612.method_67533().get(n);
                    try {
                        try {
                            try {
                                bl = class_17992.method_7960();
                                if (!bl2) break block12;
                                if (bl) break block13;
                            }
                            catch (JSONException jSONException) {
                                throw yK.a(jSONException);
                            }
                            bl = class_17992.method_7964().method_10866().method_10967();
                            if (!bl2) break block12;
                        }
                        catch (JSONException jSONException) {
                            throw yK.a(jSONException);
                        }
                        if (!bl) break block14;
                    }
                    catch (JSONException jSONException) {
                        throw yK.a(jSONException);
                    }
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
