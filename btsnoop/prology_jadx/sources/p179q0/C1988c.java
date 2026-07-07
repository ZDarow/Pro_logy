package p179q0;

/* renamed from: q0.c */
/* loaded from: classes.dex */
public final class C1988c implements p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public final p179q0.InterfaceC1985a0 f8118l;

    /* renamed from: m */
    public boolean f8119m;

    /* renamed from: n */
    public final /* synthetic */ p179q0.C1990d f8120n;

    public C1988c(p179q0.C1990d c1990d, p179q0.InterfaceC1985a0 interfaceC1985a0) {
        this.f8120n = c1990d;
        this.f8118l = interfaceC1985a0;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
        this.f8118l.mo49a();
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        return !this.f8120n.m4043a() && this.f8118l.mo52d();
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public final int mo58n(long j4) {
        if (this.f8120n.m4043a()) {
            return -3;
        }
        return this.f8118l.mo58n(j4);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        p179q0.C1990d c1990d = this.f8120n;
        if (c1990d.m4043a()) {
            return -3;
        }
        if (this.f8119m) {
            c0921f.f1957m = 4;
            return -4;
        }
        long mo2958h = c1990d.mo2958h();
        int mo59o = this.f8118l.mo59o(c0886x, c0921f, i4);
        if (mo59o != -5) {
            long j4 = c1990d.f8126q;
            if (j4 == Long.MIN_VALUE || ((mo59o != -4 || c0921f.f3253r < j4) && !(mo59o == -3 && mo2958h == Long.MIN_VALUE && !c0921f.f3252q))) {
                return mo59o;
            }
            c0921f.mo1750e();
            c0921f.f1957m = 4;
            this.f8119m = true;
            return -4;
        }
        p076T.C0702p c0702p = (p076T.C0702p) c0886x.f3176n;
        c0702p.getClass();
        int i5 = c0702p.f2389E;
        int i6 = c0702p.f2388D;
        if (i6 != 0 || i5 != 0) {
            if (c1990d.f8125p != 0) {
                i6 = 0;
            }
            if (c1990d.f8126q != Long.MIN_VALUE) {
                i5 = 0;
            }
            p076T.C0701o m1295a = c0702p.m1295a();
            m1295a.f2352C = i6;
            m1295a.f2353D = i5;
            c0886x.f3176n = new p076T.C0702p(m1295a);
        }
        return -5;
    }
}
