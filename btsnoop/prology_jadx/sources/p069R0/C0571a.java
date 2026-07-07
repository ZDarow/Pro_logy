package p069R0;

/* renamed from: R0.a */
/* loaded from: classes.dex */
public final class C0571a extends p215y0.C2399k implements p069R0.InterfaceC0576f {

    /* renamed from: h */
    public final int f1773h;

    /* renamed from: i */
    public final long f1774i;

    public C0571a(long j4, long j5, int i4, int i5, boolean z4) {
        super(j4, j5, i4, i5, z4);
        this.f1773h = i4;
        this.f1774i = j4 == -1 ? -1L : j4;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: a */
    public final long mo1092a(long j4) {
        return (java.lang.Math.max(0L, j4 - this.f9441b) * 8000000) / this.f9444e;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: e */
    public final long mo1093e() {
        return this.f1774i;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: h */
    public final int mo1094h() {
        return this.f1773h;
    }
}
