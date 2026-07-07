package p184r0;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public final class C2045c implements p215y0.InterfaceC2387F {

    /* renamed from: a */
    public final int f8314a;

    /* renamed from: b */
    public final p076T.C0702p f8315b;

    /* renamed from: c */
    public final p215y0.C2402n f8316c = new p215y0.C2402n();

    /* renamed from: d */
    public p076T.C0702p f8317d;

    /* renamed from: e */
    public p215y0.InterfaceC2387F f8318e;

    /* renamed from: f */
    public long f8319f;

    public C2045c(int i4, int i5, p076T.C0702p c0702p) {
        this.f8314a = i5;
        this.f8315b = c0702p;
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: a */
    public final void mo1405a(p086W.C0798r c0798r, int i4, int i5) {
        p215y0.InterfaceC2387F interfaceC2387F = this.f8318e;
        int i6 = p086W.AbstractC0805y.f2801a;
        interfaceC2387F.mo1405a(c0798r, i4, 0);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: b */
    public final void mo1406b(long j4, int i4, int i5, int i6, p215y0.C2386E c2386e) {
        long j5 = this.f8319f;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            this.f8318e = this.f8316c;
        }
        p215y0.InterfaceC2387F interfaceC2387F = this.f8318e;
        int i7 = p086W.AbstractC0805y.f2801a;
        interfaceC2387F.mo1406b(j4, i4, i5, i6, c2386e);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: c */
    public final void mo1407c(p076T.C0702p c0702p) {
        p076T.C0702p c0702p2 = this.f8315b;
        if (c0702p2 != null) {
            c0702p = c0702p.m1298d(c0702p2);
        }
        this.f8317d = c0702p;
        p215y0.InterfaceC2387F interfaceC2387F = this.f8318e;
        int i4 = p086W.AbstractC0805y.f2801a;
        interfaceC2387F.mo1407c(c0702p);
    }

    @Override // p215y0.InterfaceC2387F
    /* renamed from: d */
    public final int mo1408d(p076T.InterfaceC0696j interfaceC0696j, int i4, boolean z4) {
        p215y0.InterfaceC2387F interfaceC2387F = this.f8318e;
        int i5 = p086W.AbstractC0805y.f2801a;
        return interfaceC2387F.mo1408d(interfaceC0696j, i4, z4);
    }
}
