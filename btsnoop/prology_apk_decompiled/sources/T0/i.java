package T0;

import W.r;
import y0.F;
import y0.q;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public F f2403b;

    /* renamed from: c, reason: collision with root package name */
    public q f2404c;

    /* renamed from: d, reason: collision with root package name */
    public g f2405d;

    /* renamed from: e, reason: collision with root package name */
    public long f2406e;

    /* renamed from: f, reason: collision with root package name */
    public long f2407f;

    /* renamed from: g, reason: collision with root package name */
    public long f2408g;

    /* renamed from: h, reason: collision with root package name */
    public int f2409h;

    /* renamed from: i, reason: collision with root package name */
    public int f2410i;

    /* renamed from: k, reason: collision with root package name */
    public long f2412k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2413l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2414m;

    /* renamed from: a, reason: collision with root package name */
    public final e f2402a = new e(0);

    /* renamed from: j, reason: collision with root package name */
    public B1.d f2411j = new B1.d(28, false);

    public void a(long j4) {
        this.f2408g = j4;
    }

    public abstract long b(r rVar);

    public abstract boolean c(r rVar, long j4, B1.d dVar);

    public void d(boolean z4) {
        if (z4) {
            this.f2411j = new B1.d(28, false);
            this.f2407f = 0L;
            this.f2409h = 0;
        } else {
            this.f2409h = 1;
        }
        this.f2406e = -1L;
        this.f2408g = 0L;
    }
}
