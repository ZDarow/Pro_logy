package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class r implements k {

    /* renamed from: t, reason: collision with root package name */
    public static final r f4176t = new r();

    /* renamed from: l, reason: collision with root package name */
    public int f4177l;

    /* renamed from: m, reason: collision with root package name */
    public int f4178m;

    /* renamed from: p, reason: collision with root package name */
    public Handler f4181p;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4179n = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4180o = true;

    /* renamed from: q, reason: collision with root package name */
    public final m f4182q = new m(this);

    /* renamed from: r, reason: collision with root package name */
    public final F2.c f4183r = new F2.c(2, this);
    public final K2.o s = new K2.o(22, this);

    @Override // androidx.lifecycle.k
    public final m b() {
        return this.f4182q;
    }

    public final void c() {
        int i4 = this.f4178m + 1;
        this.f4178m = i4;
        if (i4 == 1) {
            if (this.f4179n) {
                this.f4182q.d(e.ON_RESUME);
                this.f4179n = false;
            } else {
                Handler handler = this.f4181p;
                k3.h.b(handler);
                handler.removeCallbacks(this.f4183r);
            }
        }
    }
}
