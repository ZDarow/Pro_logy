package e1;

import a0.K;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f5228q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f5229a;

    /* renamed from: b, reason: collision with root package name */
    public y0.F f5230b;

    /* renamed from: c, reason: collision with root package name */
    public final D f5231c;

    /* renamed from: d, reason: collision with root package name */
    public final W.r f5232d;

    /* renamed from: e, reason: collision with root package name */
    public final K f5233e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f5234f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final j f5235g;

    /* renamed from: h, reason: collision with root package name */
    public long f5236h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5237i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5238j;

    /* renamed from: k, reason: collision with root package name */
    public long f5239k;

    /* renamed from: l, reason: collision with root package name */
    public long f5240l;

    /* renamed from: m, reason: collision with root package name */
    public long f5241m;

    /* renamed from: n, reason: collision with root package name */
    public long f5242n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5243o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5244p;

    /* JADX WARN: Type inference failed for: r0v2, types: [e1.j, java.lang.Object] */
    public k(D d4) {
        this.f5231c = d4;
        ?? obj = new Object();
        obj.f5227d = new byte[128];
        this.f5235g = obj;
        if (d4 != null) {
            this.f5233e = new K(178);
            this.f5232d = new W.r();
        } else {
            this.f5233e = null;
            this.f5232d = null;
        }
        this.f5240l = -9223372036854775807L;
        this.f5242n = -9223372036854775807L;
    }

    @Override // e1.i
    public final void b() {
        X.g.a(this.f5234f);
        j jVar = this.f5235g;
        jVar.f5224a = false;
        jVar.f5225b = 0;
        jVar.f5226c = 0;
        K k4 = this.f5233e;
        if (k4 != null) {
            k4.d();
        }
        this.f5236h = 0L;
        this.f5237i = false;
        this.f5240l = -9223372036854775807L;
        this.f5242n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ed  */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(W.r r27) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.k.d(W.r):void");
    }

    @Override // e1.i
    public final void e(boolean z4) {
        W.a.k(this.f5230b);
        if (z4) {
            boolean z5 = this.f5243o;
            this.f5230b.b(this.f5242n, z5 ? 1 : 0, (int) (this.f5236h - this.f5241m), 0, null);
        }
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5229a = (String) g4.f5144e;
        g4.c();
        this.f5230b = qVar.v(g4.f5142c, 2);
        D d4 = this.f5231c;
        if (d4 != null) {
            d4.b(qVar, g4);
        }
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5240l = j4;
    }
}
