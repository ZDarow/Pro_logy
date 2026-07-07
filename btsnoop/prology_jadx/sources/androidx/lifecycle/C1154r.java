package androidx.lifecycle;

/* renamed from: androidx.lifecycle.r */
/* loaded from: classes.dex */
public final class C1154r implements androidx.lifecycle.InterfaceC1147k {

    /* renamed from: t */
    public static final androidx.lifecycle.C1154r f4325t = new androidx.lifecycle.C1154r();

    /* renamed from: l */
    public int f4326l;

    /* renamed from: m */
    public int f4327m;

    /* renamed from: p */
    public android.os.Handler f4330p;

    /* renamed from: n */
    public boolean f4328n = true;

    /* renamed from: o */
    public boolean f4329o = true;

    /* renamed from: q */
    public final androidx.lifecycle.C1149m f4331q = new androidx.lifecycle.C1149m(this);

    /* renamed from: r */
    public final p026F2.RunnableC0226c f4332r = new p026F2.RunnableC0226c(2, this);

    /* renamed from: s */
    public final p043K2.C0339o f4333s = new p043K2.C0339o(22, this);

    @Override // androidx.lifecycle.InterfaceC1147k
    /* renamed from: b */
    public final androidx.lifecycle.C1149m mo127b() {
        return this.f4331q;
    }

    /* renamed from: c */
    public final void m2663c() {
        int i4 = this.f4327m + 1;
        this.f4327m = i4;
        if (i4 == 1) {
            if (this.f4328n) {
                this.f4331q.m2660d(androidx.lifecycle.EnumC1141e.ON_RESUME);
                this.f4328n = false;
            } else {
                android.os.Handler handler = this.f4330p;
                p154k3.AbstractC1803h.m3776b(handler);
                handler.removeCallbacks(this.f4332r);
            }
        }
    }
}
