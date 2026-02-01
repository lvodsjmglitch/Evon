/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.gQ
 *  club.evon.vd
 */
package club.evon;

import club.evon.gQ;
import club.evon.vd;

public final class zI
implements vd {
    private static gQ[] o;

    public void b(float f, float f2) {
    }

    public float U() {
        return 0.0f;
    }

    public float M() {
        return 0.0f;
    }

    public int B() {
        return 0;
    }

    public static void K(gQ[] gQArray) {
        o = gQArray;
    }

    public static gQ[] O() {
        return o;
    }

    static {
        if (zI.O() != null) {
            zI.K(new gQ[2]);
        }
    }
}
