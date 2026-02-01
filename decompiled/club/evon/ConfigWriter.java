/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.j
 */
package club.evon;

import club.evon.MathUtil;
import club.evon.ObfuscationHelper;
import club.evon.j;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.net.ssl.HttpsURLConnection;

public final class ConfigWriter {
    public static final String Property;
    private static final long FontWeight;
    private static final String[] StaticEventBus;

    /*
     * Unable to fully structure code
     */
    public static String RenderEvent(String var0, String var1_1, boolean var2_2) {
        var3_3 = zH.FontWeight ^ 33456945876552L;
        var5_4 = MathUtil.Y();
        try {
            block32: {
                block30: {
                    block31: {
                        block29: {
                            block28: {
                                block27: {
                                    block33: {
                                        block25: {
                                            block24: {
                                                block23: {
                                                    var6_5 = (HttpsURLConnection)new URI(var0).toURL().openConnection();
                                                    var11_7 = zH.StaticEventBus;
                                                    var6_5.addRequestProperty(var11_7[3], var11_7[5]);
                                                    var6_5.setRequestMethod(var11_7[9]);
                                                    var6_5.setDoOutput(true);
                                                    var7_8 = var1_1.getBytes(StandardCharsets.UTF_8);
                                                    try {
                                                        var6_5.setFixedLengthStreamingMode(var7_8.length);
                                                        v0 = var6_5;
                                                        PreMovementEvent = var11_7[2];
                                                        if (!var2_2) break block23;
                                                        PacketSendEvent = var11_7[0];
                                                        break block24;
                                                    }
                                                    catch (Throwable PacketReceiveEvent) {
                                                        throw zH.FontWeight(PacketReceiveEvent);
                                                    }
                                                }
                                                var11_7 = zH.StaticEventBus;
                                                PacketSendEvent = var11_7[10];
                                            }
                                            v0.addRequestProperty(PreMovementEvent, PacketSendEvent);
                                            var11_7 = zH.StaticEventBus;
                                            var6_5.addRequestProperty(var11_7[4], var11_7[6]);
                                            var6_5.connect();
                                            var8_9 = var6_5.getOutputStream();
                                            try {
                                                var8_9.write(var7_8);
                                                v4 = var8_9;
                                                if (var5_4 != null) break block25;
                                            }
                                            catch (Throwable var9_11) {
                                                block26: {
                                                    try {
                                                        v5 = var8_9;
                                                        if (var5_4 == null) {
                                                            if (v5 == null) break block26;
                                                        }
                                                        ** GOTO lbl43
                                                    }
                                                    catch (Throwable v6) {
                                                        throw zH.FontWeight(v6);
                                                    }
                                                    try {
                                                        v5 = var8_9;
lbl43:
                                                        // 2 sources

                                                        v5.close();
                                                    }
                                                    catch (Throwable var10_13) {
                                                        var9_11.addSuppressed(var10_13);
                                                    }
                                                }
                                                throw var9_11;
                                            }
                                            if (v4 == null) break block33;
                                            v4 = var8_9;
                                        }
                                        v4.close();
                                    }
                                    var8_10 = var6_5.getResponseCode();
                                    v7 = var8_10;
                                    v8 = 200;
                                    if (var5_4 != null) break block27;
                                    try {
                                        block34: {
                                            if (v7 == v8) ** GOTO lbl75
                                            break block34;
                                            catch (Throwable v9) {
                                                throw zH.FontWeight(v9);
                                            }
                                        }
                                        v7 = var8_10;
                                        v8 = 300;
                                    }
                                    catch (Throwable v10) {
                                        throw zH.FontWeight(v10);
                                    }
                                }
                                try {
                                    if (v7 != v8) break block28;
lbl75:
                                    // 2 sources

                                    v11 = var6_5.getInputStream();
                                    break block29;
                                }
                                catch (Throwable v12) {
                                    throw zH.FontWeight(v12);
                                }
                            }
                            v11 = var6_5.getErrorStream();
                        }
                        var9_12 = v11;
                        v13 = var9_12;
                        if (var5_4 != null) break block30;
                        try {
                            block35: {
                                if (v13 != null) break block31;
                                break block35;
                                catch (Throwable v14) {
                                    throw zH.FontWeight(v14);
                                }
                            }
                            v15 = null;
                            break block32;
                        }
                        catch (Throwable v16) {
                            throw zH.FontWeight(v16);
                        }
                    }
                    v13 = var9_12;
                }
                v15 = j.v((InputStream)v13);
            }
            return v15;
        }
        catch (Exception var6_6) {
            var6_6.fillInStackTrace();
            return null;
        }
    }

