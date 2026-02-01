/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.G
 *  club.evon.J6
 *  club.evon.R
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.y8
 *  org.json.JSONException
 */
package club.evon;

import club.evon.G;
import club.evon.J6;
import club.evon.R;
import club.evon._J;
import club.evon.ds;
import club.evon.gQ;
import club.evon.y8;
import club.evon.yn;
import club.evon.yo;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zR {
    private final List<G> P = new ArrayList<G>();
    private G F = null;
    private G X = null;
    private final _J Z = new _J(200, 0.0, yn.DECELERATE);
    private final _J Y = new _J(200, 0.0, yn.DECELERATE);
    private static final int G;
    private static boolean B;
    private static final long a;

    public boolean f() {
        boolean bl;
        long l = a ^ 0x6F4D4AD324D3L;
        try {
            bl = this.F != null;
        }
        catch (JSONException jSONException) {
            throw zR.a(jSONException);
        }
        return bl;
    }

    public boolean S() {
        boolean bl;
        long l = a ^ 0x4A8222A88390L;
        try {
            bl = this.X != null;
        }
        catch (JSONException jSONException) {
            throw zR.a(jSONException);
        }
        return bl;
    }

    public void W(R r, float f, float f2) {
        long l = a ^ 0x67269301AB6BL;
        this.a();
        float f3 = r.H();
        float f4 = r.Q();
        float f5 = f3 / 2.0f;
        boolean bl = zR.N();
        float f6 = f4 / 2.0f;
        try {
            this.p(List.of(new G(yo.HORIZONTAL, f / 2.0f + f5 + 15.0f), new G(yo.HORIZONTAL, f / 2.0f - f5 - 15.0f), new G(yo.HORIZONTAL, f / 2.0f + f5), new G(yo.HORIZONTAL, f / 2.0f - f5), new G(yo.VERTICAL, f2 / 2.0f + f6 + 15.0f), new G(yo.VERTICAL, f2 / 2.0f - f6 - 15.0f), new G(yo.VERTICAL, f2 / 2.0f + f6), new G(yo.VERTICAL, f2 / 2.0f - f6), new G(yo.HORIZONTAL, f / 2.0f), new G(yo.VERTICAL, f2 / 2.0f)));
            if (bl) {
                gQ.o((gQ[])new gQ[4]);
            }
        }
        catch (JSONException jSONException) {
            throw zR.a(jSONException);
        }
    }

    public void a() {
        this.P.clear();
        this.F = null;
        this.X = null;
    }

    public void B(G g) {
        this.P.add(g);
    }

    public void p(List<G> list) {
        this.P.addAll(list);
    }

    public float G(float f, float f2) {
        block20: {
            G g;
            block19: {
                G g2;
                boolean bl;
                block15: {
                    long l = a ^ 0x4103AA9B04CEL;
                    float f3 = f + f2 / 2.0f;
                    float f4 = Float.MAX_VALUE;
                    bl = zR.N();
                    g2 = null;
                    for (G g3 : this.P) {
                        block16: {
                            float f5;
                            block18: {
                                float f6;
                                float f7;
                                block17: {
                                    try {
                                        g = g3;
                                        if (bl) break block15;
                                        if (g.f() != yo.HORIZONTAL) break block16;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zR.a(jSONException);
                                    }
                                    f7 = Math.abs(f3 - g3.A());
                                    try {
                                        try {
                                            try {
                                                float f8 = f7 - 10.0f;
                                                f6 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                                                if (bl) break block17;
                                                if (f6 > 0) break block16;
                                            }
                                            catch (JSONException jSONException) {
                                                throw zR.a(jSONException);
                                            }
                                            f5 = f7;
                                            if (bl) break block18;
                                        }
                                        catch (JSONException jSONException) {
                                            throw zR.a(jSONException);
                                        }
                                        float f9 = f5 - f4;
                                        f6 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                                    }
                                    catch (JSONException jSONException) {
                                        throw zR.a(jSONException);
                                    }
                                }
                                if (f6 >= 0) break block16;
                                f5 = f7;
                            }
                            f4 = f5;
                            g2 = g3;
                        }
                        if (!bl) continue;
                    }
                    g = g2;
                }
                try {
                    try {
                        if (bl) break block19;
                        if (g == null) break block20;
                    }
                    catch (JSONException jSONException) {
                        throw zR.a(jSONException);
                    }
                    this.F = g2;
                    g = g2;
                }
                catch (JSONException jSONException) {
                    throw zR.a(jSONException);
                }
            }
            return g.A() - f2 / 2.0f;
        }
        this.F = null;
        return f;
    }

    public float M(float f, float f2) {
        block20: {
            G g;
            block19: {
                G g2;
                boolean bl;
                block15: {
                    long l = a ^ 0x5342860706B6L;
                    float f3 = f + f2 / 2.0f;
                    bl = zR.Q();
                    float f4 = Float.MAX_VALUE;
                    g2 = null;
                    for (G g3 : this.P) {
                        block16: {
                            float f5;
                            block18: {
                                float f6;
                                float f7;
                                block17: {
                                    try {
                                        g = g3;
                                        if (!bl) break block15;
                                        if (g.f() != yo.VERTICAL) break block16;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zR.a(jSONException);
                                    }
                                    f7 = Math.abs(f3 - g3.A());
                                    try {
                                        try {
                                            try {
                                                float f8 = f7 - 10.0f;
                                                f6 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                                                if (!bl) break block17;
                                                if (f6 > 0) break block16;
                                            }
                                            catch (JSONException jSONException) {
                                                throw zR.a(jSONException);
                                            }
                                            f5 = f7;
                                            if (!bl) break block18;
                                        }
                                        catch (JSONException jSONException) {
                                            throw zR.a(jSONException);
                                        }
                                        float f9 = f5 - f4;
                                        f6 = f9 == 0.0f ? 0 : (f9 < 0.0f ? -1 : 1);
                                    }
                                    catch (JSONException jSONException) {
                                        throw zR.a(jSONException);
                                    }
                                }
                                if (f6 >= 0) break block16;
                                f5 = f7;
                            }
                            f4 = f5;
                            g2 = g3;
                        }
                        if (bl) continue;
                    }
                    g = g2;
                }
                try {
                    try {
                        if (!bl) break block19;
                        if (g == null) break block20;
                    }
                    catch (JSONException jSONException) {
                        throw zR.a(jSONException);
                    }
                    this.X = g2;
                    g = g2;
                }
                catch (JSONException jSONException) {
                    throw zR.a(jSONException);
                }
            }
            return g.A() - f2 / 2.0f;
        }
        this.X = null;
        return f;
    }

    public void q(int n, int n2, float f, float f2, float f3, float f4) {
        block63: {
            boolean bl;
            block65: {
                block64: {
                    float f5;
                    float f6;
                    boolean bl2;
                    boolean bl3;
                    boolean bl4;
                    boolean bl5;
                    boolean bl6;
                    Color color;
                    block60: {
                        boolean bl7;
                        block62: {
                            block61: {
                                block59: {
                                    block52: {
                                        float f7;
                                        block57: {
                                            block58: {
                                                block55: {
                                                    float f8;
                                                    float f9;
                                                    float f10;
                                                    block53: {
                                                        block54: {
                                                            G g;
                                                            block51: {
                                                                block43: {
                                                                    block44: {
                                                                        float f11;
                                                                        block49: {
                                                                            block50: {
                                                                                block47: {
                                                                                    float f12;
                                                                                    block45: {
                                                                                        block46: {
                                                                                            long l = a ^ 0x1C8815B42F09L;
                                                                                            Color color2 = new Color(204, 204, 204);
                                                                                            color = J6.N((Color)color2, (double)0.4f);
                                                                                            float f13 = 1.0f;
                                                                                            bl6 = false;
                                                                                            bl5 = zR.Q();
                                                                                            bl4 = false;
                                                                                            bl3 = false;
                                                                                            bl2 = false;
                                                                                            f6 = f;
                                                                                            f5 = f2;
                                                                                            try {
                                                                                                g = this.F;
                                                                                                if (!bl5) break block43;
                                                                                                if (g == null) break block44;
                                                                                            }
                                                                                            catch (JSONException jSONException) {
                                                                                                throw zR.a(jSONException);
                                                                                            }
                                                                                            f10 = this.F.A();
                                                                                            try {
                                                                                                float f14 = Math.abs(f10 - (float)n / 2.0f) - 1.0f;
                                                                                                f12 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                                                                                if (!bl5) break block45;
                                                                                                if (f12 >= 0) break block46;
                                                                                            }
                                                                                            catch (JSONException jSONException) {
                                                                                                throw zR.a(jSONException);
                                                                                            }
                                                                                            f12 = 1.0f;
                                                                                            break block45;
                                                                                        }
                                                                                        f12 = 0.0f;
                                                                                    }
                                                                                    f9 = f12;
                                                                                    try {
                                                                                        float f15;
                                                                                        block48: {
                                                                                            try {
                                                                                                try {
                                                                                                    f11 = f9;
                                                                                                    if (!bl5) break block47;
                                                                                                    if (f11 == false) break block48;
                                                                                                }
                                                                                                catch (JSONException jSONException) {
                                                                                                    throw zR.a(jSONException);
                                                                                                }
                                                                                                y8.F((float)(f10 - 1.0f), (float)0.0f, (float)1.0f, (float)n2, (int)color.getRGB());
                                                                                                if (bl5) break block44;
                                                                                            }
                                                                                            catch (JSONException jSONException) {
                                                                                                throw zR.a(jSONException);
                                                                                            }
                                                                                        }
                                                                                        f11 = (f15 = f10 - (float)n / 2.0f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                                                                    }
                                                                                    catch (JSONException jSONException) {
                                                                                        throw zR.a(jSONException);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    if (!bl5) break block49;
                                                                                    if (f11 < 0) break block50;
                                                                                }
                                                                                catch (JSONException jSONException) {
                                                                                    throw zR.a(jSONException);
                                                                                }
                                                                                f6 = f10 - f3 / 2.0f;
                                                                                bl6 = true;
                                                                                if (bl5) break block44;
                                                                            }
                                                                            f6 = f10 - f3 / 2.0f;
                                                                            f11 = 1.0f;
                                                                        }
                                                                        bl4 = f11;
                                                                    }
                                                                    g = this.X;
                                                                }
                                                                try {
                                                                    try {
                                                                        if (!bl5) break block51;
                                                                        if (g == null) break block52;
                                                                    }
                                                                    catch (JSONException jSONException) {
                                                                        throw zR.a(jSONException);
                                                                    }
                                                                    g = this.X;
                                                                }
                                                                catch (JSONException jSONException) {
                                                                    throw zR.a(jSONException);
                                                                }
                                                            }
                                                            f10 = g.A();
                                                            try {
                                                                float f16 = Math.abs(f10 - (float)n2 / 2.0f) - 1.0f;
                                                                f8 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                                                if (!bl5) break block53;
                                                                if (f8 >= 0) break block54;
                                                            }
                                                            catch (JSONException jSONException) {
                                                                throw zR.a(jSONException);
                                                            }
                                                            f8 = 1.0f;
                                                            break block53;
                                                        }
                                                        f8 = 0.0f;
                                                    }
                                                    f9 = f8;
                                                    try {
                                                        float f17;
                                                        block56: {
                                                            try {
                                                                try {
                                                                    f7 = f9;
                                                                    if (!bl5) break block55;
                                                                    if (f7 == false) break block56;
                                                                }
                                                                catch (JSONException jSONException) {
                                                                    throw zR.a(jSONException);
                                                                }
                                                                y8.F((float)0.0f, (float)(f10 - 0.5f), (float)n, (float)1.0f, (int)color.getRGB());
                                                                if (bl5) break block52;
                                                            }
                                                            catch (JSONException jSONException) {
                                                                throw zR.a(jSONException);
                                                            }
                                                        }
                                                        f7 = (f17 = f10 - (float)n2 / 2.0f) == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw zR.a(jSONException);
                                                    }
                                                }
                                                try {
                                                    if (!bl5) break block57;
                                                    if (f7 < 0) break block58;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw zR.a(jSONException);
                                                }
                                                bl3 = true;
                                                if (bl5) break block52;
                                            }
                                            f5 += 0.0f;
                                            f7 = 1.0f;
                                        }
                                        bl2 = f7;
                                    }
                                    try {
                                        bl7 = bl3;
                                        if (!bl5) break block59;
                                        if (bl7) break block60;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zR.a(jSONException);
                                    }
                                    bl7 = bl2;
                                }
                                try {
                                    if (!bl5) break block61;
                                    if (bl7) break block60;
                                }
                                catch (JSONException jSONException) {
                                    throw zR.a(jSONException);
                                }
                                bl7 = bl6;
                            }
                            try {
                                if (!bl5) break block62;
                                if (bl7) break block60;
                            }
                            catch (JSONException jSONException) {
                                throw zR.a(jSONException);
                            }
                            bl7 = bl4;
                        }
                        if (!bl7) {
                            return;
                        }
                    }
                    try {
                        try {
                            y8.Y((float)f6, (float)f5, (float)f3, (float)f4, (float)1.0f, (int)color.getRGB(), (boolean)bl3, (boolean)bl2, (boolean)bl6, (boolean)bl4);
                            if (gQ.q() != null) break block63;
                            if (!bl5) break block64;
                        }
                        catch (JSONException jSONException) {
                            throw zR.a(jSONException);
                        }
                        bl = false;
                        break block65;
                    }
                    catch (JSONException jSONException) {
                        throw zR.a(jSONException);
                    }
                }
                bl = true;
            }
            zR.W(bl);
        }
    }

    public _J V() {
        return this.Z;
    }

    public _J N() {
        return this.Y;
    }

    public static void W(boolean bl) {
        B = bl;
    }

    public static boolean N() {
        return B;
    }

    public static boolean Q() {
        boolean bl = zR.N();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (JSONException jSONException) {
            throw zR.a(jSONException);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = ds.a((long)1943702086962889459L, (long)9099558297037298444L, MethodHandles.lookup().lookupClass()).a(85040886356169L);
        long l = a ^ 0x72AE462BDC98L;
        zR.W(false);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 5600156737998839203L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                G = (int)l3;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
