package r3;

import p1.AbstractC0462a;

/* loaded from: classes.dex */
public final class O extends U {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8125p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f8126q;

    public /* synthetic */ O(int i4, Object obj) {
        this.f8125p = i4;
        this.f8126q = obj;
    }

    @Override // j3.l
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        switch (this.f8125p) {
            case 0:
                o((Throwable) obj);
                return Z2.g.f3186a;
            default:
                o((Throwable) obj);
                return Z2.g.f3186a;
        }
    }

    @Override // r3.U
    public final void o(Throwable th) {
        switch (this.f8125p) {
            case 0:
                ((j3.l) this.f8126q).b(th);
                return;
            default:
                Object E3 = n().E();
                boolean z4 = E3 instanceof C0527n;
                V v4 = (V) this.f8126q;
                if (z4) {
                    v4.i(AbstractC0462a.s(((C0527n) E3).f8167a));
                    return;
                } else {
                    v4.i(AbstractC0534v.l(E3));
                    return;
                }
        }
    }
}
