package p021E0;

/* renamed from: E0.b */
/* loaded from: classes.dex */
public final class C0190b implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final p086W.C0798r f518a = new p086W.C0798r(4);

    /* renamed from: b */
    public final p086W.C0798r f519b = new p086W.C0798r(9);

    /* renamed from: c */
    public final p086W.C0798r f520c = new p086W.C0798r(11);

    /* renamed from: d */
    public final p086W.C0798r f521d = new p086W.C0798r();

    /* renamed from: e */
    public final p021E0.C0191c f522e;

    /* renamed from: f */
    public p215y0.InterfaceC2405q f523f;

    /* renamed from: g */
    public int f524g;

    /* renamed from: h */
    public boolean f525h;

    /* renamed from: i */
    public long f526i;

    /* renamed from: j */
    public int f527j;

    /* renamed from: k */
    public int f528k;

    /* renamed from: l */
    public int f529l;

    /* renamed from: m */
    public long f530m;

    /* renamed from: n */
    public boolean f531n;

    /* renamed from: o */
    public p021E0.C0189a f532o;

    /* renamed from: p */
    public p021E0.C0194f f533p;

    /* JADX WARN: Type inference failed for: r0v4, types: [E0.c, E0.e] */
    public C0190b() {
        ?? abstractC0193e = new p021E0.AbstractC0193e(new p215y0.C2402n());
        abstractC0193e.f534b = -9223372036854775807L;
        abstractC0193e.f535c = new long[0];
        abstractC0193e.f536d = new long[0];
        this.f522e = abstractC0193e;
        this.f524g = 1;
    }

    /* renamed from: a */
    public final p086W.C0798r m544a(p215y0.C2400l c2400l) {
        int i4 = this.f529l;
        p086W.C0798r c0798r = this.f521d;
        byte[] bArr = c0798r.f2786a;
        if (i4 > bArr.length) {
            c0798r.m1535E(new byte[java.lang.Math.max(bArr.length * 2, i4)], 0);
        } else {
            c0798r.m1537G(0);
        }
        c0798r.m1536F(this.f529l);
        c2400l.mo631k(c0798r.f2786a, 0, this.f529l, false);
        return c0798r;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        if (j4 == 0) {
            this.f524g = 1;
            this.f525h = false;
        } else {
            this.f524g = 3;
        }
        this.f527j = 0;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f523f = interfaceC2405q;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p086W.C0798r c0798r = this.f518a;
        p215y0.C2400l c2400l = (p215y0.C2400l) interfaceC2404p;
        c2400l.mo634p(c0798r.f2786a, 0, 3, false);
        c0798r.m1537G(0);
        if (c0798r.m1562x() != 4607062) {
            return false;
        }
        c2400l.mo634p(c0798r.f2786a, 0, 2, false);
        c0798r.m1537G(0);
        if ((c0798r.m1531A() & 250) != 0) {
            return false;
        }
        c2400l.mo634p(c0798r.f2786a, 0, 4, false);
        c0798r.m1537G(0);
        int m1546h = c0798r.m1546h();
        c2400l.f9452q = 0;
        c2400l.m4631a(m1546h, false);
        c2400l.mo634p(c0798r.f2786a, 0, 4, false);
        c0798r.m1537G(0);
        return c0798r.m1546h() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x037b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v53, types: [E0.e, E0.a] */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r32, p076T.C0706t r33) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021E0.C0190b.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
