package e1;

import a0.K;

/* loaded from: classes.dex */
public final class n implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f5259l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final D f5260a;

    /* renamed from: b, reason: collision with root package name */
    public final W.r f5261b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f5262c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final l f5263d;

    /* renamed from: e, reason: collision with root package name */
    public final K f5264e;

    /* renamed from: f, reason: collision with root package name */
    public m f5265f;

    /* renamed from: g, reason: collision with root package name */
    public long f5266g;

    /* renamed from: h, reason: collision with root package name */
    public String f5267h;

    /* renamed from: i, reason: collision with root package name */
    public y0.F f5268i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5269j;

    /* renamed from: k, reason: collision with root package name */
    public long f5270k;

    /* JADX WARN: Type inference failed for: r3v3, types: [e1.l, java.lang.Object] */
    public n(D d4) {
        this.f5260a = d4;
        ?? obj = new Object();
        obj.f5250e = new byte[128];
        this.f5263d = obj;
        this.f5270k = -9223372036854775807L;
        this.f5264e = new K(178);
        this.f5261b = new W.r();
    }

    @Override // e1.i
    public final void b() {
        X.g.a(this.f5262c);
        l lVar = this.f5263d;
        lVar.f5246a = false;
        lVar.f5248c = 0;
        lVar.f5247b = 0;
        m mVar = this.f5265f;
        if (mVar != null) {
            mVar.f5252b = false;
            mVar.f5253c = false;
            mVar.f5254d = false;
            mVar.f5255e = -1;
        }
        K k4 = this.f5264e;
        if (k4 != null) {
            k4.d();
        }
        this.f5266g = 0L;
        this.f5270k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(W.r r19) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.n.d(W.r):void");
    }

    @Override // e1.i
    public final void e(boolean z4) {
        W.a.k(this.f5265f);
        if (z4) {
            this.f5265f.b(0, this.f5266g, this.f5269j);
            m mVar = this.f5265f;
            mVar.f5252b = false;
            mVar.f5253c = false;
            mVar.f5254d = false;
            mVar.f5255e = -1;
        }
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5267h = (String) g4.f5144e;
        g4.c();
        y0.F v4 = qVar.v(g4.f5142c, 2);
        this.f5268i = v4;
        this.f5265f = new m(v4);
        this.f5260a.b(qVar, g4);
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5270k = j4;
    }
}
