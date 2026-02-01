/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 */
package club.evon;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2561;

final class zZ
extends Record {
    private final class_2561 VT;
    private final class_2561 v2;
    private final int sC;

    private zZ(class_2561 class_25612, class_2561 class_25613, int n) {
        this.VT = class_25612;
        this.v2 = class_25613;
        this.sC = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zZ.class, "VT;v2;sC", "VT", "v2", "sC"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zZ.class, "VT;v2;sC", "VT", "v2", "sC"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zZ.class, "VT;v2;sC", "VT", "v2", "sC"}, this, object);
    }

    public class_2561 VT() {
        return this.VT;
    }

    public class_2561 V2() {
        return this.v2;
    }

    public int sC() {
        return this.sC;
    }
}
