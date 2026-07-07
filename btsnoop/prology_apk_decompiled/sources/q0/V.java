package q0;

import T.C0103y;
import android.os.Looper;
import t0.C0560b;

/* loaded from: classes.dex */
public final class V extends AbstractC0469a {

    /* renamed from: A, reason: collision with root package name */
    public boolean f7759A;

    /* renamed from: B, reason: collision with root package name */
    public Y.C f7760B;

    /* renamed from: C, reason: collision with root package name */
    public T.B f7761C;
    public final B1.d s;

    /* renamed from: t, reason: collision with root package name */
    public final B2.x f7762t;

    /* renamed from: u, reason: collision with root package name */
    public final f0.i f7763u;

    /* renamed from: v, reason: collision with root package name */
    public final C0560b f7764v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7765x = true;

    /* renamed from: y, reason: collision with root package name */
    public long f7766y = -9223372036854775807L;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7767z;

    public V(T.B b4, B1.d dVar, B2.x xVar, f0.i iVar, C0560b c0560b, int i4) {
        this.f7761C = b4;
        this.s = dVar;
        this.f7762t = xVar;
        this.f7763u = iVar;
        this.f7764v = c0560b;
        this.w = i4;
    }

    @Override // q0.AbstractC0469a
    public final InterfaceC0467D b(F f4, u0.e eVar, long j4) {
        Y.h a4 = this.s.a();
        Y.C c4 = this.f7760B;
        if (c4 != null) {
            ((Y.m) a4).j(c4);
        }
        C0103y c0103y = h().f2067b;
        c0103y.getClass();
        W.a.k(this.f7814r);
        android.support.v4.media.session.t tVar = new android.support.v4.media.session.t((y0.r) this.f7762t.f214m);
        f0.e eVar2 = new f0.e(this.f7811o.f5456c, 0, f4);
        f0.e a5 = a(f4);
        long M3 = W.y.M(c0103y.f2369f);
        return new T(c0103y.f2364a, a4, tVar, this.f7763u, eVar2, this.f7764v, a5, this, eVar, this.w, M3);
    }

    @Override // q0.AbstractC0469a
    public final synchronized T.B h() {
        return this.f7761C;
    }

    @Override // q0.AbstractC0469a
    public final void j() {
    }

    @Override // q0.AbstractC0469a
    public final void m(Y.C c4) {
        this.f7760B = c4;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        b0.l lVar = this.f7814r;
        W.a.k(lVar);
        f0.i iVar = this.f7763u;
        iVar.b(myLooper, lVar);
        iVar.c();
        v();
    }

    @Override // q0.AbstractC0469a
    public final void o(InterfaceC0467D interfaceC0467D) {
        T t4 = (T) interfaceC0467D;
        if (t4.f7724G) {
            for (Z z4 : t4.f7721D) {
                z4.g();
                K2.o oVar = z4.f7791h;
                if (oVar != null) {
                    oVar.K(z4.f7788e);
                    z4.f7791h = null;
                    z4.f7790g = null;
                }
            }
        }
        t4.f7750v.e(t4);
        t4.f7718A.removeCallbacksAndMessages(null);
        t4.f7719B = null;
        t4.f7740X = true;
    }

    @Override // q0.AbstractC0469a
    public final void r() {
        this.f7763u.release();
    }

    @Override // q0.AbstractC0469a
    public final synchronized void u(T.B b4) {
        this.f7761C = b4;
    }

    public final void v() {
        T.U h0Var = new h0(this.f7766y, this.f7767z, this.f7759A, h());
        if (this.f7765x) {
            h0Var = new m0.s(h0Var, 1);
        }
        n(h0Var);
    }

    public final void w(long j4, boolean z4, boolean z5) {
        if (j4 == -9223372036854775807L) {
            j4 = this.f7766y;
        }
        if (!this.f7765x && this.f7766y == j4 && this.f7767z == z4 && this.f7759A == z5) {
            return;
        }
        this.f7766y = j4;
        this.f7767z = z4;
        this.f7759A = z5;
        this.f7765x = false;
        v();
    }
}
