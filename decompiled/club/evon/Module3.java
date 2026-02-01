/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.TextComponent
 *  club.evon.Q
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.gi
 *  net.minecraft.class_2583
 *  net.minecraft.class_5224
 *  net.minecraft.class_5481
 *  org.json.JSONException
 */
package club.evon;

import club.evon.TextComponent;
import club.evon.Q;
import club.evon.Command7;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.gi;
import club.evon.RotationHelper;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.class_2583;
import net.minecraft.class_5224;
import net.minecraft.class_5481;
import org.json.JSONException;

public class Module3
implements class_5481 {
    private final List<Q> Y;
    private static final long FontWeight = ObfuscationHelper.FontWeight((long)-6719074980873505722L, (long)2937267724529178991L, MethodHandles.lookup().lookupClass()).FontWeight(210696054763605L);

    /*
     * Unable to fully structure code
     */
    public yU(class_5481 var1_1) {
        block25: {
            var2_2 = yU.FontWeight ^ 98490802029442L;
            super();
            this.Y = new ArrayList<Q>(64);
            var5_3 = new ArrayList<RenderEvent>(64);
            var4_4 = gi.S();
            var1_1.accept((class_5224)LambdaMetafactory.metafactory(null, null, null, (ILnet/minecraft/class_2583;I)CooldownTimer, lambda$new$0(java.util.List int net.minecraft.class_2583 int ), (ILnet/minecraft/class_2583;I)CooldownTimer)(var5_3));
            var6_5 = new StringBuilder();
            for (Object var8_7 : var5_3) {
                try {
                    v0 = var6_5.appendCodePoint(var8_7.x);
                    if (var4_4 == 0) break block25;
                    if (var4_4 != 0) continue;
                }
                catch (JSONException PreMovementEvent) {
                    throw yU.FontWeight(PreMovementEvent);
                }
                Module.o((Module[])new Module[3]);
                break;
            }
            v0 = var6_5;
        }
        var7_6 = v0.toString();
        var8_7 = Command7.j(var7_6);
        var9_8 = 0;
        var10_9 = 0;
        while (var10_9 < var5_3.size()) {
            block32: {
                block33: {
                    block28: {
                        block31: {
                            block29: {
                                block30: {
                                    block34: {
                                        block27: {
                                            block26: {
                                                try {
                                                    PacketSendEvent = var9_8 < var8_7.size() ? (TextComponent)var8_7.get(var9_8) : null;
                                                }
                                                catch (JSONException PacketReceiveEvent) {
                                                    throw yU.FontWeight(PacketReceiveEvent);
                                                }
                                                var11_10 = PacketSendEvent;
                                                try {
                                                    v4 = var11_10;
                                                    if (var4_4 == 0) break block26;
                                                    if (v4 == null) break block27;
                                                }
                                                catch (JSONException v5) {
                                                    throw yU.FontWeight(v5);
                                                }
                                                v4 = var11_10;
                                            }
                                            v6 = v4.P.K;
                                            break block34;
                                        }
                                        v6 = -1;
                                    }
                                    var12_11 = v6;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    v7 = var12_11;
                                                    v8 = var10_9;
                                                    if (var4_4 == 0) break block28;
                                                    if (v7 == v8) {
                                                    }
                                                    ** GOTO lbl92
                                                }
                                                catch (JSONException v9) {
                                                    throw yU.FontWeight(v9);
                                                }
                                                v10 = ((Q)var5_3.get((int)var12_11)).StaticEventBus;
                                                if (var4_4 == 0) break block29;
                                            }
                                            catch (JSONException v11) {
                                                throw yU.FontWeight(v11);
                                            }
                                            if (v10 == 0) break block30;
                                        }
                                        catch (JSONException v12) {
                                            throw yU.FontWeight(v12);
                                        }
                                        ++var9_8;
                                        if (var4_4 != 0) continue;
                                    }
                                    catch (JSONException v13) {
                                        throw yU.FontWeight(v13);
                                    }
                                }
                                v10 = var11_10.D.V();
                            }
                            var13_12 = v10;
                            for (RotationHelper var15_14 : var11_10.RenderEvent) {
                                try {
                                    this.Y.add(new Q(((Q)var5_3.get((int)var10_9)).d.method_36139(var13_12), false, var15_14.R));
                                    if (var4_4 != 0) {
                                        if (var4_4 != 0) continue;
                                        break;
                                    }
                                    break block31;
                                }
                                catch (JSONException v14) {
                                    throw yU.FontWeight(v14);
                                }
                            }
                            var10_9 = var11_10.P.V + 1;
                            ++var9_8;
                        }
                        try {
                            try {
                                if (var4_4 != 0) break block32;
lbl92:
                                // 2 sources

                                v7 = var12_11;
                                if (var4_4 == 0) break block33;
                            }
                            catch (JSONException v15) {
                                throw yU.FontWeight(v15);
                            }
                            v8 = -1;
                        }
                        catch (JSONException v16) {
                            throw yU.FontWeight(v16);
                        }
                    }
                    v7 = v7 != v8 ? var12_11 : var5_3.size();
                }
                var13_12 = v7;
                this.Y.addAll(var5_3.subList(var10_9, var13_12));
                var10_9 = var13_12;
            }
            if (var4_4 != 0) continue;
        }
    }

    public boolean accept(class_5224 class_52242) {
        boolean bl;
        block8: {
            long l = FontWeight ^ 0x2C47D944D35FL;
            int n = 0;
            Iterator<Q> iterator = this.Y.iterator();
            int n2 = gi.Category();
            while (iterator.hasNext()) {
                block7: {
                    block9: {
                        Q q = iterator.next();
                        try {
                            try {
                                try {
                                    if (n2 != 0) break block7;
                                    bl = class_52242.accept(n, q.d, q.x);
                                    if (n2 != 0) break block8;
                                }
                                catch (JSONException jSONException) {
                                    throw yU.FontWeight(jSONException);
                                }
                                if (bl) break block9;
                            }
                            catch (JSONException jSONException) {
                                throw yU.FontWeight(jSONException);
                            }
                            return false;
                        }
                        catch (JSONException jSONException) {
                            throw yU.FontWeight(jSONException);
                        }
                    }
                    ++n;
                }
                if (n2 == 0) continue;
            }
            bl = true;
        }
        return bl;
    }

    private static boolean lambda$new$0(List list, int n, class_2583 class_25832, int n2) {
        boolean bl;
        class_2583 class_25833;
        Q q;
        Q q2;
        List list2;
        long l = FontWeight ^ 0x2F1A7FD0E43FL;
        try {
            Q q3;
            list2 = list;
            q2 = q3;
            q = q3;
            class_25833 = class_25832;
            bl = class_25832.method_10973() != null;
        }
        catch (JSONException jSONException) {
            throw yU.FontWeight(jSONException);
        }
        q2(class_25833, bl, n2);
        list2.add(q);
        return true;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
