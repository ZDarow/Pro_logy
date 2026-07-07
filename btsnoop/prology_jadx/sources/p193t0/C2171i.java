package p193t0;

/* renamed from: t0.i */
/* loaded from: classes.dex */
public final class C2171i implements java.lang.Comparable {

    /* renamed from: l */
    public final boolean f8658l;

    /* renamed from: m */
    public final boolean f8659m;

    public C2171i(p076T.C0702p c0702p, int i4) {
        this.f8658l = (c0702p.f2400e & 1) != 0;
        this.f8659m = p102a0.AbstractC0970e.m1979o(i4, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p193t0.C2171i c2171i = (p193t0.C2171i) obj;
        return p129f2.AbstractC1453z.f5826a.mo3261c(this.f8659m, c2171i.f8659m).mo3261c(this.f8658l, c2171i.f8658l).mo3263e();
    }
}
