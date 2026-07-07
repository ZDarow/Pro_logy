package p179q0;

/* renamed from: q0.Q */
/* loaded from: classes.dex */
public final class C1975Q implements p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public final int f8008l;

    /* renamed from: m */
    public final /* synthetic */ p179q0.C1977T f8009m;

    public C1975Q(p179q0.C1977T c1977t, int i4) {
        this.f8009m = c1977t;
        this.f8008l = i4;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
        p179q0.C1977T c1977t = this.f8009m;
        c1977t.f8017D[this.f8008l].m4025u();
        int m4286e = c1977t.f8041o.m4286e(c1977t.f8027N);
        p197u0.C2227n c2227n = c1977t.f8048v;
        java.io.IOException iOException = c2227n.f8886n;
        if (iOException != null) {
            throw iOException;
        }
        p197u0.HandlerC2223j handlerC2223j = c2227n.f8885m;
        if (handlerC2223j != null) {
            if (m4286e == Integer.MIN_VALUE) {
                m4286e = handlerC2223j.f8871l;
            }
            java.io.IOException iOException2 = handlerC2223j.f8875p;
            if (iOException2 != null && handlerC2223j.f8876q > m4286e) {
                throw iOException2;
            }
        }
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        p179q0.C1977T c1977t = this.f8009m;
        return !c1977t.m3993E() && c1977t.f8017D[this.f8008l].m4023s(c1977t.f8036W);
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    public final int mo58n(long j4) {
        p179q0.C1977T c1977t = this.f8009m;
        if (c1977t.m3993E()) {
            return 0;
        }
        int i4 = this.f8008l;
        c1977t.m3989A(i4);
        p179q0.C1983Z c1983z = c1977t.f8017D[i4];
        int m4020p = c1983z.m4020p(j4, c1977t.f8036W);
        c1983z.m4009C(m4020p);
        if (m4020p != 0) {
            return m4020p;
        }
        c1977t.m3990B(i4);
        return m4020p;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        p179q0.C1977T c1977t = this.f8009m;
        if (c1977t.m3993E()) {
            return -3;
        }
        int i5 = this.f8008l;
        c1977t.m3989A(i5);
        int m4028x = c1977t.f8017D[i5].m4028x(c0886x, c0921f, i4, c1977t.f8036W);
        if (m4028x == -3) {
            c1977t.m3990B(i5);
        }
        return m4028x;
    }
}
