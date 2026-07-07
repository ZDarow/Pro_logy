package p132g0;

/* renamed from: g0.p */
/* loaded from: classes.dex */
public final class C1471p implements p215y0.InterfaceC2387F {

    /* renamed from: f */
    public static final p076T.C0702p f5942f;

    /* renamed from: g */
    public static final p076T.C0702p f5943g;

    /* renamed from: a */
    public final p215y0.InterfaceC2387F f5944a;

    /* renamed from: b */
    public final p076T.C0702p f5945b;

    /* renamed from: c */
    public p076T.C0702p f5946c;

    /* renamed from: d */
    public byte[] f5947d;

    /* renamed from: e */
    public int f5948e;

    static {
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/id3");
        f5942f = new p076T.C0702p(c0701o);
        p076T.C0701o c0701o2 = new p076T.C0701o();
        c0701o2.f2370l = p076T.AbstractC0665H.m1201l("application/x-emsg");
        f5943g = new p076T.C0702p(c0701o2);
    }

    public C1471p(p215y0.InterfaceC2387F interfaceC2387F, int i4) {
        this.f5944a = interfaceC2387F;
        if (i4 == 1) {
            this.f5945b = f5942f;
        } else {
            if (i4 != 3) {
                throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m152k("Unknown metadataType: ", i4));
            }
            this.f5945b = f5943g;
        }
        this.f5947d = new byte[0];
        this.f5948e = 0;
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: a */
    public final void mo1405a(p086W.C0798r c0798r, int i4, int i5) {
        int i6 = this.f5948e + i4;
        byte[] bArr = this.f5947d;
        if (bArr.length < i6) {
            this.f5947d = java.util.Arrays.copyOf(bArr, (i6 / 2) + i6);
        }
        c0798r.m1544f(this.f5947d, this.f5948e, i4);
        this.f5948e += i4;
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: b */
    public final void mo1406b(long j4, int i4, int i5, int i6, p215y0.C2386E c2386e) {
        this.f5946c.getClass();
        int i7 = this.f5948e - i6;
        p086W.C0798r c0798r = new p086W.C0798r(java.util.Arrays.copyOfRange(this.f5947d, i7 - i5, i7));
        byte[] bArr = this.f5947d;
        java.lang.System.arraycopy(bArr, i7, bArr, 0, i6);
        this.f5948e = i6;
        java.lang.String str = this.f5946c.f2408m;
        p076T.C0702p c0702p = this.f5945b;
        if (!p086W.AbstractC0805y.m1606a(str, c0702p.f2408m)) {
            if (!"application/x-emsg".equals(this.f5946c.f2408m)) {
                p086W.AbstractC0781a.m1410A("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f5946c.f2408m);
                return;
            }
            p039J0.C0310a m708d0 = p036I0.C0306b.m708d0(c0798r);
            p076T.C0702p mo711b = m708d0.mo711b();
            java.lang.String str2 = c0702p.f2408m;
            if (mo711b == null || !p086W.AbstractC0805y.m1606a(str2, mo711b.f2408m)) {
                p086W.AbstractC0781a.m1410A("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + m708d0.mo711b());
                return;
            }
            byte[] mo710a = m708d0.mo710a();
            mo710a.getClass();
            c0798r = new p086W.C0798r(mo710a);
        }
        int m1539a = c0798r.m1539a();
        p215y0.InterfaceC2387F interfaceC2387F = this.f5944a;
        interfaceC2387F.mo1405a(c0798r, m1539a, 0);
        interfaceC2387F.mo1406b(j4, i4, m1539a, 0, c2386e);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: c */
    public final void mo1407c(p076T.C0702p c0702p) {
        this.f5946c = c0702p;
        this.f5944a.mo1407c(this.f5945b);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: d */
    public final int mo1408d(p076T.InterfaceC0696j interfaceC0696j, int i4, boolean z4) {
        int i5 = this.f5948e + i4;
        byte[] bArr = this.f5947d;
        if (bArr.length < i5) {
            this.f5947d = java.util.Arrays.copyOf(bArr, (i5 / 2) + i5);
        }
        int read = interfaceC0696j.read(this.f5947d, this.f5948e, i4);
        if (read != -1) {
            this.f5948e += read;
            return read;
        }
        if (z4) {
            return -1;
        }
        throw new java.io.EOFException();
    }
}
