/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.va
 *  org.json.JSONException
 */
package club.evon;

import club.evon._R;
import club.evon.ds;
import club.evon.gQ;
import club.evon.va;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class _O
extends _R {
    private static gQ[] T;
    private static final long b;
    private static final String[] c;

    public _O() {
        String[] stringArray = c;
        super(stringArray[7], stringArray[11], "");
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean x(String[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 16[SWITCH]
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
        return new va(this);
    }

    public static void y(gQ[] gQArray) {
        T = gQArray;
    }

    public static gQ[] T() {
        return T;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _O.b = ds.a((long)-5133075379898756605L, (long)-4147213842456635851L, MethodHandles.lookup().lookupClass()).a(212363016032067L);
                var0 = _O.b ^ 138937875393472L;
                _O.y(new gQ[4]);
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
                var9_3 = new String[16];
                var7_4 = 0;
                var6_5 = "t\u00cd\f\u00c4\u001a\u00e0J\u0011\b#?\u00817\u0085\u00bdTS\u0088\u00fec\u00a4\u00b3\u001b\u0098\u0018\u008e\u00d3H\u00f0\u008e]7=;\u00928\u008a\u00b4\u00ee#\u00aex\ne8\u00ee{\u00e8\u00c3\b\u00a3\u00d0\u0003\u00d0F7D{\b\u00dfYB\u00a3\u00bf\u00beQV\u0018y\u00eb\u00ea\u00fa\u00b0\u00cd|\u00a7a\u0087j\u00fe\u009c\u00cb\u0015$\u00af\u0015c\u0014\u00a5\u0019\u00c6h\b\u00db#\u0013:\u00f2\u0007!\u001b }~a\"z\r.V\u00d8\u00d5\u00e3W\u009e\u0015\u00a1@\u00f4\u00b3\u00007e\u00c5y\u00e6\u0007\u00c74\u009ff\u00e5s\u00b1\bQ\u0001z\u0091<\u00d7u\u00c0\b\u00b1\u00be'\u0013\u00b02\u0080L\b\u007f\u00ef\u00f5\u00acd\u0084\u00c8j\u0010\u00d2F\u008dzcr\u00ac\u00ee\u00ff\u00ba\u0098\u00ff\u00bf\u009b\u00da\u00a6\u00103\u0001\u008a\u0085/:S\u00dc5\u00f0$G\u0088\u00da\u0084\u0005\u0018\u00d2F\u008dzcr\u00ac\u00ee\u00e97\u00fc\u0091\u0014\u0013\u00b5n\u00db\u00dant.L\u00deM\b\u00f0\u0096\u00cbU5yfq";
                var8_6 = "t\u00cd\f\u00c4\u001a\u00e0J\u0011\b#?\u00817\u0085\u00bdTS\u0088\u00fec\u00a4\u00b3\u001b\u0098\u0018\u008e\u00d3H\u00f0\u008e]7=;\u00928\u008a\u00b4\u00ee#\u00aex\ne8\u00ee{\u00e8\u00c3\b\u00a3\u00d0\u0003\u00d0F7D{\b\u00dfYB\u00a3\u00bf\u00beQV\u0018y\u00eb\u00ea\u00fa\u00b0\u00cd|\u00a7a\u0087j\u00fe\u009c\u00cb\u0015$\u00af\u0015c\u0014\u00a5\u0019\u00c6h\b\u00db#\u0013:\u00f2\u0007!\u001b }~a\"z\r.V\u00d8\u00d5\u00e3W\u009e\u0015\u00a1@\u00f4\u00b3\u00007e\u00c5y\u00e6\u0007\u00c74\u009ff\u00e5s\u00b1\bQ\u0001z\u0091<\u00d7u\u00c0\b\u00b1\u00be'\u0013\u00b02\u0080L\b\u007f\u00ef\u00f5\u00acd\u0084\u00c8j\u0010\u00d2F\u008dzcr\u00ac\u00ee\u00ff\u00ba\u0098\u00ff\u00bf\u009b\u00da\u00a6\u00103\u0001\u008a\u0085/:S\u00dc5\u00f0$G\u0088\u00da\u0084\u0005\u0018\u00d2F\u008dzcr\u00ac\u00ee\u00e97\u00fc\u0091\u0014\u0013\u00b5n\u00db\u00dant.L\u00deM\b\u00f0\u0096\u00cbU5yfq".length();
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
                    var9_3[var7_4++] = _O.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "h[\u00db\u00a2\u009f\u001c\u00a84\u0098\u009a\u00a5\u00d7&\u00eb\u0081\r\u00ef=\u00dc\u00c6\u00cc0\u00040 }~a\"z\r.V\u00d8\u00d5\u00e3W\u009e\u0015\u00a1@\u00f4\u00b3\u00007e\u00c5y\u00e6\u0007\u00c74\u009ff\u00e5s\u00b1";
                    var8_6 = "h[\u00db\u00a2\u009f\u001c\u00a84\u0098\u009a\u00a5\u00d7&\u00eb\u0081\r\u00ef=\u00dc\u00c6\u00cc0\u00040 }~a\"z\r.V\u00d8\u00d5\u00e3W\u009e\u0015\u00a1@\u00f4\u00b3\u00007e\u00c5y\u00e6\u0007\u00c74\u009ff\u00e5s\u00b1".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = _O.a(var10_9).intern();
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
        _O.c = var9_3;
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
