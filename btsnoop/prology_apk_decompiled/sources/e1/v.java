package e1;

/* loaded from: classes.dex */
public final class v implements i {

    /* renamed from: e, reason: collision with root package name */
    public String f5385e;

    /* renamed from: f, reason: collision with root package name */
    public y0.F f5386f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5389i;

    /* renamed from: k, reason: collision with root package name */
    public int f5391k;

    /* renamed from: l, reason: collision with root package name */
    public int f5392l;

    /* renamed from: n, reason: collision with root package name */
    public int f5394n;

    /* renamed from: o, reason: collision with root package name */
    public int f5395o;
    public int s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5400u;

    /* renamed from: d, reason: collision with root package name */
    public int f5384d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final W.r f5381a = new W.r(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final W.q f5382b = new W.q();

    /* renamed from: c, reason: collision with root package name */
    public final W.r f5383c = new W.r();

    /* renamed from: p, reason: collision with root package name */
    public final w f5396p = new Object();

    /* renamed from: q, reason: collision with root package name */
    public int f5397q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f5398r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f5399t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5390j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5393m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f5387g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f5388h = -9.223372036854776E18d;

    @Override // e1.i
    public final void b() {
        this.f5384d = 0;
        this.f5392l = 0;
        this.f5381a.D(2);
        this.f5394n = 0;
        this.f5395o = 0;
        this.f5397q = -2147483647;
        this.f5398r = -1;
        this.s = 0;
        this.f5399t = -1L;
        this.f5400u = false;
        this.f5389i = false;
        this.f5393m = true;
        this.f5390j = true;
        this.f5387g = -9.223372036854776E18d;
        this.f5388h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:210:0x027d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0466 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x044d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0400  */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(W.r r23) {
        /*
            Method dump skipped, instructions count: 1340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.v.d(W.r):void");
    }

    @Override // e1.i
    public final void e(boolean z4) {
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5385e = (String) g4.f5144e;
        g4.c();
        this.f5386f = qVar.v(g4.f5142c, 1);
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5391k = i4;
        if (!this.f5390j && (this.f5395o != 0 || !this.f5393m)) {
            this.f5389i = true;
        }
        if (j4 != -9223372036854775807L) {
            if (this.f5389i) {
                this.f5388h = j4;
            } else {
                this.f5387g = j4;
            }
        }
    }
}
