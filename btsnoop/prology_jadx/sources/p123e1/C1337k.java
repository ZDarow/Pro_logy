package p123e1;

/* renamed from: e1.k */
/* loaded from: classes.dex */
public final class C1337k implements p123e1.InterfaceC1335i {

    /* renamed from: q */
    public static final double[] f5419q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public java.lang.String f5420a;

    /* renamed from: b */
    public p215y0.InterfaceC2387F f5421b;

    /* renamed from: c */
    public final p123e1.C1322D f5422c;

    /* renamed from: d */
    public final p086W.C0798r f5423d;

    /* renamed from: e */
    public final p102a0.C0947K f5424e;

    /* renamed from: f */
    public final boolean[] f5425f = new boolean[4];

    /* renamed from: g */
    public final p123e1.C1336j f5426g;

    /* renamed from: h */
    public long f5427h;

    /* renamed from: i */
    public boolean f5428i;

    /* renamed from: j */
    public boolean f5429j;

    /* renamed from: k */
    public long f5430k;

    /* renamed from: l */
    public long f5431l;

    /* renamed from: m */
    public long f5432m;

    /* renamed from: n */
    public long f5433n;

    /* renamed from: o */
    public boolean f5434o;

    /* renamed from: p */
    public boolean f5435p;

    /* JADX WARN: Type inference failed for: r0v2, types: [e1.j, java.lang.Object] */
    public C1337k(p123e1.C1322D c1322d) {
        this.f5422c = c1322d;
        ?? obj = new java.lang.Object();
        obj.f5418d = new byte[128];
        this.f5426g = obj;
        if (c1322d != null) {
            this.f5424e = new p102a0.C0947K(178);
            this.f5423d = new p086W.C0798r();
        } else {
            this.f5424e = null;
            this.f5423d = null;
        }
        this.f5431l = -9223372036854775807L;
        this.f5433n = -9223372036854775807L;
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        p090X.AbstractC0830g.m1665a(this.f5425f);
        p123e1.C1336j c1336j = this.f5426g;
        c1336j.f5415a = false;
        c1336j.f5416b = 0;
        c1336j.f5417c = 0;
        p102a0.C0947K c0947k = this.f5424e;
        if (c0947k != null) {
            c0947k.m1867d();
        }
        this.f5427h = 0L;
        this.f5428i = false;
        this.f5431l = -9223372036854775807L;
        this.f5433n = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ed  */
    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3090d(p086W.C0798r r27) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1337k.mo3090d(W.r):void");
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
        p086W.AbstractC0781a.m1422k(this.f5421b);
        if (z4) {
            boolean z5 = this.f5434o;
            this.f5421b.mo1406b(this.f5433n, z5 ? 1 : 0, (int) (this.f5427h - this.f5432m), 0, null);
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        c1325g.m3084a();
        c1325g.m3086c();
        this.f5420a = (java.lang.String) c1325g.f5333e;
        c1325g.m3086c();
        this.f5421b = interfaceC2405q.mo640v(c1325g.f5331c, 2);
        p123e1.C1322D c1322d = this.f5422c;
        if (c1322d != null) {
            c1322d.m3083b(interfaceC2405q, c1325g);
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        this.f5431l = j4;
    }
}
