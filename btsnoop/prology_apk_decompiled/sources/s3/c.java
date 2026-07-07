package s3;

import android.os.Handler;
import android.os.Looper;
import b3.InterfaceC0195i;
import java.util.concurrent.CancellationException;
import k3.h;
import r3.AbstractC0531s;
import r3.B;
import r3.C0532t;
import r3.InterfaceC0537y;
import r3.P;
import w3.o;

/* loaded from: classes.dex */
public final class c extends AbstractC0531s implements InterfaceC0537y {
    private volatile c _immediate;

    /* renamed from: n, reason: collision with root package name */
    public final Handler f8271n;

    /* renamed from: o, reason: collision with root package name */
    public final String f8272o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f8273p;

    /* renamed from: q, reason: collision with root package name */
    public final c f8274q;

    public c(Handler handler, String str, boolean z4) {
        this.f8271n = handler;
        this.f8272o = str;
        this.f8273p = z4;
        this._immediate = z4 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f8274q = cVar;
    }

    @Override // r3.AbstractC0531s
    public final void e(InterfaceC0195i interfaceC0195i, Runnable runnable) {
        if (this.f8271n.post(runnable)) {
            return;
        }
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        P p2 = (P) interfaceC0195i.j(C0532t.f8178m);
        if (p2 != null) {
            p2.b(cancellationException);
        }
        B.f8111b.e(interfaceC0195i, runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f8271n == this.f8271n;
    }

    @Override // r3.AbstractC0531s
    public final boolean f() {
        return (this.f8273p && h.a(Looper.myLooper(), this.f8271n.getLooper())) ? false : true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8271n);
    }

    @Override // r3.AbstractC0531s
    public final String toString() {
        c cVar;
        String str;
        y3.d dVar = B.f8110a;
        c cVar2 = o.f8942a;
        if (this == cVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                cVar = cVar2.f8274q;
            } catch (UnsupportedOperationException unused) {
                cVar = null;
            }
            str = this == cVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f8272o;
        if (str2 == null) {
            str2 = this.f8271n.toString();
        }
        if (!this.f8273p) {
            return str2;
        }
        return str2 + ".immediate";
    }

    public c(Handler handler) {
        this(handler, null, false);
    }
}
