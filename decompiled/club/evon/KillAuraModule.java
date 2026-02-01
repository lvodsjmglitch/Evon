/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.StringArrayHelper
 *  club.evon.ItemHelper
 *  club.evon.PositionHelper
 *  club.evon.StringArrayHelper
 *  club.evon.ItemType
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.CombatCategory
 *  club.evon.PacketReceiveEvent
 *  club.evon.ChatMessageEvent
 *  club.evon.ModuleBase
 *  club.evon.ModuleBase
 *  club.evon.ColorHelper
 *  club.evon.BooleanHelper
 *  net.minecraft.class_1657
 *  net.minecraft.class_1661
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_2248
 *  net.minecraft.class_2596
 *  net.minecraft.class_2663
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 *  org.json.JSONException
 */
package club.evon;

import club.evon.StringArrayHelper;
import club.evon.ItemHelper;
import club.evon.PositionHelper;
import club.evon.StringArrayHelper;
import club.evon.ClientPlayerInteractionManagerAccessor;
import club.evon.EventListenerAnnotation;
import club.evon.MathUtil;
import club.evon.ItemType;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.CombatCategory;
import club.evon.PacketReceiveEvent;
import club.evon.ChatMessageEvent;
import club.evon.ModuleBase;
import club.evon.ModuleBase;
import club.evon.TickEvent;
import club.evon.KeyBindingManager;
import club.evon.ColorHelper;
import club.evon.BooleanHelper;
import club.evon.MinecraftHelper;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.json.JSONException;

