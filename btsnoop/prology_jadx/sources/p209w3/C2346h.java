package p209w3;

/* renamed from: w3.h */
/* loaded from: classes.dex */
public final class C2346h extends p187r3.AbstractC2073A implements p120d3.InterfaceC1293c, p110b3.InterfaceC1190d {

    /* renamed from: s */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f9279s = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p209w3.C2346h.class, java.lang.Object.class, "_reusableCancellableContinuation");
    private volatile java.lang.Object _reusableCancellableContinuation;

    /* renamed from: o */
    public final p187r3.AbstractC2128s f9280o;

    /* renamed from: p */
    public final p120d3.AbstractC1292b f9281p;

    /* renamed from: q */
    public java.lang.Object f9282q;

    /* renamed from: r */
    public final java.lang.Object f9283r;

    public C2346h(p187r3.AbstractC2128s abstractC2128s, p120d3.AbstractC1292b abstractC1292b) {
        super(-1);
        this.f9280o = abstractC2128s;
        this.f9281p = abstractC1292b;
        this.f9282q = p209w3.AbstractC2339a.f9268c;
        this.f9283r = p209w3.AbstractC2339a.m4549l(abstractC1292b.mo2835f());
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: b */
    public final void mo4149b(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException) {
        if (obj instanceof p187r3.C2124o) {
            ((p187r3.C2124o) obj).f8487b.mo661b(cancellationException);
        }
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: c */
    public final p110b3.InterfaceC1190d mo4150c() {
        return this;
    }

    @Override // p120d3.InterfaceC1293c
    /* renamed from: d */
    public final p120d3.InterfaceC1293c mo3030d() {
        p120d3.AbstractC1292b abstractC1292b = this.f9281p;
        if (abstractC1292b != null) {
            return abstractC1292b;
        }
        return null;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: f */
    public final p110b3.InterfaceC1195i mo2835f() {
        return this.f9281p.mo2835f();
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: i */
    public final void mo2836i(java.lang.Object obj) {
        p120d3.AbstractC1292b abstractC1292b = this.f9281p;
        p110b3.InterfaceC1195i mo2835f = abstractC1292b.mo2835f();
        java.lang.Throwable m1761a = p100Z2.AbstractC0931d.m1761a(obj);
        java.lang.Object c2123n = m1761a == null ? obj : new p187r3.C2123n(m1761a, false);
        p187r3.AbstractC2128s abstractC2128s = this.f9280o;
        if (abstractC2128s.mo4241f()) {
            this.f9282q = c2123n;
            this.f8424n = 0;
            abstractC2128s.mo4159e(mo2835f, this);
            return;
        }
        p187r3.AbstractC2080H m4236a = p187r3.AbstractC2113h0.m4236a();
        if (m4236a.f8433n >= 4294967296L) {
            this.f9282q = c2123n;
            this.f8424n = 0;
            p105a3.C1019b c1019b = m4236a.f8435p;
            if (c1019b == null) {
                c1019b = new p105a3.C1019b();
                m4236a.f8435p = c1019b;
            }
            c1019b.addLast(this);
            return;
        }
        m4236a.m4166i(true);
        try {
            p110b3.InterfaceC1195i mo2835f2 = abstractC1292b.mo2835f();
            java.lang.Object m4550m = p209w3.AbstractC2339a.m4550m(mo2835f2, this.f9283r);
            try {
                abstractC1292b.mo2836i(obj);
                do {
                } while (m4236a.m4167n());
            } finally {
                p209w3.AbstractC2339a.m4545h(mo2835f2, m4550m);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // p187r3.AbstractC2073A
    /* renamed from: j */
    public final java.lang.Object mo4154j() {
        java.lang.Object obj = this.f9282q;
        this.f9282q = p209w3.AbstractC2339a.f9268c;
        return obj;
    }

    public final java.lang.String toString() {
        return "DispatchedContinuation[" + this.f9280o + ", " + p187r3.AbstractC2131v.m4252k(this.f9281p) + ']';
    }
}
