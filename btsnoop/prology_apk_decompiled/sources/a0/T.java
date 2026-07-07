package a0;

import android.util.Pair;
import q0.C0472d;
import q0.C0492y;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3335a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3336b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.a0[] f3337c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3338d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3339e;

    /* renamed from: f, reason: collision with root package name */
    public U f3340f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3341g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f3342h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0125e[] f3343i;

    /* renamed from: j, reason: collision with root package name */
    public final t0.u f3344j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f3345k;

    /* renamed from: l, reason: collision with root package name */
    public T f3346l;

    /* renamed from: m, reason: collision with root package name */
    public q0.k0 f3347m;

    /* renamed from: n, reason: collision with root package name */
    public t0.v f3348n;

    /* renamed from: o, reason: collision with root package name */
    public long f3349o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [q0.d] */
    public T(AbstractC0125e[] abstractC0125eArr, long j4, t0.u uVar, u0.e eVar, e0 e0Var, U u4, t0.v vVar) {
        this.f3343i = abstractC0125eArr;
        this.f3349o = j4;
        this.f3344j = uVar;
        this.f3345k = e0Var;
        q0.F f4 = u4.f3350a;
        this.f3336b = f4.f7668a;
        this.f3340f = u4;
        this.f3347m = q0.k0.f7876d;
        this.f3348n = vVar;
        this.f3337c = new q0.a0[abstractC0125eArr.length];
        this.f3342h = new boolean[abstractC0125eArr.length];
        e0Var.getClass();
        int i4 = AbstractC0121a.f3383d;
        Pair pair = (Pair) f4.f7668a;
        Object obj = pair.first;
        q0.F a4 = f4.a(pair.second);
        d0 d0Var = (d0) e0Var.f3437d.get(obj);
        d0Var.getClass();
        e0Var.f3440g.add(d0Var);
        c0 c0Var = (c0) e0Var.f3439f.get(d0Var);
        if (c0Var != null) {
            c0Var.f3403a.e(c0Var.f3404b);
        }
        d0Var.f3416c.add(a4);
        C0492y b4 = d0Var.f3414a.b(a4, eVar, u4.f3351b);
        e0Var.f3436c.put(b4, d0Var);
        e0Var.c();
        long j5 = u4.f3353d;
        this.f3335a = j5 != -9223372036854775807L ? new C0472d(b4, true, 0L, j5) : b4;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [q0.D, java.lang.Object] */
    public final long a(t0.v vVar, long j4, boolean z4, boolean[] zArr) {
        AbstractC0125e[] abstractC0125eArr;
        Object[] objArr;
        int i4 = 0;
        while (true) {
            boolean z5 = true;
            if (i4 >= vVar.f8388a) {
                break;
            }
            if (z4 || !vVar.a(this.f3348n, i4)) {
                z5 = false;
            }
            this.f3342h[i4] = z5;
            i4++;
        }
        int i5 = 0;
        while (true) {
            abstractC0125eArr = this.f3343i;
            int length = abstractC0125eArr.length;
            objArr = this.f3337c;
            if (i5 >= length) {
                break;
            }
            if (abstractC0125eArr[i5].f3422m == -2) {
                objArr[i5] = null;
            }
            i5++;
        }
        b();
        this.f3348n = vVar;
        c();
        long p2 = this.f3335a.p(vVar.f8390c, this.f3342h, this.f3337c, zArr, j4);
        for (int i6 = 0; i6 < abstractC0125eArr.length; i6++) {
            if (abstractC0125eArr[i6].f3422m == -2 && this.f3348n.b(i6)) {
                objArr[i6] = new Object();
            }
        }
        this.f3339e = false;
        for (int i7 = 0; i7 < objArr.length; i7++) {
            if (objArr[i7] != null) {
                W.a.j(vVar.b(i7));
                if (abstractC0125eArr[i7].f3422m != -2) {
                    this.f3339e = true;
                }
            } else {
                W.a.j(vVar.f8390c[i7] == null);
            }
        }
        return p2;
    }

    public final void b() {
        if (this.f3346l != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            t0.v vVar = this.f3348n;
            if (i4 >= vVar.f8388a) {
                return;
            }
            boolean b4 = vVar.b(i4);
            t0.s sVar = this.f3348n.f8390c[i4];
            if (b4 && sVar != null) {
                sVar.r();
            }
            i4++;
        }
    }

    public final void c() {
        if (this.f3346l != null) {
            return;
        }
        int i4 = 0;
        while (true) {
            t0.v vVar = this.f3348n;
            if (i4 >= vVar.f8388a) {
                return;
            }
            boolean b4 = vVar.b(i4);
            t0.s sVar = this.f3348n.f8390c[i4];
            if (b4 && sVar != null) {
                sVar.i();
            }
            i4++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q0.c0, java.lang.Object] */
    public final long d() {
        if (!this.f3338d) {
            return this.f3340f.f3351b;
        }
        long h4 = this.f3339e ? this.f3335a.h() : Long.MIN_VALUE;
        return h4 == Long.MIN_VALUE ? this.f3340f.f3354e : h4;
    }

    public final long e() {
        return this.f3340f.f3351b + this.f3349o;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [q0.c0, java.lang.Object] */
    public final boolean f() {
        return this.f3338d && (!this.f3339e || this.f3335a.h() == Long.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q0.D, java.lang.Object] */
    public final void g() {
        b();
        ?? r02 = this.f3335a;
        try {
            boolean z4 = r02 instanceof C0472d;
            e0 e0Var = this.f3345k;
            if (z4) {
                e0Var.f(((C0472d) r02).f7818l);
            } else {
                e0Var.f(r02);
            }
        } catch (RuntimeException e4) {
            W.a.o("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b2, code lost:
    
        if (f2.AbstractC0303z.f5630a.c(r9.f8335m, r8.f8335m).c(r9.f8334l, r8.f8334l).e() > 0) goto L130;
     */
    /* JADX WARN: Type inference failed for: r1v18, types: [f2.F, f2.C] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t0.v h(float r36, T.U r37) {
        /*
            Method dump skipped, instructions count: 2126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.T.h(float, T.U):t0.v");
    }

    public final void i() {
        Object obj = this.f3335a;
        if (obj instanceof C0472d) {
            long j4 = this.f3340f.f3353d;
            if (j4 == -9223372036854775807L) {
                j4 = Long.MIN_VALUE;
            }
            C0472d c0472d = (C0472d) obj;
            c0472d.f7822p = 0L;
            c0472d.f7823q = j4;
        }
    }
}
