package T;

/* renamed from: T.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0099u {

    /* renamed from: a, reason: collision with root package name */
    public final long f2353a;

    static {
        new C0099u(new C0098t());
        W.y.H(0);
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
        W.y.H(4);
        W.y.H(5);
        W.y.H(6);
    }

    public C0099u(C0098t c0098t) {
        c0098t.getClass();
        int i4 = W.y.f2709a;
        this.f2353a = c0098t.f2352a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0099u)) {
            return false;
        }
        C0099u c0099u = (C0099u) obj;
        c0099u.getClass();
        return this.f2353a == c0099u.f2353a;
    }

    public final int hashCode() {
        long j4 = this.f2353a;
        return ((((int) 0) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 29791;
    }
}
