package a0;

import T.C0081b;
import T.C0103y;
import q0.AbstractC0489v;

/* loaded from: classes.dex */
public final class j0 extends AbstractC0489v {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3522c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3523d;

    public j0(T.U u4, T.B b4) {
        super(u4);
        this.f3523d = b4;
    }

    @Override // q0.AbstractC0489v, T.U
    public T.S f(int i4, T.S s, boolean z4) {
        switch (this.f3522c) {
            case 0:
                T.U u4 = this.f7923b;
                T.S f4 = u4.f(i4, s, z4);
                if (u4.m(f4.f2145c, (T.T) this.f3523d, 0L).a()) {
                    f4.h(s.f2143a, s.f2144b, s.f2145c, s.f2146d, s.f2147e, C0081b.f2225c, true);
                } else {
                    f4.f2148f = true;
                }
                return f4;
            default:
                return super.f(i4, s, z4);
        }
    }

    @Override // q0.AbstractC0489v, T.U
    public T.T m(int i4, T.T t4, long j4) {
        switch (this.f3522c) {
            case 1:
                super.m(i4, t4, j4);
                T.B b4 = (T.B) this.f3523d;
                t4.f2154c = b4;
                C0103y c0103y = b4.f2067b;
                if (c0103y != null) {
                    String str = c0103y.f2368e;
                }
                t4.getClass();
                return t4;
            default:
                return super.m(i4, t4, j4);
        }
    }

    public j0(T.U u4) {
        super(u4);
        this.f3523d = new T.T();
    }
}
