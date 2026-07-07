package p132g0;

/* renamed from: g0.g */
/* loaded from: classes.dex */
public final class C1462g extends p193t0.AbstractC2166d {

    /* renamed from: g */
    public int f5849g;

    @Override // p193t0.InterfaceC2181s
    /* renamed from: e */
    public final int mo3268e() {
        return 0;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: g */
    public final int mo3269g() {
        return this.f5849g;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: l */
    public final java.lang.Object mo3270l() {
        return null;
    }

    @Override // p193t0.InterfaceC2181s
    /* renamed from: s */
    public final void mo3271s(long j4, long j5, long j6, java.util.List list, p184r0.InterfaceC2056n[] interfaceC2056nArr) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (mo3980o(elapsedRealtime, this.f5849g)) {
            for (int i4 = this.f8627b - 1; i4 >= 0; i4--) {
                if (!mo3980o(elapsedRealtime, i4)) {
                    this.f5849g = i4;
                    return;
                }
            }
            throw new java.lang.IllegalStateException();
        }
    }
}
