package p122e0;

/* renamed from: e0.q */
/* loaded from: classes.dex */
public final class C1316q {

    /* renamed from: a */
    public final long f5280a;

    /* renamed from: b */
    public final long f5281b;

    public C1316q(long j4, long j5) {
        this.f5280a = j4;
        this.f5281b = j5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p122e0.C1316q.class != obj.getClass()) {
            return false;
        }
        p122e0.C1316q c1316q = (p122e0.C1316q) obj;
        return this.f5280a == c1316q.f5280a && this.f5281b == c1316q.f5281b;
    }

    public final int hashCode() {
        return (((int) this.f5280a) * 31) + ((int) this.f5281b);
    }
}
