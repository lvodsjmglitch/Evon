/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.StringArrayHelper
 *  club.evon.PositionHelper
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.PacketHelper
 *  club.evon.PacketReceiveEvent
 *  club.evon.ModuleHelper
 *  club.evon.ModuleBase
 *  club.evon.ConfigHelper
 *  club.evon.ColorHelper
 *  net.minecraft.class_1294
 *  net.minecraft.class_2596
 *  net.minecraft.class_2743
 *  net.minecraft.class_746
 *  org.json.JSONException
 */
package club.evon;

import club.evon.StringArrayHelper;
import club.evon.PositionHelper;
import club.evon.EventListenerAnnotation;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.PacketHelper;
import club.evon.PacketReceiveEvent;
import club.evon.ModuleHelper;
import club.evon.ModuleBase;
import club.evon.ConfigHelper;
import club.evon.RenderUtil;
import club.evon.ColorHelper;
import club.evon.MinecraftHelper;
import club.evon.VelocityUpdateEvent;
import club.evon.BlockHelper;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1294;
import net.minecraft.class_2596;
import net.minecraft.class_2743;
import net.minecraft.class_746;
import org.json.JSONException;

public class MoveEvent
extends ModuleBase<PacketHelper> {
    private double P;
    private final ColorHelper K;
    private static final long Property = ObfuscationHelper.FontWeight((long)8956310332322617761L, (long)1588166954598224226L, MethodHandles.lookup().lookupClass()).FontWeight(214054282198717L);

    public yR(String string, PacketHelper gY2) {
        long l = Property ^ 0x3004D7B03925L;
        String string2 = RenderUtil.q();
        super(string, (Module)gY2);
        this.K = new ColorHelper((PositionHelper)StringArrayHelper.M());
        String string3 = string2;
        try {
            if (string3 != null) {
                Module.o((Module[])new Module[2]);
            }
        }
        catch (JSONException jSONException) {
            throw yR.FontWeight(jSONException);
        }
    }

    public void S() {
        block4: {
            block5: {
                long l = Property ^ 0x34DFE5D19131L;
                String string = RenderUtil.q();
                try {
                    try {
                        if (string != null) break block4;
                        if (MinecraftHelper.m.field_1724 != null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yR.FontWeight(jSONException);
                    }
                    return;
                }
                catch (JSONException jSONException) {
                    throw yR.FontWeight(jSONException);
                }
            }
            this.P = BlockHelper.O();
            super.S();
        }
    }

    public void Y() {
        class_746 class_7462;
        block2: {
            block3: {
                long l = Property ^ 0x6FBA8528952CL;
                String string = RenderUtil.q();
                this.K.j();
                String string2 = string;
                try {
                    class_7462 = MinecraftHelper.m.field_1724;
                    if (string2 != null) break block2;
                    if (class_7462 != null) break block3;
                }
                catch (JSONException jSONException) {
                    throw yR.FontWeight(jSONException);
                }
                return;
            }
            class_7462 = MinecraftHelper.m.field_1724;
        }
        class_7462.method_18799(MinecraftHelper.m.field_1724.method_18798().method_18805(0.0, 1.0, 0.0));
        super.Y();
    }

    @EventListenerAnnotation
    private void l(ModuleHelper vA2) {
        block8: {
            boolean bl;
            block7: {
                long l = Property ^ 0x6E904BADECD4L;
                String string = RenderUtil.q();
                try {
                    try {
                        bl = BlockHelper.r();
                        if (string != null) break block7;
                        if (!bl) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw yR.FontWeight(jSONException);
                    }
                    bl = MinecraftHelper.m.field_1724.method_24828();
                }
                catch (JSONException jSONException) {
                    throw yR.FontWeight(jSONException);
                }
            }
            try {
                if (bl) {
                    vA2.d(true);
                }
            }
            catch (JSONException jSONException) {
                throw yR.FontWeight(jSONException);
            }
        }
    }

    @EventListenerAnnotation
    private void y(PacketReceiveEvent v32) {
        block14: {
            class_2743 class_27432;
            class_2743 class_27433;
            block15: {
                class_2596 class_25962;
                String string;
                block13: {
                    long l = Property ^ 0x52BDCD9FE3E5L;
                    class_2596 class_25963 = v32.d();
                    string = RenderUtil.q();
                    try {
                        try {
                            class_25962 = class_25963;
                            if (string != null) break block13;
                            if (!(class_25962 instanceof class_2743)) break block14;
                        }
                        catch (JSONException jSONException) {
                            throw yR.FontWeight(jSONException);
                        }
                        class_25962 = class_25963;
                    }
                    catch (JSONException jSONException) {
                        throw yR.FontWeight(jSONException);
                    }
                }
                class_27433 = (class_2743)class_25962;
                try {
                    try {
                        try {
                            if (MinecraftHelper.m.field_1724 == null) break block14;
                            class_27432 = class_27433;
                            if (string != null) break block15;
                        }
                        catch (JSONException jSONException) {
                            throw yR.FontWeight(jSONException);
                        }
                        if (class_27432.method_11818() != MinecraftHelper.m.field_1724.method_5628()) break block14;
                    }
                    catch (JSONException jSONException) {
                        throw yR.FontWeight(jSONException);
                    }
                    class_27432 = class_27433;
                }
                catch (JSONException jSONException) {
                    throw yR.FontWeight(jSONException);
                }
            }
            double d = Math.sqrt(Math.pow(class_27432.method_73085().method_10216(), 2.0) + Math.pow(class_27433.method_73085().method_10215(), 2.0));
            try {
                if (d > this.P) {
                    this.P = d;
                }
            }
            catch (JSONException jSONException) {
                throw yR.FontWeight(jSONException);
            }
        }
    }

    @EventListenerAnnotation
    private void P(VelocityUpdateEvent z02) {
        block29: {
            int n;
            String string;
            block24: {
                block25: {
                    int n2;
                    double d;
                    block26: {
                        block27: {
                            block20: {
                                int n3;
                                block21: {
                                    int n4;
                                    double d2;
                                    block22: {
                                        block23: {
                                            long l = Property ^ 0x460A6AA43B93L;
                                            n3 = ConfigHelper.r().Y;
                                            string = RenderUtil.q();
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            n = MinecraftHelper.m.field_1724.method_24828();
                                                            if (string != null) break block20;
                                                            if (n == 0) break block21;
                                                        }
                                                        catch (JSONException jSONException) {
                                                            throw yR.FontWeight(jSONException);
                                                        }
                                                        yR yR2 = this;
                                                        d2 = 0.48;
                                                        n4 = MinecraftHelper.m.field_1724.method_6059(class_1294.field_5904);
                                                        if (string != null) break block22;
                                                    }
                                                    catch (JSONException jSONException) {
                                                        throw yR.FontWeight(jSONException);
                                                    }
                                                    if (n4 == 0) break block23;
                                                }
                                                catch (JSONException jSONException) {
                                                    throw yR.FontWeight(jSONException);
                                                }
                                                n4 = MinecraftHelper.m.field_1724.method_6112(class_1294.field_5904).method_5578();
                                                break block22;
                                            }
                                            catch (JSONException jSONException) {
                                                throw yR.FontWeight(jSONException);
                                            }
                                        }
                                        n4 = 0;
                                    }
                                    yR2.P = d2 + (double)n4 * 0.05;
                                }
                                n = n3;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            if (string != null) break block24;
                                            if (n != 1) break block25;
                                        }
                                        catch (JSONException jSONException) {
                                            throw yR.FontWeight(jSONException);
                                        }
                                        yR yR3 = this;
                                        d = 0.345;
                                        n2 = MinecraftHelper.m.field_1724.method_6059(class_1294.field_5904);
                                        if (string != null) break block26;
                                    }
                                    catch (JSONException jSONException) {
                                        throw yR.FontWeight(jSONException);
                                    }
                                    if (n2 == 0) break block27;
                                }
                                catch (JSONException jSONException) {
                                    throw yR.FontWeight(jSONException);
                                }
                                n2 = MinecraftHelper.m.field_1724.method_6112(class_1294.field_5904).method_5578();
                                break block26;
                            }
                            catch (JSONException jSONException) {
                                throw yR.FontWeight(jSONException);
                            }
                        }
                        n2 = 0;
                    }
                    yR3.P = d + (double)n2 * 0.05;
                }
                n = BlockHelper.r() ? 1 : 0;
            }
            try {
                block28: {
                    try {
                        if (n == 0) break block28;
                        BlockHelper.y(this.P);
                        if (string == null) break block29;
                    }
                    catch (JSONException jSONException) {
                        throw yR.FontWeight(jSONException);
                    }
                }
                MinecraftHelper.m.field_1724.method_18799(MinecraftHelper.m.field_1724.method_18798().method_18805(0.0, 1.0, 0.0));
            }
            catch (JSONException jSONException) {
                throw yR.FontWeight(jSONException);
            }
        }
        this.P -= this.P / 190.0;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
