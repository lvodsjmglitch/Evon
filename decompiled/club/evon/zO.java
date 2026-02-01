/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.gQ
 *  club.evon.launch.Loader
 *  club.evon.launch.hidden.Hidden0
 *  club.evon.y
 *  net.minecraft.class_2561
 *  net.minecraft.class_5250
 *  org.java_websocket.client.WebSocketClient
 *  org.java_websocket.handshake.ServerHandshake
 */
package club.evon;

import club.evon._o;
import club.evon.gQ;
import club.evon.launch.Loader;
import club.evon.launch.hidden.Hidden0;
import club.evon.y;
import club.evon.ym;
import club.evon.zy;
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

public final class zO
extends WebSocketClient {
    private final String j;
    private final String q;
    private boolean V;
    private static gQ[] n;
    private static final long a;
    private static final String[] b;
    private static final long c;

    public zO(URI uRI, String string, String string2) {
        long l = a ^ 0x67FFE2FC00ECL;
        super(uRI);
        this.j = string;
        gQ[] gQArray = zO.G();
        try {
            this.q = string2;
            this.U();
            this.connect();
            this.setConnectionLostTimeout(60);
            if (gQArray == null) {
                gQ.o((gQ[])new gQ[5]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw zO.a(runtimeException);
        }
    }

    private void U() {
        SSLContext sSLContext;
        try {
            String[] stringArray = b;
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
                var4_4 = zO.a ^ 73789416088384L;
                var6_5 = zO.G();
                try {
                    try {
                        v0 = this.V;
                        if (var6_5 == null) break block11;
                        if (v0 == 0) {
                        }
                        ** GOTO lbl21
                    }
                    catch (RuntimeException v1) {
                        throw zO.a(v1);
                    }
                    _o.a((String)zO.b[22], (String)zO.b[4], (int)0);
                    v0 = 0;
                }
                catch (RuntimeException v2) {
                    throw zO.a(v2);
                }
            }
            try {
                System.exit(v0);
                if (var6_5 != null) break block12;
lbl21:
                // 2 sources

                zy.O().execute((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onClose$1(), ()V)((zO)this));
            }
            catch (RuntimeException v3) {
                throw zO.a(v3);
            }
        }
        try {
            if (gQ.q() == null) {
                zO.o(new gQ[3]);
            }
        }
        catch (RuntimeException v4) {
            throw zO.a(v4);
        }
    }

    public void onError(Exception exception) {
    }

    private /* synthetic */ void lambda$onClose$1() {
        long l = a ^ 0x162348844DACL;
        try {
            TimeUnit.SECONDS.sleep(c);
        }
        catch (InterruptedException interruptedException) {
            String[] stringArray = b;
            _o.a((String)stringArray[14], (String)stringArray[6], (int)0);
            throw new RuntimeException(interruptedException);
        }
        zy.g().u(new zO(this.getURI(), this.j, this.q));
    }

    private static /* synthetic */ void lambda$onMessage$0(class_5250 class_52502) {
        ym.m.field_1705.method_1743().method_1812((class_2561)class_52502);
    }

    public static void o(gQ[] gQArray) {
        n = gQArray;
    }

    public static gQ[] G() {
        return n;
    }

    static {
        Loader.attachNatives((int)3, zO.class);
        Hidden0.special_clinit_3_100(zO.class);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
