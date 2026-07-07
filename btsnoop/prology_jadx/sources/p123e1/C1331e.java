package p123e1;

/* renamed from: e1.e */
/* loaded from: classes.dex */
public final class C1331e implements p123e1.InterfaceC1335i {

    /* renamed from: w */
    public static final byte[] f5366w = {73, 68, 51};

    /* renamed from: a */
    public final boolean f5367a;

    /* renamed from: d */
    public final java.lang.String f5370d;

    /* renamed from: e */
    public final int f5371e;

    /* renamed from: f */
    public java.lang.String f5372f;

    /* renamed from: g */
    public p215y0.InterfaceC2387F f5373g;

    /* renamed from: h */
    public p215y0.InterfaceC2387F f5374h;

    /* renamed from: l */
    public boolean f5378l;

    /* renamed from: m */
    public boolean f5379m;

    /* renamed from: p */
    public int f5382p;

    /* renamed from: q */
    public boolean f5383q;

    /* renamed from: s */
    public int f5385s;

    /* renamed from: u */
    public p215y0.InterfaceC2387F f5387u;

    /* renamed from: v */
    public long f5388v;

    /* renamed from: b */
    public final p086W.C0797q f5368b = new p086W.C0797q(new byte[7], 7);

    /* renamed from: c */
    public final p086W.C0798r f5369c = new p086W.C0798r(java.util.Arrays.copyOf(f5366w, 10));

    /* renamed from: i */
    public int f5375i = 0;

    /* renamed from: j */
    public int f5376j = 0;

    /* renamed from: k */
    public int f5377k = 256;

    /* renamed from: n */
    public int f5380n = -1;

    /* renamed from: o */
    public int f5381o = -1;

    /* renamed from: r */
    public long f5384r = -9223372036854775807L;

    /* renamed from: t */
    public long f5386t = -9223372036854775807L;

    public C1331e(int i4, java.lang.String str, boolean z4) {
        this.f5367a = z4;
        this.f5370d = str;
        this.f5371e = i4;
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        this.f5386t = -9223372036854775807L;
        this.f5379m = false;
        this.f5375i = 0;
        this.f5376j = 0;
        this.f5377k = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f7  */
    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3090d(p086W.C0798r r24) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1331e.mo3090d(W.r):void");
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        c1325g.m3084a();
        c1325g.m3086c();
        this.f5372f = (java.lang.String) c1325g.f5333e;
        c1325g.m3086c();
        p215y0.InterfaceC2387F mo640v = interfaceC2405q.mo640v(c1325g.f5331c, 1);
        this.f5373g = mo640v;
        this.f5387u = mo640v;
        if (!this.f5367a) {
            this.f5374h = new p215y0.C2402n();
            return;
        }
        c1325g.m3084a();
        c1325g.m3086c();
        p215y0.InterfaceC2387F mo640v2 = interfaceC2405q.mo640v(c1325g.f5331c, 5);
        this.f5374h = mo640v2;
        p076T.C0701o c0701o = new p076T.C0701o();
        c1325g.m3086c();
        c0701o.f2359a = (java.lang.String) c1325g.f5333e;
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("application/id3");
        p009B2.AbstractC0051h.m158q(c0701o, mo640v2);
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        this.f5386t = j4;
    }
}
