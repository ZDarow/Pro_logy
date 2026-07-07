package p193t0;

/* renamed from: t0.a */
/* loaded from: classes.dex */
public final class C2163a {

    /* renamed from: a */
    public final long f8609a;

    /* renamed from: b */
    public final long f8610b;

    public C2163a(long j4, long j5) {
        this.f8609a = j4;
        this.f8610b = j5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p193t0.C2163a)) {
            return false;
        }
        p193t0.C2163a c2163a = (p193t0.C2163a) obj;
        return this.f8609a == c2163a.f8609a && this.f8610b == c2163a.f8610b;
    }

    public final int hashCode() {
        return (((int) this.f8609a) * 31) + ((int) this.f8610b);
    }
}