    /*
     * Loose catch block
     */
    public static String x(String string) {
        block7: {
            long l = FontWeight ^ 0x4C71821328B8L;
            int[] nArray = MathUtil.Y();
            try {
                HttpsURLConnection httpsURLConnection;
                block6: {
                    HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection)new URI(string).toURL().openConnection();
                    httpsURLConnection2.addRequestProperty(StaticEventBus[1], StaticEventBus[7]);
                    httpsURLConnection2.setRequestMethod(StaticEventBus[8]);
                    httpsURLConnection = httpsURLConnection2;
                    if (nArray != null) break block6;
                    try {
                        block8: {
                            if (httpsURLConnection.getResponseCode() != 200) break block7;
                            break block8;
                            catch (Exception exception) {
                                throw zH.FontWeight(exception);
                            }
                        }
                        httpsURLConnection = httpsURLConnection2;
                    }
                    catch (Exception exception) {
                        throw zH.FontWeight(exception);
                    }
                }
                return j.v((InputStream)httpsURLConnection.getInputStream());
            }
            catch (Exception exception) {
                exception.fillInStackTrace();
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                zH.FontWeight = ObfuscationHelper.FontWeight((long)-5278129924419099280L, (long)-8498773127296574475L, MethodHandles.lookup().lookupClass()).FontWeight(178849171802112L);
                var0 = zH.FontWeight ^ 137921015280048L;
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
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "v\u001b%\u00bd.7\u001b\u00b8\u00adN\u00c600\u0082N\u0013$\u001b\u00e5\u00c6\u0005\u00ba\u00beV\u0010\u00f0\u00a1\u00fa\u0019&\u0011i\u00cd\u009elg<\Property\u00195\u00bd\u0010\u00ac\u00de\u0087\u00a1\u00a1\u00b6Q\u0086\u00ac\u0006P\u00d6\u00f5\u00c1\u00efZ\u0010\u00f0\u00a1\u00fa\u0019&\u0011i\u00cd\u009elg<\Property\u00195\u00bd\Property\u00b3\u0014\u00a4\u001f\u00ef\u00e7\"3p\u00e8YuQ\u008e$:NJ\u00bbh\u00b3\u00d8i\r\u00f79\u00f4yk\u000f\u0097\u0088&\u00b5\u00d8B\u00f3\u008a\u00cd\u00117\u00f9\\\u00f0\u00f4\u00aen\u00142\u00a9\n|7\u00a7\u0086\u0019a\u0091\u00b7\u007f\Category(\u00be\u001bM\u00eb\u00df\bl\u00934\u00fa9\u00bc'\u00ea=\u00d2|Y\u0015\u00b6\u008b\u00a2\u00a8\n\u00d6M\u00f8f\u00df\u00a8\u00c6\u000e`\u00b5X\u00b4\f\u008a\u00e2\u00ad\u00a6k?\Property\u00daA\u00a6^(}\u0090\u00da\u00c4\u007f\u00c8!]o1\u0018v\u001b%\u00bd.7\u001b\u00b8\u00adN\u00c600\u0082N\u0013$\u001b\u00e5\u00c6\u0005\u00ba\u00beVp\u00e8YuQ\u008e$:NJ\u00bbh\u00b3\u00d8i\r\u00f79\u00f4yk\u000f\u0097\u0088&\u00b5\u00d8B\u00f3\u008a\u00cd\u00117\u00f9\\\u00f0\u00f4\u00aen\u00142\u00a9\n|7\u00a7\u0086\u0019a\u0091\u00b7\u007f\Category(\u00be\u001bM\u00eb\u00df\bl\u00934\u00fa9\u00bc'\u00ea=\u00d2|Y\u0015\u00b6\u008b\u00a2\u00a8\n\u00d6M\u00f8f\u00df\u00a8\u00c6\u000e`\u00b5X\u00b4\f\u008a\u00e2\u00ad\u00a6k?\Property\u00daA\u00a6^(}\u0090\u00da\u00c4\u007f\u00c8!]o1\Property\u001f\u009f\u0097CIf\u00dc+";
                var8_6 = "v\u001b%\u00bd.7\u001b\u00b8\u00adN\u00c600\u0082N\u0013$\u001b\u00e5\u00c6\u0005\u00ba\u00beV\u0010\u00f0\u00a1\u00fa\u0019&\u0011i\u00cd\u009elg<\Property\u00195\u00bd\u0010\u00ac\u00de\u0087\u00a1\u00a1\u00b6Q\u0086\u00ac\u0006P\u00d6\u00f5\u00c1\u00efZ\u0010\u00f0\u00a1\u00fa\u0019&\u0011i\u00cd\u009elg<\Property\u00195\u00bd\Property\u00b3\u0014\u00a4\u001f\u00ef\u00e7\"3p\u00e8YuQ\u008e$:NJ\u00bbh\u00b3\u00d8i\r\u00f79\u00f4yk\u000f\u0097\u0088&\u00b5\u00d8B\u00f3\u008a\u00cd\u00117\u00f9\\\u00f0\u00f4\u00aen\u00142\u00a9\n|7\u00a7\u0086\u0019a\u0091\u00b7\u007f\Category(\u00be\u001bM\u00eb\u00df\bl\u00934\u00fa9\u00bc'\u00ea=\u00d2|Y\u0015\u00b6\u008b\u00a2\u00a8\n\u00d6M\u00f8f\u00df\u00a8\u00c6\u000e`\u00b5X\u00b4\f\u008a\u00e2\u00ad\u00a6k?\Property\u00daA\u00a6^(}\u0090\u00da\u00c4\u007f\u00c8!]o1\u0018v\u001b%\u00bd.7\u001b\u00b8\u00adN\u00c600\u0082N\u0013$\u001b\u00e5\u00c6\u0005\u00ba\u00beVp\u00e8YuQ\u008e$:NJ\u00bbh\u00b3\u00d8i\r\u00f79\u00f4yk\u000f\u0097\u0088&\u00b5\u00d8B\u00f3\u008a\u00cd\u00117\u00f9\\\u00f0\u00f4\u00aen\u00142\u00a9\n|7\u00a7\u0086\u0019a\u0091\u00b7\u007f\Category(\u00be\u001bM\u00eb\u00df\bl\u00934\u00fa9\u00bc'\u00ea=\u00d2|Y\u0015\u00b6\u008b\u00a2\u00a8\n\u00d6M\u00f8f\u00df\u00a8\u00c6\u000e`\u00b5X\u00b4\f\u008a\u00e2\u00ad\u00a6k?\Property\u00daA\u00a6^(}\u0090\u00da\u00c4\u007f\u00c8!]o1\Property\u001f\u009f\u0097CIf\u00dc+".length();
                var5_7 = 24;
                var4_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    PacketReceiveEvent = ++var4_8;
                    v4 = var6_5.substring(PacketReceiveEvent, PacketReceiveEvent + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = zH.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c6\u0084\u008d@\u001bIA\u00b28v\u001b%\u00bd.7\u001b\u00b8\u00de\u00f8\u00c9],\u00c1\u00c1\u00ea\u0095i\u00f3\u001a\u00e7-Pp\u00fd\u0090\u00e9?\u00e8\u001a6N\u00c2q]0\u0018dpz>\u0091\u00cd\u0083\u00aa03I\u0096\u00df\u00b6p\u00d2\u00e9\u00a0:";
                    var8_6 = "\u00c6\u0084\u008d@\u001bIA\u00b28v\u001b%\u00bd.7\u001b\u00b8\u00de\u00f8\u00c9],\u00c1\u00c1\u00ea\u0095i\u00f3\u001a\u00e7-Pp\u00fd\u0090\u00e9?\u00e8\u001a6N\u00c2q]0\u0018dpz>\u0091\u00cd\u0083\u00aa03I\u0096\u00df\u00b6p\u00d2\u00e9\u00a0:".length();
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
                    var9_3[var7_4++] = zH.FontWeight(var10_9).intern();
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
        zH.StaticEventBus = var9_3;
        zH.Property = zH.StaticEventBus[5];
    }

    private static Throwable FontWeight(Throwable throwable) {
        return throwable;
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
