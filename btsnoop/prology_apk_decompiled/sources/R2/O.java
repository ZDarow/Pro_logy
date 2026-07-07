package R2;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final String f1799a;

    /* renamed from: b, reason: collision with root package name */
    public final M f1800b;

    public O(String str, M m4) {
        this.f1799a = str;
        this.f1800b = m4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o2 = (O) obj;
        return k3.h.a(this.f1799a, o2.f1799a) && this.f1800b == o2.f1800b;
    }

    public final int hashCode() {
        String str = this.f1799a;
        return this.f1800b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "StringListResult(jsonEncodedValue=" + this.f1799a + ", type=" + this.f1800b + ")";
    }
}
