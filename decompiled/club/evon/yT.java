/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2558
 *  net.minecraft.class_2558$class_2559
 */
package club.evon;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_2558;

public final class yT
extends Record
implements class_2558 {
    private final Runnable rj;

    public yT(Runnable runnable) {
        this.rj = runnable;
    }

    public class_2558.class_2559 method_10845() {
        return class_2558.class_2559.field_60822;
    }

    public Runnable Rj() {
        return this.rj;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{yT.class, "rj", "rj"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{yT.class, "rj", "rj"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{yT.class, "rj", "rj"}, this, object);
    }
}
