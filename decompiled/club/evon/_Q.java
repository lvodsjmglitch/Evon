/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  org.json.JSONException
 */
package club.evon;

import club.evon._R;
import club.evon.ds;
import club.evon.zQ;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _Q
extends _R {
    public static boolean j;
    private static String n;
    private static final long b;
    private static final String[] c;

    public _Q() {
        String[] stringArray = c;
        super(stringArray[4], stringArray[5], "");
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean x(String[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 8[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public ArrayList<String> X() {
        return new zQ(this);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _Q.b = ds.a((long)2336031094235391668L, (long)-4717139131064411366L, MethodHandles.lookup().lookupClass()).a(99622615881018L);
                var0 = _Q.b ^ 1067756640664L;
                _Q.q(null);
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[6];
                var7_4 = 0;
                var6_5 = "\u00f2{\u00abo\u00d5\u0098\u0080\u0090\u008b]wn\u00e3\bp\u00ee\u0093\u00d6\u0090N\u00d2\u00b3\u008cF\bT\u00d2\u001a_@\u00c6c4\b\u00c3\u00denFSRG\u009b(R\u00aaA\u00f5\u0093\u00e0\nQ\u00d5\u0015%\u009a\u00e1\u00fec.\u00dd\u0004-X\u00df\u00f3bzCg\u00fd\u00eax\u00abb\u00ee\u00a5u\u00adR\u00f2:\u001c\u00d8";
                var8_6 = "\u00f2{\u00abo\u00d5\u0098\u0080\u0090\u008b]wn\u00e3\bp\u00ee\u0093\u00d6\u0090N\u00d2\u00b3\u008cF\bT\u00d2\u001a_@\u00c6c4\b\u00c3\u00denFSRG\u009b(R\u00aaA\u00f5\u0093\u00e0\nQ\u00d5\u0015%\u009a\u00e1\u00fec.\u00dd\u0004-X\u00df\u00f3bzCg\u00fd\u00eax\u00abb\u00ee\u00a5u\u00adR\u00f2:\u001c\u00d8".length();
                var5_7 = 24;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _Q.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "zb\u00be\u00c1\u00ed\u00ccG\u0094(\u00d9\u0080\u00e0\u00bcm\u0094Cn\u0089,\u0016\u001c\u00d6\u009bn\u0006\u00cb\u00e2<\u00f3.\u001e^ \u00e3\u00e5\u00c8\u00cc\u0096N,\u00fe\u00d4\u0019\u009f\u0098\u00c3\u00e0\u00ad\u0085";
                    var8_6 = "zb\u00be\u00c1\u00ed\u00ccG\u0094(\u00d9\u0080\u00e0\u00bcm\u0094Cn\u0089,\u0016\u001c\u00d6\u009bn\u0006\u00cb\u00e2<\u00f3.\u001e^ \u00e3\u00e5\u00c8\u00cc\u0096N,\u00fe\u00d4\u0019\u009f\u0098\u00c3\u00e0\u00ad\u0085".length();
                    var5_7 = 8;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = _Q.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        _Q.c = var9_3;
        _Q.j = true;
    }

    public static void q(String string) {
        n = string;
    }

    public static String a() {
        return n;
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
