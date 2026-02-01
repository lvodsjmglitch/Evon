/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.FontWeight
 *  club.evon.UIHelper
 *  club.evon.Manager2
 *  club.evon.d
 *  club.evon.ObfuscationHelper
 *  club.evon.RenderEvent
 *  club.evon.Module
 *  club.evon.PacketHelper
 *  club.evon.ModuleBase
 *  club.evon.StringArrayHelper
 *  org.json.JSONException
 *  org.lwjgl.nanovg.NVGPaint
 */
package club.evon;

import club.evon.FontWeight;
import club.evon.UIHelper;
import club.evon.Manager2;
import club.evon.EventListenerAnnotation;
import club.evon.d;
import club.evon.ObfuscationHelper;
import club.evon.RenderEvent;
import club.evon.Module;
import club.evon.PacketHelper;
import club.evon.ModuleBase;
import club.evon.StringArrayHelper;
import club.evon.MinecraftHelper;
import club.evon.Animation;
import club.evon.ConfigRestore;
import club.evon.ConfigProvider;
import club.evon.EvonClient;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.lwjgl.nanovg.NVGPaint;

public final class Module6
extends ModuleBase<PacketHelper> {
    private static final ConfigRestore N;
    private static final Animation u;
    private static final String CooldownTimer;
    private static final int X;
    private static final int I;
    private static final int RenderEvent;
    private static final float V = 3.5f;
    private static final float d = 6.5f;
    private static final float k = 0.6f;
    private static final float S = 1.2f;
    private static final float M = 12.5f;
    private static final float f = 1.1f;
    private static final float o = 12.95f;
    private static final Color m;
    private static final Color g;
    private static final Color Property;
    private static final Color w;
    private static final Color Property;
    private static final String U;
    private static final String q;
    private static final String K;
    private static final String G;
    private final Manager2 StaticEventBus = EvonClient.p().J();
    private float r;
    private float l;
    private float O;
    private static final long EventDispatcher;
    private static final String[] i;

    public yX(String string, PacketHelper gy2) {
        super(string, (Module)gy2);
    }

    @EventListenerAnnotation(EventDispatcher=-20)
    private void n(RenderEvent e2) {
        block4: {
            block5: {
                long l = EventDispatcher ^ 0x17E975B68CDEL;
                Module[] gQArray = club.evon.d.j();
                try {
                    try {
                        if (gQArray == null) break block4;
                        if (!MinecraftHelper.m.field_1690.field_1842) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yX.FontWeight(jSONException);
                    }
                    return;
                }
                catch (JSONException jSONException) {
                    throw yX.FontWeight(jSONException);
                }
            }
            StringArrayHelper.j();
            StringArrayHelper.Property((float)10.0f, (float)10.0f);
        }
        float f = PacketHelper.v();
        StringArrayHelper.s((float)f, (float)f);
        this.l = u.y(CooldownTimer, 15.0f);
        this.O = Math.max(u.y(U, 8.0f), u.y(q, 7.0f));
        float f2 = Math.max(u.y(K, 8.0f), u.y(G, 7.0f));
        this.r = 6.5f + this.l + 3.5f + 9.2f + this.O + 3.5f - 0.5f + f2 + 3.5f + 6.5f;
        StringArrayHelper.v((float)-0.90000004f, (float)-0.90000004f, (float)(this.r + 1.8000001f), (float)26.8f, (float)12.95f, (Color)Color.BLACK);
        StringArrayHelper.g();
    }

    @EventListenerAnnotation(EventDispatcher=-20)
    private void Category(ConfigProvider zx2) {
        block4: {
            block5: {
                long l = EventDispatcher ^ 0x65A60F8363D4L;
                Module[] gQArray = club.evon.d.j();
                try {
                    try {
                        if (gQArray == null) break block4;
                        if (!MinecraftHelper.m.field_1690.field_1842) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yX.FontWeight(jSONException);
                    }
                    return;
                }
                catch (JSONException jSONException) {
                    throw yX.FontWeight(jSONException);
                }
            }
            StringArrayHelper.j();
            StringArrayHelper.Property((float)10.0f, (float)10.0f);
        }
        float f = PacketHelper.v();
        StringArrayHelper.s((float)f, (float)f);
        float f2 = 6.5f;
        StringArrayHelper.r((float)-0.90000004f, (float)-0.90000004f, (float)(this.r + 1.8000001f), (float)26.8f, (float)12.95f, (NVGPaint)StringArrayHelper.o);
        StringArrayHelper.CooldownTimer((float)0.0f, (float)0.0f, (float)this.r, (float)25.0f, (float)12.5f, (Color)w);
        StringArrayHelper.s((float)-0.6f, (float)-0.6f, (float)(this.r + 1.2f), (float)26.2f, (float)12.95f, (float)1.2f, (Color)Property);
        Color color = PacketHelper.d();
        Color color2 = PacketHelper.Category();
        String[] stringArray = i;
        this.StaticEventBus.x(stringArray[3], FontWeight.BOLD, CooldownTimer, f2, (25.0f - u.i(stringArray[2], 15.0f)) / 2.0f, 15.0f, color.getRGB(), color2.getRGB(), false, 0.0f, 9);
        float f3 = 6.5f;
        float f4 = 7.0f;
        StringArrayHelper.CooldownTimer((float)(f2 += this.l + 3.5f), (float)7.0f, (float)1.1f, (float)12.0f, (float)0.55f, (Color)Property);
        u.U(U, f2 += 4.6f, 6.0f, 8.0f, g.getRGB());
        float f5 = 6.0f + u.i(stringArray[4], 8.0f);
        u.U(q, f2, f5, 7.0f, m.getRGB());
        StringArrayHelper.CooldownTimer((float)(f2 += this.O + 3.5f - 0.5f), (float)7.0f, (float)1.1f, (float)12.0f, (float)0.55f, (Color)Property);
        u.U(K, f2 += 4.6f, 6.0f, 8.0f, g.getRGB());
        u.U(G, f2, f5 - 0.5f, 7.5f, m.getRGB());
        StringArrayHelper.g();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        yX.EventDispatcher = ObfuscationHelper.FontWeight((long)-5316721832258699907L, (long)-3413521646814513407L, MethodHandles.lookup().lookupClass()).FontWeight(182212660173617L);
                        var11 = yX.EventDispatcher ^ 80733733596515L;
                        var13_2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        PreMovementEvent = new byte[8];
                        PacketSendEvent = PreMovementEvent;
                        PreMovementEvent[0] = (byte)(var11 >>> 56);
                        for (var14_3 = 1; var14_3 < 8; ++var14_3) {
                            PacketSendEvent = PacketSendEvent;
                            PacketSendEvent[var14_3] = (byte)(var11 << var14_3 * 8 >>> 56);
                        }
                        var13_2.init(2, (Key)v0.generateSecret(new DESKeySpec(PacketSendEvent)), new IvParameterSpec(new byte[8]));
                        var20_4 = new String[7];
                        var18_5 = 0;
                        var17_6 = "\u00af\u00c3\u00874\u00fb\u0084\u00a2'\u0010\u0083\u008d\u00b4\u009f\u001e\u00c4Gx:\u00b3\u00f2\u0081\u001d\u00eb\u00ee\u00fe\Property\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e\Property\u009c\u00d7\f\\-\u00e1\u008c\u007f\Property\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e";
                        var19_7 = "\u00af\u00c3\u00874\u00fb\u0084\u00a2'\u0010\u0083\u008d\u00b4\u009f\u001e\u00c4Gx:\u00b3\u00f2\u0081\u001d\u00eb\u00ee\u00fe\Property\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e\Property\u009c\u00d7\f\\-\u00e1\u008c\u007f\Property\u0082\u00a7\u00de\u00ae\u00b7U\u00f0e".length();
                        var16_8 = 8;
                        var15_9 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            PacketReceiveEvent = ++var15_9;
                            v4 = var17_6.substring(PacketReceiveEvent, PacketReceiveEvent + var16_8);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var20_4[var18_5++] = yX.FontWeight(var21_10).intern();
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
                            var20_4[var18_5++] = yX.FontWeight(var21_10).intern();
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
        yX.RenderEvent = (int)var0_13[0];
        yX.I = (int)var0_13[0];
        yX.X = (int)var0_13[1];
        yX.N = EvonClient.p().s();
        var11_1 = yX.i;
        yX.u = yX.N.FontWeight(var11_1[1]);
        yX.CooldownTimer = var11_1[5].toLowerCase();
        yX.m = UIHelper.N((Color)Color.WHITE, (double)0.44999998807907104);
        yX.g = UIHelper.N((Color)Color.WHITE, (double)0.8999999761581421);
        yX.Property = UIHelper.N((Color)Color.WHITE, (double)0.05000000074505806);
        yX.w = UIHelper.N((Color)new Color(35, 35, 35), (double)0.30000001192092896);
        yX.Property = UIHelper.N((Color)Color.WHITE, (double)0.44999998807907104);
        yX.U = EvonClient.g().r();
        yX.q = EvonClient.g().R();
        yX.K = var11_1[0].toLowerCase() + var11_1[6];
        yX.G = EvonClient.g().M().toString().toLowerCase();
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
