package p073S0;

/* renamed from: S0.j */
/* loaded from: classes.dex */
public abstract class AbstractC0632j {

    /* renamed from: a */
    public static final byte[] f1983a;

    static {
        int i4 = p086W.AbstractC0805y.f2801a;
        f1983a = "OpusHead".getBytes(p124e2.AbstractC1356d.f5630c);
    }

    /* renamed from: a */
    public static p073S0.C0627e m1152a(int i4, p086W.C0798r c0798r) {
        c0798r.m1537G(i4 + 12);
        c0798r.m1538H(1);
        m1153b(c0798r);
        c0798r.m1538H(2);
        int m1559u = c0798r.m1559u();
        if ((m1559u & 128) != 0) {
            c0798r.m1538H(2);
        }
        if ((m1559u & 64) != 0) {
            c0798r.m1538H(c0798r.m1559u());
        }
        if ((m1559u & 32) != 0) {
            c0798r.m1538H(2);
        }
        c0798r.m1538H(1);
        m1153b(c0798r);
        java.lang.String m1193d = p076T.AbstractC0665H.m1193d(c0798r.m1559u());
        if ("audio/mpeg".equals(m1193d) || "audio/vnd.dts".equals(m1193d) || "audio/vnd.dts.hd".equals(m1193d)) {
            return new p073S0.C0627e(m1193d, null, -1L, -1L);
        }
        c0798r.m1538H(4);
        long m1561w = c0798r.m1561w();
        long m1561w2 = c0798r.m1561w();
        c0798r.m1538H(1);
        int m1153b = m1153b(c0798r);
        byte[] bArr = new byte[m1153b];
        c0798r.m1544f(bArr, 0, m1153b);
        return new p073S0.C0627e(m1193d, bArr, m1561w2 > 0 ? m1561w2 : -1L, m1561w > 0 ? m1561w : -1L);
    }

    /* renamed from: b */
    public static int m1153b(p086W.C0798r c0798r) {
        int m1559u = c0798r.m1559u();
        int i4 = m1559u & 127;
        while ((m1559u & 128) == 128) {
            m1559u = c0798r.m1559u();
            i4 = (i4 << 7) | (m1559u & 127);
        }
        return i4;
    }

    /* renamed from: c */
    public static p090X.C0826c m1154c(p086W.C0798r c0798r) {
        long m1553o;
        long m1553o2;
        c0798r.m1537G(8);
        if (p073S0.AbstractC0625c.m1136d(c0798r.m1546h()) == 0) {
            m1553o = c0798r.m1561w();
            m1553o2 = c0798r.m1561w();
        } else {
            m1553o = c0798r.m1553o();
            m1553o2 = c0798r.m1553o();
        }
        return new p090X.C0826c(m1553o, m1553o2, c0798r.m1561w());
    }

    /* renamed from: d */
    public static android.util.Pair m1155d(p086W.C0798r c0798r, int i4, int i5) {
        java.lang.Integer num;
        p073S0.C0644v c0644v;
        android.util.Pair create;
        int i6;
        int i7;
        byte[] bArr;
        int i8 = c0798r.f2787b;
        while (i8 - i4 < i5) {
            c0798r.m1537G(i8);
            int m1546h = c0798r.m1546h();
            p215y0.AbstractC2390b.m4610e("childAtomSize must be positive", m1546h > 0);
            if (c0798r.m1546h() == 1936289382) {
                int i9 = i8 + 8;
                int i10 = 0;
                int i11 = -1;
                java.lang.String str = null;
                java.lang.Integer num2 = null;
                while (i9 - i8 < m1546h) {
                    c0798r.m1537G(i9);
                    int m1546h2 = c0798r.m1546h();
                    int m1546h3 = c0798r.m1546h();
                    if (m1546h3 == 1718775137) {
                        num2 = java.lang.Integer.valueOf(c0798r.m1546h());
                    } else if (m1546h3 == 1935894637) {
                        c0798r.m1538H(4);
                        str = c0798r.m1557s(4, p124e2.AbstractC1356d.f5630c);
                    } else if (m1546h3 == 1935894633) {
                        i11 = i9;
                        i10 = m1546h2;
                    }
                    i9 += m1546h2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    p215y0.AbstractC2390b.m4610e("frma atom is mandatory", num2 != null);
                    p215y0.AbstractC2390b.m4610e("schi atom is mandatory", i11 != -1);
                    int i12 = i11 + 8;
                    while (true) {
                        if (i12 - i11 >= i10) {
                            num = num2;
                            c0644v = null;
                            break;
                        }
                        c0798r.m1537G(i12);
                        int m1546h4 = c0798r.m1546h();
                        if (c0798r.m1546h() == 1952804451) {
                            int m1136d = p073S0.AbstractC0625c.m1136d(c0798r.m1546h());
                            c0798r.m1538H(1);
                            if (m1136d == 0) {
                                c0798r.m1538H(1);
                                i6 = 0;
                                i7 = 0;
                            } else {
                                int m1559u = c0798r.m1559u();
                                int i13 = (m1559u & 240) >> 4;
                                i6 = m1559u & 15;
                                i7 = i13;
                            }
                            boolean z4 = c0798r.m1559u() == 1;
                            int m1559u2 = c0798r.m1559u();
                            byte[] bArr2 = new byte[16];
                            c0798r.m1544f(bArr2, 0, 16);
                            if (z4 && m1559u2 == 0) {
                                int m1559u3 = c0798r.m1559u();
                                byte[] bArr3 = new byte[m1559u3];
                                c0798r.m1544f(bArr3, 0, m1559u3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            c0644v = new p073S0.C0644v(z4, str, m1559u2, bArr2, i7, i6, bArr);
                        } else {
                            i12 += m1546h4;
                        }
                    }
                    p215y0.AbstractC2390b.m4610e("tenc atom is mandatory", c0644v != null);
                    int i14 = p086W.AbstractC0805y.f2801a;
                    create = android.util.Pair.create(num, c0644v);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i8 += m1546h;
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
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p073S0.C0629g m1156e(p086W.C0798r r60, int r61, int r62, java.lang.String r63, p076T.C0699m r64, boolean r65) {
        /*
            Method dump skipped, instructions count: 3856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.AbstractC0632j.m1156e(W.r, int, int, java.lang.String, T.m, boolean):S0.g");
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
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m1157f(p073S0.C0623a r45, p215y0.C2409u r46, long r47, p076T.C0699m r49, boolean r50, boolean r51, p124e2.InterfaceC1357e r52) {
        /*
            Method dump skipped, instructions count: 2229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p073S0.AbstractC0632j.m1157f(S0.a, y0.u, long, T.m, boolean, boolean, e2.e):java.util.ArrayList");
    }
}
