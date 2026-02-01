/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.J6
 *  club.evon.ds
 *  club.evon.gy
 *  club.evon.t
 *  club.evon.y8
 *  org.json.JSONException
 */
package club.evon;

import club.evon.J6;
import club.evon._J;
import club.evon._b;
import club.evon._h;
import club.evon.ds;
import club.evon.gy;
import club.evon.t;
import club.evon.y8;
import club.evon.yn;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _7
extends _h<t> {
    private final _J t;
    private static final int l;
    private static final int R;
    private static final float k = 4.5f;
    private static final long b;

    public _7(t t2) {
        long l = b ^ 0x715AC55F7C38L;
        this.t = new _J(200, t2.I() != false ? 1.0 : 0.0, yn.LINEAR);
    }

    public void l(int n, int n2) {
        float f;
        float f2;
        float f3;
        float f4;
        block12: {
            block13: {
                Color color;
                Color color2;
                block15: {
                    block14: {
                        double d;
                        Color color3;
                        float f5;
                        float f6;
                        float f7;
                        float f8;
                        float f9;
                        double d2;
                        _J _J2;
                        long l = b ^ 0x202B58F2BF2FL;
                        super.l(n, n2);
                        float f10 = this.j();
                        Object b = _b.c();
                        float f11 = this.F();
                        float f12 = this.L();
                        float f13 = this.m();
                        t t2 = (t)this.d();
                        boolean bl = t2.I();
                        try {
                            _J2 = this.t;
                            d2 = bl ? 1.0 : 0.0;
                        }
                        catch (JSONException jSONException) {
                            throw _7.a(jSONException);
                        }
                        _J2.N(d2);
                        f4 = this.t.y().floatValue();
                        float f14 = (f13 - 9.0f) / 2.0f;
                        f3 = f10 + f12 - 22.5f;
                        f2 = f11 + f14;
                        try {
                            f9 = f3;
                            f8 = f2;
                            f7 = 18.0f;
                            f6 = 9.0f;
                            f5 = 4.5f;
                            color3 = Color.WHITE;
                            d = !this.a(n, n2) ? (double)0.1f : (double)0.15f;
                        }
                        catch (JSONException jSONException) {
                            throw _7.a(jSONException);
                        }
                        try {
                            try {
                                try {
                                    y8.Z((float)f9, (float)f8, (float)f7, (float)f6, (float)f5, (Color)J6.N((Color)color3, (double)d));
                                    f = f4;
                                    if (b != false) break block12;
                                    if (f == 0.0f) break block13;
                                }
                                catch (JSONException jSONException) {
                                    throw _7.a(jSONException);
                                }
                                if (f4 != 1.0f) break block14;
                            }
                            catch (JSONException jSONException) {
                                throw _7.a(jSONException);
                            }
                            color2 = gy.d();
                            break block15;
                        }
                        catch (JSONException jSONException) {
                            throw _7.a(jSONException);
                        }
                    }
                    color2 = J6.N((Color)gy.d(), (double)f4);
                }
                Color color4 = color2;
                try {
                    color = f4 == 1.0f ? gy.T() : J6.N((Color)gy.T(), (double)f4);
                }
                catch (JSONException jSONException) {
                    throw _7.a(jSONException);
                }
                Color color5 = color;
                y8.p((float)f3, (float)f2, (float)18.0f, (float)9.0f, (float)4.5f, (Color)color4, (Color)color5);
            }
            f = 4.5f;
        }
        float f15 = f;
        float f16 = 2.25f;
        y8.Z((float)(f3 + 2.25f + 9.0f * f4), (float)(f2 + 2.25f), (float)4.5f, (float)4.5f, (float)2.25f, (Color)Color.WHITE);
    }

    public void W(double d, double d2, int n) {
        boolean bl;
        t t2;
        block5: {
            block6: {
                long l = b ^ 0x2D92F8BDC96CL;
                int n2 = _b.V();
                try {
                    if (n != 0) {
                        return;
                    }
                }
                catch (JSONException jSONException) {
                    throw _7.a(jSONException);
                }
                t t3 = (t)this.d();
                try {
                    t2 = t3;
                    bl = t3.I();
                    if (n2 == 0) break block5;
                    if (bl) break block6;
                }
                catch (JSONException jSONException) {
                    throw _7.a(jSONException);
                }
                bl = true;
                break block5;
            }
            bl = false;
        }
        t2.P((Object)bl);
    }

    protected Color Y() {
        Color color;
        block8: {
            float f;
            int n;
            int n2;
            int n3;
            float f2;
            block6: {
                block7: {
                    long l = b ^ 0x40C015FA2561L;
                    f2 = this.t.y().floatValue();
                    Object b = _b.c();
                    Color color2 = super.Y();
                    n3 = color2.getRed();
                    n2 = color2.getGreen();
                    n = color2.getBlue();
                    try {
                        try {
                            float f3 = f2 - 0.0f;
                            f = f3 == 0.0f ? 0 : (f3 > 0.0f ? 1 : -1);
                            if (b != false) break block6;
                            if (f != false) break block7;
                        }
                        catch (JSONException jSONException) {
                            throw _7.a(jSONException);
                        }
                        color = color2;
                        break block8;
                    }
                    catch (JSONException jSONException) {
                        throw _7.a(jSONException);
                    }
                }
                float f4 = f2 - 1.0f;
                f = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
            }
            try {
                color = f == false ? Color.WHITE : new Color((int)((float)n3 + (float)(255 - n3) * f2), (int)((float)n2 + (float)(255 - n2) * f2), (int)((float)n + (float)(255 - n) * f2));
            }
            catch (JSONException jSONException) {
                throw _7.a(jSONException);
            }
        }
        return color;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = ds.a((long)-107387567328905744L, (long)9117640952729115700L, MethodHandles.lookup().lookupClass()).a(52277748006280L);
        long l = b ^ 0x70B4215E72ADL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "[\u00b7\u001dv\u008b\u00afSlS\u00b2m\u00ae\u0097Y\u008bU";
        int n2 = "[\u00b7\u001dv\u008b\u00afSlS\u00b2m\u00ae\u0097Y\u008bU".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        R = (int)lArray[1];
        _7.l = (int)lArray[0];
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
