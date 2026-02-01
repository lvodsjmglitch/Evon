/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.B
 *  club.evon.K
 *  club.evon.L
 *  club.evon.P
 *  club.evon.R
 *  club.evon.a
 *  club.evon.c
 *  club.evon.ds
 *  club.evon.i
 *  club.evon.t
 *  club.evon.u
 *  club.evon.vJ
 *  club.evon.yb
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.minecraft.class_241
 *  org.json.JSONException
 */
package club.evon;

import club.evon.B;
import club.evon.K;
import club.evon.L;
import club.evon.P;
import club.evon.R;
import club.evon._H;
import club.evon.a;
import club.evon.c;
import club.evon.ds;
import club.evon.i;
import club.evon.t;
import club.evon.u;
import club.evon.vJ;
import club.evon.yb;
import club.evon.ym;
import club.evon.zB;
import club.evon.zq;
import club.evon.zy;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.invoke.MethodHandles;
import java.lang.runtime.SwitchBootstraps;
import java.security.Key;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_241;
import org.json.JSONException;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class z8 {
    private static final DateTimeFormatter v;
    private String j;
    private String b;
    private String m;
    private int H;
    private final String F;
    private final File M;
    private static final long a;
    private static final String[] c;

    public z8(String string) {
        String[] stringArray = c;
        this.j = stringArray[11];
        this.b = stringArray[6];
        this.m = stringArray[6];
        this.H = _H.USER.v();
        this.F = string;
        this.M = new File(new File(ym.m.field_1697, stringArray[20]), string + stringArray[4]);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public void b() {
        var1_1 = z8.a ^ 26560953396339L;
        var3_2 = zB.O();
        try {
            block28: {
                this.M.createNewFile();
                var4_3 = new JsonObject();
                var5_5 = new JsonObject();
                var23_6 = z8.c;
                this.j = var23_6[16];
                this.b = zy.g().r();
                this.H = zy.g().M().v();
                this.m = ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
                var5_5.addProperty(var23_6[0], this.j);
                var5_5.addProperty(var23_6[21], this.b);
                var5_5.addProperty(var23_6[23], (Number)this.H);
                var5_5.addProperty(var23_6[22], this.m);
                var4_3.add(var23_6[7], (JsonElement)var5_5);
                var6_7 = new JsonObject();
                var7_8 = zy.p().q().j().iterator();
                block22: while (true) {
                    v0 /* !! */  = var7_8.hasNext();
                    block23: while (v0 /* !! */ ) {
                        var8_9 /* !! */  = var7_8.next();
                        var9_10 = new JsonObject();
                        var23_6 = z8.c;
                        var9_10.addProperty(var23_6[2], Boolean.valueOf(var8_9 /* !! */ .d()));
                        if (var3_2) break block28;
                        for (B var11_13 : var8_9 /* !! */ .V()) {
                            Objects.requireNonNull(var11_13);
                            var13_16 = 0;
                            try {
                                v1 = var12_15;
                                if (!var3_2) {
                                    v0 /* !! */  = SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{L.class, t.class, K.class, a.class, i.class, R.class, P.class, u.class, c.class}, (Object)v1, var13_16);
                                    if (var3_2) continue block23;
                                }
                                ** GOTO lbl44
                            }
                            catch (Throwable v2) {
                                throw z8.a(v2);
                            }
                            switch (v0 /* !! */  ? 1 : 0) {
                                case 0: {
                                    v1 = var12_15;
lbl44:
                                    // 2 sources

                                    var14_17 = (L)v1;
                                    var15_18 = new JsonObject();
                                    var23_6 = z8.c;
                                    var15_18.addProperty(var23_6[25], (Number)var14_17.J());
                                    var15_18.addProperty(var23_6[5], var14_17.h().name());
                                    var9_10.add(var14_17.S(), (JsonElement)var15_18);
                                    if (!var3_2) break;
                                }
                                case 1: {
                                    var15_18 = (t)var12_15;
                                    var9_10.addProperty(var11_13.S(), var15_18.I());
                                    if (!var3_2) break;
                                }
                                case 2: {
                                    var16_19 = (K)var12_15;
                                    var17_20 = new JsonObject();
                                    for (u var21_27 : (t[])var16_19.J()) {
                                        try {
                                            var17_20.addProperty(var21_27.S(), var21_27.I());
                                            if (!var3_2) {
                                                if (!var3_2) continue;
                                                break;
                                            }
                                            ** GOTO lbl68
                                        }
                                        catch (Throwable v3) {
                                            throw z8.a(v3);
                                        }
                                    }
                                    var9_10.add(var11_13.S(), (JsonElement)var17_20);
lbl68:
                                    // 2 sources

                                    if (!var3_2) break;
                                }
                                case 3: {
                                    var17_20 = (a)var12_15;
                                    var9_10.addProperty(var11_13.S(), (Number)var17_20.J());
                                    if (!var3_2) break;
                                }
                                case 4: {
                                    var18_21 = (t[])var12_15;
                                    var9_10.addProperty(var11_13.S(), String.valueOf(var18_21.J()));
                                    if (!var3_2) break;
                                }
                                case 5: {
                                    var19_23 = (R)var12_15;
                                    var20_25 = new JsonObject();
                                    var20_25.addProperty("x", (Number)Float.valueOf(((class_241)var19_23.J()).field_1343));
                                    var20_25.addProperty("y", (Number)Float.valueOf(((class_241)var19_23.J()).field_1342));
                                    var9_10.add(var19_23.S(), (JsonElement)var20_25);
                                    if (!var3_2) break;
                                }
                                case 6: {
                                    var20_26 = (P)var12_15;
                                    var9_10.addProperty(var11_13.S(), String.valueOf(((vJ)var20_26.J()).R()));
                                    if (!var3_2) break;
                                }
                                case 7: {
                                    var21_27 = (u)var12_15;
                                    var9_10.addProperty(var11_13.S(), (String)var21_27.J());
                                    if (!var3_2) break;
                                }
                                case 8: {
                                    var22_28 = (c)var12_15;
                                    var9_10.addProperty(var11_13.S(), (Number)((Color)var22_28.J()).getRGB());
                                    break;
                                }
                            }
                            if (!var3_2) continue;
                        }
                        var6_7.add(var8_9 /* !! */ .x(), (JsonElement)var9_10);
                        if (!var3_2) continue block22;
                    }
                    break;
                }
                var23_6 = z8.c;
                var4_3.add(var23_6[18], (JsonElement)var6_7);
            }
            var23_6 = z8.c;
            var7_8 = var23_6[10];
            var8_9 /* !! */  = yb.q((String)var23_6[10], (String)ym.p.toJson((JsonElement)var4_3));
            var9_10 = new BufferedWriter(new FileWriter(this.M, false));
            try {
                var9_10.write((String)var8_9 /* !! */ );
            }
            finally {
                var9_10.close();
            }
        }
        catch (Exception var4_4) {
            // empty catch block
        }
    }

    /*
     * Unable to fully structure code
     */
    public void C() {
        block41: {
            var1_1 = z8.a ^ 66199645410513L;
            var3_2 = zB.O();
            try {
                if (!this.M.exists()) {
                    return;
                }
            }
            catch (Throwable v0) {
                throw z8.a(v0);
            }
            try {
                block48: {
                    block46: {
                        block47: {
                            block44: {
                                block45: {
                                    block42: {
                                        block43: {
                                            block40: {
                                                block38: {
                                                    block39: {
                                                        block37: {
                                                            var4_3 = new StringBuilder();
                                                            var5_5 = new BufferedReader(new FileReader(this.M));
                                                            try {
                                                                while ((var6_6 = var5_5.readLine()) != null) {
                                                                    try {
                                                                        var4_3.append(var6_6);
                                                                        if (!var3_2) {
                                                                            if (!var3_2) continue;
                                                                            ** break;
                                                                        }
                                                                        break block37;
                                                                    }
                                                                    catch (Throwable v1) {
                                                                        throw z8.a(v1);
                                                                    }
                                                                }
                                                            }
                                                            catch (Throwable var6_7) {
                                                                try {
                                                                    var5_5.close();
                                                                }
                                                                catch (Throwable var7_9) {
                                                                    var6_7.addSuppressed(var7_9);
                                                                }
                                                                throw var6_7;
                                                            }
lbl30:
                                                            // 2 sources

                                                            var5_5.close();
                                                        }
                                                        try {
                                                            var10_11 = z8.c;
                                                            var6_6 = var10_11[10];
                                                            var5_5 = yb.J((String)var10_11[10], (String)var4_3.toString());
                                                        }
                                                        catch (Exception var6_8) {
                                                            return;
                                                        }
                                                        var6_6 = (JsonObject)ym.p.fromJson((String)var5_5, JsonObject.class);
                                                        try {
                                                            v2 = var6_6;
                                                            if (var3_2) break block38;
                                                            if (v2 != null) break block39;
                                                        }
                                                        catch (Throwable v3) {
                                                            throw z8.a(v3);
                                                        }
                                                        return;
                                                    }
                                                    v2 = var6_6;
                                                }
                                                v4 = z8.c[7];
                                                if (var3_2) break block40;
                                                try {
                                                    block49: {
                                                        if (!v2.has(v4)) break block41;
                                                        break block49;
                                                        catch (Throwable v5) {
                                                            throw z8.a(v5);
                                                        }
                                                    }
                                                    v2 = var6_6;
                                                    v4 = z8.c[7];
                                                }
                                                catch (Throwable v6) {
                                                    throw z8.a(v6);
                                                }
                                            }
                                            var7_10 = v2.getAsJsonObject(v4);
                                            v7 = var7_10.has(z8.c[21]);
                                            if (var3_2) break block42;
                                            try {
                                                block50: {
                                                    if (!v7) break block43;
                                                    break block50;
                                                    catch (Throwable v8) {
                                                        throw z8.a(v8);
                                                    }
                                                }
                                                this.b = var7_10.get(z8.c[21]).getAsString();
                                            }
                                            catch (Throwable v9) {
                                                throw z8.a(v9);
                                            }
                                        }
                                        var10_11 = z8.c;
                                        v7 = var7_10.has(var10_11[23]);
                                    }
                                    if (var3_2) break block44;
                                    try {
                                        block51: {
                                            if (!v7) break block45;
                                            break block51;
                                            catch (Throwable v10) {
                                                throw z8.a(v10);
                                            }
                                        }
                                        this.H = var7_10.get(z8.c[23]).getAsInt();
                                    }
                                    catch (Throwable v11) {
                                        throw z8.a(v11);
                                    }
                                }
                                var10_11 = z8.c;
                                v7 = var7_10.has(var10_11[0]);
                            }
                            if (var3_2) break block46;
                            try {
                                block52: {
                                    if (!v7) break block47;
                                    break block52;
                                    catch (Throwable v12) {
                                        throw z8.a(v12);
                                    }
                                }
                                this.j = var7_10.get(z8.c[0]).getAsString();
                            }
                            catch (Throwable v13) {
                                throw z8.a(v13);
                            }
                        }
                        try {
                            v14 = var7_10;
                            v15 = z8.c[22];
                            if (var3_2) break block48;
                            v7 = v14.has(v15);
                        }
                        catch (Throwable v16) {
                            throw z8.a(v16);
                        }
                    }
                    try {
                        if (!v7) break block41;
                        v14 = var7_10;
                        v15 = z8.c[22];
                    }
                    catch (Throwable v17) {
                        throw z8.a(v17);
                    }
                }
                var8_12 = ZonedDateTime.parse(v14.get(v15).getAsString(), DateTimeFormatter.ISO_OFFSET_DATE_TIME);
                var9_13 = var8_12.withZoneSameInstant(ZoneId.systemDefault());
                this.m = var9_13.toLocalDate().format(z8.v);
            }
            catch (Exception var4_4) {
                // empty catch block
            }
        }
    }

    public void f() {
        this.w(false);
    }

    /*
     * Exception decompiling
     */
    public void w(boolean var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 42[UNCONDITIONALDOLOOP]
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

    private <T extends Enum<T>> void e(B<?> b, String string) {
        long l = a ^ 0x220800C34221L;
        i i2 = (i)b;
        for (Enum enum_ : i2.C()) {
            try {
                if (!enum_.name().equals(String.valueOf(string))) continue;
                i2.P((Object)enum_);
            }
            catch (JSONException jSONException) {
                throw z8.a(jSONException);
            }
        }
    }

    private void D(B<?> b, String string) {
        long l = a ^ 0x72AC1C7E4CFCL;
        P p = (P)b;
        for (vJ vJ2 : p.b()) {
            try {
                if (!vJ2.R().equals(String.valueOf(string))) continue;
                p.n(vJ2);
            }
            catch (JSONException jSONException) {
                throw z8.a(jSONException);
            }
        }
    }

    private void P(B<?> b, String string) {
        long l = a ^ 0x4ECDFCB082CDL;
        L l2 = (L)b;
        for (zq zq2 : zq.values()) {
            try {
                if (!zq2.name().equals(String.valueOf(string))) continue;
                l2.v(zq2);
            }
            catch (JSONException jSONException) {
                throw z8.a(jSONException);
            }
        }
    }

    public String E() {
        return this.j;
    }

    public String o() {
        return this.b;
    }

    public String P() {
        return this.m;
    }

    public int j() {
        return this.H;
    }

    public String V() {
        return this.F;
    }

    public File o() {
        return this.M;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                z8.a = ds.a((long)2930774570581079650L, (long)8136882244849921743L, MethodHandles.lookup().lookupClass()).a(24517570845089L);
                var0 = z8.a ^ 140490824541646L;
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
                var9_3 = new String[26];
                var7_4 = 0;
                var6_5 = "\u00ac\\\u0003F\u00e3\u0080]\u00aa\b\u0088@\u0007\u00b0\u00f6\u0088\u00d5o\b\u0087\u0085\u00eb\n\u001d\u00c9\u00d7\u00e3\b\u0087\u0085\u00eb\n\u001d\u00c9\u00d7\u00e3\b\u00af\u00be\u00feV\u00ef4\u00f3\u00e3\b\u008a\u00c6\u00af\u00d9\u00b9\u00ed\u0082\u00a5\b\u00f6\u00e6D{\u00f6\u008a{^\b\u00dd\u00ac\f n\u00f3z\u000f\b\u00dd\u00ac\f n\u00f3z\u000f\b\u0089\u00d6i!\u001cLB\u00ce(\\\u009coy\u0016?\r\u00b4,\u00a1\u0016\u00c3\u00c5l-}7\u00ac\u00f6\u001d\u0096\u00af\u00e4\u00035\u00dd\u009a\u0016f\u00bb\u00f7\u00e3\u00a9\nh\u00ba\u00a9\u00cc\u0004r\b\u00f6\u00e6D{\u00f6\u008a{^(\\\u009coy\u0016?\r\u00b4,\u00a1\u0016\u00c3\u00c5l-}7\u00ac\u00f6\u001d\u0096\u00af\u00e4\u00035\u00dd\u009a\u0016f\u00bb\u00f7\u00e3\u00a9\nh\u00ba\u00a9\u00cc\u0004r\b\u008a\u00c6\u00af\u00d9\u00b9\u00ed\u0082\u00a5\b.\u00fc\b\u00d2\u00bbXs}\b\u0086v\u0016\u0006\u000bG\u00cb\u00e9\b\u00f1\u0091W*\u0001\u0096J\u00fe\b8V\u00e3\u00fc\u0019\u00b8\u00e92\b8V\u00e3\u00fc\u0019\u00b8\u00e92\u0010!\u0085{\u00aaZ(\\ S\u00c0Wt\u0097\u00f6\u001b\u00af\u0010\u0006\u00f3\u00fal\u00e5E\u0095.s\u00a1<\u00f8\u0016\u00fdg\u008a\b\u0086v\u0016\u0006\u000bG\u00cb\u00e9\b\u0088@\u0007\u00b0\u00f6\u0088\u00d5o\b\u0089\u00d6i!\u001cLB\u00ce";
                var8_6 = "\u00ac\\\u0003F\u00e3\u0080]\u00aa\b\u0088@\u0007\u00b0\u00f6\u0088\u00d5o\b\u0087\u0085\u00eb\n\u001d\u00c9\u00d7\u00e3\b\u0087\u0085\u00eb\n\u001d\u00c9\u00d7\u00e3\b\u00af\u00be\u00feV\u00ef4\u00f3\u00e3\b\u008a\u00c6\u00af\u00d9\u00b9\u00ed\u0082\u00a5\b\u00f6\u00e6D{\u00f6\u008a{^\b\u00dd\u00ac\f n\u00f3z\u000f\b\u00dd\u00ac\f n\u00f3z\u000f\b\u0089\u00d6i!\u001cLB\u00ce(\\\u009coy\u0016?\r\u00b4,\u00a1\u0016\u00c3\u00c5l-}7\u00ac\u00f6\u001d\u0096\u00af\u00e4\u00035\u00dd\u009a\u0016f\u00bb\u00f7\u00e3\u00a9\nh\u00ba\u00a9\u00cc\u0004r\b\u00f6\u00e6D{\u00f6\u008a{^(\\\u009coy\u0016?\r\u00b4,\u00a1\u0016\u00c3\u00c5l-}7\u00ac\u00f6\u001d\u0096\u00af\u00e4\u00035\u00dd\u009a\u0016f\u00bb\u00f7\u00e3\u00a9\nh\u00ba\u00a9\u00cc\u0004r\b\u008a\u00c6\u00af\u00d9\u00b9\u00ed\u0082\u00a5\b.\u00fc\b\u00d2\u00bbXs}\b\u0086v\u0016\u0006\u000bG\u00cb\u00e9\b\u00f1\u0091W*\u0001\u0096J\u00fe\b8V\u00e3\u00fc\u0019\u00b8\u00e92\b8V\u00e3\u00fc\u0019\u00b8\u00e92\u0010!\u0085{\u00aaZ(\\ S\u00c0Wt\u0097\u00f6\u001b\u00af\u0010\u0006\u00f3\u00fal\u00e5E\u0095.s\u00a1<\u00f8\u0016\u00fdg\u008a\b\u0086v\u0016\u0006\u000bG\u00cb\u00e9\b\u0088@\u0007\u00b0\u00f6\u0088\u00d5o\b\u0089\u00d6i!\u001cLB\u00ce".length();
                var5_7 = 8;
                var4_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = z8.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ac\\\u0003F\u00e3\u0080]\u00aa\b.\u00fc\b\u00d2\u00bbXs}";
                    var8_6 = "\u00ac\\\u0003F\u00e3\u0080]\u00aa\b.\u00fc\b\u00d2\u00bbXs}".length();
                    var5_7 = 8;
                    var4_8 = -1;
lbl33:
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
lbl38:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = z8.a(var10_9).intern();
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
lbl50:
                // 1 sources

                ** continue;
            }
        }
        z8.c = var9_3;
        z8.v = DateTimeFormatter.ofPattern(z8.c[19]);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char c2;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c2 = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                c2 = (char)(c2 | (char)(n3 & 0x3F));
                cArray[n++] = c2;
                continue;
            }
            if (j >= n2 - 2) continue;
            c2 = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            c2 = (char)(c2 | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            c2 = (char)(c2 | (char)(n3 & 0x3F));
            cArray[n++] = c2;
        }
        return new String(cArray, 0, n);
    }
}
