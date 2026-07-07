package i0;

import T.C0095p;
import Y.x;
import a0.AbstractC0125e;
import android.graphics.Bitmap;
import android.os.Trace;
import f2.Y;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class h extends AbstractC0125e {

    /* renamed from: C, reason: collision with root package name */
    public final Y f6150C;

    /* renamed from: D, reason: collision with root package name */
    public final Z.f f6151D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayDeque f6152E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f6153F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f6154G;

    /* renamed from: H, reason: collision with root package name */
    public f f6155H;

    /* renamed from: I, reason: collision with root package name */
    public long f6156I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public int f6157K;

    /* renamed from: L, reason: collision with root package name */
    public int f6158L;

    /* renamed from: M, reason: collision with root package name */
    public C0095p f6159M;

    /* renamed from: N, reason: collision with root package name */
    public C0340b f6160N;

    /* renamed from: O, reason: collision with root package name */
    public Z.f f6161O;

    /* renamed from: P, reason: collision with root package name */
    public e f6162P;

    /* renamed from: Q, reason: collision with root package name */
    public Bitmap f6163Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f6164R;

    /* renamed from: S, reason: collision with root package name */
    public g f6165S;

    /* renamed from: T, reason: collision with root package name */
    public g f6166T;

    /* renamed from: U, reason: collision with root package name */
    public int f6167U;

    public h(Y y4) {
        super(4);
        this.f6150C = y4;
        this.f6162P = e.f6143a;
        this.f6151D = new Z.f(0);
        this.f6155H = f.f6144c;
        this.f6152E = new ArrayDeque();
        this.J = -9223372036854775807L;
        this.f6156I = -9223372036854775807L;
        this.f6157K = 0;
        this.f6158L = 1;
    }

    @Override // a0.AbstractC0125e
    public final int D(C0095p c0095p) {
        return this.f6150C.G(c0095p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
    
        if (r14.f6147a == ((r0.f2311I * r1.f2310H) - 1)) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F(long r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.F(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0104, code lost:
    
        if (r2 == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Type inference failed for: r3v5, types: [i0.g, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(long r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.G(long):boolean");
    }

    public final void H() {
        C0095p c0095p = this.f6159M;
        Y y4 = this.f6150C;
        int G3 = y4.G(c0095p);
        if (G3 != AbstractC0125e.f(4, 0, 0, 0) && G3 != AbstractC0125e.f(3, 0, 0, 0)) {
            throw g(new Exception("Provided decoder factory can't create decoder for format."), this.f6159M, false, 4005);
        }
        C0340b c0340b = this.f6160N;
        if (c0340b != null) {
            c0340b.release();
        }
        this.f6160N = new C0340b((b0.d) y4.f5535m);
    }

    public final void I() {
        this.f6161O = null;
        this.f6157K = 0;
        this.J = -9223372036854775807L;
        C0340b c0340b = this.f6160N;
        if (c0340b != null) {
            c0340b.release();
            this.f6160N = null;
        }
    }

    @Override // a0.AbstractC0125e, a0.h0
    public final void d(int i4, Object obj) {
        if (i4 != 15) {
            return;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar == null) {
            eVar = e.f6143a;
        }
        this.f6162P = eVar;
    }

    @Override // a0.AbstractC0125e
    public final String l() {
        return "ImageRenderer";
    }

    @Override // a0.AbstractC0125e
    public final boolean n() {
        return this.f6154G;
    }

    @Override // a0.AbstractC0125e
    public final boolean p() {
        int i4 = this.f6158L;
        return i4 == 3 || (i4 == 0 && this.f6164R);
    }

    @Override // a0.AbstractC0125e
    public final void q() {
        this.f6159M = null;
        this.f6155H = f.f6144c;
        this.f6152E.clear();
        I();
        this.f6162P.getClass();
    }

    @Override // a0.AbstractC0125e
    public final void r(boolean z4, boolean z5) {
        this.f6158L = z5 ? 1 : 0;
    }

    @Override // a0.AbstractC0125e
    public final void s(long j4, boolean z4) {
        this.f6158L = Math.min(this.f6158L, 1);
        this.f6154G = false;
        this.f6153F = false;
        this.f6163Q = null;
        this.f6165S = null;
        this.f6166T = null;
        this.f6164R = false;
        this.f6161O = null;
        C0340b c0340b = this.f6160N;
        if (c0340b != null) {
            c0340b.flush();
        }
        this.f6152E.clear();
    }

    @Override // a0.AbstractC0125e
    public final void t() {
        I();
    }

    @Override // a0.AbstractC0125e
    public final void u() {
        I();
        this.f6158L = Math.min(this.f6158L, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r7) goto L14;
     */
    @Override // a0.AbstractC0125e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(T.C0095p[] r6, long r7, long r9) {
        /*
            r5 = this;
            i0.f r6 = r5.f6155H
            long r6 = r6.f6146b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L31
            java.util.ArrayDeque r6 = r5.f6152E
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L26
            long r7 = r5.J
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 == 0) goto L31
            long r2 = r5.f6156I
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L26
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L26
            goto L31
        L26:
            i0.f r7 = new i0.f
            long r0 = r5.J
            r7.<init>(r0, r9)
            r6.add(r7)
            goto L38
        L31:
            i0.f r6 = new i0.f
            r6.<init>(r0, r9)
            r5.f6155H = r6
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.x(T.p[], long, long):void");
    }

    @Override // a0.AbstractC0125e
    public final void z(long j4, long j5) {
        if (this.f6154G) {
            return;
        }
        if (this.f6159M == null) {
            x xVar = this.f3423n;
            xVar.N();
            Z.f fVar = this.f6151D;
            fVar.e();
            int y4 = y(xVar, fVar, 2);
            if (y4 != -5) {
                if (y4 == -4) {
                    W.a.j(fVar.c(4));
                    this.f6153F = true;
                    this.f6154G = true;
                    return;
                }
                return;
            }
            C0095p c0095p = (C0095p) xVar.f3066n;
            W.a.k(c0095p);
            this.f6159M = c0095p;
            H();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            do {
            } while (F(j4));
            do {
            } while (G(j4));
            Trace.endSection();
        } catch (d e4) {
            throw g(e4, null, false, 4003);
        }
    }
}
