/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.EventMarker
 */
package club.evon;

import club.evon.EventMarker;

public final class TickEvent
implements EventMarker {
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
