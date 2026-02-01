/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 */
package club.evon;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2596;

public final class z9
extends Record {
    private final class_2596<?> xt;
    private final long ts;

    public z9(class_2596<?> class_25962, long l) {
        this.xt = class_25962;
        this.ts = l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{z9.class, "xt;ts", "xt", "ts"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z9.class, "xt;ts", "xt", "ts"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z9.class, "xt;ts", "xt", "ts"}, this, object);
    }

    public class_2596<?> Xt() {
        return this.xt;
    }

    public long ts() {
        return this.ts;
    }
}
