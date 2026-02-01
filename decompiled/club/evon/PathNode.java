/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 */
package club.evon;

import java.util.ArrayList;
import net.minecraft.class_243;

public final class PathNode {
    private class_243 p;
    private z5 Property;
    private ArrayList<class_243> EventDispatcher;
    private double V;
    private double M;
    private double w;

    public class_243 W() {
        return this.p;
    }

    public z5 u() {
        return this.Property;
    }

    public ArrayList<class_243> v() {
        return this.EventDispatcher;
    }

    public double J() {
        return this.V;
    }

    public double M() {
        return this.M;
    }

    public double p() {
        return this.w;
    }

    public void o(class_243 class_2432) {
        this.p = class_2432;
    }

    public void I(z5 z52) {
        this.Property = z52;
    }

    public void y(ArrayList<class_243> arrayList) {
        this.EventDispatcher = arrayList;
    }

    public void K(double d) {
        this.V = d;
    }

    public void L(double d) {
        this.M = d;
    }

    public void o(double d) {
        this.w = d;
    }

    public z5(class_243 class_2432, z5 z52, ArrayList<class_243> arrayList, double d, double d2, double d3) {
        this.p = class_2432;
        this.Property = z52;
        this.EventDispatcher = arrayList;
        this.V = d;
        this.M = d2;
        this.w = d3;
    }
}
