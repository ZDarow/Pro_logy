package K;

import B3.l;

/* loaded from: classes.dex */
public final class e extends k3.i implements j3.a {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f906m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f f907n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i4) {
        super(0);
        this.f906m = i4;
        this.f907n = fVar;
    }

    @Override // j3.a
    public final Object c() {
        switch (this.f906m) {
            case 0:
                f fVar = this.f907n;
                l lVar = (l) fVar.f912c.c();
                if (C3.b.a(lVar) != -1) {
                    return F1.g.u(lVar.f251l.n(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.f912c + ", instead got " + lVar).toString());
            default:
                F1.g gVar = f.f909f;
                f fVar2 = this.f907n;
                synchronized (gVar) {
                    f.f908e.remove(((l) fVar2.f913d.a()).f251l.n());
                }
                return Z2.g.f3186a;
        }
    }
}
