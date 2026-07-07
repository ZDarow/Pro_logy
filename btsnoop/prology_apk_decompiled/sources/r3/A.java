package r3;

import a.AbstractC0110a;
import b3.InterfaceC0190d;
import b3.InterfaceC0195i;
import java.util.concurrent.CancellationException;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
public abstract class A extends y3.h {

    /* renamed from: n, reason: collision with root package name */
    public int f8109n;

    public A(int i4) {
        super(0L, y3.j.f9178g);
        this.f8109n = i4;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0190d c();

    public Throwable e(Object obj) {
        C0527n c0527n = obj instanceof C0527n ? (C0527n) obj : null;
        if (c0527n != null) {
            return c0527n.f8167a;
        }
        return null;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0110a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        k3.h.b(th);
        AbstractC0534v.d(c().f(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = Z2.g.f3186a;
        B2.C c4 = this.f9170m;
        try {
            InterfaceC0190d c5 = c();
            k3.h.c(c5, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            w3.h hVar = (w3.h) c5;
            d3.b bVar = hVar.f8922p;
            Object obj2 = hVar.f8924r;
            InterfaceC0195i f4 = bVar.f();
            Object m4 = w3.a.m(f4, obj2);
            j0 m5 = m4 != w3.a.f8913f ? AbstractC0534v.m(bVar, f4, m4) : null;
            try {
                InterfaceC0195i f5 = bVar.f();
                Object j4 = j();
                Throwable e4 = e(j4);
                P p2 = (e4 == null && AbstractC0534v.f(this.f8109n)) ? (P) f5.j(C0532t.f8178m) : null;
                if (p2 != null && !p2.a()) {
                    CancellationException A4 = ((Z) p2).A();
                    b(j4, A4);
                    bVar.i(AbstractC0462a.s(A4));
                } else if (e4 != null) {
                    bVar.i(AbstractC0462a.s(e4));
                } else {
                    bVar.i(g(j4));
                }
                if (m5 == null || m5.X()) {
                    w3.a.h(f4, m4);
                }
                try {
                    c4.getClass();
                } catch (Throwable th) {
                    obj = AbstractC0462a.s(th);
                }
                h(null, Z2.d.a(obj));
            } catch (Throwable th2) {
                if (m5 == null || m5.X()) {
                    w3.a.h(f4, m4);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                c4.getClass();
            } catch (Throwable th4) {
                obj = AbstractC0462a.s(th4);
            }
            h(th3, Z2.d.a(obj));
        }
    }
}
