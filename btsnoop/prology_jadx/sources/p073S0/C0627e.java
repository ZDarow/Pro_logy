package p073S0;

/* renamed from: S0.e */
/* loaded from: classes.dex */
public final class C0627e implements p077T0.InterfaceC0719g {

    /* renamed from: l */
    public long f1967l;

    /* renamed from: m */
    public long f1968m;

    /* renamed from: n */
    public java.lang.Object f1969n;

    /* renamed from: o */
    public java.lang.Object f1970o;

    public C0627e(long j4, int i4) {
        p086W.AbstractC0781a.m1421j(((p197u0.C2214a) this.f1969n) == null);
        this.f1967l = j4;
        this.f1968m = j4 + i4;
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: a */
    public long mo590a(p215y0.C2400l c2400l) {
        long j4 = this.f1968m;
        if (j4 < 0) {
            return -1L;
        }
        long j5 = -(j4 + 2);
        this.f1968m = -1L;
        return j5;
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: h */
    public p215y0.InterfaceC2414z mo594h() {
        p086W.AbstractC0781a.m1421j(this.f1967l != -1);
        return new p002A0.C0004b((p215y0.C2407s) this.f1969n, this.f1967l, 1);
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: n */
    public void mo599n(long j4) {
        long[] jArr = (long[]) ((p200u3.C2259m) this.f1970o).f8980l;
        this.f1968m = jArr[p086W.AbstractC0805y.m1611f(jArr, j4, true)];
    }

    public C0627e(java.lang.String str, byte[] bArr, long j4, long j5) {
        this.f1969n = str;
        this.f1970o = bArr;
        this.f1967l = j4;
        this.f1968m = j5;
    }
}
