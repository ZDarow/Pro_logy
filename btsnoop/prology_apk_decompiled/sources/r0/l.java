package r0;

import T.C0095p;

/* loaded from: classes.dex */
public abstract class l extends AbstractC0503e {

    /* renamed from: u, reason: collision with root package name */
    public final long f8063u;

    public l(Y.h hVar, Y.l lVar, C0095p c0095p, int i4, Object obj, long j4, long j5, long j6) {
        super(hVar, lVar, 1, c0095p, i4, obj, j4, j5);
        c0095p.getClass();
        this.f8063u = j6;
    }

    public long a() {
        long j4 = this.f8063u;
        if (j4 != -1) {
            return 1 + j4;
        }
        return -1L;
    }

    public abstract boolean d();
}
