package p128f1;

/* renamed from: f1.e */
/* loaded from: classes.dex */
public final class C1383e {

    /* renamed from: a */
    public final int f5683a;

    /* renamed from: b */
    public final long f5684b;

    public /* synthetic */ C1383e(int i4, long j4, boolean z4) {
        this.f5683a = i4;
        this.f5684b = j4;
    }

    /* renamed from: b */
    public static p128f1.C1383e m3139b(p215y0.C2400l c2400l, p086W.C0798r c0798r) {
        c2400l.mo634p(c0798r.f2786a, 0, 8, false);
        c0798r.m1537G(0);
        return new p128f1.C1383e(c0798r.m1546h(), c0798r.m1550l(), false);
    }

    /* renamed from: a */
    public boolean m3140a() {
        int i4 = this.f5683a;
        return i4 == 0 || i4 == 1;
    }

    public C1383e(long j4, int i4) {
        p086W.AbstractC0781a.m1416e(j4 >= 0);
        this.f5683a = i4;
        this.f5684b = j4;
    }
}
