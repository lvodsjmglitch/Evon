/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

final class _U
extends Enum<_U> {
    public static final /* enum */ _U MODERN;
    public static final /* enum */ _U LEGACY;
    private static final _U[] N;

    public static _U[] values() {
        return (_U[])N.clone();
    }

    public static _U valueOf(String string) {
        return Enum.valueOf(_U.class, string);
    }

    private static _U[] T() {
        return new _U[]{MODERN, LEGACY};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            var0 = new String[2];
            var4_1 = 0;
            var3_2 = "2\u0002\u0002s$\u001b\u00063\b\u0001w5\f";
            var5_3 = "2\u0002\u0002s$\u001b\u00063\b\u0001w5\f".length();
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
            v1 = ++var1_5;
            v2 = var3_2.substring(v1, v1 + var2_4).toCharArray();
            v3 = v2.length;
            var6_6 = 0;
            v4 = 92;
            v5 = v2;
            v6 = v3;
            if (v3 > 1) ** GOTO lbl67
            do {
                v7 = v4;
                v5 = v5;
                v8 = v5;
                v9 = v4;
                v10 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v11 = 35;
                            break;
                        }
                        case 1: {
                            v11 = 17;
                            break;
                        }
                        case 2: {
                            v11 = 26;
                            break;
                        }
                        case 3: {
                            v11 = 106;
                            break;
                        }
                        case 4: {
                            v11 = 42;
                            break;
                        }
                        case 5: {
                            v11 = 9;
                            break;
                        }
                        default: {
                            v11 = 57;
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
        _U.MODERN = new _U();
        _U.LEGACY = new _U();
        _U.N = _U.T();
    }
}
