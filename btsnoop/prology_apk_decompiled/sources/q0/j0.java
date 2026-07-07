package q0;

import a0.m0;

/* loaded from: classes.dex */
public final class j0 implements InterfaceC0467D, InterfaceC0466C {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0467D f7871l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7872m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0466C f7873n;

    public j0(InterfaceC0467D interfaceC0467D, long j4) {
        this.f7871l = interfaceC0467D;
        this.f7872m = j4;
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        long j5 = this.f7872m;
        return this.f7871l.b(j4 - j5, m0Var) + j5;
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f7871l.c();
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        return this.f7871l.e();
    }

    @Override // q0.b0
    public final void f(c0 c0Var) {
        InterfaceC0466C interfaceC0466C = this.f7873n;
        interfaceC0466C.getClass();
        interfaceC0466C.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        this.f7873n = interfaceC0466C;
        this.f7871l.g(this, j4 - this.f7872m);
    }

    @Override // q0.c0
    public final long h() {
        long h4 = this.f7871l.h();
        if (h4 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f7872m + h4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a0.P] */
    @Override // q0.c0
    public final boolean i(a0.Q q4) {
        ?? obj = new Object();
        obj.f3330b = q4.f3333b;
        obj.f3331c = q4.f3334c;
        obj.f3329a = q4.f3332a - this.f7872m;
        return this.f7871l.i(new a0.Q(obj));
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        this.f7871l.j();
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        long j5 = this.f7872m;
        return this.f7871l.l(j4 - j5) + j5;
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        this.f7871l.m(j4 - this.f7872m);
    }

    @Override // q0.InterfaceC0466C
    public final void o(InterfaceC0467D interfaceC0467D) {
        InterfaceC0466C interfaceC0466C = this.f7873n;
        interfaceC0466C.getClass();
        interfaceC0466C.o(this);
    }

    @Override // q0.InterfaceC0467D
    public final long p(t0.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        a0[] a0VarArr2 = new a0[a0VarArr.length];
        int i4 = 0;
        while (true) {
            a0 a0Var = null;
            if (i4 >= a0VarArr.length) {
                break;
            }
            i0 i0Var = (i0) a0VarArr[i4];
            if (i0Var != null) {
                a0Var = i0Var.f7867l;
            }
            a0VarArr2[i4] = a0Var;
            i4++;
        }
        long j5 = this.f7872m;
        long p2 = this.f7871l.p(sVarArr, zArr, a0VarArr2, zArr2, j4 - j5);
        for (int i5 = 0; i5 < a0VarArr.length; i5++) {
            a0 a0Var2 = a0VarArr2[i5];
            if (a0Var2 == null) {
                a0VarArr[i5] = null;
            } else {
                a0 a0Var3 = a0VarArr[i5];
                if (a0Var3 == null || ((i0) a0Var3).f7867l != a0Var2) {
                    a0VarArr[i5] = new i0(a0Var2, j5);
                }
            }
        }
        return p2 + j5;
    }

    @Override // q0.c0
    public final long r() {
        long r4 = this.f7871l.r();
        if (r4 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f7872m + r4;
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        long u4 = this.f7871l.u();
        if (u4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f7872m + u4;
    }

    @Override // q0.c0
    public final void w(long j4) {
        this.f7871l.w(j4 - this.f7872m);
    }
}
