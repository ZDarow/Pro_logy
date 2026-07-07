package p128f1;

/* renamed from: f1.f */
/* loaded from: classes.dex */
public final class C1384f implements p215y0.InterfaceC2414z {

    /* renamed from: a */
    public final p073S0.C0631i f5685a;

    /* renamed from: b */
    public final int f5686b;

    /* renamed from: c */
    public final long f5687c;

    /* renamed from: d */
    public final long f5688d;

    /* renamed from: e */
    public final long f5689e;

    public C1384f(p073S0.C0631i c0631i, int i4, long j4, long j5) {
        this.f5685a = c0631i;
        this.f5686b = i4;
        this.f5687c = j4;
        long j6 = (j5 - j4) / c0631i.f1980c;
        this.f5688d = j6;
        this.f5689e = m3141b(j6);
    }

    /* renamed from: b */
    public final long m3141b(long j4) {
        long j5 = j4 * this.f5686b;
        long j6 = this.f5685a.f1979b;
        int i4 = p086W.AbstractC0805y.f2801a;
        return p086W.AbstractC0805y.m1600U(j5, 1000000L, j6, java.math.RoundingMode.FLOOR);
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return true;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        p073S0.C0631i c0631i = this.f5685a;
        long j5 = this.f5688d;
        long m1616k = p086W.AbstractC0805y.m1616k((c0631i.f1979b * j4) / (this.f5686b * 1000000), 0L, j5 - 1);
        long j6 = this.f5687c;
        long m3141b = m3141b(m1616k);
        p215y0.C2382A c2382a = new p215y0.C2382A(m3141b, (c0631i.f1980c * m1616k) + j6);
        if (m3141b >= j4 || m1616k == j5 - 1) {
            return new p215y0.C2413y(c2382a, c2382a);
        }
        long j7 = m1616k + 1;
        return new p215y0.C2413y(c2382a, new p215y0.C2382A(m3141b(j7), (c0631i.f1980c * j7) + j6));
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f5689e;
    }
}
