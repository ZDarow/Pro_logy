package g0;

import T.C0092m;
import T.C0094o;
import T.C0095p;
import T.G;
import T.H;
import T.V;
import W.y;
import Y.w;
import a0.P;
import a0.Q;
import android.net.Uri;
import android.os.Handler;
import android.util.SparseIntArray;
import f1.C0271e;
import f2.I;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1.AbstractC0462a;
import q0.C0470b;
import q0.C0491x;
import q0.Y;
import q0.c0;
import q0.k0;
import r0.AbstractC0503e;
import t0.C0560b;
import y0.F;
import y0.z;

/* loaded from: classes.dex */
public final class r implements u0.i, u0.l, c0, y0.q, Y {

    /* renamed from: j0, reason: collision with root package name */
    public static final Set f5747j0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* renamed from: A, reason: collision with root package name */
    public final o f5748A;

    /* renamed from: B, reason: collision with root package name */
    public final o f5749B;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f5750C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f5751D;

    /* renamed from: E, reason: collision with root package name */
    public final Map f5752E;

    /* renamed from: F, reason: collision with root package name */
    public AbstractC0503e f5753F;

    /* renamed from: G, reason: collision with root package name */
    public q[] f5754G;

    /* renamed from: H, reason: collision with root package name */
    public int[] f5755H;

    /* renamed from: I, reason: collision with root package name */
    public final HashSet f5756I;
    public final SparseIntArray J;

    /* renamed from: K, reason: collision with root package name */
    public p f5757K;

    /* renamed from: L, reason: collision with root package name */
    public int f5758L;

    /* renamed from: M, reason: collision with root package name */
    public int f5759M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f5760N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f5761O;

    /* renamed from: P, reason: collision with root package name */
    public int f5762P;

    /* renamed from: Q, reason: collision with root package name */
    public C0095p f5763Q;

    /* renamed from: R, reason: collision with root package name */
    public C0095p f5764R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f5765S;

    /* renamed from: T, reason: collision with root package name */
    public k0 f5766T;

    /* renamed from: U, reason: collision with root package name */
    public Set f5767U;

    /* renamed from: V, reason: collision with root package name */
    public int[] f5768V;

    /* renamed from: W, reason: collision with root package name */
    public int f5769W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f5770X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean[] f5771Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean[] f5772Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f5773a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f5774b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f5775c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f5776d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5777e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f5778f0;

    /* renamed from: g0, reason: collision with root package name */
    public long f5779g0;

    /* renamed from: h0, reason: collision with root package name */
    public C0092m f5780h0;

    /* renamed from: i0, reason: collision with root package name */
    public k f5781i0;

    /* renamed from: l, reason: collision with root package name */
    public final String f5782l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5783m;

    /* renamed from: n, reason: collision with root package name */
    public final f2.Y f5784n;

    /* renamed from: o, reason: collision with root package name */
    public final i f5785o;

    /* renamed from: p, reason: collision with root package name */
    public final u0.e f5786p;

    /* renamed from: q, reason: collision with root package name */
    public final C0095p f5787q;

    /* renamed from: r, reason: collision with root package name */
    public final f0.i f5788r;
    public final f0.e s;

    /* renamed from: t, reason: collision with root package name */
    public final C0560b f5789t;

    /* renamed from: u, reason: collision with root package name */
    public final u0.n f5790u = new u0.n("Loader:HlsSampleStreamWrapper");

    /* renamed from: v, reason: collision with root package name */
    public final f0.e f5791v;
    public final int w;

    /* renamed from: x, reason: collision with root package name */
    public final Y1.a f5792x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f5793y;

    /* renamed from: z, reason: collision with root package name */
    public final List f5794z;

