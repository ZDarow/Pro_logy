package p035I;

/* renamed from: I.z */
/* loaded from: classes.dex */
public final class C0304z implements p200u3.InterfaceC2251e {

    /* renamed from: l */
    public final /* synthetic */ int f917l;

    /* renamed from: m */
    public final /* synthetic */ java.lang.Object f918m;

    public /* synthetic */ C0304z(int i4, java.lang.Object obj) {
        this.f917l = i4;
        this.f918m = obj;
    }

    @Override // p200u3.InterfaceC2251e
    /* renamed from: a */
    public final java.lang.Object mo707a(java.lang.Object obj, p110b3.InterfaceC1190d interfaceC1190d) {
        java.lang.Object m665f;
        switch (this.f917l) {
            case 0:
                p035I.C0265Q c0265q = (p035I.C0265Q) this.f918m;
                boolean z4 = c0265q.f798s.m273h() instanceof p035I.C0266S;
                p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
                return (z4 || (m665f = p035I.C0265Q.m665f(c0265q, true, interfaceC1190d)) != p115c3.EnumC1252a.f4880l) ? c0934g : m665f;
            case 1:
                ((p009B2.C0060q) this.f918m).accept(obj);
                return p100Z2.C0934g.f3298a;
            default:
                ((p154k3.C1811p) this.f918m).f7374l = obj;
                throw new p205v3.C2285a(this);
        }
    }
}
