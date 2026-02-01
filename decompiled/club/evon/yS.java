/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  org.json.JSONException
 */
package club.evon;

import club.evon._6;
import club.evon.ym;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_304;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class yS {
    private final Map<class_304, _6> m = new HashMap<class_304, _6>();
    private final _6 R;
    private final _6 g;
    private static yS n;
    private static boolean V;

    private yS() {
        this.R = this.I(new _6(ym.m.field_1690.field_1886));
        this.g = this.I(new _6(ym.m.field_1690.field_1904));
    }

    private <T extends _6> T I(T t) {
        this.m.put(t.L(), t);
        return t;
    }

    public void h() {
        this.R.r();
        this.g.r();
    }

    public static _6 t(class_304 class_3042) {
        return yS.n.m.get(class_3042);
    }

    public static _6 J() {
        return yS.n.R;
    }

    public static _6 e() {
        return yS.n.g;
    }

    public static void C() {
        n = new yS();
    }

    public static yS y() {
        return n;
    }

    public static void p(boolean bl) {
        V = bl;
    }

    public static boolean C() {
        return V;
    }

    public static boolean p() {
        boolean bl = yS.C();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (JSONException jSONException) {
            throw yS.a(jSONException);
        }
        return false;
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }

    static {
        if (yS.p()) {
            yS.p(true);
        }
    }
}
