package p209w3;

/* renamed from: w3.t */
/* loaded from: classes.dex */
public class C2358t extends p187r3.AbstractC2098a implements p120d3.InterfaceC1293c {

    /* renamed from: o */
    public final p110b3.InterfaceC1190d f9306o;

    public C2358t(p110b3.InterfaceC1190d interfaceC1190d, p110b3.InterfaceC1195i interfaceC1195i) {
        super(interfaceC1195i, true);
        this.f9306o = interfaceC1190d;
    }

    @Override // p187r3.C2097Z
    /* renamed from: J */
    public final boolean mo4192J() {
        return true;
    }

    @Override // p120d3.InterfaceC1293c
    /* renamed from: d */
    public final p120d3.InterfaceC1293c mo3030d() {
        p110b3.InterfaceC1190d interfaceC1190d = this.f9306o;
        if (interfaceC1190d instanceof p120d3.InterfaceC1293c) {
            return (p120d3.InterfaceC1293c) interfaceC1190d;
        }
        return null;
    }

    @Override // p187r3.C2097Z
    /* renamed from: q */
    public void mo4202q(java.lang.Object obj) {
        p209w3.AbstractC2339a.m4546i(p176p1.AbstractC1949a.m3902C(this.f9306o), p187r3.AbstractC2131v.m4249h(obj), null);
    }

    @Override // p187r3.C2097Z
    /* renamed from: r */
    public void mo4203r(java.lang.Object obj) {
        this.f9306o.mo2836i(p187r3.AbstractC2131v.m4249h(obj));
    }
}
