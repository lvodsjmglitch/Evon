/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.Jz
 *  club.evon.ds
 *  club.evon.gQ
 *  club.evon.mixins.MinecraftClientAccessor
 *  club.evon.y8
 *  club.evon.yH
 *  club.evon.yg
 *  fr.litarvan.openauth.microsoft.MicrosoftAuthResult
 *  net.minecraft.class_320
 */
package club.evon;

import club.evon.Jz;
import club.evon.ds;
import club.evon.gQ;
import club.evon.mixins.MinecraftClientAccessor;
import club.evon.y8;
import club.evon.yH;
import club.evon.yg;
import club.evon.ym;
import club.evon.z7;
import club.evon.zD;
import club.evon.zi;
import club.evon.zy;
import fr.litarvan.openauth.microsoft.MicrosoftAuthResult;
import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Optional;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_320;

public final class z2
extends zi {
    private final yH d;
    private final String K;
    private static final z7 B;
    private static final long c;
    private static final String[] e;

    public z2(yH yH2, float f, float f2, float f3) {
        super(f, f2, f3);
        this.d = yH2;
        this.K = yH2.M + e[1];
    }

    /*
     * Unable to fully structure code
     */
    public void M(float var1_1, float var2_2, double var3_3, double var5_4) {
        block15: {
            block16: {
                block14: {
                    var7_5 = z2.c ^ 122498384106248L;
                    var9_6 = yH.v();
                    try {
                        v0 = this.d;
                        v1 = yH.COOKIE;
                        if (var9_6 != null) break block14;
                        if (v0 == v1) {
                        }
                        ** GOTO lbl15
                    }
                    catch (RuntimeException v2) {
                        throw z2.a(v2);
                    }
                    var10_7 = new Color(250, 119, 5);
                    try {
                        if (var9_6 == null) break block15;
lbl15:
                        // 2 sources

                        v0 = this.d;
                        v1 = yH.MICROSOFT;
                    }
                    catch (RuntimeException v3) {
                        throw z2.a(v3);
                    }
                }
                if (v0 != v1) break block16;
                var10_7 = new Color(173, 249, 138);
                if (var9_6 == null) break block15;
            }
            var10_7 = new Color(71, 116, 231);
        }
        super.o(var1_1, var2_2, var3_3, var5_4, var10_7);
        var11_8 = this.c();
        var12_9 = this.I();
        z2.B.U(this.K, var1_1 + (var11_8 - z2.B.y(this.K, 11.0f)) / 2.0f, var2_2 + (var12_9 - z2.B.i(this.K, 11.0f)) / 2.0f, 11.0f, Color.WHITE.getRGB());
        var13_10 = 17.5f;
        var14_11 = (var12_9 - 17.5f) / 2.0f;
        try {
            y8.G((float)(var1_1 + var11_8 - (17.5f + var14_11)), (float)(var2_2 + var14_11), (float)17.5f, (float)17.5f, null, (Jz)this.d.C);
            if (gQ.q() == null) {
                yH.l((String)"eL2elc");
            }
        }
        catch (RuntimeException v4) {
            throw z2.a(v4);
        }
    }

    /*
     * Unable to fully structure code
     */
    public void y() {
        block11: {
            var1_1 = z2.c ^ 100898437176963L;
            var3_2 = yH.v();
            try {
                if (var3_2 != null) break block11;
            }
            catch (Exception v0) {
                throw z2.a(v0);
            }
            {
                ** switch (this.d.ordinal())
            }
lbl-1000:
            // 1 sources

            {
                case 0: {
                    try {
                        zD.V((Consumer<MicrosoftAuthResult>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$mouseClicked$0(fr.litarvan.openauth.microsoft.MicrosoftAuthResult ), (Lfr/litarvan/openauth/microsoft/MicrosoftAuthResult;)V)());
                        break;
                    }
                    catch (Exception var4_3) {
                        throw new RuntimeException(var4_3);
                    }
                }
lbl16:
                // 1 sources

                case 1: {
                    try {
                        var4_4 = (MinecraftClientAccessor)ym.m;
                        var5_6 = zD.g();
                        if (var5_6 == null) break;
                        var6_7 = new class_320(var5_6.k(), zD.c(var5_6.K()), var5_6.c(), Optional.empty(), Optional.empty());
                        var4_4.setSession(var6_7);
                        zy.p().k().n(var6_7, yg.TOKEN);
                        break;
                    }
                    catch (Exception var4_5) {
                        throw new RuntimeException(var4_5);
                    }
                }
lbl27:
                // 1 sources

                case 2: {
                    zD.R();
                }
            }
        }
    }

    private static /* synthetic */ void lambda$mouseClicked$0(MicrosoftAuthResult microsoftAuthResult) {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = ds.a((long)-4774314177763851829L, (long)-4456769795295851523L, MethodHandles.lookup().lookupClass()).a(169018434702714L);
        long l = c ^ 0x466721DDB08EL;
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
        String string = "\u00c1\u00b8\u0095\u00ce-\t\u00fb\u0098\u00b0\u0096\u00ccHK\u0014O\u007f\b\u00be\u0082;\u0018\u00c5\u00c4\u00fb\u00b4";
        int n2 = "\u00c1\u00b8\u0095\u00ce-\t\u00fb\u0098\u00b0\u0096\u00ccHK\u0014O\u007f\b\u00be\u0082;\u0018\u00c5\u00c4\u00fb\u00b4".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = z2.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                B = zy.p().s().a(e[0]);
                return;
            }
            n3 = string.charAt(n4);
        }
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
}
