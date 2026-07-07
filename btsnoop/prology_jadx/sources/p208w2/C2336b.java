package p208w2;

/* renamed from: w2.b */
/* loaded from: classes.dex */
public final class C2336b extends p196u.AbstractC2212g {

    /* renamed from: m */
    public final p206w0.C2305a f9263m;

    /* renamed from: n */
    public final p047L2.C0384n f9264n;

    public C2336b(p047L2.C0384n c0384n, p047L2.InterfaceC0386p interfaceC0386p) {
        super(1);
        this.f9264n = c0384n;
        this.f9263m = new p206w0.C2305a(interfaceC0386p);
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: i */
    public final java.lang.Object mo4412i(java.lang.String str) {
        return this.f9264n.m839a(str);
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: j */
    public final java.lang.String mo4413j() {
        return this.f9264n.f1133a;
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: l */
    public final p208w2.InterfaceC2337c mo4415l() {
        return this.f9263m;
    }

    @Override // p196u.AbstractC2212g
    /* renamed from: m */
    public final boolean mo4416m() {
        return this.f9264n.m841c("transactionId");
    }
}
