/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.yB
 */
package club.evon;

import club.evon.yB;
import club.evon.za;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class yZ
extends Record {
    private final za j;
    private final yB l;

    public yZ(za za2, yB yB2) {
        this.j = za2;
        this.l = yB2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yZ.class, "j;l", "j", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yZ.class, "j;l", "j", "l"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yZ.class, "j;l", "j", "l"}, this, object);
    }

    public za j() {
        return this.j;
    }

    public yB L() {
        return this.l;
    }
}
