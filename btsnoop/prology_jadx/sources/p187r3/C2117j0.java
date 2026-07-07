package p187r3;

/* renamed from: r3.j0 */
/* loaded from: classes.dex */
public final class C2117j0 extends p209w3.C2358t {

    /* renamed from: p */
    public final java.lang.ThreadLocal f8477p;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2117j0(p110b3.InterfaceC1190d r3, p110b3.InterfaceC1195i r4) {
        /*
            r2 = this;
            r3.k0 r0 = p187r3.C2119k0.f8478l
            b3.g r1 = r4.mo678j(r0)
            if (r1 != 0) goto Ld
            b3.i r0 = r4.mo676c(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8477p = r0
            b3.i r3 = r3.mo2835f()
            b3.e r0 = p110b3.C1191e.f4622l
            b3.g r3 = r3.mo678j(r0)
            boolean r3 = r3 instanceof p187r3.AbstractC2128s
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = p209w3.AbstractC2339a.m4550m(r4, r3)
            p209w3.AbstractC2339a.m4545h(r4, r3)
            r2.m4238Y(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p187r3.C2117j0.<init>(b3.d, b3.i):void");
    }

    /* renamed from: X */
    public final boolean m4237X() {
        boolean z4 = this.threadLocalIsSet && this.f8477p.get() == null;
        this.f8477p.remove();
        return !z4;
    }

    /* renamed from: Y */
    public final void m4238Y(p110b3.InterfaceC1195i interfaceC1195i, java.lang.Object obj) {
        this.threadLocalIsSet = true;
        this.f8477p.set(new p100Z2.C0929b(interfaceC1195i, obj));
    }

    @Override // p209w3.C2358t, p187r3.C2097Z
    /* renamed from: r */
    public final void mo4203r(java.lang.Object obj) {
        if (this.threadLocalIsSet) {
            p100Z2.C0929b c0929b = (p100Z2.C0929b) this.f8477p.get();
            if (c0929b != null) {
                p209w3.AbstractC2339a.m4545h((p110b3.InterfaceC1195i) c0929b.f3291l, c0929b.f3292m);
            }
            this.f8477p.remove();
        }
        java.lang.Object m4249h = p187r3.AbstractC2131v.m4249h(obj);
        p110b3.InterfaceC1190d interfaceC1190d = this.f9306o;
        p110b3.InterfaceC1195i mo2835f = interfaceC1190d.mo2835f();
        java.lang.Object m4550m = p209w3.AbstractC2339a.m4550m(mo2835f, null);
        p187r3.C2117j0 m4254m = m4550m != p209w3.AbstractC2339a.f9271f ? p187r3.AbstractC2131v.m4254m(interfaceC1190d, mo2835f, m4550m) : null;
        try {
            this.f9306o.mo2836i(m4249h);
        } finally {
            if (m4254m == null || m4254m.m4237X()) {
                p209w3.AbstractC2339a.m4545h(mo2835f, m4550m);
            }
        }
    }
}
