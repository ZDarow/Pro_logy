package h0;

import T.C0092m;

/* loaded from: classes.dex */
public abstract class g implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public final String f5881l;

    /* renamed from: m, reason: collision with root package name */
    public final f f5882m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5883n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5884o;

    /* renamed from: p, reason: collision with root package name */
    public final long f5885p;

    /* renamed from: q, reason: collision with root package name */
    public final C0092m f5886q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5887r;
    public final String s;

    /* renamed from: t, reason: collision with root package name */
    public final long f5888t;

    /* renamed from: u, reason: collision with root package name */
    public final long f5889u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5890v;

    public g(String str, f fVar, long j4, int i4, long j5, C0092m c0092m, String str2, String str3, long j6, long j7, boolean z4) {
        this.f5881l = str;
        this.f5882m = fVar;
        this.f5883n = j4;
        this.f5884o = i4;
        this.f5885p = j5;
        this.f5886q = c0092m;
        this.f5887r = str2;
        this.s = str3;
        this.f5888t = j6;
        this.f5889u = j7;
        this.f5890v = z4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l4 = (Long) obj;
        long longValue = l4.longValue();
        long j4 = this.f5885p;
        if (j4 > longValue) {
            return 1;
        }
        return j4 < l4.longValue() ? -1 : 0;
    }
}
