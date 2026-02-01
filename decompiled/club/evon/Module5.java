/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.StaticEventBus
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.y2
 *  net.minecraft.class_639
 *  org.json.JSONException
 */
package club.evon;

import club.evon.StaticEventBus;
import club.evon.EntityCommand;
import club.evon.HypixelCommand;
import club.evon.AnimationValue;
import club.evon.Command10;
import club.evon.CommandBase;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.y2;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_639;
import org.json.JSONException;

public final class Module5 {
    private CommandBase I;
    private static final y2[] m;
    private static Module[] F;
    private static final long FontWeight;
    private static final String[] Property;

    public void x(class_639 class_6392) {
        block7: {
            long l = FontWeight ^ 0x34D458530610L;
            y2[] y2Array = m;
            int n = y2Array.length;
            int[] nArray = CommandBase.EventDispatcher();
            int n2 = 0;
            while (n2 < n) {
                block8: {
                    block9: {
                        y2 y22 = y2Array[n2];
                        CommandBase _r2 = y22.EventDispatcher(class_6392);
                        try {
                            try {
                                try {
                                    if (nArray == null) break block7;
                                    if (nArray == null) break block8;
                                }
                                catch (JSONException jSONException) {
                                    throw yW.FontWeight(jSONException);
                                }
                                if (_r2 == null) break block9;
                            }
                            catch (JSONException jSONException) {
                                throw yW.FontWeight(jSONException);
                            }
                            this.I = _r2;
                            StaticEventBus.P((Object)this.I);
                            return;
                        }
                        catch (JSONException jSONException) {
                            throw yW.FontWeight(jSONException);
                        }
                    }
                    ++n2;
                }
                if (nArray != null) continue;
                Module.o((Module[])new Module[5]);
                break;
            }
            this.I = null;
        }
    }

