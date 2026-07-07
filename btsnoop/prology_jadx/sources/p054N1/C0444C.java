package p054N1;

/* renamed from: N1.C */
/* loaded from: classes.dex */
public final class C0444C extends p054N1.AbstractC0466u {

    /* renamed from: b */
    public final p009B2.C0034E f1292b;

    /* renamed from: c */
    public final p119d2.C1285d f1293c;

    /* renamed from: d */
    public final p054N1.C0446a f1294d;

    public C0444C(int i4, p009B2.C0034E c0034e, p119d2.C1285d c1285d, p054N1.C0446a c0446a) {
        super(i4);
        this.f1293c = c1285d;
        this.f1292b = c0034e;
        this.f1294d = c0446a;
        if (i4 == 2 && c0034e.f121b) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: a */
    public final boolean mo944a(p054N1.C0460o c0460o) {
        return this.f1292b.f121b;
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: b */
    public final p046L1.C0359c[] mo945b(p054N1.C0460o c0460o) {
        return (p046L1.C0359c[]) this.f1292b.f123d;
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: c */
    public final void mo946c(com.google.android.gms.common.api.Status status) {
        this.f1294d.getClass();
        this.f1293c.m3022b(status.f4912n != null ? new p050M1.C0420d(status) : new p050M1.C0420d(status));
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: d */
    public final void mo947d(java.lang.RuntimeException runtimeException) {
        this.f1293c.m3022b(runtimeException);
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: e */
    public final void mo948e(p054N1.C0460o c0460o) {
        p119d2.C1285d c1285d = this.f1293c;
        try {
            p009B2.C0034E c0034e = this.f1292b;
            ((p054N1.InterfaceC0455j) ((p009B2.C0034E) c0034e.f124e).f123d).mo751J(c0460o.f1334d, c1285d);
        } catch (android.os.DeadObjectException e4) {
            throw e4;
        } catch (android.os.RemoteException e5) {
            mo946c(p054N1.AbstractC0466u.m980g(e5));
        } catch (java.lang.RuntimeException e6) {
            c1285d.m3022b(e6);
        }
    }

    @Override // p054N1.AbstractC0466u
    /* renamed from: f */
    public final void mo949f(p008B1.C0026d c0026d, boolean z4) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z4);
        java.util.Map map = (java.util.Map) c0026d.f100n;
        p119d2.C1285d c1285d = this.f1293c;
        map.put(c1285d, valueOf);
        p008B1.C0026d c0026d2 = new p008B1.C0026d(20, c0026d, c1285d);
        p119d2.C1290i c1290i = c1285d.f5161a;
        c1290i.getClass();
        c1290i.f5169b.m1731e(new p119d2.C1288g(p119d2.AbstractC1286e.f5162a, c0026d2));
        c1290i.m3029f();
    }
}
