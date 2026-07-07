package g0;

import T.C0094o;
import T.C0095p;
import T.H;
import W.y;
import Y.C;
import a0.P;
import a0.Q;
import a0.m0;
import android.net.Uri;
import android.util.SparseArray;
import f2.G;
import f2.I;
import f2.Y;
import f2.c0;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import q0.C0480l;
import q0.InterfaceC0466C;
import q0.InterfaceC0467D;
import q0.k0;
import t0.C0560b;

/* loaded from: classes.dex */
public final class l implements InterfaceC0467D, h0.q {

    /* renamed from: A, reason: collision with root package name */
    public final Y f5702A = new Y(3, this);

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0466C f5703B;

    /* renamed from: C, reason: collision with root package name */
    public int f5704C;

    /* renamed from: D, reason: collision with root package name */
    public k0 f5705D;

    /* renamed from: E, reason: collision with root package name */
    public r[] f5706E;

    /* renamed from: F, reason: collision with root package name */
    public r[] f5707F;

    /* renamed from: G, reason: collision with root package name */
    public int f5708G;

    /* renamed from: H, reason: collision with root package name */
    public C0480l f5709H;

    /* renamed from: l, reason: collision with root package name */
    public final C0307c f5710l;

    /* renamed from: m, reason: collision with root package name */
    public final h0.c f5711m;

    /* renamed from: n, reason: collision with root package name */
    public final Y f5712n;

    /* renamed from: o, reason: collision with root package name */
    public final C f5713o;

    /* renamed from: p, reason: collision with root package name */
    public final f0.i f5714p;

    /* renamed from: q, reason: collision with root package name */
    public final f0.e f5715q;

    /* renamed from: r, reason: collision with root package name */
    public final C0560b f5716r;
    public final f0.e s;

    /* renamed from: t, reason: collision with root package name */
    public final u0.e f5717t;

    /* renamed from: u, reason: collision with root package name */
    public final IdentityHashMap f5718u;

    /* renamed from: v, reason: collision with root package name */
    public final Y f5719v;
    public final L1.g w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5720x;

    /* renamed from: y, reason: collision with root package name */
    public final int f5721y;

    /* renamed from: z, reason: collision with root package name */
    public final b0.l f5722z;

    public l(C0307c c0307c, h0.c cVar, Y y4, C c4, f0.i iVar, f0.e eVar, C0560b c0560b, f0.e eVar2, u0.e eVar3, L1.g gVar, boolean z4, int i4, b0.l lVar) {
        this.f5710l = c0307c;
        this.f5711m = cVar;
        this.f5712n = y4;
        this.f5713o = c4;
        this.f5714p = iVar;
        this.f5715q = eVar;
        this.f5716r = c0560b;
        this.s = eVar2;
        this.f5717t = eVar3;
        this.w = gVar;
        this.f5720x = z4;
        this.f5721y = i4;
        this.f5722z = lVar;
        gVar.getClass();
        G g4 = I.f5510m;
        c0 c0Var = c0.f5550p;
        this.f5709H = new C0480l(c0Var, c0Var);
        this.f5718u = new IdentityHashMap();
        this.f5719v = new Y(4);
        this.f5706E = new r[0];
        this.f5707F = new r[0];
    }

