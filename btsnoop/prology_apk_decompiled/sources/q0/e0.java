package q0;

import a0.m0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 implements InterfaceC0467D {

    /* renamed from: n, reason: collision with root package name */
    public static final k0 f7832n = new k0(new T.V("", g0.f7846u));

    /* renamed from: l, reason: collision with root package name */
    public final long f7833l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f7834m = new ArrayList();

    public e0(long j4) {
        this.f7833l = j4;
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        return W.y.k(j4, 0L, this.f7833l);
    }

    @Override // q0.c0
    public final boolean c() {
        return false;
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        return f7832n;
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        interfaceC0466C.o(this);
    }

    @Override // q0.c0
    public final long h() {
        return Long.MIN_VALUE;
    }

    @Override // q0.c0
    public final boolean i(a0.Q q4) {
        return false;
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        long k4 = W.y.k(j4, 0L, this.f7833l);
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f7834m;
            if (i4 >= arrayList.size()) {
                return k4;
            }
            ((f0) arrayList.get(i4)).b(k4);
            i4++;
        }
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
    }

    @Override // q0.InterfaceC0467D
    public final long p(t0.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        long k4 = W.y.k(j4, 0L, this.f7833l);
        for (int i4 = 0; i4 < sVarArr.length; i4++) {
            a0 a0Var = a0VarArr[i4];
            ArrayList arrayList = this.f7834m;
            if (a0Var != null && (sVarArr[i4] == null || !zArr[i4])) {
                arrayList.remove(a0Var);
                a0VarArr[i4] = null;
            }
            if (a0VarArr[i4] == null && sVarArr[i4] != null) {
                f0 f0Var = new f0(this.f7833l);
                f0Var.b(k4);
                arrayList.add(f0Var);
                a0VarArr[i4] = f0Var;
                zArr2[i4] = true;
            }
        }
        return k4;
    }

    @Override // q0.c0
    public final long r() {
        return Long.MIN_VALUE;
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // q0.c0
    public final void w(long j4) {
    }
}
