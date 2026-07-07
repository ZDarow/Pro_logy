package b0;

import B2.x;
import C.C0016c;
import T.B;
import T.C0084e;
import T.E;
import T.G;
import T.K;
import T.L;
import T.M;
import T.N;
import T.O;
import T.S;
import T.T;
import T.U;
import T.a0;
import T.d0;
import W.t;
import W.v;
import W.y;
import a0.C0114D;
import a0.C0118H;
import a0.C0133m;
import a0.C0144y;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import f2.I;
import f2.h0;
import java.io.IOException;
import java.util.List;
import q0.C0491x;
import q0.F;
import q0.J;
import t0.C0569k;

/* loaded from: classes.dex */
public final class e implements M, J, f0.f {

    /* renamed from: l, reason: collision with root package name */
    public final t f4341l;

    /* renamed from: m, reason: collision with root package name */
    public final S f4342m;

    /* renamed from: n, reason: collision with root package name */
    public final T f4343n;

    /* renamed from: o, reason: collision with root package name */
    public final C2.d f4344o;

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f4345p;

    /* renamed from: q, reason: collision with root package name */
    public W.k f4346q;

    /* renamed from: r, reason: collision with root package name */
    public O f4347r;
    public v s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4348t;

    public e(t tVar) {
        tVar.getClass();
        this.f4341l = tVar;
        int i4 = y.f2709a;
        Looper myLooper = Looper.myLooper();
        this.f4346q = new W.k(myLooper == null ? Looper.getMainLooper() : myLooper, tVar, new c(7));
        S s = new S();
        this.f4342m = s;
        this.f4343n = new T();
        this.f4344o = new C2.d(s);
        this.f4345p = new SparseArray();
    }

    @Override // T.M
    public final void A(int i4, boolean z4) {
        K(a(), 5, new c(5));
    }

    @Override // T.M
    public final void B(float f4) {
        K(J(), 22, new C0016c(22));
    }

    @Override // T.M
    public final void C(L l4) {
        K(a(), 13, new C0016c(18));
    }

    @Override // q0.J
    public final void D(int i4, F f4, C0491x c0491x, n0.g gVar) {
        K(I(i4, f4), 1001, new c(26));
    }

    @Override // T.M
    public final void E(boolean z4) {
        K(a(), 7, new C0016c(29));
    }

    public final C0177a F(U u4, int i4, F f4) {
        F f5 = u4.p() ? null : f4;
        this.f4341l.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = u4.equals(((C0118H) this.f4347r).t()) && i4 == ((C0118H) this.f4347r).q();
        long j4 = 0;
        if (f5 == null || !f5.b()) {
            if (z4) {
                C0118H c0118h = (C0118H) this.f4347r;
                c0118h.U();
                j4 = c0118h.n(c0118h.f3242e0);
            } else if (!u4.p()) {
                j4 = y.Z(u4.m(i4, this.f4343n, 0L).f2163l);
            }
        } else if (z4 && ((C0118H) this.f4347r).o() == f5.f7669b && ((C0118H) this.f4347r).p() == f5.f7670c) {
            j4 = ((C0118H) this.f4347r).r();
        }
        F f6 = (F) this.f4344o.f370d;
        U t4 = ((C0118H) this.f4347r).t();
        int q4 = ((C0118H) this.f4347r).q();
        long r4 = ((C0118H) this.f4347r).r();
        C0118H c0118h2 = (C0118H) this.f4347r;
        c0118h2.U();
        return new C0177a(elapsedRealtime, u4, i4, f5, j4, t4, q4, f6, r4, y.Z(c0118h2.f3242e0.f3476r));
    }

    public final C0177a G(F f4) {
        this.f4347r.getClass();
        U u4 = f4 == null ? null : (U) ((h0) this.f4344o.f369c).get(f4);
        if (f4 != null && u4 != null) {
            return F(u4, u4.g(f4.f7668a, this.f4342m).f2145c, f4);
        }
        int q4 = ((C0118H) this.f4347r).q();
        U t4 = ((C0118H) this.f4347r).t();
        if (q4 >= t4.o()) {
            t4 = U.f2168a;
        }
        return F(t4, q4, null);
    }

    @Override // q0.J
    public final void H(int i4, F f4, C0491x c0491x, n0.g gVar) {
        K(I(i4, f4), 1002, new c(25));
    }

    public final C0177a I(int i4, F f4) {
        this.f4347r.getClass();
        if (f4 != null) {
            return ((U) ((h0) this.f4344o.f369c).get(f4)) != null ? G(f4) : F(U.f2168a, i4, f4);
        }
        U t4 = ((C0118H) this.f4347r).t();
        if (i4 >= t4.o()) {
            t4 = U.f2168a;
        }
        return F(t4, i4, null);
    }

    public final C0177a J() {
        return G((F) this.f4344o.f372f);
    }

