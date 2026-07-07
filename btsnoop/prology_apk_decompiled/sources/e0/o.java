package e0;

import java.util.List;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: j, reason: collision with root package name */
    public final List f5088j;

    public o(j jVar, long j4, long j5, long j6, long j7, List list, long j8, List list2, long j9, long j10) {
        super(jVar, j4, j5, j6, j7, list, j8, j9, j10);
        this.f5088j = list2;
    }

    @Override // e0.n
    public final long d(long j4) {
        return this.f5088j.size();
    }

    @Override // e0.n
    public final j h(k kVar, long j4) {
        return (j) this.f5088j.get((int) (j4 - this.f5082d));
    }

    @Override // e0.n
    public final boolean i() {
        return true;
    }
}
