package q0;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f7876d = new k0(new T.V[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f7877a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.c0 f7878b;

    /* renamed from: c, reason: collision with root package name */
    public int f7879c;

    static {
        W.y.H(0);
    }

    public k0(T.V... vArr) {
        this.f7878b = f2.I.k(vArr);
        this.f7877a = vArr.length;
        int i4 = 0;
        while (true) {
            f2.c0 c0Var = this.f7878b;
            if (i4 >= c0Var.size()) {
                return;
            }
            int i5 = i4 + 1;
            for (int i6 = i5; i6 < c0Var.size(); i6++) {
                if (((T.V) c0Var.get(i4)).equals(c0Var.get(i6))) {
                    W.a.o("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i4 = i5;
        }
    }

    public final T.V a(int i4) {
        return (T.V) this.f7878b.get(i4);
    }

    public final int b(T.V v4) {
        int indexOf = this.f7878b.indexOf(v4);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f7877a == k0Var.f7877a && this.f7878b.equals(k0Var.f7878b);
    }

    public final int hashCode() {
        if (this.f7879c == 0) {
            this.f7879c = this.f7878b.hashCode();
        }
        return this.f7879c;
    }
}
