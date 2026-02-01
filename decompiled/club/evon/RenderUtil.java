/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.Property
 *  club.evon.K
 *  club.evon.FontWeight
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.PacketHelper
 *  club.evon.i
 *  club.evon.Category
 *  club.evon.ModuleBase
 *  club.evon.vc
 *  club.evon.ConfigHelper
 *  club.evon.y7
 *  net.minecraft.class_2350$class_2351
 *  net.minecraft.class_746
 *  org.json.JSONException
 */
package club.evon;

import club.evon.Property;
import club.evon.K;
import club.evon.EventListenerAnnotation;
import club.evon.FontWeight;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.PacketHelper;
import club.evon.i;
import club.evon.Category;
import club.evon.ModuleBase;
import club.evon.vc;
import club.evon.ConfigHelper;
import club.evon.y7;
import club.evon.MinecraftHelper;
import club.evon.VelocityUpdateEvent;
import club.evon.BlockHelper;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2350;
import net.minecraft.class_746;
import org.json.JSONException;

public class RenderUtil
extends ModuleBase<PacketHelper> {
    private final FontWeight R;
    private final FontWeight EventDispatcher;
    private final FontWeight M;
    private final FontWeight V;
    private final K K;
    private final K N;
    private final Category k;
    private final i<y7> w;
    private static String Category;
    private static final long Property;
    private static final String[] StaticEventBus;

    public yQ(String string, PacketHelper gY2) {
        super(string, (Module)gY2);
        String[] stringArray = StaticEventBus;
        this.R = new FontWeight(stringArray[0], 0.42, 0.05, 1.0, 0.01);
        this.EventDispatcher = new FontWeight(stringArray[13], 5.0, 1.0, 10.0, 1.0);
        this.M = new FontWeight(stringArray[12], 0.1, 0.01, 1.0, 0.01);
        this.V = new FontWeight(stringArray[1], 1.0, 0.1, 2.0, 0.1);
        this.K = new K(stringArray[6], new Category[]{new Category(stringArray[2], Boolean.valueOf(false)), new Category(stringArray[10], Boolean.valueOf(false))});
        this.N = new K(stringArray[4], new Category[]{new Category(stringArray[9], Boolean.valueOf(false)), new Category(stringArray[7], Boolean.valueOf(false))});
        this.k = new Category(stringArray[8], Boolean.valueOf(false));
        this.w = new i(stringArray[5], (Enum)y7.JUMP);
        this.k.q(() -> ((y7)this.w.J()).equals((Object)y7.GROUND));
        this.R.q(() -> ((Category)this.K.StaticEventBus(stringArray[2])).I());
        this.M.q(() -> ((Category)this.K.StaticEventBus(stringArray[10])).I());
        this.EventDispatcher.q(() -> ((Category)this.K.StaticEventBus(stringArray[10])).I());
        this.j(new Property[]{this.w, this.N, this.V, this.k, this.K, this.R, this.M, this.EventDispatcher});
    }

    public void Y() {
        yQ yQ2;
        block11: {
            block12: {
                class_746 class_7462;
                block13: {
                    long l = Property ^ 0x66C005BC8E14L;
                    String string = yQ.q();
                    try {
                        try {
                            try {
                                try {
                                    yQ2 = this;
                                    if (string != null) break block11;
                                    if (!yQ2.N.StaticEventBus(StaticEventBus[11]).I().booleanValue()) break block12;
                                }
                                catch (JSONException jSONException) {
                                    throw yQ.FontWeight(jSONException);
                                }
                                class_7462 = MinecraftHelper.m.field_1724;
                                if (string != null) break block13;
                            }
                            catch (JSONException jSONException) {
                                throw yQ.FontWeight(jSONException);
                            }
                            if (class_7462 == null) break block12;
                        }
                        catch (JSONException jSONException) {
                            throw yQ.FontWeight(jSONException);
                        }
                        class_7462 = MinecraftHelper.m.field_1724;
                    }
                    catch (JSONException jSONException) {
                        throw yQ.FontWeight(jSONException);
                    }
                }
                class_7462.method_18799(MinecraftHelper.m.field_1724.method_18798().method_18805(0.0, 1.0, 0.0));
            }
            yQ2 = this;
        }
        try {
            super.Y();
            if (Module.q() == null) {
                yQ.p("iTRr9b");
            }
        }
        catch (JSONException jSONException) {
            throw yQ.FontWeight(jSONException);
        }
    }

    @EventListenerAnnotation
    private void F(vc vc2) {
        boolean bl;
        block7: {
            block8: {
                long l = Property ^ 0x463E54ACC552L;
                String string = yQ.q();
                try {
                    try {
                        bl = this.k.I();
                        if (string != null) break block7;
                        if (!bl) break block8;
                    }
                    catch (JSONException jSONException) {
                        throw yQ.FontWeight(jSONException);
                    }
                    vc2.K();
                }
                catch (JSONException jSONException) {
                    throw yQ.FontWeight(jSONException);
                }
            }
            bl = this.K.StaticEventBus(StaticEventBus[2]).I();
        }
        try {
            if (bl) {
                vc2.K();
            }
        }
        catch (JSONException jSONException) {
            throw yQ.FontWeight(jSONException);
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventListenerAnnotation
    private void StaticEventBus(VelocityUpdateEvent var1_1) {
        block53: {
            block49: {
                block52: {
                    block50: {
                        block51: {
                            block43: {
                                block44: {
                                    block54: {
                                        block48: {
                                            block47: {
                                                block45: {
                                                    var2_2 = yQ.Property ^ 15555508979919L;
                                                    var4_3 = yQ.q();
                                                    try {
                                                        block46: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                v0 = MinecraftHelper.m.field_1724.method_24828();
                                                                                if (var4_3 != null) break block43;
                                                                                if (!v0) break block44;
                                                                            }
                                                                            catch (JSONException PreMovementEvent) {
                                                                                throw yQ.FontWeight(PreMovementEvent);
                                                                            }
                                                                            v0 = ((y7)this.w.J()).equals((Object)y7.GROUND);
                                                                            if (var4_3 != null) break block45;
                                                                        }
                                                                        catch (JSONException PacketSendEvent) {
                                                                            throw yQ.FontWeight(PacketSendEvent);
                                                                        }
                                                                        if (v0) break block46;
                                                                    }
                                                                    catch (JSONException PacketReceiveEvent) {
                                                                        throw yQ.FontWeight(PacketReceiveEvent);
                                                                    }
                                                                    v0 = BlockHelper.r();
                                                                    if (var4_3 != null) break block45;
                                                                }
                                                                catch (JSONException v4) {
                                                                    throw yQ.FontWeight(v4);
                                                                }
                                                                if (!v0) {
                                                                }
                                                                ** GOTO lbl60
                                                            }
                                                            catch (JSONException v5) {
                                                                throw yQ.FontWeight(v5);
                                                            }
                                                        }
                                                        v0 = this.k.I();
                                                    }
                                                    catch (JSONException v6) {
                                                        throw yQ.FontWeight(v6);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (var4_3 != null) break block43;
                                                                        if (v0) break block44;
                                                                    }
                                                                    catch (JSONException v7) {
                                                                        throw yQ.FontWeight(v7);
                                                                    }
                                                                    v0 = MinecraftHelper.m.field_1690.field_1903.method_1434();
                                                                    if (var4_3 != null) break block43;
                                                                }
                                                                catch (JSONException v8) {
                                                                    throw yQ.FontWeight(v8);
                                                                }
                                                                if (!v0) break block44;
                                                            }
                                                            catch (JSONException v9) {
                                                                throw yQ.FontWeight(v9);
                                                            }
lbl60:
                                                            // 2 sources

                                                            v10 = MinecraftHelper.m.field_1724;
                                                            v11 = MinecraftHelper.m.field_1724.method_18798();
                                                            v12 = class_2350.class_2351.field_11052;
                                                            v13 = this.K.StaticEventBus(yQ.StaticEventBus[2]).I();
                                                            if (var4_3 != null) break block47;
                                                        }
                                                        catch (JSONException v14) {
                                                            throw yQ.FontWeight(v14);
                                                        }
                                                        if (!v13.booleanValue()) break block48;
                                                    }
                                                    catch (JSONException v15) {
                                                        throw yQ.FontWeight(v15);
                                                    }
                                                    v13 = this.R.J();
                                                }
                                                catch (JSONException v16) {
                                                    throw yQ.FontWeight(v16);
                                                }
                                            }
                                            v17 = (Double)v13;
                                            break block54;
                                        }
                                        v17 = 0.42;
                                    }
                                    v10.method_18799(v11.method_38499(v12, v17));
                                }
                                v0 = BlockHelper.r();
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var4_3 != null) break block49;
                                                    if (v0) {
                                                    }
                                                    ** GOTO lbl128
                                                }
                                                catch (JSONException v18) {
                                                    throw yQ.FontWeight(v18);
                                                }
                                                v19 = this.K.StaticEventBus(yQ.StaticEventBus[10]).I();
                                                if (var4_3 != null) break block50;
                                            }
                                            catch (JSONException v20) {
                                                throw yQ.FontWeight(v20);
                                            }
                                            if (!v19.booleanValue()) break block51;
                                        }
                                        catch (JSONException v21) {
                                            throw yQ.FontWeight(v21);
                                        }
                                        v22 = ConfigHelper.r().Y;
                                        if (var4_3 != null) break block52;
                                    }
                                    catch (JSONException v23) {
                                        throw yQ.FontWeight(v23);
                                    }
                                    if (v22 != (Double)this.EventDispatcher.J()) break block51;
                                }
                                catch (JSONException v24) {
                                    throw yQ.FontWeight(v24);
                                }
                                MinecraftHelper.m.field_1724.method_18799(MinecraftHelper.m.field_1724.method_18798().method_1023(0.0, ((Double)this.M.J()).doubleValue(), 0.0));
                            }
                            catch (JSONException v25) {
                                throw yQ.FontWeight(v25);
                            }
                        }
                        v19 = this.V.J();
                    }
                    v22 = (Double)v19;
                }
                try {
                    BlockHelper.y(v22);
                    if (var4_3 == null) break block53;
lbl128:
                    // 2 sources

                    v0 = this.N.StaticEventBus(yQ.StaticEventBus[3]).I();
                }
                catch (JSONException v26) {
                    throw yQ.FontWeight(v26);
                }
            }
            try {
                if (v0) {
                    MinecraftHelper.m.field_1724.method_18799(MinecraftHelper.m.field_1724.method_18798().method_18805(0.0, 1.0, 0.0));
                }
            }
            catch (JSONException v27) {
                throw yQ.FontWeight(v27);
            }
        }
    }

    public static void p(String string) {
        Category = string;
    }

    public static String q() {
        return Category;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                yQ.Property = ObfuscationHelper.FontWeight((long)8936311814699350348L, (long)-6702605063317353278L, MethodHandles.lookup().lookupClass()).FontWeight(247519395502672L);
                var0 = yQ.Property ^ 117525232477353L;
                yQ.p(null);
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
                var9_3 = new String[14];
                var7_4 = 0;
                var6_5 = "\u00dd\Category\u0015\u00e3\u00a4\u00f9\u00c8Qt\u00b3\u0084\u00d3\u001e{\u00cb'\bB7@\Property\u0094\u0017S\u00ea\u0010\u00dd\Category\u0015\u00e3\u00a4\u00f9\u00c8Qt\u00b3\u0084\u00d3\u001e{\u00cb'\u0010w\u00dd\r1\u00fa\u00e7?\u00ea/\u00bc%\u00e7>kz\u00ae\u0018\u00bc\\\u00ebe\u00b128\u00a5n\u009e\u00e1\u009c\u00a7\u00d3\u009a\u00af.I\u008a{S\u00fa\u00e7\u00e6\u00109\u008c\r/_\u00b3\u00a7IuH\u0010\u00fd~~Category\u0019\u0010\u009f\u0004\u00e6\u00ee/\u00a1\u00d7*\\\u0019\u0004t4\u0081\u0090b\u0010w\u00dd\r1\u00fa\u00e7?\u00ea/\u00bc%\u00e7>kz\u00ae\bi\u001fS\u001f\u00a7 \u0012\u00a7\u0010\u00b5k\u0006\u00d0\u008e\u00b1\u00dcu\u0095\u00c7UL\u0080*RenderEvent\u008e\u0010\u0097\u0099\u009eK\u0017\u00d4\u00f5\u0093\u000e1\u00dejx^\u00a3\u00ae\u0010\u00b5k\u0006\u00d0\u008e\u00b1\u00dcu\u0095\u00c7UL\u0080*RenderEvent\u008e";
                var8_6 = "\u00dd\Category\u0015\u00e3\u00a4\u00f9\u00c8Qt\u00b3\u0084\u00d3\u001e{\u00cb'\bB7@\Property\u0094\u0017S\u00ea\u0010\u00dd\Category\u0015\u00e3\u00a4\u00f9\u00c8Qt\u00b3\u0084\u00d3\u001e{\u00cb'\u0010w\u00dd\r1\u00fa\u00e7?\u00ea/\u00bc%\u00e7>kz\u00ae\u0018\u00bc\\\u00ebe\u00b128\u00a5n\u009e\u00e1\u009c\u00a7\u00d3\u009a\u00af.I\u008a{S\u00fa\u00e7\u00e6\u00109\u008c\r/_\u00b3\u00a7IuH\u0010\u00fd~~Category\u0019\u0010\u009f\u0004\u00e6\u00ee/\u00a1\u00d7*\\\u0019\u0004t4\u0081\u0090b\u0010w\u00dd\r1\u00fa\u00e7?\u00ea/\u00bc%\u00e7>kz\u00ae\bi\u001fS\u001f\u00a7 \u0012\u00a7\u0010\u00b5k\u0006\u00d0\u008e\u00b1\u00dcu\u0095\u00c7UL\u0080*RenderEvent\u008e\u0010\u0097\u0099\u009eK\u0017\u00d4\u00f5\u0093\u000e1\u00dejx^\u00a3\u00ae\u0010\u00b5k\u0006\u00d0\u008e\u00b1\u00dcu\u0095\u00c7UL\u0080*RenderEvent\u008e".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = yQ.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0097\u0099\u009eK\u0017\u00d4\u00f5\u0093\u000e1\u00dejx^\u00a3\u00ae\u0010\u0017\u00f3#*\u00d5\u00e0B9p\u009f\u00daO5\u00e5\u00de7";
                    var8_6 = "\u0097\u0099\u009eK\u0017\u00d4\u00f5\u0093\u000e1\u00dejx^\u00a3\u00ae\u0010\u0017\u00f3#*\u00d5\u00e0B9p\u009f\u00daO5\u00e5\u00de7".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = yQ.FontWeight(var10_9).intern();
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
        yQ.StaticEventBus = var9_3;
    }

    private static JSONException FontWeight(JSONException jSONException) {
        return jSONException;
    }

    private static String FontWeight(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int j = 0; j < n2; ++j) {
            char StaticEventBus;
            int n3 = 0xFF & byArray[j];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                StaticEventBus = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++j];
                StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F));
                cArray[n++] = StaticEventBus;
                continue;
            }
            if (j >= n2 - 2) continue;
            StaticEventBus = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++j];
            StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++j];
            StaticEventBus = (char)(StaticEventBus | (char)(n3 & 0x3F));
            cArray[n++] = StaticEventBus;
        }
        return new String(cArray, 0, n);
    }
}
