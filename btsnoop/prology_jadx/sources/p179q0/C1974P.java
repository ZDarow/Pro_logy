package p179q0;

/* renamed from: q0.P */
/* loaded from: classes.dex */
public final class C1974P implements p197u0.InterfaceC2224k {

    /* renamed from: m */
    public final android.net.Uri f7995m;

    /* renamed from: n */
    public final p094Y.C0859B f7996n;

    /* renamed from: o */
    public final android.support.v4.media.session.C1061t f7997o;

    /* renamed from: p */
    public final p179q0.C1977T f7998p;

    /* renamed from: q */
    public final p078T2.C0737n f7999q;

    /* renamed from: s */
    public volatile boolean f8001s;

    /* renamed from: u */
    public long f8003u;

    /* renamed from: w */
    public p215y0.InterfaceC2387F f8005w;

    /* renamed from: x */
    public boolean f8006x;

    /* renamed from: y */
    public final /* synthetic */ p179q0.C1977T f8007y;

    /* renamed from: r */
    public final p076T.C0706t f8000r = new java.lang.Object();

    /* renamed from: t */
    public boolean f8002t = true;

    /* renamed from: l */
    public final long f7994l = p179q0.C2019x.f8237b.getAndIncrement();

    /* renamed from: v */
    public p094Y.C0874l f8004v = m3988a(0);

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, T.t] */
    public C1974P(p179q0.C1977T c1977t, android.net.Uri uri, p094Y.InterfaceC0870h interfaceC0870h, android.support.v4.media.session.C1061t c1061t, p179q0.C1977T c1977t2, p078T2.C0737n c0737n) {
        this.f8007y = c1977t;
        this.f7995m = uri;
        this.f7996n = new p094Y.C0859B(interfaceC0870h);
        this.f7997o = c1061t;
        this.f7998p = c1977t2;
        this.f7999q = c0737n;
    }

    /* renamed from: a */
    public final p094Y.C0874l m3988a(long j4) {
        java.util.Collections.emptyMap();
        this.f8007y.getClass();
        java.util.Map map = p179q0.C1977T.f8012Y;
        android.net.Uri uri = this.f7995m;
        p086W.AbstractC0781a.m1423l(uri, "The uri must be set.");
        return new p094Y.C0874l(uri, 1, null, map, j4, -1L, null, 6);
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        p094Y.InterfaceC0870h interfaceC0870h;
        p215y0.InterfaceC2403o interfaceC2403o;
        int i4;
        int i5 = 0;
        while (i5 == 0 && !this.f8001s) {
            try {
                long j4 = this.f8000r.f2437a;
                p094Y.C0874l m3988a = m3988a(j4);
                this.f8004v = m3988a;
                long mo1686b = this.f7996n.mo1686b(m3988a);
                if (this.f8001s) {
                    if (i5 != 1 && this.f7997o.m2224f0() != -1) {
                        this.f8000r.f2437a = this.f7997o.m2224f0();
                    }
                    p101a.AbstractC0936a.m1805m(this.f7996n);
                    return;
                }
                if (mo1686b != -1) {
                    mo1686b += j4;
                    p179q0.C1977T c1977t = this.f8007y;
                    c1977t.f8014A.post(new p179q0.RunnableC1972N(c1977t, 0));
                }
                long j5 = mo1686b;
                this.f8007y.f8016C = p045L0.C0355b.m802d(this.f7996n.f3089l.mo1689y());
                p094Y.C0859B c0859b = this.f7996n;
                p045L0.C0355b c0355b = this.f8007y.f8016C;
                if (c0355b == null || (i4 = c0355b.f1088q) == -1) {
                    interfaceC0870h = c0859b;
                } else {
                    interfaceC0870h = new p179q0.C2018w(c0859b, i4, this);
                    p179q0.C1977T c1977t2 = this.f8007y;
                    c1977t2.getClass();
                    p215y0.InterfaceC2387F m3991C = c1977t2.m3991C(new p179q0.C1976S(0, true));
                    this.f8005w = m3991C;
                    m3991C.mo1407c(p179q0.C1977T.f8013Z);
                }
                long j6 = j4;
                this.f7997o.m2234m0(interfaceC0870h, this.f7995m, this.f7996n.f3089l.mo1689y(), j4, j5, this.f7998p);
                if (this.f8007y.f8016C != null && (interfaceC2403o = (p215y0.InterfaceC2403o) this.f7997o.f3862n) != null) {
                    p215y0.InterfaceC2403o mo1404d = interfaceC2403o.mo1404d();
                    if (mo1404d instanceof p069R0.C0574d) {
                        ((p069R0.C0574d) mo1404d).f1801r = true;
                    }
                }
                if (this.f8002t) {
                    android.support.v4.media.session.C1061t c1061t = this.f7997o;
                    long j7 = this.f8003u;
                    p215y0.InterfaceC2403o interfaceC2403o2 = (p215y0.InterfaceC2403o) c1061t.f3862n;
                    interfaceC2403o2.getClass();
                    interfaceC2403o2.mo34b(j6, j7);
                    this.f8002t = false;
                }
                while (true) {
                    long j8 = j6;
                    while (i5 == 0 && !this.f8001s) {
                        try {
                            p078T2.C0737n c0737n = this.f7999q;
                            synchronized (c0737n) {
                                while (!c0737n.f2542a) {
                                    c0737n.wait();
                                }
                            }
                            android.support.v4.media.session.C1061t c1061t2 = this.f7997o;
                            p076T.C0706t c0706t = this.f8000r;
                            p215y0.InterfaceC2403o interfaceC2403o3 = (p215y0.InterfaceC2403o) c1061t2.f3862n;
                            interfaceC2403o3.getClass();
                            p215y0.C2400l c2400l = (p215y0.C2400l) c1061t2.f3863o;
                            c2400l.getClass();
                            i5 = interfaceC2403o3.mo37l(c2400l, c0706t);
                            j6 = this.f7997o.m2224f0();
                            if (j6 > this.f8007y.f8046t + j8) {
                                break;
                            }
                        } catch (java.lang.InterruptedException unused) {
                            throw new java.io.InterruptedIOException();
                        }
                    }
                    this.f7999q.m1326a();
                    p179q0.C1977T c1977t3 = this.f8007y;
                    c1977t3.f8014A.post(c1977t3.f8052z);
                }
                if (i5 == 1) {
                    i5 = 0;
                } else if (this.f7997o.m2224f0() != -1) {
                    this.f8000r.f2437a = this.f7997o.m2224f0();
                }
                p101a.AbstractC0936a.m1805m(this.f7996n);
            } catch (java.lang.Throwable th) {
                if (i5 != 1 && this.f7997o.m2224f0() != -1) {
                    this.f8000r.f2437a = this.f7997o.m2224f0();
                }
                p101a.AbstractC0936a.m1805m(this.f7996n);
                throw th;
            }
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
        this.f8001s = true;
    }
}
