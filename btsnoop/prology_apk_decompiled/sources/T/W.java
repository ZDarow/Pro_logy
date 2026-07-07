package T;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: d, reason: collision with root package name */
    public static final W f2174d = new W(new K2.q());

    /* renamed from: a, reason: collision with root package name */
    public final int f2175a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2176b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2177c;

    static {
        W.y.H(1);
        W.y.H(2);
        W.y.H(3);
    }

    public W(K2.q qVar) {
        this.f2175a = qVar.f1023a;
        this.f2176b = qVar.f1024b;
        this.f2177c = qVar.f1025c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W.class != obj.getClass()) {
            return false;
        }
        W w = (W) obj;
        return this.f2175a == w.f2175a && this.f2176b == w.f2176b && this.f2177c == w.f2177c;
    }

    public final int hashCode() {
        return ((((this.f2175a + 31) * 31) + (this.f2176b ? 1 : 0)) * 31) + (this.f2177c ? 1 : 0);
    }
}
