package p077T0;

/* renamed from: T0.a */
/* loaded from: classes.dex */
public final class C0713a implements p215y0.InterfaceC2414z {

    /* renamed from: a */
    public final /* synthetic */ p077T0.C0714b f2456a;

    public C0713a(p077T0.C0714b c0714b) {
        this.f2456a = c0714b;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return true;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        p077T0.C0714b c0714b = this.f2456a;
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf((c0714b.f2460o.f2497i * j4) / 1000000);
        long j5 = c0714b.f2459n;
        long j6 = c0714b.f2458m;
        p215y0.C2382A c2382a = new p215y0.C2382A(j4, p086W.AbstractC0805y.m1616k((valueOf.multiply(java.math.BigInteger.valueOf(j5 - j6)).divide(java.math.BigInteger.valueOf(c0714b.f2462q)).longValue() + j6) - 30000, c0714b.f2458m, j5 - 1));
        return new p215y0.C2413y(c2382a, c2382a);
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return (this.f2456a.f2462q * 1000000) / r0.f2460o.f2497i;
    }
}