    /* JADX WARN: Type inference failed for: r1v12, types: [g0.o] */
    /* JADX WARN: Type inference failed for: r1v13, types: [g0.o] */
    /* JADX WARN: Type inference failed for: r1v2, types: [Y1.a, java.lang.Object] */
    public r(String str, int i4, f2.Y y4, i iVar, Map map, u0.e eVar, long j4, C0095p c0095p, f0.i iVar2, f0.e eVar2, C0560b c0560b, f0.e eVar3, int i5) {
        this.f5782l = str;
        this.f5783m = i4;
        this.f5784n = y4;
        this.f5785o = iVar;
        this.f5752E = map;
        this.f5786p = eVar;
        this.f5787q = c0095p;
        this.f5788r = iVar2;
        this.s = eVar2;
        this.f5789t = c0560b;
        this.f5791v = eVar3;
        this.w = i5;
        ?? obj = new Object();
        obj.f3079m = null;
        obj.f3078l = false;
        obj.f3080n = null;
        this.f5792x = obj;
        this.f5755H = new int[0];
        Set set = f5747j0;
        this.f5756I = new HashSet(set.size());
        this.J = new SparseIntArray(set.size());
        this.f5754G = new q[0];
        this.f5772Z = new boolean[0];
        this.f5771Y = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f5793y = arrayList;
        this.f5794z = Collections.unmodifiableList(arrayList);
        this.f5751D = new ArrayList();
        final int i6 = 0;
        this.f5748A = new Runnable(this) { // from class: g0.o

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r f5737m;

            {
                this.f5737m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i6) {
                    case 0:
                        this.f5737m.D();
                        return;
                    default:
                        r rVar = this.f5737m;
                        rVar.f5760N = true;
                        rVar.D();
                        return;
                }
            }
        };
        final int i7 = 1;
        this.f5749B = new Runnable(this) { // from class: g0.o

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r f5737m;

            {
                this.f5737m = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        this.f5737m.D();
                        return;
                    default:
                        r rVar = this.f5737m;
                        rVar.f5760N = true;
                        rVar.D();
                        return;
                }
            }
        };
        this.f5750C = y.n(null);
        this.f5773a0 = j4;
        this.f5774b0 = j4;
    }

    public static int B(int i4) {
        if (i4 == 1) {
            return 2;
        }
        if (i4 != 2) {
            return i4 != 3 ? 0 : 1;
        }
        return 3;
    }

    public static y0.n d(int i4, int i5) {
        W.a.A("HlsSampleStreamWrapper", "Unmapped track with id " + i4 + " of type " + i5);
        return new y0.n();
    }

    public static C0095p y(C0095p c0095p, C0095p c0095p2, boolean z4) {
        String str;
        String str2;
        if (c0095p == null) {
            return c0095p2;
        }
        String str3 = c0095p2.f2325m;
        int g4 = H.g(str3);
        String str4 = c0095p.f2322j;
        if (y.u(str4, g4) == 1) {
            str2 = y.v(str4, g4);
            str = H.c(str2);
        } else {
            String a4 = H.a(str4, str3);
            str = str3;
            str2 = a4;
        }
        C0094o a5 = c0095p2.a();
        a5.f2279a = c0095p.f2313a;
        a5.f2280b = c0095p.f2314b;
        a5.f2281c = I.j(c0095p.f2315c);
        a5.f2282d = c0095p.f2316d;
        a5.f2283e = c0095p.f2317e;
        a5.f2284f = c0095p.f2318f;
        a5.f2285g = z4 ? c0095p.f2319g : -1;
        a5.f2286h = z4 ? c0095p.f2320h : -1;
        a5.f2287i = str2;
        if (g4 == 2) {
            a5.f2296r = c0095p.s;
            a5.s = c0095p.f2331t;
            a5.f2297t = c0095p.f2332u;
        }
        if (str != null) {
            a5.g(str);
        }
        int i4 = c0095p.f2303A;
        if (i4 != -1 && g4 == 1) {
            a5.f2302z = i4;
        }
        G g5 = c0095p.f2323k;
        if (g5 != null) {
            G g6 = c0095p2.f2323k;
            if (g6 != null) {
                g5 = g6.e(g5);
            }
            a5.f2288j = g5;
        }
        return new C0095p(a5);
    }

    public final k A() {
        return (k) this.f5793y.get(r0.size() - 1);
    }

    public final boolean C() {
        return this.f5774b0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D() {
        int i4;
        if (!this.f5765S && this.f5768V == null && this.f5760N) {
            int i5 = 0;
            for (q qVar : this.f5754G) {
                if (qVar.q() == null) {
                    return;
                }
            }
            k0 k0Var = this.f5766T;
            if (k0Var != null) {
                int i6 = k0Var.f7877a;
                int[] iArr = new int[i6];
                this.f5768V = iArr;
                Arrays.fill(iArr, -1);
                for (int i7 = 0; i7 < i6; i7++) {
                    int i8 = 0;
                    while (true) {
                        q[] qVarArr = this.f5754G;
                        if (i8 < qVarArr.length) {
                            C0095p q4 = qVarArr[i8].q();
                            W.a.k(q4);
                            C0095p c0095p = this.f5766T.a(i7).f2172d[0];
                            String str = c0095p.f2325m;
                            String str2 = q4.f2325m;
                            int g4 = H.g(str2);
                            if (g4 == 3) {
                                if (y.a(str2, str)) {
                                    if ((!"application/cea-608".equals(str2) && !"application/cea-708".equals(str2)) || q4.f2308F == c0095p.f2308F) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i8++;
                            } else if (g4 == H.g(str)) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                    this.f5768V[i7] = i8;
                }
                Iterator it = this.f5751D.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).b();
                }
                return;
            }
            int length = this.f5754G.length;
            int i9 = 0;
            int i10 = -1;
            int i11 = -2;
            while (true) {
                int i12 = 1;
                if (i9 >= length) {
                    break;
                }
                C0095p q5 = this.f5754G[i9].q();
                W.a.k(q5);
                String str3 = q5.f2325m;
                if (H.k(str3)) {
                    i12 = 2;
                } else if (!H.h(str3)) {
                    i12 = H.j(str3) ? 3 : -2;
                }
                if (B(i12) > B(i11)) {
                    i10 = i9;
                    i11 = i12;
                } else if (i12 == i11 && i10 != -1) {
                    i10 = -1;
                }
                i9++;
            }
            V v4 = this.f5785o.f5664h;
            int i13 = v4.f2169a;
            this.f5769W = -1;
            this.f5768V = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                this.f5768V[i14] = i14;
            }
            V[] vArr = new V[length];
            int i15 = 0;
            while (i15 < length) {
                C0095p q6 = this.f5754G[i15].q();
                W.a.k(q6);
                String str4 = this.f5782l;
                C0095p c0095p2 = this.f5787q;
                if (i15 == i10) {
                    C0095p[] c0095pArr = new C0095p[i13];
                    for (int i16 = i5; i16 < i13; i16++) {
                        C0095p c0095p3 = v4.f2172d[i16];
                        if (i11 == 1 && c0095p2 != null) {
                            c0095p3 = c0095p3.d(c0095p2);
                        }
                        c0095pArr[i16] = i13 == 1 ? q6.d(c0095p3) : y(c0095p3, q6, true);
                    }
                    vArr[i15] = new V(str4, c0095pArr);
                    this.f5769W = i15;
                    i4 = 0;
                } else {
                    if (i11 != 2 || !H.h(q6.f2325m)) {
                        c0095p2 = null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str4);
                    sb.append(":muxed:");
                    sb.append(i15 < i10 ? i15 : i15 - 1);
                    i4 = 0;
                    vArr[i15] = new V(sb.toString(), y(c0095p2, q6, false));
                }
                i15++;
                i5 = i4;
            }
            int i17 = i5;
            this.f5766T = o(vArr);
            W.a.j(this.f5767U == null ? 1 : i17);
            this.f5767U = Collections.emptySet();
            this.f5761O = true;
            this.f5784n.D();
        }
    }

    public final void E() {
        this.f5790u.a();
        i iVar = this.f5785o;
        C0470b c0470b = iVar.f5670n;
        if (c0470b != null) {
            throw c0470b;
        }
        Uri uri = iVar.f5671o;
        if (uri == null || !iVar.s) {
            return;
        }
        h0.b bVar = (h0.b) iVar.f5663g.f5867o.get(uri);
        bVar.f5854m.a();
        IOException iOException = bVar.f5861u;
        if (iOException != null) {
            throw iOException;
        }
    }

    public final void F(V[] vArr, int... iArr) {
        this.f5766T = o(vArr);
        this.f5767U = new HashSet();
        for (int i4 : iArr) {
            this.f5767U.add(this.f5766T.a(i4));
        }
        this.f5769W = 0;
        this.f5750C.post(new F2.c(5, this.f5784n));
        this.f5761O = true;
    }

    public final void G() {
        for (q qVar : this.f5754G) {
            qVar.z(this.f5775c0);
        }
        this.f5775c0 = false;
    }

    public final boolean H(long j4, boolean z4) {
        k kVar;
        boolean z5;
        this.f5773a0 = j4;
        if (C()) {
            this.f5774b0 = j4;
            return true;
        }
        boolean z6 = this.f5785o.f5672p;
        ArrayList arrayList = this.f5793y;
        if (z6) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                kVar = (k) arrayList.get(i4);
                if (kVar.f8026r == j4) {
                    break;
                }
            }
        }
        kVar = null;
        if (this.f5760N && !z4) {
            int length = this.f5754G.length;
            for (int i5 = 0; i5 < length; i5++) {
                q qVar = this.f5754G[i5];
                if (!(kVar != null ? qVar.A(kVar.g(i5)) : qVar.B(j4, false)) && (this.f5772Z[i5] || !this.f5770X)) {
                    z5 = false;
                    break;
                }
            }
            z5 = true;
            if (z5) {
                return false;
            }
        }
        this.f5774b0 = j4;
        this.f5777e0 = false;
        arrayList.clear();
        u0.n nVar = this.f5790u;
        if (nVar.d()) {
            if (this.f5760N) {
                for (q qVar2 : this.f5754G) {
                    qVar2.g();
                }
            }
            nVar.b();
        } else {
            nVar.f8544n = null;
            G();
        }
        return true;
    }

    public final void a() {
        W.a.j(this.f5761O);
        this.f5766T.getClass();
        this.f5767U.getClass();
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f5790u.d();
    }

    @Override // u0.l
    public final void f() {
        for (q qVar : this.f5754G) {
            qVar.y();
        }
    }

    @Override // q0.c0
    public final long h() {
        if (this.f5777e0) {
            return Long.MIN_VALUE;
        }
        if (C()) {
            return this.f5774b0;
        }
        long j4 = this.f5773a0;
        k A4 = A();
        if (!A4.f5694S) {
            ArrayList arrayList = this.f5793y;
            A4 = arrayList.size() > 1 ? (k) arrayList.get(arrayList.size() - 2) : null;
        }
        if (A4 != null) {
            j4 = Math.max(j4, A4.s);
        }
        if (this.f5760N) {
            for (q qVar : this.f5754G) {
                j4 = Math.max(j4, qVar.l());
            }
        }
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /* JADX WARN: Type inference failed for: r1v25, types: [q0.b, java.io.IOException] */
    @Override // q0.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(a0.Q r58) {
        /*
            Method dump skipped, instructions count: 1396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.r.i(a0.Q):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u0.i
    public final void k(u0.k kVar, long j4, long j5) {
        AbstractC0503e abstractC0503e = (AbstractC0503e) kVar;
        this.f5753F = null;
        i iVar = this.f5785o;
        if (abstractC0503e instanceof C0309e) {
            C0309e c0309e = (C0309e) abstractC0503e;
            iVar.f5669m = c0309e.f5648u;
            Uri uri = c0309e.f8021m.f3029a;
            byte[] bArr = c0309e.w;
            bArr.getClass();
            f2.Y y4 = iVar.f5666j;
            y4.getClass();
            uri.getClass();
        }
        long j6 = abstractC0503e.f8020l;
        Uri uri2 = abstractC0503e.f8027t.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f5789t.getClass();
        this.f5791v.f(c0491x, abstractC0503e.f8022n, this.f5783m, abstractC0503e.f8023o, abstractC0503e.f8024p, abstractC0503e.f8025q, abstractC0503e.f8026r, abstractC0503e.s);
        if (this.f5761O) {
            this.f5784n.f(this);
            return;
        }
        P p2 = new P();
        p2.f3329a = this.f5773a0;
        i(new Q(p2));
    }

    @Override // q0.Y
    public final void n() {
        this.f5750C.post(this.f5748A);
    }

    public final k0 o(V[] vArr) {
        for (int i4 = 0; i4 < vArr.length; i4++) {
            V v4 = vArr[i4];
            C0095p[] c0095pArr = new C0095p[v4.f2169a];
            for (int i5 = 0; i5 < v4.f2169a; i5++) {
                C0095p c0095p = v4.f2172d[i5];
                int d4 = this.f5788r.d(c0095p);
                C0094o a4 = c0095p.a();
                a4.f2278I = d4;
                c0095pArr[i5] = new C0095p(a4);
            }
            vArr[i4] = new V(v4.f2170b, c0095pArr);
        }
        return new k0(vArr);
    }

    @Override // u0.i
    public final C0271e q(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        boolean z4;
        C0271e c0271e;
        int i5;
        AbstractC0503e abstractC0503e = (AbstractC0503e) kVar;
        boolean z5 = abstractC0503e instanceof k;
        if (z5 && !((k) abstractC0503e).f5697V && (iOException instanceof w) && ((i5 = ((w) iOException).f3063o) == 410 || i5 == 404)) {
            return u0.n.f8539o;
        }
        long j6 = abstractC0503e.f8027t.f2989m;
        Uri uri = abstractC0503e.f8027t.f2990n;
        C0491x c0491x = new C0491x(j5);
        y.Z(abstractC0503e.f8026r);
        y.Z(abstractC0503e.s);
        B.c cVar = new B.c(i4, iOException);
        i iVar = this.f5785o;
        u0.h t4 = AbstractC0462a.t(iVar.f5673q);
        this.f5789t.getClass();
        C0271e d4 = C0560b.d(t4, cVar);
        if (d4 == null || d4.f5489a != 2) {
            z4 = false;
        } else {
            t0.s sVar = iVar.f5673q;
            z4 = sVar.q(d4.f5490b, sVar.u(iVar.f5664h.b(abstractC0503e.f8023o)));
        }
        if (z4) {
            if (z5 && j6 == 0) {
                ArrayList arrayList = this.f5793y;
                W.a.j(((k) arrayList.remove(arrayList.size() - 1)) == abstractC0503e);
                if (arrayList.isEmpty()) {
                    this.f5774b0 = this.f5773a0;
                } else {
                    ((k) f2.r.l(arrayList)).f5696U = true;
                }
            }
            c0271e = u0.n.f8540p;
        } else {
            long f4 = C0560b.f(cVar);
            c0271e = f4 != -9223372036854775807L ? new C0271e(0, f4, false) : u0.n.f8541q;
        }
        boolean a4 = c0271e.a();
        this.f5791v.h(c0491x, abstractC0503e.f8022n, this.f5783m, abstractC0503e.f8023o, abstractC0503e.f8024p, abstractC0503e.f8025q, abstractC0503e.f8026r, abstractC0503e.s, iOException, !a4);
        if (!a4) {
            this.f5753F = null;
        }
        if (z4) {
            if (this.f5761O) {
                this.f5784n.f(this);
            } else {
                P p2 = new P();
                p2.f3329a = this.f5773a0;
                i(new Q(p2));
            }
        }
        return c0271e;
    }

    @Override // q0.c0
    public final long r() {
        if (C()) {
            return this.f5774b0;
        }
        if (this.f5777e0) {
            return Long.MIN_VALUE;
        }
        return A().s;
    }

    @Override // y0.q
    public final void s() {
        this.f5778f0 = true;
        this.f5750C.post(this.f5749B);
    }

    @Override // y0.q
    public final void t(z zVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [y0.n] */
    @Override // y0.q
    public final F v(int i4, int i5) {
        Integer valueOf = Integer.valueOf(i5);
        Set set = f5747j0;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.f5756I;
        SparseIntArray sparseIntArray = this.J;
        q qVar = null;
        if (contains) {
            W.a.e(set.contains(Integer.valueOf(i5)));
            int i6 = sparseIntArray.get(i5, -1);
            if (i6 != -1) {
                if (hashSet.add(Integer.valueOf(i5))) {
                    this.f5755H[i6] = i4;
                }
                qVar = this.f5755H[i6] == i4 ? this.f5754G[i6] : d(i4, i5);
            }
        } else {
            int i7 = 0;
            while (true) {
                q[] qVarArr = this.f5754G;
                if (i7 >= qVarArr.length) {
                    break;
                }
                if (this.f5755H[i7] == i4) {
                    qVar = qVarArr[i7];
                    break;
                }
                i7++;
            }
        }
        if (qVar == null) {
            if (this.f5778f0) {
                return d(i4, i5);
            }
            int length = this.f5754G.length;
            boolean z4 = i5 == 1 || i5 == 2;
            qVar = new q(this.f5786p, this.f5788r, this.s, this.f5752E);
            qVar.f7802t = this.f5773a0;
            if (z4) {
                qVar.f5746I = this.f5780h0;
                qVar.f7807z = true;
            }
            long j4 = this.f5779g0;
            if (qVar.f7782F != j4) {
                qVar.f7782F = j4;
                qVar.f7807z = true;
            }
            if (this.f5781i0 != null) {
                qVar.f7779C = r2.f5698v;
            }
            qVar.f7789f = this;
            int i8 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f5755H, i8);
            this.f5755H = copyOf;
            copyOf[length] = i4;
            q[] qVarArr2 = this.f5754G;
            int i9 = y.f2709a;
            Object[] copyOf2 = Arrays.copyOf(qVarArr2, qVarArr2.length + 1);
            copyOf2[qVarArr2.length] = qVar;
            this.f5754G = (q[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.f5772Z, i8);
            this.f5772Z = copyOf3;
            copyOf3[length] = z4;
            this.f5770X |= z4;
            hashSet.add(Integer.valueOf(i5));
            sparseIntArray.append(i5, length);
            if (B(i5) > B(this.f5758L)) {
                this.f5759M = length;
                this.f5758L = i5;
            }
            this.f5771Y = Arrays.copyOf(this.f5771Y, i8);
        }
        if (i5 != 5) {
            return qVar;
        }
        if (this.f5757K == null) {
            this.f5757K = new p(qVar, this.w);
        }
        return this.f5757K;
    }

    @Override // q0.c0
    public final void w(long j4) {
        u0.n nVar = this.f5790u;
        if (nVar.c() || C()) {
            return;
        }
        boolean d4 = nVar.d();
        i iVar = this.f5785o;
        List list = this.f5794z;
        if (d4) {
            this.f5753F.getClass();
            if (iVar.f5670n != null ? false : iVar.f5673q.f(j4, this.f5753F, list)) {
                nVar.b();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && iVar.b((k) list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            z(size);
        }
        int size2 = (iVar.f5670n != null || iVar.f5673q.length() < 2) ? list.size() : iVar.f5673q.n(j4, list);
        if (size2 < this.f5793y.size()) {
            z(size2);
        }
    }

    @Override // u0.i
    public final void x(u0.k kVar, long j4, long j5, boolean z4) {
        AbstractC0503e abstractC0503e = (AbstractC0503e) kVar;
        this.f5753F = null;
        long j6 = abstractC0503e.f8020l;
        Uri uri = abstractC0503e.f8027t.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f5789t.getClass();
        this.f5791v.c(c0491x, abstractC0503e.f8022n, this.f5783m, abstractC0503e.f8023o, abstractC0503e.f8024p, abstractC0503e.f8025q, abstractC0503e.f8026r, abstractC0503e.s);
        if (z4) {
            return;
        }
        if (C() || this.f5762P == 0) {
            G();
        }
        if (this.f5762P > 0) {
            this.f5784n.f(this);
        }
    }

    public final void z(int i4) {
        ArrayList arrayList;
        W.a.j(!this.f5790u.d());
        int i5 = i4;
        loop0: while (true) {
            arrayList = this.f5793y;
            if (i5 >= arrayList.size()) {
                i5 = -1;
                break;
            }
            int i6 = i5;
            while (true) {
                if (i6 >= arrayList.size()) {
                    k kVar = (k) arrayList.get(i5);
                    for (int i7 = 0; i7 < this.f5754G.length; i7++) {
                        if (this.f5754G[i7].n() > kVar.g(i7)) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (((k) arrayList.get(i6)).f5700y) {
                    break;
                } else {
                    i6++;
                }
            }
            i5++;
        }
        if (i5 == -1) {
            return;
        }
        long j4 = A().s;
        k kVar2 = (k) arrayList.get(i5);
        y.R(arrayList, i5, arrayList.size());
        for (int i8 = 0; i8 < this.f5754G.length; i8++) {
            this.f5754G[i8].i(kVar2.g(i8));
        }
        if (arrayList.isEmpty()) {
            this.f5774b0 = this.f5773a0;
        } else {
            ((k) f2.r.l(arrayList)).f5696U = true;
        }
        this.f5777e0 = false;
        this.f5791v.m(new n0.g(1, this.f5758L, null, 3, null, y.Z(kVar2.f8026r), y.Z(j4)));
    }
}
