package p179q0;

/* renamed from: q0.i0 */
/* loaded from: classes.dex */
public final class C2001i0 implements p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public final p179q0.InterfaceC1985a0 f8173l;

    /* renamed from: m */
    public final long f8174m;

    public C2001i0(p179q0.InterfaceC1985a0 interfaceC1985a0, long j4) {
        this.f8173l = interfaceC1985a0;
        this.f8174m = j4;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
        this.f8173l.mo49a();
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        return this.f8173l.mo52d();
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public final int mo58n(long j4) {
        return this.f8173l.mo58n(j4 - this.f8174m);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        int mo59o = this.f8173l.mo59o(c0886x, c0921f, i4);
        if (mo59o == -4) {
            c0921f.f3253r += this.f8174m;
        }
        return mo59o;
    }
}
