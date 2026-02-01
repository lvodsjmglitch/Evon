/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

final class KillEffect
extends Enum<yM> {
    public static final /* enum */ yM NONE;
    public static final /* enum */ yM BLOOD;
    public static final /* enum */ yM LIGHTNING;
    public static final /* enum */ yM HEART;
    public static final /* enum */ yM EXPLOSION;
    private static final yM[] P;

    public static yM[] values() {
        return (yM[])P.clone();
    }

    public static yM valueOf(String string) {
        return Enum.valueOf(yM.class, string);
    }

    private static yM[] w() {
        return new yM[]{NONE, BLOOD, LIGHTNING, HEART, EXPLOSION};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[5];
                var4_1 = 0;
                var3_2 = "tEh4sfG~S\Category}Category\u007f0h{G\u007fZ\u0005yXy*EventDispatcher";
                var5_3 = "tEh4sfG~S\Category}Category\u007f0h{G\u007fZ\u0005yXy*EventDispatcher".length();
                var2_4 = 9;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 116;
                    PreMovementEvent = ++var1_5;
                    PacketSendEvent = var3_2.substring(PreMovementEvent, PreMovementEvent + var2_4);
                    PacketReceiveEvent = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "Df@\u0000O\u0004HeA\n";
                    var5_3 = "Df@\u0000O\u0004HeA\n".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 67;
                        v5 = ++var1_5;
                        PacketSendEvent = var3_2.substring(v5, v5 + var2_4);
                        PacketReceiveEvent = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = PacketSendEvent.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 69;
                            break;
                        }
                        case 1: {
                            v15 = 105;
                            break;
                        }
                        case 2: {
                            v15 = 76;
                            break;
                        }
                        case 3: {
                            v15 = 12;
                            break;
                        }
                        case 4: {
                            v15 = 72;
                            break;
                        }
                        case 5: {
                            v15 = 65;
                            break;
                        }
                        default: {
                            v15 = 122;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (PacketReceiveEvent) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        yM.NONE = new yM();
        yM.BLOOD = new yM();
        yM.LIGHTNING = new yM();
        yM.HEART = new yM();
        yM.EXPLOSION = new yM();
        yM.P = yM.w();
    }
}
