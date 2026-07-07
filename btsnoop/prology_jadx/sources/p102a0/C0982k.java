package p102a0;

/* renamed from: a0.k */
/* loaded from: classes.dex */
public final class C0982k implements p102a0.InterfaceC0954S {

    /* renamed from: l */
    public final p102a0.C0989n0 f3646l;

    /* renamed from: m */
    public final p102a0.C0950N f3647m;

    /* renamed from: n */
    public p102a0.AbstractC0970e f3648n;

    /* renamed from: o */
    public p102a0.InterfaceC0954S f3649o;

    /* renamed from: p */
    public boolean f3650p = true;

    /* renamed from: q */
    public boolean f3651q;

    public C0982k(p102a0.C0950N c0950n, p086W.C0800t c0800t) {
        this.f3647m = c0950n;
        this.f3646l = new p102a0.C0989n0(c0800t);
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: a */
    public final void mo1931a(p076T.C0668K c0668k) {
        p102a0.InterfaceC0954S interfaceC0954S = this.f3649o;
        if (interfaceC0954S != null) {
            interfaceC0954S.mo1931a(c0668k);
            c0668k = this.f3649o.mo1932b();
        }
        this.f3646l.mo1931a(c0668k);
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: b */
    public final p076T.C0668K mo1932b() {
        p102a0.InterfaceC0954S interfaceC0954S = this.f3649o;
        return interfaceC0954S != null ? interfaceC0954S.mo1932b() : this.f3646l.f3680p;
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: c */
    public final boolean mo1933c() {
        if (this.f3650p) {
            this.f3646l.getClass();
            return false;
        }
        p102a0.InterfaceC0954S interfaceC0954S = this.f3649o;
        interfaceC0954S.getClass();
        return interfaceC0954S.mo1933c();
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: e */
    public final long mo1934e() {
        if (this.f3650p) {
            return this.f3646l.mo1934e();
        }
        p102a0.InterfaceC0954S interfaceC0954S = this.f3649o;
        interfaceC0954S.getClass();
        return interfaceC0954S.mo1934e();
    }
}
