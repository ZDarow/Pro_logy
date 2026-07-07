package q0;

import I.C0044m;
import T.C0094o;
import T.C0095p;
import a0.m0;
import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t0.C0560b;

/* loaded from: classes.dex */
public final class T implements InterfaceC0467D, y0.q, u0.i, u0.l, Y {

    /* renamed from: Y, reason: collision with root package name */
    public static final Map f7716Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final C0095p f7717Z;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0466C f7719B;

    /* renamed from: C, reason: collision with root package name */
    public L0.b f7720C;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7723F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7724G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7725H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f7726I;
    public C0044m J;

    /* renamed from: K, reason: collision with root package name */
    public y0.z f7727K;

    /* renamed from: L, reason: collision with root package name */
    public long f7728L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f7729M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7731O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f7732P;

    /* renamed from: Q, reason: collision with root package name */
    public int f7733Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f7734R;

    /* renamed from: S, reason: collision with root package name */
    public long f7735S;

    /* renamed from: U, reason: collision with root package name */
    public boolean f7737U;

    /* renamed from: V, reason: collision with root package name */
    public int f7738V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f7739W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f7740X;

    /* renamed from: l, reason: collision with root package name */
    public final Uri f7741l;

    /* renamed from: m, reason: collision with root package name */
    public final Y.h f7742m;

    /* renamed from: n, reason: collision with root package name */
    public final f0.i f7743n;

    /* renamed from: o, reason: collision with root package name */
    public final C0560b f7744o;

    /* renamed from: p, reason: collision with root package name */
    public final f0.e f7745p;

    /* renamed from: q, reason: collision with root package name */
    public final f0.e f7746q;

    /* renamed from: r, reason: collision with root package name */
    public final V f7747r;
    public final u0.e s;

    /* renamed from: t, reason: collision with root package name */
    public final long f7748t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7749u;
    public final android.support.v4.media.session.t w;

    /* renamed from: v, reason: collision with root package name */
    public final u0.n f7750v = new u0.n("ProgressiveMediaPeriod");

    /* renamed from: x, reason: collision with root package name */
    public final T2.n f7751x = new Object();

    /* renamed from: y, reason: collision with root package name */
    public final N f7752y = new N(this, 1);

    /* renamed from: z, reason: collision with root package name */
    public final N f7753z = new N(this, 2);

    /* renamed from: A, reason: collision with root package name */
    public final Handler f7718A = W.y.n(null);

    /* renamed from: E, reason: collision with root package name */
    public S[] f7722E = new S[0];

    /* renamed from: D, reason: collision with root package name */
    public Z[] f7721D = new Z[0];

    /* renamed from: T, reason: collision with root package name */
    public long f7736T = -9223372036854775807L;

    /* renamed from: N, reason: collision with root package name */
    public int f7730N = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f7716Y = Collections.unmodifiableMap(hashMap);
        C0094o c0094o = new C0094o();
        c0094o.f2279a = "icy";
        c0094o.f2290l = T.H.l("application/x-icy");
        f7717Z = new C0095p(c0094o);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [T2.n, java.lang.Object] */
    public T(Uri uri, Y.h hVar, android.support.v4.media.session.t tVar, f0.i iVar, f0.e eVar, C0560b c0560b, f0.e eVar2, V v4, u0.e eVar3, int i4, long j4) {
        this.f7741l = uri;
        this.f7742m = hVar;
        this.f7743n = iVar;
        this.f7746q = eVar;
        this.f7744o = c0560b;
        this.f7745p = eVar2;
        this.f7747r = v4;
        this.s = eVar3;
        this.f7748t = i4;
        this.w = tVar;
        this.f7749u = j4;
    }

    public final void A(int i4) {
        a();
        C0044m c0044m = this.J;
        boolean[] zArr = (boolean[]) c0044m.f850o;
        if (zArr[i4]) {
            return;
        }
        C0095p c0095p = ((k0) c0044m.f847l).a(i4).f2172d[0];
        this.f7745p.a(T.H.g(c0095p.f2325m), c0095p, 0, null, this.f7735S);
        zArr[i4] = true;
    }

    public final void B(int i4) {
        a();
        boolean[] zArr = (boolean[]) this.J.f848m;
        if (this.f7737U && zArr[i4] && !this.f7721D[i4].s(false)) {
            this.f7736T = 0L;
            this.f7737U = false;
            this.f7732P = true;
            this.f7735S = 0L;
            this.f7738V = 0;
            for (Z z4 : this.f7721D) {
                z4.z(false);
            }
            InterfaceC0466C interfaceC0466C = this.f7719B;
            interfaceC0466C.getClass();
            interfaceC0466C.f(this);
        }
    }

