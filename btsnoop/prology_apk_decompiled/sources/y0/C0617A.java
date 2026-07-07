package y0;

/* renamed from: y0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617A {

    /* renamed from: c, reason: collision with root package name */
    public static final C0617A f8990c = new C0617A(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f8991a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8992b;

    public C0617A(long j4, long j5) {
        this.f8991a = j4;
        this.f8992b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0617A.class != obj.getClass()) {
            return false;
        }
        C0617A c0617a = (C0617A) obj;
        return this.f8991a == c0617a.f8991a && this.f8992b == c0617a.f8992b;
    }

    public final int hashCode() {
        return (((int) this.f8991a) * 31) + ((int) this.f8992b);
    }

    public final String toString() {
        return "[timeUs=" + this.f8991a + ", position=" + this.f8992b + "]";
    }
}
