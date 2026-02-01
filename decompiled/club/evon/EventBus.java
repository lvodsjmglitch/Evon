/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.Event
 */
package club.evon;

import club.evon.EventListenerAnnotation;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.Event;
import club.evon.EventListener;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class EventBus {
    private final Map<Type, CopyOnWriteArrayList<EventListener>> f = new HashMap<Type, CopyOnWriteArrayList<EventListener>>();
    private static Module[] V;
    private static final long FontWeight;

    public void u(Object object) {
        long l = FontWeight ^ 0x3BF9C920D0BCL;
        for (Method method : object.getClass().getDeclaredMethods()) {
            try {
                if (!method.isAnnotationPresent(EventListenerAnnotation.class)) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw yP.FontWeight(runtimeException);
            }
            EventListenerAnnotation _S2 = method.getDeclaredAnnotation(EventListenerAnnotation.class);
            try {
                if (!method.canAccess(object)) {
                    method.setAccessible(true);
                }
            }
            catch (RuntimeException runtimeException) {
                throw yP.FontWeight(runtimeException);
            }
            Class<?> clazz = method.getParameterTypes()[0];
            EventListener z12 = new EventListener(object, method, _S2.EventDispatcher());
            this.f.computeIfAbsent(clazz, type -> new CopyOnWriteArrayList()).add(z12);
        }
        this.N();
    }

    private void N() {
        long l = FontWeight ^ 0x4DE8ECBAF0E2L;
        for (CopyOnWriteArrayList<EventListener> copyOnWriteArrayList : this.f.values()) {
            copyOnWriteArrayList.sort(Comparator.comparingInt(EventListener::k));
        }
    }

    public void X(Object object) {
        long l = FontWeight ^ 0x4265BFD3AB54L;
        for (CopyOnWriteArrayList<EventListener> copyOnWriteArrayList : this.f.values()) {
            copyOnWriteArrayList.removeIf(z12 -> z12.p().equals(object));
        }
        this.N();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public <Category> void F(Category Category) {
        long l = FontWeight ^ 0x639C36CFF4D1L;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f.getOrDefault(Category.getClass(), null);
        try {
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) return;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw yP.FontWeight(illegalAccessException);
        }
        try {
            for (EventListener z12 : copyOnWriteArrayList) {
                z12.M().invoke(z12.p(), Category);
                if (!(Category instanceof Event)) continue;
                Event vt2 = (Event)Category;
                try {
                    if (!vt2.RenderEvent()) continue;
                    return;
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw yP.FontWeight(illegalAccessException);
                    return;
                }
            }
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    public static void M(Module[] gQArray) {
        V = gQArray;
    }

    public static Module[] u() {
        return V;
    }

    static {
        FontWeight = ObfuscationHelper.FontWeight((long)-7422857683936330028L, (long)3074906052788739506L, MethodHandles.lookup().lookupClass()).FontWeight(156229016609415L);
        if (yP.u() != null) {
            yP.M(new Module[5]);
        }
    }

    private static Exception FontWeight(Exception exception) {
        return exception;
    }
}