    public void v() {
        block5: {
            CommandBase _r2;
            block4: {
                long l = FontWeight ^ 0x3CB0303F5812L;
                int[] nArray = CommandBase.EventDispatcher();
                try {
                    try {
                        _r2 = this.I;
                        if (nArray == null) break block4;
                        if (_r2 == null) break block5;
                    }
                    catch (JSONException jSONException) {
                        throw yW.FontWeight(jSONException);
                    }
                    _r2 = this.I;
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
            }
            _r2.s();
            this.I = null;
        }
    }

    public void Q(CommandBase _r2) {
        block8: {
            CommandBase _r3;
            block7: {
                long l = FontWeight ^ 0x7F522C80C940L;
                int[] nArray = CommandBase.EventDispatcher();
                this.v();
                int[] nArray2 = nArray;
                try {
                    try {
                        _r3 = this.I;
                        if (nArray2 == null) break block7;
                        if (_r3 == _r2) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw yW.FontWeight(jSONException);
                    }
                    _r3 = this.I = _r2;
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
            }
            StaticEventBus.P((Object)_r3);
        }
        try {
            if (Module.q() == null) {
                CommandBase.o((int[])new int[3]);
            }
        }
        catch (JSONException jSONException) {
            throw yW.FontWeight(jSONException);
        }
    }

    private static boolean Property(class_639 class_6392, String string, boolean bl) {
        long l = FontWeight ^ 0x6DDFEEEFD18FL;
        String string2 = class_6392.method_2952().toLowerCase();
        String[] stringArray = Property;
        String string3 = Pattern.quote(string) + stringArray[3];
        if (bl) {
            string3 = stringArray[7] + string3;
        }
        Pattern pattern = Pattern.compile(string3);
        Matcher matcher = pattern.matcher(string2);
        return matcher.matches();
    }

    public CommandBase f() {
        return this.I;
    }

    private static /* synthetic */ CommandBase lambda$static$3(class_639 class_6392) {
        block8: {
            int n;
            block7: {
                long l = FontWeight ^ 0x6F2A4C28C6C8L;
                int[] nArray = CommandBase.EventDispatcher();
                try {
                    try {
                        n = class_6392.method_2954();
                        if (nArray == null) break block7;
                        if (n != 25565) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw yW.FontWeight(jSONException);
                    }
                    n = yW.Property(class_6392, Property[2], true) ? 1 : 0;
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
            }
            try {
                if (n != 0) {
                    return new AnimationValue();
                }
            }
            catch (JSONException jSONException) {
                throw yW.FontWeight(jSONException);
            }
        }
        return null;
    }

    private static /* synthetic */ CommandBase lambda$static$2(class_639 class_6392) {
        block8: {
            int n;
            block7: {
                long l = FontWeight ^ 0x6BF71CF5EA70L;
                int[] nArray = CommandBase.EventDispatcher();
                try {
                    try {
                        n = class_6392.method_2954();
                        if (nArray == null) break block7;
                        if (n != 25565) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw yW.FontWeight(jSONException);
                    }
                    n = yW.Property(class_6392, Property[4], true) ? 1 : 0;
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
            }
            try {
                if (n != 0) {
                    return new Command10();
                }
            }
            catch (JSONException jSONException) {
                throw yW.FontWeight(jSONException);
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ CommandBase lambda$static$1(class_639 class_6392) {
        int n;
        block11: {
            int[] nArray;
            block10: {
                long l = FontWeight ^ 0x5BCEBEBC603EL;
                nArray = CommandBase.EventDispatcher();
                try {
                    try {
                        n = class_6392.method_2954();
                        if (nArray == null) break block10;
                        if (n != 25565) return null;
                    }
                    catch (JSONException jSONException) {
                        throw yW.FontWeight(jSONException);
                    }
                    n = yW.Property(class_6392, Property[8], false) ? 1 : 0;
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
            }
            try {
                try {
                    if (nArray == null) break block11;
                    if (n != 0) return new EntityCommand();
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
                n = yW.Property(class_6392, Property[5], false) ? 1 : 0;
            }
            catch (JSONException jSONException) {
                throw yW.FontWeight(jSONException);
            }
        }
        try {
            if (n == 0) return null;
            return new EntityCommand();
        }
        catch (JSONException jSONException) {
            throw yW.FontWeight(jSONException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ CommandBase lambda$static$0(class_639 class_6392) {
        int n;
        block16: {
            int[] nArray;
            block15: {
                block14: {
                    long l = FontWeight ^ 0x5123C1AABC15L;
                    nArray = CommandBase.EventDispatcher();
                    try {
                        try {
                            n = class_6392.method_2954();
                            if (nArray == null) break block14;
                            if (n != 25565) return null;
                        }
                        catch (JSONException jSONException) {
                            throw yW.FontWeight(jSONException);
                        }
                        n = yW.Property(class_6392, Property[6], true) ? 1 : 0;
                    }
                    catch (JSONException jSONException) {
                        throw yW.FontWeight(jSONException);
                    }
                }
                try {
                    try {
                        if (nArray == null) break block15;
                        if (n != 0) return new HypixelCommand();
                    }
                    catch (JSONException jSONException) {
                        throw yW.FontWeight(jSONException);
                    }
                    n = yW.Property(class_6392, Property[1], true) ? 1 : 0;
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
            }
            try {
                try {
                    if (nArray == null) break block16;
                    if (n != 0) return new HypixelCommand();
                }
                catch (JSONException jSONException) {
                    throw yW.FontWeight(jSONException);
                }
                n = yW.Property(class_6392, Property[0], true) ? 1 : 0;
            }
            catch (JSONException jSONException) {
                throw yW.FontWeight(jSONException);
            }
        }
        try {
            if (n == 0) return null;
            return new HypixelCommand();
        }
        catch (JSONException jSONException) {
            throw yW.FontWeight(jSONException);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                yW.FontWeight = ObfuscationHelper.FontWeight((long)-9192219716914497938L, (long)615683873101991365L, MethodHandles.lookup().lookupClass()).FontWeight(57243850253250L);
                var0 = yW.FontWeight ^ 71882066136365L;
                yW.q(null);
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                PreMovementEvent = new byte[8];
                PacketSendEvent = PreMovementEvent;
                PreMovementEvent[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    PacketSendEvent = PacketSendEvent;
                    PacketSendEvent[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(PacketSendEvent)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "\u00bc\u00fc#\u00d3\u00f7g?\u00b1\u001c\u00f7\u00bf\u00be\u00f5\u00e2\u0007i\u001e\u00bf\"\u008a\u00a5\u0081)Y\u0010/\u00b2\u009f\u0082v\u00d5\u0010c\u00cab\u00fe\u00a0\u0099&\Category\u00dd\u00106D\u00dcb\u00cc\u00d7\u00eb<\u000eZ\u00fd\u0012\u00d5j\u009b\u00b6\Property\u00e7\u00baO\u00c7r\u00df\u00ca-\u0010\u00faS\u008f\u00f8\u0088\u0091\u00bc\u00ae\u009f\u00105)\u00a3X\u00ea\u00a8\u0018g\u0018\u008bs\u00aa\u00f9\u0017\u0002\u00e3\u0001\u00e6\u00d2ef\u00cc/\u0000\u00e2=\u0088g\u00f8\u008c\u00fb\u0010/\u00b2\u009f\u0082v\u00d5\u0010ch]/N?\u00a7\u001b\u00b8";
                var8_6 = "\u00bc\u00fc#\u00d3\u00f7g?\u00b1\u001c\u00f7\u00bf\u00be\u00f5\u00e2\u0007i\u001e\u00bf\"\u008a\u00a5\u0081)Y\u0010/\u00b2\u009f\u0082v\u00d5\u0010c\u00cab\u00fe\u00a0\u0099&\Category\u00dd\u00106D\u00dcb\u00cc\u00d7\u00eb<\u000eZ\u00fd\u0012\u00d5j\u009b\u00b6\Property\u00e7\u00baO\u00c7r\u00df\u00ca-\u0010\u00faS\u008f\u00f8\u0088\u0091\u00bc\u00ae\u009f\u00105)\u00a3X\u00ea\u00a8\u0018g\u0018\u008bs\u00aa\u00f9\u0017\u0002\u00e3\u0001\u00e6\u00d2ef\u00cc/\u0000\u00e2=\u0088g\u00f8\u008c\u00fb\u0010/\u00b2\u009f\u0082v\u00d5\u0010ch]/N?\u00a7\u001b\u00b8".length();
                var5_7 = 24;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    PacketReceiveEvent = ++var4_8;
                    v4 = var6_5.substring(PacketReceiveEvent, PacketReceiveEvent + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = yW.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00ebbc\u0098\u0094\u0091p\u00ea\u00fb\u008b\u00dd\u0014CGF\u00ae\u009f\u00b5{\u0017\u00cb\u00c1\u00f1\u00e4\u0010`\u000b\u0013\u000b\f\fo2*\u001e\u00cdH\u009d\u00e7\u00a2T";
                    var8_6 = "\u00ebbc\u0098\u0094\u0091p\u00ea\u00fb\u008b\u00dd\u0014CGF\u00ae\u009f\u00b5{\u0017\u00cb\u00c1\u00f1\u00e4\u0010`\u000b\u0013\u000b\f\fo2*\u001e\u00cdH\u009d\u00e7\u00a2T".length();
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
                    var9_3[var7_4++] = yW.FontWeight(var10_9).intern();
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
        yW.Property = var9_3;
        yW.m = new y2[]{(y2)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;, lambda$static$0(net.minecraft.class_639 ), (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;)(), (y2)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;, lambda$static$1(net.minecraft.class_639 ), (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;)(), (y2)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;, lambda$static$2(net.minecraft.class_639 ), (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;)(), (y2)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;, lambda$static$3(net.minecraft.class_639 ), (Lnet/minecraft/class_639;)Lclub/evon/CommandBase;)()};
    }

    public static void q(Module[] gQArray) {
        F = gQArray;
    }

    public static Module[] n() {
        return F;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
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
}
