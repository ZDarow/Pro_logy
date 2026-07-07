package p054N1;

/* renamed from: N1.B */
/* loaded from: classes.dex */
public final class C0443B extends p054N1.AbstractC0466u {

    /* renamed from: b */
    public final p119d2.C1285d f1289b;

    /* renamed from: c */
    public final /* synthetic */ int f1290c;

    /* renamed from: d */
    public final java.lang.Object f1291d;

    public C0443B(int i4, p119d2.C1285d c1285d) {
        super(i4);
        this.f1289b = c1285d;
    }

    /* renamed from: i */
    private final /* bridge */ /* synthetic */ void m942i(p008B1.C0026d c0026d, boolean z4) {
    }

    /* renamed from: j */
    private final /* bridge */ /* synthetic */ void m943j(p008B1.C0026d c0026d, boolean z4) {
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: a */
    public final boolean mo944a(p054N1.C0460o c0460o) {
        switch (this.f1290c) {
            case 0:
                ((p054N1.C0470y) this.f1291d).f1372a.getClass();
                return true;
            default:
                return ((p054N1.C0470y) c0460o.f1338h.get((p054N1.C0452g) this.f1291d)) != null;
        }
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: b */
    public final p046L1.C0359c[] mo945b(p054N1.C0460o c0460o) {
        switch (this.f1290c) {
            case 0:
                ((p054N1.C0470y) this.f1291d).f1372a.getClass();
                return null;
            default:
                return null;
        }
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: c */
    public final void mo946c(com.google.android.gms.common.api.Status status) {
        this.f1289b.m3022b(new p050M1.C0420d(status));
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: d */
    public final void mo947d(java.lang.RuntimeException runtimeException) {
        this.f1289b.m3022b(runtimeException);
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: e */
    public final void mo948e(p054N1.C0460o c0460o) {
        try {
            m950h(c0460o);
        } catch (android.os.DeadObjectException e4) {
            mo946c(p054N1.AbstractC0466u.m980g(e4));
            throw e4;
        } catch (android.os.RemoteException e5) {
            mo946c(p054N1.AbstractC0466u.m980g(e5));
        } catch (java.lang.RuntimeException e6) {
            this.f1289b.m3022b(e6);
        }
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo949f(p008B1.C0026d c0026d, boolean z4) {
        int i4 = this.f1290c;
    }

    /* renamed from: h */
    public final void m950h(p054N1.C0460o c0460o) {
        switch (this.f1290c) {
            case 0:
                p008B1.C0026d c0026d = ((p054N1.C0470y) this.f1291d).f1372a;
                ((p094Y.C0886x) ((p086W.C0796p) c0026d.f100n).f2775b).mo751J(c0460o.f1334d, this.f1289b);
                p054N1.C0452g c0452g = ((p054N1.C0453h) ((p054N1.C0470y) this.f1291d).f1372a.f99m).f1327c;
                if (c0452g != null) {
                    c0460o.f1338h.put(c0452g, (p054N1.C0470y) this.f1291d);
                    return;
                }
                return;
            default:
                p054N1.C0470y c0470y = (p054N1.C0470y) c0460o.f1338h.remove((p054N1.C0452g) this.f1291d);
                if (c0470y != null) {
                    ((p096Y1.C0890a) ((p086W.C0796p) c0470y.f1373b.f1048m).f2776c).mo751J(c0460o.f1334d, this.f1289b);
                    p054N1.C0453h c0453h = (p054N1.C0453h) c0470y.f1372a.f99m;
                    c0453h.f1326b = null;
                    c0453h.f1327c = null;
                    return;
                }
                p119d2.C1285d c1285d = this.f1289b;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                p119d2.C1290i c1290i = c1285d.f5161a;
                synchronized (c1290i.f5168a) {
                    try {
                        if (!c1290i.f5170c) {
                            c1290i.f5170c = true;
                            c1290i.f5172e = bool;
                            c1290i.f5169b.m1732f(c1290i);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0443B(p054N1.C0452g c0452g, p119d2.C1285d c1285d) {
        this(4, c1285d);
        this.f1290c = 1;
        this.f1291d = c0452g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0443B(p054N1.C0470y c0470y, p119d2.C1285d c1285d) {
        this(3, c1285d);
        this.f1290c = 0;
        this.f1291d = c0470y;
    }
}
