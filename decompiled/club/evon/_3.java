/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.J6
 *  club.evon.Js
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.t
 *  club.evon.y8
 *  org.json.JSONException
 */
package club.evon;

import club.evon.J6;
import club.evon.Js;
import club.evon._J;
import club.evon._V;
import club.evon.ds;
import club.evon.gQ;
import club.evon.t;
import club.evon.y8;
import club.evon.yn;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public class _3
extends _V {
    private final t Y;
    private final _J W;
    private static String[] g;
    private static final long a;

    public _3(t t2) {
        long l = a ^ 0x2B764C638BAL;
        String[] stringArray = _3.t();
        String[] stringArray2 = stringArray;
        try {
            this.W = new _J(200, 0.0, yn.LINEAR);
            this.Y = t2;
            if (gQ.q() == null) {
                _3.s(new String[5]);
            }
        }
        catch (JSONException jSONException) {
            throw _3.a(jSONException);
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l(int var1_1, int var2_2) {
        block21: {
            block22: {
                block19: {
                    block20: {
                        block18: {
                            block17: {
                                var3_3 = _3.a ^ 102763847335121L;
                                var5_4 = _3.t();
                                try {
                                    v0 = this.W;
                                    v1 = this.Y.I() != false ? 1.0 : 0.0;
                                }
                                catch (JSONException v2) {
                                    throw _3.a(v2);
                                }
                                try {
                                    v0.N(v1);
                                    v3 = this.j();
                                    v4 = this.F();
                                    v5 = this.L();
                                    v6 = this.m();
                                    v7 = 2.0f;
                                    v8 = Color.WHITE;
                                    v9 = this.a(var1_1, var2_2) != false ? 0.15000000596046448 : 0.10000000149011612;
                                }
                                catch (JSONException v10) {
                                    throw _3.a(v10);
                                }
                                y8.Z((float)v3, (float)v4, (float)v5, (float)v6, (float)v7, (Color)J6.N((Color)v8, (double)v9));
                                var6_5 = this.W.y().floatValue();
                                try {
                                    try {
                                        v11 = var6_5;
                                        v12 = 0.0f;
                                        if (var5_4 != null) break block17;
                                        if (!(v11 > v12)) break block18;
                                    }
                                    catch (JSONException v13) {
                                        throw _3.a(v13);
                                    }
                                    v11 = this.j();
                                    v12 = this.F();
                                }
                                catch (JSONException v14) {
                                    throw _3.a(v14);
                                }
                            }
                            y8.Z((float)v11, (float)v12, (float)this.L(), (float)this.m(), (float)2.0f, (Color)J6.N((Color)Color.WHITE, (double)(0.1f * var6_5)));
                        }
                        var7_6 = this.Y.S();
                        var8_7 = 6.5f;
                        var9_8 = this.W.y().floatValue();
                        try {
                            cfr_temp_0 = var9_8 - 1.0f;
                            v15 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                            if (var5_4 != null) break block19;
                            if (v15 != false) break block20;
                        }
                        catch (JSONException v16) {
                            throw _3.a(v16);
                        }
                        var10_9 = Color.WHITE;
                        try {
                            if (var5_4 == null) break block21;
                            gQ.o((gQ[])new gQ[3]);
                        }
                        catch (JSONException v17) {
                            throw _3.a(v17);
                        }
                    }
                    v15 = (cfr_temp_1 = var9_8 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                }
                try {
                    if (var5_4 != null) break block22;
                    if (v15 == 0) {
                    }
                    ** GOTO lbl69
                }
                catch (JSONException v18) {
                    throw _3.a(v18);
                }
                var10_9 = Js.X;
                try {
                    if (var5_4 == null) break block21;
lbl69:
                    // 2 sources

                    v15 = (int)((float)Js.X.getRed() + (float)(255 - Js.X.getRed()) * var9_8);
                }
                catch (JSONException v19) {
                    throw _3.a(v19);
                }
            }
            var11_10 = v15;
            var10_9 = new Color((int)var11_10, (int)var11_10, (int)var11_10);
        }
        Js.a.U(var7_6, this.j() + (this.L() - Js.a.y(var7_6, 6.5f)) / 2.0f, 1.0f + this.F() + (this.m() - Js.a.i(var7_6, 6.5f)) / 2.0f, 6.5f, var10_9.getRGB());
    }

    @Override
    public void W(double d, double d2, int n) {
        block9: {
            boolean bl;
            t t2;
            block11: {
                block12: {
                    _3 _32;
                    String[] stringArray;
                    block10: {
                        int n2;
                        block8: {
                            long l = a ^ 0x50CF32D2CA92L;
                            stringArray = _3.t();
                            try {
                                try {
                                    try {
                                        n2 = n;
                                        if (stringArray != null) break block8;
                                        if (n2 != 0) break block9;
                                    }
                                    catch (JSONException jSONException) {
                                        throw _3.a(jSONException);
                                    }
                                    _32 = this;
                                    if (stringArray != null) break block10;
                                }
                                catch (JSONException jSONException) {
                                    throw _3.a(jSONException);
                                }
                                n2 = _32.a(d, d2) ? 1 : 0;
                            }
                            catch (JSONException jSONException) {
                                throw _3.a(jSONException);
                            }
                        }
                        if (n2 == 0) break block9;
                        _32 = this;
                    }
                    try {
                        t2 = _32.Y;
                        bl = this.Y.I();
                        if (stringArray != null) break block11;
                        if (bl) break block12;
                    }
                    catch (JSONException jSONException) {
                        throw _3.a(jSONException);
                    }
                    bl = true;
                    break block11;
                }
                bl = false;
            }
            t2.P((Object)bl);
        }
    }

    @Override
    public boolean l() {
        return this.Y.G();
    }

    public static void s(String[] stringArray) {
        g = stringArray;
    }

    public static String[] t() {
        return g;
    }

    static {
        a = ds.a((long)-999579470410755135L, (long)-7183248333826353285L, MethodHandles.lookup().lookupClass()).a(40656597054842L);
        if (_3.t() != null) {
            _3.s(new String[4]);
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
