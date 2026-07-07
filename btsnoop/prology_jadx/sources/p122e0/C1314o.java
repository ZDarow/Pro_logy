package p122e0;

/* renamed from: e0.o */
/* loaded from: classes.dex */
public final class C1314o extends p122e0.AbstractC1313n {

    /* renamed from: j */
    public final java.util.List f5276j;

    public C1314o(p122e0.C1309j c1309j, long j4, long j5, long j6, long j7, java.util.List list, long j8, java.util.List list2, long j9, long j10) {
        super(c1309j, j4, j5, j6, j7, list, j8, j9, j10);
        this.f5276j = list2;
    }

    @Override // p122e0.AbstractC1313n
    /* renamed from: d */
    public final long mo3072d(long j4) {
        return this.f5276j.size();
    }

    @Override // p122e0.AbstractC1313n
    /* renamed from: h */
    public final p122e0.C1309j mo3076h(p122e0.C1310k c1310k, long j4) {
        return (p122e0.C1309j) this.f5276j.get((int) (j4 - this.f5270d));
    }

    @Override // p122e0.AbstractC1313n
    /* renamed from: i */
    public final boolean mo3077i() {
        return true;
    }
}
