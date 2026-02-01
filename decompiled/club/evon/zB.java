/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.x
 *  org.apache.commons.io.FilenameUtils
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ds;
import club.evon.gQ;
import club.evon.x;
import club.evon.ym;
import club.evon.z8;
import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.file.Files;
import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class zB {
    private final Map<String, z8> P = new HashMap<String, z8>();
    private final File l;
    private final z8 B;
    private final Thread j;
    private static boolean X;
    private static final long a;
    private static final String[] b;
    private static final long[] c;
    private static final Long[] d;
    private static final Map e;

    public zB() {
        String[] stringArray = b;
        this.l = new File(ym.u, stringArray[4]);
        this.B = new z8(stringArray[0]);
        this.l.mkdirs();
        this.M();
        this.j = new Thread(this::w, stringArray[1]);
        this.j.setDaemon(true);
        this.j.start();
    }

    private String A(String string) {
        return string.toLowerCase();
    }

    private void M() {
        long l = a ^ 0x2EA9F9D16E3EL;
        File[] fileArray = this.l.listFiles();
        try {
            if (fileArray == null) {
                return;
            }
        }
        catch (JSONException jSONException) {
            throw zB.a((Exception)((Object)jSONException));
        }
        for (File file : fileArray) {
            String string = FilenameUtils.removeExtension((String)file.getName());
            this.P.put(this.A(string), new z8(string));
        }
    }

    private void w() {
        long l = a ^ 0x6B7CB7E3C946L;
        boolean bl = zB.B();
        block5: while (true) {
            File[] fileArray = this.l.listFiles();
            while (fileArray == null) {
                Thread.sleep((long)zB.a("r", (int)21488, (long)(0x7DDC0D16818CF1ABL ^ l)));
                if (!bl) continue;
                if (bl) continue block5;
            }
            try {
                HashSet<String> hashSet = new HashSet<String>();
                for (File file : fileArray) {
                    String string3 = FilenameUtils.removeExtension((String)file.getName());
                    String string4 = this.A(string3);
                    try {
                        hashSet.add(string4);
                        this.P.computeIfAbsent(string4, string2 -> new z8(string3));
                        if (!bl) continue block5;
                        if (bl) continue;
                        break;
                    }
                    catch (Exception exception) {
                        throw zB.a(exception);
                    }
                }
                this.P.keySet().removeIf(string -> {
                    boolean bl;
                    block8: {
                        block7: {
                            boolean bl2;
                            block6: {
                                long l = a ^ 0x63E1FC58D5A5L;
                                bl2 = zB.B();
                                try {
                                    try {
                                        bl = hashSet.contains(string);
                                        if (!bl2) break block6;
                                        if (bl) break block7;
                                    }
                                    catch (JSONException jSONException) {
                                        throw zB.a((Exception)((Object)jSONException));
                                    }
                                    bl = string.equals(this.A(b[2]));
                                }
                                catch (JSONException jSONException) {
                                    throw zB.a((Exception)((Object)jSONException));
                                }
                            }
                            try {
                                if (!bl2) break block8;
                                if (bl) break block7;
                            }
                            catch (JSONException jSONException) {
                                throw zB.a((Exception)((Object)jSONException));
                            }
                            bl = true;
                            break block8;
                        }
                        bl = false;
                    }
                    return bl;
                });
                Thread.sleep((long)zB.a("r", (int)22538, (long)(0xA7EA3DADBB7FA50L ^ l)));
            }
            catch (Exception exception) {
            }
        }
    }

    public void G(String string, boolean bl) {
        block3: {
            z8 z82;
            block2: {
                long l = a ^ 0x5380F18AD477L;
                z8 z83 = this.P.get(this.A(string));
                boolean bl2 = zB.O();
                try {
                    z82 = z83;
                    if (bl2) break block2;
                    if (z82 == null) break block3;
                }
                catch (JSONException jSONException) {
                    throw zB.a((Exception)((Object)jSONException));
                }
                z82 = z83;
            }
            z82.w(bl);
        }
    }

    public void X(String string) {
        block4: {
            boolean bl;
            block6: {
                block5: {
                    long l = a ^ 0x368BD7935D3L;
                    String string3 = this.A(string);
                    z8 z82 = this.P.computeIfAbsent(string3, string2 -> new z8(string));
                    boolean bl2 = zB.O();
                    try {
                        try {
                            z82.b();
                            if (gQ.q() != null) break block4;
                            if (!bl2) break block5;
                        }
                        catch (JSONException jSONException) {
                            throw zB.a((Exception)((Object)jSONException));
                        }
                        bl = false;
                        break block6;
                    }
                    catch (JSONException jSONException) {
                        throw zB.a((Exception)((Object)jSONException));
                    }
                }
                bl = true;
            }
            zB.t(bl);
        }
    }

    public z8 B(String string) {
        return this.P.get(this.A(string));
    }

    public z8 E(String string) {
        z8 z82;
        long l = a ^ 0x181856197798L;
        boolean bl = zB.B();
        String string2 = this.A(string);
        z8 z83 = new z8(string);
        this.P.put(string2, z83);
        boolean bl2 = bl;
        try {
            z82 = z83;
            if (!bl2) {
                gQ.o((gQ[])new gQ[3]);
            }
        }
        catch (JSONException jSONException) {
            throw zB.a((Exception)((Object)jSONException));
        }
        return z82;
    }

    /*
     * Unable to fully structure code
     */
    public void S(String var1_1) {
        block5: {
            var2_2 = zB.a ^ 126527337195506L;
            var5_3 = this.A(var1_1);
            var4_4 = zB.O();
            var6_5 = this.P.remove(var5_3);
            try {
                v0 = var6_5;
                if (!var4_4) {
                    if (v0 != null) break block5;
                }
                ** GOTO lbl17
            }
            catch (Exception v1) {
                throw zB.a(v1);
            }
            return;
        }
        try {
            v0 = var6_5;
lbl17:
            // 2 sources

            Files.deleteIfExists(v0.o().toPath());
        }
        catch (Exception var7_6) {
            x.k((String)(zB.b[3] + String.valueOf(var7_6)));
        }
    }

    public Map<String, z8> J() {
        return this.P;
    }

    public File T() {
        return this.l;
    }

    public z8 r() {
        return this.B;
    }

    public Thread w() {
        return this.j;
    }

    public static void t(boolean bl) {
        X = bl;
    }

    public static boolean B() {
        return X;
    }

    public static boolean O() {
        boolean bl = zB.B();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (JSONException jSONException) {
            throw zB.a((Exception)((Object)jSONException));
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        zB.a = ds.a((long)1611298997410034141L, (long)6383006156609818726L, MethodHandles.lookup().lookupClass()).a(152064617488377L);
                        var11 = zB.a ^ 80394236395766L;
                        zB.t(true);
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "W\u0012e\u00d8J\t\u0090\\\u0018r\u00e9\u00f9r\f\u001b\u008d6\u0014\u00d2S\u00a5\u0005\u00cb\u001dsx\n\u00e0\u00b0Rw\u009a\u00a6\b\u008f?s\u00d6\u00b38\u00c2@";
                        var19_6 = "W\u0012e\u00d8J\t\u0090\\\u0018r\u00e9\u00f9r\f\u001b\u008d6\u0014\u00d2S\u00a5\u0005\u00cb\u001dsx\n\u00e0\u00b0Rw\u009a\u00a6\b\u008f?s\u00d6\u00b38\u00c2@".length();
                        var16_7 = 8;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = zB.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00bd|+Fg^\u00d4\u009e\u0097\n\u00ea\u00bd\u001ap`DH\u00e5=d\u00e8,\u008f1\b5\u00f5\u00f3@\u00db\u00a3\u00c2\u00f1";
                            var19_6 = "\u00bd|+Fg^\u00d4\u009e\u0097\n\u00ea\u00bd\u001ap`DH\u00e5=d\u00e8,\u008f1\b5\u00f5\u00f3@\u00db\u00a3\u00c2\u00f1".length();
                            var16_7 = 24;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = zB.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                zB.b = var20_3;
                zB.e = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "{\u00c2)\u00f6\u00fb\u0019\u00b6\u0019m\u00b6(\u00fd\u00b9\u00d63\u0016";
                var5_15 = "{\u00c2)\u00f6\u00fb\u0019\u00b6\u0019m\u00b6(\u00fd\u00b9\u00d63\u0016".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        zB.c = var6_12;
        zB.d = new Long[2];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5B27;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("club/evon/zB", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            zB.d[n2] = l4;
        }
        return d[n2];
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = zB.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("club/evon/zB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(zB.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
