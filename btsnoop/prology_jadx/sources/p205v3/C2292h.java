package p205v3;

/* renamed from: v3.h */
/* loaded from: classes.dex */
public final class C2292h extends p205v3.AbstractC2290f {

    /* renamed from: o */
    public final p200u3.InterfaceC2250d f9082o;

    public C2292h(p200u3.InterfaceC2250d interfaceC2250d, p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5) {
        super(interfaceC1195i, i4, i5);
        this.f9082o = interfaceC2250d;
    }

    @Override // p205v3.AbstractC2290f, p200u3.InterfaceC2250d
    /* renamed from: C */
    public final java.lang.Object mo266C(p200u3.InterfaceC2251e interfaceC2251e, p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object mo266C;
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        int i4 = this.f9077m;
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        if (i4 == -3) {
            p110b3.InterfaceC1195i mo2835f = interfaceC1190d.mo2835f();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            p187r3.C2125p c2125p = p187r3.C2125p.f8489o;
            p110b3.InterfaceC1195i interfaceC1195i = this.f9076l;
            p110b3.InterfaceC1195i mo676c = !((java.lang.Boolean) interfaceC1195i.mo679k(bool, c2125p)).booleanValue() ? mo2835f.mo676c(interfaceC1195i) : p187r3.AbstractC2131v.m4242a(mo2835f, interfaceC1195i, false);
            if (p154k3.AbstractC1803h.m3775a(mo676c, mo2835f)) {
                mo266C = this.f9082o.mo266C(interfaceC2251e, interfaceC1190d);
                if (mo266C != enumC1252a) {
                    mo266C = c0934g;
                }
                if (mo266C != enumC1252a) {
                    return c0934g;
                }
            } else {
                p110b3.C1191e c1191e = p110b3.C1191e.f4622l;
                if (p154k3.AbstractC1803h.m3775a(mo676c.mo678j(c1191e), mo2835f.mo678j(c1191e))) {
                    p110b3.InterfaceC1195i mo2835f2 = interfaceC1190d.mo2835f();
                    if (!(interfaceC2251e instanceof p205v3.C2302r)) {
                        interfaceC2251e = new p071R2.C0612r(interfaceC2251e, mo2835f2);
                    }
                    mo266C = p205v3.AbstractC2296l.m4484b(mo676c, interfaceC2251e, p209w3.AbstractC2339a.m4549l(mo676c), new p205v3.C2291g(this, null), interfaceC1190d);
                    if (mo266C != enumC1252a) {
                        mo266C = c0934g;
                    }
                    if (mo266C != enumC1252a) {
                        return c0934g;
                    }
                }
            }
            return mo266C;
        }
        mo266C = super.mo266C(interfaceC2251e, interfaceC1190d);
        if (mo266C != enumC1252a) {
            return c0934g;
        }
        return mo266C;
    }

    @Override // p205v3.AbstractC2290f
    /* renamed from: a */
    public final java.lang.Object mo4445a(p195t3.InterfaceC2202o interfaceC2202o, p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object mo266C = this.f9082o.mo266C(new p205v3.C2302r(interfaceC2202o), interfaceC1190d);
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        if (mo266C != enumC1252a) {
            mo266C = c0934g;
        }
        return mo266C == enumC1252a ? mo266C : c0934g;
    }

    @Override // p205v3.AbstractC2290f
    /* renamed from: b */
    public final p205v3.AbstractC2290f mo4446b(p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5) {
        return new p205v3.C2292h(this.f9082o, interfaceC1195i, i4, i5);
    }

    @Override // p205v3.AbstractC2290f
    public final java.lang.String toString() {
        return this.f9082o + " -> " + super.toString();
    }
}