    public final y0.F C(S s) {
        int length = this.f7721D.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (s.equals(this.f7722E[i4])) {
                return this.f7721D[i4];
            }
        }
        if (this.f7723F) {
            W.a.A("ProgressiveMediaPeriod", "Extractor added new track (id=" + s.f7714a + ") after finishing tracks.");
            return new y0.n();
        }
        f0.e eVar = this.f7746q;
        f0.i iVar = this.f7743n;
        iVar.getClass();
        Z z4 = new Z(this.s, iVar, eVar);
        z4.f7789f = this;
        int i5 = length + 1;
        S[] sArr = (S[]) Arrays.copyOf(this.f7722E, i5);
        sArr[length] = s;
        int i6 = W.y.f2709a;
        this.f7722E = sArr;
        Z[] zArr = (Z[]) Arrays.copyOf(this.f7721D, i5);
        zArr[length] = z4;
        this.f7721D = zArr;
        return z4;
    }

    public final void D() {
        P p2 = new P(this, this.f7741l, this.f7742m, this.w, this, this.f7751x);
        if (this.f7724G) {
            W.a.j(y());
            long j4 = this.f7728L;
            if (j4 != -9223372036854775807L && this.f7736T > j4) {
                this.f7739W = true;
                this.f7736T = -9223372036854775807L;
                return;
            }
            y0.z zVar = this.f7727K;
            zVar.getClass();
            long j5 = zVar.f(this.f7736T).f9141a.f8992b;
            long j6 = this.f7736T;
            p2.f7706r.f2352a = j5;
            p2.f7708u = j6;
            p2.f7707t = true;
            p2.f7710x = false;
            for (Z z4 : this.f7721D) {
                z4.f7802t = this.f7736T;
            }
            this.f7736T = -9223372036854775807L;
        }
        this.f7738V = d();
        this.f7745p.k(new C0491x(p2.f7700l, p2.f7709v, this.f7750v.f(p2, this, this.f7744o.e(this.f7730N))), 1, -1, null, 0, null, p2.f7708u, this.f7728L);
    }

    public final boolean E() {
        return this.f7732P || y();
    }

    public final void a() {
        W.a.j(this.f7724G);
        this.J.getClass();
        this.f7727K.getClass();
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        a();
        if (!this.f7727K.c()) {
            return 0L;
        }
        y0.y f4 = this.f7727K.f(j4);
        return m0Var.a(j4, f4.f9141a.f8991a, f4.f9142b.f8991a);
    }

    @Override // q0.c0
    public final boolean c() {
        boolean z4;
        if (this.f7750v.d()) {
            T2.n nVar = this.f7751x;
            synchronized (nVar) {
                z4 = nVar.f2455a;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        int i4 = 0;
        for (Z z4 : this.f7721D) {
            i4 += z4.f7800q + z4.f7799p;
        }
        return i4;
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        a();
        return (k0) this.J.f847l;
    }

    @Override // u0.l
    public final void f() {
        for (Z z4 : this.f7721D) {
            z4.y();
        }
        android.support.v4.media.session.t tVar = this.w;
        y0.o oVar = (y0.o) tVar.f3735n;
        if (oVar != null) {
            oVar.release();
            tVar.f3735n = null;
        }
        tVar.f3736o = null;
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        this.f7719B = interfaceC0466C;
        this.f7751x.b();
        D();
    }

    @Override // q0.c0
    public final long h() {
        long j4;
        boolean z4;
        a();
        if (this.f7739W || this.f7733Q == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.f7736T;
        }
        if (this.f7725H) {
            int length = this.f7721D.length;
            j4 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < length; i4++) {
                C0044m c0044m = this.J;
                if (((boolean[]) c0044m.f848m)[i4] && ((boolean[]) c0044m.f849n)[i4]) {
                    Z z5 = this.f7721D[i4];
                    synchronized (z5) {
                        z4 = z5.w;
                    }
                    if (!z4) {
                        j4 = Math.min(j4, this.f7721D[i4].l());
                    }
                }
            }
        } else {
            j4 = Long.MAX_VALUE;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = o(false);
        }
        return j4 == Long.MIN_VALUE ? this.f7735S : j4;
    }

    @Override // q0.c0
    public final boolean i(a0.Q q4) {
        if (this.f7739W) {
            return false;
        }
        u0.n nVar = this.f7750v;
        if (nVar.c() || this.f7737U) {
            return false;
        }
        if (this.f7724G && this.f7733Q == 0) {
            return false;
        }
        boolean b4 = this.f7751x.b();
        if (nVar.d()) {
            return b4;
        }
        D();
        return true;
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        int e4 = this.f7744o.e(this.f7730N);
        u0.n nVar = this.f7750v;
        IOException iOException = nVar.f8544n;
        if (iOException != null) {
            throw iOException;
        }
        u0.j jVar = nVar.f8543m;
        if (jVar != null) {
            if (e4 == Integer.MIN_VALUE) {
                e4 = jVar.f8530l;
            }
            IOException iOException2 = jVar.f8534p;
            if (iOException2 != null && jVar.f8535q > e4) {
                throw iOException2;
            }
        }
        if (this.f7739W && !this.f7724G) {
            throw T.I.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // u0.i
    public final void k(u0.k kVar, long j4, long j5) {
        y0.z zVar;
        P p2 = (P) kVar;
        if (this.f7728L == -9223372036854775807L && (zVar = this.f7727K) != null) {
            boolean c4 = zVar.c();
            long o2 = o(true);
            long j6 = o2 == Long.MIN_VALUE ? 0L : o2 + 10000;
            this.f7728L = j6;
            this.f7747r.w(j6, c4, this.f7729M);
        }
        Uri uri = p2.f7702n.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f7744o.getClass();
        this.f7745p.f(c0491x, 1, -1, null, 0, null, p2.f7708u, this.f7728L);
        this.f7739W = true;
        InterfaceC0466C interfaceC0466C = this.f7719B;
        interfaceC0466C.getClass();
        interfaceC0466C.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final long l(long j4) {
        boolean z4;
        a();
        boolean[] zArr = (boolean[]) this.J.f848m;
        if (!this.f7727K.c()) {
            j4 = 0;
        }
        this.f7732P = false;
        this.f7735S = j4;
        if (y()) {
            this.f7736T = j4;
            return j4;
        }
        int i4 = this.f7730N;
        u0.n nVar = this.f7750v;
        if (i4 != 7 && (this.f7739W || nVar.d())) {
            int length = this.f7721D.length;
            for (int i5 = 0; i5 < length; i5++) {
                Z z5 = this.f7721D[i5];
                if (!(this.f7726I ? z5.A(z5.f7800q) : z5.B(j4, false)) && (zArr[i5] || !this.f7725H)) {
                    z4 = false;
                    break;
                }
            }
            z4 = true;
            if (z4) {
                return j4;
            }
        }
        this.f7737U = false;
        this.f7736T = j4;
        this.f7739W = false;
        if (nVar.d()) {
            for (Z z6 : this.f7721D) {
                z6.g();
            }
            nVar.b();
        } else {
            nVar.f8544n = null;
            for (Z z7 : this.f7721D) {
                z7.z(false);
            }
        }
        return j4;
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        if (this.f7726I) {
            return;
        }
        a();
        if (y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.J.f849n;
        int length = this.f7721D.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f7721D[i4].f(j4, zArr[i4]);
        }
    }

    @Override // q0.Y
    public final void n() {
        this.f7718A.post(this.f7752y);
    }

    public final long o(boolean z4) {
        int i4;
        long j4 = Long.MIN_VALUE;
        while (i4 < this.f7721D.length) {
            if (!z4) {
                C0044m c0044m = this.J;
                c0044m.getClass();
                i4 = ((boolean[]) c0044m.f849n)[i4] ? 0 : i4 + 1;
            }
            j4 = Math.max(j4, this.f7721D[i4].l());
        }
        return j4;
    }

    @Override // q0.InterfaceC0467D
    public final long p(t0.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j4) {
        t0.s sVar;
        a();
        C0044m c0044m = this.J;
        k0 k0Var = (k0) c0044m.f847l;
        boolean[] zArr3 = (boolean[]) c0044m.f849n;
        int i4 = this.f7733Q;
        int i5 = 0;
        for (int i6 = 0; i6 < sVarArr.length; i6++) {
            a0 a0Var = a0VarArr[i6];
            if (a0Var != null && (sVarArr[i6] == null || !zArr[i6])) {
                int i7 = ((Q) a0Var).f7712l;
                W.a.j(zArr3[i7]);
                this.f7733Q--;
                zArr3[i7] = false;
                a0VarArr[i6] = null;
            }
        }
        boolean z4 = !this.f7731O ? j4 == 0 || this.f7726I : i4 != 0;
        for (int i8 = 0; i8 < sVarArr.length; i8++) {
            if (a0VarArr[i8] == null && (sVar = sVarArr[i8]) != null) {
                W.a.j(sVar.length() == 1);
                W.a.j(sVar.k(0) == 0);
                int b4 = k0Var.b(sVar.b());
                W.a.j(!zArr3[b4]);
                this.f7733Q++;
                zArr3[b4] = true;
                a0VarArr[i8] = new Q(this, b4);
                zArr2[i8] = true;
                if (!z4) {
                    Z z5 = this.f7721D[b4];
                    z4 = (z5.n() == 0 || z5.B(j4, true)) ? false : true;
                }
            }
        }
        if (this.f7733Q == 0) {
            this.f7737U = false;
            this.f7732P = false;
            u0.n nVar = this.f7750v;
            if (nVar.d()) {
                Z[] zArr4 = this.f7721D;
                int length = zArr4.length;
                while (i5 < length) {
                    zArr4[i5].g();
                    i5++;
                }
                nVar.b();
            } else {
                this.f7739W = false;
                for (Z z6 : this.f7721D) {
                    z6.z(false);
                }
            }
        } else if (z4) {
            j4 = l(j4);
            while (i5 < a0VarArr.length) {
                if (a0VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
                i5++;
            }
        }
        this.f7731O = true;
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // u0.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f1.C0271e q(u0.k r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.T.q(u0.k, long, long, java.io.IOException, int):f1.e");
    }

    @Override // q0.c0
    public final long r() {
        return h();
    }

    @Override // y0.q
    public final void s() {
        this.f7723F = true;
        this.f7718A.post(this.f7752y);
    }

    @Override // y0.q
    public final void t(y0.z zVar) {
        this.f7718A.post(new W.m(11, this, zVar));
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        if (!this.f7732P) {
            return -9223372036854775807L;
        }
        if (!this.f7739W && d() <= this.f7738V) {
            return -9223372036854775807L;
        }
        this.f7732P = false;
        return this.f7735S;
    }

    @Override // y0.q
    public final y0.F v(int i4, int i5) {
        return C(new S(i4, false));
    }

    @Override // q0.c0
    public final void w(long j4) {
    }

    @Override // u0.i
    public final void x(u0.k kVar, long j4, long j5, boolean z4) {
        P p2 = (P) kVar;
        Uri uri = p2.f7702n.f2990n;
        C0491x c0491x = new C0491x(j5);
        this.f7744o.getClass();
        this.f7745p.c(c0491x, 1, -1, null, 0, null, p2.f7708u, this.f7728L);
        if (z4) {
            return;
        }
        for (Z z5 : this.f7721D) {
            z5.z(false);
        }
        if (this.f7733Q > 0) {
            InterfaceC0466C interfaceC0466C = this.f7719B;
            interfaceC0466C.getClass();
            interfaceC0466C.f(this);
        }
    }

    public final boolean y() {
        return this.f7736T != -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [I.m, java.lang.Object] */
    public final void z() {
        long j4;
        int i4;
        if (this.f7740X || this.f7724G || !this.f7723F || this.f7727K == null) {
            return;
        }
        for (Z z4 : this.f7721D) {
            if (z4.q() == null) {
                return;
            }
        }
        this.f7751x.a();
        int length = this.f7721D.length;
        T.V[] vArr = new T.V[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (true) {
            j4 = this.f7749u;
            if (i5 >= length) {
                break;
            }
            C0095p q4 = this.f7721D[i5].q();
            q4.getClass();
            String str = q4.f2325m;
            boolean h4 = T.H.h(str);
            boolean z5 = h4 || T.H.k(str);
            zArr[i5] = z5;
            this.f7725H = z5 | this.f7725H;
            this.f7726I = j4 != -9223372036854775807L && length == 1 && T.H.i(str);
            L0.b bVar = this.f7720C;
            if (bVar != null) {
                if (h4 || this.f7722E[i5].f7715b) {
                    T.G g4 = q4.f2323k;
                    T.G g5 = g4 == null ? new T.G(bVar) : g4.d(bVar);
                    C0094o a4 = q4.a();
                    a4.f2288j = g5;
                    q4 = new C0095p(a4);
                }
                if (h4 && q4.f2319g == -1 && q4.f2320h == -1 && (i4 = bVar.f1044l) != -1) {
                    C0094o a5 = q4.a();
                    a5.f2285g = i4;
                    q4 = new C0095p(a5);
                }
            }
            int d4 = this.f7743n.d(q4);
            C0094o a6 = q4.a();
            a6.f2278I = d4;
            vArr[i5] = new T.V(Integer.toString(i5), new C0095p(a6));
            i5++;
        }
        k0 k0Var = new k0(vArr);
        ?? obj = new Object();
        obj.f847l = k0Var;
        obj.f848m = zArr;
        int i6 = k0Var.f7877a;
        obj.f849n = new boolean[i6];
        obj.f850o = new boolean[i6];
        this.J = obj;
        if (this.f7726I && this.f7728L == -9223372036854775807L) {
            this.f7728L = j4;
            this.f7727K = new O(this, this.f7727K);
        }
        this.f7747r.w(this.f7728L, this.f7727K.c(), this.f7729M);
        this.f7724G = true;
        InterfaceC0466C interfaceC0466C = this.f7719B;
        interfaceC0466C.getClass();
        interfaceC0466C.o(this);
    }
}
