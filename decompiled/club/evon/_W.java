/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.vz
 *  net.minecraft.class_634
 *  org.json.JSONException
 */
package club.evon;

import club.evon._A;
import club.evon._S;
import club.evon._r;
import club.evon.ds;
import club.evon.vz;
import club.evon.yN;
import club.evon.ym;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_634;
import org.json.JSONException;

public class _W
extends _r {
    private static final long a = ds.a((long)9124823564794282674L, (long)-267430632723924131L, MethodHandles.lookup().lookupClass()).a(42575701363386L);

    public _W(String string) {
        super(string);
    }

    @_S
    public void U(yN yN2) {
        block6: {
            class_634 class_6342;
            block4: {
                block5: {
                    long l = a ^ 0x65E65F6BD25CL;
                    int n = _A.M();
                    try {
                        class_6342 = ym.m.method_1562();
                        if (n != 0) break block4;
                        if (class_6342 != null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw _W.a(jSONException);
                    }
                    return;
                }
                class_6342 = ym.m.method_1562();
            }
            String string = class_6342.method_52790();
            try {
                if (string == null || !_A.V.matcher(string).matches()) break block6;
            }
            catch (JSONException jSONException) {
                throw _W.a(jSONException);
            }
            _A _A2 = new _A();
            _A2.t(this);
            vz.r().f().Q(_A2);
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
