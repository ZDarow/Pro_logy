package p102a0;

/* renamed from: a0.n0 */
/* loaded from: classes.dex */
public final class C0989n0 implements p102a0.InterfaceC0954S {

    /* renamed from: l */
    public final p086W.C0800t f3676l;

    /* renamed from: m */
    public boolean f3677m;

    /* renamed from: n */
    public long f3678n;

    /* renamed from: o */
    public long f3679o;

    /* renamed from: p */
    public p076T.C0668K f3680p = p076T.C0668K.f2206d;

    public C0989n0(p086W.C0800t c0800t) {
        this.f3676l = c0800t;
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: a */
    public final void mo1931a(p076T.C0668K c0668k) {
        if (this.f3677m) {
            m2030d(mo1934e());
        }
        this.f3680p = c0668k;
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: b */
    public final p076T.C0668K mo1932b() {
        return this.f3680p;
    }

    /* renamed from: d */
    public final void m2030d(long j4) {
        this.f3678n = j4;
        if (this.f3677m) {
            this.f3676l.getClass();
            this.f3679o = android.os.SystemClock.elapsedRealtime();
        }
    }

    @Override // p102a0.InterfaceC0954S
    /* renamed from: e */
    public final long mo1934e() {
        long j4 = this.f3678n;
        if (!this.f3677m) {
            return j4;
        }
        this.f3676l.getClass();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f3679o;
        return j4 + (this.f3680p.f2207a == 1.0f ? p086W.AbstractC0805y.m1592M(elapsedRealtime) : elapsedRealtime * r4.f2209c);
    }

    /* renamed from: f */
    public final void m2031f() {
        if (this.f3677m) {
            return;
        }
        this.f3676l.getClass();
        this.f3679o = android.os.SystemClock.elapsedRealtime();
        this.f3677m = true;
    }
}
