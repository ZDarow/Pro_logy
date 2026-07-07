package p215y0;

/* renamed from: y0.A */
/* loaded from: classes.dex */
public final class C2382A {

    /* renamed from: c */
    public static final p215y0.C2382A f9349c = new p215y0.C2382A(0, 0);

    /* renamed from: a */
    public final long f9350a;

    /* renamed from: b */
    public final long f9351b;

    public C2382A(long j4, long j5) {
        this.f9350a = j4;
        this.f9351b = j5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p215y0.C2382A.class != obj.getClass()) {
            return false;
        }
        p215y0.C2382A c2382a = (p215y0.C2382A) obj;
        return this.f9350a == c2382a.f9350a && this.f9351b == c2382a.f9351b;
    }

    public final int hashCode() {
        return (((int) this.f9350a) * 31) + ((int) this.f9351b);
    }

    public final java.lang.String toString() {
        return "[timeUs=" + this.f9350a + ", position=" + this.f9351b + "]";
    }
}
