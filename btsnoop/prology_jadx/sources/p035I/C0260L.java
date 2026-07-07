package p035I;

/* renamed from: I.L */
/* loaded from: classes.dex */
public final class C0260L extends p154k3.AbstractC1804i implements p149j3.InterfaceC1737l {

    /* renamed from: m */
    public final /* synthetic */ int f774m;

    /* renamed from: n */
    public final /* synthetic */ java.lang.Object f775n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0260L(int i4, java.lang.Object obj) {
        super(1);
        this.f774m = i4;
        this.f775n = obj;
    }

    @Override // p149j3.InterfaceC1737l
    /* renamed from: b */
    public final java.lang.Object mo661b(java.lang.Object obj) {
        switch (this.f774m) {
            case 0:
                java.lang.Throwable th = (java.lang.Throwable) obj;
                p035I.C0265Q c0265q = (p035I.C0265Q) this.f775n;
                if (th != null) {
                    c0265q.f798s.m275n(new p035I.C0266S(th));
                }
                if (c0265q.f800u.f3295m != p100Z2.C0933f.f3297a) {
                    ((p040K.C0319i) c0265q.f800u.m1762a()).close();
                }
                return p100Z2.C0934g.f3298a;
            case 1:
                p100Z2.C0934g c0934g = p100Z2.C0934g.f3298a;
                ((p187r3.C2108f) this.f775n).mo2836i(c0934g);
                return c0934g;
            default:
                ((p222z3.C2449h) this.f775n).m4686b();
                return p100Z2.C0934g.f3298a;
        }
    }
}
