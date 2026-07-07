package o0;

import L1.g;
import T.C0094o;
import T.C0095p;
import T.H;
import T.V;
import Y.C;
import Y.h;
import a0.Q;
import a0.m0;
import b0.d;
import f0.e;
import f0.i;
import f2.G;
import f2.I;
import f2.c0;
import f2.r;
import java.util.AbstractList;
import java.util.ArrayList;
import q0.C0480l;
import q0.InterfaceC0466C;
import q0.InterfaceC0467D;
import q0.a0;
import q0.b0;
import q0.k0;
import r0.C0506h;
import t0.C0560b;
import t0.s;
import u0.o;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456b implements InterfaceC0467D, b0 {

    /* renamed from: l, reason: collision with root package name */
    public final Y1.a f7543l;

    /* renamed from: m, reason: collision with root package name */
    public final C f7544m;

    /* renamed from: n, reason: collision with root package name */
    public final o f7545n;

    /* renamed from: o, reason: collision with root package name */
    public final i f7546o;

    /* renamed from: p, reason: collision with root package name */
    public final e f7547p;

    /* renamed from: q, reason: collision with root package name */
    public final C0560b f7548q;

    /* renamed from: r, reason: collision with root package name */
    public final e f7549r;
    public final u0.e s;

    /* renamed from: t, reason: collision with root package name */
    public final k0 f7550t;

    /* renamed from: u, reason: collision with root package name */
    public final g f7551u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0466C f7552v;
    public p0.c w;

    /* renamed from: x, reason: collision with root package name */
    public C0506h[] f7553x;

    /* renamed from: y, reason: collision with root package name */
    public C0480l f7554y;

    public C0456b(p0.c cVar, Y1.a aVar, C c4, g gVar, i iVar, e eVar, C0560b c0560b, e eVar2, o oVar, u0.e eVar3) {
        this.w = cVar;
        this.f7543l = aVar;
        this.f7544m = c4;
        this.f7545n = oVar;
        this.f7546o = iVar;
        this.f7547p = eVar;
        this.f7548q = c0560b;
        this.f7549r = eVar2;
        this.s = eVar3;
        this.f7551u = gVar;
        V[] vArr = new V[cVar.f7615f.length];
        int i4 = 0;
        while (true) {
            p0.b[] bVarArr = cVar.f7615f;
            if (i4 >= bVarArr.length) {
                this.f7550t = new k0(vArr);
                this.f7553x = new C0506h[0];
                gVar.getClass();
                G g4 = I.f5510m;
                c0 c0Var = c0.f5550p;
                this.f7554y = new C0480l(c0Var, c0Var);
                return;
            }
            C0095p[] c0095pArr = bVarArr[i4].f7603j;
            C0095p[] c0095pArr2 = new C0095p[c0095pArr.length];
            for (int i5 = 0; i5 < c0095pArr.length; i5++) {
                C0095p c0095p = c0095pArr[i5];
                C0094o a4 = c0095p.a();
                a4.f2278I = iVar.d(c0095p);
                C0095p c0095p2 = new C0095p(a4);
                if (aVar.f3078l && ((g) aVar.f3080n).o(c0095p2)) {
                    C0094o a5 = c0095p2.a();
                    a5.f2290l = H.l("application/x-media3-cues");
                    a5.f2275F = ((g) aVar.f3080n).e(c0095p2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(c0095p2.f2325m);
                    String str = c0095p2.f2322j;
                    sb.append(str != null ? " ".concat(str) : "");
                    a5.f2287i = sb.toString();
                    a5.f2295q = Long.MAX_VALUE;
                    c0095p2 = new C0095p(a5);
                }
                c0095pArr2[i5] = c0095p2;
            }
            vArr[i4] = new V(Integer.toString(i4), c0095pArr2);
            i4++;
        }
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        for (C0506h c0506h : this.f7553x) {
            if (c0506h.f8041l == 2) {
                return c0506h.f8045p.b(j4, m0Var);
            }
        }
        return j4;
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f7554y.c();
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        return this.f7550t;
    }

    @Override // q0.b0
    public final void f(q0.c0 c0Var) {
        InterfaceC0466C interfaceC0466C = this.f7552v;
        interfaceC0466C.getClass();
        interfaceC0466C.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        this.f7552v = interfaceC0466C;
        interfaceC0466C.o(this);
    }

    @Override // q0.c0
    public final long h() {
        return this.f7554y.h();
    }

    @Override // q0.c0
    public final boolean i(Q q4) {
        return this.f7554y.i(q4);
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        this.f7545n.a();
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        for (C0506h c0506h : this.f7553x) {
            c0506h.C(j4);
        }
        return j4;
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        for (C0506h c0506h : this.f7553x) {
            c0506h.m(j4);
        }
    }

    @Override // q0.InterfaceC0467D
    public final long p(s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        int i4;
        s sVar;
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < sVarArr.length) {
            a0 a0Var = a0VarArr[i5];
            if (a0Var != null) {
                C0506h c0506h = (C0506h) a0Var;
                s sVar2 = sVarArr[i5];
                if (sVar2 == null || !zArr[i5]) {
                    c0506h.B(null);
                    a0VarArr[i5] = null;
                } else {
                    ((C0455a) c0506h.f8045p).f7539e = sVar2;
                    arrayList.add(c0506h);
                }
            }
            if (a0VarArr[i5] != null || (sVar = sVarArr[i5]) == null) {
                i4 = i5;
            } else {
                int b4 = this.f7550t.b(sVar.b());
                p0.c cVar = this.w;
                Y1.a aVar = this.f7543l;
                h a4 = ((Y.g) aVar.f3079m).a();
                C c4 = this.f7544m;
                if (c4 != null) {
                    a4.j(c4);
                }
                i4 = i5;
                C0506h c0506h2 = new C0506h(this.w.f7615f[b4].f7594a, null, null, new C0455a(this.f7545n, cVar, b4, sVar, a4, (g) aVar.f3080n, aVar.f3078l), this, this.s, j4, this.f7546o, this.f7547p, this.f7548q, this.f7549r);
                arrayList.add(c0506h2);
                a0VarArr[i4] = c0506h2;
                zArr2[i4] = true;
            }
            i5 = i4 + 1;
        }
        C0506h[] c0506hArr = new C0506h[arrayList.size()];
        this.f7553x = c0506hArr;
        arrayList.toArray(c0506hArr);
        AbstractList w = r.w(arrayList, new d(15));
        this.f7551u.getClass();
        this.f7554y = new C0480l(arrayList, w);
        return j4;
    }

    @Override // q0.c0
    public final long r() {
        return this.f7554y.r();
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // q0.c0
    public final void w(long j4) {
        this.f7554y.w(j4);
    }
}
