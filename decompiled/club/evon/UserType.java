/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  net.minecraft.class_5251
 *  org.json.JSONException
 */
package club.evon;

import club.evon.ObfuscationHelper;
import club.evon.Module;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_5251;
import org.json.JSONException;

public final class UserType
extends Enum<_H> {
    public static final /* enum */ _H USER;
    public static final /* enum */ _H MEDIA;
    public static final /* enum */ _H DEVELOPER;
    private final int y;
    private final Color f;
    private final class_5251 EventDispatcher;
    private static final /* synthetic */ _H[] J;
    private static String CooldownTimer;
    private static final long FontWeight;

    public static _H[] values() {
        return (_H[])J.clone();
    }

    public static _H valueOf(String string) {
        return Enum.valueOf(_H.class, string);
    }

    private _H(int n2, Color color) {
        this.y = n2;
        this.f = color;
        this.EventDispatcher = class_5251.method_27717((int)color.getRGB());
    }

    public static _H RenderEvent(int n) {
        return DEVELOPER;
    }

    public static class_5251 r(int n) {
        return _H.RenderEvent((int)n).EventDispatcher;
    }

    public int v() {
        return this.y;
    }

    public Color r() {
        return this.f;
    }

    public class_5251 FontWeight() {
        return this.EventDispatcher;
    }

    private static /* synthetic */ _H[] d() {
        return new _H[]{USER, MEDIA, DEVELOPER};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        FontWeight = ObfuscationHelper.FontWeight((long)-2823639915918582774L, (long)6515324796898441485L, MethodHandles.lookup().lookupClass()).FontWeight(86013608429096L);
        long l = FontWeight ^ 0x62F1550D47AFL;
        _H.m("IqBQ3b");
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "!\u00eb\u00b6[\u0019\u0088\u0099A\u0012'\u00f7\u00f5i\u0094\u0010\u00d7\bw\u009cN\u00a7[EventDispatcher\u00a0\u00e4\Property\u00c2)FontWeight\u0098R\u00fcV2";
        int n2 = "!\u00eb\u00b6[\u0019\u0088\u0099A\u0012'\u00f7\u00f5i\u0094\u0010\u00d7\bw\u009cN\u00a7[EventDispatcher\u00a0\u00e4\Property\u00c2)FontWeight\u0098R\u00fcV2".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = _H.FontWeight(byArray3).intern();
            if ((n4 += n3) >= n2) {
                USER = new _H(0, new Color(196, 237, 255));
                MEDIA = new _H(1, new Color(220, 29, 86));
                DEVELOPER = new _H(2, new Color(85, 140, 225));
                J = _H.d();
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static void m(String string) {
        CooldownTimer = string;
    }

    public static String d() {
        return CooldownTimer;
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
