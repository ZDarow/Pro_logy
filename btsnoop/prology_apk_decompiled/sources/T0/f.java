package T0;

import T.I;
import W.r;
import java.io.EOFException;
import y0.l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f2392a;

    /* renamed from: b, reason: collision with root package name */
    public long f2393b;

    /* renamed from: c, reason: collision with root package name */
    public int f2394c;

    /* renamed from: d, reason: collision with root package name */
    public int f2395d;

    /* renamed from: e, reason: collision with root package name */
    public int f2396e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2397f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final r f2398g = new r(255);

    public final boolean a(l lVar, boolean z4) {
        boolean z5;
        boolean z6;
        this.f2392a = 0;
        this.f2393b = 0L;
        this.f2394c = 0;
        this.f2395d = 0;
        this.f2396e = 0;
        r rVar = this.f2398g;
        rVar.D(27);
        try {
            z5 = lVar.p(rVar.f2694a, 0, 27, z4);
        } catch (EOFException e4) {
            if (!z4) {
                throw e4;
            }
            z5 = false;
        }
        if (!z5 || rVar.w() != 1332176723) {
            return false;
        }
        if (rVar.u() != 0) {
            if (z4) {
                return false;
            }
            throw I.c("unsupported bit stream revision");
        }
        this.f2392a = rVar.u();
        this.f2393b = rVar.k();
        rVar.l();
        rVar.l();
        rVar.l();
        int u4 = rVar.u();
        this.f2394c = u4;
        this.f2395d = u4 + 27;
        rVar.D(u4);
        try {
            z6 = lVar.p(rVar.f2694a, 0, this.f2394c, z4);
        } catch (EOFException e5) {
            if (!z4) {
                throw e5;
            }
            z6 = false;
        }
        if (!z6) {
            return false;
        }
        for (int i4 = 0; i4 < this.f2394c; i4++) {
            int u5 = rVar.u();
            this.f2397f[i4] = u5;
            this.f2396e += u5;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r11 == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r10.f9089o >= r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r10.l(1) == (-1)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(y0.l r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f9089o
            long r2 = r10.w()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            W.a.e(r0)
            W.r r0 = r9.f2398g
            r3 = 4
            r0.D(r3)
        L18:
            r4 = -1
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 == 0) goto L27
            long r5 = r10.f9089o
            r7 = 4
            long r5 = r5 + r7
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L46
        L27:
            byte[] r5 = r0.f2694a
            boolean r5 = r10.p(r5, r1, r3, r2)     // Catch: java.io.EOFException -> L2e
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 == 0) goto L46
            r0.G(r1)
            long r4 = r0.w()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L42
            r10.f9091q = r1
            return r2
        L42:
            r10.e(r2)
            goto L18
        L46:
            if (r4 == 0) goto L4e
            long r5 = r10.f9089o
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 >= 0) goto L56
        L4e:
            int r0 = r10.l(r2)
            r3 = -1
            if (r0 == r3) goto L56
            goto L46
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.f.b(y0.l, long):boolean");
    }
}
