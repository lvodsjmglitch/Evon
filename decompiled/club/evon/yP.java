/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.vt
 */
package club.evon;

import club.evon._S;
import club.evon.ds;
import club.evon.gQ;
import club.evon.vt;
import club.evon.z1;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class yP {
    private final Map<Type, CopyOnWriteArrayList<z1>> f = new HashMap<Type, CopyOnWriteArrayList<z1>>();
    private static gQ[] V;
    private static final long a;

    public void u(Object object) {
        long l = a ^ 0x3BF9C920D0BCL;
        for (Method method : object.getClass().getDeclaredMethods()) {
            try {
                if (!method.isAnnotationPresent(_S.class)) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw yP.a(runtimeException);
            }
            _S _S2 = method.getDeclaredAnnotation(_S.class);
            try {
                if (!method.canAccess(object)) {
                    method.setAccessible(true);
                }
            }
            catch (RuntimeException runtimeException) {
                throw yP.a(runtimeException);
            }
            Class<?> clazz = method.getParameterTypes()[0];
            z1 z12 = new z1(object, method, _S2.h());
            this.f.computeIfAbsent(clazz, type -> new CopyOnWriteArrayList()).add(z12);
        }
        this.N();
    }

    private void N() {
        long l = a ^ 0x4DE8ECBAF0E2L;
        for (CopyOnWriteArrayList<z1> copyOnWriteArrayList : this.f.values()) {
            copyOnWriteArrayList.sort(Comparator.comparingInt(z1::k));
        }
    }

    public void X(Object object) {
        long l = a ^ 0x4265BFD3AB54L;
        for (CopyOnWriteArrayList<z1> copyOnWriteArrayList : this.f.values()) {
            copyOnWriteArrayList.removeIf(z12 -> z12.p().equals(object));
        }
        this.N();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public <T> void F(T t) {
        long l = a ^ 0x639C36CFF4D1L;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f.getOrDefault(t.getClass(), null);
        try {
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw yP.a(illegalAccessException);
        }
        try {
            for (z1 z12 : copyOnWriteArrayList) {
                z12.M().invoke(z12.p(), t);
                if (!(t instanceof vt)) continue;
                vt vt2 = (vt)t;
                try {
                    if (!vt2.e()) continue;
                    return;
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw yP.a(illegalAccessException);
                    return;
                }
            }
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    public static void M(gQ[] gQArray) {
        V = gQArray;
    }

    public static gQ[] u() {
        return V;
    }

    static {
        a = ds.a((long)-7422857683936330028L, (long)3074906052788739506L, MethodHandles.lookup().lookupClass()).a(156229016609415L);
        if (yP.u() != null) {
            yP.M(new gQ[5]);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}
