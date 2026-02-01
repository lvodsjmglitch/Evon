/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.RaycastResult
 */
package club.evon;

import club.evon.RaycastResult;
import club.evon.ConfigEntry;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class UIRecord
extends Record {
    private final ConfigEntry j;
    private final RaycastResult l;

    public yZ(ConfigEntry za2, RaycastResult yB2) {
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

    public ConfigEntry j() {
        return this.j;
    }

    public RaycastResult L() {
        return this.l;
    }
}
