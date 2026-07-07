package q0;

import T.C0092m;
import T.C0094o;
import T.C0095p;
import T.InterfaceC0089j;
import android.util.SparseArray;
import java.io.EOFException;

/* loaded from: classes.dex */
public class Z implements y0.F {

    /* renamed from: A, reason: collision with root package name */
    public C0095p f7777A;

    /* renamed from: B, reason: collision with root package name */
    public C0095p f7778B;

    /* renamed from: C, reason: collision with root package name */
    public long f7779C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f7780D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f7781E;

    /* renamed from: F, reason: collision with root package name */
    public long f7782F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7783G;

    /* renamed from: a, reason: collision with root package name */
    public final W f7784a;

    /* renamed from: c, reason: collision with root package name */
    public final P2.a f7786c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.i f7787d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.e f7788e;

    /* renamed from: f, reason: collision with root package name */
    public Y f7789f;

    /* renamed from: g, reason: collision with root package name */
    public C0095p f7790g;

    /* renamed from: h, reason: collision with root package name */
    public K2.o f7791h;

    /* renamed from: p, reason: collision with root package name */
    public int f7799p;

    /* renamed from: q, reason: collision with root package name */
    public int f7800q;

    /* renamed from: r, reason: collision with root package name */
    public int f7801r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public long f7802t;

    /* renamed from: u, reason: collision with root package name */
    public long f7803u;

    /* renamed from: v, reason: collision with root package name */
    public long f7804v;
    public boolean w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7805x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7806y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f7807z;

    /* renamed from: b, reason: collision with root package name */
    public final i0.g f7785b = new Object();

    /* renamed from: i, reason: collision with root package name */
    public int f7792i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f7793j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f7794k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f7797n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f7796m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f7795l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    public y0.E[] f7798o = new y0.E[1000];

    /* JADX WARN: Type inference failed for: r1v1, types: [i0.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [P2.a, java.lang.Object] */
    public Z(u0.e eVar, f0.i iVar, f0.e eVar2) {
        this.f7787d = iVar;
        this.f7788e = eVar2;
        this.f7784a = new W(eVar);
        b0.d dVar = new b0.d(18);
        ?? obj = new Object();
        obj.f1501m = new SparseArray();
        obj.f1502n = dVar;
        obj.f1500l = -1;
        this.f7786c = obj;
        this.f7802t = Long.MIN_VALUE;
        this.f7803u = Long.MIN_VALUE;
        this.f7804v = Long.MIN_VALUE;
        this.f7806y = true;
        this.f7805x = true;
        this.f7780D = true;
    }

    public final synchronized boolean A(int i4) {
        synchronized (this) {
            this.s = 0;
            W w = this.f7784a;
            w.f7772e = w.f7771d;
        }
        int i5 = this.f7800q;
        if (i4 >= i5 && i4 <= this.f7799p + i5) {
            this.f7802t = Long.MIN_VALUE;
            this.s = i4 - i5;
            return true;
        }
        return false;
    }

    public final synchronized boolean B(long j4, boolean z4) {
        int j5;
        try {
            synchronized (this) {
                this.s = 0;
                W w = this.f7784a;
                w.f7772e = w.f7771d;
            }
        } finally {
        }
        int o2 = o(0);
        if (r() && j4 >= this.f7797n[o2] && (j4 <= this.f7804v || z4)) {
            if (this.f7780D) {
                int i4 = this.f7799p - this.s;
                j5 = 0;
                while (true) {
                    if (j5 >= i4) {
                        if (!z4) {
                            i4 = -1;
                        }
                        j5 = i4;
                    } else if (this.f7797n[o2] < j4) {
                        o2++;
                        if (o2 == this.f7792i) {
                            o2 = 0;
                        }
                        j5++;
                    }
                }
            } else {
                j5 = j(o2, this.f7799p - this.s, j4, true);
            }
            if (j5 == -1) {
                return false;
            }
            this.f7802t = j4;
            this.s += j5;
            return true;
        }
        return false;
    }

