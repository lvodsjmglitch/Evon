/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.mixins.KeyBindingAccessor
 *  net.minecraft.class_304
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.mixins.KeyBindingAccessor;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_304;
import org.json.JSONException;

public final class KeyBindingWrapper {
    private final class_304 x;
    private boolean StaticEventBus;
    private boolean g;
    private int Category;
    private boolean J = true;
    private static int p;
    private static final long FontWeight;

    public _6(class_304 class_3042) {
        this.x = class_3042;
    }

    public void V() {
        long l = FontWeight ^ 0x2A0E36D93E90L;
        this.StaticEventBus = false;
        this.Category = 0;
        int n = _6.X();
        try {
            this.g = true;
            if (Module.q() == null) {
                _6.Property(++n);
            }
        }
        catch (JSONException jSONException) {
            throw _6.FontWeight(jSONException);
        }
    }

    public void l() {
        this.Q(true, 0);
    }

    public void Q(boolean bl, int n) {
        this.StaticEventBus = bl;
        this.Category = n;
    }

    public boolean RenderEvent() {
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
                                    long l = FontWeight ^ 0x3527AA73F2B0L;
                                    n = _6.Q();
                                    try {
                                        try {
                                            bl3 = this.g;
                                            if (n == 0) break block12;
                                            if (!bl3) break block13;
                                        }
                                        catch (JSONException jSONException) {
                                            throw _6.FontWeight(jSONException);
                                        }
                                        return false;
                                    }
                                    catch (JSONException jSONException) {
                                        throw _6.FontWeight(jSONException);
                                    }
                                }
                                bl3 = false;
                            }
                            bl2 = bl3;
                            try {
                                bl = this.StaticEventBus;
                                if (n == 0) break block14;
                                if (!bl) break block15;
                            }
                            catch (JSONException jSONException) {
                                throw _6.FontWeight(jSONException);
                            }
                            bl2 = true;
                            this.StaticEventBus = false;
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
                                throw _6.FontWeight(jSONException);
                            }
                            bl = bl2;
                            if (n == 0) break block16;
                        }
                        catch (JSONException jSONException) {
                            throw _6.FontWeight(jSONException);
                        }
                        if (!bl) break block18;
                    }
                    catch (JSONException jSONException) {
                        throw _6.FontWeight(jSONException);
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
                            long l = FontWeight ^ 0x286F80EB11B9L;
                            n2 = _6.Q();
                            try {
                                try {
                                    n = this.g;
                                    if (n2 == 0) break block14;
                                    if (n == 0) break block15;
                                }
                                catch (JSONException jSONException) {
                                    throw _6.FontWeight(jSONException);
                                }
                                return false;
                            }
                            catch (JSONException jSONException) {
                                throw _6.FontWeight(jSONException);
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
                                        throw _6.FontWeight(jSONException);
                                    }
                                    n = this.StaticEventBus;
                                    if (n2 == 0) break block16;
                                }
                                catch (JSONException jSONException) {
                                    throw _6.FontWeight(jSONException);
                                }
                                if (n != 0) break block17;
                            }
                            catch (JSONException jSONException) {
                                throw _6.FontWeight(jSONException);
                            }
                            n = this.Category;
                            if (n2 == 0) break block16;
                        }
                        catch (JSONException jSONException) {
                            throw _6.FontWeight(jSONException);
                        }
                        if (n <= 0) break block18;
                    }
                    catch (JSONException jSONException) {
                        throw _6.FontWeight(jSONException);
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
        return this.StaticEventBus;
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
                        long l = FontWeight ^ 0x526B5A0269ADL;
                        n = _6.Q();
                        try {
                            try {
                                n2 = this.Category--;
                                if (n == 0) break block16;
                                if (n2 > 0) {
                                    // empty if block
                                }
                            }
                            catch (JSONException jSONException) {
                                throw _6.FontWeight(jSONException);
                            }
                        }
                        catch (JSONException jSONException) {
                            throw _6.FontWeight(jSONException);
                        }
                        try {
                            _63 = this;
                            if (n == 0) break block18;
                            n2 = _63.x.method_1434() ? 1 : 0;
                        }
                        catch (JSONException jSONException) {
                            throw _6.FontWeight(jSONException);
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
                                    throw _6.FontWeight(jSONException);
                                }
                                if (_62.Category != 0) break block21;
                            }
                            catch (JSONException jSONException) {
                                throw _6.FontWeight(jSONException);
                            }
                        }
                        _63 = this;
                    }
                    catch (JSONException jSONException) {
                        throw _6.FontWeight(jSONException);
                    }
                }
                _63.J = true;
            }
            this.StaticEventBus = false;
            _62 = this;
        }
        try {
            _62.g = false;
            if (n == 0) {
                Module.o((Module[])new Module[4]);
            }
        }
        catch (JSONException jSONException) {
            throw _6.FontWeight(jSONException);
        }
    }

    public int n() {
        return this.Category;
    }

    public boolean Property() {
        return this.g;
    }

    public boolean M() {
        int n;
        block6: {
            block8: {
                block7: {
                    long l = FontWeight ^ 0x478E79C018F1L;
                    int n2 = _6.X();
                    try {
                        try {
                            try {
                                n = this.J;
                                if (n2 != 0) break block6;
                                if (n != 0) break block7;
                            }
                            catch (JSONException jSONException) {
                                throw _6.FontWeight(jSONException);
                            }
                            n = ((KeyBindingAccessor)this.x).getTimesPressed();
                            if (n2 != 0) break block6;
                        }
                        catch (JSONException jSONException) {
                            throw _6.FontWeight(jSONException);
                        }
                        if (n <= 0) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw _6.FontWeight(jSONException);
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

    public static void Property(int n) {
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
            throw _6.FontWeight(jSONException);
        }
        return 0;
    }

    static {
        FontWeight = ObfuscationHelper.FontWeight((long)-852647286984373716L, (long)-5868646223759761421L, MethodHandles.lookup().lookupClass()).FontWeight(107938235820726L);
        if (_6.Q() == 0) {
            _6.Property(34);
        }
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
