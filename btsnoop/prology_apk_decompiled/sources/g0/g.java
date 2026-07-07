package g0;

import android.os.SystemClock;
import java.util.List;
import t0.AbstractC0562d;

/* loaded from: classes.dex */
public final class g extends AbstractC0562d {

    /* renamed from: g, reason: collision with root package name */
    public int f5652g;

    @Override // t0.s
    public final int e() {
        return 0;
    }

    @Override // t0.s
    public final int g() {
        return this.f5652g;
    }

    @Override // t0.s
    public final Object l() {
        return null;
    }

    @Override // t0.s
    public final void s(long j4, long j5, long j6, List list, r0.n[] nVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (o(elapsedRealtime, this.f5652g)) {
            for (int i4 = this.f8305b - 1; i4 >= 0; i4--) {
                if (!o(elapsedRealtime, i4)) {
                    this.f5652g = i4;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }
}
