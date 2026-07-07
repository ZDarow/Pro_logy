package h0;

import T.C0092m;
import f2.I;
import f2.h0;
import f2.r;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends m {

    /* renamed from: d, reason: collision with root package name */
    public final int f5896d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5897e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5898f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5899g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5900h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5901i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5902j;

    /* renamed from: k, reason: collision with root package name */
    public final long f5903k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5904l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5905m;

    /* renamed from: n, reason: collision with root package name */
    public final long f5906n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f5907o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f5908p;

    /* renamed from: q, reason: collision with root package name */
    public final C0092m f5909q;

    /* renamed from: r, reason: collision with root package name */
    public final I f5910r;
    public final I s;

    /* renamed from: t, reason: collision with root package name */
    public final h0 f5911t;

    /* renamed from: u, reason: collision with root package name */
    public final long f5912u;

    /* renamed from: v, reason: collision with root package name */
    public final h f5913v;

    public i(int i4, String str, List list, long j4, boolean z4, long j5, boolean z5, int i5, long j6, int i6, long j7, long j8, boolean z6, boolean z7, boolean z8, C0092m c0092m, List list2, List list3, h hVar, Map map) {
        super(str, list, z6);
        this.f5896d = i4;
        this.f5900h = j5;
        this.f5899g = z4;
        this.f5901i = z5;
        this.f5902j = i5;
        this.f5903k = j6;
        this.f5904l = i6;
        this.f5905m = j7;
        this.f5906n = j8;
        this.f5907o = z7;
        this.f5908p = z8;
        this.f5909q = c0092m;
        this.f5910r = I.j(list2);
        this.s = I.j(list3);
        this.f5911t = h0.a(map);
        if (!list3.isEmpty()) {
            d dVar = (d) r.l(list3);
            this.f5912u = dVar.f5885p + dVar.f5883n;
        } else if (list2.isEmpty()) {
            this.f5912u = 0L;
        } else {
            f fVar = (f) r.l(list2);
            this.f5912u = fVar.f5885p + fVar.f5883n;
        }
        this.f5897e = j4 != -9223372036854775807L ? j4 >= 0 ? Math.min(this.f5912u, j4) : Math.max(0L, this.f5912u + j4) : -9223372036854775807L;
        this.f5898f = j4 >= 0;
        this.f5913v = hVar;
    }

    @Override // l0.InterfaceC0402a
    public final Object a(List list) {
        return this;
    }
}
