package S0;

import T.H;
import W.y;
import android.util.Pair;
import y0.AbstractC0619b;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1912a;

    static {
        int i4 = y.f2709a;
        f1912a = "OpusHead".getBytes(e2.d.f5436c);
    }

    public static e a(int i4, W.r rVar) {
        rVar.G(i4 + 12);
        rVar.H(1);
        b(rVar);
        rVar.H(2);
        int u4 = rVar.u();
        if ((u4 & 128) != 0) {
            rVar.H(2);
        }
        if ((u4 & 64) != 0) {
            rVar.H(rVar.u());
        }
        if ((u4 & 32) != 0) {
            rVar.H(2);
        }
        rVar.H(1);
        b(rVar);
        String d4 = H.d(rVar.u());
        if ("audio/mpeg".equals(d4) || "audio/vnd.dts".equals(d4) || "audio/vnd.dts.hd".equals(d4)) {
            return new e(d4, null, -1L, -1L);
        }
        rVar.H(4);
        long w = rVar.w();
        long w4 = rVar.w();
        rVar.H(1);
        int b4 = b(rVar);
        byte[] bArr = new byte[b4];
        rVar.f(bArr, 0, b4);
        return new e(d4, bArr, w4 > 0 ? w4 : -1L, w > 0 ? w : -1L);
    }

    public static int b(W.r rVar) {
        int u4 = rVar.u();
        int i4 = u4 & 127;
        while ((u4 & 128) == 128) {
            u4 = rVar.u();
            i4 = (i4 << 7) | (u4 & 127);
        }
        return i4;
    }

    public static X.c c(W.r rVar) {
        long o2;
        long o4;
        rVar.G(8);
        if (c.d(rVar.h()) == 0) {
            o2 = rVar.w();
            o4 = rVar.w();
        } else {
            o2 = rVar.o();
            o4 = rVar.o();
        }
        return new X.c(o2, o4, rVar.w());
    }

    public static Pair d(W.r rVar, int i4, int i5) {
        Integer num;
        v vVar;
        Pair create;
        int i6;
        int i7;
        byte[] bArr;
        int i8 = rVar.f2695b;
        while (i8 - i4 < i5) {
            rVar.G(i8);
            int h4 = rVar.h();
            AbstractC0619b.e("childAtomSize must be positive", h4 > 0);
            if (rVar.h() == 1936289382) {
                int i9 = i8 + 8;
                int i10 = 0;
                int i11 = -1;
                String str = null;
                Integer num2 = null;
                while (i9 - i8 < h4) {
                    rVar.G(i9);
                    int h5 = rVar.h();
                    int h6 = rVar.h();
                    if (h6 == 1718775137) {
                        num2 = Integer.valueOf(rVar.h());
                    } else if (h6 == 1935894637) {
                        rVar.H(4);
                        str = rVar.s(4, e2.d.f5436c);
                    } else if (h6 == 1935894633) {
                        i11 = i9;
                        i10 = h5;
                    }
                    i9 += h5;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AbstractC0619b.e("frma atom is mandatory", num2 != null);
                    AbstractC0619b.e("schi atom is mandatory", i11 != -1);
                    int i12 = i11 + 8;
                    while (true) {
                        if (i12 - i11 >= i10) {
                            num = num2;
                            vVar = null;
                            break;
                        }
                        rVar.G(i12);
                        int h7 = rVar.h();
                        if (rVar.h() == 1952804451) {
                            int d4 = c.d(rVar.h());
                            rVar.H(1);
                            if (d4 == 0) {
                                rVar.H(1);
                                i6 = 0;
                                i7 = 0;
                            } else {
                                int u4 = rVar.u();
                                int i13 = (u4 & 240) >> 4;
                                i6 = u4 & 15;
                                i7 = i13;
                            }
                            boolean z4 = rVar.u() == 1;
                            int u5 = rVar.u();
                            byte[] bArr2 = new byte[16];
                            rVar.f(bArr2, 0, 16);
                            if (z4 && u5 == 0) {
                                int u6 = rVar.u();
                                byte[] bArr3 = new byte[u6];
                                rVar.f(bArr3, 0, u6);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            vVar = new v(z4, str, u5, bArr2, i7, i6, bArr);
                        } else {
                            i12 += h7;
                        }
                    }
                    AbstractC0619b.e("tenc atom is mandatory", vVar != null);
                    int i14 = y.f2709a;
                    create = Pair.create(num, vVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i8 += h4;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:651:0x0ddf, code lost:
    
        if (r3 != 3) goto L632;
     */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0ac4  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0c41  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0c43  */
    /* JADX WARN: Type inference failed for: r5v0, types: [S0.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static S0.g e(W.r r60, int r61, int r62, java.lang.String r63, T.C0092m r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 3856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.j.e(W.r, int, int, java.lang.String, T.m, boolean):S0.g");
    }

    /* JADX WARN: Code restructure failed: missing block: B:289:0x00db, code lost:
    
        if (r6 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x00dd, code lost:
    
        r6 = -9223372036854775807L;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x054f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x08ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList f(S0.a r45, y0.u r46, long r47, T.C0092m r49, boolean r50, boolean r51, e2.e r52) {
        /*
            Method dump skipped, instructions count: 2229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.j.f(S0.a, y0.u, long, T.m, boolean, boolean, e2.e):java.util.ArrayList");
    }
}
