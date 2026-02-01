/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

import club.evon.zo;

class zS {
    static final int[] B = new int[zo.values().length];

    static {
        try {
            zS.B[zo.COMBAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.B[zo.MOTION.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.B[zo.PLAYER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.B[zo.RENDER.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.B[zo.MISC.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
