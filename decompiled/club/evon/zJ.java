/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.C
 *  club.evon.R
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.h
 *  club.evon.vL
 *  club.evon.vz
 *  net.minecraft.class_11909
 *  net.minecraft.class_241
 *  net.minecraft.class_3532
 *  net.minecraft.class_408
 *  org.json.JSONException
 */
package club.evon;

import club.evon.C;
import club.evon.R;
import club.evon._S;
import club.evon.ds;
import club.evon.gQ;
import club.evon.h;
import club.evon.vL;
import club.evon.vz;
import club.evon.yO;
import club.evon.ym;
import club.evon.zR;
import club.evon.zx;
import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_11909;
import net.minecraft.class_241;
import net.minecraft.class_3532;
import net.minecraft.class_408;
import org.json.JSONException;

public final class zJ
implements h {
    private final zR x = new zR();
    private final Map<R, gQ> k = new HashMap<R, gQ>();
    private boolean g;
    private static zJ S;
    private static final long a;

    public void p(R r, gQ gQ2) {
        this.k.put(r, gQ2);
    }

    @_S
    private void p(zx zx2) {
        block9: {
            block11: {
                zJ zJ2;
                block10: {
                    boolean bl;
                    block8: {
                        long l = a ^ 0x19D4D3EA6888L;
                        String string = vz.O();
                        try {
                            try {
                                try {
                                    bl = ym.m.field_1755 instanceof class_408;
                                    if (string != null) break block8;
                                    if (bl) break block9;
                                }
                                catch (JSONException jSONException) {
                                    throw zJ.a(jSONException);
                                }
                                zJ2 = this;
                                if (string != null) break block10;
                            }
                            catch (JSONException jSONException) {
                                throw zJ.a(jSONException);
                            }
                            bl = zJ2.g;
                        }
                        catch (JSONException jSONException) {
                            throw zJ.a(jSONException);
                        }
                    }
                    if (!bl) break block11;
                    zJ2 = this;
                }
                zJ2.n();
            }
            return;
        }
        float f = (float)zx2.r();
        float f2 = (float)zx2.m();
        int n = ym.m.method_22683().method_4486();
        int n2 = ym.m.method_22683().method_4502();
        this.k.forEach((r, gQ2) -> {
            R r2;
            block10: {
                block11: {
                    block9: {
                        boolean bl;
                        block8: {
                            long l = a ^ 0x76E68A6EE690L;
                            String string = vz.O();
                            try {
                                try {
                                    try {
                                        bl = gQ2.d();
                                        if (string != null) break block8;
                                        if (!bl) break block9;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zJ.a(jSONException);
                                    }
                                    r2 = r;
                                    if (string != null) break block10;
                                }
                                catch (JSONException jSONException) {
                                    throw zJ.a(jSONException);
                                }
                                bl = r2.e();
                            }
                            catch (JSONException jSONException) {
                                throw zJ.a(jSONException);
                            }
                        }
                        if (bl) break block11;
                    }
                    return;
                }
                this.x.W((R)r, n, n2);
                r2 = r;
            }
            float f3 = r2.H();
            float f4 = r.Q();
            float f5 = f - r.N();
            float f6 = f2 - r.R();
            f5 = this.x.G(f5, f3);
            f6 = this.x.M(f6, f4);
            f5 = class_3532.method_15363((float)f5, (float)0.0f, (float)((float)n - f3));
            f6 = class_3532.method_15363((float)f6, (float)0.0f, (float)((float)n2 - f4));
            float f7 = f5 / (float)n;
            float f8 = f6 / (float)n2;
            r.P((Object)new class_241(f7, f8));
            this.x.q(n, n2, r.a(), r.c(), r.H(), r.Q());
        });
    }

    @_S
    private void J(vL vL2) {
        int n = vL2.y();
        int n2 = vL2.m();
        this.k.forEach((r, gQ2) -> {
            class_241 class_2412 = (class_241)r.J();
            float f = r.H();
            float f2 = r.Q();
            float f3 = class_3532.method_15363((float)(class_2412.field_1343 * (float)n), (float)0.0f, (float)((float)n - f));
            float f4 = class_3532.method_15363((float)(class_2412.field_1342 * (float)n2), (float)0.0f, (float)((float)n2 - f2));
            float f5 = f3 / (float)n;
            float f6 = f4 / (float)n2;
            r.P((Object)new class_241(f5, f6));
        });
    }

    public void S(class_11909 class_119092) {
        block5: {
            class_11909 class_119093;
            block4: {
                long l = a ^ 0x13352ADE686DL;
                String string = vz.O();
                try {
                    try {
                        class_119093 = class_119092;
                        if (string != null) break block4;
                        if (class_119093.method_74245() != 0) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw zJ.a(jSONException);
                    }
                    class_119093 = class_119092;
                }
                catch (JSONException jSONException) {
                    throw zJ.a(jSONException);
                }
            }
            double d = class_119093.comp_4798();
            double d2 = class_119092.comp_4799();
            this.k.forEach((r, gQ2) -> {
                block5: {
                    block4: {
                        long l = a ^ 0x619988FC48FFL;
                        class_241 class_2412 = new class_241(r.a(), r.c());
                        String string = vz.O();
                        class_241 class_2413 = new class_241(r.H(), r.Q());
                        try {
                            try {
                                if (string != null) break block4;
                                if (!yO.J(d, d2, class_2412.field_1343, class_2412.field_1342, class_2413.field_1343, class_2413.field_1342)) break block5;
                            }
                            catch (JSONException jSONException) {
                                throw zJ.a(jSONException);
                            }
                            r.E((float)d, (float)d2, class_2412.field_1343, class_2412.field_1342);
                            r.H(true);
                        }
                        catch (JSONException jSONException) {
                            throw zJ.a(jSONException);
                        }
                    }
                    this.g = true;
                }
            });
        }
    }

    public void n() {
        this.k.forEach((r, gQ2) -> r.H(false));
        this.g = false;
    }

    public static void A() {
        S = new zJ();
        C.P((Object)S);
    }

    public static zJ Q() {
        return S;
    }

    static {
        a = ds.a((long)-687251129992698656L, (long)-1584481537129278646L, MethodHandles.lookup().lookupClass()).a(38956369447735L);
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
