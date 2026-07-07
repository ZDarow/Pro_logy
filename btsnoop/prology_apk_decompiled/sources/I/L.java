package I;

import r3.C0519f;

/* loaded from: classes.dex */
public final class L extends k3.i implements j3.l {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f755m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f756n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(int i4, Object obj) {
        super(1);
        this.f755m = i4;
        this.f756n = obj;
    }

    @Override // j3.l
    public final Object b(Object obj) {
        switch (this.f755m) {
            case 0:
                Throwable th = (Throwable) obj;
                Q q4 = (Q) this.f756n;
                if (th != null) {
                    q4.s.n(new S(th));
                }
                if (q4.f779u.f3183m != Z2.f.f3185a) {
                    ((K.i) q4.f779u.a()).close();
                }
                return Z2.g.f3186a;
            case 1:
                Z2.g gVar = Z2.g.f3186a;
                ((C0519f) this.f756n).i(gVar);
                return gVar;
            default:
                ((z3.h) this.f756n).b();
                return Z2.g.f3186a;
        }
    }
}
