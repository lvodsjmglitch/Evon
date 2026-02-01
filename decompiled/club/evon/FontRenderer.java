/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.gi
 *  club.evon.j
 *  club.evon.StringArrayHelper
 *  org.lwjgl.nanovg.NVGColor
 *  org.lwjgl.nanovg.NanoVG
 *  org.lwjgl.system.MemoryStack
 */
package club.evon;

import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.gi;
import club.evon.j;
import club.evon.StringArrayHelper;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.system.MemoryStack;

public final class FontRenderer {
    private final long FontWeight;
    private final String v;
    private final ByteBuffer StaticEventBus;
    public static boolean EventDispatcher;
    private static String l;
    private static final long Property;
    private static final long[] StaticEventBus;
    private static final Integer[] d;
    private static final Map RenderEvent;

    public z7(String string, String string2) {
        block4: {
            InputStream inputStream;
            block5: {
                long l = Property ^ 0x42E67EB3FD5EL;
                this.FontWeight = StringArrayHelper.I;
                String string3 = z7.r();
                inputStream = z7.class.getResourceAsStream(string2);
                try {
                    try {
                        if (string3 == null) break block4;
                        if (inputStream != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw z7.FontWeight(runtimeException);
                    }
                    throw new RuntimeException();
                }
                catch (RuntimeException runtimeException) {
                    throw z7.FontWeight(runtimeException);
                }
            }
            this.v = string;
            this.StaticEventBus = j.Property((InputStream)inputStream);
            NanoVG.nvgCreateFontMem((long)this.FontWeight, (CharSequence)this.v, (ByteBuffer)this.StaticEventBus, (boolean)false);
        }
    }

    public void U(String string, float f, float f2, float f3, int n) {
        this.FontWeight(string, f, f2, f3, n, false, 0.0f, 9);
    }

    public void q(String string, float f, float f2, float f3, int n, boolean bl) {
        this.FontWeight(string, f, f2, f3, n, bl, 0.0f, 9);
    }

    public void y(String string, float f, float f2, float f3, int n, boolean bl, int n2) {
        this.FontWeight(string, f, f2, f3, n, bl, 0.0f, n2);
    }

    public void FontWeight(String string, float f, float f2, float f3, int n, boolean bl, float f4, int n2) {
        int n3;
        block10: {
            block11: {
                String string2;
                long l;
                block8: {
                    block9: {
                        block6: {
                            block7: {
                                l = Property ^ 0x238410940B04L;
                                string2 = z7.r();
                                try {
                                    n3 = EventDispatcher;
                                    if (string2 == null) break block6;
                                    if (n3 == 0) break block7;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw z7.FontWeight(runtimeException);
                                }
                                return;
                            }
                            string = gi.u((String)string);
                            NanoVG.nvgFontFace((long)this.FontWeight, (CharSequence)this.v);
                            NanoVG.nvgFontSize((long)this.FontWeight, (float)f3);
                            NanoVG.nvgTextAlign((long)this.FontWeight, (int)n2);
                            float f5 = f4 - 0.0f;
                            n3 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
                        }
                        try {
                            if (string2 == null) break block8;
                            if (n3 <= 0) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw z7.FontWeight(runtimeException);
                        }
                        int n4 = n >> 24 & 0xFF;
                        int n5 = n4 << 24 | n & z7.FontWeight("i", (int)10650, (long)(0x22CD01378705DA04L ^ l));
                        NVGColor nVGColor = StringArrayHelper.V((int)n5);
                        NanoVG.nvgFontBlur((long)this.FontWeight, (float)f4);
                        NanoVG.nvgFillColor((long)this.FontWeight, (NVGColor)nVGColor);
                        NanoVG.nvgText((long)this.FontWeight, (float)f, (float)f2, (CharSequence)string);
                        nVGColor.free();
                        NanoVG.nvgFontBlur((long)this.FontWeight, (float)0.0f);
                    }
                    n3 = bl ? 1 : 0;
                }
                try {
                    if (string2 == null) break block10;
                    if (n3 == 0) break block11;
                }
                catch (RuntimeException runtimeException) {
                    throw z7.FontWeight(runtimeException);
                }
                NVGColor nVGColor = StringArrayHelper.V((int)((n & z7.FontWeight("i", (int)15734, (long)(0x5B8496E0BA714EEAL ^ l))) >> 2 | n & z7.FontWeight("i", (int)10525, (long)(0x3AF1F9B50622DA80L ^ l))));
                NanoVG.nvgFillColor((long)this.FontWeight, (NVGColor)nVGColor);
                NanoVG.nvgText((long)this.FontWeight, (float)(f + 0.5f), (float)(f2 + 0.5f), (CharSequence)string);
                nVGColor.free();
            }
            n3 = n;
        }
        NVGColor nVGColor = StringArrayHelper.V((int)n3);
        NanoVG.nvgFillColor((long)this.FontWeight, (NVGColor)nVGColor);
        NanoVG.nvgText((long)this.FontWeight, (float)f, (float)f2, (CharSequence)string);
        nVGColor.free();
    }

    /*
     * Unable to fully structure code
     */
    public float StaticEventBus(String var1_1, float var2_2, int var3_3) {
        block10: {
            block9: {
                var4_4 = z7.Property ^ 109220641971027L;
                v0 = z7.r();
                NanoVG.nvgFontFace((long)this.FontWeight, (CharSequence)this.v);
                NanoVG.nvgFontSize((long)this.FontWeight, (float)var2_2);
                var6_5 = v0;
                NanoVG.nvgTextAlign((long)this.FontWeight, (int)var3_3);
                var7_6 = MemoryStack.stackPush();
                try {
                    var8_7 = var7_6.mallocFloat(4);
                    var9_9 = NanoVG.nvgTextBounds((long)this.FontWeight, (float)0.0f, (float)0.0f, (CharSequence)var1_1, (FloatBuffer)var8_7);
                }
                catch (Throwable var8_8) {
                    block11: {
                        try {
                            PreMovementEvent = var7_6;
                            if (var6_5 != null) {
                                if (PreMovementEvent == null) break block11;
                            }
                            ** GOTO lbl22
                        }
                        catch (Throwable PacketSendEvent) {
                            throw z7.FontWeight(PacketSendEvent);
                        }
                        try {
                            PreMovementEvent = var7_6;
lbl22:
                            // 2 sources

                            PreMovementEvent.close();
                        }
                        catch (Throwable var9_10) {
                            var8_8.addSuppressed(var9_10);
                        }
                    }
                    throw var8_8;
                }
                try {
                    PacketReceiveEvent = var7_6;
                    if (var6_5 == null) break block9;
                    if (PacketReceiveEvent == null) break block10;
                }
                catch (Throwable v4) {
                    throw z7.FontWeight(v4);
                }
                PacketReceiveEvent = var7_6;
            }
            PacketReceiveEvent.close();
        }
        return var9_9;
    }

    public float y(String string, float f) {
        return this.StaticEventBus(string, f, 9);
    }

    /*
     * Unable to fully structure code
     */
    public float q(String var1_1, float var2_2, int var3_3) {
        block13: {
            block12: {
                var4_4 = z7.Property ^ 90329620961213L;
                v0 = z7.r();
                NanoVG.nvgFontFace((long)this.FontWeight, (CharSequence)this.v);
                var6_5 = v0;
                NanoVG.nvgFontSize((long)this.FontWeight, (float)var2_2);
                NanoVG.nvgTextAlign((long)this.FontWeight, (int)var3_3);
                var7_6 = MemoryStack.stackPush();
                try {
                    var8_7 = var7_6.mallocFloat(4);
                    NanoVG.nvgTextBounds((long)this.FontWeight, (float)0.0f, (float)0.0f, (CharSequence)var1_1, (FloatBuffer)var8_7);
                    var9_9 = var8_7.get(3) - var8_7.get(1);
                }
                catch (Throwable var8_8) {
                    block14: {
                        try {
                            PreMovementEvent = var7_6;
                            if (var6_5 != null) {
                                if (PreMovementEvent == null) break block14;
                            }
                            ** GOTO lbl24
                        }
                        catch (Throwable PacketSendEvent) {
                            throw z7.FontWeight(PacketSendEvent);
                        }
                        try {
                            PreMovementEvent = var7_6;
lbl24:
                            // 2 sources

                            PreMovementEvent.close();
                        }
                        catch (Throwable var9_10) {
                            var8_8.addSuppressed(var9_10);
                        }
                    }
                    throw var8_8;
                }
                try {
                    PacketReceiveEvent = var7_6;
                    if (var6_5 == null) break block12;
                    if (PacketReceiveEvent == null) break block13;
                }
                catch (Throwable v4) {
                    throw z7.FontWeight(v4);
                }
                PacketReceiveEvent = var7_6;
            }
            PacketReceiveEvent.close();
        }
        try {
            v5 = var9_9;
            if (Module.q() == null) {
                z7.FontWeight("WK509");
            }
        }
        catch (Throwable v6) {
            throw z7.FontWeight(v6);
        }
        return v5;
    }

    /*
     * Unable to fully structure code
     */
    public float i(String var1_1, float var2_2) {
        block13: {
            block12: {
                var3_3 = z7.Property ^ 106279985799253L;
                NanoVG.nvgFontFace((long)this.FontWeight, (CharSequence)this.v);
                v0 = z7.r();
                NanoVG.nvgFontSize((long)this.FontWeight, (float)var2_2);
                NanoVG.nvgTextAlign((long)this.FontWeight, (int)9);
                var5_4 = v0;
                var6_5 = MemoryStack.stackPush();
                try {
                    var7_6 = var6_5.mallocFloat(4);
                    NanoVG.nvgTextBounds((long)this.FontWeight, (float)0.0f, (float)0.0f, (CharSequence)var1_1, (FloatBuffer)var7_6);
                    var8_8 = var7_6.get(3) - var7_6.get(1);
                }
                catch (Throwable var7_7) {
                    block14: {
                        try {
                            PreMovementEvent = var6_5;
                            if (var5_4 != null) {
                                if (PreMovementEvent == null) break block14;
                            }
                            ** GOTO lbl24
                        }
                        catch (Throwable PacketSendEvent) {
                            throw z7.FontWeight(PacketSendEvent);
                        }
                        try {
                            PreMovementEvent = var6_5;
lbl24:
                            // 2 sources

                            PreMovementEvent.close();
                        }
                        catch (Throwable var8_9) {
                            var7_7.addSuppressed(var8_9);
                        }
                    }
                    throw var7_7;
                }
                try {
                    PacketReceiveEvent = var6_5;
                    if (var5_4 == null) break block12;
                    if (PacketReceiveEvent == null) break block13;
                }
                catch (Throwable v4) {
                    throw z7.FontWeight(v4);
                }
                PacketReceiveEvent = var6_5;
            }
            PacketReceiveEvent.close();
        }
        try {
            v5 = var8_8;
            if (var5_4 == null) {
                Module.o((Module[])new Module[2]);
            }
        }
        catch (Throwable v6) {
            throw z7.FontWeight(v6);
        }
        return v5;
    }

    public static void FontWeight(String string) {
        l = string;
    }

    public static String r() {
        return l;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        Property = ObfuscationHelper.FontWeight((long)-1684887590496467845L, (long)8094525656688395030L, MethodHandles.lookup().lookupClass()).FontWeight(205488354545760L);
        RenderEvent = new HashMap(13);
        long l = Property ^ 0x5994CE204A4BL;
        z7.FontWeight("Zd6Az");
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00d4k\u007f\u00c1\u0095T\u00e7]\u00c5\u00ad[]\u00a4\u00edj\u00ec\u001e\u00a5\u00b8\u00bf8\u0014\u00ca\u00fa";
        int n2 = "\u00d4k\u007f\u00c1\u0095T\u00e7]\u00c5\u00ad[]\u00a4\u00edj\u00ec\u001e\u00a5\u00b8\u00bf8\u0014\u00ca\u00fa".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        StaticEventBus = lArray;
        d = new Integer[3];
    }

    private static Throwable FontWeight(Throwable throwable) {
        return throwable;
    }

    private static int FontWeight(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4FA5;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = StaticEventBus[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])RenderEvent.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    RenderEvent.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("club/evon/z7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            z7.d[n2] = n3;
        }
        return d[n2];
    }

    private static int FontWeight(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = z7.FontWeight(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite FontWeight(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("club/evon/z7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(z7.class, "FontWeight", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
