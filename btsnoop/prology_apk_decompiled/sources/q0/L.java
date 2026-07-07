package q0;

import T.C0094o;
import T.C0095p;
import a0.m0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class L implements InterfaceC0467D, InterfaceC0466C {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0467D[] f7682l;

    /* renamed from: m, reason: collision with root package name */
    public final IdentityHashMap f7683m;

    /* renamed from: n, reason: collision with root package name */
    public final L1.g f7684n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f7685o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f7686p = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0466C f7687q;

    /* renamed from: r, reason: collision with root package name */
    public k0 f7688r;
    public InterfaceC0467D[] s;

    /* renamed from: t, reason: collision with root package name */
    public C0480l f7689t;

    public L(L1.g gVar, long[] jArr, InterfaceC0467D... interfaceC0467DArr) {
        this.f7684n = gVar;
        this.f7682l = interfaceC0467DArr;
        gVar.getClass();
        f2.G g4 = f2.I.f5510m;
        f2.c0 c0Var = f2.c0.f5550p;
        this.f7689t = new C0480l(c0Var, c0Var);
        this.f7683m = new IdentityHashMap();
        this.s = new InterfaceC0467D[0];
        for (int i4 = 0; i4 < interfaceC0467DArr.length; i4++) {
            long j4 = jArr[i4];
            if (j4 != 0) {
                this.f7682l[i4] = new j0(interfaceC0467DArr[i4], j4);
            }
        }
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        InterfaceC0467D[] interfaceC0467DArr = this.s;
        return (interfaceC0467DArr.length > 0 ? interfaceC0467DArr[0] : this.f7682l[0]).b(j4, m0Var);
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f7689t.c();
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        k0 k0Var = this.f7688r;
        k0Var.getClass();
        return k0Var;
    }

    @Override // q0.b0
    public final void f(c0 c0Var) {
        InterfaceC0466C interfaceC0466C = this.f7687q;
        interfaceC0466C.getClass();
        interfaceC0466C.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        this.f7687q = interfaceC0466C;
        ArrayList arrayList = this.f7685o;
        InterfaceC0467D[] interfaceC0467DArr = this.f7682l;
        Collections.addAll(arrayList, interfaceC0467DArr);
        for (InterfaceC0467D interfaceC0467D : interfaceC0467DArr) {
            interfaceC0467D.g(this, j4);
        }
    }

    @Override // q0.c0
    public final long h() {
        return this.f7689t.h();
    }

    @Override // q0.c0
    public final boolean i(a0.Q q4) {
        ArrayList arrayList = this.f7685o;
        if (arrayList.isEmpty()) {
            return this.f7689t.i(q4);
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((InterfaceC0467D) arrayList.get(i4)).i(q4);
        }
        return false;
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        for (InterfaceC0467D interfaceC0467D : this.f7682l) {
            interfaceC0467D.j();
        }
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        long l4 = this.s[0].l(j4);
        int i4 = 1;
        while (true) {
            InterfaceC0467D[] interfaceC0467DArr = this.s;
            if (i4 >= interfaceC0467DArr.length) {
                return l4;
            }
            if (interfaceC0467DArr[i4].l(l4) != l4) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i4++;
        }
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        for (InterfaceC0467D interfaceC0467D : this.s) {
            interfaceC0467D.m(j4);
        }
    }

    @Override // q0.InterfaceC0466C
    public final void o(InterfaceC0467D interfaceC0467D) {
        ArrayList arrayList = this.f7685o;
        arrayList.remove(interfaceC0467D);
        if (arrayList.isEmpty()) {
            InterfaceC0467D[] interfaceC0467DArr = this.f7682l;
            int i4 = 0;
            for (InterfaceC0467D interfaceC0467D2 : interfaceC0467DArr) {
                i4 += interfaceC0467D2.e().f7877a;
            }
            T.V[] vArr = new T.V[i4];
            int i5 = 0;
            for (int i6 = 0; i6 < interfaceC0467DArr.length; i6++) {
                k0 e4 = interfaceC0467DArr[i6].e();
                int i7 = e4.f7877a;
                int i8 = 0;
                while (i8 < i7) {
                    T.V a4 = e4.a(i8);
                    int i9 = a4.f2169a;
                    C0095p[] c0095pArr = new C0095p[i9];
                    for (int i10 = 0; i10 < i9; i10++) {
                        C0095p c0095p = a4.f2172d[i10];
                        C0094o a5 = c0095p.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i6);
                        sb.append(":");
                        String str = c0095p.f2313a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        a5.f2279a = sb.toString();
                        c0095pArr[i10] = new C0095p(a5);
                    }
                    T.V v4 = new T.V(i6 + ":" + a4.f2170b, c0095pArr);
                    this.f7686p.put(v4, a4);
                    vArr[i5] = v4;
                    i8++;
                    i5++;
                }
            }
            this.f7688r = new k0(vArr);
            InterfaceC0466C interfaceC0466C = this.f7687q;
            interfaceC0466C.getClass();
            interfaceC0466C.o(this);
        }
    }

    @Override // q0.InterfaceC0467D
    public final long p(t0.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        IdentityHashMap identityHashMap;
        ArrayList arrayList;
        int[] iArr = new int[sVarArr.length];
        int[] iArr2 = new int[sVarArr.length];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f7683m;
            if (i5 >= length) {
                break;
            }
            a0 a0Var = a0VarArr[i5];
            Integer num = a0Var == null ? null : (Integer) identityHashMap.get(a0Var);
            iArr[i5] = num == null ? -1 : num.intValue();
            t0.s sVar = sVarArr[i5];
            if (sVar != null) {
                String str = sVar.b().f2170b;
                iArr2[i5] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i5] = -1;
            }
            i5++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        a0[] a0VarArr2 = new a0[length2];
        a0[] a0VarArr3 = new a0[sVarArr.length];
        t0.s[] sVarArr2 = new t0.s[sVarArr.length];
        InterfaceC0467D[] interfaceC0467DArr = this.f7682l;
        ArrayList arrayList2 = new ArrayList(interfaceC0467DArr.length);
        long j5 = j4;
        int i6 = 0;
        while (i6 < interfaceC0467DArr.length) {
            int i7 = i4;
            while (i7 < sVarArr.length) {
                a0VarArr3[i7] = iArr[i7] == i6 ? a0VarArr[i7] : null;
                if (iArr2[i7] == i6) {
                    t0.s sVar2 = sVarArr[i7];
                    sVar2.getClass();
                    arrayList = arrayList2;
                    T.V v4 = (T.V) this.f7686p.get(sVar2.b());
                    v4.getClass();
                    sVarArr2[i7] = new K(sVar2, v4);
                } else {
                    arrayList = arrayList2;
                    sVarArr2[i7] = null;
                }
                i7++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i8 = i6;
            InterfaceC0467D[] interfaceC0467DArr2 = interfaceC0467DArr;
            t0.s[] sVarArr3 = sVarArr2;
            long p2 = interfaceC0467DArr[i6].p(sVarArr2, zArr, a0VarArr3, zArr2, j5);
            if (i8 == 0) {
                j5 = p2;
            } else if (p2 != j5) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z4 = false;
            for (int i9 = 0; i9 < sVarArr.length; i9++) {
                if (iArr2[i9] == i8) {
                    a0 a0Var2 = a0VarArr3[i9];
                    a0Var2.getClass();
                    a0VarArr2[i9] = a0VarArr3[i9];
                    identityHashMap.put(a0Var2, Integer.valueOf(i8));
                    z4 = true;
                } else if (iArr[i9] == i8) {
                    W.a.j(a0VarArr3[i9] == null);
                }
            }
            if (z4) {
                arrayList3.add(interfaceC0467DArr2[i8]);
            }
            i6 = i8 + 1;
            arrayList2 = arrayList3;
            interfaceC0467DArr = interfaceC0467DArr2;
            sVarArr2 = sVarArr3;
            i4 = 0;
        }
        int i10 = i4;
        ArrayList arrayList4 = arrayList2;
        System.arraycopy(a0VarArr2, i10, a0VarArr, i10, length2);
        this.s = (InterfaceC0467D[]) arrayList4.toArray(new InterfaceC0467D[i10]);
        AbstractList w = f2.r.w(arrayList4, new b0.d(17));
        this.f7684n.getClass();
        this.f7689t = new C0480l(arrayList4, w);
        return j5;
    }

    @Override // q0.c0
    public final long r() {
        return this.f7689t.r();
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        long j4 = -9223372036854775807L;
        for (InterfaceC0467D interfaceC0467D : this.s) {
            long u4 = interfaceC0467D.u();
            if (u4 != -9223372036854775807L) {
                if (j4 == -9223372036854775807L) {
                    for (InterfaceC0467D interfaceC0467D2 : this.s) {
                        if (interfaceC0467D2 == interfaceC0467D) {
                            break;
                        }
                        if (interfaceC0467D2.l(u4) != u4) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j4 = u4;
                } else if (u4 != j4) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j4 != -9223372036854775807L && interfaceC0467D.l(j4) != j4) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j4;
    }

    @Override // q0.c0
    public final void w(long j4) {
        this.f7689t.w(j4);
    }
}
