/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.x
 *  net.minecraft.class_124
 *  org.json.JSONException
 */
package club.evon;

import club.evon.Command8;
import club.evon.CommandBase;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.x;
import club.evon.EvonClient;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_124;
import org.json.JSONException;

public final class Command3
extends CommandBase {
    private static final long Property;
    private static final String[] StaticEventBus;

    public _I() {
        String[] stringArray = StaticEventBus;
        super(stringArray[5], stringArray[4], stringArray[0]);
    }

    @Override
    public boolean x(String[] stringArray) {
        boolean bl;
        long l = Property ^ 0x15359B68623CL;
        Module[] gQArray = Command8.Category();
        String string = String.valueOf(class_124.field_1080);
        String string2 = String.valueOf(class_124.field_1070);
        String string3 = String.valueOf(class_124.field_1067);
        String string4 = String.valueOf(class_124.field_1075);
        String[] stringArray2 = StaticEventBus;
        x.G((Object)(String.valueOf(class_124.field_1080) + stringArray2[2] + string4 + string3 + stringArray2[1] + string2 + string + stringArray2[6]));
        Module[] gQArray2 = gQArray;
        try {
            EvonClient.p().N().y().forEach(_R2 -> x.G((Object)("." + _R2.RenderEvent() + StaticEventBus[3] + _R2.g())));
            bl = true;
            if (gQArray2 == null) {
                Module.o((Module[])new Module[5]);
            }
        }
        catch (JSONException jSONException) {
            throw _I.FontWeight(jSONException);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _I.Property = ObfuscationHelper.FontWeight((long)-4330044864182294791L, (long)4920194909635544381L, MethodHandles.lookup().lookupClass()).FontWeight(81004988102220L);
                var0 = _I.Property ^ 82208156195876L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u00abj\u0005\u0006\u00e8\u0094\u00f4\u0005\u0010\u0013\u0003\u0002/m\u0094Q\u009a_\u0000\u0005\u00a3A\u0017\u0013\u00a4\u0018\u00c9\u00be\u001f(~\u0089\u00bf\u00b0\u00d6\u00f5n\u00d1\u009eM]6\u00f3\u0082'\u00afQt\u001a\u00b5\Property\u00ff\u00b3\u00a1sc\u0013[\u00df8\u0093\u00be\u0083\u0083\u00fa\u0098\u0006\u00c6?\u00f9F\u00a4[\u00eb}\u00c7\u00bc\u00c0!\u00daLe\u00f4\u00a1\u0099\u00c7\u0003\u007f@\u00d9\u00a4D\u000eB\u00b0\u001a3\u00ed\u0083\u008cg\u0085\u0018\u0094\u0096\u008b\u00fe\u00cc2\f\u00e5\u008fy!\u00e3J";
                var8_6 = "\u00abj\u0005\u0006\u00e8\u0094\u00f4\u0005\u0010\u0013\u0003\u0002/m\u0094Q\u009a_\u0000\u0005\u00a3A\u0017\u0013\u00a4\u0018\u00c9\u00be\u001f(~\u0089\u00bf\u00b0\u00d6\u00f5n\u00d1\u009eM]6\u00f3\u0082'\u00afQt\u001a\u00b5\Property\u00ff\u00b3\u00a1sc\u0013[\u00df8\u0093\u00be\u0083\u0083\u00fa\u0098\u0006\u00c6?\u00f9F\u00a4[\u00eb}\u00c7\u00bc\u00c0!\u00daLe\u00f4\u00a1\u0099\u00c7\u0003\u007f@\u00d9\u00a4D\u000eB\u00b0\u001a3\u00ed\u0083\u008cg\u0085\u0018\u0094\u0096\u008b\u00fe\u00cc2\f\u00e5\u008fy!\u00e3J".length();
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
                    var9_3[var7_4++] = _I.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00abj\u0005\u0006\u00e8\u0094\u00f4\u0005\u0018\u00ba\u00b7\u009d\u001cY\"\u008e\u00b0\u0004\u00c8\n\u00b7\u00e7\Property\u00b7%q\u0090\u00ce\u00d2Qq\u001f\u0089";
                    var8_6 = "\u00abj\u0005\u0006\u00e8\u0094\u00f4\u0005\u0018\u00ba\u00b7\u009d\u001cY\"\u008e\u00b0\u0004\u00c8\n\u00b7\u00e7\Property\u00b7%q\u0090\u00ce\u00d2Qq\u001f\u0089".length();
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
                    var9_3[var7_4++] = _I.FontWeight(var10_9).intern();
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
        _I.StaticEventBus = var9_3;
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
