/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

final class Side
extends Enum<_1> {
    public static final /* enum */ _1 CLIENT;
    public static final /* enum */ _1 SERVER;
    private static final _1[] X;

    public static _1[] values() {
        return (_1[])X.clone();
    }

    public static _1 valueOf(String string) {
        return Enum.valueOf(_1.class, string);
    }

    private static _1[] FontWeight() {
        return new _1[]{CLIENT, SERVER};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "StaticEventBus\u0014\u0018c``\u0006S\u001d\u0003pkf";
            var5_3 = "StaticEventBus\u0014\u0018c``\u0006S\u001d\u0003pkf".length();
            var2_4 = 6;
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
            v4 = 75;
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
                            v11 = 75;
                            break;
                        }
                        case 1: {
                            v11 = 19;
                            break;
                        }
                        case 2: {
                            v11 = 26;
                            break;
                        }
                        case 3: {
                            v11 = 109;
                            break;
                        }
                        case 4: {
                            v11 = 101;
                            break;
                        }
                        case 5: {
                            v11 = 127;
                            break;
                        }
                        default: {
                            v11 = 76;
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
        _1.CLIENT = new _1();
        _1.SERVER = new _1();
        _1.X = _1.FontWeight();
    }
}
