package p136h0;

/* renamed from: h0.g */
/* loaded from: classes.dex */
public abstract class AbstractC1490g implements java.lang.Comparable {

    /* renamed from: l */
    public final java.lang.String f6096l;

    /* renamed from: m */
    public final p136h0.C1489f f6097m;

    /* renamed from: n */
    public final long f6098n;

    /* renamed from: o */
    public final int f6099o;

    /* renamed from: p */
    public final long f6100p;

    /* renamed from: q */
    public final p076T.C0699m f6101q;

    /* renamed from: r */
    public final java.lang.String f6102r;

    /* renamed from: s */
    public final java.lang.String f6103s;

    /* renamed from: t */
    public final long f6104t;

    /* renamed from: u */
    public final long f6105u;

    /* renamed from: v */
    public final boolean f6106v;

    public AbstractC1490g(java.lang.String str, p136h0.C1489f c1489f, long j4, int i4, long j5, p076T.C0699m c0699m, java.lang.String str2, java.lang.String str3, long j6, long j7, boolean z4) {
        this.f6096l = str;
        this.f6097m = c1489f;
        this.f6098n = j4;
        this.f6099o = i4;
        this.f6100p = j5;
        this.f6101q = c0699m;
        this.f6102r = str2;
        this.f6103s = str3;
        this.f6104t = j6;
        this.f6105u = j7;
        this.f6106v = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        java.lang.Long l4 = (java.lang.Long) obj;
        long longValue = l4.longValue();
        long j4 = this.f6100p;
        if (j4 > longValue) {
            return 1;
        }
        return j4 < l4.longValue() ? -1 : 0;
    }
}
