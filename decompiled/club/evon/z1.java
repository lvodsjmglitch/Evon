/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.lang.runtime.ObjectMethods;

public final class z1
extends Record {
    private final Object p;
    private final Method m;
    private final int k;

    public z1(Object object, Method method, int n) {
        this.p = object;
        this.m = method;
        this.k = -n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{z1.class, "p;m;k", "p", "m", "k"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{z1.class, "p;m;k", "p", "m", "k"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{z1.class, "p;m;k", "p", "m", "k"}, this, object);
    }

    public Object p() {
        return this.p;
    }

    public Method M() {
        return this.m;
    }

    public int k() {
        return this.k;
    }
}
