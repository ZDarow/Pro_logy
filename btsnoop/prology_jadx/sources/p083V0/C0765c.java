package p083V0;

/* renamed from: V0.c */
/* loaded from: classes.dex */
public final class C0765c extends p098Z.AbstractC0922g implements p083V0.InterfaceC0766d {

    /* renamed from: p */
    public p083V0.InterfaceC0766d f2694p;

    /* renamed from: q */
    public long f2695q;

    /* renamed from: r */
    public final /* synthetic */ int f2696r = 1;

    /* renamed from: s */
    public java.lang.Object f2697s;

    public /* synthetic */ C0765c() {
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: B */
    public final long mo654B(int i4) {
        p083V0.InterfaceC0766d interfaceC0766d = this.f2694p;
        interfaceC0766d.getClass();
        return interfaceC0766d.mo654B(i4) + this.f2695q;
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: Q */
    public final int mo655Q() {
        p083V0.InterfaceC0766d interfaceC0766d = this.f2694p;
        interfaceC0766d.getClass();
        return interfaceC0766d.mo655Q();
    }

    @Override // p098Z.AbstractC0922g
    /* renamed from: e */
    public final void mo1398e() {
        super.mo1398e();
        this.f2694p = null;
    }

    @Override // p098Z.AbstractC0922g
    /* renamed from: f */
    public final void mo1399f() {
        switch (this.f2696r) {
            case 0:
                ((p141i0.C1529b) this.f2697s).m3399k(this);
                return;
            default:
                p009B2.C0067x c0067x = (p009B2.C0067x) this.f2697s;
                c0067x.getClass();
                p087W0.AbstractC0814i abstractC0814i = (p087W0.AbstractC0814i) c0067x.f219m;
                abstractC0814i.getClass();
                mo1398e();
                abstractC0814i.f2901b.add(this);
                return;
        }
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: g */
    public final int mo657g(long j4) {
        p083V0.InterfaceC0766d interfaceC0766d = this.f2694p;
        interfaceC0766d.getClass();
        return interfaceC0766d.mo657g(j4 - this.f2695q);
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: w */
    public final java.util.List mo658w(long j4) {
        p083V0.InterfaceC0766d interfaceC0766d = this.f2694p;
        interfaceC0766d.getClass();
        return interfaceC0766d.mo658w(j4 - this.f2695q);
    }

    public C0765c(p141i0.C1529b c1529b) {
        this.f2697s = c1529b;
    }
}
