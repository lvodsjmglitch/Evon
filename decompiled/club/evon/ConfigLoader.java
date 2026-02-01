/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

import club.evon.zo;

class ConfigLoader {
    static final int[] Property = new int[zo.values().length];

    static {
        try {
            zS.Property[zo.COMBAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[zo.MOTION.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[zo.PLAYER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[zo.RENDER.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[zo.MISC.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
