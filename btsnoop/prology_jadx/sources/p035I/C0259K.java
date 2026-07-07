package p035I;

/* renamed from: I.K */
/* loaded from: classes.dex */
public final class C0259K extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public int f770p;

    /* renamed from: q */
    public /* synthetic */ java.lang.Object f771q;

    /* renamed from: r */
    public final /* synthetic */ p035I.C0265Q f772r;

    /* renamed from: s */
    public final /* synthetic */ p120d3.AbstractC1297g f773s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0259K(p035I.C0265Q c0265q, p149j3.InterfaceC1741p interfaceC1741p, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f772r = c0265q;
        this.f773s = (p120d3.AbstractC1297g) interfaceC1741p;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0259K c0259k = new p035I.C0259K(this.f772r, this.f773s, interfaceC1190d);
        c0259k.f771q = obj;
        return c0259k;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0259K) mo659g((p110b3.InterfaceC1190d) obj2, (p187r3.InterfaceC2130u) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [r3.Z, r3.l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [d3.g, j3.p] */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    public final java.lang.Object mo660k(java.lang.Object obj) {
        p115c3.EnumC1252a enumC1252a = p115c3.EnumC1252a.f4880l;
        int i4 = this.f770p;
        if (i4 == 0) {
            p176p1.AbstractC1949a.m3913P(obj);
            p187r3.InterfaceC2130u interfaceC2130u = (p187r3.InterfaceC2130u) this.f771q;
            ?? c2097z = new p187r3.C2097Z(true);
            c2097z.m4190H(null);
            p035I.C0265Q c0265q = this.f772r;
            p035I.C0267T c0267t = new p035I.C0267T(this.f773s, c2097z, c0265q.f798s.m273h(), interfaceC2130u.mo2652h());
            p035I.C0291m c0291m = c0265q.f802w;
            java.lang.Object mo4354g = ((p195t3.C2189b) c0291m.f878n).mo4354g(c0267t);
            if (mo4354g instanceof p195t3.C2194g) {
                p195t3.C2194g c2194g = (p195t3.C2194g) mo4354g;
                if (c2194g == null) {
                    c2194g = null;
                }
                java.lang.Throwable th = c2194g != null ? c2194g.f8798a : null;
                if (th == null) {
                    throw new java.lang.IllegalStateException("Channel was closed normally");
                }
                throw th;
            }
            if (mo4354g instanceof p195t3.C2195h) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            if (((java.util.concurrent.atomic.AtomicInteger) ((p009B2.C0061r) c0291m.f879o).f188m).getAndIncrement() == 0) {
                p187r3.AbstractC2131v.m4248g((p187r3.InterfaceC2130u) c0291m.f876l, new p035I.C0270W(c0291m, null));
            }
            this.f770p = 1;
            obj = c2097z.m4239U(this);
            if (obj == enumC1252a) {
                return enumC1252a;
            }
        } else {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p176p1.AbstractC1949a.m3913P(obj);
        }
        return obj;
    }
}
