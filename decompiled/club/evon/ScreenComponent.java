/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.Module
 *  club.evon.HotbarManager
 */
package club.evon;

import club.evon.Module;
import club.evon.HotbarManager;

public final class ScreenComponent
implements HotbarManager {
    private static Module[] o;

    public void Property(float f, float f2) {
    }

    public float U() {
        return 0.0f;
    }

    public float M() {
        return 0.0f;
    }

    public int Property() {
        return 0;
    }

    public static void K(Module[] gQArray) {
        o = gQArray;
    }

    public static Module[] O() {
        return o;
    }

    static {
        if (zI.O() != null) {
            zI.K(new Module[2]);
        }
    }
}
