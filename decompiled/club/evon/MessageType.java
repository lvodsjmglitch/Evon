/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

public final class MessageType
extends Enum<zT> {
    public static final /* enum */ zT CHAT_MESSAGE;
    public static final /* enum */ zT DISGUISED_CHAT_MESSAGE;
    public static final /* enum */ zT GAME_MESSAGE;
    private static final zT[] k;

    public static zT[] values() {
        return (zT[])k.clone();
    }

    public static zT valueOf(String string) {
        return Enum.valueOf(zT.class, string);
    }

    private static zT[] G() {
        return new zT[]{CHAT_MESSAGE, DISGUISED_CHAT_MESSAGE, GAME_MESSAGE};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[3];
            var4_1 = 0;
            var3_2 = "\u0017/Q8\\2\u000b\u0003=]:F\u0016\u0014'O:V6\u001d\u0015*StaticEventBus>K>\u001a\u000f#Y.P>\Category\u0015\f\u0013&])\\2\u000b\u0003=]:F";
            var5_3 = "\u0017/Q8\\2\u000b\u0003=]:F\u0016\u0014'O:V6\u001d\u0015*StaticEventBus>K>\u001a\u000f#Y.P>\Category\u0015\f\u0013&])\\2\u000b\u0003=]:F".length();
            var2_4 = 12;
            var1_5 = -1;
lbl7:
            // 2 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 1 sources

            while (true) {
                var0[var4_1++] = new String(v0).intern();
                if ((var1_5 += var2_4) < var5_3) {
                    var2_4 = var3_2.charAt(var1_5);
                    ** continue;
                }
                break block13;
                break;
            }
            PreMovementEvent = ++var1_5;
            PacketSendEvent = var3_2.substring(PreMovementEvent, PreMovementEvent + var2_4).toCharArray();
            PacketReceiveEvent = PacketSendEvent.length;
            var6_6 = 0;
            v4 = 11;
            v5 = PacketSendEvent;
            v6 = PacketReceiveEvent;
            if (PacketReceiveEvent > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 91;
                            break;
                        }
                        case 1: {
                            v11 = 101;
                            break;
                        }
                        case 2: {
                            v11 = 23;
                            break;
                        }
                        case 3: {
                            v11 = 118;
                            break;
                        }
                        case 4: {
                            v11 = 8;
                            break;
                        }
                        case 5: {
                            v11 = 116;
                            break;
                        }
                        default: {
                            v11 = 69;
                        }
                    }
                    v8[v10] = (char)(v8[v10] ^ (v9 ^ v11));
                    ++var6_6;
                    v4 = v7;
                    if (v7 != 0) break;
                    v7 = v4;
                    v5 = v5;
                    v10 = v4;
                    v8 = v5;
                    v9 = v4;
                }
lbl67:
                // 2 sources

                v0 = v5;
                v6 = v6;
            } while (v6 > var6_6);
            ** while (true)
        }
        zT.CHAT_MESSAGE = new zT();
        zT.DISGUISED_CHAT_MESSAGE = new zT();
        zT.GAME_MESSAGE = new zT();
        zT.k = zT.G();
    }
}
