package p215y0;

/* renamed from: y0.v */
/* loaded from: classes.dex */
public final class C2410v {

    /* renamed from: a */
    public final java.util.List f9482a;

    /* renamed from: b */
    public final int f9483b;

    /* renamed from: c */
    public final int f9484c;

    /* renamed from: d */
    public final int f9485d;

    /* renamed from: e */
    public final int f9486e;

    /* renamed from: f */
    public final int f9487f;

    /* renamed from: g */
    public final int f9488g;

    /* renamed from: h */
    public final float f9489h;

    /* renamed from: i */
    public final int f9490i;

    /* renamed from: j */
    public final java.lang.String f9491j;

    public C2410v(java.util.List list, int i4, int i5, int i6, int i7, int i8, int i9, float f4, int i10, java.lang.String str) {
        this.f9482a = list;
        this.f9483b = i4;
        this.f9484c = i5;
        this.f9485d = i6;
        this.f9486e = i7;
        this.f9487f = i8;
        this.f9488g = i9;
        this.f9489h = f4;
        this.f9490i = i10;
        this.f9491j = str;
    }

    /* renamed from: a */
    public static p215y0.C2410v m4645a(p086W.C0798r c0798r) {
        int i4;
        int i5;
        try {
            c0798r.m1538H(21);
            int m1559u = c0798r.m1559u() & 3;
            int m1559u2 = c0798r.m1559u();
            int i6 = c0798r.f2787b;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < m1559u2; i9++) {
                c0798r.m1538H(1);
                int m1531A = c0798r.m1531A();
                for (int i10 = 0; i10 < m1531A; i10++) {
                    int m1531A2 = c0798r.m1531A();
                    i8 += m1531A2 + 4;
                    c0798r.m1538H(m1531A2);
                }
            }
            c0798r.m1537G(i6);
            byte[] bArr = new byte[i8];
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f4 = 1.0f;
            java.lang.String str = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < m1559u2) {
                int m1559u3 = c0798r.m1559u() & 63;
                int m1531A3 = c0798r.m1531A();
                int i19 = i7;
                while (i19 < m1531A3) {
                    int m1531A4 = c0798r.m1531A();
                    int i20 = m1559u2;
                    java.lang.System.arraycopy(p090X.AbstractC0830g.f2960a, i7, bArr, i18, 4);
                    int i21 = i18 + 4;
                    java.lang.System.arraycopy(c0798r.f2786a, c0798r.f2787b, bArr, i21, m1531A4);
                    if (m1559u3 == 33 && i19 == 0) {
                        p090X.C0827d m1667c = p090X.AbstractC0830g.m1667c(bArr, i21, i21 + m1531A4);
                        int i22 = m1667c.f2928e + 8;
                        i12 = m1667c.f2929f + 8;
                        i13 = m1667c.f2936m;
                        int i23 = m1667c.f2937n;
                        int i24 = m1667c.f2938o;
                        float f5 = m1667c.f2934k;
                        int i25 = m1667c.f2935l;
                        i4 = m1559u3;
                        i5 = m1531A3;
                        i11 = i22;
                        str = p086W.AbstractC0781a.m1414c(m1667c.f2924a, m1667c.f2925b, m1667c.f2926c, m1667c.f2927d, m1667c.f2930g, m1667c.f2931h);
                        i15 = i24;
                        i14 = i23;
                        i16 = i25;
                        f4 = f5;
                    } else {
                        i4 = m1559u3;
                        i5 = m1531A3;
                    }
                    i18 = i21 + m1531A4;
                    c0798r.m1538H(m1531A4);
                    i19++;
                    m1559u2 = i20;
                    m1559u3 = i4;
                    m1531A3 = i5;
                    i7 = 0;
                }
                i17++;
                i7 = 0;
            }
            return new p215y0.C2410v(i8 == 0 ? java.util.Collections.emptyList() : java.util.Collections.singletonList(bArr), m1559u + 1, i11, i12, i13, i14, i15, f4, i16, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e4) {
            throw p076T.C0666I.m1202a(e4, "Error parsing HEVC config");
        }
    }
}
