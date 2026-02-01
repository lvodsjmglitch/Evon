/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.Y
 *  club.evon.a
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.y8
 *  club.evon.yH
 *  club.evon.yI
 *  club.evon.yg
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  org.json.JSONException
 */
package club.evon;

import club.evon.Y;
import club.evon.a;
import club.evon.ds;
import club.evon.gQ;
import club.evon.y8;
import club.evon.yH;
import club.evon.yI;
import club.evon.yO;
import club.evon.yg;
import club.evon.z2;
import club.evon.z7;
import club.evon.zI;
import club.evon.zL;
import club.evon.zN;
import club.evon.zm;
import club.evon.zy;
import club.evon.zz;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class zV
extends zz {
    private static zV X;
    private static final z7 z;
    private static final z7 h;
    private static final Color A;
    private static final float m = 585.0f;
    private static final float Z = 450.0f;
    private static final int w;
    private static final int T;
    private zN d;
    private final z2 E;
    private final z2 n;
    private final z2 D;
    private final zm F;
    private final zm f;
    private final Map<String, zN> v;
    private static final long a;
    private static final String[] b;

    public static synchronized zV n() {
        zV zV2;
        block4: {
            block5: {
                long l = a ^ 0x4CEE959855E9L;
                gQ[] gQArray = club.evon.a.X();
                try {
                    try {
                        zV2 = X;
                        if (gQArray != null) break block4;
                        if (zV2 != null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw zV.a(jSONException);
                    }
                    X = new zV();
                }
                catch (JSONException jSONException) {
                    throw zV.a(jSONException);
                }
            }
            zV2 = X;
        }
        return zV2;
    }

    private zV() {
        block8: {
            block9: {
                long l = a ^ 0x40C33AC81B4FL;
                gQ[] gQArray = club.evon.a.X();
                gQ[] gQArray2 = gQArray;
                this.v = new LinkedHashMap<String, zN>();
                float f = 140.0f;
                float f2 = 25.0f;
                float f3 = 10.0f;
                this.E = new z2(yH.COOKIE, 140.0f, 25.0f, 10.0f);
                this.n = new z2(yH.MICROSOFT, 140.0f, 25.0f, 10.0f);
                this.D = new z2(yH.TOKEN, 140.0f, 25.0f, 10.0f);
                this.F = new zm(yI.LOGIN, 88.0f, 25.0f, 10.0f);
                this.f = new zm(yI.REMOVE, 88.0f, 25.0f, 10.0f);
                for (JsonArray jsonArray : zy.p().k().c().asMap().entrySet().stream().map(entry -> ((JsonElement)entry.getValue()).getAsJsonArray()).toList()) {
                    try {
                        this.g(jsonArray);
                        if (gQArray2 == null) {
                            if (gQArray2 == null) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (JSONException jSONException) {
                        throw zV.a(jSONException);
                    }
                }
                try {
                    zV zV2;
                    try {
                        zV2 = this;
                        if (gQArray2 != null) break block9;
                        if (zV2.v.isEmpty()) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw zV.a(jSONException);
                    }
                    zV2 = this;
                }
                catch (JSONException jSONException) {
                    throw zV.a(jSONException);
                }
            }
            zV2.d = this.v.values().stream().toList().getFirst().c();
        }
    }

    public void g(JsonArray jsonArray) {
        long l = a ^ 0x7F16712BF868L;
        String string = jsonArray.get(0).getAsString();
        gQ[] gQArray = club.evon.a.X();
        try {
            this.v.put(string, new zN(string, jsonArray.get(1).getAsString(), UUID.fromString(jsonArray.get(2).getAsString()), yg.q((int)jsonArray.get(3).getAsInt()), 181.66667f, 55.0f, 10.0f));
            if (gQ.q() == null) {
                club.evon.a.R((gQ[])new gQ[1]);
            }
        }
        catch (JSONException jSONException) {
            throw zV.a(jSONException);
        }
    }

    public void J(String string) {
        block4: {
            Object object;
            block5: {
                long l = a ^ 0x5E32104A52A5L;
                gQ[] gQArray = club.evon.a.X();
                try {
                    try {
                        object = this.d.M();
                        if (gQArray != null) break block4;
                        if (!((String)object).equals(this.v.get(string).M())) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw zV.a(jSONException);
                    }
                    this.d = null;
                }
                catch (JSONException jSONException) {
                    throw zV.a(jSONException);
                }
            }
            object = this.v.remove(string);
        }
    }

    protected void T(float f, float f2, int n, int n2) {
        float f3;
        gQ[] gQArray;
        float f4;
        float f5;
        block13: {
            float f6;
            float f7;
            block14: {
                float f8;
                String string;
                float f9;
                block11: {
                    long l = a ^ 0x35891662B821L;
                    float f10 = 20.0f;
                    f7 = ((float)n2 - 450.0f) / 2.0f;
                    f6 = 290.0f;
                    f9 = 160.0f;
                    f5 = ((float)n - (585.0f + f6 + 20.0f)) / 2.0f;
                    f4 = f7;
                    float f11 = 15.0f;
                    gQArray = club.evon.a.X();
                    float f12 = 20.0f;
                    String[] stringArray = b;
                    string = stringArray[7];
                    String[] stringArray2 = new String[]{stringArray[3], stringArray[4], stringArray[5], stringArray[9]};
                    int n3 = new Color(190, 190, 190).getRGB();
                    f8 = f5 + 10.0f;
                    float f13 = f5 + 25.5f;
                    float f14 = f4 + 33.0f;
                    float f15 = h.i(stringArray[6], 13.5f);
                    Y.G((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f);
                    y8.Z((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f, (Color)A);
                    int n4 = 1;
                    String[] stringArray3 = stringArray2;
                    int n5 = stringArray3.length;
                    int n6 = 0;
                    while (n6 < n5) {
                        block12: {
                            String[] stringArray4;
                            String string2 = stringArray3[n6];
                            h.U(n4 + ".", f8, f14, 15.0f, Color.WHITE.getRGB());
                            String[] stringArray5 = stringArray4 = string2.split("\n");
                            int n7 = stringArray5.length;
                            if (gQArray != null) break block11;
                            for (int i = 0; i < n7; ++i) {
                                String string3 = stringArray5[i];
                                h.U(string3, f13, f14, 13.5f, n3);
                                f14 += f15 - 2.0f;
                                try {
                                    if (gQArray != null) break block12;
                                    if (gQArray == null) continue;
                                }
                                catch (JSONException jSONException) {
                                    throw zV.a(jSONException);
                                }
                                gQ.o((gQ[])new gQ[5]);
                                break;
                            }
                            ++n4;
                            f14 += 8.0f;
                            ++n6;
                        }
                        if (gQArray == null) continue;
                    }
                    zV.T((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f);
                    z.U(string, f5 + zV.L(f6, string, z, 20.0f), f4 + 10.0f, 20.0f, Color.WHITE.getRGB());
                    f4 += f9 + 10.0f;
                    f9 = 133.0f;
                    stringArray = b;
                    string = stringArray[0];
                    Y.G((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f);
                    y8.Z((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f, (Color)A);
                    zV.T((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f);
                    z.U(string, f5 + zV.L(f6, string, z, 20.0f), f4 + 10.0f, 20.0f, Color.WHITE.getRGB());
                }
                f3 = f5 + (f6 - this.E.c()) / 2.0f;
                float f16 = f4 + 36.0f;
                f8 = 20.0f;
                this.E.M(f3, f16, f, f2);
                this.n.M(f3, f16 += this.E.I() + 4.0f, f, f2);
                this.D.M(f3, f16 += this.n.I() + 4.0f, f, f2);
                f4 += f9 + 10.0f;
                f9 = 450.0f - (f4 - f7);
                string = b[2];
                try {
                    Y.G((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f);
                    y8.Z((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f, (Color)A);
                    zV.T((float)f5, (float)f4, (float)f6, (float)f9, (float)15.0f);
                    z.U(string, f5 + zV.L(f6, string, z, 20.0f), f4 + 10.0f, 20.0f, Color.WHITE.getRGB());
                    if (gQArray != null) break block13;
                    if (this.d == null) break block14;
                }
                catch (JSONException jSONException) {
                    throw zV.a(jSONException);
                }
                f3 = f5 + (f6 - this.d.u()) / 2.0f;
                this.d.m(f3, f4 + 35.0f, f, f2);
                f16 = 99.0f;
                this.F.M(f3, f4 + 99.0f, f, f2);
                this.f.M(f3 + this.F.c() + (this.d.u() - this.F.c() * 2.0f), f4 + 99.0f, f, f2);
            }
            f4 = f7;
            Y.G((float)(f5 += f6 + 20.0f), (float)f4, (float)585.0f, (float)450.0f, (float)15.0f);
            y8.Z((float)f5, (float)f4, (float)585.0f, (float)450.0f, (float)15.0f, (Color)A);
            zV.T((float)f5, (float)f4, (float)585.0f, (float)450.0f, (float)15.0f);
            f3 = f5 += 10.0f;
            f4 += 10.0f;
        }
        int n8 = 0;
        for (zN zN2 : this.v.values()) {
            block17: {
                block15: {
                    block16: {
                        try {
                            zN2.m(f5, f4, f, f2);
                            ++n8;
                            if (gQArray != null) break block15;
                            if (n8 % 3 == 0) break block16;
                        }
                        catch (JSONException jSONException) {
                            throw zV.a(jSONException);
                        }
                        f5 += zN2.u() + 10.0f;
                        if (gQArray == null) break block17;
                    }
                    f5 = f3;
                }
                f4 += zN2.C() + 10.0f;
            }
            if (gQArray == null) continue;
        }
    }

    protected void s(double d, double d2, int n) {
        zV zV2;
        gQ[] gQArray;
        block46: {
            block45: {
                int n2;
                block43: {
                    block44: {
                        block41: {
                            block42: {
                                block39: {
                                    block40: {
                                        block37: {
                                            block38: {
                                                block35: {
                                                    block36: {
                                                        long l = a ^ 0x5EA5E47A78B3L;
                                                        gQArray = club.evon.a.X();
                                                        try {
                                                            n2 = n;
                                                            if (gQArray != null) break block35;
                                                            if (n2 == 0) break block36;
                                                        }
                                                        catch (JSONException jSONException) {
                                                            throw zV.a(jSONException);
                                                        }
                                                        return;
                                                    }
                                                    n2 = yO.J(d, d2, ((zI)((Object)this.E)).M(), this.E.S(), this.E.c(), this.E.I()) ? 1 : 0;
                                                }
                                                try {
                                                    try {
                                                        if (gQArray != null) break block37;
                                                        if (n2 == 0) break block38;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw zV.a(jSONException);
                                                    }
                                                    this.E.y();
                                                }
                                                catch (JSONException jSONException) {
                                                    throw zV.a(jSONException);
                                                }
                                            }
                                            n2 = yO.J(d, d2, ((zI)((Object)this.n)).M(), this.n.S(), this.n.c(), this.n.I()) ? 1 : 0;
                                        }
                                        try {
                                            try {
                                                if (gQArray != null) break block39;
                                                if (n2 == 0) break block40;
                                            }
                                            catch (JSONException jSONException) {
                                                throw zV.a(jSONException);
                                            }
                                            this.n.y();
                                        }
                                        catch (JSONException jSONException) {
                                            throw zV.a(jSONException);
                                        }
                                    }
                                    n2 = yO.J(d, d2, ((zI)((Object)this.D)).M(), this.D.S(), this.D.c(), this.D.I()) ? 1 : 0;
                                }
                                try {
                                    try {
                                        if (gQArray != null) break block41;
                                        if (n2 == 0) break block42;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zV.a(jSONException);
                                    }
                                    this.D.y();
                                }
                                catch (JSONException jSONException) {
                                    throw zV.a(jSONException);
                                }
                            }
                            n2 = yO.J(d, d2, this.F.M(), this.F.S(), this.F.c(), this.F.I()) ? 1 : 0;
                        }
                        try {
                            try {
                                if (gQArray != null) break block43;
                                if (n2 == 0) break block44;
                            }
                            catch (JSONException jSONException) {
                                throw zV.a(jSONException);
                            }
                            this.F.e(this.d.M());
                            this.F.b(this.d.A());
                            this.F.y();
                        }
                        catch (JSONException jSONException) {
                            throw zV.a(jSONException);
                        }
                    }
                    n2 = yO.J(d, d2, this.f.M(), this.f.S(), this.f.c(), this.f.I()) ? 1 : 0;
                }
                try {
                    try {
                        try {
                            if (n2 == 0) break block45;
                            zV2 = this;
                            if (gQArray != null) break block46;
                        }
                        catch (JSONException jSONException) {
                            throw zV.a(jSONException);
                        }
                        if (zV2.d == null) break block45;
                    }
                    catch (JSONException jSONException) {
                        throw zV.a(jSONException);
                    }
                    this.f.e(this.d.M());
                    this.f.b(this.d.A());
                    this.f.y();
                }
                catch (JSONException jSONException) {
                    throw zV.a(jSONException);
                }
            }
            zV2 = this;
        }
        for (zN zN3 : zV2.v.values()) {
            block47: {
                zN zN4;
                block48: {
                    try {
                        block49: {
                            try {
                                try {
                                    try {
                                        try {
                                            if (!yO.J(d, d2, zN3.t(), zN3.X(), zN3.u(), zN3.C())) break block47;
                                            zN4 = this.d;
                                            if (gQArray != null) break block48;
                                        }
                                        catch (JSONException jSONException) {
                                            throw zV.a(jSONException);
                                        }
                                        if (zN4 == null) break block49;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zV.a(jSONException);
                                    }
                                    zN4 = this.d;
                                    if (gQArray != null) break block48;
                                }
                                catch (JSONException jSONException) {
                                    throw zV.a(jSONException);
                                }
                                if (zN4.M().equals(zN3.M())) break block47;
                            }
                            catch (JSONException jSONException) {
                                throw zV.a(jSONException);
                            }
                        }
                        zN4 = zN3;
                    }
                    catch (JSONException jSONException) {
                        throw zV.a(jSONException);
                    }
                }
                zN4.N(zN2 -> {
                    this.d = zN2;
                });
            }
            if (gQArray == null) continue;
        }
    }

    protected void j(int n) {
        block4: {
            block5: {
                long l = a ^ 0x31A5583A14BFL;
                gQ[] gQArray = club.evon.a.X();
                try {
                    try {
                        if (gQArray != null) break block4;
                        if (n == 256) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw zV.a(jSONException);
                    }
                    return;
                }
                catch (JSONException jSONException) {
                    throw zV.a(jSONException);
                }
            }
            Y.S((zz)zL.c());
        }
    }

    private static float L(float f, String string, z7 z72, float f2) {
        return (f - z72.y(string, f2)) / 2.0f;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        zV.a = ds.a((long)5061095152453542543L, (long)-8488319479886691138L, MethodHandles.lookup().lookupClass()).a(109374495925841L);
                        var11 = zV.a ^ 64791931289999L;
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
                        var20_4 = new String[10];
                        var18_5 = 0;
                        var17_6 = "s}r\u00c2\u0081\u00947\u0084\u0010\u00e2\u0094=q.%\u00e4\u00d0\u00ff\u00a3\u001d\u0019\u000e\u0087\u00b8W\u0018\u00bdNnwB}\u00faT4\u001d\u0093\u000e\n\u00acEKG\u0083!I\u00e2;\u00d5R Np=x\u000e\u00b3=\u00bdM\u0011v(\u0013\u00e0\u0000\u00ac\u00cdPU\u0097<\u00c5K\u00d0\u0000\u00f2\u00c1J\u008d\u00da\u00df\u00a60\u00d1\u00edKP/\u00ccI\u00da\u00e4\u00c7\u00a9\u0014N\u00acj~\u0015R0~jEZ)A\u00037\u00a5g`\u0097d\u00d8\u00e4!\u001a\u0015\u00eb\r\u0017\u00c6\u009d\u00ee\u0017Zo\u00c2Vh\u0005w\u00b2\u0007\u00ed\u00eafLX\u00f5\u00a0h\u001a\u00ed_\u00165\u0087P7\u00e1\u00e0\u00f2\u00f9\u00bd\u00f4\u00117\u008c\u00a0P\u0096R\u00f7b\u009f\u0004\t{\u00f1\u00f1\u0015,\u0096\u0089\u00d6\u00ae\u0096\t\u00e0r\u00ed\u00f1\\\u00d1U+PJ\u00bb\u00cdC\u009b'v\u00a0\u0000\u008b\u0016\u00efuZx\u00ac\u008d\u00f6\u00f1\u00d3\u00ef\u00db'\u008c:w\u00fe>6\u0003\u00961U\u00a9\u00c3\u008cW\u00f9\u00ae\u0094\u0092\f(\u0001\u0092O\b\u0096 \u00ee.\u008bw\u0092\u0005\u0010\u0018\u00ca\u00c0xO\u00cbm\u00aa8\u00fa`;\u00ce\u0016\u00d9O";
                        var19_7 = "s}r\u00c2\u0081\u00947\u0084\u0010\u00e2\u0094=q.%\u00e4\u00d0\u00ff\u00a3\u001d\u0019\u000e\u0087\u00b8W\u0018\u00bdNnwB}\u00faT4\u001d\u0093\u000e\n\u00acEKG\u0083!I\u00e2;\u00d5R Np=x\u000e\u00b3=\u00bdM\u0011v(\u0013\u00e0\u0000\u00ac\u00cdPU\u0097<\u00c5K\u00d0\u0000\u00f2\u00c1J\u008d\u00da\u00df\u00a60\u00d1\u00edKP/\u00ccI\u00da\u00e4\u00c7\u00a9\u0014N\u00acj~\u0015R0~jEZ)A\u00037\u00a5g`\u0097d\u00d8\u00e4!\u001a\u0015\u00eb\r\u0017\u00c6\u009d\u00ee\u0017Zo\u00c2Vh\u0005w\u00b2\u0007\u00ed\u00eafLX\u00f5\u00a0h\u001a\u00ed_\u00165\u0087P7\u00e1\u00e0\u00f2\u00f9\u00bd\u00f4\u00117\u008c\u00a0P\u0096R\u00f7b\u009f\u0004\t{\u00f1\u00f1\u0015,\u0096\u0089\u00d6\u00ae\u0096\t\u00e0r\u00ed\u00f1\\\u00d1U+PJ\u00bb\u00cdC\u009b'v\u00a0\u0000\u008b\u0016\u00efuZx\u00ac\u008d\u00f6\u00f1\u00d3\u00ef\u00db'\u008c:w\u00fe>6\u0003\u00961U\u00a9\u00c3\u008cW\u00f9\u00ae\u0094\u0092\f(\u0001\u0092O\b\u0096 \u00ee.\u008bw\u0092\u0005\u0010\u0018\u00ca\u00c0xO\u00cbm\u00aa8\u00fa`;\u00ce\u0016\u00d9O".length();
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
                            var20_4[var18_5++] = zV.a(var21_10).intern();
                            if ((var15_9 += var16_8) < var19_7) {
                                var16_8 = var17_6.charAt(var15_9);
                                ** continue;
                            }
                            var17_6 = "+\u00b4xe\u00d1\u00af\u00ab|M\u0083\u00d1\u009fv\u00d8\u0085\u00d9P\u0005w\u00b2\u0007\u00ed\u00eafLd\u0001[\u00a2\u00fe\u001bf\u0003\u00b23\u00ad\u0086.o@\u00f4\u009c\u00a2\u00db\u009b\u00d6\u00ad\u00dc\u001c5\u0080\u0012\u007f>\u0004J\u00ff\u00ec\u0085\u00c5\u001f\u00c4L\u00ce\u009a?$\u0011\u00cb\u008d\u00eb\u0082\u008b\u00d3\u0092M\u00aa\u0089\u0099\u00ef?+\u00e0\u0007iX\u0015\u001e\u00cdg\u00e7\u0001\u0018\u00a26\u00b8\u000f";
                            var19_7 = "+\u00b4xe\u00d1\u00af\u00ab|M\u0083\u00d1\u009fv\u00d8\u0085\u00d9P\u0005w\u00b2\u0007\u00ed\u00eafLd\u0001[\u00a2\u00fe\u001bf\u0003\u00b23\u00ad\u0086.o@\u00f4\u009c\u00a2\u00db\u009b\u00d6\u00ad\u00dc\u001c5\u0080\u0012\u007f>\u0004J\u00ff\u00ec\u0085\u00c5\u001f\u00c4L\u00ce\u009a?$\u0011\u00cb\u008d\u00eb\u0082\u008b\u00d3\u0092M\u00aa\u0089\u0099\u00ef?+\u00e0\u0007iX\u0015\u001e\u00cdg\u00e7\u0001\u0018\u00a26\u00b8\u000f".length();
                            var16_8 = 16;
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
                            var20_4[var18_5++] = zV.a(var21_10).intern();
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
                zV.b = var20_4;
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
                var5_15 = "7\u00a0\u0015Y\u0087M\u00e8y\u00f4\u00e4!a\u00b6\u00df\u00e1\u009b";
                var6_16 = "7\u00a0\u0015Y\u0087M\u00e8y\u00f4\u00e4!a\u00b6\u00df\u00e1\u009b".length();
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
        zV.T = (int)var0_13[0];
        zV.w = (int)var0_13[1];
        var11_1 = zV.b;
        zV.z = zy.p().s().a(var11_1[1]);
        zV.h = zy.p().s().a(var11_1[8]);
        zV.A = new Color(11, 5, 18, 50);
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
