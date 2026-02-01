/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONException
 */
package club.evon;

import club.evon.HypixelCommand;
import club.evon.ObfuscationHelper;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class Module4
extends Enum<yV> {
    public static final /* enum */ yV RED;
    public static final /* enum */ yV GREEN;
    public static final /* enum */ yV BLUE;
    public static final /* enum */ yV YELLOW;
    public static final /* enum */ yV AQUA;
    public static final /* enum */ yV WHITE;
    public static final /* enum */ yV PINK;
    public static final /* enum */ yV GRAY;
    public final int mapColorId;
    public final int teamColor;
    private static final yV[] Property;
    private static final long FontWeight;

    public static yV[] values() {
        return (yV[])Property.clone();
    }

    public static yV valueOf(String string) {
        return Enum.valueOf(yV.class, string);
    }

    @Nullable
    public static yV F(int n) {
        long l = FontWeight ^ 0x40B30B8FDB23L;
        yV[] yVArray = yV.values();
        int n2 = yVArray.length;
        int n3 = 0;
        int n4 = HypixelCommand.RenderEvent();
        while (n3 < n2) {
            block5: {
                block6: {
                    yV yV2 = yVArray[n3];
                    try {
                        try {
                            if (n4 == 0) break block5;
                            if (yV2.teamColor != n) break block6;
                        }
                        catch (JSONException jSONException) {
                            throw yV.FontWeight(jSONException);
                        }
                        return yV2;
                    }
                    catch (JSONException jSONException) {
                        throw yV.FontWeight(jSONException);
                    }
                }
                ++n3;
            }
            if (n4 != 0) continue;
        }
        return null;
    }

    public int W() {
        return this.mapColorId;
    }

    public int StaticEventBus() {
        return this.teamColor;
    }

    private yV(int n2, int n3) {
        this.mapColorId = n2;
        this.teamColor = n3;
    }

    private static yV[] W() {
        return new yV[]{RED, GREEN, BLUE, YELLOW, AQUA, WHITE, PINK, GRAY};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        yV.FontWeight = ObfuscationHelper.FontWeight((long)8092263940224330396L, (long)495071701885811159L, MethodHandles.lookup().lookupClass()).FontWeight(85785444087219L);
                        var20 = yV.FontWeight ^ 11987414478684L;
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        PreMovementEvent = new byte[8];
                        PacketSendEvent = PreMovementEvent;
                        PreMovementEvent[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            PacketSendEvent = PacketSendEvent;
                            PacketSendEvent[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(PacketSendEvent)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[8];
                        var17_4 = 0;
                        var16_5 = "`\u00a0\u00d1\u00ad|rZ$\Property\u00f5\u00c5W'\u0091u\u0092\u00c7\bN\u0086\u00b3h\u001c\u008a\u00e3\u000e\Property\u00e0B\u0093\u00b5\u00166Y\u0085\bw\u00ee\u00c5\u0010U\u00c9\u00d6\u0014\b0\u0018u% \u00c1\u00a8\u001a";
                        var18_6 = "`\u00a0\u00d1\u00ad|rZ$\Property\u00f5\u00c5W'\u0091u\u0092\u00c7\bN\u0086\u00b3h\u001c\u008a\u00e3\u000e\Property\u00e0B\u0093\u00b5\u00166Y\u0085\bw\u00ee\u00c5\u0010U\u00c9\u00d6\u0014\b0\u0018u% \u00c1\u00a8\u001a".length();
                        var15_7 = 8;
                        var14_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            PacketReceiveEvent = ++var14_8;
                            v4 = var16_5.substring(PacketReceiveEvent, PacketReceiveEvent + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = yV.FontWeight(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\r\u00dc\u0088v\u00c4\u00fd\u00ff{\Property-\u00ef\u00ed0n\u00040\u00b9";
                            var18_6 = "\r\u00dc\u0088v\u00c4\u00fd\u00ff{\Property-\u00ef\u00ed0n\u00040\u00b9".length();
                            var15_7 = 8;
                            var14_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = yV.FontWeight(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[8];
                var4_13 = 0;
                var5_14 = "CooldownTimer\u0088i\u008c\u00ec2}\u00a3\u001d1W\u0086\u00c9\u00bfr\u0015\u00a4\u00cdR\u00904\u001fX\u009c\u00bc\u0011\u00c7XE\u0018\u00e9\u00adc\"|\u00e4\u00a9#\u00e9h;\u00d7m$\u0016\u00f7}V";
                var6_15 = "CooldownTimer\u0088i\u008c\u00ec2}\u00a3\u001d1W\u0086\u00c9\u00bfr\u0015\u00a4\u00cdR\u00904\u001fX\u009c\u00bc\u0011\u00c7XE\u0018\u00e9\u00adc\"|\u00e4\u00a9#\u00e9h;\u00d7m$\u0016\u00f7}V".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00e6oW\u009f\u0097\u00ee\u00e9\u00b5\"\u00ca.l\u00e0\u001b\u00e9\u0090";
                    var6_15 = "\u00e6oW\u009f\u0097\u00ee\u00e9\u00b5\"\u00ca.l\u00e0\u001b\u00e9\u0090".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl87:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl100:
                // 1 sources

                ** continue;
            }
        }
        yV.RED = new yV(28, (int)var0_12[2]);
        yV.GREEN = new yV(19, (int)var0_12[1]);
        yV.BLUE = new yV(25, (int)var0_12[6]);
        yV.YELLOW = new yV(18, (int)var0_12[5]);
        yV.AQUA = new yV(23, (int)var0_12[0]);
        yV.WHITE = new yV(8, (int)var0_12[7]);
        yV.PINK = new yV(20, (int)var0_12[4]);
        yV.GRAY = new yV(21, (int)var0_12[3]);
        yV.Property = yV.W();
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
