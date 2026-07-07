package W0;

/* loaded from: classes.dex */
public final class h extends V0.i implements Comparable {

    /* renamed from: v, reason: collision with root package name */
    public long f2803v;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        if (c(4) == hVar.c(4)) {
            long j4 = this.f3142r - hVar.f3142r;
            if (j4 == 0) {
                j4 = this.f2803v - hVar.f2803v;
                if (j4 == 0) {
                    return 0;
                }
            }
            if (j4 <= 0) {
                return -1;
            }
        } else if (!c(4)) {
            return -1;
        }
        return 1;
    }
}
