/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  club.evon.ObfuscationHelper
 *  club.evon.Module
 *  club.evon.gR
 *  org.json.JSONException
 */
package club.evon;

import club.evon.CommandBase;
import club.evon.ObfuscationHelper;
import club.evon.Module;
import club.evon.gR;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.json.JSONException;

public final class Command
extends CommandBase {
    private static final long Property;
    private static final String[] StaticEventBus;

    public _4() {
        String[] stringArray = StaticEventBus;
        super(stringArray[2], stringArray[1], stringArray[6]);
    }

    /*
     * Exception decompiling
     */
    @Override
    public boolean x(String[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting FontWeight bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 32[SWITCH]
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
    public ArrayList<String> X() {
        return new gR(this);
    }

    private static /* synthetic */ void lambda$run$0(Module gQ2) {
        gQ2.n().P((Object)-1);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                _4.Property = ObfuscationHelper.FontWeight((long)-6964764662006183561L, (long)-6732643053938539485L, MethodHandles.lookup().lookupClass()).FontWeight(86727719527076L);
                var0 = _4.Property ^ 74070395278866L;
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
                var9_3 = new String[22];
                var7_4 = 0;
                var6_5 = "EventDispatcher\u00c6*\u009a\u008b\u0018\u00d706\u0017\u00c4\u00db$\u00e2\u00a2\u008c\u00b5\u0017\u00c9\u00b1\u00be\u0006\u00b6U8XrP\u00c6\u008eE\u00ca\u00f4Tm\u00b56\u00ff\u0004N\u008d\u00ac\u00f8Y\u00ddB6\u0010I\u00fc\u009f\u00df\u00cf\u00be\u008b\u0095\u0013\u0096\u00d5\u0093\u000b:\u00f5\u0007\u008a\u001c\u0093`\u00df\u00b9!\u00ac\u0091p\u00a3\nG\u00e6\u00ac\u0087\u0019\Property\u00a6\u00a8\u007f?\u00fb\u008e\u00d9`\Property\u00d7/\u00c9\u00fb\u00a1\u00845\u00b4\u0010\u00f1\u0081\u00fb\u009dT\u00ab\u00c3]\u00af\u00fc\"7\u00db\u00c8\u00f4\u0011\u0010\u0093\u0099\\\u00a45\u00ad\u008eu\u00d7\u00d8#\u00f6\u0012\u00fd8\u00fb\u0018\u00d8\u0018 \u00f54\u00a2H%\u0016\u00d4E%StaticEventBus\u000f\u00d1\u0011\u0007\u001b1\u00c04{\u00ba\u0093\Property&,*\u0016\u00d8\u00ed\u00197\Property\u00ebxWC\u009b\u007f\u00c5\u00f0\u0018v\u00e6\u00ea\u00eb\u00fe\u00f6\u00e1*.\u00e6TqlH\u00dbCV{\u0099\u0096|\u00bd\u00acM\bta\u00a0\u0092\u00992'R\u0010'q\u00b3a4\u0006K\u0097\u00bf\u00ee\u0096\u0017\u0007j\Property\u00e1\u0010'q\u00b3a4\u0006K\u0097\u00bf\u00ee\u0096\u0017\u0007j\Property\u00e1 EventDispatcher\u00c6*\u009a\u008b\u0018\u00d70C$\u00e7\u00d4R+\u00efC\u00dc\u009en\u00ed/\u0015\u00e5\u00d1\u00f0\u0013=G\u00d1\u00c9W\u00f0\Property\u00ce]/\u00f4\u00dd\u0087\u00bb\u009a\Property\u00ad\u00df|\u0085\u001f\u00d8t\u0003\Property\u00bdG\u0013\u00daI\u00c6\u00f6C\Property\u00ebxWC\u009b\u007f\u00c5\u00f0\u0010\u008f_\u008ci\u00d5I\u00a8\u00e8\u00d7jjpz\u0096\u0006^\Property\u0019\u0019\u00fe\u0091E\u0086\u00d6\u0085";
                var8_6 = "EventDispatcher\u00c6*\u009a\u008b\u0018\u00d706\u0017\u00c4\u00db$\u00e2\u00a2\u008c\u00b5\u0017\u00c9\u00b1\u00be\u0006\u00b6U8XrP\u00c6\u008eE\u00ca\u00f4Tm\u00b56\u00ff\u0004N\u008d\u00ac\u00f8Y\u00ddB6\u0010I\u00fc\u009f\u00df\u00cf\u00be\u008b\u0095\u0013\u0096\u00d5\u0093\u000b:\u00f5\u0007\u008a\u001c\u0093`\u00df\u00b9!\u00ac\u0091p\u00a3\nG\u00e6\u00ac\u0087\u0019\Property\u00a6\u00a8\u007f?\u00fb\u008e\u00d9`\Property\u00d7/\u00c9\u00fb\u00a1\u00845\u00b4\u0010\u00f1\u0081\u00fb\u009dT\u00ab\u00c3]\u00af\u00fc\"7\u00db\u00c8\u00f4\u0011\u0010\u0093\u0099\\\u00a45\u00ad\u008eu\u00d7\u00d8#\u00f6\u0012\u00fd8\u00fb\u0018\u00d8\u0018 \u00f54\u00a2H%\u0016\u00d4E%StaticEventBus\u000f\u00d1\u0011\u0007\u001b1\u00c04{\u00ba\u0093\Property&,*\u0016\u00d8\u00ed\u00197\Property\u00ebxWC\u009b\u007f\u00c5\u00f0\u0018v\u00e6\u00ea\u00eb\u00fe\u00f6\u00e1*.\u00e6TqlH\u00dbCV{\u0099\u0096|\u00bd\u00acM\bta\u00a0\u0092\u00992'R\u0010'q\u00b3a4\u0006K\u0097\u00bf\u00ee\u0096\u0017\u0007j\Property\u00e1\u0010'q\u00b3a4\u0006K\u0097\u00bf\u00ee\u0096\u0017\u0007j\Property\u00e1 EventDispatcher\u00c6*\u009a\u008b\u0018\u00d70C$\u00e7\u00d4R+\u00efC\u00dc\u009en\u00ed/\u0015\u00e5\u00d1\u00f0\u0013=G\u00d1\u00c9W\u00f0\Property\u00ce]/\u00f4\u00dd\u0087\u00bb\u009a\Property\u00ad\u00df|\u0085\u001f\u00d8t\u0003\Property\u00bdG\u0013\u00daI\u00c6\u00f6C\Property\u00ebxWC\u009b\u007f\u00c5\u00f0\u0010\u008f_\u008ci\u00d5I\u00a8\u00e8\u00d7jjpz\u0096\u0006^\Property\u0019\u0019\u00fe\u0091E\u0086\u00d6\u0085".length();
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
                    var9_3[var7_4++] = _4.FontWeight(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "@\u0010\u00a2]r\u001a.\u0003\Property@\u0010\u00a2]r\u001a.\u0003";
                    var8_6 = "@\u0010\u00a2]r\u001a.\u0003\Property@\u0010\u00a2]r\u001a.\u0003".length();
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
                    var9_3[var7_4++] = _4.FontWeight(var10_9).intern();
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
        _4.StaticEventBus = var9_3;
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
