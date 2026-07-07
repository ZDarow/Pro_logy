package N1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import d2.C0241d;
import d2.C0246i;

/* loaded from: classes.dex */
public final class B extends u {

    /* renamed from: b, reason: collision with root package name */
    public final C0241d f1247b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1248c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1249d;

    public B(int i4, C0241d c0241d) {
        super(i4);
        this.f1247b = c0241d;
    }

    private final /* bridge */ /* synthetic */ void i(B1.d dVar, boolean z4) {
    }

    private final /* bridge */ /* synthetic */ void j(B1.d dVar, boolean z4) {
    }

    @Override // N1.u
    public final boolean a(o oVar) {
        switch (this.f1248c) {
            case 0:
                ((y) this.f1249d).f1328a.getClass();
                return true;
            default:
                return ((y) oVar.f1294h.get((g) this.f1249d)) != null;
        }
    }

    @Override // N1.u
    public final L1.c[] b(o oVar) {
        switch (this.f1248c) {
            case 0:
                ((y) this.f1249d).f1328a.getClass();
                return null;
            default:
                return null;
        }
    }

    @Override // N1.u
    public final void c(Status status) {
        this.f1247b.b(new M1.d(status));
    }

    @Override // N1.u
    public final void d(RuntimeException runtimeException) {
        this.f1247b.b(runtimeException);
    }

    @Override // N1.u
    public final void e(o oVar) {
        try {
            h(oVar);
        } catch (DeadObjectException e4) {
            c(u.g(e4));
            throw e4;
        } catch (RemoteException e5) {
            c(u.g(e5));
        } catch (RuntimeException e6) {
            this.f1247b.b(e6);
        }
    }

    @Override // N1.u
    public final /* bridge */ /* synthetic */ void f(B1.d dVar, boolean z4) {
        int i4 = this.f1248c;
    }

    public final void h(o oVar) {
        switch (this.f1248c) {
            case 0:
                B1.d dVar = ((y) this.f1249d).f1328a;
                ((Y.x) ((W.p) dVar.f97n).f2683b).J(oVar.f1290d, this.f1247b);
                g gVar = ((h) ((y) this.f1249d).f1328a.f96m).f1283c;
                if (gVar != null) {
                    oVar.f1294h.put(gVar, (y) this.f1249d);
                    return;
                }
                return;
            default:
                y yVar = (y) oVar.f1294h.remove((g) this.f1249d);
                if (yVar != null) {
                    ((Y1.a) ((W.p) yVar.f1329b.f1009m).f2684c).J(oVar.f1290d, this.f1247b);
                    h hVar = (h) yVar.f1328a.f96m;
                    hVar.f1282b = null;
                    hVar.f1283c = null;
                    return;
                }
                C0241d c0241d = this.f1247b;
                Boolean bool = Boolean.FALSE;
                C0246i c0246i = c0241d.f4974a;
                synchronized (c0246i.f4981a) {
                    try {
                        if (!c0246i.f4983c) {
                            c0246i.f4983c = true;
                            c0246i.f4985e = bool;
                            c0246i.f4982b.f(c0246i);
                        }
                    } finally {
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public B(g gVar, C0241d c0241d) {
        this(4, c0241d);
        this.f1248c = 1;
        this.f1249d = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public B(y yVar, C0241d c0241d) {
        this(3, c0241d);
        this.f1248c = 0;
        this.f1249d = yVar;
    }
}
