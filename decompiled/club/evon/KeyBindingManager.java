/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 *  org.json.JSONException
 */
package club.evon;

import club.evon.KeyBindingWrapper;
import club.evon.MinecraftHelper;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.class_304;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class KeyBindingManager {
    private final Map<class_304, KeyBindingWrapper> m = new HashMap<class_304, KeyBindingWrapper>();
    private final KeyBindingWrapper R;
    private final KeyBindingWrapper g;
    private static yS n;
    private static boolean V;

    private yS() {
        this.R = this.I(new KeyBindingWrapper(MinecraftHelper.m.field_1690.field_1886));
        this.g = this.I(new KeyBindingWrapper(MinecraftHelper.m.field_1690.field_1904));
    }

    private <Category extends KeyBindingWrapper> Category I(Category Category) {
        this.m.put(Category.L(), Category);
        return Category;
    }

    public void EventDispatcher() {
        this.R.r();
        this.g.r();
    }

    public static KeyBindingWrapper Category(class_304 class_3042) {
        return yS.n.m.get(class_3042);
    }

    public static KeyBindingWrapper J() {
        return yS.n.R;
    }

    public static KeyBindingWrapper RenderEvent() {
        return yS.n.g;
    }

    public static void StaticEventBus() {
        n = new yS();
    }

    public static yS y() {
        return n;
    }

    public static void p(boolean bl) {
        V = bl;
    }

    public static boolean StaticEventBus() {
        return V;
    }

    public static boolean p() {
        boolean bl = yS.StaticEventBus();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (JSONException jSONException) {
            throw yS.FontWeight(jSONException);
        }
        return false;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }

    static {
        if (yS.p()) {
            yS.p(true);
        }
    }
}