    public final void K(C0177a c0177a, int i4, W.h hVar) {
        this.f4345p.put(i4, c0177a);
        this.f4346q.e(i4, hVar);
    }

    @Override // q0.J
    public final void L(int i4, F f4, C0491x c0491x, n0.g gVar, IOException iOException, boolean z4) {
        C0177a I3 = I(i4, f4);
        K(I3, 1003, new x(I3, c0491x, gVar, iOException, z4));
    }

    public final void M(O o2, Looper looper) {
        W.a.j(this.f4347r == null || ((I) this.f4344o.f368b).isEmpty());
        o2.getClass();
        this.f4347r = o2;
        this.s = this.f4341l.a(looper, null);
        W.k kVar = this.f4346q;
        this.f4346q = new W.k(kVar.f2667d, looper, kVar.f2664a, new b(0, this, o2), kVar.f2672i);
    }

    public final C0177a a() {
        return G((F) this.f4344o.f370d);
    }

    @Override // T.M
    public final void b(int i4) {
        K(a(), 8, new c(16));
    }

    @Override // T.M
    public final void c(int i4) {
        K(a(), 6, new c(1));
    }

    @Override // T.M
    public final void d(C0569k c0569k) {
        C0177a a4 = a();
        K(a4, 19, new d(a4, c0569k));
    }

    @Override // T.M
    public final void e(int i4, N n4, N n5) {
        if (i4 == 1) {
            this.f4348t = false;
        }
        O o2 = this.f4347r;
        o2.getClass();
        C2.d dVar = this.f4344o;
        dVar.f370d = C2.d.e(o2, (I) dVar.f368b, (F) dVar.f371e, (S) dVar.f367a);
        C0177a a4 = a();
        K(a4, 11, new C0144y(a4, i4, n4, n5));
    }

    @Override // T.M
    public final void f(int i4) {
        K(a(), 4, new c(10));
    }

    @Override // q0.J
    public final void g(int i4, F f4, C0491x c0491x, n0.g gVar) {
        K(I(i4, f4), 1000, new d(4));
    }

    @Override // T.M
    public final void h(int i4) {
        O o2 = this.f4347r;
        o2.getClass();
        C2.d dVar = this.f4344o;
        dVar.f370d = C2.d.e(o2, (I) dVar.f368b, (F) dVar.f371e, (S) dVar.f367a);
        dVar.j(((C0118H) o2).t());
        K(a(), 0, new C0016c(19));
    }

    @Override // T.M
    public final void i(E e4) {
        K(a(), 14, new c(24));
    }

    @Override // T.M
    public final void j(C0084e c0084e) {
        K(J(), 20, new C0016c(25));
    }

    @Override // T.M
    public final void k(V.c cVar) {
        K(a(), 27, new c(15));
    }

    @Override // T.M
    public final void l(T.J j4) {
        F f4;
        K((!(j4 instanceof C0133m) || (f4 = ((C0133m) j4).s) == null) ? a() : G(f4), 10, new c(4));
    }

    @Override // T.M
    public final void m(d0 d0Var) {
        C0177a J = J();
        K(J, 25, new C0114D(J, d0Var));
    }

    @Override // T.M
    public final void n(a0 a0Var) {
        K(a(), 2, new C0016c(27));
    }

    @Override // T.M
    public final void o(boolean z4) {
        K(a(), 9, new c(20));
    }

    @Override // T.M
    public final void p(K k4) {
        K(a(), 12, new C0016c(17));
    }

    @Override // T.M
    public final void q(B b4, int i4) {
        K(a(), 1, new C0016c(20));
    }

    @Override // T.M
    public final void r(int i4, int i5) {
        K(J(), 24, new c(21));
    }

    @Override // T.M
    public final void s(boolean z4) {
        K(a(), 3, new d(2));
    }

    @Override // T.M
    public final void t(T.J j4) {
        F f4;
        C0177a a4 = (!(j4 instanceof C0133m) || (f4 = ((C0133m) j4).s) == null) ? a() : G(f4);
        K(a4, 10, new x(a4, (Object) j4, 22));
    }

    @Override // T.M
    public final void u(boolean z4) {
        K(J(), 23, new C0016c(21));
    }

    @Override // T.M
    public final void v(G g4) {
        K(a(), 28, new C0016c(26));
    }

    @Override // T.M
    public final void w(List list) {
        K(a(), 27, new c(6));
    }

    @Override // q0.J
    public final void x(int i4, F f4, n0.g gVar) {
        K(I(i4, f4), 1005, new c(27));
    }

    @Override // T.M
    public final void y(int i4, boolean z4) {
        K(a(), -1, new C0016c(24));
    }

    @Override // q0.J
    public final void z(int i4, F f4, n0.g gVar) {
        C0177a I3 = I(i4, f4);
        K(I3, 1004, new b(1, I3, gVar));
    }
}
