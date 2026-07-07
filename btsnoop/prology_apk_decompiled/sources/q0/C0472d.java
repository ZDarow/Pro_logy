package q0;

import a0.m0;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472d implements InterfaceC0467D, InterfaceC0466C {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0467D f7818l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0466C f7819m;

    /* renamed from: n, reason: collision with root package name */
    public C0471c[] f7820n = new C0471c[0];

    /* renamed from: o, reason: collision with root package name */
    public long f7821o;

    /* renamed from: p, reason: collision with root package name */
    public long f7822p;

    /* renamed from: q, reason: collision with root package name */
    public long f7823q;

    /* renamed from: r, reason: collision with root package name */
    public C0474f f7824r;

    public C0472d(InterfaceC0467D interfaceC0467D, boolean z4, long j4, long j5) {
        this.f7818l = interfaceC0467D;
        this.f7821o = z4 ? j4 : -9223372036854775807L;
        this.f7822p = j4;
        this.f7823q = j5;
    }

    public final boolean a() {
        return this.f7821o != -9223372036854775807L;
    }

    @Override // q0.InterfaceC0467D
    public final long b(long j4, m0 m0Var) {
        long j5 = this.f7822p;
        if (j4 == j5) {
            return j5;
        }
        long k4 = W.y.k(m0Var.f3549a, 0L, j4 - j5);
        long j6 = this.f7823q;
        long k5 = W.y.k(m0Var.f3550b, 0L, j6 == Long.MIN_VALUE ? Long.MAX_VALUE : j6 - j4);
        if (k4 != m0Var.f3549a || k5 != m0Var.f3550b) {
            m0Var = new m0(k4, k5);
        }
        return this.f7818l.b(j4, m0Var);
    }

    @Override // q0.c0
    public final boolean c() {
        return this.f7818l.c();
    }

    @Override // q0.InterfaceC0467D
    public final k0 e() {
        return this.f7818l.e();
    }

    @Override // q0.b0
    public final void f(c0 c0Var) {
        InterfaceC0466C interfaceC0466C = this.f7819m;
        interfaceC0466C.getClass();
        interfaceC0466C.f(this);
    }

    @Override // q0.InterfaceC0467D
    public final void g(InterfaceC0466C interfaceC0466C, long j4) {
        this.f7819m = interfaceC0466C;
        this.f7818l.g(this, j4);
    }

    @Override // q0.c0
    public final long h() {
        long h4 = this.f7818l.h();
        if (h4 != Long.MIN_VALUE) {
            long j4 = this.f7823q;
            if (j4 == Long.MIN_VALUE || h4 < j4) {
                return h4;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q0.c0
    public final boolean i(a0.Q q4) {
        return this.f7818l.i(q4);
    }

    @Override // q0.InterfaceC0467D
    public final void j() {
        C0474f c0474f = this.f7824r;
        if (c0474f != null) {
            throw c0474f;
        }
        this.f7818l.j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // q0.InterfaceC0467D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long l(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f7821o = r0
            q0.c[] r0 = r5.f7820n
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f7816m = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            q0.D r0 = r5.f7818l
            long r0 = r0.l(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L33
            long r6 = r5.f7822p
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L34
            long r6 = r5.f7823q
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L33
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L34
        L33:
            r2 = 1
        L34:
            W.a.j(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C0472d.l(long):long");
    }

    @Override // q0.InterfaceC0467D
    public final void m(long j4) {
        this.f7818l.m(j4);
    }

    @Override // q0.InterfaceC0466C
    public final void o(InterfaceC0467D interfaceC0467D) {
        if (this.f7824r != null) {
            return;
        }
        InterfaceC0466C interfaceC0466C = this.f7819m;
        interfaceC0466C.getClass();
        interfaceC0466C.o(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x011f, code lost:
    
        if (r1 > r3) goto L94;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x005e. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x00e4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012b  */
    @Override // q0.InterfaceC0467D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long p(t0.s[] r16, boolean[] r17, q0.a0[] r18, boolean[] r19, long r20) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.C0472d.p(t0.s[], boolean[], q0.a0[], boolean[], long):long");
    }

    @Override // q0.c0
    public final long r() {
        long r4 = this.f7818l.r();
        if (r4 != Long.MIN_VALUE) {
            long j4 = this.f7823q;
            if (j4 == Long.MIN_VALUE || r4 < j4) {
                return r4;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // q0.InterfaceC0467D
    public final long u() {
        if (a()) {
            long j4 = this.f7821o;
            this.f7821o = -9223372036854775807L;
            long u4 = u();
            return u4 != -9223372036854775807L ? u4 : j4;
        }
        long u5 = this.f7818l.u();
        if (u5 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        W.a.j(u5 >= this.f7822p);
        long j5 = this.f7823q;
        W.a.j(j5 == Long.MIN_VALUE || u5 <= j5);
        return u5;
    }

    @Override // q0.c0
    public final void w(long j4) {
        this.f7818l.w(j4);
    }
}
