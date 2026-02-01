/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

import club.evon.CollisionHelper;
import club.evon.ConfigInterface;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class UIBase
implements ConfigInterface {
    private float y;
    private float K;
    private float N;
    private float U;
    private static String[] X;

    @Override
    public void o(int n, int n2) {
    }

    @Override
    public void W(double d, double d2, int n) {
    }

    @Override
    public void EventDispatcher(double d, double d2, int n) {
    }

    @Override
    public void g(float f) {
    }

    @Override
    public void S(int n) {
    }

    @Override
    public void o() {
    }

    @Override
    public void Category() {
    }

    @Override
    public void R() {
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public boolean FontWeight(double d, double d2) {
        return CollisionHelper.J(d, d2, this.j(), this.F(), this.L(), this.m());
    }

    @Override
    public float j() {
        return this.y;
    }

    @Override
    public float F() {
        return this.K;
    }

    @Override
    public float L() {
        return this.N;
    }

    @Override
    public float m() {
        return this.U;
    }

    @Override
    public void F(float f) {
        this.y = f;
    }

    @Override
    public void q(float f) {
        this.K = f;
    }

    @Override
    public void V(float f) {
        this.N = f;
    }

    @Override
    public void U(float f) {
        this.U = f;
    }

    public static void L(String[] stringArray) {
        X = stringArray;
    }

    public static String[] l() {
        return X;
    }

    static {
        if (_V.l() != null) {
            _V.L(new String[1]);
        }
    }
}
