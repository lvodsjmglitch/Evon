/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.J6
 *  club.evon.Js
 *  club.evon.ScreenHelper
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.PacketHelper
 *  club.evon.StringArrayHelper
 *  org.json.JSONException
 *  org.lwjgl.nanovg.NVGColor
 *  org.lwjgl.nanovg.NVGPaint
 *  org.lwjgl.nanovg.NanoVG
 */
package club.evon;

import club.evon.J6;
import club.evon.Js;
import club.evon.ScreenHelper;
import club.evon.Command2;
import club.evon.AnimationValue;
import club.evon.MathUtil;
import club.evon.ModuleBase;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.PacketHelper;
import club.evon.StringArrayHelper;
import club.evon.ModuleManager;
import club.evon.CollisionHelper;
import club.evon.Animation;
import club.evon.zW;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoVG;

public final class Command5
extends MathUtil {
    private final Module FontWeight;
    private final Command2 I;
    private static final ScreenHelper n;
    private static final float StaticEventBus = 12.5f;
    private static final int d;
    private boolean w;
    private final AnimationValue Q;
    private final AnimationValue j;
    private final List<ModuleBase<?>> x;
    public static final Color Y;
    private static final Color m;
    private static final Animation Category;
    private static final Animation i;
    private static final float s = 5.5f;
    private static final float R = 3.5f;
    private static final int Z;
    private final AnimationValue StaticEventBus;
    private static final long Property;

    /*
     * Exception decompiling
     */
    public _L(Module var1_1, Command2 var2_2) {
        /*
         * This method has failed to decompile.  When submitting FontWeight bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 3[SWITCH]
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

    @Override
    public void o() {
        block6: {
            double d;
            AnimationValue _J2;
            long l = Property ^ 0x3E3172ECADA7L;
            Iterator<ModuleBase<?>> iterator = this.x.iterator();
            String[] stringArray = ModuleManager.q();
            while (iterator.hasNext()) {
                zW zW2 = (zW)((Object)iterator.next());
                try {
                    zW2.o();
                    if (stringArray == null) {
                        if (stringArray == null) continue;
                        break;
                    }
                    break block6;
                }
                catch (JSONException jSONException) {
                    throw _L.FontWeight(jSONException);
                }
            }
            try {
                _J2 = this.StaticEventBus;
                d = this.FontWeight.d() ? 1.0 : 0.0;
            }
            catch (JSONException jSONException) {
                throw _L.FontWeight(jSONException);
            }
            _J2.u(d);
        }
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void l(int var1_1, int var2_2) {
        block83: {
            block80: {
                block81: {
                    block79: {
                        block77: {
                            block78: {
                                block71: {
                                    block72: {
                                        block73: {
                                            block74: {
                                                block70: {
                                                    block69: {
                                                        block67: {
                                                            block68: {
                                                                var3_3 = _L.Property ^ 129512971229078L;
                                                                var6_4 = this.j();
                                                                var5_5 = ModuleManager.q();
                                                                var7_6 = this.F();
                                                                var8_7 = this.L();
                                                                var9_8 = this.m();
                                                                try {
                                                                    v0 = this.Q;
                                                                    PreMovementEvent = this.w != false ? 1.0 : 0.0;
                                                                }
                                                                catch (JSONException PacketSendEvent) {
                                                                    throw _L.FontWeight(PacketSendEvent);
                                                                }
                                                                v0.N(PreMovementEvent);
                                                                var10_9 = this.Q.y().floatValue();
                                                                var11_10 = this.FontWeight.d();
                                                                try {
                                                                    PacketReceiveEvent = this.StaticEventBus;
                                                                    v4 = var11_10 != false ? 1.0 : 0.0;
                                                                }
                                                                catch (JSONException v5) {
                                                                    throw _L.FontWeight(v5);
                                                                }
                                                                PacketReceiveEvent.N(v4);
                                                                var12_11 = super.m();
                                                                try {
                                                                    try {
                                                                        StringArrayHelper.Z((float)var6_4, (float)var7_6, (float)var8_7, (float)var9_8, (float)4.0f, (Color)J6.N((Color)Color.WHITE, (double)0.07500000298023224));
                                                                        v6 = this.j;
                                                                        v7 = var1_1;
                                                                        if (var5_5 != null) break block67;
                                                                        if (!CollisionHelper.J(v7, var2_2, var6_4, var7_6, var8_7, var12_11)) break block68;
                                                                    }
                                                                    catch (JSONException v8) {
                                                                        throw _L.FontWeight(v8);
                                                                    }
                                                                    v7 = 1.0;
                                                                    break block67;
                                                                }
                                                                catch (JSONException v9) {
                                                                    throw _L.FontWeight(v9);
                                                                }
                                                            }
                                                            v7 = 0.0;
                                                        }
                                                        try {
                                                            try {
                                                                v6.N(v7);
                                                                if (var5_5 != null) break block69;
                                                                if (!CollisionHelper.J(var1_1, var2_2, var6_4, var7_6, var8_7, var12_11)) break block70;
                                                            }
                                                            catch (JSONException v10) {
                                                                throw _L.FontWeight(v10);
                                                            }
                                                            StringArrayHelper.y((float)var6_4, (float)var7_6, (float)var8_7, (float)var12_11);
                                                        }
                                                        catch (JSONException v11) {
                                                            throw _L.FontWeight(v11);
                                                        }
                                                    }
                                                    try {
                                                        v12 = var6_4;
                                                        v13 = var7_6;
                                                        v14 = var8_7;
                                                        v15 = var9_8;
                                                        v16 = 4.0f;
                                                        v17 = Color.WHITE;
                                                        v18 = var11_10 == false ? 0.07000000029802322 : 0.10000000149011612;
                                                    }
                                                    catch (JSONException v19) {
                                                        throw _L.FontWeight(v19);
                                                    }
                                                    StringArrayHelper.Z((float)v12, (float)v13, (float)v14, (float)v15, (float)v16, (Color)J6.N((Color)v17, (double)v18));
                                                    StringArrayHelper.v();
                                                }
                                                var13_12 = this.StaticEventBus.y().floatValue();
                                                var14_13 = 0.85f;
                                                var15_14 = 0.425f;
                                                try {
                                                    StringArrayHelper.s((float)(var6_4 + 0.425f), (float)(var7_6 + 0.425f), (float)(var8_7 - 0.85f), (float)(var9_8 - 0.85f), (float)4.0f, (float)0.85f, (Color)new Color(184, 202, 209, (int)(19.0f + 31.0f * var13_12)));
                                                    cfr_temp_0 = var13_12 - 0.0f;
                                                    v20 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                                                    if (var5_5 != null) break block71;
                                                    if (v20 <= 0) break block72;
                                                }
                                                catch (JSONException v21) {
                                                    throw _L.FontWeight(v21);
                                                }
                                                var16_15 = PacketHelper.d();
                                                var17_16 = PacketHelper.Category();
                                                try {
                                                    try {
                                                        v22 = var10_9;
                                                        if (var5_5 != null) break block73;
                                                        if (!(v22 > 0.0f)) break block74;
                                                    }
                                                    catch (JSONException v23) {
                                                        throw _L.FontWeight(v23);
                                                    }
                                                    StringArrayHelper.y((float)var6_4, (float)var7_6, (float)var8_7, (float)var12_11);
                                                }
                                                catch (JSONException v24) {
                                                    throw _L.FontWeight(v24);
                                                }
                                            }
                                            v22 = 0.5f;
                                        }
                                        var18_19 = v22;
                                        var19_20 = 4.0f;
                                        var20_21 = NVGPaint.calloc();
                                        var21_23 = StringArrayHelper.V((int)J6.N((Color)var16_15, (double)(0.5f * var13_12)).getRGB());
                                        var22_24 /* !! */  = StringArrayHelper.V((int)J6.N((Color)var17_16, (double)(0.5f * var13_12)).getRGB());
                                        try {
                                            NanoVG.nvgLinearGradient((long)StringArrayHelper.I, (float)var6_4, (float)var7_6, (float)(var6_4 + var8_7), (float)(var7_6 + var12_11), (NVGColor)var21_23, (NVGColor)var22_24 /* !! */ , (NVGPaint)var20_21);
                                            NanoVG.nvgBeginPath((long)StringArrayHelper.I);
                                            NanoVG.nvgFillPaint((long)StringArrayHelper.I, (NVGPaint)var20_21);
                                            NanoVG.nvgRoundedRect((long)StringArrayHelper.I, (float)var6_4, (float)var7_6, (float)var8_7, (float)var9_8, (float)4.0f);
                                            NanoVG.nvgFill((long)StringArrayHelper.I);
                                            NanoVG.nvgClosePath((long)StringArrayHelper.I);
                                            var21_23.free();
                                            var22_24 /* !! */ .free();
                                            var20_21.free();
                                            cfr_temp_1 = var10_9 - 0.0f;
                                            v20 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                                            if (var5_5 != null) break block71;
                                            if (v20 <= 0) break block72;
                                        }
                                        catch (JSONException v25) {
                                            throw _L.FontWeight(v25);
                                        }
                                        StringArrayHelper.v();
                                        StringArrayHelper.y((float)var6_4, (float)(var7_6 + var12_11), (float)var8_7, (float)(var9_8 - var12_11));
                                        var23_25 = 0.3f;
                                        var24_26 = super.m();
                                        for (ModuleBase<?> var26_28 : this.x) {
                                            block75: {
                                                block76: {
                                                    try {
                                                        try {
                                                            try {
                                                                if (var5_5 != null) break block75;
                                                                v20 = (int)var26_28.l();
                                                                if (var5_5 != null) break block71;
                                                            }
                                                            catch (JSONException v26) {
                                                                throw _L.FontWeight(v26);
                                                            }
                                                            if (v20 != 0) break block76;
                                                        }
                                                        catch (JSONException v27) {
                                                            throw _L.FontWeight(v27);
                                                        }
                                                        if (var5_5 == null) continue;
                                                    }
                                                    catch (JSONException v28) {
                                                        throw _L.FontWeight(v28);
                                                    }
                                                    Module.o((Module[])new Module[5]);
                                                }
                                                var24_26 += var26_28.m();
                                            }
                                            if (var5_5 == null) continue;
                                        }
                                        StringArrayHelper.S((float)var6_4, (float)var7_6, (float)var8_7, (float)var24_26, (float)4.0f, (Color)J6.N((Color)var16_15, (double)(0.3f * var13_12)), (Color)J6.N((Color)var17_16, (double)(0.3f * var13_12)), (boolean)true);
                                        StringArrayHelper.v();
                                    }
                                    v20 = (cfr_temp_2 = var10_9 - 0.0f) == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var5_5 != null) break block77;
                                                if (v20 <= 0) break block78;
                                            }
                                            catch (JSONException v29) {
                                                throw _L.FontWeight(v29);
                                            }
                                            cfr_temp_3 = var13_12 - 1.0f;
                                            v20 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
                                            if (var5_5 != null) break block77;
                                        }
                                        catch (JSONException v30) {
                                            throw _L.FontWeight(v30);
                                        }
                                        if (v20 >= 0) break block78;
                                    }
                                    catch (JSONException v31) {
                                        throw _L.FontWeight(v31);
                                    }
                                    StringArrayHelper.y((float)var6_4, (float)(var7_6 + var12_11), (float)var8_7, (float)(var9_8 - var12_11));
                                    StringArrayHelper.Z((float)var6_4, (float)var7_6, (float)var8_7, (float)var9_8, (float)4.0f, (Color)J6.N((Color)Color.WHITE, (double)(0.05f * (1.0f - var13_12))));
                                    StringArrayHelper.v();
                                }
                                catch (JSONException v32) {
                                    throw _L.FontWeight(v32);
                                }
                            }
                            v20 = (cfr_temp_4 = var13_12 - 1.0f) == 0.0f ? 0 : (cfr_temp_4 > 0.0f ? 1 : -1);
                        }
                        try {
                            if (var5_5 != null) break block79;
                            if (v20 == 0) {
                            }
                            ** GOTO lbl187
                        }
                        catch (JSONException v33) {
                            throw _L.FontWeight(v33);
                        }
                        var16_15 = Color.WHITE;
                        try {
                            if (var5_5 == null) break block80;
lbl187:
                            // 2 sources

                            v20 = (cfr_temp_5 = var13_12 - 0.0f) == 0.0f ? 0 : (cfr_temp_5 > 0.0f ? 1 : -1);
                        }
                        catch (JSONException v34) {
                            throw _L.FontWeight(v34);
                        }
                    }
                    try {
                        if (var5_5 != null) break block81;
                        if (v20 == 0) {
                        }
                        ** GOTO lbl202
                    }
                    catch (JSONException v35) {
                        throw _L.FontWeight(v35);
                    }
                    var16_15 = Js.X;
                    try {
                        if (var5_5 == null) break block80;
lbl202:
                        // 2 sources

                        v20 = (int)((float)Js.X.getRed() + (float)(255 - Js.X.getRed()) * var13_12);
                    }
                    catch (JSONException v36) {
                        throw _L.FontWeight(v36);
                    }
                }
                var17_17 = v20;
                var16_15 = new Color((int)var17_17, (int)var17_17, (int)var17_17);
            }
            _L.Category.U(this.FontWeight.x(), var6_4 + 4.5f, var7_6 + 7.5f, 7.5f, var16_15.getRGB());
            if (!this.x.isEmpty()) {
                block82: {
                    var17_18 = (var12_11 - 12.5f) / 2.0f;
                    var18_19 = var7_6 + var17_18;
                    var19_20 = var6_4 + var8_7 - (12.5f + var17_18);
                    try {
                        try {
                            _L.k(var19_20, var18_19);
                            StringArrayHelper.j();
                            StringArrayHelper.Property((float)(var19_20 + 6.25f), (float)(var18_19 + 6.25f));
                            StringArrayHelper.F((float)(3.125f * var10_9));
                            StringArrayHelper.Property((float)-2.75f, (float)-1.75f);
                            StringArrayHelper.G((float)0.0f, (float)0.0f, (float)5.5f, (float)3.5f, null, (ScreenHelper)_L.n);
                            StringArrayHelper.g();
                            v37 = var10_9;
                            v38 = 0.0f;
                            if (var5_5 != null) break block82;
                            if (!(v37 > v38)) break block83;
                        }
                        catch (JSONException v39) {
                            throw _L.FontWeight(v39);
                        }
                        StringArrayHelper.y((float)var6_4, (float)var7_6, (float)var8_7, (float)var9_8);
                        v37 = var7_6;
                        v38 = var12_11;
                    }
                    catch (JSONException v40) {
                        throw _L.FontWeight(v40);
                    }
                }
                var20_22 = v37 + v38;
                for (NVGColor var22_24 : this.x) {
                    block86: {
                        block87: {
                            block84: {
                                block85: {
                                    try {
                                        try {
                                            try {
                                                if (var5_5 != null) break block83;
                                                v41 = var22_24 /* !! */ .l();
                                                if (var5_5 != null) break block84;
                                            }
                                            catch (JSONException v42) {
                                                throw _L.FontWeight(v42);
                                            }
                                            if (v41 != 0) break block85;
                                        }
                                        catch (JSONException v43) {
                                            throw _L.FontWeight(v43);
                                        }
                                        if (var5_5 == null) continue;
                                    }
                                    catch (JSONException v44) {
                                        throw _L.FontWeight(v44);
                                    }
                                }
                                try {
                                    var22_24 /* !! */ .F(var6_4);
                                    var22_24 /* !! */ .q(var20_22);
                                    var22_24 /* !! */ .V(var8_7);
                                    var22_24 /* !! */ .U(14.0f);
                                    v45 = var22_24 /* !! */ .F() - this.I.F();
                                    v46 = this.I.m();
                                    if (var5_5 != null) break block86;
                                    cfr_temp_6 = v45 - v46;
                                    v41 = cfr_temp_6 == 0.0f ? 0 : (cfr_temp_6 < 0.0f ? -1 : 1);
                                }
                                catch (JSONException v47) {
                                    throw _L.FontWeight(v47);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (v41 >= 0) break block87;
                                        v45 = var22_24 /* !! */ .F() + var22_24 /* !! */ .m();
                                        v46 = this.I.F() + this.I.K();
                                        if (var5_5 != null) break block86;
                                    }
                                    catch (JSONException v48) {
                                        throw _L.FontWeight(v48);
                                    }
                                    if (!(v45 >= v46)) break block87;
                                }
                                catch (JSONException v49) {
                                    throw _L.FontWeight(v49);
                                }
                                var22_24 /* !! */ .l(var1_1, var2_2);
                            }
                            catch (JSONException v50) {
                                throw _L.FontWeight(v50);
                            }
                        }
                        v45 = var20_22;
                        v46 = var22_24 /* !! */ .m();
                    }
                    var20_22 = v45 + v46;
                    if (var5_5 == null) continue;
                }
                StringArrayHelper.v();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void W(double var1_1, double var3_2, int var5_3) {
        block47: {
            block49: {
                block50: {
                    block48: {
                        block46: {
                            block36: {
                                block37: {
                                    block44: {
                                        block45: {
                                            block42: {
                                                block43: {
                                                    block38: {
                                                        block39: {
                                                            var6_4 = _L.Property ^ 132436237984213L;
                                                            var9_5 = CollisionHelper.J(var1_1, var3_2, this.j(), this.F(), this.L(), super.m());
                                                            var8_6 = ModuleManager.q();
                                                            var10_7 = 0;
                                                            try {
                                                                try {
                                                                    try {
                                                                        v0 = this.x.isEmpty();
                                                                        if (var8_6 != null) break block36;
                                                                        if (v0 != 0) break block37;
                                                                    }
                                                                    catch (JSONException PreMovementEvent) {
                                                                        throw _L.FontWeight(PreMovementEvent);
                                                                    }
                                                                    PacketSendEvent = this;
                                                                    if (var8_6 != null) break block38;
                                                                }
                                                                catch (JSONException PacketReceiveEvent) {
                                                                    throw _L.FontWeight(PacketReceiveEvent);
                                                                }
                                                                if (PacketSendEvent.Q.y() != 1.0) break block39;
                                                            }
                                                            catch (JSONException v4) {
                                                                throw _L.FontWeight(v4);
                                                            }
                                                            for (ModuleBase<?> var12_10 : this.x) {
                                                                block41: {
                                                                    block40: {
                                                                        try {
                                                                            try {
                                                                                v0 = (int)var12_10.l();
                                                                                if (var8_6 != null) break block36;
                                                                                if (var8_6 != null) break block40;
                                                                            }
                                                                            catch (JSONException v5) {
                                                                                throw _L.FontWeight(v5);
                                                                            }
                                                                            if (v0 == 0) continue;
                                                                        }
                                                                        catch (JSONException v6) {
                                                                            throw _L.FontWeight(v6);
                                                                        }
                                                                        try {
                                                                            v7 = var12_10;
                                                                            v8 = var1_1;
                                                                            v9 = var3_2;
                                                                            if (var8_6 != null) break block41;
                                                                            v10 = v7.FontWeight(v8, v9);
                                                                        }
                                                                        catch (JSONException v11) {
                                                                            throw _L.FontWeight(v11);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (!v10 && var8_6 == null) continue;
                                                                    }
                                                                    catch (JSONException v12) {
                                                                        throw _L.FontWeight(v12);
                                                                    }
                                                                    v7 = var12_10;
                                                                    v8 = var1_1;
                                                                    v9 = var3_2;
                                                                }
                                                                v7.W(v8, v9, var5_3);
                                                                if (var8_6 == null) continue;
                                                            }
                                                        }
                                                        PacketSendEvent = this;
                                                    }
                                                    var11_9 = (super.m() - 12.5f) / 2.0f;
                                                    var12_11 = this.j() + this.L() - (12.5f + var11_9);
                                                    var13_12 = this.F() + var11_9;
                                                    var10_7 = (int)CollisionHelper.J(var1_1, var3_2, var12_11, var13_12, 12.5, 12.5);
                                                    try {
                                                        try {
                                                            try {
                                                                v0 = var5_3;
                                                                if (var8_6 != null) break block42;
                                                                if (v0 != 1) break block43;
                                                            }
                                                            catch (JSONException v13) {
                                                                throw _L.FontWeight(v13);
                                                            }
                                                            v0 = (int)var9_5;
                                                            if (var8_6 != null) break block42;
                                                        }
                                                        catch (JSONException v14) {
                                                            throw _L.FontWeight(v14);
                                                        }
                                                        if (v0 == 0) {
                                                        }
                                                        ** GOTO lbl94
                                                    }
                                                    catch (JSONException v15) {
                                                        throw _L.FontWeight(v15);
                                                    }
                                                }
                                                v0 = var10_7;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (var8_6 != null) break block36;
                                                        if (v0 == 0) break block37;
                                                    }
                                                    catch (JSONException v16) {
                                                        throw _L.FontWeight(v16);
                                                    }
lbl94:
                                                    // 2 sources

                                                    v17 = this;
                                                    v18 = this.w;
                                                    if (var8_6 != null) break block44;
                                                }
                                                catch (JSONException v19) {
                                                    throw _L.FontWeight(v19);
                                                }
                                                if (v18) break block45;
                                            }
                                            catch (JSONException v20) {
                                                throw _L.FontWeight(v20);
                                            }
                                            v18 = true;
                                            break block44;
                                        }
                                        v18 = false;
                                    }
                                    v17.w = v18;
                                }
                                v0 = var5_3;
                            }
                            try {
                                if (var8_6 != null) break block46;
                                if (v0 != 0) break block47;
                            }
                            catch (JSONException v21) {
                                throw _L.FontWeight(v21);
                            }
                            v0 = var10_7;
                        }
                        try {
                            if (var8_6 != null) break block48;
                            if (v0 != 0) break block47;
                        }
                        catch (JSONException v22) {
                            throw _L.FontWeight(v22);
                        }
                        v0 = (int)var9_5;
                    }
                    try {
                        try {
                            if (v0 == 0) break block47;
                            v23 = this.FontWeight;
                            v24 = this.FontWeight.d();
                            if (var8_6 != null) break block49;
                        }
                        catch (JSONException v25) {
                            throw _L.FontWeight(v25);
                        }
                        if (v24) break block50;
                    }
                    catch (JSONException v26) {
                        throw _L.FontWeight(v26);
                    }
                    v24 = true;
                    break block49;
                }
                v24 = false;
            }
            v23.Property(v24);
        }
    }

    @Override
    public void EventDispatcher(double d, double d2, int n) {
        long l = Property ^ 0x681DC37A88D6L;
        Iterator<ModuleBase<?>> iterator = this.x.iterator();
        String[] stringArray = ModuleManager.q();
        while (iterator.hasNext()) {
            ModuleBase<?> _h2 = iterator.next();
            _h2.EventDispatcher(d, d2, n);
            if (stringArray == null) continue;
        }
    }

    @Override
    public void S(int n) {
        long l = Property ^ 0x45D24F37E79EL;
        Iterator<ModuleBase<?>> iterator = this.x.iterator();
        String[] stringArray = ModuleManager.q();
        while (iterator.hasNext()) {
            ModuleBase<?> _h2;
            block5: {
                ModuleBase<?> _h3;
                block6: {
                    _h3 = iterator.next();
                    try {
                        try {
                            _h2 = _h3;
                            if (stringArray != null) break block5;
                            if (_h2.l()) break block6;
                        }
                        catch (JSONException jSONException) {
                            throw _L.FontWeight(jSONException);
                        }
                        if (stringArray == null) continue;
                    }
                    catch (JSONException jSONException) {
                        throw _L.FontWeight(jSONException);
                    }
                }
                _h2 = _h3;
            }
            _h2.S(n);
            if (stringArray == null) continue;
        }
    }

    @Override
    public float m() {
        float f;
        block7: {
            float f2;
            block8: {
                long l = Property ^ 0xA055C88B0C7L;
                f2 = super.m();
                String[] stringArray = ModuleManager.q();
                float f3 = this.Q.y().floatValue();
                try {
                    f = f3;
                    if (stringArray != null) break block7;
                    if (!(f > 0.0f)) break block8;
                }
                catch (JSONException jSONException) {
                    throw _L.FontWeight(jSONException);
                }
                for (ModuleBase<?> _h2 : this.x) {
                    block9: {
                        block10: {
                            try {
                                try {
                                    if (stringArray != null) break block9;
                                    if (_h2.l()) break block10;
                                }
                                catch (JSONException jSONException) {
                                    throw _L.FontWeight(jSONException);
                                }
                                if (stringArray == null) continue;
                            }
                            catch (JSONException jSONException) {
                                throw _L.FontWeight(jSONException);
                            }
                        }
                        f2 += _h2.m() * f3;
                    }
                    if (stringArray == null) continue;
                }
            }
            f = f2;
        }
        return f;
    }

    private static void k(float f, float f2) {
        StringArrayHelper.Z((float)f, (float)f2, (float)12.5f, (float)12.5f, (float)3.0f, (Color)Y);
        StringArrayHelper.s((float)f, (float)f2, (float)12.5f, (float)12.5f, (float)2.75f, (float)0.75f, (Color)m);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        Property = ObfuscationHelper.FontWeight((long)-685896264473134805L, (long)-4594006742969599518L, MethodHandles.lookup().lookupClass()).FontWeight(170382106812198L);
        long l = Property ^ 0x2E4F936D7073L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray2 = byArray2;
            byArray2[j] = (byte)(l << j * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00c9\u0006\u0007\u0098\rn6\u009c\u000f\u000eS\u00ff\u0098r\u00ce=\u0010q\u00fb\u00cf;\u0083\u00a9\u008ftT\u001f\u00cf\u00f7R\u009c#\u00e0\u0010\u0016\u0096\u0004\u00e4\u0018\u0091\u00be\u00cfC\u00ee7\u00ce\f\u00a2(\u00c5";
        int n2 = "\u00c9\u0006\u0007\u0098\rn6\u009c\u000f\u000eS\u00ff\u0098r\u00ce=\u0010q\u00fb\u00cf;\u0083\u00a9\u008ftT\u001f\u00cf\u00f7R\u009c#\u00e0\u0010\u0016\u0096\u0004\u00e4\u0018\u0091\u00be\u00cfC\u00ee7\u00ce\f\u00a2(\u00c5".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _L.FontWeight(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int j = 1; j < 8; ++j) {
            byArray5 = byArray5;
            byArray5[j] = (byte)(l << j * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "\u00d1\u00f1\u001c\u00aesZ\u00f4\u00b4\u00eb\u00ab\u00c7*f\u0089\u00c4\u00f3";
        int n7 = "\u00d1\u00f1\u001c\u00aesZ\u00f4\u00b4\u00eb\u00ab\u00c7*f\u0089\u00c4\u00f3".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        d = (int)lArray[1];
        Z = (int)lArray[0];
        _L.n = new ScreenHelper(stringArray[1]);
        Y = J6.N((Color)Color.WHITE, (double)0.15f);
        m = J6.N((Color)Color.WHITE, (double)0.1f);
        Category = Js.p.FontWeight(stringArray[2]);
        i = Js.p.FontWeight(stringArray[0]);
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }

    private static String FontWeight(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char c2;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (j >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }
}
