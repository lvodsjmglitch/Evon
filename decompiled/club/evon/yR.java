/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.JD
 *  club.evon.J_
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.gY
 *  club.evon.v3
 *  club.evon.vA
 *  club.evon.vJ
 *  club.evon.vz
 *  club.evon.ya
 *  net.minecraft.class_1294
 *  net.minecraft.class_2596
 *  net.minecraft.class_2743
 *  net.minecraft.class_746
 *  org.json.JSONException
 */
package club.evon;

import club.evon.JD;
import club.evon.J_;
import club.evon._S;
import club.evon.ds;
import club.evon.gQ;
import club.evon.gY;
import club.evon.v3;
import club.evon.vA;
import club.evon.vJ;
import club.evon.vz;
import club.evon.yQ;
import club.evon.ya;
import club.evon.ym;
import club.evon.z0;
import club.evon.zP;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1294;
import net.minecraft.class_2596;
import net.minecraft.class_2743;
import net.minecraft.class_746;
import org.json.JSONException;

public class yR
extends vJ<gY> {
    private double P;
    private final ya K;
    private static final long b = ds.a((long)8956310332322617761L, (long)1588166954598224226L, MethodHandles.lookup().lookupClass()).a(214054282198717L);

    public yR(String string, gY gY2) {
        long l = b ^ 0x3004D7B03925L;
        String string2 = yQ.q();
        super(string, (gQ)gY2);
        this.K = new ya((J_)JD.M());
        String string3 = string2;
        try {
            if (string3 != null) {
                gQ.o((gQ[])new gQ[2]);
            }
        }
        catch (JSONException jSONException) {
            throw yR.a(jSONException);
        }
    }

    public void S() {
        block4: {
            block5: {
                long l = b ^ 0x34DFE5D19131L;
                String string = yQ.q();
                try {
                    try {
                        if (string != null) break block4;
                        if (ym.m.field_1724 != null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yR.a(jSONException);
                    }
                    return;
                }
                catch (JSONException jSONException) {
                    throw yR.a(jSONException);
                }
            }
            this.P = zP.O();
            super.S();
        }
    }

    public void Y() {
        class_746 class_7462;
        block2: {
            block3: {
                long l = b ^ 0x6FBA8528952CL;
                String string = yQ.q();
                this.K.j();
                String string2 = string;
                try {
                    class_7462 = ym.m.field_1724;
                    if (string2 != null) break block2;
                    if (class_7462 != null) break block3;
                }
                catch (JSONException jSONException) {
                    throw yR.a(jSONException);
                }
                return;
            }
            class_7462 = ym.m.field_1724;
        }
        class_7462.method_18799(ym.m.field_1724.method_18798().method_18805(0.0, 1.0, 0.0));
        super.Y();
    }

    @_S
    private void l(vA vA2) {
        block8: {
            boolean bl;
            block7: {
                long l = b ^ 0x6E904BADECD4L;
                String string = yQ.q();
                try {
                    try {
                        bl = zP.r();
                        if (string != null) break block7;
                        if (!bl) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw yR.a(jSONException);
                    }
                    bl = ym.m.field_1724.method_24828();
                }
                catch (JSONException jSONException) {
                    throw yR.a(jSONException);
                }
            }
            try {
                if (bl) {
                    vA2.d(true);
                }
            }
            catch (JSONException jSONException) {
                throw yR.a(jSONException);
            }
        }
    }

    @_S
    private void y(v3 v32) {
        block14: {
            class_2743 class_27432;
            class_2743 class_27433;
            block15: {
                class_2596 class_25962;
                String string;
                block13: {
                    long l = b ^ 0x52BDCD9FE3E5L;
                    class_2596 class_25963 = v32.d();
                    string = yQ.q();
                    try {
                        try {
                            class_25962 = class_25963;
                            if (string != null) break block13;
                            if (!(class_25962 instanceof class_2743)) break block14;
                        }
                        catch (JSONException jSONException) {
                            throw yR.a(jSONException);
                        }
                        class_25962 = class_25963;
                    }
                    catch (JSONException jSONException) {
                        throw yR.a(jSONException);
                    }
                }
                class_27433 = (class_2743)class_25962;
                try {
                    try {
                        try {
                            if (ym.m.field_1724 == null) break block14;
                            class_27432 = class_27433;
                            if (string != null) break block15;
                        }
                        catch (JSONException jSONException) {
                            throw yR.a(jSONException);
                        }
                        if (class_27432.method_11818() != ym.m.field_1724.method_5628()) break block14;
                    }
                    catch (JSONException jSONException) {
                        throw yR.a(jSONException);
                    }
                    class_27432 = class_27433;
                }
                catch (JSONException jSONException) {
                    throw yR.a(jSONException);
                }
            }
            double d = Math.sqrt(Math.pow(class_27432.method_73085().method_10216(), 2.0) + Math.pow(class_27433.method_73085().method_10215(), 2.0));
            try {
                if (d > this.P) {
                    this.P = d;
                }
            }
            catch (JSONException jSONException) {
                throw yR.a(jSONException);
            }
        }
    }

    @_S
    private void P(z0 z02) {
        block29: {
            int n;
            String string;
            block24: {
                block25: {
                    int n2;
                    double d;
                    block26: {
                        block27: {
                            block20: {
                                int n3;
                                block21: {
                                    int n4;
                                    double d2;
                                    block22: {
                                        block23: {
                                            long l = b ^ 0x460A6AA43B93L;
                                            n3 = vz.r().Y;
                                            string = yQ.q();
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            n = ym.m.field_1724.method_24828();
                                                            if (string != null) break block20;
                                                            if (n == 0) break block21;
                                                        }
                                                        catch (JSONException jSONException) {
                                                            throw yR.a(jSONException);
                                                        }
                                                        yR yR2 = this;
                                                        d2 = 0.48;
                                                        n4 = ym.m.field_1724.method_6059(class_1294.field_5904);
                                                        if (string != null) break block22;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw yR.a(jSONException);
                                                    }
                                                    if (n4 == 0) break block23;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw yR.a(jSONException);
                                                }
                                                n4 = ym.m.field_1724.method_6112(class_1294.field_5904).method_5578();
                                                break block22;
                                            }
                                            catch (JSONException jSONException) {
                                                throw yR.a(jSONException);
                                            }
                                        }
                                        n4 = 0;
                                    }
                                    yR2.P = d2 + (double)n4 * 0.05;
                                }
                                n = n3;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (string != null) break block24;
                                            if (n != 1) break block25;
                                        }
                                        catch (JSONException jSONException) {
                                            throw yR.a(jSONException);
                                        }
                                        yR yR3 = this;
                                        d = 0.345;
                                        n2 = ym.m.field_1724.method_6059(class_1294.field_5904);
                                        if (string != null) break block26;
                                    }
                                    catch (JSONException jSONException) {
                                        throw yR.a(jSONException);
                                    }
                                    if (n2 == 0) break block27;
                                }
                                catch (JSONException jSONException) {
                                    throw yR.a(jSONException);
                                }
                                n2 = ym.m.field_1724.method_6112(class_1294.field_5904).method_5578();
                                break block26;
                            }
                            catch (JSONException jSONException) {
                                throw yR.a(jSONException);
                            }
                        }
                        n2 = 0;
                    }
                    yR3.P = d + (double)n2 * 0.05;
                }
                n = zP.r() ? 1 : 0;
            }
            try {
                block28: {
                    try {
                        if (n == 0) break block28;
                        zP.y(this.P);
                        if (string == null) break block29;
                    }
                    catch (JSONException jSONException) {
                        throw yR.a(jSONException);
                    }
                }
                ym.m.field_1724.method_18799(ym.m.field_1724.method_18798().method_18805(0.0, 1.0, 0.0));
            }
            catch (JSONException jSONException) {
                throw yR.a(jSONException);
            }
        }
        this.P -= this.P / 190.0;
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
