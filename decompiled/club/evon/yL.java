/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.C
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.vT
 *  com.google.common.collect.ImmutableClassToInstanceMap
 *  com.google.common.collect.ImmutableClassToInstanceMap$Builder
 *  org.json.JSONException
 */
package club.evon;

import club.evon.C;
import club.evon._S;
import club.evon.ds;
import club.evon.gQ;
import club.evon.vT;
import club.evon.zo;
import com.google.common.collect.ImmutableClassToInstanceMap;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;

public final class yL {
    private final ImmutableClassToInstanceMap<gQ> V;
    private static String[] u;
    private static final long a;

    public yL(gQ ... gQArray) {
        long l = a ^ 0x27A9723542D7L;
        ImmutableClassToInstanceMap.Builder builder = new ImmutableClassToInstanceMap.Builder();
        for (gQ gQ2 : gQArray) {
            builder.put(gQ2.getClass(), (Object)gQ2);
        }
        this.V = builder.build();
        C.P((Object)this);
    }

    /*
     * Exception decompiling
     */
    @_S
    private void u(vT var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [15[CASE]], but top level block is 13[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public Collection<gQ> j() {
        return this.V.values();
    }

    public gQ i(String string) {
        gQ gQ3;
        long l = a ^ 0x3512416E244BL;
        String[] stringArray = zo.k();
        try {
            gQ3 = this.j().stream().filter(gQ2 -> gQ2.x().replace(" ", "").equalsIgnoreCase(string.replace(" ", ""))).findFirst().orElse(null);
            if (gQ.q() == null) {
                zo.Q((String[])new String[5]);
            }
        }
        catch (JSONException jSONException) {
            throw yL.a(jSONException);
        }
        return gQ3;
    }

    public List<gQ> J(zo zo2) {
        long l = a ^ 0x6AB259AC8748L;
        ArrayList<gQ> arrayList = new ArrayList<gQ>();
        String[] stringArray = zo.k();
        for (gQ gQ2 : this.j()) {
            block5: {
                try {
                    boolean bl;
                    try {
                        bl = gQ2.F().equals((Object)zo2);
                        if (stringArray != null || !bl) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yL.a(jSONException);
                    }
                    bl = arrayList.add(gQ2);
                }
                catch (JSONException jSONException) {
                    throw yL.a(jSONException);
                }
            }
            if (stringArray == null) continue;
            gQ.o((gQ[])new gQ[3]);
            break;
        }
        return arrayList;
    }

    public <T extends gQ> T R(Class<T> clazz) {
        return (T)((gQ)this.V.getInstance(clazz));
    }

    public static void d(String[] stringArray) {
        u = stringArray;
    }

    public static String[] q() {
        return u;
    }

    static {
        a = ds.a((long)-4296797870919973100L, (long)-6427448338481363843L, MethodHandles.lookup().lookupClass()).a(197882230620820L);
        if (yL.q() != null) {
            yL.d(new String[5]);
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
    }
}
