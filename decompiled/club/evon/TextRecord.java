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

final class TextRecord
extends Record {
    private final class_2561 Event;
    private final class_2561 PacketSendEvent;
    private final int sC;

    private zZ(class_2561 class_25612, class_2561 class_25613, int n) {
        this.Event = class_25612;
        this.PacketSendEvent = class_25613;
        this.sC = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{zZ.class, "Event;PacketSendEvent;sC", "Event", "PacketSendEvent", "sC"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{zZ.class, "Event;PacketSendEvent;sC", "Event", "PacketSendEvent", "sC"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{zZ.class, "Event;PacketSendEvent;sC", "Event", "PacketSendEvent", "sC"}, this, object);
    }

    public class_2561 Event() {
        return this.Event;
    }

    public class_2561 PacketSendEvent() {
        return this.PacketSendEvent;
    }

    public int sC() {
        return this.sC;
    }
}
