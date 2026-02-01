/*
 * Decompiled with CFR 0.152.
 */
package club.evon;

import club.evon._X;
import java.util.ArrayList;

class z_
extends ArrayList<String> {
    final _X u;
    private static final String a;

    z_(_X _X2) {
        this.u = _X2;
        this.add(a);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n;
            char[] cArray2;
            int n2;
            int n3;
            block11: {
                char[] cArray3 = "\u0000RX\u001b\u001e<i\u000e\u001b[\u0016\u0013'aK\u0019".toCharArray();
                int n4 = cArray3.length;
                n3 = 0;
                n2 = 59;
                cArray2 = cArray3;
                n = n4;
                if (n4 <= 1) break block11;
                cArray = cArray2;
                n = n;
                if (n <= n3) break block12;
            }
            do {
                int n5 = n2;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n6 = n2;
                int n7 = n3;
                while (true) {
                    cArray4[n7] = (char)(cArray4[n7] ^ (n6 ^ (switch (n3 % 7) {
                        case 0 -> 21;
                        case 1 -> 28;
                        case 2 -> 13;
                        case 3 -> 66;
                        case 4 -> 76;
                        case 5 -> 105;
                        default -> 54;
                    })));
                    ++n3;
                    n2 = n5;
                    if (n5 != 0) break;
                    n5 = n2;
                    cArray2 = cArray2;
                    n7 = n2;
                    cArray4 = cArray2;
                    n6 = n2;
                }
                cArray = cArray2;
                n = n;
            } while (n > n3);
        }
        a = new String(cArray).intern();
    }
}
