package r0;

import B2.D;
import T.C0095p;
import W.y;
import Y.x;
import a0.Q;
import android.net.Uri;
import d0.C0229b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q0.C0491x;
import q0.Z;
import q0.a0;
import q0.b0;
import q0.c0;
import t0.C0560b;

/* renamed from: r0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506h implements a0, c0, u0.i, u0.l {

    /* renamed from: A, reason: collision with root package name */
    public AbstractC0503e f8033A;

    /* renamed from: B, reason: collision with root package name */
    public C0095p f8034B;

    /* renamed from: C, reason: collision with root package name */
    public C0229b f8035C;

    /* renamed from: D, reason: collision with root package name */
    public long f8036D;

    /* renamed from: E, reason: collision with root package name */
    public long f8037E;

    /* renamed from: F, reason: collision with root package name */
    public int f8038F;

    /* renamed from: G, reason: collision with root package name */
    public AbstractC0499a f8039G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f8040H;

    /* renamed from: l, reason: collision with root package name */
    public final int f8041l;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f8042m;

    /* renamed from: n, reason: collision with root package name */
    public final C0095p[] f8043n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f8044o;

    /* renamed from: p, reason: collision with root package name */
    public final i f8045p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f8046q;

    /* renamed from: r, reason: collision with root package name */
    public final f0.e f8047r;
    public final C0560b s;

    /* renamed from: t, reason: collision with root package name */
    public final u0.n f8048t;

    /* renamed from: u, reason: collision with root package name */
    public final D f8049u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f8050v;
    public final List w;

    /* renamed from: x, reason: collision with root package name */
    public final Z f8051x;

    /* renamed from: y, reason: collision with root package name */
    public final Z[] f8052y;

    /* renamed from: z, reason: collision with root package name */
    public final x f8053z;

    /* JADX WARN: Type inference failed for: r4v3, types: [B2.D, java.lang.Object] */
    public C0506h(int i4, int[] iArr, C0095p[] c0095pArr, i iVar, b0 b0Var, u0.e eVar, long j4, f0.i iVar2, f0.e eVar2, C0560b c0560b, f0.e eVar3) {
        this.f8041l = i4;
        int i5 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f8042m = iArr;
        this.f8043n = c0095pArr == null ? new C0095p[0] : c0095pArr;
        this.f8045p = iVar;
        this.f8046q = b0Var;
        this.f8047r = eVar3;
        this.s = c0560b;
        this.f8048t = new u0.n("ChunkSampleStream");
        this.f8049u = new Object();
        ArrayList arrayList = new ArrayList();
        this.f8050v = arrayList;
        this.w = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f8052y = new Z[length];
        this.f8044o = new boolean[length];
        int i6 = length + 1;
        int[] iArr2 = new int[i6];
        Z[] zArr = new Z[i6];
        iVar2.getClass();
        Z z4 = new Z(eVar, iVar2, eVar2);
        this.f8051x = z4;
        iArr2[0] = i4;
        zArr[0] = z4;
        while (i5 < length) {
            Z z5 = new Z(eVar, null, null);
            this.f8052y[i5] = z5;
            int i7 = i5 + 1;
            zArr[i7] = z5;
            iArr2[i7] = this.f8042m[i5];
            i5 = i7;
        }
        this.f8053z = new x(25, iArr2, zArr);
        this.f8036D = j4;
        this.f8037E = j4;
    }

    public final int A(int i4, int i5) {
        ArrayList arrayList;
        do {
            i5++;
            arrayList = this.f8050v;
            if (i5 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC0499a) arrayList.get(i5)).e(0) <= i4);
        return i5 - 1;
    }

    public final void B(C0229b c0229b) {
        this.f8035C = c0229b;
        Z z4 = this.f8051x;
        z4.g();
        K2.o oVar = z4.f7791h;
        if (oVar != null) {
            oVar.K(z4.f7788e);
            z4.f7791h = null;
            z4.f7790g = null;
        }
        for (Z z5 : this.f8052y) {
            z5.g();
            K2.o oVar2 = z5.f7791h;
            if (oVar2 != null) {
                oVar2.K(z5.f7788e);
                z5.f7791h = null;
                z5.f7790g = null;
            }
        }
        this.f8048t.e(this);
    }

    public final void C(long j4) {
        ArrayList arrayList;
        AbstractC0499a abstractC0499a;
        this.f8037E = j4;
        if (y()) {
            this.f8036D = j4;
            return;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            arrayList = this.f8050v;
            if (i5 >= arrayList.size()) {
                break;
            }
            abstractC0499a = (AbstractC0499a) arrayList.get(i5);
            long j5 = abstractC0499a.f8026r;
            if (j5 == j4 && abstractC0499a.f7998v == -9223372036854775807L) {
                break;
            } else if (j5 > j4) {
                break;
            } else {
                i5++;
            }
        }
        abstractC0499a = null;
        Z z4 = this.f8051x;
        boolean A4 = abstractC0499a != null ? z4.A(abstractC0499a.e(0)) : z4.B(j4, j4 < r());
        Z[] zArr = this.f8052y;
        if (A4) {
            this.f8038F = A(z4.n(), 0);
            int length = zArr.length;
            while (i4 < length) {
                zArr[i4].B(j4, true);
                i4++;
            }
            return;
        }
        this.f8036D = j4;
        this.f8040H = false;
        arrayList.clear();
        this.f8038F = 0;
        u0.n nVar = this.f8048t;
        if (nVar.d()) {
            z4.g();
            int length2 = zArr.length;
            while (i4 < length2) {
                zArr[i4].g();
                i4++;
            }
            nVar.b();
            return;
        }
        nVar.f8544n = null;
        z4.z(false);
        for (Z z5 : zArr) {
            z5.z(false);
        }
    }

    @Override // q0.a0
    public final void a() {
        u0.n nVar = this.f8048t;
        nVar.a();
        this.f8051x.u();
        if (nVar.d()) {
            return;
        }
        this.f8045p.a();
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f8048t.d();
    }

    @Override // q0.a0
    public final boolean d() {
        return !y() && this.f8051x.s(this.f8040H);
    }

    @Override // u0.l
    public final void f() {
        this.f8051x.y();
        for (Z z4 : this.f8052y) {
            z4.y();
        }
        this.f8045p.release();
        C0229b c0229b = this.f8035C;
        if (c0229b != null) {
            synchronized (c0229b) {
                d0.n nVar = (d0.n) c0229b.f4832y.remove(this);
                if (nVar != null) {
                    nVar.f4912a.y();
                }
            }
        }
    }

    @Override // q0.c0
    public final long h() {
        if (this.f8040H) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f8036D;
        }
        long j4 = this.f8037E;
        AbstractC0499a t4 = t();
        if (!t4.d()) {
            ArrayList arrayList = this.f8050v;
            t4 = arrayList.size() > 1 ? (AbstractC0499a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (t4 != null) {
            j4 = Math.max(j4, t4.s);
        }
        return Math.max(j4, this.f8051x.l());
    }

    @Override // q0.c0
    public final boolean i(Q q4) {
        long j4;
        List list;
        if (!this.f8040H) {
            u0.n nVar = this.f8048t;
            if (!nVar.d() && !nVar.c()) {
                boolean y4 = y();
                if (y4) {
                    list = Collections.emptyList();
                    j4 = this.f8036D;
                } else {
                    j4 = t().s;
                    list = this.w;
                }
                this.f8045p.d(q4, j4, list, this.f8049u);
                D d4 = this.f8049u;
                boolean z4 = d4.f115a;
                AbstractC0503e abstractC0503e = (AbstractC0503e) d4.f116b;
                d4.f116b = null;
                d4.f115a = false;
                if (z4) {
                    this.f8036D = -9223372036854775807L;
                    this.f8040H = true;
                    return true;
                }
                if (abstractC0503e == null) {
                    return false;
                }
                this.f8033A = abstractC0503e;
                boolean z5 = abstractC0503e instanceof AbstractC0499a;
                x xVar = this.f8053z;
                if (z5) {
                    AbstractC0499a abstractC0499a = (AbstractC0499a) abstractC0503e;
                    if (y4) {
                        long j5 = this.f8036D;
                        if (abstractC0499a.f8026r != j5) {
                            this.f8051x.f7802t = j5;
                            for (Z z6 : this.f8052y) {
                                z6.f7802t = this.f8036D;
                            }
                        }
                        this.f8036D = -9223372036854775807L;
                    }
                    abstractC0499a.f7999x = xVar;
                    Z[] zArr = (Z[]) xVar.f3066n;
                    int[] iArr = new int[zArr.length];
                    for (int i4 = 0; i4 < zArr.length; i4++) {
                        Z z7 = zArr[i4];
                        iArr[i4] = z7.f7800q + z7.f7799p;
                    }
                    abstractC0499a.f8000y = iArr;
                    this.f8050v.add(abstractC0499a);
                } else if (abstractC0503e instanceof k) {
                    ((k) abstractC0503e).f8061v = xVar;
                }
                this.f8047r.k(new C0491x(abstractC0503e.f8020l, abstractC0503e.f8021m, nVar.f(abstractC0503e, this, this.s.e(abstractC0503e.f8022n))), abstractC0503e.f8022n, this.f8041l, abstractC0503e.f8023o, abstractC0503e.f8024p, abstractC0503e.f8025q, abstractC0503e.f8026r, abstractC0503e.s);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [q0.b0, java.lang.Object] */
    @Override // u0.i
    public final void k(u0.k kVar, long j4, long j5) {
        AbstractC0503e abstractC0503e = (AbstractC0503e) kVar;
        this.f8033A = null;
        this.f8045p.f(abstractC0503e);
        long j6 = abstractC0503e.f8020l;
        Uri uri = abstractC0503e.f8027t.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.s.getClass();
        this.f8047r.f(c0491x, abstractC0503e.f8022n, this.f8041l, abstractC0503e.f8023o, abstractC0503e.f8024p, abstractC0503e.f8025q, abstractC0503e.f8026r, abstractC0503e.s);
        this.f8046q.f(this);
    }

    public final void m(long j4) {
        long j5;
        if (y()) {
            return;
        }
        Z z4 = this.f8051x;
        int i4 = z4.f7800q;
        z4.f(j4, true);
        Z z5 = this.f8051x;
        int i5 = z5.f7800q;
        if (i5 > i4) {
            synchronized (z5) {
                j5 = z5.f7799p == 0 ? Long.MIN_VALUE : z5.f7797n[z5.f7801r];
            }
            int i6 = 0;
            while (true) {
                Z[] zArr = this.f8052y;
                if (i6 >= zArr.length) {
                    break;
                }
                zArr[i6].f(j5, this.f8044o[i6]);
                i6++;
            }
        }
        int min = Math.min(A(i5, 0), this.f8038F);
        if (min > 0) {
            y.R(this.f8050v, 0, min);
            this.f8038F -= min;
        }
    }

    @Override // q0.a0
    public final int n(long j4) {
        if (y()) {
            return 0;
        }
        Z z4 = this.f8051x;
        int p2 = z4.p(j4, this.f8040H);
        AbstractC0499a abstractC0499a = this.f8039G;
        if (abstractC0499a != null) {
            p2 = Math.min(p2, abstractC0499a.e(0) - z4.n());
        }
        z4.C(p2);
        z();
        return p2;
    }

    @Override // q0.a0
    public final int o(x xVar, Z.f fVar, int i4) {
        if (y()) {
            return -3;
        }
        AbstractC0499a abstractC0499a = this.f8039G;
        Z z4 = this.f8051x;
        if (abstractC0499a != null && abstractC0499a.e(0) <= z4.n()) {
            return -3;
        }
        z();
        return z4.x(xVar, fVar, i4, this.f8040H);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Type inference failed for: r1v3, types: [q0.b0, java.lang.Object] */
    @Override // u0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.C0271e q(u0.k r23, long r24, long r26, java.io.IOException r28, int r29) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r0.e r1 = (r0.AbstractC0503e) r1
            Y.B r2 = r1.f8027t
            long r2 = r2.f2989m
            boolean r4 = r1 instanceof r0.AbstractC0499a
            java.util.ArrayList r5 = r0.f8050v
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L26
            if (r4 == 0) goto L26
            boolean r2 = r0.v(r6)
            if (r2 != 0) goto L24
            goto L26
        L24:
            r2 = r3
            goto L27
        L26:
            r2 = r7
        L27:
            q0.x r9 = new q0.x
            Y.B r8 = r1.f8027t
            android.net.Uri r8 = r8.f2990n
            r10 = r26
            r9.<init>(r10)
            long r10 = r1.f8026r
            W.y.Z(r10)
            long r10 = r1.s
            W.y.Z(r10)
            B.c r8 = new B.c
            r15 = r28
            r10 = r29
            r8.<init>(r10, r15)
            r0.i r10 = r0.f8045p
            t0.b r14 = r0.s
            boolean r10 = r10.e(r1, r2, r8, r14)
            if (r10 == 0) goto L72
            if (r2 == 0) goto L6b
            if (r4 == 0) goto L68
            r0.a r2 = r0.s(r6)
            if (r2 != r1) goto L5a
            goto L5b
        L5a:
            r7 = r3
        L5b:
            W.a.j(r7)
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L68
            long r4 = r0.f8037E
            r0.f8036D = r4
        L68:
            f1.e r2 = u0.n.f8540p
            goto L73
        L6b:
            java.lang.String r2 = "ChunkSampleStream"
            java.lang.String r4 = "Ignoring attempt to cancel non-cancelable load."
            W.a.A(r2, r4)
        L72:
            r2 = 0
        L73:
            if (r2 != 0) goto L8e
            r14.getClass()
            long r4 = t0.C0560b.f(r8)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L8c
            f1.e r2 = new f1.e
            r6 = 0
            r2.<init>(r3, r4, r6)
            goto L8e
        L8c:
            f1.e r2 = u0.n.f8541q
        L8e:
            boolean r3 = r2.a()
            r20 = r3 ^ 1
            f0.e r8 = r0.f8047r
            long r4 = r1.f8026r
            long r6 = r1.s
            int r10 = r1.f8022n
            int r11 = r0.f8041l
            T.p r12 = r1.f8023o
            int r13 = r1.f8024p
            java.lang.Object r1 = r1.f8025q
            r24 = r2
            r2 = 0
            r21 = r14
            r14 = r1
            r15 = r4
            r17 = r6
            r19 = r28
            r8.h(r9, r10, r11, r12, r13, r14, r15, r17, r19, r20)
            if (r3 != 0) goto Lbe
            r0.f8033A = r2
            r21.getClass()
            java.lang.Object r1 = r0.f8046q
            r1.f(r0)
        Lbe:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.C0506h.q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // q0.c0
    public final long r() {
        if (y()) {
            return this.f8036D;
        }
        if (this.f8040H) {
            return Long.MIN_VALUE;
        }
        return t().s;
    }

    public final AbstractC0499a s(int i4) {
        ArrayList arrayList = this.f8050v;
        AbstractC0499a abstractC0499a = (AbstractC0499a) arrayList.get(i4);
        y.R(arrayList, i4, arrayList.size());
        this.f8038F = Math.max(this.f8038F, arrayList.size());
        int i5 = 0;
        this.f8051x.i(abstractC0499a.e(0));
        while (true) {
            Z[] zArr = this.f8052y;
            if (i5 >= zArr.length) {
                return abstractC0499a;
            }
            Z z4 = zArr[i5];
            i5++;
            z4.i(abstractC0499a.e(i5));
        }
    }

    public final AbstractC0499a t() {
        return (AbstractC0499a) this.f8050v.get(r0.size() - 1);
    }

    public final boolean v(int i4) {
        int n4;
        AbstractC0499a abstractC0499a = (AbstractC0499a) this.f8050v.get(i4);
        if (this.f8051x.n() > abstractC0499a.e(0)) {
            return true;
        }
        int i5 = 0;
        do {
            Z[] zArr = this.f8052y;
            if (i5 >= zArr.length) {
                return false;
            }
            n4 = zArr[i5].n();
            i5++;
        } while (n4 <= abstractC0499a.e(i5));
        return true;
    }

    @Override // q0.c0
    public final void w(long j4) {
        u0.n nVar = this.f8048t;
        if (nVar.c() || y()) {
            return;
        }
        boolean d4 = nVar.d();
        i iVar = this.f8045p;
        ArrayList arrayList = this.f8050v;
        List list = this.w;
        if (d4) {
            AbstractC0503e abstractC0503e = this.f8033A;
            abstractC0503e.getClass();
            boolean z4 = abstractC0503e instanceof AbstractC0499a;
            if (!(z4 && v(arrayList.size() - 1)) && iVar.c(j4, abstractC0503e, list)) {
                nVar.b();
                if (z4) {
                    this.f8039G = (AbstractC0499a) abstractC0503e;
                    return;
                }
                return;
            }
            return;
        }
        int g4 = iVar.g(j4, list);
        if (g4 < arrayList.size()) {
            W.a.j(!nVar.d());
            int size = arrayList.size();
            while (true) {
                if (g4 >= size) {
                    g4 = -1;
                    break;
                } else if (!v(g4)) {
                    break;
                } else {
                    g4++;
                }
            }
            if (g4 == -1) {
                return;
            }
            long j5 = t().s;
            AbstractC0499a s = s(g4);
            if (arrayList.isEmpty()) {
                this.f8036D = this.f8037E;
            }
            this.f8040H = false;
            this.f8047r.m(new n0.g(1, this.f8041l, null, 3, null, y.Z(s.f8026r), y.Z(j5)));
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [q0.b0, java.lang.Object] */
    @Override // u0.i
    public final void x(u0.k kVar, long j4, long j5, boolean z4) {
        AbstractC0503e abstractC0503e = (AbstractC0503e) kVar;
        this.f8033A = null;
        this.f8039G = null;
        long j6 = abstractC0503e.f8020l;
        Uri uri = abstractC0503e.f8027t.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.s.getClass();
        this.f8047r.c(c0491x, abstractC0503e.f8022n, this.f8041l, abstractC0503e.f8023o, abstractC0503e.f8024p, abstractC0503e.f8025q, abstractC0503e.f8026r, abstractC0503e.s);
        if (z4) {
            return;
        }
        if (y()) {
            this.f8051x.z(false);
            for (Z z5 : this.f8052y) {
                z5.z(false);
            }
        } else if (abstractC0503e instanceof AbstractC0499a) {
            ArrayList arrayList = this.f8050v;
            s(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f8036D = this.f8037E;
            }
        }
        this.f8046q.f(this);
    }

    public final boolean y() {
        return this.f8036D != -9223372036854775807L;
    }

    public final void z() {
        int A4 = A(this.f8051x.n(), this.f8038F - 1);
        while (true) {
            int i4 = this.f8038F;
            if (i4 > A4) {
                return;
            }
            this.f8038F = i4 + 1;
            AbstractC0499a abstractC0499a = (AbstractC0499a) this.f8050v.get(i4);
            C0095p c0095p = abstractC0499a.f8023o;
            if (!c0095p.equals(this.f8034B)) {
                this.f8047r.a(this.f8041l, c0095p, abstractC0499a.f8024p, abstractC0499a.f8025q, abstractC0499a.f8026r);
            }
            this.f8034B = c0095p;
        }
    }
}
