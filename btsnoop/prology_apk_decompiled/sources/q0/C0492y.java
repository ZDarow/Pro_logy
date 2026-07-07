package q0;

import a0.m0;

/* renamed from: q0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492y implements InterfaceC0467D, InterfaceC0466C {

    /* renamed from: l, reason: collision with root package name */
    public final F f7931l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7932m;

    /* renamed from: n, reason: collision with root package name */
    public final u0.e f7933n;

    /* renamed from: o, reason: collision with root package name */
    public AbstractC0469a f7934o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0467D f7935p;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0466C f7936q;

    /* renamed from: r, reason: collision with root package name */
    public long f7937r = -9223372036854775807L;

    public C0492y(F f4, u0.e eVar, long j4) {
        this.f7931l = f4;
        this.f7933n = eVar;
        this.f7932m = j4;
    }

    public final void a(F f4) {
        long j4 = this.f7937r;
        if (j4 == -9223372036854775807L) {
            j4 = this.f7932m;
        }
        AbstractC0469a abstractC0469a = this.f7934o;
        abstractC0469a.getClass();
        InterfaceC0467D b4 = abstractC0469a.b(f4, this.f7933n, j4);
        this.f7935p = b4;
        if (this.f7936q != null) {
            b4.g(this, j4);
        }
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        return interfaceC0467D.b(j4, m0Var);
    }

    @Override // q0.c0
    public final boolean c() {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        return interfaceC0467D != null && interfaceC0467D.c();
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        return interfaceC0467D.e();
    }

    @Override // q0.b0
    public final void f(c0 c0Var) {
        InterfaceC0466C interfaceC0466C = this.f7936q;
        int i4 = W.y.f2709a;
        interfaceC0466C.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        this.f7936q = interfaceC0466C;
        InterfaceC0467D interfaceC0467D = this.f7935p;
        if (interfaceC0467D != null) {
            long j5 = this.f7937r;
            if (j5 == -9223372036854775807L) {
                j5 = this.f7932m;
            }
            interfaceC0467D.g(this, j5);
        }
    }

    @Override // q0.c0
    public final long h() {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        return interfaceC0467D.h();
    }

    @Override // q0.c0
    public final boolean i(a0.Q q4) {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        return interfaceC0467D != null && interfaceC0467D.i(q4);
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        if (interfaceC0467D != null) {
            interfaceC0467D.j();
            return;
        }
        AbstractC0469a abstractC0469a = this.f7934o;
        if (abstractC0469a != null) {
            abstractC0469a.j();
        }
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        return interfaceC0467D.l(j4);
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        interfaceC0467D.m(j4);
    }

    @Override // q0.InterfaceC0466C
    public final void o(InterfaceC0467D interfaceC0467D) {
        InterfaceC0466C interfaceC0466C = this.f7936q;
        int i4 = W.y.f2709a;
        interfaceC0466C.o(this);
    }

    @Override // q0.InterfaceC0467D
    public final long p(t0.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        long j5 = this.f7937r;
        long j6 = (j5 == -9223372036854775807L || j4 != this.f7932m) ? j4 : j5;
        this.f7937r = -9223372036854775807L;
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        return interfaceC0467D.p(sVarArr, zArr, a0VarArr, zArr2, j6);
    }

    @Override // q0.c0
    public final long r() {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        return interfaceC0467D.r();
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        return interfaceC0467D.u();
    }

    @Override // q0.c0
    public final void w(long j4) {
        InterfaceC0467D interfaceC0467D = this.f7935p;
        int i4 = W.y.f2709a;
        interfaceC0467D.w(j4);
    }
}
