/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.UIHelper
 *  club.evon.Y
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.StringArrayHelper
 *  org.json.JSONException
 */
package club.evon;

import club.evon.UIHelper;
import club.evon.Y;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.StringArrayHelper;
import club.evon.MainMenuButton;
import club.evon.FontRenderer;
import club.evon.UIPanel;
import club.evon.ConfigHelper3;
import club.evon.HypixelPacketHandler;
import club.evon.TextRecord;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public class ConfigDeserializer2
extends TextRecord {
    private static final Color q;
    private static final Color W;
    private static final Color R;
    private static zF y;
    private static final long FontWeight;
    private static final String[] Property;

    public static synchronized zF StaticEventBus() {
        zF zF2;
        block4: {
            block5: {
                long l = FontWeight ^ 0x8EA77A8D86AL;
                int n = UIHelper.g();
                try {
                    try {
                        zF2 = y;
                        if (n == 0) break block4;
                        if (zF2 != null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw zF.FontWeight(jSONException);
                    }
                    y = new zF();
                }
                catch (JSONException jSONException) {
                    throw zF.FontWeight(jSONException);
                }
            }
            zF2 = y;
        }
        return zF2;
    }

    private zF() {
        MainMenuButton[] yYArray = new MainMenuButton[]{MainMenuButton.SINGLEPLAYER, MainMenuButton.MULTIPLAYER, MainMenuButton.OPTIONS, MainMenuButton.ACCOUNTS, MainMenuButton.EXIT};
    }

    protected void Category(float f, float f2, int n, int n2) {
        long l = FontWeight ^ 0x7935D8156BB2L;
        int n3 = UIHelper.M();
        StringArrayHelper.f((float)0.0f, (float)0.0f, (float)n, (float)n2, (Color)q);
        ConfigHelper3 zv2 = HypixelPacketHandler.p().s();
        String[] stringArray = Property;
        FontRenderer z72 = zv2.FontWeight(stringArray[5]);
        int n4 = 15;
        int n5 = n3;
        String string = stringArray[10];
        z72.U(stringArray[7], ((float)n - z72.y(stringArray[7], 15.0f)) / 2.0f, 17.0f + ((float)n2 - z72.i(stringArray[7], 15.0f)) / 2.0f, 15.0f, W.getRGB());
        String string2 = stringArray[1];
        z72.U(stringArray[2], ((float)n - z72.y(stringArray[2], 15.0f)) / 2.0f, ((float)n2 - z72.i(stringArray[2], 15.0f)) / 2.0f, 15.0f, W.getRGB());
        String string3 = stringArray[8];
        z72.U(stringArray[4], ((float)n - z72.y(stringArray[4], 15.0f)) / 2.0f, -17.0f + ((float)n2 - z72.i(stringArray[4], 15.0f)) / 2.0f, 15.0f, W.getRGB());
        int n6 = 13;
        String string4 = stringArray[0];
        z72.U(stringArray[6], ((float)n - z72.y(stringArray[6], 13.0f)) / 2.0f, 100.0f + ((float)n2 - z72.i(stringArray[6], 13.0f)) / 2.0f, 13.0f, R.getRGB());
        String string5 = stringArray[9];
        try {
            z72.U(stringArray[3], ((float)n - z72.y(stringArray[3], 13.0f)) / 2.0f, 115.0f + ((float)n2 - z72.i(stringArray[3], 13.0f)) / 2.0f, 13.0f, R.getRGB());
            if (n5 != 0) {
                Module.o((Module[])new Module[5]);
            }
        }
        catch (JSONException jSONException) {
            throw zF.FontWeight(jSONException);
        }
    }

    protected void j(int n) {
        long l = FontWeight ^ 0x7D19964DC72CL;
        try {
            if (n == 256) {
                Y.S((TextRecord)UIPanel.StaticEventBus());
            }
        }
        catch (JSONException jSONException) {
            throw zF.FontWeight(jSONException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                zF.FontWeight = ObfuscationHelper.FontWeight((long)-1558762892976260235L, (long)-2683906452557966699L, MethodHandles.lookup().lookupClass()).FontWeight(64631875313989L);
                var0 = zF.FontWeight ^ 126049890022559L;
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
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "r-\u00ec\u0013\u00afQc\u00e9\u008dE\u00d1\u00a7\u00ef \u00ef\u001e~\u00d8\u00d2H7',\u0095\u00f2gpH\u00e22\u00d3\u00be\u00a8\u00f3\u00bc\u0011\u00de\u0011S\u00b4\u0018!\u0097\u0091\u00bfC\u00f6\u00d5n*\u00173s\u00b46\u00fb\u00d8\u0087\u00d8\u00c99\u0083\u00be\u007f0\u0018!\u0097\u0091\u00bfC\u00f6\u00d5n*\u00173s\u00b46\u00fb\u00d8\u0087\u00d8\u00c99\u0083\u00be\u007f0(<\u00bf\u00bbv~\u0000(?\u00e0\u00e4\u0095\u00c1\u00a1\u0005\u00b0D\u001d\u00faC\u00ee\u00b7[\u00e1\u001eGt\u000e1\u00d3\u00d4\u00f3\u0004\u00cc\u00adM\u0010\u0005{\u00fb\u00dc *\u00feiW\u00de)G6\u009d\u000eK9S\u00ac\u00b4\u00df\u00cf\Property\u00a0\u00df\u00ab&n\u00f4S9\u00d9\u00e2,\u001b\u00deH\u0010{\u00b0|&\u00fe\u009d9yHg\u0080\"\u0082$\u00f1k(r-\u00ec\u0013\u00afQc\u00e9\u008dE\u00d1\u00a7\u00ef \u00ef\u001e~\u00d8\u00d2H7',\u0095\u00f2gpH\u00e22\u00d3\u00be\u00a8\u00f3\u00bc\u0011\u00de\u0011S\u00b4 \u00fc\u00f9?\u00d6s\u007f\u00038\u00fbh{\u00af>\u00f1\u000f\u00b0\u00cb]\u008e~\u0087\u0002d\u0004\u0081\u00a0W\u001a\u00bf\u0098\u00ec\u00df *\u00feiW\u00de)G6\u009d\u000eK9S\u00ac\u00b4\u00df\u00cf\Property\u00a0\u00df\u00ab&n\u00f4S9\u00d9\u00e2,\u001b\u00deH";
                var8_6 = "r-\u00ec\u0013\u00afQc\u00e9\u008dE\u00d1\u00a7\u00ef \u00ef\u001e~\u00d8\u00d2H7',\u0095\u00f2gpH\u00e22\u00d3\u00be\u00a8\u00f3\u00bc\u0011\u00de\u0011S\u00b4\u0018!\u0097\u0091\u00bfC\u00f6\u00d5n*\u00173s\u00b46\u00fb\u00d8\u0087\u00d8\u00c99\u0083\u00be\u007f0\u0018!\u0097\u0091\u00bfC\u00f6\u00d5n*\u00173s\u00b46\u00fb\u00d8\u0087\u00d8\u00c99\u0083\u00be\u007f0(<\u00bf\u00bbv~\u0000(?\u00e0\u00e4\u0095\u00c1\u00a1\u0005\u00b0D\u001d\u00faC\u00ee\u00b7[\u00e1\u001eGt\u000e1\u00d3\u00d4\u00f3\u0004\u00cc\u00adM\u0010\u0005{\u00fb\u00dc *\u00feiW\u00de)G6\u009d\u000eK9S\u00ac\u00b4\u00df\u00cf\Property\u00a0\u00df\u00ab&n\u00f4S9\u00d9\u00e2,\u001b\u00deH\u0010{\u00b0|&\u00fe\u009d9yHg\u0080\"\u0082$\u00f1k(r-\u00ec\u0013\u00afQc\u00e9\u008dE\u00d1\u00a7\u00ef \u00ef\u001e~\u00d8\u00d2H7',\u0095\u00f2gpH\u00e22\u00d3\u00be\u00a8\u00f3\u00bc\u0011\u00de\u0011S\u00b4 \u00fc\u00f9?\u00d6s\u007f\u00038\u00fbh{\u00af>\u00f1\u000f\u00b0\u00cb]\u008e~\u0087\u0002d\u0004\u0081\u00a0W\u001a\u00bf\u0098\u00ec\u00df *\u00feiW\u00de)G6\u009d\u000eK9S\u00ac\u00b4\u00df\u00cf\Property\u00a0\u00df\u00ab&n\u00f4S9\u00d9\u00e2,\u001b\u00deH".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = zF.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "<\u00bf\u00bbv~\u0000(?\u00e0\u00e4\u0095\u00c1\u00a1\u0005\u00b0D\u001d\u00faC\u00ee\u00b7[\u00e1\u001eGt\u000e1\u00d3\u00d4\u00f3\u0004\u00cc\u00adM\u0010\u0005{\u00fb\u00dc \u00fc\u00f9?\u00d6s\u007f\u00038\u00fbh{\u00af>\u00f1\u000f\u00b0\u00cb]\u008e~\u0087\u0002d\u0004\u0081\u00a0W\u001a\u00bf\u0098\u00ec\u00df";
                    var8_6 = "<\u00bf\u00bbv~\u0000(?\u00e0\u00e4\u0095\u00c1\u00a1\u0005\u00b0D\u001d\u00faC\u00ee\u00b7[\u00e1\u001eGt\u000e1\u00d3\u00d4\u00f3\u0004\u00cc\u00adM\u0010\u0005{\u00fb\u00dc \u00fc\u00f9?\u00d6s\u007f\u00038\u00fbh{\u00af>\u00f1\u000f\u00b0\u00cb]\u008e~\u0087\u0002d\u0004\u0081\u00a0W\u001a\u00bf\u0098\u00ec\u00df".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = zF.FontWeight(var10_9).intern();
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
        zF.Property = var9_3;
        zF.q = new Color(11, 5, 18, 35);
        zF.W = UIHelper.N((Color)Color.WHITE, (double)0.5);
        zF.R = UIHelper.N((Color)Color.WHITE, (double)0.4000000059604645);
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
