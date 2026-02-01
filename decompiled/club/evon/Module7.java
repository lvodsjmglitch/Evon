/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ScreenHelper
 *  club.evon.Category
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ScreenHelper;
import club.evon.Category;
import org.json.JSONException;

public final class Module7
extends Enum<yY> {
    public static final /* enum */ yY SINGLEPLAYER;
    public static final /* enum */ yY MULTIPLAYER;
    public static final /* enum */ yY OPTIONS;
    public static final /* enum */ yY ACCOUNTS;
    public static final /* enum */ yY EXIT;
    private final Object Y;
    private static final yY[] f;
    private static boolean FontWeight;

    public static yY[] values() {
        return (yY[])f.clone();
    }

    public static yY valueOf(String string) {
        return Enum.valueOf(yY.class, string);
    }

    private yY() {
        this.Y = Category.O((String)this.toString());
    }

    private yY(String string2) {
        this.Y = new ScreenHelper(string2);
    }

    private static yY[] v() {
        return new yY[]{SINGLEPLAYER, MULTIPLAYER, OPTIONS, ACCOUNTS, EXIT};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[6];
                var4_1 = 0;
                var3_2 = "?_$xl\u0016*-\f-U)pu\u001d.2]>rk\Property\u001bd\u000eC\u0017(\u0010\u0019\u000b3I+cp\b2?RenderEvent\"RenderEvent";
                var5_3 = "?_$xl\u0016*-\f-U)pu\u001d.2]>rk\Property\u001bd\u000eC\u0017(\u0010\u0019\u000b3I+cp\b2?RenderEvent\"RenderEvent".length();
                var2_4 = 8;
                var1_5 = -1;
                yY.v(false);
lbl8:
                // 2 sources

                while (true) {
                    v0 = 10;
                    PreMovementEvent = ++var1_5;
                    PacketSendEvent = var3_2.substring(PreMovementEvent, PreMovementEvent + var2_4);
                    PacketReceiveEvent = -1;
                    break block19;
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "D;Q\u001c\u0007N3L\u0001\tiR";
                    var5_3 = "D;Q\u001c\u0007N3L\u0001\tiR".length();
                    var2_4 = 4;
                    var1_5 = -1;
lbl23:
                    // 2 sources

                    while (true) {
                        v0 = 117;
                        v5 = ++var1_5;
                        PacketSendEvent = var3_2.substring(v5, v5 + var2_4);
                        PacketReceiveEvent = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl29:
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
            if (v7 > 1) ** GOTO lbl86
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 116;
                            break;
                        }
                        case 1: {
                            v15 = 22;
                            break;
                        }
                        case 2: {
                            v15 = 109;
                            break;
                        }
                        case 3: {
                            v15 = 61;
                            break;
                        }
                        case 4: {
                            v15 = 51;
                            break;
                        }
                        case 5: {
                            v15 = 82;
                            break;
                        }
                        default: {
                            v15 = 116;
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
lbl86:
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
lbl96:
                // 1 sources

                ** continue;
            }
        }
        yY.SINGLEPLAYER = new yY();
        yY.MULTIPLAYER = new yY();
        yY.OPTIONS = new yY();
        yY.ACCOUNTS = new yY();
        yY.EXIT = new yY(var0[2]);
        yY.f = yY.v();
    }

    public static void v(boolean bl) {
        FontWeight = bl;
    }

    public static boolean k() {
        return FontWeight;
    }

    public static boolean L() {
        boolean bl = yY.k();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (JSONException jSONException) {
            throw yY.FontWeight(jSONException);
        }
        return false;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
