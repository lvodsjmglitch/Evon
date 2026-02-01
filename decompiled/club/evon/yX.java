/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.A
 *  club.evon.J6
 *  club.evon.JK
 *  club.evon.d
 *  club.evon.ds
 *  club.evon.e
 *  club.evon.gQ
 *  club.evon.gy
 *  club.evon.vJ
 *  club.evon.y8
 *  org.json.JSONException
 *  org.lwjgl.nanovg.NVGPaint
 */
package club.evon;

import club.evon.A;
import club.evon.J6;
import club.evon.JK;
import club.evon._S;
import club.evon.d;
import club.evon.ds;
import club.evon.e;
import club.evon.gQ;
import club.evon.gy;
import club.evon.vJ;
import club.evon.y8;
import club.evon.ym;
import club.evon.z7;
import club.evon.zv;
import club.evon.zx;
import club.evon.zy;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.lwjgl.nanovg.NVGPaint;

public final class yX
extends vJ<gy> {
    private static final zv N;
    private static final z7 u;
    private static final String Z;
    private static final int X;
    private static final int I;
    private static final int e;
    private static final float V = 3.5f;
    private static final float d = 6.5f;
    private static final float k = 0.6f;
    private static final float S = 1.2f;
    private static final float M = 12.5f;
    private static final float f = 1.1f;
    private static final float o = 12.95f;
    private static final Color m;
    private static final Color g;
    private static final Color b;
    private static final Color w;
    private static final Color B;
    private static final String U;
    private static final String q;
    private static final String K;
    private static final String G;
    private final JK c = zy.p().J();
    private float r;
    private float l;
    private float O;
    private static final long h;
    private static final String[] i;

    public yX(String string, gy gy2) {
        super(string, (gQ)gy2);
    }

    @_S(h=-20)
    private void n(e e2) {
        block4: {
            block5: {
                long l = h ^ 0x17E975B68CDEL;
                gQ[] gQArray = club.evon.d.j();
                try {
                    try {
                        if (gQArray == null) break block4;
                        if (!ym.m.field_1690.field_1842) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yX.a(jSONException);
                    }
                    return;
                }
                catch (JSONException jSONException) {
                    throw yX.a(jSONException);
                }
            }
            y8.j();
            y8.B((float)10.0f, (float)10.0f);
        }
        float f = gy.v();
        y8.s((float)f, (float)f);
        this.l = u.y(Z, 15.0f);
        this.O = Math.max(u.y(U, 8.0f), u.y(q, 7.0f));
        float f2 = Math.max(u.y(K, 8.0f), u.y(G, 7.0f));
        this.r = 6.5f + this.l + 3.5f + 9.2f + this.O + 3.5f - 0.5f + f2 + 3.5f + 6.5f;
        y8.v((float)-0.90000004f, (float)-0.90000004f, (float)(this.r + 1.8000001f), (float)26.8f, (float)12.95f, (Color)Color.BLACK);
        y8.g();
    }

    @_S(h=-20)
    private void t(zx zx2) {
        block4: {
            block5: {
                long l = h ^ 0x65A60F8363D4L;
                gQ[] gQArray = club.evon.d.j();
                try {
                    try {
                        if (gQArray == null) break block4;
                        if (!ym.m.field_1690.field_1842) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yX.a(jSONException);
                    }
                    return;
                }
                catch (JSONException jSONException) {
                    throw yX.a(jSONException);
                }
            }
            y8.j();
            y8.B((float)10.0f, (float)10.0f);
        }
        float f = gy.v();
        y8.s((float)f, (float)f);
        float f2 = 6.5f;
        y8.r((float)-0.90000004f, (float)-0.90000004f, (float)(this.r + 1.8000001f), (float)26.8f, (float)12.95f, (NVGPaint)y8.o);
        y8.Z((float)0.0f, (float)0.0f, (float)this.r, (float)25.0f, (float)12.5f, (Color)w);
        y8.s((float)-0.6f, (float)-0.6f, (float)(this.r + 1.2f), (float)26.2f, (float)12.95f, (float)1.2f, (Color)b);
        Color color = gy.d();
        Color color2 = gy.T();
        String[] stringArray = i;
        this.c.x(stringArray[3], A.BOLD, Z, f2, (25.0f - u.i(stringArray[2], 15.0f)) / 2.0f, 15.0f, color.getRGB(), color2.getRGB(), false, 0.0f, 9);
        float f3 = 6.5f;
        float f4 = 7.0f;
        y8.Z((float)(f2 += this.l + 3.5f), (float)7.0f, (float)1.1f, (float)12.0f, (float)0.55f, (Color)B);
        u.U(U, f2 += 4.6f, 6.0f, 8.0f, g.getRGB());
        float f5 = 6.0f + u.i(stringArray[4], 8.0f);
        u.U(q, f2, f5, 7.0f, m.getRGB());
        y8.Z((float)(f2 += this.O + 3.5f - 0.5f), (float)7.0f, (float)1.1f, (float)12.0f, (float)0.55f, (Color)B);
        u.U(K, f2 += 4.6f, 6.0f, 8.0f, g.getRGB());
        u.U(G, f2, f5 - 0.5f, 7.5f, m.getRGB());
        y8.g();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        yX.h = ds.a((long)-5316721832258699907L, (long)-3413521646814513407L, MethodHandles.lookup().lookupClass()).a(182212660173617L);
                        var11 = yX.h ^ 80733733596515L;
                        var13_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_3 = 1; var14_3 < 8; ++var14_3) {
                            v2 = v2;
                            v2[var14_3] = (byte)(var11 << var14_3 * 8 >>> 56);
                        }
                        var13_2.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_4 = new String[7];
                        var18_5 = 0;
                        var17_6 = "\u00af\u00c3\u00874\u00fb\u0084\u00a2'\u0010\u0083\u008d\u00b4\u009f\u001e\u00c4Gx:\u00b3\u00f2\u0081\u001d\u00eb\u00ee\u00fe\b\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e\b\u009c\u00d7\f\\-\u00e1\u008c\u007f\b\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e";
                        var19_7 = "\u00af\u00c3\u00874\u00fb\u0084\u00a2'\u0010\u0083\u008d\u00b4\u009f\u001e\u00c4Gx:\u00b3\u00f2\u0081\u001d\u00eb\u00ee\u00fe\b\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e\b\u009c\u00d7\f\\-\u00e1\u008c\u007f\b\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e".length();
                        var16_8 = 8;
                        var15_9 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_9;
                            v4 = var17_6.substring(v3, v3 + var16_8);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var20_4[var18_5++] = yX.a(var21_10).intern();
                            if ((var15_9 += var16_8) < var19_7) {
                                var16_8 = var17_6.charAt(var15_9);
                                ** continue;
                            }
                            var17_6 = "\u008e@i\u00ea.\u0092\u0006\u0018\u0010oH\u00bcq\u00f8~?+\u00eaK\u00f9A\u008dy.*";
                            var19_7 = "\u008e@i\u00ea.\u0092\u0006\u0018\u0010oH\u00bcq\u00f8~?+\u00eaK\u00f9A\u008dy.*".length();
                            var16_8 = 8;
                            var15_9 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_9;
                                v4 = var17_6.substring(v6, v6 + var16_8);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var20_4[var18_5++] = yX.a(var21_10).intern();
                            if ((var15_9 += var16_8) < var19_7) {
                                var16_8 = var17_6.charAt(var15_9);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_10 = var13_2.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl50:
                        // 1 sources

                        ** continue;
                    }
                }
                yX.i = var20_4;
                var1_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var2_12 = 1; var2_12 < 8; ++var2_12) {
                    v9 = v9;
                    v9[var2_12] = (byte)(var11 << var2_12 * 8 >>> 56);
                }
                var1_11.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_13 = new long[2];
                var4_14 = 0;
                var5_15 = "G\u00ea\u00a2\u0013?Bv\u00e3]\u000bG;\u0001\u00aa`\u009e";
                var6_16 = "G\u00ea\u00a2\u0013?Bv\u00e3]\u000bG;\u0001\u00aa`\u009e".length();
                var3_17 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl70:
                // 1 sources

                while (true) {
                    var0_13[v10] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var3_17 < var6_16) ** continue;
                    break block16;
                    break;
                }
            }
            var7_18 = var5_15.substring(var3_17, var3_17 += 8).getBytes("ISO-8859-1");
            v10 = var4_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var1_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        yX.e = (int)var0_13[0];
        yX.I = (int)var0_13[0];
        yX.X = (int)var0_13[1];
        yX.N = zy.p().s();
        var11_1 = yX.i;
        yX.u = yX.N.a(var11_1[1]);
        yX.Z = var11_1[5].toLowerCase();
        yX.m = J6.N((Color)Color.WHITE, (double)0.44999998807907104);
        yX.g = J6.N((Color)Color.WHITE, (double)0.8999999761581421);
        yX.b = J6.N((Color)Color.WHITE, (double)0.05000000074505806);
        yX.w = J6.N((Color)new Color(35, 35, 35), (double)0.30000001192092896);
        yX.B = J6.N((Color)Color.WHITE, (double)0.44999998807907104);
        yX.U = zy.g().r();
        yX.q = zy.g().R();
        yX.K = var11_1[0].toLowerCase() + var11_1[6];
        yX.G = zy.g().M().toString().toLowerCase();
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}
