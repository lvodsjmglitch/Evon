/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.J6
 *  club.evon.Js
 *  club.evon.ScreenHelper
 *  club.evon.P
 *  club.evon.ObfuscationHelper
 *  club.evon.ModuleBase
 *  club.evon.StringArrayHelper
 *  org.json.JSONException
 */
package club.evon;

import club.evon.J6;
import club.evon.Js;
import club.evon.ScreenHelper;
import club.evon.P;
import club.evon.AnimationValue;
import club.evon.Triple;
import club.evon.ModuleBase;
import club.evon.ObfuscationHelper;
import club.evon.ModuleBase;
import club.evon.StringArrayHelper;
import club.evon.CollisionHelper;
import club.evon.TickEvent;
import club.evon.Animation;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class UIModule
extends ModuleBase<P> {
    private boolean Z;
    private final AnimationValue P = new AnimationValue(200, 0.0, TickEvent.LINEAR);
    private static final float l = 15.0f;
    private static final float k = 1.5f;
    private static final float G = 4.0f;
    private static final float r = 5.5f;
    private static final float F = 3.5f;
    private static final ScreenHelper StaticEventBus;
    private static final long Property;

    public _2(P p) {
    }

    public void l(int n, int n2) {
        float f;
        float f2;
        float f3;
        float f4;
        block9: {
            double d;
            AnimationValue _J2;
            long l = Property ^ 0x77439D7B1D9DL;
            Object Property = Triple.StaticEventBus();
            super.l(n, n2);
            float f5 = this.j();
            f4 = this.F();
            float f6 = this.L();
            P p = (P)this.d();
            Object b2 = Property;
            f3 = super.m();
            float f7 = f4 + f3;
            try {
                _J2 = this.P;
                d = this.Z ? 1.0 : 0.0;
            }
            catch (JSONException jSONException) {
                throw _2.FontWeight(jSONException);
            }
            _J2.N(d);
            StringArrayHelper.y((float)f5, (float)(f4 + f3), (float)f6, (float)(this.m() - (4.5f + f3)));
            ArrayList<ModuleBase> arrayList = new ArrayList<ModuleBase>(p.Property());
            arrayList.remove(p.J());
            arrayList.addFirst((ModuleBase)p.J());
            for (ModuleBase vJ2 : arrayList) {
                int n3;
                float f8;
                float f9;
                float f10;
                String string;
                Animation z72;
                double d2;
                Color color;
                float f11;
                float f12;
                float f13;
                block11: {
                    block10: {
                        boolean bl = CollisionHelper.J(n, n2, f5 + 4.5f, f7, f6 - 9.0f, 15.0);
                        StringArrayHelper.y((float)f5, (float)f7, (float)f6, (float)15.0f);
                        float f14 = 0.85f;
                        float f15 = 0.425f;
                        try {
                            try {
                                StringArrayHelper.s((float)(f5 + 4.5f + 0.425f), (float)(f4 + f3 + 0.425f), (float)(f6 - 9.0f - 0.85f), (float)(this.m() - (f3 + 4.5f) - 0.85f), (float)4.0f, (float)0.85f, (Color)new Color(184, 202, 209, 19));
                                f2 = f5 + 4.5f;
                                f = f4 + f3;
                                if (b2 != false) break block9;
                                f13 = f6 - 9.0f;
                                f12 = this.m() - (f3 + 4.5f);
                                f11 = 4.0f;
                                color = Color.WHITE;
                                if (bl) break block10;
                            }
                            catch (JSONException jSONException) {
                                throw _2.FontWeight(jSONException);
                            }
                            d2 = 0.1f;
                            break block11;
                        }
                        catch (JSONException jSONException) {
                            throw _2.FontWeight(jSONException);
                        }
                    }
                    d2 = 0.15f;
                }
                try {
                    StringArrayHelper.Z((float)f2, (float)f, (float)f13, (float)f12, (float)f11, (Color)J6.N((Color)color, (double)d2));
                    z72 = Js.FontWeight;
                    string = vJ2.R();
                    f10 = f5 + 4.5f + 4.0f;
                    f9 = f7 + 4.0f + 0.5f;
                    f8 = 7.0f;
                    n3 = p.J() == vJ2 ? Color.WHITE.getRGB() : new Color(220, 220, 220).getRGB();
                }
                catch (JSONException jSONException) {
                    throw _2.FontWeight(jSONException);
                }
                z72.U(string, f10, f9, f8, n3);
                StringArrayHelper.v();
                f7 += 16.5f;
                if (b2 == false) continue;
            }
            f2 = f5 + f6;
            f = 14.5f;
        }
        float f16 = f2 - f;
        float f17 = f4 + f3 + 4.5f + 1.5f;
        StringArrayHelper.j();
        StringArrayHelper.Property((float)(f16 + 2.75f), (float)(f17 + 1.75f));
        StringArrayHelper.F((float)(3.125f * this.P.y().floatValue()));
        StringArrayHelper.Property((float)-2.75f, (float)-1.75f);
        StringArrayHelper.G((float)0.0f, (float)0.0f, (float)5.5f, (float)3.5f, null, (ScreenHelper)StaticEventBus);
        StringArrayHelper.g();
        StringArrayHelper.v();
    }

    /*
     * Unable to fully structure code
     */
    public void W(double var1_1, double var3_2, int var5_3) {
        block32: {
            block37: {
                block38: {
                    block36: {
                        block35: {
                            block31: {
                                var6_4 = _2.Property ^ 135215187258334L;
                                var9_5 = (P)this.d();
                                var8_6 = Triple.StaticEventBus();
                                try {
                                    try {
                                        try {
                                            try {
                                                v0 = this.Z;
                                                if (var8_6 != false) break block31;
                                                if (v0 != 0) {
                                                }
                                                ** GOTO lbl63
                                            }
                                            catch (JSONException PreMovementEvent) {
                                                throw _2.FontWeight(PreMovementEvent);
                                            }
                                            v0 = (int)CollisionHelper.J(var1_1, var3_2, this.j(), this.F(), this.L(), super.m() + 16.5f);
                                            if (var8_6 != false) break block31;
                                        }
                                        catch (JSONException PacketSendEvent) {
                                            throw _2.FontWeight(PacketSendEvent);
                                        }
                                        if (v0 == 0) {
                                        }
                                        ** GOTO lbl63
                                    }
                                    catch (JSONException PacketReceiveEvent) {
                                        throw _2.FontWeight(PacketReceiveEvent);
                                    }
                                    if (var5_3 != 0) break block32;
                                }
                                catch (JSONException v4) {
                                    throw _2.FontWeight(v4);
                                }
                                var10_7 = this.j();
                                var11_8 = this.F();
                                var12_9 = this.L();
                                var13_10 = super.m();
                                var14_11 = var11_8 + var13_10;
                                var15_12 = new ArrayList<ModuleBase>(var9_5.Property());
                                var15_12.remove(var9_5.J());
                                var15_12.addFirst((ModuleBase)var9_5.J());
                                for (ModuleBase var17_14 : var15_12) {
                                    block33: {
                                        block34: {
                                            try {
                                                try {
                                                    try {
                                                        if (var8_6 != false) break block32;
                                                        if (var8_6 != false) break block33;
                                                    }
                                                    catch (JSONException v5) {
                                                        throw _2.FontWeight(v5);
                                                    }
                                                    if (!CollisionHelper.J(var1_1, var3_2, var10_7 + 4.5f, var14_11, var12_9 + 9.0f, 15.0)) break block34;
                                                }
                                                catch (JSONException v6) {
                                                    throw _2.FontWeight(v6);
                                                }
                                                var9_5.n(var17_14);
                                                this.Z = false;
                                                if (var8_6 == false) break;
                                            }
                                            catch (JSONException v7) {
                                                throw _2.FontWeight(v7);
                                            }
                                        }
                                        var14_11 += 16.5f;
                                    }
                                    if (var8_6 == false) continue;
                                }
                                try {
                                    if (var8_6 == false) break block32;
lbl63:
                                    // 3 sources

                                    v0 = var5_3;
                                }
                                catch (JSONException v8) {
                                    throw _2.FontWeight(v8);
                                }
                            }
                            try {
                                try {
                                    if (var8_6 != false) break block35;
                                    if (v0 > 1) break block32;
                                }
                                catch (JSONException v9) {
                                    throw _2.FontWeight(v9);
                                }
                                v0 = (int)CollisionHelper.J(var1_1, var3_2, this.j() + 4.5f, this.F() + super.m(), this.L() - 9.0f, 15.0);
                            }
                            catch (JSONException v10) {
                                throw _2.FontWeight(v10);
                            }
                        }
                        try {
                            try {
                                if (var8_6 != false) break block36;
                                if (v0 == 0) break block32;
                            }
                            catch (JSONException v11) {
                                throw _2.FontWeight(v11);
                            }
                            v0 = var9_5.Property().size();
                        }
                        catch (JSONException v12) {
                            throw _2.FontWeight(v12);
                        }
                    }
                    try {
                        try {
                            if (v0 <= 1) break block32;
                            v13 = this;
                            v14 = this.Z;
                            if (var8_6 != false) break block37;
                        }
                        catch (JSONException v15) {
                            throw _2.FontWeight(v15);
                        }
                        if (v14) break block38;
                    }
                    catch (JSONException v16) {
                        throw _2.FontWeight(v16);
                    }
                    v14 = true;
                    break block37;
                }
                v14 = false;
            }
            v13.Z = v14;
        }
    }

    public float m() {
        float f;
        float f2;
        float f3;
        block6: {
            block5: {
                float f4;
                float f5;
                block4: {
                    long l = Property ^ 0x88C57577ACCL;
                    int n = Triple.V();
                    try {
                        try {
                            f3 = super.m();
                            f2 = 16.5f;
                            f5 = this.P.y().floatValue();
                            f4 = 0.0f;
                            if (n == 0) break block4;
                            if (f5 == f4) break block5;
                        }
                        catch (JSONException jSONException) {
                            throw _2.FontWeight(jSONException);
                        }
                        f5 = 16.5f;
                        f4 = ((P)this.d()).Property().size() - 1;
                    }
                    catch (JSONException jSONException) {
                        throw _2.FontWeight(jSONException);
                    }
                }
                f = f5 * f4;
                break block6;
            }
            f = 0.0f;
        }
        return f3 + (f2 + f * this.P.y().floatValue()) - 1.5f + 4.5f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        Property = ObfuscationHelper.FontWeight((long)1213891450403488564L, (long)4210274733815323801L, MethodHandles.lookup().lookupClass()).FontWeight(4142828261847L);
        long l = Property ^ 0x6B2408896384L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("EventDispatcher\u00a8+S\u00bb\u00ce0?+\u00c2\u007f\u0001j\u008cs\u0087".getBytes("ISO-8859-1"));
                String string = _2.FontWeight(byArray3).intern();
                StaticEventBus = new ScreenHelper(string);
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }

    private static String FontWeight(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char StaticEventBus;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                StaticEventBus = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F));
                cArray[n++] = StaticEventBus;
                continue;
            }
            if (i >= n2 - 2) continue;
            StaticEventBus = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F));
            cArray[n++] = StaticEventBus;
        }
        return new String(cArray, 0, n);
    }
}
