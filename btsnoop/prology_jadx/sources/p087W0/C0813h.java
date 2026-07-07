package p087W0;

/* renamed from: W0.h */
/* loaded from: classes.dex */
public final class C0813h extends p083V0.C0771i implements java.lang.Comparable {

    /* renamed from: v */
    public long f2899v;

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p087W0.C0813h c0813h = (p087W0.C0813h) obj;
        if (m1138c(4) == c0813h.m1138c(4)) {
            long j4 = this.f3253r - c0813h.f3253r;
            if (j4 == 0) {
                j4 = this.f2899v - c0813h.f2899v;
                if (j4 == 0) {
                    return 0;
                }
            }
            if (j4 <= 0) {
                return -1;
            }
        } else if (!m1138c(4)) {
            return -1;
        }
        return 1;
    }
}
