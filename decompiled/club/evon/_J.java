/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.gQ
 *  net.minecraft.class_3532
 *  org.json.JSONException
 */
package club.evon;

import club.evon.Z;
import club.evon.ds;
import club.evon.gQ;
import club.evon.yn;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_3532;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class _J {
    private final Z D = new Z();
    private double Q;
    private double s;
    private double o;
    private int Z;
    private yn d;
    private static int T;
    private static final long a;

    public _J(int n, double d, yn yn2) {
        this.Z = n;
        this.o = d;
        this.d = yn2;
    }

    public Double y() {
        block8: {
            _J _J2;
            block6: {
                block7: {
                    long l = a ^ 0xC7BE4E0DFA6L;
                    int[] nArray = yn.B();
                    try {
                        try {
                            try {
                                _J2 = this;
                                if (nArray == null) break block6;
                                if (!_J2.K()) break block7;
                            }
                            catch (JSONException jSONException) {
                                throw _J.a(jSONException);
                            }
                            this.Q = this.o;
                            if (nArray != null) break block8;
                        }
                        catch (JSONException jSONException) {
                            throw _J.a(jSONException);
                        }
                        gQ.o((gQ[])new gQ[3]);
                    }
                    catch (JSONException jSONException) {
                        throw _J.a(jSONException);
                    }
                }
                _J2 = this.d.g().apply((double)this.D.D() / (double)this.Z);
            }
            double d = (Double)((Object)_J2);
            this.Q = class_3532.method_16436((double)d, (double)this.s, (double)this.o);
        }
        return this.Q;
    }

    public void I() {
        block5: {
            long l;
            Z z;
            block4: {
                long l2 = a ^ 0x5F893AE16B5FL;
                int[] nArray = yn.B();
                try {
                    try {
                        z = this.D;
                        l = this.Z;
                        if (nArray == null) break block4;
                        if (z.o(l)) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw _J.a(jSONException);
                    }
                    z = this.D;
                    l = (long)this.Z - this.D.D();
                }
                catch (JSONException jSONException) {
                    throw _J.a(jSONException);
                }
            }
            z.O(l);
        }
    }

    public void u(double d) {
        this.N(d);
        this.I();
    }

    public boolean K() {
        return this.D.o(this.Z);
    }

    public void N(double d) {
        block5: {
            block4: {
                long l = a ^ 0x5993BDDAF609L;
                int[] nArray = yn.B();
                try {
                    _J _J2;
                    try {
                        _J2 = this;
                        if (nArray == null) break block4;
                        if (_J2.o == d) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw _J.a(jSONException);
                    }
                    this.T();
                    _J2 = this;
                }
                catch (JSONException jSONException) {
                    throw _J.a(jSONException);
                }
            }
            _J2.o = d;
        }
    }

    public void T() {
        long l = a ^ 0x33C8F38B7DB6L;
        this.s = this.Q;
        int[] nArray = yn.B();
        try {
            this.D.a();
            if (gQ.q() == null) {
                yn.Q((int[])new int[5]);
            }
        }
        catch (JSONException jSONException) {
            throw _J.a(jSONException);
        }
    }

    public Z B() {
        return this.D;
    }

    public double K() {
        return this.s;
    }

    public double z() {
        return this.o;
    }

    public int U() {
        return this.Z;
    }

    public yn v() {
        return this.d;
    }

    public void F(double d) {
        this.s = d;
    }

    public void l(int n) {
        this.Z = n;
    }

    public void g(yn yn2) {
        this.d = yn2;
    }

    public static void L(int n) {
        T = n;
    }

    public static int M() {
        return T;
    }

    public static int N() {
        int n = _J.M();
        try {
            if (n == 0) {
                return 1;
            }
        }
        catch (JSONException jSONException) {
            throw _J.a(jSONException);
        }
        return 0;
    }

    static {
        a = ds.a((long)-1386605988870332117L, (long)-5136400215793006666L, MethodHandles.lookup().lookupClass()).a(95496031201189L);
        if (_J.N() != 0) {
            _J.L(91);
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
