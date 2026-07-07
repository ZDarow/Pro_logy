package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.j */
/* loaded from: classes.dex */
public abstract class AbstractC1111j {

    /* renamed from: a */
    public int f4253a;

    /* renamed from: b */
    public p086W.C0792l f4254b;

    /* renamed from: a */
    public abstract void mo2517a(int i4);

    /* renamed from: b */
    public abstract int mo2518b();

    /* renamed from: c */
    public abstract boolean mo2519c();

    /* renamed from: d */
    public abstract void mo2520d(int i4);

    /* renamed from: e */
    public abstract int mo2521e(int i4);

    /* renamed from: f */
    public abstract boolean mo2522f();

    /* renamed from: g */
    public abstract androidx.datastore.preferences.protobuf.C1105g mo2523g();

    /* renamed from: h */
    public abstract double mo2524h();

    /* renamed from: i */
    public abstract int mo2525i();

    /* renamed from: j */
    public abstract int mo2526j();

    /* renamed from: k */
    public abstract long mo2527k();

    /* renamed from: l */
    public abstract float mo2528l();

    /* renamed from: m */
    public abstract int mo2529m();

    /* renamed from: n */
    public abstract long mo2530n();

    /* renamed from: o */
    public abstract int mo2531o();

    /* renamed from: p */
    public abstract long mo2532p();

    /* renamed from: q */
    public abstract int mo2533q();

    /* renamed from: r */
    public abstract long mo2534r();

    /* renamed from: s */
    public abstract java.lang.String mo2535s();

    /* renamed from: t */
    public abstract java.lang.String mo2536t();

    /* renamed from: u */
    public abstract int mo2537u();

    /* renamed from: v */
    public abstract int mo2538v();

    /* renamed from: w */
    public abstract long mo2539w();

    /* renamed from: x */
    public abstract boolean mo2540x(int i4);

    /* renamed from: y */
    public final void m2578y() {
        int mo2537u;
        do {
            mo2537u = mo2537u();
            if (mo2537u == 0) {
                return;
            }
            int i4 = this.f4253a;
            if (i4 >= 100) {
                throw new java.io.IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f4253a = i4 + 1;
            this.f4253a--;
        } while (mo2540x(mo2537u));
    }
}
