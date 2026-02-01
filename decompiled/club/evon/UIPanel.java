/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.UIHelper
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  org.json.JSONException
 */
package club.evon;

import club.evon.UIHelper;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.CollisionHelper;
import club.evon.MainMenuButton;
import club.evon.FontRenderer;
import club.evon.ConfigFile;
import club.evon.ConfigHelper3;
import club.evon.HypixelPacketHandler;
import club.evon.TextRecord;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class UIPanel
extends TextRecord {
    private final List<ConfigFile> V;
    private static final float Property = 4.5f;
    private static final float r = 7.5f;
    private static final float CooldownTimer = 6.5f;
    public static final float F = 187.5f;
    public static final float y = 28.0f;
    public static final float StaticEventBus = 10.0f;
    public static final float Q = 42.0f;
    public static final float K = 141.0f;
    private static final Color g;
    private static final Color j;
    private static zL u;
    private static final long FontWeight;
    private static final String[] Property;

    public static synchronized zL StaticEventBus() {
        zL zL2;
        block4: {
            block5: {
                long l = FontWeight ^ 0x448361A85686L;
                int n = UIHelper.M();
                try {
                    try {
                        zL2 = u;
                        if (n != 0) break block4;
                        if (zL2 != null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw zL.FontWeight(jSONException);
                    }
                    u = new zL();
                }
                catch (JSONException jSONException) {
                    throw zL.FontWeight(jSONException);
                }
            }
            zL2 = u;
        }
        return zL2;
    }

    private zL() {
        long l = FontWeight ^ 0x25AE7069AA31L;
        this.V = new ArrayList<ConfigFile>();
        MainMenuButton[] yYArray = new MainMenuButton[]{MainMenuButton.SINGLEPLAYER, MainMenuButton.MULTIPLAYER, MainMenuButton.OPTIONS, MainMenuButton.ACCOUNTS, MainMenuButton.EXIT};
        int n = UIHelper.M();
        for (MainMenuButton yY2 : yYArray) {
            this.V.add(new ConfigFile(yY2));
            if (n == 0) continue;
        }
    }

    protected void Category(float f, float f2, int n, int n2) {
        long l = FontWeight ^ 0x48238576CD74L;
        ConfigHelper3 zv2 = HypixelPacketHandler.p().s();
        int n3 = UIHelper.M();
        String[] stringArray = Property;
        FontRenderer z72 = zv2.FontWeight(stringArray[1]);
        String string = stringArray[2];
        String string2 = stringArray[0];
        float f3 = z72.y(stringArray[5], 44.0f);
        float f4 = ((float)n - (f3 + z72.y(stringArray[3], 15.0f))) / 2.0f;
        float f5 = ((float)n2 - ((float)(this.V.size() - 1) * 32.5f - 4.5f + 50.0f)) / 2.0f;
        z72.U(stringArray[5], f4, f5 - 7.5f, 44.0f, g.getRGB());
        z72.U(stringArray[3], f4 + f3 + 2.0f, f5 + 15.5f, 15.0f, g.getRGB());
        float f6 = ((float)n - 187.5f) / 2.0f;
        float f7 = f5 + 50.0f;
        for (ConfigFile zb2 : this.V) {
            float f8;
            float f9;
            block6: {
                block7: {
                    try {
                        zb2.M(f6, f7, f, f2);
                        f9 = zb2.StaticEventBus();
                        f8 = 187.5f;
                        if (n3 != 0) break block6;
                        if (f9 != f8) break block7;
                    }
                    catch (JSONException jSONException) {
                        throw zL.FontWeight(jSONException);
                    }
                    f7 += zb2.I() + 4.5f;
                    if (n3 == 0) continue;
                }
                f9 = f6;
                f8 = zb2.StaticEventBus() + 4.5f;
            }
            f6 = f9 + f8;
            if (n3 == 0) continue;
        }
        stringArray = Property;
        FontRenderer z73 = zv2.FontWeight(stringArray[6]);
        float f10 = z73.i(stringArray[7], 7.5f);
        float f11 = (float)n2 - (5.5f + f10);
        z73.U(stringArray[4], 6.5f, f11, 7.5f, j.getRGB());
        f11 -= f10 + 1.0f;
        try {
            z73.U(stringArray[8], 6.5f, f11, 7.5f, j.getRGB());
            if (Module.q() == null) {
                UIHelper.Category((int)(++n3));
            }
        }
        catch (JSONException jSONException) {
            throw zL.FontWeight(jSONException);
        }
    }

    protected void s(double d, double d2, int n) {
        long l = FontWeight ^ 0x230F776E0DE6L;
        Iterator<ConfigFile> iterator = this.V.iterator();
        int n2 = UIHelper.g();
        while (iterator.hasNext()) {
            int n3;
            ConfigFile zb2;
            block5: {
                zb2 = iterator.next();
                try {
                    n3 = n;
                    if (n2 == 0) break block5;
                    if (n3 != 0) continue;
                }
                catch (JSONException jSONException) {
                    throw zL.FontWeight(jSONException);
                }
                n3 = CollisionHelper.J(d, d2, zb2.M(), zb2.S(), zb2.StaticEventBus(), zb2.I()) ? 1 : 0;
            }
            try {
                if (n3 == 0 && n2 != 0) continue;
            }
            catch (JSONException jSONException) {
                throw zL.FontWeight(jSONException);
            }
            zb2.y();
            if (n2 != 0) continue;
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                zL.FontWeight = ObfuscationHelper.FontWeight((long)5665002457024314006L, (long)-7631312971788281646L, MethodHandles.lookup().lookupClass()).FontWeight(130082878439421L);
                var0 = zL.FontWeight ^ 132425703217704L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                PreMovementEvent = new byte[8];
                PacketSendEvent = PreMovementEvent;
                PreMovementEvent[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    PacketSendEvent = PacketSendEvent;
                    PacketSendEvent[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(PacketSendEvent)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "n\u0007\u008c\u000e7\u00f5\u00c1\u00de\u0010\u00e5/>0\u00f1\u009a\u00fcL\u00b7$?\u00ecpq!\r\bt\u00fa\u00d8Ltw!;\bn\u0007\u008c\u000e7\u00f5\u00c1\u00de \u00aa\u00e8\u00afI\u00e3h\u009dq\u001e,\u001aVB}\u00c9\u00a18\u00d8\u00f8\u00a1\u00ec\u00a0\u00d58\u0081\u0086\u001f\u00a7\u00e6\u00df\u00a8\u00b4\bt\u00fa\u00d8Ltw!;\u0010n\u00b3!\u00d1\u000f90\u00c7\u00b2)3\u00d7\u00cb\u00fa\u0017\u00f7";
                var8_6 = "n\u0007\u008c\u000e7\u00f5\u00c1\u00de\u0010\u00e5/>0\u00f1\u009a\u00fcL\u00b7$?\u00ecpq!\r\bt\u00fa\u00d8Ltw!;\bn\u0007\u008c\u000e7\u00f5\u00c1\u00de \u00aa\u00e8\u00afI\u00e3h\u009dq\u001e,\u001aVB}\u00c9\u00a18\u00d8\u00f8\u00a1\u00ec\u00a0\u00d58\u0081\u0086\u001f\u00a7\u00e6\u00df\u00a8\u00b4\bt\u00fa\u00d8Ltw!;\u0010n\u00b3!\u00d1\u000f90\u00c7\u00b2)3\u00d7\u00cb\u00fa\u0017\u00f7".length();
                var5_7 = 8;
                var4_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    PacketReceiveEvent = ++var4_8;
                    v4 = var6_5.substring(PacketReceiveEvent, PacketReceiveEvent + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = zL.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0001\Category\u00a2h\u00a5\u00bf@\u0088\u0018\u00d3\u00fe\u00df\u00e9e\u00e0\u00bf\u00d60\u000eM$Ka\u0090\u0095\u00ec\u0006\u00a8\u00aa\u00c1h\u00e1\u0017";
                    var8_6 = "\u0001\Category\u00a2h\u00a5\u00bf@\u0088\u0018\u00d3\u00fe\u00df\u00e9e\u00e0\u00bf\u00d60\u000eM$Ka\u0090\u0095\u00ec\u0006\u00a8\u00aa\u00c1h\u00e1\u0017".length();
                    var5_7 = 8;
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
                    var9_3[var7_4++] = zL.FontWeight(var10_9).intern();
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
        zL.Property = var9_3;
        zL.g = UIHelper.N((Color)Color.WHITE, (double)0.5);
        zL.j = UIHelper.N((Color)Color.WHITE, (double)0.44999998807907104);
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