public final class KillAuraModule
extends ModuleBase<CombatCategory> {
    private final ColorHelper Property;
    private boolean v;
    private boolean X;
    private boolean y;
    private boolean k;
    private int K;
    private int m;
    private static final long Property = ObfuscationHelper.FontWeight((long)-955909401725039209L, (long)4224076206311915267L, MethodHandles.lookup().lookupClass()).FontWeight(52756485912127L);

    public yK(String string, CombatCategory gn2) {
        long l = Property ^ 0x178A7479B6BEL;
        super(string, (Module)gn2);
        this.Property = new ColorHelper((PositionHelper)StringArrayHelper.M());
        this.K = -1;
        boolean bl = BooleanHelper.v();
        try {
            if (bl) {
                Module.o((Module[])new Module[5]);
            }
        }
        catch (JSONException jSONException) {
            throw yK.FontWeight(jSONException);
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventListenerAnnotation
    public void K(ModuleBase var1_1) {
        block10: {
            block11: {
                block9: {
                    var2_2 = yK.Property ^ 60882788211262L;
                    var4_3 = BooleanHelper.Category();
                    try {
                        try {
                            try {
                                v0 = ((CombatCategory)this.v()).O();
                                PreMovementEvent = ItemType.BOW;
                                if (!var4_3) break block9;
                                if (v0 == PreMovementEvent) break block10;
                            }
                            catch (JSONException PacketSendEvent) {
                                throw yK.FontWeight(PacketSendEvent);
                            }
                            PacketReceiveEvent = this;
                            if (!var4_3) break block11;
                        }
                        catch (JSONException v4) {
                            throw yK.FontWeight(v4);
                        }
                        v0 = ((CombatCategory)PacketReceiveEvent.v()).O();
                        PreMovementEvent = ItemType.USEABLE;
                    }
                    catch (JSONException v5) {
                        throw yK.FontWeight(v5);
                    }
                }
                if (v0 != PreMovementEvent) ** GOTO lbl29
                PacketReceiveEvent = this;
            }
            try {
                if (!PacketReceiveEvent.Property.i()) break block10;
lbl29:
                // 2 sources

                var1_1.K();
            }
            catch (JSONException v6) {
                throw yK.FontWeight(v6);
            }
        }
    }

    @EventListenerAnnotation
    public void p(PacketReceiveEvent v32) {
        block12: {
            class_746 class_7462;
            block13: {
                class_2596 class_25962;
                boolean bl;
                block11: {
                    long l = Property ^ 0x35C66A758207L;
                    class_2596 class_25963 = v32.d();
                    bl = BooleanHelper.v();
                    try {
                        try {
                            class_25962 = class_25963;
                            if (bl) break block11;
                            if (!(class_25962 instanceof class_2663)) break block12;
                        }
                        catch (JSONException jSONException) {
                            throw yK.FontWeight(jSONException);
                        }
                        class_25962 = class_25963;
                    }
                    catch (JSONException jSONException) {
                        throw yK.FontWeight(jSONException);
                    }
                }
                class_2663 class_26632 = (class_2663)class_25962;
                try {
                    try {
                        class_7462 = MinecraftHelper.m.field_1724;
                        if (bl) break block13;
                        if (class_7462 == null) break block12;
                    }
                    catch (JSONException jSONException) {
                        throw yK.FontWeight(jSONException);
                    }
                    class_7462 = class_26632.method_11469((class_1937)MinecraftHelper.m.field_1687);
                }
                catch (JSONException jSONException) {
                    throw yK.FontWeight(jSONException);
                }
            }
            try {
                if (class_7462 == MinecraftHelper.m.field_1724) {
                    this.K();
                }
            }
            catch (JSONException jSONException) {
                throw yK.FontWeight(jSONException);
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventListenerAnnotation
    public void Category(TickEvent var1_1) {
        block19: {
            block21: {
                block20: {
                    block18: {
                        block16: {
                            block17: {
                                var2_2 = yK.Property ^ 119130036677915L;
                                var4_3 = BooleanHelper.v();
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var4_3) break block16;
                                                if (MinecraftHelper.m.field_1724 != null) {
                                                }
                                                ** GOTO lbl30
                                            }
                                            catch (JSONException v0) {
                                                throw yK.FontWeight(v0);
                                            }
                                            PreMovementEvent = MinecraftHelper.m;
                                            if (var4_3) break block17;
                                        }
                                        catch (JSONException PacketSendEvent) {
                                            throw yK.FontWeight(PacketSendEvent);
                                        }
                                        if (PreMovementEvent.field_1755 == null) {
                                        }
                                        ** GOTO lbl30
                                    }
                                    catch (JSONException PacketReceiveEvent) {
                                        throw yK.FontWeight(PacketReceiveEvent);
                                    }
                                    PreMovementEvent = MinecraftHelper.m;
                                }
                                catch (JSONException v4) {
                                    throw yK.FontWeight(v4);
                                }
                            }
                            try {
                                if (PreMovementEvent.method_18506() == null) break block18;
lbl30:
                                // 3 sources

                                this.o();
                            }
                            catch (JSONException v5) {
                                throw yK.FontWeight(v5);
                            }
                        }
                        this.K();
                    }
                    try {
                        try {
                            if (Module.q() != null) break block19;
                            if (!var4_3) break block20;
                        }
                        catch (JSONException v6) {
                            throw yK.FontWeight(v6);
                        }
                        v7 = false;
                        break block21;
                    }
                    catch (JSONException v8) {
                        throw yK.FontWeight(v8);
                    }
                }
                v7 = true;
            }
            BooleanHelper.Property((boolean)v7);
        }
    }

    private void P() {
        this.Property.m();
    }

    private void K() {
        this.Property.j();
    }

    private void o() {
        this.v = false;
        this.X = false;
        this.K = -1;
    }

    @EventListenerAnnotation
    public void n(ChatMessageEvent vF2) {
        block18: {
            class_310 class_3102;
            block19: {
                boolean bl;
                block17: {
                    yK yK2;
                    boolean bl2;
                    block15: {
                        block16: {
                            long l = Property ^ 0x174B0C2BEB2L;
                            bl2 = BooleanHelper.Category();
                            try {
                                block14: {
                                    try {
                                        try {
                                            if (MinecraftHelper.m.field_1724 == null) break block14;
                                            yK2 = this;
                                            if (!bl2) break block15;
                                        }
                                        catch (JSONException jSONException) {
                                            throw yK.FontWeight(jSONException);
                                        }
                                        if (((CombatCategory)yK2.v()).O() == ItemType.BLOCKABLE) break block16;
                                    }
                                    catch (JSONException jSONException) {
                                        throw yK.FontWeight(jSONException);
                                    }
                                }
                                return;
                            }
                            catch (JSONException jSONException) {
                                throw yK.FontWeight(jSONException);
                            }
                        }
                        yK2 = this;
                    }
                    try {
                        try {
                            try {
                                bl = yK2.v;
                                if (!bl2) break block17;
                                if (!bl) break block18;
                            }
                            catch (JSONException jSONException) {
                                throw yK.FontWeight(jSONException);
                            }
                            class_3102 = MinecraftHelper.m;
                            if (!bl2) break block19;
                        }
                        catch (JSONException jSONException) {
                            throw yK.FontWeight(jSONException);
                        }
                        bl = class_3102.field_1724.method_6115();
                    }
                    catch (JSONException jSONException) {
                        throw yK.FontWeight(jSONException);
                    }
                }
                try {
                    if (!bl) break block18;
                    this.P();
                    class_3102 = MinecraftHelper.m;
                }
                catch (JSONException jSONException) {
                    throw yK.FontWeight(jSONException);
                }
            }
            class_3102.field_1761.method_2897((class_1657)MinecraftHelper.m.field_1724);
            KeyBindingManager.J().V();
            this.v = false;
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventListenerAnnotation(EventDispatcher=1)
    public void R(ClientPlayerInteractionManagerAccessor var1_1) {
        block40: {
            block34: {
                block35: {
                    block41: {
                        block39: {
                            block38: {
                                block37: {
                                    block36: {
                                        block32: {
                                            block33: {
                                                var2_2 = yK.Property ^ 87786769207723L;
                                                var4_3 = BooleanHelper.v();
                                                try {
                                                    try {
                                                        if (var4_3) break block32;
                                                        if (MinecraftHelper.m.field_1724 != null) break block33;
                                                    }
                                                    catch (JSONException v0) {
                                                        throw yK.FontWeight(v0);
                                                    }
                                                    return;
                                                }
                                                catch (JSONException PreMovementEvent) {
                                                    throw yK.FontWeight(PreMovementEvent);
                                                }
                                            }
                                            this.X = false;
                                        }
                                        var5_4 = KeyBindingManager.RenderEvent();
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                PacketSendEvent = this;
                                                                if (var4_3) break block34;
                                                                if (((CombatCategory)PacketSendEvent.v()).O() == ItemType.BLOCKABLE) {
                                                                }
                                                                ** GOTO lbl91
                                                            }
                                                            catch (JSONException PacketReceiveEvent) {
                                                                throw yK.FontWeight(PacketReceiveEvent);
                                                            }
                                                            v4 = var5_4.O();
                                                            if (var4_3) break block35;
                                                        }
                                                        catch (JSONException v5) {
                                                            throw yK.FontWeight(v5);
                                                        }
                                                        if (v4) {
                                                        }
                                                        ** GOTO lbl78
                                                    }
                                                    catch (JSONException v6) {
                                                        throw yK.FontWeight(v6);
                                                    }
                                                    v7 = MinecraftHelper.m.field_1724.method_6115();
                                                    if (var4_3) break block36;
                                                }
                                                catch (JSONException v8) {
                                                    throw yK.FontWeight(v8);
                                                }
                                                if (!v7) break block37;
                                            }
                                            catch (JSONException v9) {
                                                throw yK.FontWeight(v9);
                                            }
                                            v7 = this.Property.i();
                                        }
                                        catch (JSONException v10) {
                                            throw yK.FontWeight(v10);
                                        }
                                    }
                                    if (v7) break block40;
                                }
                                var6_5 = StringArrayHelper.S();
                                try {
                                    try {
                                        v11 = ItemHelper.Category((class_2248)var6_5);
                                        if (var4_3) break block38;
                                        if (v11) break block39;
                                    }
                                    catch (JSONException v12) {
                                        throw yK.FontWeight(v12);
                                    }
                                    v11 = MinecraftHelper.m.field_1761.method_2923();
                                }
                                catch (JSONException v13) {
                                    throw yK.FontWeight(v13);
                                }
                            }
                            if (!v11) break block41;
                        }
                        return;
                    }
                    try {
                        this.v = true;
                        var5_4.l();
                        if (!var4_3) break block40;
lbl78:
                        // 2 sources

                        v4 = MinecraftHelper.m.field_1724.method_6115();
                    }
                    catch (JSONException v14) {
                        throw yK.FontWeight(v14);
                    }
                }
                try {
                    try {
                        if (v4) break block40;
                        this.K();
                        if (!var4_3) break block40;
                    }
                    catch (JSONException v15) {
                        throw yK.FontWeight(v15);
                    }
lbl91:
                    // 2 sources

                    PacketSendEvent = this;
                }
                catch (JSONException v16) {
                    throw yK.FontWeight(v16);
                }
            }
            PacketSendEvent.K();
        }
    }

    public void Y() {
        this.K();
        this.o();
        super.Y();
    }

    private int StaticEventBus() {
        int n;
        block12: {
            int n2;
            boolean bl;
            int n3;
            block10: {
                int n4;
                long l = Property ^ 0x1444DE6FD622L;
                n3 = MathUtil.L((int)8);
                bl = BooleanHelper.Category();
                for (n2 = n3; n2 < 9; ++n2) {
                    int n5;
                    block11: {
                        try {
                            try {
                                n4 = this.x(n2) ? 1 : 0;
                                if (!bl) break block10;
                                if (!bl) break block11;
                            }
                            catch (JSONException jSONException) {
                                throw yK.FontWeight(jSONException);
                            }
                            if (n4 == 0) continue;
                        }
                        catch (JSONException jSONException) {
                            throw yK.FontWeight(jSONException);
                        }
                        n5 = n2;
                    }
                    return n5;
                }
                n4 = n2 = n3 - 1;
            }
            while (n2 >= 0) {
                block14: {
                    int n6;
                    block13: {
                        try {
                            try {
                                n = this.x(n2) ? 1 : 0;
                                if (!bl) break block12;
                                if (!bl) break block13;
                            }
                            catch (JSONException jSONException) {
                                throw yK.FontWeight(jSONException);
                            }
                            if (n == 0) break block14;
                        }
                        catch (JSONException jSONException) {
                            throw yK.FontWeight(jSONException);
                        }
                        n6 = n2;
                    }
                    return n6;
                }
                --n2;
                if (bl) continue;
            }
            n = n3;
        }
        return n;
    }

    private boolean x(int n) {
        boolean bl;
        block12: {
            block14: {
                block13: {
                    boolean bl2;
                    class_1661 class_16612;
                    block11: {
                        int n2;
                        block10: {
                            long l = Property ^ 0x164FD1CD8AD8L;
                            class_16612 = MinecraftHelper.m.field_1724.method_31548();
                            bl2 = BooleanHelper.Category();
                            try {
                                try {
                                    n2 = n;
                                    if (!bl2) break block10;
                                    if (n2 != class_16612.method_67532()) break block11;
                                }
                                catch (JSONException jSONException) {
                                    throw yK.FontWeight(jSONException);
                                }
                                n2 = 0;
                            }
                            catch (JSONException jSONException) {
                                throw yK.FontWeight(jSONException);
                            }
                        }
                        return n2 != 0;
                    }
                    class_1799 class_17992 = (class_1799)class_16612.method_67533().get(n);
                    try {
                        try {
                            try {
                                bl = class_17992.method_7960();
                                if (!bl2) break block12;
                                if (bl) break block13;
                            }
                            catch (JSONException jSONException) {
                                throw yK.FontWeight(jSONException);
                            }
                            bl = class_17992.method_7964().method_10866().method_10967();
                            if (!bl2) break block12;
                        }
                        catch (JSONException jSONException) {
                            throw yK.FontWeight(jSONException);
                        }
                        if (!bl) break block14;
                    }
                    catch (JSONException jSONException) {
                        throw yK.FontWeight(jSONException);
                    }
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
