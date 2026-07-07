package e0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final long f5092a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5093b;

    public q(long j4, long j5) {
        this.f5092a = j4;
        this.f5093b = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f5092a == qVar.f5092a && this.f5093b == qVar.f5093b;
    }

    public final int hashCode() {
        return (((int) this.f5092a) * 31) + ((int) this.f5093b);
    }
}
