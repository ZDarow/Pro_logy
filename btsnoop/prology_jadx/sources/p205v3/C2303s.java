package p205v3;

/* renamed from: v3.s */
/* loaded from: classes.dex */
public final class C2303s implements p110b3.InterfaceC1190d, p120d3.InterfaceC1293c {

    /* renamed from: l */
    public final p110b3.InterfaceC1190d f9097l;

    /* renamed from: m */
    public final p110b3.InterfaceC1195i f9098m;

    public C2303s(p110b3.InterfaceC1190d interfaceC1190d, p110b3.InterfaceC1195i interfaceC1195i) {
        this.f9097l = interfaceC1190d;
        this.f9098m = interfaceC1195i;
    }

    @Override // p120d3.InterfaceC1293c
    /* renamed from: d */
    public final p120d3.InterfaceC1293c mo3030d() {
        p110b3.InterfaceC1190d interfaceC1190d = this.f9097l;
        if (interfaceC1190d instanceof p120d3.InterfaceC1293c) {
            return (p120d3.InterfaceC1293c) interfaceC1190d;
        }
        return null;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: f */
    public final p110b3.InterfaceC1195i mo2835f() {
        return this.f9098m;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: i */
    public final void mo2836i(java.lang.Object obj) {
        this.f9097l.mo2836i(obj);
    }
}
