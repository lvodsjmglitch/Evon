/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  net.minecraft.class_1309
 *  net.minecraft.class_1531
 *  net.minecraft.class_1657
 *  net.minecraft.class_268
 *  net.minecraft.class_640
 *  org.json.JSONException
 */
package club.evon;

import club.evon._A;
import club.evon._r;
import club.evon.ds;
import club.evon.ym;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import net.minecraft.class_1531;
import net.minecraft.class_1657;
import net.minecraft.class_268;
import net.minecraft.class_640;
import org.json.JSONException;

public final class _9
extends _r {
    private static final long a = ds.a((long)-2288374518554289615L, (long)-9172913715433016032L, MethodHandles.lookup().lookupClass()).a(264286634240776L);
    private static final String b;

    public _9() {
        super(b);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean j(class_1309 class_13092) {
        class_268 class_2682;
        class_1657 class_16572;
        int n;
        block21: {
            class_640 class_6402;
            block19: {
                class_640 class_6403;
                block20: {
                    block18: {
                        boolean bl;
                        block16: {
                            block17: {
                                long l = a ^ 0x773006DD6C57L;
                                n = _A.M();
                                try {
                                    try {
                                        bl = class_13092 instanceof class_1531;
                                        if (n != 0) break block16;
                                        if (!bl) break block17;
                                        return false;
                                    }
                                    catch (JSONException jSONException) {
                                        throw _9.a(jSONException);
                                    }
                                }
                                catch (JSONException jSONException) {
                                    throw _9.a(jSONException);
                                }
                            }
                            bl = class_13092 instanceof class_1657;
                        }
                        try {
                            if (n != 0) return bl;
                            if (!bl) return true;
                        }
                        catch (JSONException jSONException) {
                            throw _9.a(jSONException);
                        }
                        class_16572 = (class_1657)class_13092;
                        class_6403 = ym.m.method_1562().method_2871(class_16572.method_5667());
                        try {
                            class_6402 = class_6403;
                            if (n != 0) break block18;
                            if (class_6402 == null) return false;
                        }
                        catch (JSONException jSONException) {
                            throw _9.a(jSONException);
                        }
                        class_6402 = class_6403;
                    }
                    try {
                        try {
                            if (n != 0) break block19;
                            if (class_6402.method_2966() != null) break block20;
                            return false;
                        }
                        catch (JSONException jSONException) {
                            throw _9.a(jSONException);
                        }
                    }
                    catch (JSONException jSONException) {
                        throw _9.a(jSONException);
                    }
                }
                class_6402 = class_6403;
            }
            class_268 class_2683 = class_6402.method_2955();
            try {
                class_2682 = class_2683;
                if (n != 0) break block21;
                if (class_2682 == null) return false;
            }
            catch (JSONException jSONException) {
                throw _9.a(jSONException);
            }
            class_2682 = class_2683;
        }
        try {
            boolean bl = class_2682.method_1197().equals(class_16572.method_5477().getString());
            if (n != 0) return bl;
            if (bl) return false;
            return true;
        }
        catch (JSONException jSONException) {
            throw _9.a(jSONException);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x7EE11026919EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u001b\u00dd\u00d7\u008f\u00a9\u009bx\u00be\u00f9\u0092\u00f5\u00cc\u0091D\u009a\u0018".getBytes("ISO-8859-1"));
                b = _9.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static JSONException a(JSONException jSONException) {
        return jSONException;
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
}
