package p002A0;

/* renamed from: A0.d */
/* loaded from: classes.dex */
public final class C0006d implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final p086W.C0798r f10a;

    /* renamed from: b */
    public final p002A0.C0005c f11b;

    /* renamed from: c */
    public final boolean f12c;

    /* renamed from: d */
    public final p046L1.C0363g f13d;

    /* renamed from: e */
    public int f14e;

    /* renamed from: f */
    public p215y0.InterfaceC2405q f15f;

    /* renamed from: g */
    public p002A0.C0007e f16g;

    /* renamed from: h */
    public long f17h;

    /* renamed from: i */
    public p002A0.C0009g[] f18i;

    /* renamed from: j */
    public long f19j;

    /* renamed from: k */
    public p002A0.C0009g f20k;

    /* renamed from: l */
    public int f21l;

    /* renamed from: m */
    public long f22m;

    /* renamed from: n */
    public long f23n;

    /* renamed from: o */
    public int f24o;

    /* renamed from: p */
    public boolean f25p;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, A0.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, y0.q] */
    public C0006d(int i4, p046L1.C0363g c0363g) {
        this.f13d = c0363g;
        this.f12c = (i4 & 1) == 0;
        this.f10a = new p086W.C0798r(12);
        this.f11b = new java.lang.Object();
        this.f15f = new java.lang.Object();
        this.f18i = new p002A0.C0009g[0];
        this.f22m = -1L;
        this.f23n = -1L;
        this.f21l = -1;
        this.f17h = -9223372036854775807L;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        this.f19j = -1L;
        this.f20k = null;
        for (p002A0.C0009g c0009g : this.f18i) {
            if (c0009g.f43j == 0) {
                c0009g.f41h = 0;
            } else {
                c0009g.f41h = c0009g.f45l[p086W.AbstractC0805y.m1611f(c0009g.f44k, j4, true)];
            }
        }
        if (j4 != 0) {
            this.f14e = 6;
        } else if (this.f18i.length == 0) {
            this.f14e = 0;
        } else {
            this.f14e = 3;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f14e = 0;
        if (this.f12c) {
            interfaceC2405q = new android.support.v4.media.session.C1061t(interfaceC2405q, this.f13d);
        }
        this.f15f = interfaceC2405q;
        this.f19j = -1L;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        p086W.C0798r c0798r = this.f10a;
        ((p215y0.C2400l) interfaceC2404p).mo634p(c0798r.f2786a, 0, 12, false);
        c0798r.m1537G(0);
        if (c0798r.m1548j() != 1179011410) {
            return false;
        }
        c0798r.m1538H(4);
        return c0798r.m1548j() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r29, p076T.C0706t r30) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p002A0.C0006d.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
