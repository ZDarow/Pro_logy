package p028G0;

/* renamed from: G0.d */
/* loaded from: classes.dex */
public final class C0236d extends p215y0.AbstractC2408t {

    /* renamed from: b */
    public final /* synthetic */ p215y0.InterfaceC2414z f686b;

    /* renamed from: c */
    public final /* synthetic */ p028G0.C0235c f687c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236d(p028G0.C0235c c0235c, p215y0.InterfaceC2414z interfaceC2414z, p215y0.InterfaceC2414z interfaceC2414z2) {
        super(interfaceC2414z);
        this.f687c = c0235c;
        this.f686b = interfaceC2414z2;
    }

    @Override // p215y0.AbstractC2408t, p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        p215y0.C2413y mo32f = this.f686b.mo32f(j4);
        p215y0.C2382A c2382a = mo32f.f9503a;
        long j5 = c2382a.f9350a;
        long j6 = this.f687c.f684m;
        p215y0.C2382A c2382a2 = new p215y0.C2382A(j5, c2382a.f9351b + j6);
        p215y0.C2382A c2382a3 = mo32f.f9504b;
        return new p215y0.C2413y(c2382a2, new p215y0.C2382A(c2382a3.f9350a, c2382a3.f9351b + j6));
    }
}
