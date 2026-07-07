package e1;

import a0.K;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a, reason: collision with root package name */
    public final D f5305a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5306b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5307c;

    /* renamed from: g, reason: collision with root package name */
    public long f5311g;

    /* renamed from: i, reason: collision with root package name */
    public String f5313i;

    /* renamed from: j, reason: collision with root package name */
    public y0.F f5314j;

    /* renamed from: k, reason: collision with root package name */
    public p f5315k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5316l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5318n;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f5312h = new boolean[3];

    /* renamed from: d, reason: collision with root package name */
    public final K f5308d = new K(7);

    /* renamed from: e, reason: collision with root package name */
    public final K f5309e = new K(8);

    /* renamed from: f, reason: collision with root package name */
    public final K f5310f = new K(6);

    /* renamed from: m, reason: collision with root package name */
    public long f5317m = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public final W.r f5319o = new W.r();

    public q(D d4, boolean z4, boolean z5) {
        this.f5305a = d4;
        this.f5306b = z4;
        this.f5307c = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.q.a(byte[], int, int):void");
    }

    @Override // e1.i
    public final void b() {
        this.f5311g = 0L;
        this.f5318n = false;
        this.f5317m = -9223372036854775807L;
        X.g.a(this.f5312h);
        this.f5308d.d();
        this.f5309e.d();
        this.f5310f.d();
        p pVar = this.f5315k;
        if (pVar != null) {
            pVar.f5297k = false;
            pVar.f5301o = false;
            o oVar = pVar.f5300n;
            oVar.f5272b = false;
            oVar.f5271a = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0221, code lost:
    
        if (r5.f5284n != r6.f5284n) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0232, code lost:
    
        if (r5.f5286p != r6.f5286p) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0240, code lost:
    
        if (r5.f5282l != r6.f5282l) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02b8, code lost:
    
        if (r5 != 1) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025e  */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(W.r r31) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.q.d(W.r):void");
    }

    @Override // e1.i
    public final void e(boolean z4) {
        W.a.k(this.f5314j);
        int i4 = W.y.f2709a;
        if (z4) {
            p pVar = this.f5315k;
            long j4 = this.f5311g;
            pVar.a();
            pVar.f5296j = j4;
            long j5 = pVar.f5303q;
            if (j5 != -9223372036854775807L) {
                boolean z5 = pVar.f5304r;
                pVar.f5287a.b(j5, z5 ? 1 : 0, (int) (j4 - pVar.f5302p), 0, null);
            }
            pVar.f5301o = false;
        }
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5313i = (String) g4.f5144e;
        g4.c();
        y0.F v4 = qVar.v(g4.f5142c, 2);
        this.f5314j = v4;
        this.f5315k = new p(v4, this.f5306b, this.f5307c);
        this.f5305a.b(qVar, g4);
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5317m = j4;
        this.f5318n |= (i4 & 2) != 0;
    }
}
