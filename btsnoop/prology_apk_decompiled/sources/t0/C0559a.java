package t0;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559a {

    /* renamed from: a, reason: collision with root package name */
    public final long f8288a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8289b;

    public C0559a(long j4, long j5) {
        this.f8288a = j4;
        this.f8289b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0559a)) {
            return false;
        }
        C0559a c0559a = (C0559a) obj;
        return this.f8288a == c0559a.f8288a && this.f8289b == c0559a.f8289b;
    }

    public final int hashCode() {
        return (((int) this.f8288a) * 31) + ((int) this.f8289b);
    }
}
