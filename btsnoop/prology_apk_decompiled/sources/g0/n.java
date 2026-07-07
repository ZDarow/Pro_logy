package g0;

import T.C0095p;
import W.y;
import Y.x;
import a.AbstractC0110a;
import java.io.IOException;
import java.util.ArrayList;
import q0.a0;

/* loaded from: classes.dex */
public final class n implements a0 {

    /* renamed from: l, reason: collision with root package name */
    public final int f5733l;

    /* renamed from: m, reason: collision with root package name */
    public final r f5734m;

    /* renamed from: n, reason: collision with root package name */
    public int f5735n = -1;

    public n(r rVar, int i4) {
        this.f5734m = rVar;
        this.f5733l = i4;
    }

    @Override // q0.a0
    public final void a() {
        int i4 = this.f5735n;
        r rVar = this.f5734m;
        if (i4 == -2) {
            rVar.a();
            throw new IOException("Unable to bind a sample queue to TrackGroup with MIME type " + rVar.f5766T.a(this.f5733l).f2172d[0].f2325m + ".");
        }
        if (i4 == -1) {
            rVar.E();
        } else if (i4 != -3) {
            rVar.E();
            rVar.f5754G[i4].u();
        }
    }

    public final void b() {
        W.a.e(this.f5735n == -1);
        r rVar = this.f5734m;
        rVar.a();
        rVar.f5768V.getClass();
        int[] iArr = rVar.f5768V;
        int i4 = this.f5733l;
        int i5 = iArr[i4];
        if (i5 == -1) {
            if (rVar.f5767U.contains(rVar.f5766T.a(i4))) {
                i5 = -3;
            }
            i5 = -2;
        } else {
            boolean[] zArr = rVar.f5771Y;
            if (!zArr[i5]) {
                zArr[i5] = true;
            }
            i5 = -2;
        }
        this.f5735n = i5;
    }

    public final boolean c() {
        int i4 = this.f5735n;
        return (i4 == -1 || i4 == -3 || i4 == -2) ? false : true;
    }

    @Override // q0.a0
    public final boolean d() {
        if (this.f5735n != -3) {
            if (c()) {
                int i4 = this.f5735n;
                r rVar = this.f5734m;
                if (rVar.C() || !rVar.f5754G[i4].s(rVar.f5777e0)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r6.hasNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        r2 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r6.hasNext() != false) goto L25;
     */
    @Override // q0.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.c()
            r1 = 0
            if (r0 == 0) goto L60
            int r0 = r4.f5735n
            g0.r r2 = r4.f5734m
            boolean r3 = r2.C()
            if (r3 == 0) goto L12
            goto L60
        L12:
            g0.q[] r1 = r2.f5754G
            r1 = r1[r0]
            boolean r3 = r2.f5777e0
            int r5 = r1.p(r5, r3)
            java.util.ArrayList r6 = r2.f5793y
            r2 = 0
            if (r6 == 0) goto L33
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L28
            goto L47
        L28:
            int r2 = r6.size()
            int r2 = r2 + (-1)
            java.lang.Object r2 = r6.get(r2)
            goto L47
        L33:
            java.util.Iterator r6 = r6.iterator()
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L47
        L3d:
            java.lang.Object r2 = r6.next()
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L3d
        L47:
            g0.k r2 = (g0.k) r2
            if (r2 == 0) goto L5c
            boolean r6 = r2.f5697V
            if (r6 != 0) goto L5c
            int r6 = r1.n()
            int r0 = r2.g(r0)
            int r0 = r0 - r6
            int r5 = java.lang.Math.min(r5, r0)
        L5c:
            r1.C(r5)
            r1 = r5
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.n.n(long):int");
    }

    @Override // q0.a0
    public final int o(x xVar, Z.f fVar, int i4) {
        C0095p c0095p;
        C0095p c0095p2;
        int i5 = -3;
        if (this.f5735n == -3) {
            fVar.a(4);
            return -4;
        }
        if (c()) {
            int i6 = this.f5735n;
            r rVar = this.f5734m;
            if (!rVar.C()) {
                ArrayList arrayList = rVar.f5793y;
                int i7 = 0;
                if (!arrayList.isEmpty()) {
                    int i8 = 0;
                    loop0: while (i8 < arrayList.size() - 1) {
                        int i9 = ((k) arrayList.get(i8)).f5698v;
                        int length = rVar.f5754G.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            if (rVar.f5771Y[i10] && rVar.f5754G[i10].w() == i9) {
                                break loop0;
                            }
                        }
                        i8++;
                    }
                    y.R(arrayList, 0, i8);
                    k kVar = (k) arrayList.get(0);
                    C0095p c0095p3 = kVar.f8023o;
                    if (c0095p3.equals(rVar.f5764R)) {
                        c0095p2 = c0095p3;
                    } else {
                        f0.e eVar = rVar.f5791v;
                        Object obj = kVar.f8025q;
                        long j4 = kVar.f8026r;
                        int i11 = rVar.f5783m;
                        int i12 = kVar.f8024p;
                        c0095p2 = c0095p3;
                        eVar.a(i11, c0095p3, i12, obj, j4);
                    }
                    rVar.f5764R = c0095p2;
                }
                if ((arrayList.isEmpty() || ((k) arrayList.get(0)).f5697V) && (i5 = rVar.f5754G[i6].x(xVar, fVar, i4, rVar.f5777e0)) == -5) {
                    C0095p c0095p4 = (C0095p) xVar.f3066n;
                    c0095p4.getClass();
                    if (i6 == rVar.f5759M) {
                        int l4 = AbstractC0110a.l(rVar.f5754G[i6].w());
                        while (i7 < arrayList.size() && ((k) arrayList.get(i7)).f5698v != l4) {
                            i7++;
                        }
                        if (i7 < arrayList.size()) {
                            c0095p = ((k) arrayList.get(i7)).f8023o;
                        } else {
                            c0095p = rVar.f5763Q;
                            c0095p.getClass();
                        }
                        c0095p4 = c0095p4.d(c0095p);
                    }
                    xVar.f3066n = c0095p4;
                }
            }
        }
        return i5;
    }
}
