/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  net.minecraft.class_3532
 *  org.json.JSONException
 */
package club.evon;

import club.evon.Z;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.TickEvent;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_3532;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class AnimationValue {
    private final Z D = new Z();
    private double Q;
    private double s;
    private double o;
    private int Z;
    private TickEvent d;
    private static int Category;
    private static final long FontWeight;

    public _J(int n, double d, TickEvent yn2) {
        this.Z = n;
        this.o = d;
        this.d = yn2;
    }

    public Double y() {
        block8: {
            _J _J2;
            block6: {
                block7: {
                    long l = FontWeight ^ 0xC7BE4E0DFA6L;
                    int[] nArray = TickEvent.Property();
                    try {
                        try {
                            try {
                                _J2 = this;
                                if (nArray == null) break block6;
                                if (!_J2.K()) break block7;
                            }
                            catch (JSONException jSONException) {
                                throw _J.FontWeight(jSONException);
                            }
                            this.Q = this.o;
                            if (nArray != null) break block8;
                        }
                        catch (JSONException jSONException) {
                            throw _J.FontWeight(jSONException);
                        }
                        Module.o((Module[])new Module[3]);
                    }
                    catch (JSONException jSONException) {
                        throw _J.FontWeight(jSONException);
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
                long l2 = FontWeight ^ 0x5F893AE16B5FL;
                int[] nArray = TickEvent.Property();
                try {
                    try {
                        z = this.D;
                        l = this.Z;
                        if (nArray == null) break block4;
                        if (z.o(l)) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw _J.FontWeight(jSONException);
                    }
                    z = this.D;
                    l = (long)this.Z - this.D.D();
                }
                catch (JSONException jSONException) {
                    throw _J.FontWeight(jSONException);
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
                long l = FontWeight ^ 0x5993BDDAF609L;
                int[] nArray = TickEvent.Property();
                try {
                    _J _J2;
                    try {
                        _J2 = this;
                        if (nArray == null) break block4;
                        if (_J2.o == d) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw _J.FontWeight(jSONException);
                    }
                    this.Category();
                    _J2 = this;
                }
                catch (JSONException jSONException) {
                    throw _J.FontWeight(jSONException);
                }
            }
            _J2.o = d;
        }
    }

    public void Category() {
        long l = FontWeight ^ 0x33C8F38B7DB6L;
        this.s = this.Q;
        int[] nArray = TickEvent.Property();
        try {
            this.D.FontWeight();
            if (Module.q() == null) {
                TickEvent.Q((int[])new int[5]);
            }
        }
        catch (JSONException jSONException) {
            throw _J.FontWeight(jSONException);
        }
    }

    public Z Property() {
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

    public TickEvent v() {
        return this.d;
    }

    public void F(double d) {
        this.s = d;
    }

    public void l(int n) {
        this.Z = n;
    }

    public void g(TickEvent yn2) {
        this.d = yn2;
    }

    public static void L(int n) {
        Category = n;
    }

    public static int M() {
        return Category;
    }

    public static int N() {
        int n = _J.M();
        try {
            if (n == 0) {
                return 1;
            }
        }
        catch (JSONException jSONException) {
            throw _J.FontWeight(jSONException);
        }
        return 0;
    }

    static {
        FontWeight = ObfuscationHelper.FontWeight((long)-1386605988870332117L, (long)-5136400215793006666L, MethodHandles.lookup().lookupClass()).FontWeight(95496031201189L);
        if (_J.N() != 0) {
            _J.L(91);
        }
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
