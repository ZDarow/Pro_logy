package q0;

/* renamed from: q0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493z extends AbstractC0489v {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f7938e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f7939c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7940d;

    public C0493z(T.U u4, Object obj, Object obj2) {
        super(u4);
        this.f7939c = obj;
        this.f7940d = obj2;
    }

    @Override // q0.AbstractC0489v, T.U
    public final int b(Object obj) {
        Object obj2;
        if (f7938e.equals(obj) && (obj2 = this.f7940d) != null) {
            obj = obj2;
        }
        return this.f7923b.b(obj);
    }

    @Override // q0.AbstractC0489v, T.U
    public final T.S f(int i4, T.S s, boolean z4) {
        this.f7923b.f(i4, s, z4);
        if (W.y.a(s.f2144b, this.f7940d) && z4) {
            s.f2144b = f7938e;
        }
        return s;
    }

    @Override // q0.AbstractC0489v, T.U
    public final Object l(int i4) {
        Object l4 = this.f7923b.l(i4);
        return W.y.a(l4, this.f7940d) ? f7938e : l4;
    }

    @Override // q0.AbstractC0489v, T.U
    public final T.T m(int i4, T.T t4, long j4) {
        this.f7923b.m(i4, t4, j4);
        if (W.y.a(t4.f2152a, this.f7939c)) {
            t4.f2152a = T.T.f2150q;
        }
        return t4;
    }
}