    public static C0095p k(C0095p c0095p, C0095p c0095p2, boolean z4) {
        T.G g4;
        int i4;
        String str;
        int i5;
        int i6;
        String str2;
        String str3;
        I i7;
        G g5 = I.f5510m;
        I i8 = c0.f5550p;
        if (c0095p2 != null) {
            str3 = c0095p2.f2322j;
            g4 = c0095p2.f2323k;
            i5 = c0095p2.f2303A;
            i4 = c0095p2.f2317e;
            i6 = c0095p2.f2318f;
            str = c0095p2.f2316d;
            str2 = c0095p2.f2314b;
            i7 = c0095p2.f2315c;
        } else {
            String v4 = y.v(c0095p.f2322j, 1);
            g4 = c0095p.f2323k;
            if (z4) {
                i5 = c0095p.f2303A;
                i4 = c0095p.f2317e;
                i6 = c0095p.f2318f;
                str = c0095p.f2316d;
                str2 = c0095p.f2314b;
                i8 = c0095p.f2315c;
            } else {
                i4 = 0;
                str = null;
                i5 = -1;
                i6 = 0;
                str2 = null;
            }
            I i9 = i8;
            str3 = v4;
            i7 = i9;
        }
        String c4 = H.c(str3);
        int i10 = z4 ? c0095p.f2319g : -1;
        int i11 = z4 ? c0095p.f2320h : -1;
        C0094o c0094o = new C0094o();
        c0094o.f2279a = c0095p.f2313a;
        c0094o.f2280b = str2;
        c0094o.f2281c = I.j(i7);
        c0094o.f2289k = H.l(c0095p.f2324l);
        c0094o.f2290l = H.l(c4);
        c0094o.f2287i = str3;
        c0094o.f2288j = g4;
        c0094o.f2285g = i10;
        c0094o.f2286h = i11;
        c0094o.f2302z = i5;
        c0094o.f2283e = i4;
        c0094o.f2284f = i6;
        c0094o.f2282d = str;
        return new C0095p(c0094o);
    }

