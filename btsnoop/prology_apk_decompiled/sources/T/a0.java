package T;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f2223b;

    /* renamed from: a, reason: collision with root package name */
    public final f2.I f2224a;

    static {
        f2.G g4 = f2.I.f5510m;
        f2223b = new a0(f2.c0.f5550p);
        W.y.H(0);
    }

    public a0(f2.I i4) {
        this.f2224a = f2.I.j(i4);
    }

    public final f2.I a() {
        return this.f2224a;
    }

    public final boolean b(int i4) {
        int i5 = 0;
        while (true) {
            f2.I i6 = this.f2224a;
            if (i5 >= i6.size()) {
                return false;
            }
            Z z4 = (Z) i6.get(i5);
            boolean[] zArr = z4.f2216e;
            int length = zArr.length;
            boolean z5 = false;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (zArr[i7]) {
                    z5 = true;
                    break;
                }
                i7++;
            }
            if (z5 && z4.f2213b.f2171c == i4) {
                return true;
            }
            i5++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0.class != obj.getClass()) {
            return false;
        }
        return this.f2224a.equals(((a0) obj).f2224a);
    }

    public final int hashCode() {
        return this.f2224a.hashCode();
    }
}