    public final synchronized void C(int i4) {
        boolean z4;
        if (i4 >= 0) {
            try {
                if (this.s + i4 <= this.f7799p) {
                    z4 = true;
                    W.a.e(z4);
                    this.s += i4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z4 = false;
        W.a.e(z4);
        this.s += i4;
    }

    @Override // y0.F
    public final void a(W.r rVar, int i4, int i5) {
        while (true) {
            W w = this.f7784a;
            if (i4 <= 0) {
                w.getClass();
                return;
            }
            int c4 = w.c(i4);
            S0.e eVar = w.f7773f;
            u0.a aVar = (u0.a) eVar.f1898n;
            rVar.f(aVar.f8491a, ((int) (w.f7774g - eVar.f1896l)) + aVar.f8492b, c4);
            i4 -= c4;
            long j4 = w.f7774g + c4;
            w.f7774g = j4;
            S0.e eVar2 = w.f7773f;
            if (j4 == eVar2.f1897m) {
                w.f7773f = (S0.e) eVar2.f1899o;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x013b, code lost:
    
        if (((q0.X) r0.valueAt(r0.size() - 1)).f7775a.equals(r16.f7778B) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // y0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(long r17, int r19, int r20, int r21, y0.E r22) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.Z.b(long, int, int, int, y0.E):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0111, code lost:
    
        if (r1 == 16) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    @Override // y0.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(T.C0095p r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.Z.c(T.p):void");
    }

    @Override // y0.F
    public final int d(InterfaceC0089j interfaceC0089j, int i4, boolean z4) {
        W w = this.f7784a;
        int c4 = w.c(i4);
        S0.e eVar = w.f7773f;
        u0.a aVar = (u0.a) eVar.f1898n;
        int read = interfaceC0089j.read(aVar.f8491a, ((int) (w.f7774g - eVar.f1896l)) + aVar.f8492b, c4);
        if (read == -1) {
            if (z4) {
                return -1;
            }
            throw new EOFException();
        }
        long j4 = w.f7774g + read;
        w.f7774g = j4;
        S0.e eVar2 = w.f7773f;
        if (j4 != eVar2.f1897m) {
            return read;
        }
        w.f7773f = (S0.e) eVar2.f1899o;
        return read;
    }

    public final long e(int i4) {
        this.f7803u = Math.max(this.f7803u, m(i4));
        this.f7799p -= i4;
        int i5 = this.f7800q + i4;
        this.f7800q = i5;
        int i6 = this.f7801r + i4;
        this.f7801r = i6;
        int i7 = this.f7792i;
        if (i6 >= i7) {
            this.f7801r = i6 - i7;
        }
        int i8 = this.s - i4;
        this.s = i8;
        int i9 = 0;
        if (i8 < 0) {
            this.s = 0;
        }
        while (true) {
            P2.a aVar = this.f7786c;
            SparseArray sparseArray = (SparseArray) aVar.f1501m;
            if (i9 >= sparseArray.size() - 1) {
                break;
            }
            int i10 = i9 + 1;
            if (i5 < sparseArray.keyAt(i10)) {
                break;
            }
            ((b0.d) aVar.f1502n).accept(sparseArray.valueAt(i9));
            sparseArray.removeAt(i9);
            int i11 = aVar.f1500l;
            if (i11 > 0) {
                aVar.f1500l = i11 - 1;
            }
            i9 = i10;
        }
        if (this.f7799p != 0) {
            return this.f7794k[this.f7801r];
        }
        int i12 = this.f7801r;
        if (i12 == 0) {
            i12 = this.f7792i;
        }
        return this.f7794k[i12 - 1] + this.f7795l[r7];
    }

    public final void f(long j4, boolean z4) {
        long j5;
        int i4;
        W w = this.f7784a;
        synchronized (this) {
            try {
                int i5 = this.f7799p;
                j5 = -1;
                if (i5 != 0) {
                    long[] jArr = this.f7797n;
                    int i6 = this.f7801r;
                    if (j4 >= jArr[i6]) {
                        if (z4 && (i4 = this.s) != i5) {
                            i5 = i4 + 1;
                        }
                        int j6 = j(i6, i5, j4, false);
                        if (j6 != -1) {
                            j5 = e(j6);
                        }
                    }
                }
            } finally {
            }
        }
        w.b(j5);
    }

    public final void g() {
        long e4;
        W w = this.f7784a;
        synchronized (this) {
            int i4 = this.f7799p;
            e4 = i4 == 0 ? -1L : e(i4);
        }
        w.b(e4);
    }

    public final long h(int i4) {
        int i5 = this.f7800q;
        int i6 = this.f7799p;
        int i7 = (i5 + i6) - i4;
        boolean z4 = false;
        W.a.e(i7 >= 0 && i7 <= i6 - this.s);
        int i8 = this.f7799p - i7;
        this.f7799p = i8;
        this.f7804v = Math.max(this.f7803u, m(i8));
        if (i7 == 0 && this.w) {
            z4 = true;
        }
        this.w = z4;
        P2.a aVar = this.f7786c;
        SparseArray sparseArray = (SparseArray) aVar.f1501m;
        for (int size = sparseArray.size() - 1; size >= 0 && i4 < sparseArray.keyAt(size); size--) {
            ((b0.d) aVar.f1502n).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        aVar.f1500l = sparseArray.size() > 0 ? Math.min(aVar.f1500l, sparseArray.size() - 1) : -1;
        int i9 = this.f7799p;
        if (i9 == 0) {
            return 0L;
        }
        return this.f7794k[o(i9 - 1)] + this.f7795l[r9];
    }

    public final void i(int i4) {
        long h4 = h(i4);
        W w = this.f7784a;
        W.a.e(h4 <= w.f7774g);
        w.f7774g = h4;
        int i5 = w.f7769b;
        if (h4 != 0) {
            S0.e eVar = w.f7771d;
            if (h4 != eVar.f1896l) {
                while (w.f7774g > eVar.f1897m) {
                    eVar = (S0.e) eVar.f1899o;
                }
                S0.e eVar2 = (S0.e) eVar.f1899o;
                eVar2.getClass();
                w.a(eVar2);
                S0.e eVar3 = new S0.e(eVar.f1897m, i5);
                eVar.f1899o = eVar3;
                if (w.f7774g == eVar.f1897m) {
                    eVar = eVar3;
                }
                w.f7773f = eVar;
                if (w.f7772e == eVar2) {
                    w.f7772e = eVar3;
                    return;
                }
                return;
            }
        }
        w.a(w.f7771d);
        S0.e eVar4 = new S0.e(w.f7774g, i5);
        w.f7771d = eVar4;
        w.f7772e = eVar4;
        w.f7773f = eVar4;
    }

    public final int j(int i4, int i5, long j4, boolean z4) {
        int i6 = -1;
        for (int i7 = 0; i7 < i5; i7++) {
            long j5 = this.f7797n[i4];
            if (j5 > j4) {
                break;
            }
            if (!z4 || (this.f7796m[i4] & 1) != 0) {
                i6 = i7;
                if (j5 == j4) {
                    break;
                }
            }
            i4++;
            if (i4 == this.f7792i) {
                i4 = 0;
            }
        }
        return i6;
    }

    public C0095p k(C0095p c0095p) {
        if (this.f7782F == 0 || c0095p.f2330r == Long.MAX_VALUE) {
            return c0095p;
        }
        C0094o a4 = c0095p.a();
        a4.f2295q = c0095p.f2330r + this.f7782F;
        return new C0095p(a4);
    }

    public final synchronized long l() {
        return this.f7804v;
    }

    public final long m(int i4) {
        long j4 = Long.MIN_VALUE;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int o2 = o(i4 - 1);
        for (int i5 = 0; i5 < i4; i5++) {
            j4 = Math.max(j4, this.f7797n[o2]);
            if ((this.f7796m[o2] & 1) != 0) {
                break;
            }
            o2--;
            if (o2 == -1) {
                o2 = this.f7792i - 1;
            }
        }
        return j4;
    }

    public final int n() {
        return this.f7800q + this.s;
    }

    public final int o(int i4) {
        int i5 = this.f7801r + i4;
        int i6 = this.f7792i;
        return i5 < i6 ? i5 : i5 - i6;
    }

    public final synchronized int p(long j4, boolean z4) {
        int o2 = o(this.s);
        if (r() && j4 >= this.f7797n[o2]) {
            if (j4 > this.f7804v && z4) {
                return this.f7799p - this.s;
            }
            int j5 = j(o2, this.f7799p - this.s, j4, true);
            if (j5 == -1) {
                return 0;
            }
            return j5;
        }
        return 0;
    }

    public final synchronized C0095p q() {
        return this.f7806y ? null : this.f7778B;
    }

    public final boolean r() {
        return this.s != this.f7799p;
    }

    public final synchronized boolean s(boolean z4) {
        C0095p c0095p;
        boolean z5 = true;
        if (r()) {
            if (((X) this.f7786c.f(n())).f7775a != this.f7790g) {
                return true;
            }
            return t(o(this.s));
        }
        if (!z4 && !this.w && ((c0095p = this.f7778B) == null || c0095p == this.f7790g)) {
            z5 = false;
        }
        return z5;
    }

    public final boolean t(int i4) {
        K2.o oVar = this.f7791h;
        if (oVar == null || oVar.t() == 4) {
            return true;
        }
        if ((this.f7796m[i4] & 1073741824) == 0) {
            this.f7791h.getClass();
        }
        return false;
    }

    public final void u() {
        K2.o oVar = this.f7791h;
        if (oVar == null || oVar.t() != 1) {
            return;
        }
        f0.c p2 = this.f7791h.p();
        p2.getClass();
        throw p2;
    }

    public final void v(C0095p c0095p, Y.x xVar) {
        C0095p c0095p2;
        C0095p c0095p3 = this.f7790g;
        boolean z4 = c0095p3 == null;
        C0092m c0092m = c0095p3 == null ? null : c0095p3.f2329q;
        this.f7790g = c0095p;
        C0092m c0092m2 = c0095p.f2329q;
        f0.i iVar = this.f7787d;
        if (iVar != null) {
            int d4 = iVar.d(c0095p);
            C0094o a4 = c0095p.a();
            a4.f2278I = d4;
            c0095p2 = new C0095p(a4);
        } else {
            c0095p2 = c0095p;
        }
        xVar.f3066n = c0095p2;
        xVar.f3065m = this.f7791h;
        if (iVar == null) {
            return;
        }
        if (z4 || !W.y.a(c0092m, c0092m2)) {
            K2.o oVar = this.f7791h;
            f0.e eVar = this.f7788e;
            K2.o a5 = iVar.a(eVar, c0095p);
            this.f7791h = a5;
            xVar.f3065m = a5;
            if (oVar != null) {
                oVar.K(eVar);
            }
        }
    }

    public final synchronized long w() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return r() ? this.f7793j[o(this.s)] : this.f7779C;
    }

    public final int x(Y.x xVar, Z.f fVar, int i4, boolean z4) {
        int i5;
        boolean z5 = (i4 & 2) != 0;
        i0.g gVar = this.f7785b;
        synchronized (this) {
            try {
                fVar.f3141q = false;
                i5 = -3;
                if (r()) {
                    C0095p c0095p = ((X) this.f7786c.f(n())).f7775a;
                    if (!z5 && c0095p == this.f7790g) {
                        int o2 = o(this.s);
                        if (t(o2)) {
                            fVar.f1886m = this.f7796m[o2];
                            if (this.s == this.f7799p - 1 && (z4 || this.w)) {
                                fVar.a(536870912);
                            }
                            fVar.f3142r = this.f7797n[o2];
                            gVar.f6147a = this.f7795l[o2];
                            gVar.f6148b = this.f7794k[o2];
                            gVar.f6149c = this.f7798o[o2];
                            i5 = -4;
                        } else {
                            fVar.f3141q = true;
                        }
                    }
                    v(c0095p, xVar);
                    i5 = -5;
                } else {
                    if (!z4 && !this.w) {
                        C0095p c0095p2 = this.f7778B;
                        if (c0095p2 == null || (!z5 && c0095p2 == this.f7790g)) {
                        }
                        v(c0095p2, xVar);
                        i5 = -5;
                    }
                    fVar.f1886m = 4;
                    fVar.f3142r = Long.MIN_VALUE;
                    i5 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i5 == -4 && !fVar.c(4)) {
            boolean z6 = (i4 & 1) != 0;
            if ((i4 & 4) == 0) {
                if (z6) {
                    W w = this.f7784a;
                    W.f(w.f7772e, fVar, this.f7785b, w.f7770c);
                } else {
                    W w4 = this.f7784a;
                    w4.f7772e = W.f(w4.f7772e, fVar, this.f7785b, w4.f7770c);
                }
            }
            if (!z6) {
                this.s++;
            }
        }
        return i5;
    }

    public final void y() {
        z(true);
        K2.o oVar = this.f7791h;
        if (oVar != null) {
            oVar.K(this.f7788e);
            this.f7791h = null;
            this.f7790g = null;
        }
    }

    public final void z(boolean z4) {
        P2.a aVar;
        SparseArray sparseArray;
        W w = this.f7784a;
        w.a(w.f7771d);
        S0.e eVar = w.f7771d;
        int i4 = 0;
        W.a.j(((u0.a) eVar.f1898n) == null);
        eVar.f1896l = 0L;
        eVar.f1897m = w.f7769b;
        S0.e eVar2 = w.f7771d;
        w.f7772e = eVar2;
        w.f7773f = eVar2;
        w.f7774g = 0L;
        w.f7768a.b();
        this.f7799p = 0;
        this.f7800q = 0;
        this.f7801r = 0;
        this.s = 0;
        this.f7805x = true;
        this.f7802t = Long.MIN_VALUE;
        this.f7803u = Long.MIN_VALUE;
        this.f7804v = Long.MIN_VALUE;
        this.w = false;
        while (true) {
            aVar = this.f7786c;
            sparseArray = (SparseArray) aVar.f1501m;
            if (i4 >= sparseArray.size()) {
                break;
            }
            ((b0.d) aVar.f1502n).accept(sparseArray.valueAt(i4));
            i4++;
        }
        aVar.f1500l = -1;
        sparseArray.clear();
        if (z4) {
            this.f7777A = null;
            this.f7778B = null;
            this.f7806y = true;
            this.f7780D = true;
        }
    }
}
