package p083V0;

/* renamed from: V0.m */
/* loaded from: classes.dex */
public final class C0775m implements p215y0.InterfaceC2403o {

    /* renamed from: a */
    public final p215y0.InterfaceC2403o f2715a;

    /* renamed from: b */
    public final p046L1.C0363g f2716b;

    /* renamed from: c */
    public android.support.v4.media.session.C1061t f2717c;

    public C0775m(p215y0.InterfaceC2403o interfaceC2403o, p046L1.C0363g c0363g) {
        this.f2715a = interfaceC2403o;
        this.f2716b = c0363g;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        android.support.v4.media.session.C1061t c1061t = this.f2717c;
        if (c1061t != null) {
            int i4 = 0;
            while (true) {
                android.util.SparseArray sparseArray = (android.util.SparseArray) c1061t.f3863o;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                p083V0.InterfaceC0774l interfaceC0774l = ((p083V0.C0777o) sparseArray.valueAt(i4)).f2727g;
                if (interfaceC0774l != null) {
                    interfaceC0774l.mo1403b();
                }
                i4++;
            }
        }
        this.f2715a.mo34b(j4, j5);
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: d */
    public final p215y0.InterfaceC2403o mo1404d() {
        return this.f2715a;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        android.support.v4.media.session.C1061t c1061t = new android.support.v4.media.session.C1061t(interfaceC2405q, this.f2716b);
        this.f2717c = c1061t;
        this.f2715a.mo35g(c1061t);
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        return this.f2715a.mo36k(interfaceC2404p);
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    public final int mo37l(p215y0.InterfaceC2404p interfaceC2404p, p076T.C0706t c0706t) {
        return this.f2715a.mo37l(interfaceC2404p, c0706t);
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
        this.f2715a.release();
    }
}
