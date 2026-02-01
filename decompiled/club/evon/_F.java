/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.J6
 *  club.evon.Js
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.y8
 *  org.lwjgl.nanovg.NVGPaint
 */
package club.evon;

import club.evon.J6;
import club.evon.Js;
import club.evon._J;
import club.evon._V;
import club.evon._v;
import club.evon.ds;
import club.evon.gQ;
import club.evon.y8;
import club.evon.z7;
import club.evon.zW;
import club.evon.zo;
import club.evon.zy;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.lwjgl.nanovg.NVGPaint;

public final class _F
extends _V {
    private final zo B;
    private final List<zW> W;
    private static final Color e;
    private static final Color L;
    private static final float M = 4.5f;
    private static final z7 v;
    private static final z7 C;
    private final String i;
    private final float F;
    private float T;
    private float j;
    private static final float t = 4.0f;
    private final _J I;
    private static final long a;

    /*
     * Exception decompiling
     */
    public _F(zo var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
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
    public void o() {
        block7: {
            long l = a ^ 0x509852588252L;
            this.I.N(0.0);
            String string = zy.E();
            this.I.I();
            String string2 = string;
            for (zW zW2 : this.W) {
                try {
                    zW2.o();
                    if (string2 != null) {
                        if (string2 != null) continue;
                        break;
                    }
                    break block7;
                }
                catch (MatchException matchException) {
                    throw _F.a(matchException);
                }
            }
            this.I.l(150);
        }
        try {
            if (gQ.q() == null) {
                zy.f((String)"qsRT5b");
            }
        }
        catch (MatchException matchException) {
            throw _F.a(matchException);
        }
    }

    @Override
    public void T() {
        this.I.N(1.0);
    }

    @Override
    public void R() {
        this.I.N(0.0);
    }

    @Override
    public boolean n() {
        double d;
        block8: {
            block7: {
                String string;
                block6: {
                    long l = a ^ 0x2C1BF1F26E66L;
                    string = zy.E();
                    try {
                        try {
                            double d2 = this.I.z() - 0.0;
                            d = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
                            if (string == null) break block6;
                            if (d != false) break block7;
                        }
                        catch (MatchException matchException) {
                            throw _F.a(matchException);
                        }
                        double d3 = this.I.y() - 0.0;
                        d = d3 == 0.0 ? 0 : (d3 > 0.0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw _F.a(matchException);
                    }
                }
                try {
                    if (string == null) break block8;
                    if (d != false) break block7;
                }
                catch (MatchException matchException) {
                    throw _F.a(matchException);
                }
                d = 1.0;
                break block8;
            }
            d = 0.0;
        }
        return (boolean)d;
    }

    @Override
    public void o(int n, int n2) {
        _F _F2;
        block4: {
            block5: {
                long l = a ^ 0x3C364CF3CAA5L;
                String string = zy.E();
                try {
                    try {
                        _F2 = this;
                        if (string == null) break block4;
                        if (_F2.I.y() != 0.0) break block5;
                    }
                    catch (MatchException matchException) {
                        throw _F.a(matchException);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw _F.a(matchException);
                }
            }
            _F2 = this;
        }
        float f = _F2.j();
        float f2 = this.F();
        float f3 = this.L();
        float f4 = this.m();
        y8.v((float)f, (float)f2, (float)f3, (float)f4, (float)4.5f, (Color)Color.BLACK);
    }

    @Override
    public void l(int n, int n2) {
        block17: {
            _F _F2;
            String string;
            block15: {
                block16: {
                    long l = a ^ 0x1B63B610F863L;
                    string = zy.E();
                    try {
                        try {
                            _F2 = this;
                            if (string == null) break block15;
                            if (_F2.I.y() != 0.0) break block16;
                        }
                        catch (MatchException matchException) {
                            throw _F.a(matchException);
                        }
                        return;
                    }
                    catch (MatchException matchException) {
                        throw _F.a(matchException);
                    }
                }
                _F2 = this;
            }
            float f = _F2.j();
            float f2 = this.F();
            float f3 = this.L();
            float f4 = this.m();
            y8.j();
            float f5 = 1.1f;
            float f6 = 0.9090909f;
            y8.s((float)1.1f, (float)1.1f);
            y8.B((float)-30.0f, (float)-30.0f);
            y8.r((float)(f * 0.9090909f + 30.0f), (float)(f2 * 0.9090909f + 30.0f), (float)(f3 * 0.9090909f), (float)(f4 * 0.9090909f), (float)4.090909f, (NVGPaint)y8.o);
            y8.g();
            float f7 = Math.min(super.m(), f4);
            y8.y((float)f, (float)f2, (float)f3, (float)f7);
            y8.Z((float)f, (float)f2, (float)f3, (float)(f3 + 4.5f), (float)4.5f, (Color)L);
            v.U(this.B.toString(), f + 4.5f, f2 + 7.0f, 9.0f, -1);
            C.U(this.i, f + (f3 - (this.F + 4.5f)), f2 - 4.5f, 21.5f, -1);
            y8.v();
            y8.y((float)f, (float)(f2 + f7), (float)f3, (float)(f4 - f7));
            y8.Z((float)f, (float)f2, (float)f3, (float)f4, (float)4.5f, (Color)e);
            float f8 = this.i();
            this.j = Math.clamp(this.j, 0.0f, Math.max(f8, f4) - f4);
            this.T = Math.clamp(_v.p((float)this.T, (float)this.j, (float)0.1f), 0.0f, Math.max(f8, f4) - f4);
            float f9 = f2 + f7 - this.T;
            for (zW zW2 : this.W) {
                float f10;
                float f11;
                block18: {
                    block19: {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            zW2.F(f + 4.0f);
                                            zW2.q(f9 + 4.0f);
                                            zW2.V(f3 - 8.0f);
                                            zW2.U(f7);
                                            if (string == null) break block17;
                                            f11 = zW2.F() - f2;
                                            f10 = f4;
                                            if (string == null) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw _F.a(matchException);
                                        }
                                        if (!(f11 < f10)) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw _F.a(matchException);
                                    }
                                    f11 = zW2.F() + zW2.m();
                                    f10 = f9;
                                    if (string == null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw _F.a(matchException);
                                }
                                if (!(f11 >= f10)) break block19;
                            }
                            catch (MatchException matchException) {
                                throw _F.a(matchException);
                            }
                            zW2.l(n, n2);
                        }
                        catch (MatchException matchException) {
                            throw _F.a(matchException);
                        }
                    }
                    f11 = f9;
                    f10 = zW2.m() + 4.0f;
                }
                f9 = f11 + f10;
                if (string != null) continue;
            }
            y8.v();
        }
    }

    @Override
    public void W(double d, double d2, int n) {
        long l = a ^ 0x16DA165F8E20L;
        Iterator<zW> iterator = this.W.iterator();
        String string = zy.E();
        while (iterator.hasNext()) {
            double d3;
            double d4;
            zW zW2;
            block5: {
                zW zW3;
                block6: {
                    zW3 = iterator.next();
                    try {
                        try {
                            zW2 = zW3;
                            d4 = d;
                            d3 = d2;
                            if (string == null) break block5;
                            if (zW2.a(d4, d3)) break block6;
                        }
                        catch (MatchException matchException) {
                            throw _F.a(matchException);
                        }
                        if (string != null) continue;
                    }
                    catch (MatchException matchException) {
                        throw _F.a(matchException);
                    }
                }
                zW2 = zW3;
                d4 = d;
                d3 = d2;
            }
            zW2.W(d4, d3, n);
            if (string != null) continue;
        }
    }

    @Override
    public void H(double d, double d2, int n) {
        long l = a ^ 0x6B4E3CEA723L;
        Iterator<zW> iterator = this.W.iterator();
        String string = zy.E();
        while (iterator.hasNext()) {
            zW zW2 = iterator.next();
            zW2.H(d, d2, n);
            if (string != null) continue;
        }
    }

    @Override
    public void g(float f) {
        this.j -= f * 30.0f;
    }

    @Override
    public void S(int n) {
        long l = a ^ 0x2B7B6F83C86BL;
        Iterator<zW> iterator = this.W.iterator();
        String string = zy.E();
        while (iterator.hasNext()) {
            zW zW2 = iterator.next();
            zW2.S(n);
            if (string != null) continue;
        }
    }

    @Override
    public float m() {
        return Math.clamp(this.i(), 0.0f, 325.0f) * this.I.y().floatValue();
    }

    public float K() {
        return super.m();
    }

    private float i() {
        float f;
        block2: {
            long l = a ^ 0x6B0CA89F66DBL;
            float f2 = super.m();
            Iterator<zW> iterator = this.W.iterator();
            String string = zy.E();
            while (iterator.hasNext()) {
                zW zW2 = iterator.next();
                f = f2 + (zW2.m() + 4.0f);
                if (string != null) {
                    f2 = f;
                    if (string != null) continue;
                }
                break block2;
            }
            f = f2 + 4.0f;
        }
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = ds.a((long)1508340029593788877L, (long)8509198001381598369L, MethodHandles.lookup().lookupClass()).a(147116517028452L);
        long l = a ^ 0x1208BE0B735L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00e6\u0000H\u009f\u00e2.\"iT\u00af0\u00ecoH\u008cf\b\u00a3C\u00e9>x2\u00fe\u00f4";
        int n2 = "\u00e6\u0000H\u009f\u00e2.\"iT\u00af0\u00ecoH\u008cf\b\u00a3C\u00e9>x2\u00fe\u00f4".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _F.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = J6.N((Color)Js.V, (double)0.4f);
                L = J6.N((Color)Js.V, (double)0.7f);
                v = Js.p.a(stringArray[0]);
                C = Js.p.a(stringArray[1]);
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
