package W;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f2697c = new s(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2699b;

    static {
        new s(0, 0);
    }

    public s(int i4, int i5) {
        a.e((i4 == -1 || i4 >= 0) && (i5 == -1 || i5 >= 0));
        this.f2698a = i4;
        this.f2699b = i5;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f2698a == sVar.f2698a && this.f2699b == sVar.f2699b;
    }

    public final int hashCode() {
        int i4 = this.f2698a;
        return ((i4 >>> 16) | (i4 << 16)) ^ this.f2699b;
    }

    public final String toString() {
        return this.f2698a + "x" + this.f2699b;
    }
}
