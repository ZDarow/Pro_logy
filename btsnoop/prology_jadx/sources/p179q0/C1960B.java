package p179q0;

/* renamed from: q0.B */
/* loaded from: classes.dex */
public final class C1960B extends p179q0.AbstractC2007l0 {

    /* renamed from: A */
    public p179q0.C2020y f7952A;

    /* renamed from: B */
    public boolean f7953B;

    /* renamed from: C */
    public boolean f7954C;

    /* renamed from: D */
    public boolean f7955D;

    /* renamed from: w */
    public final boolean f7956w;

    /* renamed from: x */
    public final p076T.C0676T f7957x;

    /* renamed from: y */
    public final p076T.C0675S f7958y;

    /* renamed from: z */
    public p179q0.C2021z f7959z;

    public C1960B(p179q0.AbstractC1984a abstractC1984a, boolean z4) {
        super(abstractC1984a);
        this.f7956w = z4 && abstractC1984a.mo4037i();
        this.f7957x = new p076T.C0676T();
        this.f7958y = new p076T.C0675S();
        p076T.AbstractC0677U mo4036g = abstractC1984a.mo4036g();
        if (mo4036g == null) {
            this.f7959z = new p179q0.C2021z(new p179q0.C1959A(abstractC1984a.mo2976h()), p076T.C0676T.f2230q, p179q0.C2021z.f8246e);
        } else {
            this.f7959z = new p179q0.C2021z(mo4036g, null, null);
            this.f7955D = true;
        }
    }

    @Override // p179q0.AbstractC2007l0
    /* renamed from: B */
    public final p179q0.C1964F mo3962B(p179q0.C1964F c1964f) {
        java.lang.Object obj = c1964f.f7960a;
        java.lang.Object obj2 = this.f7959z.f8248d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = p179q0.C2021z.f8246e;
        }
        return c1964f.m3967a(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00cc  */
    @Override // p179q0.AbstractC2007l0
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3963C(p076T.AbstractC0677U r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p179q0.C1960B.mo3963C(T.U):void");
    }

    @Override // p179q0.AbstractC2007l0
    /* renamed from: D */
    public final void mo3964D() {
        if (this.f7956w) {
            return;
        }
        this.f7953B = true;
        m4049A(null, this.f8189v);
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final p179q0.C2020y mo2975b(p179q0.C1964F c1964f, p197u0.C2218e c2218e, long j4) {
        p179q0.C2020y c2020y = new p179q0.C2020y(c1964f, c2218e, j4);
        p086W.AbstractC0781a.m1421j(c2020y.f8242o == null);
        p179q0.AbstractC1984a abstractC1984a = this.f8189v;
        c2020y.f8242o = abstractC1984a;
        if (this.f7954C) {
            java.lang.Object obj = this.f7959z.f8248d;
            java.lang.Object obj2 = c1964f.f7960a;
            if (obj != null && obj2.equals(p179q0.C2021z.f8246e)) {
                obj2 = this.f7959z.f8248d;
            }
            c2020y.m4069a(c1964f.m3967a(obj2));
        } else {
            this.f7952A = c2020y;
            if (!this.f7953B) {
                this.f7953B = true;
                m4049A(null, abstractC1984a);
            }
        }
        return c2020y;
    }

    /* renamed from: F */
    public final boolean m3966F(long j4) {
        p179q0.C2020y c2020y = this.f7952A;
        int mo1231b = this.f7959z.mo1231b(c2020y.f8239l.f7960a);
        if (mo1231b == -1) {
            return false;
        }
        p179q0.C2021z c2021z = this.f7959z;
        p076T.C0675S c0675s = this.f7958y;
        c2021z.mo1232f(mo1231b, c0675s, false);
        long j5 = c0675s.f2226d;
        if (j5 != -9223372036854775807L && j4 >= j5) {
            j4 = java.lang.Math.max(0L, j5 - 1);
        }
        c2020y.f8245r = j4;
        return true;
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: j */
    public final void mo2977j() {
    }

    @Override // p179q0.AbstractC1984a
    /* renamed from: o */
    public final void mo2979o(p179q0.InterfaceC1962D interfaceC1962D) {
        p179q0.C2020y c2020y = (p179q0.C2020y) interfaceC1962D;
        if (c2020y.f8243p != null) {
            p179q0.AbstractC1984a abstractC1984a = c2020y.f8242o;
            abstractC1984a.getClass();
            abstractC1984a.mo2979o(c2020y.f8243p);
        }
        if (interfaceC1962D == this.f7952A) {
            this.f7952A = null;
        }
    }

    @Override // p179q0.AbstractC2002j, p179q0.AbstractC1984a
    /* renamed from: r */
    public final void mo2980r() {
        this.f7954C = false;
        this.f7953B = false;
        super.mo2980r();
    }

    @Override // p179q0.AbstractC2007l0, p179q0.AbstractC1984a
    /* renamed from: u */
    public final void mo2981u(p076T.C0659B c0659b) {
        if (this.f7955D) {
            p179q0.C2021z c2021z = this.f7959z;
            this.f7959z = new p179q0.C2021z(new p102a0.C0981j0(this.f7959z.f8231b, c0659b), c2021z.f8247c, c2021z.f8248d);
        } else {
            this.f7959z = new p179q0.C2021z(new p179q0.C1959A(c0659b), p076T.C0676T.f2230q, p179q0.C2021z.f8246e);
        }
        this.f8189v.mo2981u(c0659b);
    }
}
