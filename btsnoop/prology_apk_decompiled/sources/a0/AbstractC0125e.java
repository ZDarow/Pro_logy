package a0;

import T.C0094o;
import T.C0095p;

/* renamed from: a0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0125e implements h0 {

    /* renamed from: B, reason: collision with root package name */
    public t0.q f3420B;

    /* renamed from: m, reason: collision with root package name */
    public final int f3422m;

    /* renamed from: o, reason: collision with root package name */
    public l0 f3424o;

    /* renamed from: p, reason: collision with root package name */
    public int f3425p;

    /* renamed from: q, reason: collision with root package name */
    public b0.l f3426q;

    /* renamed from: r, reason: collision with root package name */
    public W.t f3427r;
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public q0.a0 f3428t;

    /* renamed from: u, reason: collision with root package name */
    public C0095p[] f3429u;

    /* renamed from: v, reason: collision with root package name */
    public long f3430v;
    public long w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3432y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3433z;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3421l = new Object();

    /* renamed from: n, reason: collision with root package name */
    public final Y.x f3423n = new Y.x((char) 0, 4);

    /* renamed from: x, reason: collision with root package name */
    public long f3431x = Long.MIN_VALUE;

    /* renamed from: A, reason: collision with root package name */
    public T.U f3419A = T.U.f2168a;

    public AbstractC0125e(int i4) {
        this.f3422m = i4;
    }

    public static int f(int i4, int i5, int i6, int i7) {
        return i4 | i5 | i6 | 128 | i7;
    }

    public static int i(int i4) {
        return i4 & 384;
    }

    public static int j(int i4) {
        return i4 & 64;
    }

    public static boolean o(int i4, boolean z4) {
        int i5 = i4 & 7;
        return i5 == 4 || (z4 && i5 == 3);
    }

    public final void A(C0095p[] c0095pArr, q0.a0 a0Var, long j4, long j5, q0.F f4) {
        W.a.j(!this.f3432y);
        this.f3428t = a0Var;
        if (this.f3431x == Long.MIN_VALUE) {
            this.f3431x = j4;
        }
        this.f3429u = c0095pArr;
        this.f3430v = j5;
        x(c0095pArr, j4, j5);
    }

    public final void B() {
        W.a.j(this.s == 0);
        this.f3423n.N();
        u();
    }

    public void C(float f4, float f5) {
    }

    public abstract int D(C0095p c0095p);

    public int E() {
        return 0;
    }

    @Override // a0.h0
    public void d(int i4, Object obj) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a0.C0133m g(java.lang.Exception r13, T.C0095p r14, boolean r15, int r16) {
        /*
            r12 = this;
            r1 = r12
            r0 = r14
            r2 = 4
            if (r0 == 0) goto L1d
            boolean r3 = r1.f3433z
            if (r3 != 0) goto L1d
            r3 = 1
            r1.f3433z = r3
            r3 = 0
            int r4 = r12.D(r14)     // Catch: java.lang.Throwable -> L16 a0.C0133m -> L1b
            r4 = r4 & 7
            r1.f3433z = r3
            goto L1e
        L16:
            r0 = move-exception
            r2 = r0
            r1.f3433z = r3
            throw r2
        L1b:
            r1.f3433z = r3
        L1d:
            r4 = r2
        L1e:
            java.lang.String r6 = r12.l()
            int r7 = r1.f3425p
            a0.m r11 = new a0.m
            if (r0 != 0) goto L2a
            r9 = r2
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r3 = 1
            r2 = r11
            r4 = r13
            r5 = r16
            r8 = r14
            r10 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.AbstractC0125e.g(java.lang.Exception, T.p, boolean, int):a0.m");
    }

    public void h() {
    }

    public S k() {
        return null;
    }

    public abstract String l();

    public final boolean m() {
        return this.f3431x == Long.MIN_VALUE;
    }

    public abstract boolean n();

    public abstract boolean p();

    public abstract void q();

    public void r(boolean z4, boolean z5) {
    }

    public abstract void s(long j4, boolean z4);

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public abstract void x(C0095p[] c0095pArr, long j4, long j5);

    public final int y(Y.x xVar, Z.f fVar, int i4) {
        q0.a0 a0Var = this.f3428t;
        a0Var.getClass();
        int o2 = a0Var.o(xVar, fVar, i4);
        if (o2 == -4) {
            if (fVar.c(4)) {
                this.f3431x = Long.MIN_VALUE;
                return this.f3432y ? -4 : -3;
            }
            long j4 = fVar.f3142r + this.f3430v;
            fVar.f3142r = j4;
            this.f3431x = Math.max(this.f3431x, j4);
        } else if (o2 == -5) {
            C0095p c0095p = (C0095p) xVar.f3066n;
            c0095p.getClass();
            long j5 = c0095p.f2330r;
            if (j5 != Long.MAX_VALUE) {
                C0094o a4 = c0095p.a();
                a4.f2295q = j5 + this.f3430v;
                xVar.f3066n = new C0095p(a4);
            }
        }
        return o2;
    }

    public abstract void z(long j4, long j5);
}
