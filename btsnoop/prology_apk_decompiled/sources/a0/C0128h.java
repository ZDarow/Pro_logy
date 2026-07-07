package a0;

/* renamed from: a0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128h {

    /* renamed from: a, reason: collision with root package name */
    public final float f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3484b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3485c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3486d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3487e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3488f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3489g;

    /* renamed from: n, reason: collision with root package name */
    public float f3496n;

    /* renamed from: o, reason: collision with root package name */
    public float f3497o;

    /* renamed from: h, reason: collision with root package name */
    public long f3490h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f3491i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f3493k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f3494l = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public float f3498p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f3499q = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public long f3492j = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f3495m = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public long f3500r = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public C0128h(float f4, float f5, long j4, float f6, long j5, long j6, float f7) {
        this.f3483a = f4;
        this.f3484b = f5;
        this.f3485c = j4;
        this.f3486d = f6;
        this.f3487e = j5;
        this.f3488f = j6;
        this.f3489g = f7;
        this.f3497o = f4;
        this.f3496n = f5;
    }

    public final void a() {
        long j4;
        long j5 = this.f3490h;
        if (j5 != -9223372036854775807L) {
            j4 = this.f3491i;
            if (j4 == -9223372036854775807L) {
                long j6 = this.f3493k;
                if (j6 != -9223372036854775807L && j5 < j6) {
                    j5 = j6;
                }
                j4 = this.f3494l;
                if (j4 == -9223372036854775807L || j5 <= j4) {
                    j4 = j5;
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (this.f3492j == j4) {
            return;
        }
        this.f3492j = j4;
        this.f3495m = j4;
        this.f3500r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.f3499q = -9223372036854775807L;
    }
}