    @Override // h0.q
    public final void a() {
        for (r rVar : this.f5706E) {
            ArrayList arrayList = rVar.f5793y;
            if (!arrayList.isEmpty()) {
                k kVar = (k) f2.r.l(arrayList);
                int b4 = rVar.f5785o.b(kVar);
                if (b4 == 1) {
                    kVar.f5697V = true;
                } else if (b4 == 0) {
                    rVar.f5750C.post(new W.m(6, rVar, kVar));
                } else if (b4 == 2 && !rVar.f5777e0) {
                    u0.n nVar = rVar.f5790u;
                    if (nVar.d()) {
                        nVar.b();
                    }
                }
            }
        }
        this.f5703B.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        r[] rVarArr = this.f5707F;
        int length = rVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            r rVar = rVarArr[i4];
            if (rVar.f5758L == 2) {
                i iVar = rVar.f5785o;
                int g4 = iVar.f5673q.g();
                Uri[] uriArr = iVar.f5661e;
                int length2 = uriArr.length;
                h0.c cVar = iVar.f5663g;
                h0.i a4 = (g4 >= length2 || g4 == -1) ? null : cVar.a(true, uriArr[iVar.f5673q.a()]);
                if (a4 != null) {
                    I i5 = a4.f5910r;
                    if (!i5.isEmpty() && a4.f5934c) {
                        long j5 = a4.f5900h - cVar.f5875y;
                        long j6 = j4 - j5;
                        int d4 = y.d(i5, Long.valueOf(j6), true);
                        long j7 = ((h0.f) i5.get(d4)).f5885p;
                        return m0Var.a(j6, j7, d4 != i5.size() - 1 ? ((h0.f) i5.get(d4 + 1)).f5885p : j7) + j5;
                    }
                }
            } else {
                i4++;
            }
        }
        return j4;
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f5709H.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053 A[SYNTHETIC] */
    @Override // h0.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.net.Uri r17, B.c r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            g0.r[] r2 = r0.f5706E
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La4
            r8 = r2[r6]
            g0.i r9 = r8.f5785o
            android.net.Uri[] r10 = r9.f5661e
            boolean r11 = W.y.l(r10, r1)
            if (r11 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L9f
        L1d:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            t0.s r13 = r9.f5673q
            u0.h r13 = p1.AbstractC0462a.t(r13)
            t0.b r8 = r8.f5789t
            r8.getClass()
            r8 = r18
            f1.e r13 = t0.C0560b.d(r13, r8)
            if (r13 == 0) goto L41
            int r14 = r13.f5489a
            r15 = 2
            if (r14 != r15) goto L41
            long r13 = r13.f5490b
            goto L42
        L3f:
            r8 = r18
        L41:
            r13 = r11
        L42:
            r15 = 0
        L43:
            int r5 = r10.length
            r4 = -1
            if (r15 >= r5) goto L53
            r5 = r10[r15]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L50
            goto L54
        L50:
            int r15 = r15 + 1
            goto L43
        L53:
            r15 = r4
        L54:
            if (r15 != r4) goto L59
        L56:
            r4 = 1
            r5 = 1
            goto L96
        L59:
            t0.s r5 = r9.f5673q
            int r5 = r5.u(r15)
            if (r5 != r4) goto L62
            goto L56
        L62:
            boolean r4 = r9.s
            android.net.Uri r10 = r9.f5671o
            boolean r10 = r1.equals(r10)
            r4 = r4 | r10
            r9.s = r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L94
            t0.s r4 = r9.f5673q
            boolean r4 = r4.q(r13, r5)
            if (r4 == 0) goto L91
            h0.c r4 = r9.f5663g
            java.util.HashMap r4 = r4.f5867o
            java.lang.Object r4 = r4.get(r1)
            h0.b r4 = (h0.b) r4
            if (r4 == 0) goto L8c
            boolean r4 = h0.b.a(r4, r13)
            r5 = 1
            r4 = r4 ^ r5
            goto L8e
        L8c:
            r5 = 1
            r4 = 0
        L8e:
            if (r4 == 0) goto L92
            goto L95
        L91:
            r5 = 1
        L92:
            r4 = 0
            goto L96
        L94:
            r5 = 1
        L95:
            r4 = r5
        L96:
            if (r4 == 0) goto L9e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9e
            r4 = r5
            goto L9f
        L9e:
            r4 = 0
        L9f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La4:
            q0.C r1 = r0.f5703B
            r1.f(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.d(android.net.Uri, B.c, boolean):boolean");
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        k0 k0Var = this.f5705D;
        k0Var.getClass();
        return k0Var;
    }

    public final r f(String str, int i4, Uri[] uriArr, C0095p[] c0095pArr, C0095p c0095p, List list, Map map, long j4) {
        i iVar = new i(this.f5710l, this.f5711m, uriArr, c0095pArr, this.f5712n, this.f5713o, this.f5719v, list, this.f5722z);
        f0.e eVar = this.s;
        return new r(str, i4, this.f5702A, iVar, map, this.f5717t, j4, c0095p, this.f5714p, this.f5715q, this.f5716r, eVar, this.f5721y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (r2[r7] != 1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // q0.InterfaceC0467D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(q0.InterfaceC0466C r28, long r29) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.g(q0.C, long):void");
    }

    @Override // q0.c0
    public final long h() {
        return this.f5709H.h();
    }

    @Override // q0.c0
    public final boolean i(Q q4) {
        if (this.f5705D != null) {
            return this.f5709H.i(q4);
        }
        for (r rVar : this.f5706E) {
            if (!rVar.f5761O) {
                P p2 = new P();
                p2.f3329a = rVar.f5773a0;
                rVar.i(new Q(p2));
            }
        }
        return false;
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        for (r rVar : this.f5706E) {
            rVar.E();
            if (rVar.f5777e0 && !rVar.f5761O) {
                throw T.I.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        r[] rVarArr = this.f5707F;
        if (rVarArr.length > 0) {
            boolean H3 = rVarArr[0].H(j4, false);
            int i4 = 1;
            while (true) {
                r[] rVarArr2 = this.f5707F;
                if (i4 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i4].H(j4, H3);
                i4++;
            }
            if (H3) {
                ((SparseArray) this.f5719v.f5535m).clear();
            }
        }
        return j4;
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        for (r rVar : this.f5707F) {
            if (rVar.f5760N && !rVar.C()) {
                int length = rVar.f5754G.length;
                for (int i4 = 0; i4 < length; i4++) {
                    rVar.f5754G[i4].f(j4, rVar.f5771Y[i4]);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x028d  */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // q0.InterfaceC0467D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p(t0.s[] r37, boolean[] r38, q0.a0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.l.p(t0.s[], boolean[], q0.a0[], boolean[], long):long");
    }

    @Override // q0.c0
    public final long r() {
        return this.f5709H.r();
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        return -9223372036854775807L;
    }

    @Override // q0.c0
    public final void w(long j4) {
        this.f5709H.w(j4);
    }
}
