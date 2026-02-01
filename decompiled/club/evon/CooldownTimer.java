/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  org.json.JSONException
 */
package club.evon;

import club.evon.MathUtil;
import club.evon.ObfuscationHelper;
import java.lang.invoke.MethodHandles;
import org.json.JSONException;

public final class CooldownTimer {
    private long Property = System.currentTimeMillis();
    private static final long FontWeight = ObfuscationHelper.FontWeight((long)6974182748901140546L, (long)-7136418505392342784L, MethodHandles.lookup().lookupClass()).FontWeight(195992737726736L);

    public boolean Z(long l, boolean bl) {
        boolean bl2;
        block8: {
            boolean bl3;
            block9: {
                long l2 = FontWeight ^ 0x67A641A65931L;
                bl3 = this.o(l);
                int[] nArray = MathUtil.Y();
                try {
                    try {
                        try {
                            try {
                                bl2 = bl3;
                                if (nArray != null) break block8;
                                if (!bl2) break block9;
                            }
                            catch (JSONException jSONException) {
                                throw Z.FontWeight(jSONException);
                            }
                            bl2 = bl;
                            if (nArray != null) break block8;
                        }
                        catch (JSONException jSONException) {
                            throw Z.FontWeight(jSONException);
                        }
                        if (!bl2) break block9;
                    }
                    catch (JSONException jSONException) {
                        throw Z.FontWeight(jSONException);
                    }
                    this.FontWeight();
                }
                catch (JSONException jSONException) {
                    throw Z.FontWeight(jSONException);
                }
            }
            bl2 = bl3;
        }
        return bl2;
    }

    public boolean o(long l) {
        long l2;
        block2: {
            block3: {
                long l3 = FontWeight ^ 0x6954D1A45ECAL;
                int[] nArray = MathUtil.Y();
                try {
                    long l4 = this.D() - l;
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (nArray != null) break block2;
                    if (l2 < 0) break block3;
                }
                catch (JSONException jSONException) {
                    throw Z.FontWeight(jSONException);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    public long D() {
        return System.currentTimeMillis() - this.Property;
    }

    public void FontWeight() {
        this.Property = System.currentTimeMillis();
    }

    public void O(long l) {
        this.Property -= l;
    }

    public long m() {
        return this.Property;
    }

    public void EventDispatcher(long l) {
        this.Property = l;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
