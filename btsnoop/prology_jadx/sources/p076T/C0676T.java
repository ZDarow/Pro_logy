package p076T;

/* renamed from: T.T */
/* loaded from: classes.dex */
public final class C0676T {

    /* renamed from: q */
    public static final java.lang.Object f2230q = new java.lang.Object();

    /* renamed from: r */
    public static final p076T.C0659B f2231r;

    /* renamed from: b */
    public java.lang.Object f2233b;

    /* renamed from: d */
    public java.lang.Object f2235d;

    /* renamed from: e */
    public long f2236e;

    /* renamed from: f */
    public long f2237f;

    /* renamed from: g */
    public long f2238g;

    /* renamed from: h */
    public boolean f2239h;

    /* renamed from: i */
    public boolean f2240i;

    /* renamed from: j */
    public p076T.C0710x f2241j;

    /* renamed from: k */
    public boolean f2242k;

    /* renamed from: l */
    public long f2243l;

    /* renamed from: m */
    public long f2244m;

    /* renamed from: n */
    public int f2245n;

    /* renamed from: o */
    public int f2246o;

    /* renamed from: p */
    public long f2247p;

    /* renamed from: a */
    public java.lang.Object f2232a = f2230q;

    /* renamed from: c */
    public p076T.C0659B f2234c = f2231r;

    /* JADX WARN: Type inference failed for: r10v0, types: [T.u, T.v] */
    static {
        p076T.C0706t c0706t = new p076T.C0706t();
        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
        java.util.List emptyList = java.util.Collections.emptyList();
        p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
        p076T.C0709w c0709w = new p076T.C0709w();
        p076T.C0712z c0712z = p076T.C0712z.f2455a;
        android.net.Uri uri = android.net.Uri.EMPTY;
        f2231r = new p076T.C0659B("androidx.media3.common.Timeline", new p076T.C0707u(c0706t), uri != null ? new p076T.C0711y(uri, null, null, emptyList, c1415c02, null, -9223372036854775807L) : null, new p076T.C0710x(c0709w), p076T.C0662E.f2173y, c0712z);
        p009B2.AbstractC0051h.m155n(1, 2, 3, 4, 5);
        p009B2.AbstractC0051h.m155n(6, 7, 8, 9, 10);
        p086W.AbstractC0805y.m1587H(11);
        p086W.AbstractC0805y.m1587H(12);
        p086W.AbstractC0805y.m1587H(13);
    }

    /* renamed from: a */
    public final boolean m1245a() {
        return this.f2241j != null;
    }

    /* renamed from: b */
    public final void m1246b(p076T.C0659B c0659b, java.lang.Object obj, long j4, long j5, long j6, boolean z4, boolean z5, p076T.C0710x c0710x, long j7, long j8, int i4, long j9) {
        p076T.C0711y c0711y;
        this.f2232a = f2230q;
        this.f2234c = c0659b != null ? c0659b : f2231r;
        if (c0659b != null && (c0711y = c0659b.f2143b) != null) {
            java.lang.String str = c0711y.f2453e;
        }
        this.f2235d = obj;
        this.f2236e = j4;
        this.f2237f = j5;
        this.f2238g = j6;
        this.f2239h = z4;
        this.f2240i = z5;
        this.f2241j = c0710x;
        this.f2243l = j7;
        this.f2244m = j8;
        this.f2245n = 0;
        this.f2246o = i4;
        this.f2247p = j9;
        this.f2242k = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p076T.C0676T.class.equals(obj.getClass())) {
            return false;
        }
        p076T.C0676T c0676t = (p076T.C0676T) obj;
        return p086W.AbstractC0805y.m1606a(this.f2232a, c0676t.f2232a) && p086W.AbstractC0805y.m1606a(this.f2234c, c0676t.f2234c) && p086W.AbstractC0805y.m1606a(this.f2235d, c0676t.f2235d) && p086W.AbstractC0805y.m1606a(this.f2241j, c0676t.f2241j) && this.f2236e == c0676t.f2236e && this.f2237f == c0676t.f2237f && this.f2238g == c0676t.f2238g && this.f2239h == c0676t.f2239h && this.f2240i == c0676t.f2240i && this.f2242k == c0676t.f2242k && this.f2243l == c0676t.f2243l && this.f2244m == c0676t.f2244m && this.f2245n == c0676t.f2245n && this.f2246o == c0676t.f2246o && this.f2247p == c0676t.f2247p;
    }

    public final int hashCode() {
        int hashCode = (this.f2234c.hashCode() + ((this.f2232a.hashCode() + 217) * 31)) * 31;
        java.lang.Object obj = this.f2235d;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        p076T.C0710x c0710x = this.f2241j;
        int hashCode3 = (hashCode2 + (c0710x != null ? c0710x.hashCode() : 0)) * 31;
        long j4 = this.f2236e;
        int i4 = (hashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f2237f;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f2238g;
        int i6 = (((((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f2239h ? 1 : 0)) * 31) + (this.f2240i ? 1 : 0)) * 31) + (this.f2242k ? 1 : 0)) * 31;
        long j7 = this.f2243l;
        int i7 = (i6 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.f2244m;
        int i8 = (((((i7 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f2245n) * 31) + this.f2246o) * 31;
        long j9 = this.f2247p;
        return i8 + ((int) (j9 ^ (j9 >>> 32)));
    }
}
