/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.StaticEventBus
 *  club.evon.EventDispatcher
 *  club.evon.JoinWorldEvent
 *  net.minecraft.class_4604
 */
package club.evon;

import club.evon.StaticEventBus;
import club.evon.EventListenerAnnotation;
import club.evon.EventDispatcher;
import club.evon.JoinWorldEvent;
import net.minecraft.class_4604;

public final class FrustumManager
implements EventDispatcher {
    private static final z3 Category = new z3();
    private static class_4604 X;

    public static void q(class_4604 class_46042) {
        X = class_46042;
    }

    @EventListenerAnnotation
    public void W(JoinWorldEvent vK2) {
        z3.q(null);
    }

    public static class_4604 v() {
        return X;
    }

    static {
        StaticEventBus.P((Object)Category);
    }
}
