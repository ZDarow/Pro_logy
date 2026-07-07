package p073S0;

/* renamed from: S0.m */
/* loaded from: classes.dex */
public final class C0635m {

    /* renamed from: a */
    public final p215y0.InterfaceC2387F f1991a;

    /* renamed from: d */
    public p073S0.C0646x f1994d;

    /* renamed from: e */
    public p073S0.C0633k f1995e;

    /* renamed from: f */
    public int f1996f;

    /* renamed from: g */
    public int f1997g;

    /* renamed from: h */
    public int f1998h;

    /* renamed from: i */
    public int f1999i;

    /* renamed from: l */
    public boolean f2002l;

    /* renamed from: b */
    public final p073S0.C0645w f1992b = new p073S0.C0645w();

    /* renamed from: c */
    public final p086W.C0798r f1993c = new p086W.C0798r();

    /* renamed from: j */
    public final p086W.C0798r f2000j = new p086W.C0798r(1);

    /* renamed from: k */
    public final p086W.C0798r f2001k = new p086W.C0798r();

    public C0635m(p215y0.InterfaceC2387F interfaceC2387F, p073S0.C0646x c0646x, p073S0.C0633k c0633k) {
        this.f1991a = interfaceC2387F;
        this.f1994d = c0646x;
        this.f1995e = c0633k;
        this.f1994d = c0646x;
        this.f1995e = c0633k;
        interfaceC2387F.mo1407c(c0646x.f2117a.f2089f);
        m1161d();
    }

    /* renamed from: a */
    public final p073S0.C0644v m1158a() {
        if (!this.f2002l) {
            return null;
        }
        p073S0.C0645w c0645w = this.f1992b;
        p073S0.C0633k c0633k = c0645w.f2100a;
        int i4 = p086W.AbstractC0805y.f2801a;
        int i5 = c0633k.f1984a;
        p073S0.C0644v c0644v = c0645w.f2112m;
        if (c0644v == null) {
            p073S0.C0644v[] c0644vArr = this.f1994d.f2117a.f2094k;
            c0644v = c0644vArr == null ? null : c0644vArr[i5];
        }
        if (c0644v == null || !c0644v.f2095a) {
            return null;
        }
        return c0644v;
    }

    /* renamed from: b */
    public final boolean m1159b() {
        this.f1996f++;
        if (!this.f2002l) {
            return false;
        }
        int i4 = this.f1997g + 1;
        this.f1997g = i4;
        int[] iArr = this.f1992b.f2106g;
        int i5 = this.f1998h;
        if (i4 != iArr[i5]) {
            return true;
        }
        this.f1998h = i5 + 1;
        this.f1997g = 0;
        return false;
    }

    /* renamed from: c */
    public final int m1160c(int i4, int i5) {
        p086W.C0798r c0798r;
        p073S0.C0644v m1158a = m1158a();
        if (m1158a == null) {
            return 0;
        }
        p073S0.C0645w c0645w = this.f1992b;
        int i6 = m1158a.f2098d;
        if (i6 != 0) {
            c0798r = c0645w.f2113n;
        } else {
            int i7 = p086W.AbstractC0805y.f2801a;
            byte[] bArr = m1158a.f2099e;
            int length = bArr.length;
            p086W.C0798r c0798r2 = this.f2001k;
            c0798r2.m1535E(bArr, length);
            i6 = bArr.length;
            c0798r = c0798r2;
        }
        boolean z4 = c0645w.f2110k && c0645w.f2111l[this.f1996f];
        boolean z5 = z4 || i5 != 0;
        p086W.C0798r c0798r3 = this.f2000j;
        c0798r3.f2786a[0] = (byte) ((z5 ? 128 : 0) | i6);
        c0798r3.m1537G(0);
        p215y0.InterfaceC2387F interfaceC2387F = this.f1991a;
        interfaceC2387F.mo1405a(c0798r3, 1, 1);
        interfaceC2387F.mo1405a(c0798r, i6, 1);
        if (!z5) {
            return i6 + 1;
        }
        p086W.C0798r c0798r4 = this.f1993c;
        if (!z4) {
            c0798r4.m1534D(8);
            byte[] bArr2 = c0798r4.f2786a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i5 & 255);
            bArr2[4] = (byte) ((i4 >> 24) & 255);
            bArr2[5] = (byte) ((i4 >> 16) & 255);
            bArr2[6] = (byte) ((i4 >> 8) & 255);
            bArr2[7] = (byte) (i4 & 255);
            interfaceC2387F.mo1405a(c0798r4, 8, 1);
            return i6 + 9;
        }
        p086W.C0798r c0798r5 = c0645w.f2113n;
        int m1531A = c0798r5.m1531A();
        c0798r5.m1538H(-2);
        int i8 = (m1531A * 6) + 2;
        if (i5 != 0) {
            c0798r4.m1534D(i8);
            byte[] bArr3 = c0798r4.f2786a;
            c0798r5.m1544f(bArr3, 0, i8);
            int i9 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i5;
            bArr3[2] = (byte) ((i9 >> 8) & 255);
            bArr3[3] = (byte) (i9 & 255);
        } else {
            c0798r4 = c0798r5;
        }
        interfaceC2387F.mo1405a(c0798r4, i8, 1);
        return i6 + 1 + i8;
    }

    /* renamed from: d */
    public final void m1161d() {
        p073S0.C0645w c0645w = this.f1992b;
        c0645w.f2103d = 0;
        c0645w.f2115p = 0L;
        c0645w.f2116q = false;
        c0645w.f2110k = false;
        c0645w.f2114o = false;
        c0645w.f2112m = null;
        this.f1996f = 0;
        this.f1998h = 0;
        this.f1997g = 0;
        this.f1999i = 0;
        this.f2002l = false;
    }
}
