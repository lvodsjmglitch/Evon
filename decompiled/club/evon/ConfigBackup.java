/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

public final class ConfigBackup
extends Enum<zU> {
    public static final /* enum */ zU SUCCESS;
    public static final /* enum */ zU ERROR;
    public static final /* enum */ zU WARNING;
    public static final /* enum */ zU INFO;
    private static final /* synthetic */ zU[] i;

    public static zU[] values() {
        return (zU[])i.clone();
    }

    public static zU valueOf(String string) {
        return Enum.valueOf(zU.class, string);
    }

    private static /* synthetic */ zU[] N() {
        return new zU[]{SUCCESS, ERROR, WARNING, INFO};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[4];
                var4_1 = 0;
                var3_2 = ",i=\u0004{\u0007:n,\bl\u001e2";
                var5_3 = ",i=\u0004{\u0007:n,\bl\u001e2".length();
                var2_4 = 5;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 48;
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
                    var3_2 = "\u0002F\u00019\\?\u001a\u0004\u001cI\u00158";
                    var5_3 = "\u0002F\u00019\\?\u001a\u0004\u001cI\u00158".length();
                    var2_4 = 7;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 12;
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
                            v15 = 89;
                            break;
                        }
                        case 1: {
                            v15 = 11;
                            break;
                        }
                        case 2: {
                            v15 = 95;
                            break;
                        }
                        case 3: {
                            v15 = 123;
                            break;
                        }
                        case 4: {
                            v15 = 25;
                            break;
                        }
                        case 5: {
                            v15 = 125;
                            break;
                        }
                        default: {
                            v15 = 81;
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
        zU.SUCCESS = new zU();
        zU.ERROR = new zU();
        zU.WARNING = new zU();
        zU.INFO = new zU();
        zU.i = zU.N();
    }
}
