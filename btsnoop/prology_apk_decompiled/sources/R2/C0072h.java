package R2;

/* renamed from: R2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1813a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1814b;

    public C0072h(String str, boolean z4) {
        this.f1813a = str;
        this.f1814b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0072h)) {
            return false;
        }
        C0072h c0072h = (C0072h) obj;
        return k3.h.a(this.f1813a, c0072h.f1813a) && this.f1814b == c0072h.f1814b;
    }

    public final int hashCode() {
        String str = this.f1813a;
        return Boolean.hashCode(this.f1814b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SharedPreferencesPigeonOptions(fileName=" + this.f1813a + ", useDataStore=" + this.f1814b + ")";
    }
}
