/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.J6
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.y8
 *  club.evon.yH
 *  club.evon.yg
 *  org.json.JSONException
 */
package club.evon;

import club.evon.J6;
import club.evon._J;
import club.evon.ds;
import club.evon.gQ;
import club.evon.y8;
import club.evon.yH;
import club.evon.yO;
import club.evon.yg;
import club.evon.yn;
import club.evon.z7;
import club.evon.zy;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.UUID;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public class zN {
    private float U;
    private float o;
    private final float N;
    private final float J;
    private final float F;
    private final _J K = new _J(200, 0.0, yn.LINEAR);
    private final _J u = new _J(100, 0.0, yn.LINEAR);
    private static final Color R;
    private final String z;
    private final String p;
    private final UUID M;
    private final yg x;
    private static final long a;
    private static final String[] b;

    public zN(String string, String string2, UUID uUID, yg yg2, float f, float f2, float f3) {
        this.z = string;
        this.p = string2;
        this.M = uUID;
        this.x = yg2;
        this.N = f;
        this.J = f2;
        this.F = f3;
        this.u.N(0.0);
    }

    public void m(float f, float f2, double d, double d2) {
        String[] stringArray;
        Color color;
        String string;
        float f3;
        block18: {
            Color color2;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            block17: {
                Color color3;
                double d3;
                String string2;
                block16: {
                    Object object;
                    block14: {
                        block15: {
                            double d4;
                            _J _J2;
                            block12: {
                                block13: {
                                    long l = a ^ 0x22B40BB27D2L;
                                    String string3 = yH.v();
                                    this.U = f;
                                    this.o = f2;
                                    this.u.l(800);
                                    this.u.N(1.0);
                                    string2 = string3;
                                    f3 = this.u.y().floatValue();
                                    try {
                                        try {
                                            _J2 = this.K;
                                            d4 = d;
                                            if (string2 != null) break block12;
                                            if (!yO.J(d4, d2, f, f2, this.N, this.J)) break block13;
                                        }
                                        catch (JSONException jSONException) {
                                            throw zN.a(jSONException);
                                        }
                                        d4 = 1.0;
                                        break block12;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zN.a(jSONException);
                                    }
                                }
                                d4 = 0.0;
                            }
                            _J2.N(d4);
                            d3 = this.K.y();
                            string = zy.p().Y().L(this.z);
                            color3 = new Color(255, 80, 80);
                            color = new Color(255, 168, 168, (int)(255.0f * f3));
                            try {
                                object = string;
                                if (string2 != null) break block14;
                                if (object != null) break block15;
                            }
                            catch (JSONException jSONException) {
                                throw zN.a(jSONException);
                            }
                            stringArray = b;
                            string = stringArray[1];
                            color = color3 = new Color(168, 255, 168, (int)(255.0f * f3));
                            try {
                                if (string2 == null) break block16;
                                gQ.o((gQ[])new gQ[3]);
                            }
                            catch (JSONException jSONException) {
                                throw zN.a(jSONException);
                            }
                        }
                        stringArray = b;
                        object = string + stringArray[0];
                    }
                    string = object;
                }
                y8.Z((float)f, (float)f2, (float)this.N, (float)this.J, (float)this.F, (Color)J6.N((Color)color3, (double)(((double)0.2f + (double)0.1f * d3) * (double)f3)));
                float f10 = 1.0f;
                float f11 = 0.5f;
                try {
                    try {
                        f9 = f + 0.5f;
                        f8 = f2 + 0.5f;
                        f7 = this.N - 1.0f;
                        f6 = this.J - 1.0f;
                        f5 = this.F;
                        f4 = 1.0f;
                        color2 = J6.N((Color)R, (double)((float)R.getAlpha() / 255.0f * f3));
                        if (string2 != null) break block17;
                        y8.s((float)f9, (float)f8, (float)f7, (float)f6, (float)f5, (float)f4, (Color)color2);
                        if (!(d3 > 0.0)) break block18;
                    }
                    catch (JSONException jSONException) {
                        throw zN.a(jSONException);
                    }
                    f9 = f;
                    f8 = f2;
                    f7 = this.N;
                    f6 = this.J;
                    f5 = this.F;
                    f4 = 1.0f;
                    color2 = J6.N((Color)Color.WHITE, (double)((double)0.4f * d3));
                }
                catch (JSONException jSONException) {
                    throw zN.a(jSONException);
                }
            }
            y8.D((float)f9, (float)f8, (float)f7, (float)f6, (float)f5, (float)f4, (Color)color2, (float)((float)d));
        }
        Color color4 = J6.N((Color)Color.WHITE, (double)f3);
        y8.I((float)(f + 7.0f), (float)(f2 + 7.0f), (float)(this.J - 14.0f), (float)((this.J - 14.0f) / 2.0f), (Color)color4, (String)this.M.toString());
        stringArray = b;
        z7 z72 = zy.p().s().a(stringArray[2]);
        z72.U(this.z, f + this.J, f2 + 15.0f, 15.0f, color4.getRGB());
        z7 z73 = zy.p().s().a(stringArray[3]);
        z73.U(string, f + this.J, f2 + 30.0f, 10.0f, color.getRGB());
    }

    public void N(Consumer<zN> consumer) {
        consumer.accept(this.c());
    }

    public zN c() {
        return new zN(this.z, this.p, this.M, this.x, this.N, this.J, this.F);
    }

    public float t() {
        return this.U;
    }

    public float X() {
        return this.o;
    }

    public float u() {
        return this.N;
    }

    public float C() {
        return this.J;
    }

    public float P() {
        return this.F;
    }

    public String M() {
        return this.z;
    }

    public String A() {
        return this.p;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                zN.a = ds.a((long)2029814519829821927L, (long)-3245157692221882753L, MethodHandles.lookup().lookupClass()).a(60255473608234L);
                var0 = zN.a ^ 31796176610115L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "N.\u001f\u00dbtv\u00cc\u0091\"^d\u001e\u00eb\u0003\u0088\u00cc\bJ\u00e6o\u00184\u0015\u00b8\u008b";
                var8_6 = "N.\u001f\u00dbtv\u00cc\u0091\"^d\u001e\u00eb\u0003\u0088\u00cc\bJ\u00e6o\u00184\u0015\u00b8\u008b".length();
                var5_7 = 16;
                var4_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = zN.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "s_\u0010\u00ed9u\u001ei\u00c0\na\u00e0\u00f0\u00d0\u00f8\u00c3\u0010Gz\u00f1\u001d?x\u00cb\u008cTJ\t\u00db\u00bf\u00f3\u00faY";
                    var8_6 = "s_\u0010\u00ed9u\u001ei\u00c0\na\u00e0\u00f0\u00d0\u00f8\u00c3\u0010Gz\u00f1\u001d?x\u00cb\u008cTJ\t\u00db\u00bf\u00f3\u00faY".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl33:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = zN.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        zN.b = var9_3;
        zN.R = J6.N((Color)Color.WHITE, (double)0.15000000596046448);
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
