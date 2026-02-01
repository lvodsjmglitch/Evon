/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

import club.evon.WebSocketHelper;

class CategorySwitch {
    static final int[] Property = new int[WebSocketHelper.values().length];

    static {
        try {
            zS.Property[WebSocketHelper.COMBAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[WebSocketHelper.MOTION.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[WebSocketHelper.PLAYER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[WebSocketHelper.RENDER.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            zS.Property[WebSocketHelper.MISC.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
