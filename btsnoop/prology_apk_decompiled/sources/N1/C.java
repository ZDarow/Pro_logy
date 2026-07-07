package N1;

import B2.E;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import d2.AbstractC0242e;
import d2.C0241d;
import d2.C0244g;
import d2.C0246i;
import java.util.Map;

/* loaded from: classes.dex */
public final class C extends u {

    /* renamed from: b, reason: collision with root package name */
    public final E f1250b;

    /* renamed from: c, reason: collision with root package name */
    public final C0241d f1251c;

    /* renamed from: d, reason: collision with root package name */
    public final C0057a f1252d;

    public C(int i4, E e4, C0241d c0241d, C0057a c0057a) {
        super(i4);
        this.f1251c = c0241d;
        this.f1250b = e4;
        this.f1252d = c0057a;
        if (i4 == 2 && e4.f118b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // N1.u
    public final boolean a(o oVar) {
        return this.f1250b.f118b;
    }

    @Override // N1.u
    public final L1.c[] b(o oVar) {
        return (L1.c[]) this.f1250b.f120d;
    }

    @Override // N1.u
    public final void c(Status status) {
        this.f1252d.getClass();
        this.f1251c.b(status.f4739n != null ? new M1.d(status) : new M1.d(status));
    }

    @Override // N1.u
    public final void d(RuntimeException runtimeException) {
        this.f1251c.b(runtimeException);
    }

    @Override // N1.u
    public final void e(o oVar) {
        C0241d c0241d = this.f1251c;
        try {
            E e4 = this.f1250b;
            ((j) ((E) e4.f121e).f120d).J(oVar.f1290d, c0241d);
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e6) {
            c(u.g(e6));
        } catch (RuntimeException e7) {
            c0241d.b(e7);
        }
    }

    @Override // N1.u
    public final void f(B1.d dVar, boolean z4) {
        Boolean valueOf = Boolean.valueOf(z4);
        Map map = (Map) dVar.f97n;
        C0241d c0241d = this.f1251c;
        map.put(c0241d, valueOf);
        B1.d dVar2 = new B1.d(20, dVar, c0241d);
        C0246i c0246i = c0241d.f4974a;
        c0246i.getClass();
        c0246i.f4982b.e(new C0244g(AbstractC0242e.f4975a, dVar2));
        c0246i.f();
    }
}
