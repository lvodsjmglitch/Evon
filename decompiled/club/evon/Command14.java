/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.x
 *  org.json.JSONException
 */
package club.evon;

import club.evon.CommandBase;
import club.evon.Command14;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.x;
import club.evon.StringList;
import club.evon.EvonClient;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class Command14
extends CommandBase {
    private static final long Property;
    private static final String[] StaticEventBus;

    public _X() {
        String[] stringArray = StaticEventBus;
        super(stringArray[5], stringArray[2], stringArray[1]);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public boolean x(String[] var1_1) {
        block12: {
            block11: {
                var2_2 = _X.Property ^ 19586479340416L;
                var5_3 = EvonClient.p().q().i(var1_1[0]);
                var4_4 = _x.v();
                try {
                    try {
                        v0 = var5_3;
                        if (var4_4 == 0) break block11;
                        if (v0 != null) {
                        }
                        ** GOTO lbl22
                    }
                    catch (JSONException PreMovementEvent) {
                        throw _X.FontWeight(PreMovementEvent);
                    }
                    var5_3.n().P((Object)-1);
                    v0 = var5_3;
                }
                catch (JSONException PacketSendEvent) {
                    throw _X.FontWeight(PacketSendEvent);
                }
            }
            try {
                x.g((Object)(_X.StaticEventBus[0] + v0.x()));
                if (var4_4 != 0) break block12;
lbl22:
                // 2 sources

                x.k((String)(_X.StaticEventBus[3] + var1_1[0] + _X.StaticEventBus[4]));
            }
            catch (JSONException PacketReceiveEvent) {
                throw _X.FontWeight(PacketReceiveEvent);
            }
        }
        try {
            v4 = true;
            if (Module.q() == null) {
                _x.s((int)(++var4_4));
            }
        }
        catch (JSONException v5) {
            throw _X.FontWeight(v5);
        }
        return v4;
    }

    @Override
    public ArrayList<String> X() {
        return new StringList(this);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _X.Property = ObfuscationHelper.FontWeight((long)4014946694970223715L, (long)7416656690003381369L, MethodHandles.lookup().lookupClass()).FontWeight(72888976638111L);
                var0 = _X.Property ^ 115030422276796L;
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
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u00d6\u00cb\u00ce\u0006I\u0086\u0082f\u00b98\u00a8\u00ef\u00d2\u00d7\u0013p\u008d\u0002\u00b1\u00a4?y0\u00f2\u0010\u007f\u009d\u00a1rK\u00c2\u00fb\u00e8A\u0017B\u00d8\u00cd\u00bb\u00d4\u00cc \u0089\u000eiHK\u0016\u0098\u00b8\u00a6\u001az\u0012\u00dbS\u00cc\u00dc\u00d2\u000b\u00a7N\u00c0\u00db\u00c9\u0017?\u00b7\u00c3\u00f85Y\u00d2\u001d\Property\u00f7-\u00c8\u00af\u00caT\u00e0Z";
                var8_6 = "\u00d6\u00cb\u00ce\u0006I\u0086\u0082f\u00b98\u00a8\u00ef\u00d2\u00d7\u0013p\u008d\u0002\u00b1\u00a4?y0\u00f2\u0010\u007f\u009d\u00a1rK\u00c2\u00fb\u00e8A\u0017B\u00d8\u00cd\u00bb\u00d4\u00cc \u0089\u000eiHK\u0016\u0098\u00b8\u00a6\u001az\u0012\u00dbS\u00cc\u00dc\u00d2\u000b\u00a7N\u00c0\u00db\u00c9\u0017?\u00b7\u00c3\u00f85Y\u00d2\u001d\Property\u00f7-\u00c8\u00af\u00caT\u00e0Z".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = _X.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a1[\u00918\u00fd)l3'\u00f2\u00cdwh\u00a2\u0095\u00ed\Property\u00b9d\u00bd\u00d9V\u00fa\u00b9\u0007";
                    var8_6 = "\u00a1[\u00918\u00fd)l3'\u00f2\u00cdwh\u00a2\u0095\u00ed\Property\u00b9d\u00bd\u00d9V\u00fa\u00b9\u0007".length();
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
                    var9_3[var7_4++] = _X.FontWeight(var10_9).intern();
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
        _X.StaticEventBus = var9_3;
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
