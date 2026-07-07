package q0;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final int f7714a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7715b;

    public S(int i4, boolean z4) {
        this.f7714a = i4;
        this.f7715b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || S.class != obj.getClass()) {
            return false;
        }
        S s = (S) obj;
        return this.f7714a == s.f7714a && this.f7715b == s.f7715b;
    }

    public final int hashCode() {
        return (this.f7714a * 31) + (this.f7715b ? 1 : 0);
    }
}
