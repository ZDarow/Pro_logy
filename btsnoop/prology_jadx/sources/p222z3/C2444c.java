package p222z3;

/* renamed from: z3.c */
/* loaded from: classes.dex */
public final class C2444c implements p187r3.InterfaceC2106e, p187r3.InterfaceC2121l0 {

    /* renamed from: l */
    public final p187r3.C2108f f9603l;

    /* renamed from: m */
    public final /* synthetic */ p222z3.C2445d f9604m;

    public C2444c(p222z3.C2445d c2445d, p187r3.C2108f c2108f) {
        this.f9604m = c2445d;
        this.f9603l = c2108f;
    }

    @Override // p187r3.InterfaceC2121l0
    /* renamed from: a */
    public final void mo4224a(p209w3.AbstractC2359u abstractC2359u, int i4) {
        this.f9603l.mo4224a(abstractC2359u, i4);
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: f */
    public final p110b3.InterfaceC1195i mo2835f() {
        return this.f9603l.f8471p;
    }

    @Override // p110b3.InterfaceC1190d
    /* renamed from: i */
    public final void mo2836i(java.lang.Object obj) {
        this.f9603l.mo2836i(obj);
    }

    @Override // p187r3.InterfaceC2106e
    /* renamed from: l */
    public final void mo4217l(java.lang.Object obj, p149j3.InterfaceC1737l interfaceC1737l) {
        p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p222z3.C2445d.f9605g;
        p222z3.C2445d c2445d = this.f9604m;
        atomicReferenceFieldUpdater.set(c2445d, null);
        this.f9603l.mo4217l(c0934g, new p222z3.C2443b(0, c2445d, this));
    }

    @Override // p187r3.InterfaceC2106e
    /* renamed from: n */
    public final p124e2.C1358f mo4218n(java.lang.Object obj, p149j3.InterfaceC1737l interfaceC1737l) {
        p222z3.C2445d c2445d = this.f9604m;
        p222z3.C2443b c2443b = new p222z3.C2443b(1, c2445d, this);
        p124e2.C1358f mo4218n = this.f9603l.mo4218n((p100Z2.C0934g) obj, c2443b);
        if (mo4218n != null) {
            p222z3.C2445d.f9605g.set(c2445d, null);
        }
        return mo4218n;
    }

    @Override // p187r3.InterfaceC2106e
    /* renamed from: o */
    public final void mo4219o(java.lang.Object obj) {
        this.f9603l.mo4219o(obj);
    }
}
