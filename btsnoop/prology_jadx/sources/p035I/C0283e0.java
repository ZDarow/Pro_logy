package p035I;

/* renamed from: I.e0 */
/* loaded from: classes.dex */
public final class C0283e0 implements p110b3.InterfaceC1193g {

    /* renamed from: l */
    public final p035I.C0283e0 f842l;

    /* renamed from: m */
    public final p035I.C0265Q f843m;

    public C0283e0(p035I.C0283e0 c0283e0, p035I.C0265Q c0265q) {
        p154k3.AbstractC1803h.m3779e(c0265q, "instance");
        this.f842l = c0283e0;
        this.f843m = c0265q;
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: c */
    public final p110b3.InterfaceC1195i mo676c(p110b3.InterfaceC1195i interfaceC1195i) {
        return p101a.AbstractC0936a.m1772J(this, interfaceC1195i);
    }

    /* renamed from: d */
    public final void m677d(p035I.C0265Q c0265q) {
        if (this.f843m == c0265q) {
            throw new java.lang.IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        p035I.C0283e0 c0283e0 = this.f842l;
        if (c0283e0 != null) {
            c0283e0.m677d(c0265q);
        }
    }

    @Override // p110b3.InterfaceC1193g
    public final p110b3.InterfaceC1194h getKey() {
        return p035I.C0281d0.f837l;
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: j */
    public final p110b3.InterfaceC1193g mo678j(p110b3.InterfaceC1194h interfaceC1194h) {
        return p101a.AbstractC0936a.m1817y(this, interfaceC1194h);
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: k */
    public final java.lang.Object mo679k(java.lang.Object obj, p149j3.InterfaceC1741p interfaceC1741p) {
        return interfaceC1741p.mo502h(obj, this);
    }

    @Override // p110b3.InterfaceC1195i
    /* renamed from: m */
    public final p110b3.InterfaceC1195i mo680m(p110b3.InterfaceC1194h interfaceC1194h) {
        return p101a.AbstractC0936a.m1770H(this, interfaceC1194h);
    }
}
