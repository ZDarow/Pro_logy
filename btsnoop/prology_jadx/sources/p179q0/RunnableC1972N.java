package p179q0;

/* renamed from: q0.N */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1972N implements java.lang.Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f7991l;

    /* renamed from: m */
    public final /* synthetic */ p179q0.C1977T f7992m;

    public /* synthetic */ RunnableC1972N(p179q0.C1977T c1977t, int i4) {
        this.f7991l = i4;
        this.f7992m = c1977t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7991l) {
            case 0:
                this.f7992m.f8031R = true;
                return;
            case 1:
                this.f7992m.m3998z();
                return;
            default:
                p179q0.C1977T c1977t = this.f7992m;
                if (c1977t.f8037X) {
                    return;
                }
                p179q0.InterfaceC1961C interfaceC1961C = c1977t.f8015B;
                interfaceC1961C.getClass();
                interfaceC1961C.mo1906f(c1977t);
                return;
        }
    }
}
