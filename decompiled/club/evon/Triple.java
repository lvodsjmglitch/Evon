/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

public class Triple<FontWeight, Property, StaticEventBus> {
    private FontWeight I;
    private Property P;
    private StaticEventBus M;

    public _B(FontWeight FontWeight, Property Property, StaticEventBus StaticEventBus) {
        this.I = FontWeight;
        this.P = Property;
        this.M = StaticEventBus;
    }

    public FontWeight m() {
        return this.I;
    }

    public Property StaticEventBus() {
        return this.P;
    }

    public StaticEventBus s() {
        return this.M;
    }

    public void RenderEvent(FontWeight FontWeight) {
        this.I = FontWeight;
    }

    public void n(Property Property) {
        this.P = Property;
    }

    public void Property(StaticEventBus StaticEventBus) {
        this.M = StaticEventBus;
    }
}
