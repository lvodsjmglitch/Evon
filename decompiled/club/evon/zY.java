/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ds
 *  io.netty.buffer.ByteBuf
 *  net.hypixel.modapi.HypixelModAPI
 *  net.hypixel.modapi.error.ErrorReason
 *  net.hypixel.modapi.packet.ClientboundHypixelPacket
 *  net.hypixel.modapi.serializer.PacketSerializer
 *  net.minecraft.class_2540
 *  net.minecraft.class_8710
 *  net.minecraft.class_8710$class_9154
 *  net.minecraft.class_9139
 */
package club.evon;

import club.evon.ds;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.hypixel.modapi.HypixelModAPI;
import net.hypixel.modapi.error.ErrorReason;
import net.hypixel.modapi.packet.ClientboundHypixelPacket;
import net.hypixel.modapi.serializer.PacketSerializer;
import net.minecraft.class_2540;
import net.minecraft.class_8710;
import net.minecraft.class_9139;

public class zY
implements class_8710 {
    private final class_8710.class_9154<zY> X;
    private ClientboundHypixelPacket L;
    private ErrorReason I;
    private static int[] o;
    private static final long a;
    private static final String b;

    private zY(class_8710.class_9154<zY> class_91542, class_2540 class_25402) {
        block4: {
            PacketSerializer packetSerializer;
            block5: {
                long l = a ^ 0x4AA60CEFA86CL;
                this.X = class_91542;
                packetSerializer = new PacketSerializer((ByteBuf)class_25402);
                boolean bl = packetSerializer.readBoolean();
                int[] nArray = zY.t();
                try {
                    try {
                        if (nArray != null) break block4;
                        if (bl) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw zY.a(unsupportedOperationException);
                    }
                    this.I = ErrorReason.getById((int)packetSerializer.readVarInt());
                    return;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw zY.a(unsupportedOperationException);
                }
            }
            this.L = HypixelModAPI.getInstance().getRegistry().createClientboundPacket(class_91542.comp_2242().toString(), packetSerializer);
        }
    }

    public class_8710.class_9154<? extends class_8710> method_56479() {
        return this.X;
    }

    public boolean o() {
        boolean bl;
        long l = a ^ 0x4579623BA7A5L;
        try {
            bl = this.L != null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw zY.a(unsupportedOperationException);
        }
        return bl;
    }

    public ClientboundHypixelPacket N() {
        return this.L;
    }

    public ErrorReason k() {
        return this.I;
    }

    public static class_9139<class_2540, zY> C(class_8710.class_9154<zY> class_91542) {
        return class_8710.method_56484((zY2, class_25402) -> {
            throw new UnsupportedOperationException(b);
        }, class_25402 -> new zY(class_91542, (class_2540)class_25402));
    }

    public static void y(int[] nArray) {
        o = nArray;
    }

    public static int[] t() {
        return o;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = ds.a((long)-2813459727749272163L, (long)2805387817495384559L, MethodHandles.lookup().lookupClass()).a(28739829419961L);
        long l = a ^ 0x4EFCA8F00CBDL;
        zY.y(null);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00fdH\u00dd0Y\u0018r#\u00e1\t\u00ca\u0003\u008f\u00d4\b\u00ad\u0014\u00ee\u0004\u0080\u00ee\u00fe\u00ceE\u008f4A\u000b\u0003.R8\u00d0y\u009e_\u00a1\u00fa\u0002\u00d0".getBytes("ISO-8859-1"));
                b = zY.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
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
