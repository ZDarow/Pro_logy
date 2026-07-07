package a0;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class n0 implements S {

    /* renamed from: l, reason: collision with root package name */
    public final W.t f3553l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3554m;

    /* renamed from: n, reason: collision with root package name */
    public long f3555n;

    /* renamed from: o, reason: collision with root package name */
    public long f3556o;

    /* renamed from: p, reason: collision with root package name */
    public T.K f3557p = T.K.f2126d;

    public n0(W.t tVar) {
        this.f3553l = tVar;
    }

    @Override // a0.S
    public final void a(T.K k4) {
        if (this.f3554m) {
            d(e());
        }
        this.f3557p = k4;
    }

    @Override // a0.S
    public final T.K b() {
        return this.f3557p;
    }

    public final void d(long j4) {
        this.f3555n = j4;
        if (this.f3554m) {
            this.f3553l.getClass();
            this.f3556o = SystemClock.elapsedRealtime();
        }
    }

    @Override // a0.S
    public final long e() {
        long j4 = this.f3555n;
        if (!this.f3554m) {
            return j4;
        }
        this.f3553l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3556o;
        return j4 + (this.f3557p.f2127a == 1.0f ? W.y.M(elapsedRealtime) : elapsedRealtime * r4.f2129c);
    }

    public final void f() {
        if (this.f3554m) {
            return;
        }
        this.f3553l.getClass();
        this.f3556o = SystemClock.elapsedRealtime();
        this.f3554m = true;
    }
}
