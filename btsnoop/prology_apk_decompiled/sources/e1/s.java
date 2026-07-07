package e1;

import a0.K;

/* loaded from: classes.dex */
public final class s implements i {

    /* renamed from: a, reason: collision with root package name */
    public final D f5333a;

    /* renamed from: b, reason: collision with root package name */
    public String f5334b;

    /* renamed from: c, reason: collision with root package name */
    public y0.F f5335c;

    /* renamed from: d, reason: collision with root package name */
    public r f5336d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5337e;

    /* renamed from: l, reason: collision with root package name */
    public long f5344l;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f5338f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final K f5339g = new K(32);

    /* renamed from: h, reason: collision with root package name */
    public final K f5340h = new K(33);

    /* renamed from: i, reason: collision with root package name */
    public final K f5341i = new K(34);

    /* renamed from: j, reason: collision with root package name */
    public final K f5342j = new K(39);

    /* renamed from: k, reason: collision with root package name */
    public final K f5343k = new K(40);

    /* renamed from: m, reason: collision with root package name */
    public long f5345m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final W.r f5346n = new W.r();

    public s(D d4) {
        this.f5333a = d4;
    }

    public final void a(byte[] bArr, int i4, int i5) {
        r rVar = this.f5336d;
        if (rVar.f5325f) {
            int i6 = rVar.f5323d;
            int i7 = (i4 + 2) - i6;
            if (i7 < i5) {
                rVar.f5326g = (bArr[i7] & 128) != 0;
                rVar.f5325f = false;
            } else {
                rVar.f5323d = (i5 - i4) + i6;
            }
        }
        if (!this.f5337e) {
            this.f5339g.a(bArr, i4, i5);
            this.f5340h.a(bArr, i4, i5);
            this.f5341i.a(bArr, i4, i5);
        }
        this.f5342j.a(bArr, i4, i5);
        this.f5343k.a(bArr, i4, i5);
    }

    @Override // e1.i
    public final void b() {
        this.f5344l = 0L;
        this.f5345m = -9223372036854775807L;
        X.g.a(this.f5338f);
        this.f5339g.d();
        this.f5340h.d();
        this.f5341i.d();
        this.f5342j.d();
        this.f5343k.d();
        r rVar = this.f5336d;
        if (rVar != null) {
            rVar.f5325f = false;
            rVar.f5326g = false;
            rVar.f5327h = false;
            rVar.f5328i = false;
            rVar.f5329j = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x022c A[SYNTHETIC] */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(W.r r38) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.s.d(W.r):void");
    }

    @Override // e1.i
    public final void e(boolean z4) {
        W.a.k(this.f5335c);
        int i4 = W.y.f2709a;
        if (z4) {
            r rVar = this.f5336d;
            long j4 = this.f5344l;
            rVar.f5332m = rVar.f5322c;
            rVar.a((int) (j4 - rVar.f5321b));
            rVar.f5330k = rVar.f5321b;
            rVar.f5321b = j4;
            rVar.a(0);
            rVar.f5328i = false;
        }
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5334b = (String) g4.f5144e;
        g4.c();
        y0.F v4 = qVar.v(g4.f5142c, 2);
        this.f5335c = v4;
        this.f5336d = new r(v4);
        this.f5333a.b(qVar, g4);
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5345m = j4;
    }
}
