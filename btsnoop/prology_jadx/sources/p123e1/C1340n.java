package p123e1;

/* renamed from: e1.n */
/* loaded from: classes.dex */
public final class C1340n implements p123e1.InterfaceC1335i {

    /* renamed from: l */
    public static final float[] f5450l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final p123e1.C1322D f5451a;

    /* renamed from: b */
    public final p086W.C0798r f5452b;

    /* renamed from: c */
    public final boolean[] f5453c = new boolean[4];

    /* renamed from: d */
    public final p123e1.C1338l f5454d;

    /* renamed from: e */
    public final p102a0.C0947K f5455e;

    /* renamed from: f */
    public p123e1.C1339m f5456f;

    /* renamed from: g */
    public long f5457g;

    /* renamed from: h */
    public java.lang.String f5458h;

    /* renamed from: i */
    public p215y0.InterfaceC2387F f5459i;

    /* renamed from: j */
    public boolean f5460j;

    /* renamed from: k */
    public long f5461k;

    /* JADX WARN: Type inference failed for: r3v3, types: [e1.l, java.lang.Object] */
    public C1340n(p123e1.C1322D c1322d) {
        this.f5451a = c1322d;
        ?? obj = new java.lang.Object();
        obj.f5441e = new byte[128];
        this.f5454d = obj;
        this.f5461k = -9223372036854775807L;
        this.f5455e = new p102a0.C0947K(178);
        this.f5452b = new p086W.C0798r();
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        p090X.AbstractC0830g.m1665a(this.f5453c);
        p123e1.C1338l c1338l = this.f5454d;
        c1338l.f5437a = false;
        c1338l.f5439c = 0;
        c1338l.f5438b = 0;
        p123e1.C1339m c1339m = this.f5456f;
        if (c1339m != null) {
            c1339m.f5443b = false;
            c1339m.f5444c = false;
            c1339m.f5445d = false;
            c1339m.f5446e = -1;
        }
        p102a0.C0947K c0947k = this.f5455e;
        if (c0947k != null) {
            c0947k.m1867d();
        }
        this.f5457g = 0L;
        this.f5461k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0139  */
    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3090d(p086W.C0798r r19) {
        /*
            Method dump skipped, instructions count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1340n.mo3090d(W.r):void");
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
        p086W.AbstractC0781a.m1422k(this.f5456f);
        if (z4) {
            this.f5456f.m3103b(0, this.f5457g, this.f5460j);
            p123e1.C1339m c1339m = this.f5456f;
            c1339m.f5443b = false;
            c1339m.f5444c = false;
            c1339m.f5445d = false;
            c1339m.f5446e = -1;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        c1325g.m3084a();
        c1325g.m3086c();
        this.f5458h = (java.lang.String) c1325g.f5333e;
        c1325g.m3086c();
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(c1325g.f5331c, 2);
        this.f5459i = mo640v;
        this.f5456f = new p123e1.C1339m(mo640v);
        this.f5451a.m3083b(interfaceC2405q, c1325g);
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        this.f5461k = j4;
    }
}
