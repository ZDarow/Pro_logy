package p077T0;

/* renamed from: T0.b */
/* loaded from: classes.dex */
public final class C0714b implements p077T0.InterfaceC0719g {

    /* renamed from: l */
    public final p077T0.C0718f f2457l;

    /* renamed from: m */
    public final long f2458m;

    /* renamed from: n */
    public final long f2459n;

    /* renamed from: o */
    public final p077T0.AbstractC0721i f2460o;

    /* renamed from: p */
    public int f2461p;

    /* renamed from: q */
    public long f2462q;

    /* renamed from: r */
    public long f2463r;

    /* renamed from: s */
    public long f2464s;

    /* renamed from: t */
    public long f2465t;

    /* renamed from: u */
    public long f2466u;

    /* renamed from: v */
    public long f2467v;

    /* renamed from: w */
    public long f2468w;

    public C0714b(p077T0.AbstractC0721i abstractC0721i, long j4, long j5, long j6, long j7, boolean z4) {
        p086W.AbstractC0781a.m1416e(j4 >= 0 && j5 > j4);
        this.f2460o = abstractC0721i;
        this.f2458m = j4;
        this.f2459n = j5;
        if (j6 == j5 - j4 || z4) {
            this.f2462q = j7;
            this.f2461p = 4;
        } else {
            this.f2461p = 0;
        }
        this.f2457l = new p077T0.C0718f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // p077T0.InterfaceC0719g
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo590a(p215y0.C2400l r25) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p077T0.C0714b.mo590a(y0.l):long");
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: h */
    public final p215y0.InterfaceC2414z mo594h() {
        if (this.f2462q != 0) {
            return new p077T0.C0713a(this);
        }
        return null;
    }

    @Override // p077T0.InterfaceC0719g
    /* renamed from: n */
    public final void mo599n(long j4) {
        this.f2464s = p086W.AbstractC0805y.m1616k(j4, 0L, this.f2462q - 1);
        this.f2461p = 2;
        this.f2465t = this.f2458m;
        this.f2466u = this.f2459n;
        this.f2467v = 0L;
        this.f2468w = this.f2462q;
    }
}
