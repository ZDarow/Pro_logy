package p197u0;

/* renamed from: u0.q */
/* loaded from: classes.dex */
public final class C2230q implements p197u0.InterfaceC2224k {

    /* renamed from: l */
    public final long f8887l;

    /* renamed from: m */
    public final p094Y.C0874l f8888m;

    /* renamed from: n */
    public final int f8889n;

    /* renamed from: o */
    public final p094Y.C0859B f8890o;

    /* renamed from: p */
    public final p197u0.InterfaceC2229p f8891p;

    /* renamed from: q */
    public volatile java.lang.Object f8892q;

    public C2230q(p094Y.InterfaceC0870h interfaceC0870h, android.net.Uri uri, int i4, p197u0.InterfaceC2229p interfaceC2229p) {
        java.util.Map emptyMap = java.util.Collections.emptyMap();
        p086W.AbstractC0781a.m1423l(uri, "The uri must be set.");
        p094Y.C0874l c0874l = new p094Y.C0874l(uri, 1, null, emptyMap, 0L, -1L, null, 1);
        this.f8890o = new p094Y.C0859B(interfaceC0870h);
        this.f8888m = c0874l;
        this.f8889n = i4;
        this.f8891p = interfaceC2229p;
        this.f8887l = p179q0.C2019x.f8237b.getAndIncrement();
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: b */
    public final void mo3266b() {
        this.f8890o.f3090m = 0L;
        p094Y.C0872j c0872j = new p094Y.C0872j(this.f8890o, this.f8888m);
        try {
            c0872j.m1694a();
            android.net.Uri mo1687o = this.f8890o.f3089l.mo1687o();
            mo1687o.getClass();
            this.f8892q = this.f8891p.mo601p(mo1687o, c0872j);
        } finally {
            p086W.AbstractC0805y.m1613h(c0872j);
        }
    }

    @Override // p197u0.InterfaceC2224k
    /* renamed from: c */
    public final void mo3267c() {
    }
}
