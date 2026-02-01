/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.mixins.KeyBindingAccessor
 *  net.minecraft.class_304
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ds;
import club.evon.gQ;
import club.evon.mixins.KeyBindingAccessor;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_304;
import org.json.JSONException;

public final class _6 {
    private final class_304 x;
    private boolean c;
    private boolean g;
    private int T;
    private boolean J = true;
    private static int p;
    private static final long a;

    public _6(class_304 class_3042) {
        this.x = class_3042;
    }

    public void V() {
        long l = a ^ 0x2A0E36D93E90L;
        this.c = false;
        this.T = 0;
        int n = _6.X();
        try {
            this.g = true;
            if (gQ.q() == null) {
                _6.b(++n);
            }
        }
        catch (JSONException jSONException) {
            throw _6.a(jSONException);
        }
    }

    public void l() {
        this.Q(true, 0);
    }

    public void Q(boolean bl, int n) {
        this.c = bl;
        this.T = n;
    }

    public boolean e() {
        boolean bl;
        block16: {
            block18: {
                block17: {
                    boolean bl2;
                    int n;
                    block14: {
                        block15: {
                            boolean bl3;
                            block12: {
                                block13: {
                                    long l = a ^ 0x3527AA73F2B0L;
                                    n = _6.Q();
                                    try {
                                        try {
                                            bl3 = this.g;
                                            if (n == 0) break block12;
                                            if (!bl3) break block13;
                                        }
                                        catch (JSONException jSONException) {
                                            throw _6.a(jSONException);
                                        }
                                        return false;
                                    }
                                    catch (JSONException jSONException) {
                                        throw _6.a(jSONException);
                                    }
                                }
                                bl3 = false;
                            }
                            bl2 = bl3;
                            try {
                                bl = this.c;
                                if (n == 0) break block14;
                                if (!bl) break block15;
                            }
                            catch (JSONException jSONException) {
                                throw _6.a(jSONException);
                            }
                            bl2 = true;
                            this.c = false;
                        }
                        bl = this.x.method_1436();
                    }
                    try {
                        try {
                            try {
                                if (n == 0) break block16;
                                if (bl) break block17;
                            }
                            catch (JSONException jSONException) {
                                throw _6.a(jSONException);
                            }
                            bl = bl2;
                            if (n == 0) break block16;
                        }
                        catch (JSONException jSONException) {
                            throw _6.a(jSONException);
                        }
                        if (!bl) break block18;
                    }
                    catch (JSONException jSONException) {
                        throw _6.a(jSONException);
                    }
                }
                bl = true;
                break block16;
            }
            bl = false;
        }
        return bl;
    }

    public boolean O() {
        int n;
        block16: {
            block18: {
                block17: {
                    int n2;
                    block14: {
                        block15: {
                            long l = a ^ 0x286F80EB11B9L;
                            n2 = _6.Q();
                            try {
                                try {
                                    n = this.g;
                                    if (n2 == 0) break block14;
                                    if (n == 0) break block15;
                                }
                                catch (JSONException jSONException) {
                                    throw _6.a(jSONException);
                                }
                                return false;
                            }
                            catch (JSONException jSONException) {
                                throw _6.a(jSONException);
                            }
                        }
                        n = this.x.method_1434();
                    }
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        if (n2 == 0) break block16;
                                        if (n != 0) break block17;
                                    }
                                    catch (JSONException jSONException) {
                                        throw _6.a(jSONException);
                                    }
                                    n = this.c;
                                    if (n2 == 0) break block16;
                                }
                                catch (JSONException jSONException) {
                                    throw _6.a(jSONException);
                                }
                                if (n != 0) break block17;
                            }
                            catch (JSONException jSONException) {
                                throw _6.a(jSONException);
                            }
                            n = this.T;
                            if (n2 == 0) break block16;
                        }
                        catch (JSONException jSONException) {
                            throw _6.a(jSONException);
                        }
                        if (n <= 0) break block18;
                    }
                    catch (JSONException jSONException) {
                        throw _6.a(jSONException);
                    }
                }
                n = 1;
                break block16;
            }
            n = 0;
        }
        return n != 0;
    }

    public boolean d() {
        return this.c;
    }

    public void r() {
        int n;
        block20: {
            _6 _62;
            block21: {
                block18: {
                    _6 _63;
                    int n2;
                    block16: {
                        long l = a ^ 0x526B5A0269ADL;
                        n = _6.Q();
                        try {
                            try {
                                n2 = this.T--;
                                if (n == 0) break block16;
                                if (n2 > 0) {
                                    // empty if block
                                }
                            }
                            catch (JSONException jSONException) {
                                throw _6.a(jSONException);
                            }
                        }
                        catch (JSONException jSONException) {
                            throw _6.a(jSONException);
                        }
                        try {
                            _63 = this;
                            if (n == 0) break block18;
                            n2 = _63.x.method_1434() ? 1 : 0;
                        }
                        catch (JSONException jSONException) {
                            throw _6.a(jSONException);
                        }
                    }
                    try {
                        block19: {
                            try {
                                try {
                                    if (n2 != 0) break block19;
                                    _62 = this;
                                    if (n == 0) break block20;
                                }
                                catch (JSONException jSONException) {
                                    throw _6.a(jSONException);
                                }
                                if (_62.T != 0) break block21;
                            }
                            catch (JSONException jSONException) {
                                throw _6.a(jSONException);
                            }
                        }
                        _63 = this;
                    }
                    catch (JSONException jSONException) {
                        throw _6.a(jSONException);
                    }
                }
                _63.J = true;
            }
            this.c = false;
            _62 = this;
        }
        try {
            _62.g = false;
            if (n == 0) {
                gQ.o((gQ[])new gQ[4]);
            }
        }
        catch (JSONException jSONException) {
            throw _6.a(jSONException);
        }
    }

    public int n() {
        return this.T;
    }

    public boolean b() {
        return this.g;
    }

    public boolean M() {
        int n;
        block6: {
            block8: {
                block7: {
                    long l = a ^ 0x478E79C018F1L;
                    int n2 = _6.X();
                    try {
                        try {
                            try {
                                n = this.J;
                                if (n2 != 0) break block6;
                                if (n != 0) break block7;
                            }
                            catch (JSONException jSONException) {
                                throw _6.a(jSONException);
                            }
                            n = ((KeyBindingAccessor)this.x).getTimesPressed();
                            if (n2 != 0) break block6;
                        }
                        catch (JSONException jSONException) {
                            throw _6.a(jSONException);
                        }
                        if (n <= 0) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw _6.a(jSONException);
                    }
                }
                n = 1;
                break block6;
            }
            n = 0;
        }
        return n != 0;
    }

    public void i(boolean bl) {
        this.J = bl;
    }

    public class_304 L() {
        return this.x;
    }

    public static void b(int n) {
        p = n;
    }

    public static int Q() {
        return p;
    }

    public static int X() {
        int n = _6.Q();
        try {
            if (n == 0) {
                return 123;
            }
        }
        catch (JSONException jSONException) {
            throw _6.a(jSONException);
        }
        return 0;
    }

    static {
        a = ds.a((long)-852647286984373716L, (long)-5868646223759761421L, MethodHandles.lookup().lookupClass()).a(107938235820726L);
        if (_6.Q() == 0) {
            _6.b(34);
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
