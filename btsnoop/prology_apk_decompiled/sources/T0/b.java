package T0;

import W.y;
import y0.z;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: l, reason: collision with root package name */
    public final f f2372l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2373m;

    /* renamed from: n, reason: collision with root package name */
    public final long f2374n;

    /* renamed from: o, reason: collision with root package name */
    public final i f2375o;

    /* renamed from: p, reason: collision with root package name */
    public int f2376p;

    /* renamed from: q, reason: collision with root package name */
    public long f2377q;

    /* renamed from: r, reason: collision with root package name */
    public long f2378r;
    public long s;

    /* renamed from: t, reason: collision with root package name */
    public long f2379t;

    /* renamed from: u, reason: collision with root package name */
    public long f2380u;

    /* renamed from: v, reason: collision with root package name */
    public long f2381v;
    public long w;

    public b(i iVar, long j4, long j5, long j6, long j7, boolean z4) {
        W.a.e(j4 >= 0 && j5 > j4);
        this.f2375o = iVar;
        this.f2373m = j4;
        this.f2374n = j5;
        if (j6 == j5 - j4 || z4) {
            this.f2377q = j7;
            this.f2376p = 4;
        } else {
            this.f2376p = 0;
        }
        this.f2372l = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // T0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(y0.l r25) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.b.a(y0.l):long");
    }

    @Override // T0.g
    public final z h() {
        if (this.f2377q != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // T0.g
    public final void n(long j4) {
        this.s = y.k(j4, 0L, this.f2377q - 1);
        this.f2376p = 2;
        this.f2379t = this.f2373m;
        this.f2380u = this.f2374n;
        this.f2381v = 0L;
        this.w = this.f2377q;
    }
}
