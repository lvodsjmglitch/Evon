/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.FontWeight
 */
package club.evon;

import club.evon.FontWeight;

class FontWeightMapper {
    static final int[] Z = new int[FontWeight.values().length];

    static {
        try {
            _8.Z[FontWeight.BOLD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _8.Z[FontWeight.SEMI_BOLD.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _8.Z[FontWeight.MEDIUM.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            _8.Z[FontWeight.REGULAR.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
