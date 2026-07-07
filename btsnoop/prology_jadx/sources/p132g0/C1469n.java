package p132g0;

/* renamed from: g0.n */
/* loaded from: classes.dex */
public final class C1469n implements p179q0.InterfaceC1985a0 {

    /* renamed from: l */
    public final int f5937l;

    /* renamed from: m */
    public final p132g0.C1473r f5938m;

    /* renamed from: n */
    public int f5939n = -1;

    public C1469n(p132g0.C1473r c1473r, int i4) {
        this.f5938m = c1473r;
        this.f5937l = i4;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: a */
    public final void mo49a() {
        int i4 = this.f5939n;
        p132g0.C1473r c1473r = this.f5938m;
        if (i4 == -2) {
            c1473r.m3300a();
            throw new java.io.IOException("Unable to bind a sample queue to TrackGroup with MIME type " + c1473r.f5971T.m4053a(this.f5937l).f2252d[0].f2408m + ".");
        }
        if (i4 == -1) {
            c1473r.m3296E();
        } else if (i4 != -3) {
            c1473r.m3296E();
            c1473r.f5958G[i4].m4025u();
        }
    }

    /* renamed from: b */
    public final void m3287b() {
        p086W.AbstractC0781a.m1416e(this.f5939n == -1);
        p132g0.C1473r c1473r = this.f5938m;
        c1473r.m3300a();
        c1473r.f5973V.getClass();
        int[] iArr = c1473r.f5973V;
        int i4 = this.f5937l;
        int i5 = iArr[i4];
        if (i5 == -1) {
            if (c1473r.f5972U.contains(c1473r.f5971T.m4053a(i4))) {
                i5 = -3;
            }
            i5 = -2;
        } else {
            boolean[] zArr = c1473r.f5976Y;
            if (!zArr[i5]) {
                zArr[i5] = true;
            }
            i5 = -2;
        }
        this.f5939n = i5;
    }

    /* renamed from: c */
    public final boolean m3288c() {
        int i4 = this.f5939n;
        return (i4 == -1 || i4 == -3 || i4 == -2) ? false : true;
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: d */
    public final boolean mo52d() {
        if (this.f5939n != -3) {
            if (m3288c()) {
                int i4 = this.f5939n;
                p132g0.C1473r c1473r = this.f5938m;
                if (c1473r.m3294C() || !c1473r.f5958G[i4].m4023s(c1473r.f5982e0)) {
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
    @Override // p179q0.InterfaceC1985a0
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo58n(long r5) {
        /*
            r4 = this;
            boolean r0 = r4.m3288c()
            r1 = 0
            if (r0 == 0) goto L60
            int r0 = r4.f5939n
            g0.r r2 = r4.f5938m
            boolean r3 = r2.m3294C()
            if (r3 == 0) goto L12
            goto L60
        L12:
            g0.q[] r1 = r2.f5958G
            r1 = r1[r0]
            boolean r3 = r2.f5982e0
            int r5 = r1.m4020p(r5, r3)
            java.util.ArrayList r6 = r2.f6000y
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
            g0.k r2 = (p132g0.C1466k) r2
            if (r2 == 0) goto L5c
            boolean r6 = r2.f5896V
            if (r6 != 0) goto L5c
            int r6 = r1.m4018n()
            int r0 = r2.m3279g(r0)
            int r0 = r0 - r6
            int r5 = java.lang.Math.min(r5, r0)
        L5c:
            r1.m4009C(r5)
            r1 = r5
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p132g0.C1469n.mo58n(long):int");
    }

    @Override // p179q0.InterfaceC1985a0
    /* renamed from: o */
    public final int mo59o(p094Y.C0886x c0886x, p098Z.C0921f c0921f, int i4) {
        p076T.C0702p c0702p;
        p076T.C0702p c0702p2;
        int i5 = -3;
        if (this.f5939n == -3) {
            c0921f.m1137a(4);
            return -4;
        }
        if (m3288c()) {
            int i6 = this.f5939n;
            p132g0.C1473r c1473r = this.f5938m;
            if (!c1473r.m3294C()) {
                java.util.ArrayList arrayList = c1473r.f6000y;
                int i7 = 0;
                if (!arrayList.isEmpty()) {
                    int i8 = 0;
                    loop0: while (i8 < arrayList.size() - 1) {
                        int i9 = ((p132g0.C1466k) arrayList.get(i8)).f5897v;
                        int length = c1473r.f5958G.length;
                        for (int i10 = 0; i10 < length; i10++) {
                            if (c1473r.f5976Y[i10] && c1473r.f5958G[i10].m4027w() == i9) {
                                break loop0;
                            }
                        }
                        i8++;
                    }
                    p086W.AbstractC0805y.m1597R(arrayList, 0, i8);
                    p132g0.C1466k c1466k = (p132g0.C1466k) arrayList.get(0);
                    p076T.C0702p c0702p3 = c1466k.f8334o;
                    if (c0702p3.equals(c1473r.f5969R)) {
                        c0702p2 = c0702p3;
                    } else {
                        p127f0.C1372e c1372e = c1473r.f5997v;
                        java.lang.Object obj = c1466k.f8336q;
                        long j4 = c1466k.f8337r;
                        int i11 = c1473r.f5988m;
                        int i12 = c1466k.f8335p;
                        c0702p2 = c0702p3;
                        c1372e.m3117a(i11, c0702p3, i12, obj, j4);
                    }
                    c1473r.f5969R = c0702p2;
                }
                if ((arrayList.isEmpty() || ((p132g0.C1466k) arrayList.get(0)).f5896V) && (i5 = c1473r.f5958G[i6].m4028x(c0886x, c0921f, i4, c1473r.f5982e0)) == -5) {
                    p076T.C0702p c0702p4 = (p076T.C0702p) c0886x.f3176n;
                    c0702p4.getClass();
                    if (i6 == c1473r.f5964M) {
                        int m1804l = p101a.AbstractC0936a.m1804l(c1473r.f5958G[i6].m4027w());
                        while (i7 < arrayList.size() && ((p132g0.C1466k) arrayList.get(i7)).f5897v != m1804l) {
                            i7++;
                        }
                        if (i7 < arrayList.size()) {
                            c0702p = ((p132g0.C1466k) arrayList.get(i7)).f8334o;
                        } else {
                            c0702p = c1473r.f5968Q;
                            c0702p.getClass();
                        }
                        c0702p4 = c0702p4.m1298d(c0702p);
                    }
                    c0886x.f3176n = c0702p4;
                }
            }
        }
        return i5;
    }
}
