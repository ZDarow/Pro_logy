package p123e1;

/* renamed from: e1.s */
/* loaded from: classes.dex */
public final class C1345s implements p123e1.InterfaceC1335i {

    /* renamed from: a */
    public final p123e1.C1322D f5525a;

    /* renamed from: b */
    public java.lang.String f5526b;

    /* renamed from: c */
    public p215y0.InterfaceC2387F f5527c;

    /* renamed from: d */
    public p123e1.C1344r f5528d;

    /* renamed from: e */
    public boolean f5529e;

    /* renamed from: l */
    public long f5536l;

    /* renamed from: f */
    public final boolean[] f5530f = new boolean[3];

    /* renamed from: g */
    public final p102a0.C0947K f5531g = new p102a0.C0947K(32);

    /* renamed from: h */
    public final p102a0.C0947K f5532h = new p102a0.C0947K(33);

    /* renamed from: i */
    public final p102a0.C0947K f5533i = new p102a0.C0947K(34);

    /* renamed from: j */
    public final p102a0.C0947K f5534j = new p102a0.C0947K(39);

    /* renamed from: k */
    public final p102a0.C0947K f5535k = new p102a0.C0947K(40);

    /* renamed from: m */
    public long f5537m = -9223372036854775807L;

    /* renamed from: n */
    public final p086W.C0798r f5538n = new p086W.C0798r();

    public C1345s(p123e1.C1322D c1322d) {
        this.f5525a = c1322d;
    }

    /* renamed from: a */
    public final void m3107a(byte[] bArr, int i4, int i5) {
        p123e1.C1344r c1344r = this.f5528d;
        if (c1344r.f5517f) {
            int i6 = c1344r.f5515d;
            int i7 = (i4 + 2) - i6;
            if (i7 < i5) {
                c1344r.f5518g = (bArr[i7] & 128) != 0;
                c1344r.f5517f = false;
            } else {
                c1344r.f5515d = (i5 - i4) + i6;
            }
        }
        if (!this.f5529e) {
            this.f5531g.m1864a(bArr, i4, i5);
            this.f5532h.m1864a(bArr, i4, i5);
            this.f5533i.m1864a(bArr, i4, i5);
        }
        this.f5534j.m1864a(bArr, i4, i5);
        this.f5535k.m1864a(bArr, i4, i5);
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        this.f5536l = 0L;
        this.f5537m = -9223372036854775807L;
        p090X.AbstractC0830g.m1665a(this.f5530f);
        this.f5531g.m1867d();
        this.f5532h.m1867d();
        this.f5533i.m1867d();
        this.f5534j.m1867d();
        this.f5535k.m1867d();
        p123e1.C1344r c1344r = this.f5528d;
        if (c1344r != null) {
            c1344r.f5517f = false;
            c1344r.f5518g = false;
            c1344r.f5519h = false;
            c1344r.f5520i = false;
            c1344r.f5521j = false;
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
    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3090d(p086W.C0798r r38) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1345s.mo3090d(W.r):void");
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
        p086W.AbstractC0781a.m1422k(this.f5527c);
        int i4 = p086W.AbstractC0805y.f2801a;
        if (z4) {
            p123e1.C1344r c1344r = this.f5528d;
            long j4 = this.f5536l;
            c1344r.f5524m = c1344r.f5514c;
            c1344r.m3106a((int) (j4 - c1344r.f5513b));
            c1344r.f5522k = c1344r.f5513b;
            c1344r.f5513b = j4;
            c1344r.m3106a(0);
            c1344r.f5520i = false;
        }
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        c1325g.m3084a();
        c1325g.m3086c();
        this.f5526b = (java.lang.String) c1325g.f5333e;
        c1325g.m3086c();
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(c1325g.f5331c, 2);
        this.f5527c = mo640v;
        this.f5528d = new p123e1.C1344r(mo640v);
        this.f5525a.m3083b(interfaceC2405q, c1325g);
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        this.f5537m = j4;
    }
}
