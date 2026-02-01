/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.Module
 *  club.evon.launch.Loader
 *  club.evon.launch.hidden.Hidden0
 *  club.evon.y
 *  net.minecraft.class_2561
 *  net.minecraft.class_5250
 *  org.java_websocket.client.WebSocketClient
 *  org.java_websocket.handshake.ServerHandshake
 */
package club.evon;

import club.evon.Command8;
import club.evon.Module;
import club.evon.launch.Loader;
import club.evon.launch.hidden.Hidden0;
import club.evon.y;
import club.evon.KillEffect;
import club.evon.HypixelPacketHandler;
import java.io.ByteArrayInputStream;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

public final class WebSocketHelper
extends WebSocketClient {
    private final String j;
    private final String q;
    private boolean V;
    private static Module[] n;
    private static final long FontWeight;
    private static final String[] Property;
    private static final long StaticEventBus;

    public zO(URI uRI, String string, String string2) {
        long l = FontWeight ^ 0x67FFE2FC00ECL;
        super(uRI);
        this.j = string;
        Module[] gQArray = zO.G();
        try {
            this.q = string2;
            this.U();
            this.connect();
            this.setConnectionLostTimeout(60);
            if (gQArray == null) {
                Module.o((Module[])new Module[5]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw zO.FontWeight(runtimeException);
        }
    }

    private void U() {
        SSLContext sSLContext;
        try {
            String[] stringArray = Property;
            sSLContext = SSLContext.getInstance(stringArray[17]);
            CertificateFactory certificateFactory = CertificateFactory.getInstance(stringArray[5]);
            byte[] byArray = Base64.getDecoder().decode(stringArray[1]);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            X509Certificate x509Certificate = (X509Certificate)certificateFactory.generateCertificate(byteArrayInputStream);
            TrustManager[] trustManagerArray = new TrustManager[]{new y(this, x509Certificate)};
            sSLContext.init(null, trustManagerArray, new SecureRandom());
        }
        catch (Throwable throwable) {
            System.exit(0);
            return;
        }
        this.setSocketFactory(sSLContext.getSocketFactory());
    }

    public native void onOpen(ServerHandshake var1);

    public native void onMessage(String var1);

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onClose(int var1_1, String var2_2, boolean var3_3) {
        block12: {
            block11: {
                var4_4 = zO.FontWeight ^ 73789416088384L;
                var6_5 = zO.G();
                try {
                    try {
                        v0 = this.V;
                        if (var6_5 == null) break block11;
                        if (v0 == 0) {
                        }
                        ** GOTO lbl21
                    }
                    catch (RuntimeException PreMovementEvent) {
                        throw zO.FontWeight(PreMovementEvent);
                    }
                    Command8.FontWeight((String)zO.Property[22], (String)zO.Property[4], (int)0);
                    v0 = 0;
                }
                catch (RuntimeException PacketSendEvent) {
                    throw zO.FontWeight(PacketSendEvent);
                }
            }
            try {
                System.exit(v0);
                if (var6_5 != null) break block12;
lbl21:
                // 2 sources

                HypixelPacketHandler.O().execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onClose$1(), ()V)((zO)this));
            }
            catch (RuntimeException PacketReceiveEvent) {
                throw zO.FontWeight(PacketReceiveEvent);
            }
        }
        try {
            if (Module.q() == null) {
                zO.o(new Module[3]);
            }
        }
        catch (RuntimeException v4) {
            throw zO.FontWeight(v4);
        }
    }

    public void onError(Exception exception) {
    }

    private /* synthetic */ void lambda$onClose$1() {
        long l = FontWeight ^ 0x162348844DACL;
        try {
            TimeUnit.SECONDS.sleep(StaticEventBus);
        }
        catch (InterruptedException interruptedException) {
            String[] stringArray = Property;
            Command8.FontWeight((String)stringArray[14], (String)stringArray[6], (int)0);
            throw new RuntimeException(interruptedException);
        }
        HypixelPacketHandler.g().u(new zO(this.getURI(), this.j, this.q));
    }

    private static /* synthetic */ void lambda$onMessage$0(class_5250 class_52502) {
        KillEffect.m.field_1705.method_1743().method_1812((class_2561)class_52502);
    }

    public static void o(Module[] gQArray) {
        n = gQArray;
    }

    public static Module[] G() {
        return n;
    }

    static {
        Loader.attachNatives((int)3, zO.class);
        Hidden0.special_clinit_3_100(zO.class);
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
