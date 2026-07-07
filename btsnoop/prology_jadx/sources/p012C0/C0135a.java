package p012C0;

/* renamed from: C0.a */
/* loaded from: classes.dex */
public final class C0135a implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final /* synthetic */ int f345a;

    /* renamed from: b */
    public final p215y0.InterfaceC2403o f346b;

    public C0135a(int i4, byte b4) {
        this.f345a = i4;
        switch (i4) {
            case 1:
                this.f346b = new p215y0.C2383B(35152, 2, "image/png");
                return;
            default:
                this.f346b = new p215y0.C2383B(16973, 2, "image/bmp");
                return;
        }
    }

    /* renamed from: a */
    private final void m467a() {
    }

    /* renamed from: c */
    private final void m468c() {
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        switch (this.f345a) {
            case 0:
                ((p215y0.C2383B) this.f346b).mo34b(j4, j5);
                return;
            case 1:
                ((p215y0.C2383B) this.f346b).mo34b(j4, j5);
                return;
            default:
                this.f346b.mo34b(j4, j5);
                return;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        switch (this.f345a) {
            case 0:
                ((p215y0.C2383B) this.f346b).mo35g(interfaceC2405q);
                return;
            case 1:
                ((p215y0.C2383B) this.f346b).mo35g(interfaceC2405q);
                return;
            default:
                this.f346b.mo35g(interfaceC2405q);
                return;
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        switch (this.f345a) {
            case 0:
                return ((p215y0.C2383B) this.f346b).mo36k(interfaceC2404p);
            case 1:
                return ((p215y0.C2383B) this.f346b).mo36k(interfaceC2404p);
            default:
                return this.f346b.mo36k(interfaceC2404p);
        }
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        switch (this.f345a) {
            case 0:
                return ((p215y0.C2383B) this.f346b).mo37l(interfaceC2404p, c0706t);
            case 1:
                return ((p215y0.C2383B) this.f346b).mo37l(interfaceC2404p, c0706t);
            default:
                return this.f346b.mo37l(interfaceC2404p, c0706t);
        }
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
        switch (this.f345a) {
            case 0:
            case 1:
                return;
            default:
                this.f346b.release();
                return;
        }
    }

    public C0135a(int i4) {
        this.f345a = 2;
        if ((i4 & 1) != 0) {
            this.f346b = new p215y0.C2383B(65496, 2, "image/jpeg");
        } else {
            this.f346b = new p028G0.C0233a();
        }
    }
}
