/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.StaticEventBus
 *  club.evon.ObfuscationHelper
 *  club.evon.EventDispatcher
 *  club.evon.PacketReceiveEvent
 *  club.evon.v_
 *  club.evon.ConfigHelper
 *  io.netty.channel.ChannelFuture
 *  net.minecraft.class_11653
 *  net.minecraft.class_2535
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2598
 *  net.minecraft.class_2909
 *  net.minecraft.class_2915
 *  net.minecraft.class_635
 *  net.minecraft.class_6368
 *  net.minecraft.class_6370
 *  net.minecraft.class_639
 *  net.minecraft.class_642
 *  net.minecraft.class_642$class_8678
 *  net.minecraft.class_8697
 *  net.minecraft.class_9099
 */
package club.evon;

import club.evon.StaticEventBus;
import club.evon.EventListenerAnnotation;
import club.evon.ObfuscationHelper;
import club.evon.EventDispatcher;
import club.evon.PacketReceiveEvent;
import club.evon.v_;
import club.evon.ConfigHelper;
import club.evon.MinecraftHelper;
import club.evon.Module2;
import club.evon.ScreenManager;
import io.netty.channel.ChannelFuture;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.InetSocketAddress;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_11653;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_2909;
import net.minecraft.class_2915;
import net.minecraft.class_635;
import net.minecraft.class_6368;
import net.minecraft.class_6370;
import net.minecraft.class_639;
import net.minecraft.class_642;
import net.minecraft.class_8697;
import net.minecraft.class_9099;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class ConfigSerializer
implements EventDispatcher {
    private final String U;
    private CompletableFuture<Module2> y;
    private String RenderEvent;
    private final ExecutorService v;
    private final Pattern k;
    private static zE FontWeight;
    private static final long Property;
    private static final String[] StaticEventBus;
    private static final long[] d;
    private static final Long[] f;
    private static final Map g;

    public zE() {
        String[] stringArray = StaticEventBus;
        this.U = stringArray[1];
        this.v = Executors.newCachedThreadPool(runnable -> {
            Thread thread = new Thread(runnable, StaticEventBus[2]);
            thread.setDaemon(true);
            return thread;
        });
        this.k = Pattern.compile(stringArray[5]);
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventListenerAnnotation
    private void G(PacketReceiveEvent v32) {
        boolean bl;
        String string;
        block40: {
            Object object;
            block38: {
                block36: {
                    CompletableFuture<Module2> completableFuture;
                    class_2561 class_25612;
                    block35: {
                        class_2596 class_25962;
                        block34: {
                            long l = Property ^ 0x11AA49754010L;
                            object = v32.d();
                            string = ConfigHelper.O();
                            class_25962 = object;
                            if (string != null) break block34;
                            try {
                                block43: {
                                    if (!(class_25962 instanceof class_2909)) return;
                                    break block43;
                                    catch (Throwable throwable) {
                                        throw zE.FontWeight(throwable);
                                    }
                                }
                                class_25962 = object;
                            }
                            catch (Throwable throwable) {
                                throw zE.FontWeight(throwable);
                            }
                        }
                        class_2909 class_29092 = (class_2909)class_25962;
                        try {
                            class_2561 class_25613;
                            class_25612 = class_25613 = class_29092.comp_4195();
                        }
                        catch (Throwable throwable) {
                            throw new MatchException(throwable.toString(), throwable);
                        }
                        try {
                            try {
                                completableFuture = this.y;
                                if (string != null) break block35;
                                if (completableFuture == null) return;
                            }
                            catch (Throwable throwable) {
                                throw zE.FontWeight(throwable);
                            }
                            completableFuture = this.y;
                        }
                        catch (Throwable throwable) {
                            throw zE.FontWeight(throwable);
                        }
                    }
                    if (completableFuture.isDone()) return;
                    object = class_25612.getString();
                    try {
                        block37: {
                            try {
                                try {
                                    System.out.println((String)object);
                                    bl = ((String)object).contains(StaticEventBus[0]);
                                    if (string != null) break block36;
                                    if (!bl) break block37;
                                }
                                catch (Throwable throwable) {
                                    throw zE.FontWeight(throwable);
                                }
                                this.y.complete(Module2.SUSPICIOUS_BAN);
                                if (string == null) return;
                            }
                            catch (Throwable throwable) {
                                throw zE.FontWeight(throwable);
                            }
                        }
                        bl = ((String)object).contains(StaticEventBus[7]);
                    }
                    catch (Throwable throwable) {
                        throw zE.FontWeight(throwable);
                    }
                }
                try {
                    block39: {
                        try {
                            try {
                                if (string != null) break block38;
                                if (!bl) break block39;
                            }
                            catch (Throwable throwable) {
                                throw zE.FontWeight(throwable);
                            }
                            this.y.complete(Module2.PERMANENT_BAN);
                            if (string == null) return;
                        }
                        catch (Throwable throwable) {
                            throw zE.FontWeight(throwable);
                        }
                    }
                    bl = ((String)object).contains(StaticEventBus[6]);
                }
                catch (Throwable throwable) {
                    throw zE.FontWeight(throwable);
                }
            }
            try {
                block41: {
                    try {
                        try {
                            if (string != null) break block40;
                            if (!bl) break block41;
                        }
                        catch (Throwable throwable) {
                            throw zE.FontWeight(throwable);
                        }
                        this.y.complete(Module2.TEMPORARY_BAN);
                        if (string == null) return;
                    }
                    catch (Throwable throwable) {
                        throw zE.FontWeight(throwable);
                    }
                }
                bl = ((String)object).contains(StaticEventBus[3]);
            }
            catch (Throwable throwable) {
                throw zE.FontWeight(throwable);
            }
        }
        try {
            block42: {
                try {
                    try {
                        if (string != null) return;
                        if (!bl) break block42;
                    }
                    catch (Throwable throwable) {
                        throw zE.FontWeight(throwable);
                    }
                    this.y.complete(Module2.UNBANNED);
                    if (string == null) return;
                }
                catch (Throwable throwable) {
                    throw zE.FontWeight(throwable);
                }
            }
            bl = this.y.complete(Module2.UNKNOWN);
            return;
        }
        catch (Throwable throwable) {
            throw zE.FontWeight(throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Module2 I(v_ v_2) {
        long l = Property ^ 0x4E008E74562CL;
        this.y = new CompletableFuture();
        this.v.execute(() -> this.G(v_2));
        try {
            Module2 yt2 = this.y.get((long)zE.FontWeight("y", (int)26756, (long)(0x7D78466C3CA0A271L ^ l)), TimeUnit.SECONDS);
            return yt2;
        }
        catch (Exception exception) {
            Module2 yt3 = Module2.UNKNOWN;
            return yt3;
        }
        finally {
            this.y = null;
        }
    }

    private void G(v_ v_2) {
        long l = Property ^ 0x29CEB66DAD8EL;
        String string = ConfigHelper.O();
        try {
            Object object;
            String[] stringArray;
            block4: {
                Optional<InetSocketAddress> optional;
                block5: {
                    stringArray = StaticEventBus;
                    optional = class_6370.field_33745.method_36907(class_639.method_2950((String)stringArray[4])).map(class_6368::method_36902);
                    try {
                        object = optional;
                        if (string != null) break block4;
                        if (!((Optional)object).isEmpty()) break block5;
                    }
                    catch (Exception exception) {
                        throw zE.FontWeight(exception);
                    }
                    this.y.complete(Module2.UNBANNED);
                    return;
                }
                object = optional.get();
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress)object;
            class_2535 class_25352 = new class_2535(class_2598.field_11942);
            class_25352.method_53505(MinecraftHelper.m.method_53526().method_53544());
            ChannelFuture channelFuture = class_2535.method_52271((InetSocketAddress)inetSocketAddress, (boolean)MinecraftHelper.m.field_1690.method_1639(), (class_2535)class_25352);
            channelFuture.syncUninterruptibly();
            stringArray = StaticEventBus;
            class_25352.method_56326(inetSocketAddress.getHostName(), inetSocketAddress.getPort(), class_9099.field_48247, class_9099.field_48248, (class_8697)new class_635(class_25352, MinecraftHelper.m, new class_642(stringArray[1], stringArray[1], class_642.class_8678.field_45611), null, false, null, this::EventDispatcher, new class_11653(), null), false);
            class_25352.method_10743((class_2596)new class_2915(v_2.k(), ScreenManager.StaticEventBus(v_2.K())));
        }
        catch (Exception exception) {
            this.y.completeExceptionally(exception);
        }
    }

    private void EventDispatcher(class_2561 class_25612) {
        block5: {
            block4: {
                long l = Property ^ 0x1734FA166A43L;
                String string = ConfigHelper.O();
                try {
                    zE zE2;
                    try {
                        zE2 = this;
                        if (string != null) break block4;
                        if (zE2.y == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw zE.FontWeight(matchException);
                    }
                    zE2 = this;
                }
                catch (MatchException matchException) {
                    throw zE.FontWeight(matchException);
                }
            }
            zE2.RenderEvent = class_25612.getString();
        }
    }

    public long S(String string) {
        long l = Property ^ 0xCCEF2762BE4L;
        Matcher matcher = this.k.matcher(string.toLowerCase().trim());
        try {
            if (!matcher.matches()) {
                return 0L;
            }
        }
        catch (MatchException matchException) {
            throw zE.FontWeight(matchException);
        }
        long l2 = this.X(matcher, 1);
        long l3 = this.X(matcher, 2);
        long l4 = this.X(matcher, 3);
        long l5 = this.X(matcher, 4);
        return ((l2 * zE.FontWeight("y", (int)7057, (long)(0x2988142C9D65ACAFL ^ l)) + l3) * zE.FontWeight("y", (int)15806, (long)(0x4897C619AC110A82L ^ l)) + l4) * zE.FontWeight("y", (int)6273, (long)(0x56A497714A12AFBEL ^ l)) + l5;
    }

    private long X(Matcher matcher, int n) {
        long l;
        block6: {
            String string;
            block4: {
                String string2;
                block5: {
                    long l2 = Property ^ 0x451755661340L;
                    string2 = matcher.group(n);
                    String string3 = ConfigHelper.O();
                    try {
                        try {
                            string = string2;
                            if (string3 != null) break block4;
                            if (string != null) break block5;
                        }
                        catch (MatchException matchException) {
                            throw zE.FontWeight(matchException);
                        }
                        l = 0L;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw zE.FontWeight(matchException);
                    }
                }
                string = string2;
            }
            l = Long.parseLong(string);
        }
        return l;
    }

    public static void Category() {
        FontWeight = new zE();
        StaticEventBus.P((Object)FontWeight);
    }

    public static zE Category() {
        return FontWeight;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        zE.Property = ObfuscationHelper.FontWeight((long)-8924784802156313973L, (long)4613851900784897891L, MethodHandles.lookup().lookupClass()).FontWeight(180521940672872L);
                        var11 = zE.Property ^ 134486671204452L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        PreMovementEvent = new byte[8];
                        PacketSendEvent = PreMovementEvent;
                        PreMovementEvent[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            PacketSendEvent = PacketSendEvent;
                            PacketSendEvent[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(PacketSendEvent)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[8];
                        var18_4 = 0;
                        var17_5 = "9\u00e6e\u00a4HaZ\u0091o\u001cT\u00cftx\r\u0091$Uu\u00e85M\u00f0X\u0018\u0086-\u00c6\u00fct@\u00e7I&\u007fXF\u00e1!\u0014\u0099J\u00e8\u00ea\u00a7\u00e8\u001e55\u0010k\u00c3\u00c0\u00c8U\u00e6\u0001{\u001ccH\u00b2\u00b9\u00d9\u00ec(\u0018\u00c5\u0084\u0017\u00bf\u00f3\u00ffQ\u008a*\u0084\u0014%\u00ed\u0003\u00d2\u008b\u00cd3\u000b/FontWeight\u0091\u0097\u00fc\u0018\u0086-\u00c6\u00fct@\u00e7I&\u007fXF\u00e1!\u0014\u0099J\u00e8\u00ea\u00a7\u00e8\u001e558b\u0094\u009c\u0096\u00a3I\u0087\u00fb\u00ad\u00b9\u00f7\u00f8\u00c5(!X\u00c1\u00f4fR\u0014\u00fdj\u0002\u00d2^\u00c1\r\u001c\u009a\u00cd>*P W9\u00d1\u0091\u00fc.>&K\u00c7\u00c8\u0018\u009dKF\u0011\u00b1\u00cf\u0015\u00b4]";
                        var19_6 = "9\u00e6e\u00a4HaZ\u0091o\u001cT\u00cftx\r\u0091$Uu\u00e85M\u00f0X\u0018\u0086-\u00c6\u00fct@\u00e7I&\u007fXF\u00e1!\u0014\u0099J\u00e8\u00ea\u00a7\u00e8\u001e55\u0010k\u00c3\u00c0\u00c8U\u00e6\u0001{\u001ccH\u00b2\u00b9\u00d9\u00ec(\u0018\u00c5\u0084\u0017\u00bf\u00f3\u00ffQ\u008a*\u0084\u0014%\u00ed\u0003\u00d2\u008b\u00cd3\u000b/FontWeight\u0091\u0097\u00fc\u0018\u0086-\u00c6\u00fct@\u00e7I&\u007fXF\u00e1!\u0014\u0099J\u00e8\u00ea\u00a7\u00e8\u001e558b\u0094\u009c\u0096\u00a3I\u0087\u00fb\u00ad\u00b9\u00f7\u00f8\u00c5(!X\u00c1\u00f4fR\u0014\u00fdj\u0002\u00d2^\u00c1\r\u001c\u009a\u00cd>*P W9\u00d1\u0091\u00fc.>&K\u00c7\u00c8\u0018\u009dKF\u0011\u00b1\u00cf\u0015\u00b4]".length();
                        var16_7 = 24;
                        var15_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            PacketReceiveEvent = ++var15_8;
                            v4 = var17_5.substring(PacketReceiveEvent, PacketReceiveEvent + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = zE.FontWeight(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00be\u0012\u0092\u0094t\u00ae\r\u00dc\u00c5q\u0097512\u00fd\u000e\u0087\u00d9\u0093\u00eft\Property\u00d3J0\u00aeMq\u0097\u00a3\u00ed\u00e0=!\u00ab\u00d5\u00898\u00bf\u00ee?\u00ecu\u00ac=|\u00c7\u0087\u00ca\u00a6\u00a9\u0004\fa\u00ad<\u00d2\u0001\u00e0t4\f\u00f3\r\u00f4Y/\u00e3\u00a4-\u008b\n\u0017";
                            var19_6 = "\u00be\u0012\u0092\u0094t\u00ae\r\u00dc\u00c5q\u0097512\u00fd\u000e\u0087\u00d9\u0093\u00eft\Property\u00d3J0\u00aeMq\u0097\u00a3\u00ed\u00e0=!\u00ab\u00d5\u00898\u00bf\u00ee?\u00ecu\u00ac=|\u00c7\u0087\u00ca\u00a6\u00a9\u0004\fa\u00ad<\u00d2\u0001\u00e0t4\f\u00f3\r\u00f4Y/\u00e3\u00a4-\u008b\n\u0017".length();
                            var16_7 = 24;
                            var15_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = zE.FontWeight(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl50:
                        // 1 sources

                        ** continue;
                    }
                }
                zE.StaticEventBus = var20_3;
                zE.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "\u00fc\Category\u00eec\u00e2lh\u00bb\u00a5\u0017\u00f0\u00947_$\u00ac";
                var5_15 = "\u00fc\Category\u00eec\u00e2lh\u00bb\u00a5\u0017\u00f0\u00947_$\u00ac".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl76:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00a9\u0011\u000b\u00a14\u00b81\u00b1\r\u00da\u00b0\u00c0\u000f\u00d1\u00d3\u00f6";
                    var5_15 = "\u00a9\u0011\u000b\u00a14\u00b81\u00b1\r\u00da\u00b0\u00c0\u000f\u00d1\u00d3\u00f6".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl89:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl102:
                // 1 sources

                ** continue;
            }
        }
        zE.d = var6_12;
        zE.f = new Long[4];
    }

    private static Throwable FontWeight(Throwable throwable) {
        return throwable;
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

    private static long FontWeight(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x413D;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = d[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("club/evon/zE", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            zE.f[n2] = l4;
        }
        return f[n2];
    }

    private static long FontWeight(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = zE.FontWeight(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite FontWeight(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("club/evon/zE" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zE.class, "FontWeight", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
