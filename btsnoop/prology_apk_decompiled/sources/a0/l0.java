package a0;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f3539c = new l0(0, false);

    /* renamed from: a, reason: collision with root package name */
    public final int f3540a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3541b;

    public l0(int i4, boolean z4) {
        this.f3540a = i4;
        this.f3541b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f3540a == l0Var.f3540a && this.f3541b == l0Var.f3541b;
    }

    public final int hashCode() {
        return (this.f3540a << 1) + (this.f3541b ? 1 : 0);
    }
}
