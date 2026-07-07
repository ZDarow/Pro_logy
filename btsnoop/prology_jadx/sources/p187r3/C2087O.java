package p187r3;

/* renamed from: r3.O */
/* loaded from: classes.dex */
public final class C2087O extends p187r3.AbstractC2092U {

    /* renamed from: p */
    public final /* synthetic */ int f8441p;

    /* renamed from: q */
    public final java.lang.Object f8442q;

    public /* synthetic */ C2087O(int i4, java.lang.Object obj) {
        this.f8441p = i4;
        this.f8442q = obj;
    }

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ java.lang.Object mo661b(java.lang.Object obj) {
        switch (this.f8441p) {
            case 0:
                mo4168o((java.lang.Throwable) obj);
                return p100Z2.C0934g.f3298a;
            default:
                mo4168o((java.lang.Throwable) obj);
                return p100Z2.C0934g.f3298a;
        }
    }

    @Override // p187r3.AbstractC2092U
    /* renamed from: o */
    public final void mo4168o(java.lang.Throwable th) {
        switch (this.f8441p) {
            case 0:
                ((p149j3.InterfaceC1737l) this.f8442q).mo661b(th);
                return;
            default:
                java.lang.Object m4187E = m4173n().m4187E();
                boolean z4 = m4187E instanceof p187r3.C2123n;
                p187r3.C2093V c2093v = (p187r3.C2093V) this.f8442q;
                if (z4) {
                    c2093v.mo2836i(p176p1.AbstractC1949a.m3942s(((p187r3.C2123n) m4187E).f8485a));
                    return;
                } else {
                    c2093v.mo2836i(p187r3.AbstractC2131v.m4253l(m4187E));
                    return;
                }
        }
    }
}
