/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ObfuscationHelper;
import club.evon.Module;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;

public abstract class CommandBase {
    private final String r;
    private final String EventDispatcher;
    private final String P;
    private final ArrayList<String> y;
    private static boolean StaticEventBus;
    private static final long FontWeight;

    public _R(String string, String string2, String string3, String ... stringArray) {
        long l = FontWeight ^ 0x3E312AF1E81BL;
        boolean bl = _R.M();
        boolean bl2 = bl;
        try {
            this.y = new ArrayList();
            this.r = string;
            this.EventDispatcher = string2;
            this.P = string3;
            this.y.addAll(Arrays.asList(stringArray));
            if (!bl2) {
                Module.o((Module[])new Module[1]);
            }
        }
        catch (JSONException jSONException) {
            throw _R.Property(jSONException);
        }
    }

    public abstract boolean x(String ... var1);

    public ArrayList<String> X() {
        return null;
    }

    public String RenderEvent() {
        return this.r;
    }

    public String g() {
        return this.EventDispatcher;
    }

    public ArrayList<String> z() {
        return this.y;
    }

    public _R(String string, String string2, String string3) {
        this.y = new ArrayList();
        this.r = string;
        this.EventDispatcher = string2;
        this.P = string3;
    }

    public static void I(boolean bl) {
        StaticEventBus = bl;
    }

    public static boolean M() {
        return StaticEventBus;
    }

    public static boolean Category() {
        boolean bl = _R.M();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (JSONException jSONException) {
            throw _R.Property(jSONException);
        }
        return false;
    }

    static {
        FontWeight = ObfuscationHelper.FontWeight((long)-1281884311225057803L, (long)-3964255313655418605L, MethodHandles.lookup().lookupClass()).FontWeight(267477038983450L);
        if (_R.Category()) {
            _R.I(true);
        }
    }

    private static JSONException Property(JSONException jSONException) {
        return jSONException;
    }
}
