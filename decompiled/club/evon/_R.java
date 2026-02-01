/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.gQ
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ds;
import club.evon.gQ;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;

public abstract class _R {
    private final String r;
    private final String H;
    private final String P;
    private final ArrayList<String> y;
    private static boolean C;
    private static final long a;

    public _R(String string, String string2, String string3, String ... stringArray) {
        long l = a ^ 0x3E312AF1E81BL;
        boolean bl = _R.M();
        boolean bl2 = bl;
        try {
            this.y = new ArrayList();
            this.r = string;
            this.H = string2;
            this.P = string3;
            this.y.addAll(Arrays.asList(stringArray));
            if (!bl2) {
                gQ.o((gQ[])new gQ[1]);
            }
        }
        catch (JSONException jSONException) {
            throw _R.b(jSONException);
        }
    }

    public abstract boolean x(String ... var1);

    public ArrayList<String> X() {
        return null;
    }

    public String E() {
        return this.r;
    }

    public String g() {
        return this.H;
    }

    public ArrayList<String> z() {
        return this.y;
    }

    public _R(String string, String string2, String string3) {
        this.y = new ArrayList();
        this.r = string;
        this.H = string2;
        this.P = string3;
    }

    public static void I(boolean bl) {
        C = bl;
    }

    public static boolean M() {
        return C;
    }

    public static boolean T() {
        boolean bl = _R.M();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (JSONException jSONException) {
            throw _R.b(jSONException);
        }
        return false;
    }

    static {
        a = ds.a((long)-1281884311225057803L, (long)-3964255313655418605L, MethodHandles.lookup().lookupClass()).a(267477038983450L);
        if (_R.T()) {
            _R.I(true);
        }
    }

    private static JSONException b(JSONException jSONException) {
        return jSONException;
    }
}
