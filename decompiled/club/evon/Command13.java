/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.ConfigHelper
 *  net.minecraft.class_634
 *  org.json.JSONException
 */
package club.evon;

import club.evon.HypixelCommand;
import club.evon.EventListenerAnnotation;
import club.evon.CommandBase;
import club.evon.ObfuscationHelper;
import club.evon.ConfigHelper;
import club.evon.TickEvent;
import club.evon.MinecraftHelper;
import java.lang.invoke.MethodHandles;
import net.minecraft.class_634;
import org.json.JSONException;

public class Command13
extends CommandBase {
    private static final long FontWeight = ObfuscationHelper.FontWeight((long)9124823564794282674L, (long)-267430632723924131L, MethodHandles.lookup().lookupClass()).FontWeight(42575701363386L);

    public _W(String string) {
        super(string);
    }

    @EventListenerAnnotation
    public void U(TickEvent yN2) {
        block6: {
            class_634 class_6342;
            block4: {
                block5: {
                    long l = FontWeight ^ 0x65E65F6BD25CL;
                    int n = HypixelCommand.M();
                    try {
                        class_6342 = MinecraftHelper.m.method_1562();
                        if (n != 0) break block4;
                        if (class_6342 != null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw _W.FontWeight(jSONException);
                    }
                    return;
                }
                class_6342 = MinecraftHelper.m.method_1562();
            }
            String string = class_6342.method_52790();
            try {
                if (string == null || !HypixelCommand.V.matcher(string).matches()) break block6;
            }
            catch (JSONException jSONException) {
                throw _W.FontWeight(jSONException);
            }
            HypixelCommand _A2 = new HypixelCommand();
            _A2.Category(this);
            ConfigHelper.r().f().Q(_A2);
        }
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }
}
