package p077T0;

/* renamed from: T0.f */
/* loaded from: classes.dex */
public final class C0718f {

    /* renamed from: a */
    public int f2479a;

    /* renamed from: b */
    public long f2480b;

    /* renamed from: c */
    public int f2481c;

    /* renamed from: d */
    public int f2482d;

    /* renamed from: e */
    public int f2483e;

    /* renamed from: f */
    public final int[] f2484f = new int[255];

    /* renamed from: g */
    public final p086W.C0798r f2485g = new p086W.C0798r(255);

    /* renamed from: a */
    public final boolean m1310a(p215y0.C2400l c2400l, boolean z4) {
        boolean z5;
        boolean z6;
        this.f2479a = 0;
        this.f2480b = 0L;
        this.f2481c = 0;
        this.f2482d = 0;
        this.f2483e = 0;
        p086W.C0798r c0798r = this.f2485g;
        c0798r.m1534D(27);
        try {
            z5 = c2400l.mo634p(c0798r.f2786a, 0, 27, z4);
        } catch (java.io.EOFException e4) {
            if (!z4) {
                throw e4;
            }
            z5 = false;
        }
        if (!z5 || c0798r.m1561w() != 1332176723) {
            return false;
        }
        if (c0798r.m1559u() != 0) {
            if (z4) {
                return false;
            }
            throw p076T.C0666I.m1204c("unsupported bit stream revision");
        }
        this.f2479a = c0798r.m1559u();
        this.f2480b = c0798r.m1549k();
        c0798r.m1550l();
        c0798r.m1550l();
        c0798r.m1550l();
        int m1559u = c0798r.m1559u();
        this.f2481c = m1559u;
        this.f2482d = m1559u + 27;
        c0798r.m1534D(m1559u);
        try {
            z6 = c2400l.mo634p(c0798r.f2786a, 0, this.f2481c, z4);
        } catch (java.io.EOFException e5) {
            if (!z4) {
                throw e5;
            }
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        for (int i4 = 0; i4 < this.f2481c; i4++) {
            int m1559u2 = c0798r.m1559u();
            this.f2484f[i4] = m1559u2;
            this.f2483e += m1559u2;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r10.f9450o >= r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r10.m4635l(1) == (-1)) goto L33;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1311b(p215y0.C2400l r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f9450o
            long r2 = r10.mo641w()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            p086W.AbstractC0781a.m1416e(r0)
            W.r r0 = r9.f2485g
            r3 = 4
            r0.m1534D(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f9450o
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f2786a
            boolean r5 = r10.mo634p(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.m1537G(r1)
            long r4 = r0.m1561w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f9452q = r1
            return r2
        L42:
            r10.mo628e(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f9450o
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.m4635l(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p077T0.C0718f.m1311b(y0.l, long):boolean");
    }
}
