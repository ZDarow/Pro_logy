package p136h0;

/* renamed from: h0.i */
/* loaded from: classes.dex */
public final class C1492i extends p136h0.AbstractC1496m {

    /* renamed from: d */
    public final int f6112d;

    /* renamed from: e */
    public final long f6113e;

    /* renamed from: f */
    public final boolean f6114f;

    /* renamed from: g */
    public final boolean f6115g;

    /* renamed from: h */
    public final long f6116h;

    /* renamed from: i */
    public final boolean f6117i;

    /* renamed from: j */
    public final int f6118j;

    /* renamed from: k */
    public final long f6119k;

    /* renamed from: l */
    public final int f6120l;

    /* renamed from: m */
    public final long f6121m;

    /* renamed from: n */
    public final long f6122n;

    /* renamed from: o */
    public final boolean f6123o;

    /* renamed from: p */
    public final boolean f6124p;

    /* renamed from: q */
    public final p076T.C0699m f6125q;

    /* renamed from: r */
    public final p129f2.AbstractC1393I f6126r;

    /* renamed from: s */
    public final p129f2.AbstractC1393I f6127s;

    /* renamed from: t */
    public final p129f2.C1425h0 f6128t;

    /* renamed from: u */
    public final long f6129u;

    /* renamed from: v */
    public final p136h0.C1491h f6130v;

    public C1492i(int i4, java.lang.String str, java.util.List list, long j4, boolean z4, long j5, boolean z5, int i5, long j6, int i6, long j7, long j8, boolean z6, boolean z7, boolean z8, p076T.C0699m c0699m, java.util.List list2, java.util.List list3, p136h0.C1491h c1491h, java.util.Map map) {
        super(str, list, z6);
        this.f6112d = i4;
        this.f6116h = j5;
        this.f6115g = z4;
        this.f6117i = z5;
        this.f6118j = i5;
        this.f6119k = j6;
        this.f6120l = i6;
        this.f6121m = j7;
        this.f6122n = j8;
        this.f6123o = z7;
        this.f6124p = z8;
        this.f6125q = c0699m;
        this.f6126r = p129f2.AbstractC1393I.m3162j(list2);
        this.f6127s = p129f2.AbstractC1393I.m3162j(list3);
        this.f6128t = p129f2.C1425h0.m3214a(map);
        if (!list3.isEmpty()) {
            p136h0.C1487d c1487d = (p136h0.C1487d) p129f2.AbstractC1444r.m3232l(list3);
            this.f6129u = c1487d.f6100p + c1487d.f6098n;
        } else if (list2.isEmpty()) {
            this.f6129u = 0L;
        } else {
            p136h0.C1489f c1489f = (p136h0.C1489f) p129f2.AbstractC1444r.m3232l(list2);
            this.f6129u = c1489f.f6100p + c1489f.f6098n;
        }
        this.f6113e = j4 != -9223372036854775807L ? j4 >= 0 ? java.lang.Math.min(this.f6129u, j4) : java.lang.Math.max(0L, this.f6129u + j4) : -9223372036854775807L;
        this.f6114f = j4 >= 0;
        this.f6130v = c1491h;
    }

    @Override // p156l0.InterfaceC1821a
    /* renamed from: a */
    public final java.lang.Object mo3040a(java.util.List list) {
        return this;
    }
}
