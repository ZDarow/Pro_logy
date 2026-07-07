package a0;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: u, reason: collision with root package name */
    public static final q0.F f3458u = new q0.F(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final T.U f3459a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.F f3460b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3461c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3462d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3463e;

    /* renamed from: f, reason: collision with root package name */
    public final C0133m f3464f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3465g;

    /* renamed from: h, reason: collision with root package name */
    public final q0.k0 f3466h;

    /* renamed from: i, reason: collision with root package name */
    public final t0.v f3467i;

    /* renamed from: j, reason: collision with root package name */
    public final List f3468j;

    /* renamed from: k, reason: collision with root package name */
    public final q0.F f3469k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3470l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3471m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3472n;

    /* renamed from: o, reason: collision with root package name */
    public final T.K f3473o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3474p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f3475q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f3476r;
    public volatile long s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f3477t;

    public f0(T.U u4, q0.F f4, long j4, long j5, int i4, C0133m c0133m, boolean z4, q0.k0 k0Var, t0.v vVar, List list, q0.F f5, boolean z5, int i5, int i6, T.K k4, long j6, long j7, long j8, long j9, boolean z6) {
        this.f3459a = u4;
        this.f3460b = f4;
        this.f3461c = j4;
        this.f3462d = j5;
        this.f3463e = i4;
        this.f3464f = c0133m;
        this.f3465g = z4;
        this.f3466h = k0Var;
        this.f3467i = vVar;
        this.f3468j = list;
        this.f3469k = f5;
        this.f3470l = z5;
        this.f3471m = i5;
        this.f3472n = i6;
        this.f3473o = k4;
        this.f3475q = j6;
        this.f3476r = j7;
        this.s = j8;
        this.f3477t = j9;
        this.f3474p = z6;
    }

    public static f0 i(t0.v vVar) {
        T.Q q4 = T.U.f2168a;
        q0.F f4 = f3458u;
        return new f0(q4, f4, -9223372036854775807L, 0L, 1, null, false, q0.k0.f7876d, vVar, f2.c0.f5550p, f4, false, 1, 0, T.K.f2126d, 0L, 0L, 0L, 0L, false);
    }

    public final f0 a() {
        return new f0(this.f3459a, this.f3460b, this.f3461c, this.f3462d, this.f3463e, this.f3464f, this.f3465g, this.f3466h, this.f3467i, this.f3468j, this.f3469k, this.f3470l, this.f3471m, this.f3472n, this.f3473o, this.f3475q, this.f3476r, j(), SystemClock.elapsedRealtime(), this.f3474p);
    }

    public final f0 b(q0.F f4) {
        return new f0(this.f3459a, this.f3460b, this.f3461c, this.f3462d, this.f3463e, this.f3464f, this.f3465g, this.f3466h, this.f3467i, this.f3468j, f4, this.f3470l, this.f3471m, this.f3472n, this.f3473o, this.f3475q, this.f3476r, this.s, this.f3477t, this.f3474p);
    }

    public final f0 c(q0.F f4, long j4, long j5, long j6, long j7, q0.k0 k0Var, t0.v vVar, List list) {
        return new f0(this.f3459a, f4, j5, j6, this.f3463e, this.f3464f, this.f3465g, k0Var, vVar, list, this.f3469k, this.f3470l, this.f3471m, this.f3472n, this.f3473o, this.f3475q, j7, j4, SystemClock.elapsedRealtime(), this.f3474p);
    }

    public final f0 d(int i4, int i5, boolean z4) {
        return new f0(this.f3459a, this.f3460b, this.f3461c, this.f3462d, this.f3463e, this.f3464f, this.f3465g, this.f3466h, this.f3467i, this.f3468j, this.f3469k, z4, i4, i5, this.f3473o, this.f3475q, this.f3476r, this.s, this.f3477t, this.f3474p);
    }

    public final f0 e(C0133m c0133m) {
        return new f0(this.f3459a, this.f3460b, this.f3461c, this.f3462d, this.f3463e, c0133m, this.f3465g, this.f3466h, this.f3467i, this.f3468j, this.f3469k, this.f3470l, this.f3471m, this.f3472n, this.f3473o, this.f3475q, this.f3476r, this.s, this.f3477t, this.f3474p);
    }

    public final f0 f(T.K k4) {
        return new f0(this.f3459a, this.f3460b, this.f3461c, this.f3462d, this.f3463e, this.f3464f, this.f3465g, this.f3466h, this.f3467i, this.f3468j, this.f3469k, this.f3470l, this.f3471m, this.f3472n, k4, this.f3475q, this.f3476r, this.s, this.f3477t, this.f3474p);
    }

    public final f0 g(int i4) {
        return new f0(this.f3459a, this.f3460b, this.f3461c, this.f3462d, i4, this.f3464f, this.f3465g, this.f3466h, this.f3467i, this.f3468j, this.f3469k, this.f3470l, this.f3471m, this.f3472n, this.f3473o, this.f3475q, this.f3476r, this.s, this.f3477t, this.f3474p);
    }

    public final f0 h(T.U u4) {
        return new f0(u4, this.f3460b, this.f3461c, this.f3462d, this.f3463e, this.f3464f, this.f3465g, this.f3466h, this.f3467i, this.f3468j, this.f3469k, this.f3470l, this.f3471m, this.f3472n, this.f3473o, this.f3475q, this.f3476r, this.s, this.f3477t, this.f3474p);
    }

    public final long j() {
        long j4;
        long j5;
        if (!k()) {
            return this.s;
        }
        do {
            j4 = this.f3477t;
            j5 = this.s;
        } while (j4 != this.f3477t);
        return W.y.M(W.y.Z(j5) + (((float) (SystemClock.elapsedRealtime() - j4)) * this.f3473o.f2127a));
    }

    public final boolean k() {
        return this.f3463e == 3 && this.f3470l && this.f3472n == 0;
    }
}
