/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.vD
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.hypixel.modapi.error.ErrorReason
 */
package club.evon;

import club.evon.ds;
import club.evon.vD;
import java.lang.invoke.MethodHandles;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.hypixel.modapi.error.ErrorReason;

public interface z6 {
    public static final Event<z6> l;
    public static final long a;

    public void e(String var1, ErrorReason var2);

    static {
        a = ds.a((long)302543381095523222L, (long)5829185379141425254L, MethodHandles.lookup().lookupClass()).a(277347648242665L);
        l = EventFactory.createArrayBacked(z6.class, z6Array -> (string, errorReason) -> {
            long l = a ^ 0x2FDB964C885L;
            z6[] z6Array2 = z6Array;
            int n = z6Array2.length;
            int[] nArray = vD.t();
            for (int i = 0; i < n; ++i) {
                z6 z62 = z6Array2[i];
                z62.e(string, errorReason);
                if (nArray != null) continue;
            }
        });
    }
}
