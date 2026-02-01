/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.launch.Loader
 *  club.evon.launch.hidden.Hidden0
 *  club.evon.PacketReceiveEvent
 *  club.evon.JoinWorldEvent
 *  club.evon.ConfigHelper
 *  club.evon.yE
 *  net.hypixel.data.type.GameType
 *  net.minecraft.class_1309
 *  net.minecraft.class_1531
 *  net.minecraft.class_1646
 *  net.minecraft.class_2561
 *  net.minecraft.class_634
 *  net.minecraft.class_745
 *  org.json.JSONException
 */
package club.evon;

import club.evon.EventListenerAnnotation;
import club.evon.CommandBase;
import club.evon.launch.Loader;
import club.evon.launch.hidden.Hidden0;
import club.evon.PacketReceiveEvent;
import club.evon.JoinWorldEvent;
import club.evon.ConfigHelper;
import club.evon.yE;
import club.evon.TickEvent;
import club.evon.MinecraftHelper;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import net.hypixel.data.type.GameType;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1646;
import net.minecraft.class_2561;
import net.minecraft.class_634;
import net.minecraft.class_745;
import org.json.JSONException;

public final class HypixelCommand
extends CommandBase {
    private final Set<UUID> X = ConcurrentHashMap.newKeySet();
    private final Set<Integer> j = ConcurrentHashMap.newKeySet();
    public static final Pattern V;
    public static final List<Pattern> U;
    private static int v;
    private static final long FontWeight;
    private static final String[] Property;

    public _A() {
        super(Property[9]);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean j(class_1309 var1_1) {
        block146: {
            block155: {
                block156: {
                    block147: {
                        block148: {
                            block153: {
                                block154: {
                                    block151: {
                                        block152: {
                                            block149: {
                                                block150: {
                                                    block125: {
                                                        block142: {
                                                            block145: {
                                                                block143: {
                                                                    block141: {
                                                                        block137: {
                                                                            block138: {
                                                                                block139: {
                                                                                    block136: {
                                                                                        block135: {
                                                                                            block134: {
                                                                                                block130: {
                                                                                                    block133: {
                                                                                                        block132: {
                                                                                                            block131: {
                                                                                                                block129: {
                                                                                                                    block127: {
                                                                                                                        block128: {
                                                                                                                            block126: {
                                                                                                                                block123: {
                                                                                                                                    block124: {
                                                                                                                                        block121: {
                                                                                                                                            block122: {
                                                                                                                                                block119: {
                                                                                                                                                    block120: {
                                                                                                                                                        block118: {
                                                                                                                                                            block116: {
                                                                                                                                                                block117: {
                                                                                                                                                                    block115: {
                                                                                                                                                                        var2_2 = _A.FontWeight ^ 8803505997593L;
                                                                                                                                                                        var5_3 = yE.i().RenderEvent();
                                                                                                                                                                        var4_4 = _A.M();
                                                                                                                                                                        try {
                                                                                                                                                                            v0 = var5_3;
                                                                                                                                                                            if (var4_4 != 0) break block115;
                                                                                                                                                                            if (v0 == null) break block116;
                                                                                                                                                                        }
                                                                                                                                                                        catch (JSONException PreMovementEvent) {
                                                                                                                                                                            throw _A.FontWeight(PreMovementEvent);
                                                                                                                                                                        }
                                                                                                                                                                        v0 = var5_3;
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        try {
                                                                                                                                                                            PacketSendEvent = v0.Property();
                                                                                                                                                                            PacketReceiveEvent = GameType.REPLAY;
                                                                                                                                                                            if (var4_4 != 0) break block117;
                                                                                                                                                                            if (PacketSendEvent != PacketReceiveEvent) {
                                                                                                                                                                            }
                                                                                                                                                                            ** GOTO lbl31
                                                                                                                                                                        }
                                                                                                                                                                        catch (JSONException v4) {
                                                                                                                                                                            throw _A.FontWeight(v4);
                                                                                                                                                                        }
                                                                                                                                                                        PacketSendEvent = var5_3.Property();
                                                                                                                                                                        PacketReceiveEvent = GameType.SMP;
                                                                                                                                                                    }
                                                                                                                                                                    catch (JSONException v5) {
                                                                                                                                                                        throw _A.FontWeight(v5);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    if (PacketSendEvent != PacketReceiveEvent) break block116;
lbl31:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    return true;
                                                                                                                                                                }
                                                                                                                                                                catch (JSONException v6) {
                                                                                                                                                                    throw _A.FontWeight(v6);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            var6_5 = var1_1.method_5477().getString();
                                                                                                                                                            try {
                                                                                                                                                                v7 = var6_5;
                                                                                                                                                                if (var4_4 != 0) break block118;
                                                                                                                                                                if (v7 != null) {
                                                                                                                                                                }
                                                                                                                                                                ** GOTO lbl54
                                                                                                                                                            }
                                                                                                                                                            catch (JSONException v8) {
                                                                                                                                                                throw _A.FontWeight(v8);
                                                                                                                                                            }
                                                                                                                                                            v7 = var6_5;
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                v9 = v7.isEmpty();
                                                                                                                                                                if (var4_4 != 0) break block119;
                                                                                                                                                                if (v9 == 0) break block120;
                                                                                                                                                            }
                                                                                                                                                            catch (JSONException v10) {
                                                                                                                                                                throw _A.FontWeight(v10);
                                                                                                                                                            }
lbl54:
                                                                                                                                                            // 2 sources

                                                                                                                                                            return true;
                                                                                                                                                        }
                                                                                                                                                        catch (JSONException v11) {
                                                                                                                                                            throw _A.FontWeight(v11);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v9 = var1_1 instanceof class_1531;
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        if (var4_4 != 0) break block121;
                                                                                                                                                        if (v9 == 0) break block122;
                                                                                                                                                    }
                                                                                                                                                    catch (JSONException v12) {
                                                                                                                                                        throw _A.FontWeight(v12);
                                                                                                                                                    }
                                                                                                                                                    this.j.add(var1_1.method_5628());
                                                                                                                                                    return false;
                                                                                                                                                }
                                                                                                                                                catch (JSONException v13) {
                                                                                                                                                    throw _A.FontWeight(v13);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            v9 = var1_1.method_5628();
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                if (var4_4 != 0) break block123;
                                                                                                                                                if (v9 != -1234) break block124;
                                                                                                                                            }
                                                                                                                                            catch (JSONException v14) {
                                                                                                                                                throw _A.FontWeight(v14);
                                                                                                                                            }
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                        catch (JSONException v15) {
                                                                                                                                            throw _A.FontWeight(v15);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    v9 = var1_1 instanceof class_745;
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (var4_4 != 0) break block125;
                                                                                                                                    if (v9 != 0) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl317
                                                                                                                                }
                                                                                                                                catch (JSONException v16) {
                                                                                                                                    throw _A.FontWeight(v16);
                                                                                                                                }
                                                                                                                                var7_6 = (class_745)var1_1;
                                                                                                                                var8_7 = MinecraftHelper.m.method_1562().method_2871(var7_6.method_5667());
                                                                                                                                try {
                                                                                                                                    v17 = var8_7;
                                                                                                                                    if (var4_4 != 0) break block126;
                                                                                                                                    if (v17 != null) {
                                                                                                                                    }
                                                                                                                                    ** GOTO lbl114
                                                                                                                                }
                                                                                                                                catch (JSONException v18) {
                                                                                                                                    throw _A.FontWeight(v18);
                                                                                                                                }
                                                                                                                                v17 = var8_7;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    if (var4_4 != 0) break block127;
                                                                                                                                    if (v17.method_2966() != null) break block128;
                                                                                                                                }
                                                                                                                                catch (JSONException v19) {
                                                                                                                                    throw _A.FontWeight(v19);
                                                                                                                                }
lbl114:
                                                                                                                                // 2 sources

                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            catch (JSONException v20) {
                                                                                                                                throw _A.FontWeight(v20);
                                                                                                                            }
                                                                                                                        }
                                                                                                                        v17 = var8_7;
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        try {
                                                                                                                            v21 = v17.method_2959();
                                                                                                                            if (var4_4 != 0) break block129;
                                                                                                                            if (v21 <= true) break block130;
                                                                                                                        }
                                                                                                                        catch (JSONException v22) {
                                                                                                                            throw _A.FontWeight(v22);
                                                                                                                        }
                                                                                                                        cfr_temp_0 = var7_6.method_6032() - 14.0f;
                                                                                                                        v21 = (boolean)(cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1));
                                                                                                                    }
                                                                                                                    catch (JSONException v23) {
                                                                                                                        throw _A.FontWeight(v23);
                                                                                                                    }
                                                                                                                }
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (var4_4 != 0) break block131;
                                                                                                                        if (v21 <= false) break block130;
                                                                                                                    }
                                                                                                                    catch (JSONException v24) {
                                                                                                                        throw _A.FontWeight(v24);
                                                                                                                    }
                                                                                                                    cfr_temp_1 = var7_6.method_6032() - 20.0f;
                                                                                                                    v21 = (boolean)(cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1));
                                                                                                                }
                                                                                                                catch (JSONException v25) {
                                                                                                                    throw _A.FontWeight(v25);
                                                                                                                }
                                                                                                            }
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (var4_4 != 0) break block132;
                                                                                                                    if (v21 >= false) break block130;
                                                                                                                }
                                                                                                                catch (JSONException v26) {
                                                                                                                    throw _A.FontWeight(v26);
                                                                                                                }
                                                                                                                v21 = var7_6.method_5767();
                                                                                                            }
                                                                                                            catch (JSONException v27) {
                                                                                                                throw _A.FontWeight(v27);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var4_4 != 0) break block133;
                                                                                                            if (!v21) break block130;
                                                                                                        }
                                                                                                        catch (JSONException v28) {
                                                                                                            throw _A.FontWeight(v28);
                                                                                                        }
                                                                                                        v21 = false;
                                                                                                    }
                                                                                                    return v21;
                                                                                                }
                                                                                                try {
                                                                                                    v29 = var5_3;
                                                                                                    if (var4_4 != 0) break block134;
                                                                                                    if (v29 == null) break block135;
                                                                                                }
                                                                                                catch (JSONException v30) {
                                                                                                    throw _A.FontWeight(v30);
                                                                                                }
                                                                                                v29 = var5_3;
                                                                                            }
                                                                                            try {
                                                                                                v31 = v29.N();
                                                                                                if (var4_4 != 0) break block136;
                                                                                                if (v31 == 0) break block135;
                                                                                            }
                                                                                            catch (JSONException v32) {
                                                                                                throw _A.FontWeight(v32);
                                                                                            }
                                                                                            v31 = 1;
                                                                                            break block136;
                                                                                        }
                                                                                        v31 = 0;
                                                                                    }
                                                                                    var9_8 = v31;
                                                                                    var10_9 = var7_6.method_5667();
                                                                                    try {
                                                                                        block140: {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    v33 = var10_9.version();
                                                                                                                    if (var4_4 != 0) break block137;
                                                                                                                    if (v33 != 2) break block138;
                                                                                                                }
                                                                                                                catch (JSONException v34) {
                                                                                                                    throw _A.FontWeight(v34);
                                                                                                                }
                                                                                                                v35 = var9_8;
                                                                                                                if (var4_4 != 0) break block139;
                                                                                                            }
                                                                                                            catch (JSONException v36) {
                                                                                                                throw _A.FontWeight(v36);
                                                                                                            }
                                                                                                            if (v35 != 0) break block140;
                                                                                                        }
                                                                                                        catch (JSONException v37) {
                                                                                                            throw _A.FontWeight(v37);
                                                                                                        }
                                                                                                        cfr_temp_2 = var7_6.method_6032() - 20.0f;
                                                                                                        v33 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                                                                                                        if (var4_4 != 0) break block137;
                                                                                                    }
                                                                                                    catch (JSONException v38) {
                                                                                                        throw _A.FontWeight(v38);
                                                                                                    }
                                                                                                    if (v33 != 0) break block138;
                                                                                                }
                                                                                                catch (JSONException v39) {
                                                                                                    throw _A.FontWeight(v39);
                                                                                                }
                                                                                                if (var8_7.method_2955() != null) break block138;
                                                                                            }
                                                                                            catch (JSONException v40) {
                                                                                                throw _A.FontWeight(v40);
                                                                                            }
                                                                                        }
                                                                                        v35 = 0;
                                                                                    }
                                                                                    catch (JSONException v41) {
                                                                                        throw _A.FontWeight(v41);
                                                                                    }
                                                                                }
                                                                                return (boolean)v35;
                                                                            }
                                                                            v33 = (int)this.X.contains(var10_9);
                                                                        }
                                                                        try {
                                                                            if (var4_4 != 0) break block141;
                                                                            if (v33 == 0) break block142;
                                                                        }
                                                                        catch (JSONException v42) {
                                                                            throw _A.FontWeight(v42);
                                                                        }
                                                                        v33 = var9_8;
                                                                    }
                                                                    try {
                                                                        block144: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (var4_4 != 0) break block143;
                                                                                                                if (v33 != 0) break block144;
                                                                                                            }
                                                                                                            catch (JSONException v43) {
                                                                                                                throw _A.FontWeight(v43);
                                                                                                            }
                                                                                                            cfr_temp_3 = var7_6.method_6032() - 20.0f;
                                                                                                            v33 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 > 0.0f ? 1 : -1);
                                                                                                            if (var4_4 != 0) break block143;
                                                                                                        }
                                                                                                        catch (JSONException v44) {
                                                                                                            throw _A.FontWeight(v44);
                                                                                                        }
                                                                                                        if (v33 > 0) break block144;
                                                                                                    }
                                                                                                    catch (JSONException v45) {
                                                                                                        throw _A.FontWeight(v45);
                                                                                                    }
                                                                                                    v46 = var7_6.method_5767();
                                                                                                    if (var4_4 != 0) break block145;
                                                                                                }
                                                                                                catch (JSONException v47) {
                                                                                                    throw _A.FontWeight(v47);
                                                                                                }
                                                                                                if (v46 == 0) {
                                                                                                }
                                                                                                ** GOTO lbl308
                                                                                            }
                                                                                            catch (JSONException v48) {
                                                                                                throw _A.FontWeight(v48);
                                                                                            }
                                                                                            v33 = (int)var7_6.method_24828();
                                                                                            if (var4_4 != 0) break block143;
                                                                                        }
                                                                                        catch (JSONException v49) {
                                                                                            throw _A.FontWeight(v49);
                                                                                        }
                                                                                        if (v33 != 0) break block144;
                                                                                    }
                                                                                    catch (JSONException v50) {
                                                                                        throw _A.FontWeight(v50);
                                                                                    }
                                                                                    v46 = var7_6.field_6012;
                                                                                    if (var4_4 != 0) break block145;
                                                                                }
                                                                                catch (JSONException v51) {
                                                                                    throw _A.FontWeight(v51);
                                                                                }
                                                                                if (v46 > 170) {
                                                                                }
                                                                                ** GOTO lbl308
                                                                            }
                                                                            catch (JSONException v52) {
                                                                                throw _A.FontWeight(v52);
                                                                            }
                                                                        }
                                                                        v33 = this.X.remove(var10_9);
                                                                    }
                                                                    catch (JSONException v53) {
                                                                        throw _A.FontWeight(v53);
                                                                    }
                                                                }
                                                                try {
                                                                    if (var4_4 == 0) break block142;
lbl308:
                                                                    // 3 sources

                                                                    v46 = 0;
                                                                }
                                                                catch (JSONException v54) {
                                                                    throw _A.FontWeight(v54);
                                                                }
                                                            }
                                                            return (boolean)v46;
                                                        }
                                                        try {
                                                            if (var4_4 == 0) break block146;
lbl317:
                                                            // 2 sources

                                                            v9 = var1_1.method_5667().version();
                                                        }
                                                        catch (JSONException v55) {
                                                            throw _A.FontWeight(v55);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var4_4 != 0) break block147;
                                                                    if (v9 == 4) break block148;
                                                                }
                                                                catch (JSONException v56) {
                                                                    throw _A.FontWeight(v56);
                                                                }
                                                                v57 = var1_1.method_5767();
                                                                if (var4_4 != 0) break block149;
                                                            }
                                                            catch (JSONException v58) {
                                                                throw _A.FontWeight(v58);
                                                            }
                                                            if (!v57) break block150;
                                                        }
                                                        catch (JSONException v59) {
                                                            throw _A.FontWeight(v59);
                                                        }
                                                        return false;
                                                    }
                                                    catch (JSONException v60) {
                                                        throw _A.FontWeight(v60);
                                                    }
                                                }
                                                v57 = var6_5.contains(" ");
                                            }
                                            try {
                                                if (var4_4 != 0) break block151;
                                                if (!v57) break block152;
                                            }
                                            catch (JSONException v61) {
                                                throw _A.FontWeight(v61);
                                            }
                                            var8_7 = var1_1.method_5477().method_10855();
                                            try {
                                                try {
                                                    try {
                                                        v57 = var8_7.isEmpty();
                                                        if (var4_4 != 0) break block151;
                                                        if (v57) break block152;
                                                    }
                                                    catch (JSONException v62) {
                                                        throw _A.FontWeight(v62);
                                                    }
                                                    if (((class_2561)var8_7.getFirst()).method_10866().method_10973() == null) break block152;
                                                }
                                                catch (JSONException v63) {
                                                    throw _A.FontWeight(v63);
                                                }
                                                return false;
                                            }
                                            catch (JSONException v64) {
                                                throw _A.FontWeight(v64);
                                            }
                                        }
                                        v57 = this.j.contains(var1_1.method_5628());
                                    }
                                    try {
                                        if (var4_4 != 0) break block153;
                                        if (v57) break block154;
                                    }
                                    catch (JSONException v65) {
                                        throw _A.FontWeight(v65);
                                    }
                                    v57 = true;
                                    break block153;
                                }
                                v57 = false;
                            }
                            return v57;
                        }
                        v9 = var1_1 instanceof class_1646;
                    }
                    try {
                        if (var4_4 != 0) break block155;
                        if (v9 != 0) break block156;
                    }
                    catch (JSONException v66) {
                        throw _A.FontWeight(v66);
                    }
                    v9 = 1;
                    break block155;
                }
                v9 = 0;
            }
            return (boolean)v9;
        }
        return true;
    }

    @EventListenerAnnotation
    public native void d(PacketReceiveEvent var1);

    @EventListenerAnnotation
    public void I(JoinWorldEvent vK2) {
        this.j.clear();
        this.X.clear();
    }

    @EventListenerAnnotation
    public void x(TickEvent yN2) {
        block9: {
            class_634 class_6342;
            block8: {
                long l = FontWeight ^ 0x5C80BCCE31ACL;
                int n = _A.RenderEvent();
                try {
                    try {
                        class_6342 = MinecraftHelper.m.method_1562();
                        if (n == 0) break block8;
                        if (class_6342 == null) break block9;
                    }
                    catch (JSONException jSONException) {
                        throw _A.FontWeight(jSONException);
                    }
                    class_6342 = MinecraftHelper.m.method_1562();
                }
                catch (JSONException jSONException) {
                    throw _A.FontWeight(jSONException);
                }
            }
            String string = class_6342.method_52790();
            try {
                try {
                    if (string == null || V.matcher(string).matches()) break block9;
                }
                catch (JSONException jSONException) {
                    throw _A.FontWeight(jSONException);
                }
                ConfigHelper.r().f().v();
            }
            catch (JSONException jSONException) {
                throw _A.FontWeight(jSONException);
            }
        }
    }

    public native boolean q(String var1);

    static {
        Loader.attachNatives((int)1, _A.class);
        Hidden0.special_clinit_1_60(_A.class);
    }

    public static void O(int n) {
        v = n;
    }

    public static int RenderEvent() {
        return v;
    }

    public static int M() {
        int n = _A.RenderEvent();
        try {
            if (n == 0) {
                return 17;
            }
        }
        catch (JSONException jSONException) {
            throw _A.FontWeight(jSONException);
        }
        return 0;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }

    private static String FontWeight(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char StaticEventBus;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                StaticEventBus = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F));
                cArray[n++] = StaticEventBus;
                continue;
            }
            if (i >= n2 - 2) continue;
            StaticEventBus = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F));
            cArray[n++] = StaticEventBus;
        }
        return new String(cArray, 0, n);
    }
}
