/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.StaticEventBus
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.Event
 *  com.google.common.collect.ImmutableClassToInstanceMap
 *  com.google.common.collect.ImmutableClassToInstanceMap$Builder
 *  org.json.JSONException
 */
package club.evon;

import club.evon.StaticEventBus;
import club.evon.EventListenerAnnotation;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.Event;
import club.evon.zo;
import com.google.common.collect.ImmutableClassToInstanceMap;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;

public final class ModuleManager {
    private final ImmutableClassToInstanceMap<Module> V;
    private static String[] u;
    private static final long FontWeight;

    public yL(Module ... gQArray) {
        long l = FontWeight ^ 0x27A9723542D7L;
        ImmutableClassToInstanceMap.Builder builder = new ImmutableClassToInstanceMap.Builder();
        for (Module gQ2 : gQArray) {
            builder.put(gQ2.getClass(), (Object)gQ2);
        }
        this.V = builder.build();
        StaticEventBus.P((Object)this);
    }

    /*
     * Exception decompiling
     */
    @EventListenerAnnotation
    private void u(Event var1_1) {
        /*
         * This method has failed to decompile.  When submitting FontWeight bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
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

    public Collection<Module> j() {
        return this.V.values();
    }

    public Module i(String string) {
        Module gQ3;
        long l = FontWeight ^ 0x3512416E244BL;
        String[] stringArray = zo.k();
        try {
            gQ3 = this.j().stream().filter(gQ2 -> gQ2.x().replace(" ", "").equalsIgnoreCase(string.replace(" ", ""))).findFirst().orElse(null);
            if (Module.q() == null) {
                zo.Q((String[])new String[5]);
            }
        }
        catch (JSONException jSONException) {
            throw yL.FontWeight(jSONException);
        }
        return gQ3;
    }

    public List<Module> J(zo zo2) {
        long l = FontWeight ^ 0x6AB259AC8748L;
        ArrayList<Module> arrayList = new ArrayList<Module>();
        String[] stringArray = zo.k();
        for (Module gQ2 : this.j()) {
            block5: {
                try {
                    boolean bl;
                    try {
                        bl = gQ2.F().equals((Object)zo2);
                        if (stringArray != null || !bl) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yL.FontWeight(jSONException);
                    }
                    bl = arrayList.add(gQ2);
                }
                catch (JSONException jSONException) {
                    throw yL.FontWeight(jSONException);
                }
            }
            if (stringArray == null) continue;
            Module.o((Module[])new Module[3]);
            break;
        }
        return arrayList;
    }

    public <Category extends Module> Category R(Class<Category> clazz) {
        return (Category)((Module)this.V.getInstance(clazz));
    }

    public static void d(String[] stringArray) {
        u = stringArray;
    }

    public static String[] q() {
        return u;
    }

    static {
        FontWeight = ObfuscationHelper.FontWeight((long)-4296797870919973100L, (long)-6427448338481363843L, MethodHandles.lookup().lookupClass()).FontWeight(197882230620820L);
        if (yL.q() != null) {
            yL.d(new String[5]);
        }
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
