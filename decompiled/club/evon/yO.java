/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.y8
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ds;
import club.evon.y8;
import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public final class yO {
    private static final long a = ds.a((long)-569371252316894162L, (long)-5157143036116447286L, MethodHandles.lookup().lookupClass()).a(125148346995211L);

    public static boolean J(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7;
        block18: {
            block15: {
                String[] stringArray;
                block17: {
                    block16: {
                        block14: {
                            long l = a ^ 0xDEC2101A32CL;
                            stringArray = y8.m();
                            try {
                                try {
                                    d7 = d == d3 ? 0 : (d > d3 ? 1 : -1);
                                    if (stringArray != null) break block14;
                                    if (d7 < 0) break block15;
                                }
                                catch (JSONException jSONException) {
                                    throw yO.a(jSONException);
                                }
                                d7 = d2 == d4 ? 0 : (d2 > d4 ? 1 : -1);
                            }
                            catch (JSONException jSONException) {
                                throw yO.a(jSONException);
                            }
                        }
                        try {
                            try {
                                if (stringArray != null) break block16;
                                if (d7 < 0) break block15;
                            }
                            catch (JSONException jSONException) {
                                throw yO.a(jSONException);
                            }
                            double d8 = d - (d3 + d5);
                            d7 = d8 == 0.0 ? 0 : (d8 < 0.0 ? -1 : 1);
                        }
                        catch (JSONException jSONException) {
                            throw yO.a(jSONException);
                        }
                    }
                    try {
                        try {
                            if (stringArray != null) break block17;
                            if (d7 > 0) break block15;
                        }
                        catch (JSONException jSONException) {
                            throw yO.a(jSONException);
                        }
                        double d9 = d2 - (d4 + d6);
                        d7 = d9 == 0.0 ? 0 : (d9 < 0.0 ? -1 : 1);
                    }
                    catch (JSONException jSONException) {
                        throw yO.a(jSONException);
                    }
                }
                try {
                    if (stringArray != null) break block18;
                    if (d7 > 0) break block15;
                }
                catch (JSONException jSONException) {
                    throw yO.a(jSONException);
                }
                d7 = 1.0;
                break block18;
            }
            d7 = 0.0;
        }
        return (boolean)d7;
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
