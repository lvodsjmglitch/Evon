/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.JL
 */
package club.evon;

import club.evon.JL;

public final class yN
implements JL {
    private static int[] o;

    public static void w(int[] nArray) {
        o = nArray;
    }

    public static int[] O() {
        return o;
    }

    static {
        if (yN.O() == null) {
            yN.w(new int[2]);
        }
    }
}
