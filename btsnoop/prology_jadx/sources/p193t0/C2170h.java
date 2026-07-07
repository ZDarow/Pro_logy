package p193t0;

/* renamed from: t0.h */
/* loaded from: classes.dex */
public final class C2170h extends p193t0.AbstractC2177o implements java.lang.Comparable {

    /* renamed from: p */
    public final int f8656p;

    /* renamed from: q */
    public final int f8657q;

    public C2170h(int i4, p076T.C0678V c0678v, int i5, p193t0.C2173k c2173k, int i6) {
        super(i4, c0678v, i5);
        this.f8656p = p102a0.AbstractC0970e.m1979o(i6, c2173k.f8675w) ? 1 : 0;
        this.f8657q = this.f8692o.m1296b();
    }

    @Override // p193t0.AbstractC2177o
    /* renamed from: a */
    public final int mo4290a() {
        return this.f8656p;
    }

    @Override // p193t0.AbstractC2177o
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4291b(p193t0.AbstractC2177o abstractC2177o) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return java.lang.Integer.compare(this.f8657q, ((p193t0.C2170h) obj).f8657q);
    }
}
