package p161m0;

/* renamed from: m0.r */
/* loaded from: classes.dex */
public final class C1861r implements p179q0.InterfaceC1962D {

    /* renamed from: A */
    public boolean f7551A;

    /* renamed from: B */
    public boolean f7552B;

    /* renamed from: C */
    public boolean f7553C;

    /* renamed from: D */
    public boolean f7554D;

    /* renamed from: E */
    public boolean f7555E;

    /* renamed from: F */
    public int f7556F;

    /* renamed from: G */
    public boolean f7557G;

    /* renamed from: l */
    public final p197u0.C2218e f7558l;

    /* renamed from: m */
    public final android.os.Handler f7559m = p086W.AbstractC0805y.m1619n(null);

    /* renamed from: n */
    public final p129f2.C1408Y f7560n;

    /* renamed from: o */
    public final p161m0.C1856m f7561o;

    /* renamed from: p */
    public final java.util.ArrayList f7562p;

    /* renamed from: q */
    public final java.util.ArrayList f7563q;

    /* renamed from: r */
    public final p129f2.C1408Y f7564r;

    /* renamed from: s */
    public final p046L1.C0363g f7565s;

    /* renamed from: t */
    public p179q0.InterfaceC1961C f7566t;

    /* renamed from: u */
    public p129f2.C1415c0 f7567u;

    /* renamed from: v */
    public java.io.IOException f7568v;

    /* renamed from: w */
    public androidx.datastore.preferences.protobuf.C1113k f7569w;

    /* renamed from: x */
    public long f7570x;

    /* renamed from: y */
    public long f7571y;

    /* renamed from: z */
    public long f7572z;

    public C1861r(p197u0.C2218e c2218e, p046L1.C0363g c0363g, android.net.Uri uri, p129f2.C1408Y c1408y, java.lang.String str, javax.net.SocketFactory socketFactory) {
        this.f7558l = c2218e;
        this.f7565s = c0363g;
        this.f7564r = c1408y;
        p129f2.C1408Y c1408y2 = new p129f2.C1408Y(16, this);
        this.f7560n = c1408y2;
        this.f7561o = new p161m0.C1856m(c1408y2, c1408y2, str, uri, socketFactory);
        this.f7562p = new java.util.ArrayList();
        this.f7563q = new java.util.ArrayList();
        this.f7571y = -9223372036854775807L;
        this.f7570x = -9223372036854775807L;
        this.f7572z = -9223372036854775807L;
    }

    /* renamed from: a */
    public static /* synthetic */ long m3826a(p161m0.C1861r c1861r) {
        return c1861r.f7571y;
    }

    /* renamed from: d */
    public static /* synthetic */ void m3827d(p161m0.C1861r c1861r) {
        c1861r.f7571y = -9223372036854775807L;
    }

    /* renamed from: f */
    public static /* synthetic */ long m3828f(p161m0.C1861r c1861r) {
        return c1861r.f7572z;
    }

    /* renamed from: k */
    public static /* synthetic */ void m3829k(p161m0.C1861r c1861r) {
        c1861r.f7572z = -9223372036854775807L;
    }

    /* renamed from: n */
    public static /* synthetic */ java.util.ArrayList m3830n(p161m0.C1861r c1861r) {
        return c1861r.f7563q;
    }

    /* renamed from: o */
    public static /* synthetic */ p129f2.C1408Y m3831o(p161m0.C1861r c1861r) {
        return c1861r.f7564r;
    }

    /* renamed from: q */
    public static boolean m3832q(p161m0.C1861r c1861r) {
        return c1861r.f7571y != -9223372036854775807L;
    }

    /* renamed from: s */
    public static /* synthetic */ long m3833s(p161m0.C1861r c1861r) {
        return c1861r.f7570x;
    }

    /* renamed from: t */
    public static /* synthetic */ void m3834t(p161m0.C1861r c1861r) {
        c1861r.f7570x = -9223372036854775807L;
    }

    /* renamed from: v */
    public static void m3835v(p161m0.C1861r c1861r) {
        c1861r.f7551A = true;
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = c1861r.f7562p;
            if (i4 >= arrayList.size()) {
                return;
            }
            c1861r.f7551A = ((p161m0.C1860q) arrayList.get(i4)).f7548d & c1861r.f7551A;
            i4++;
        }
    }

    /* renamed from: x */
    public static void m3836x(p161m0.C1861r c1861r) {
        if (c1861r.f7553C || c1861r.f7554D) {
            return;
        }
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = c1861r.f7562p;
            if (i4 >= arrayList.size()) {
                c1861r.f7554D = true;
                p129f2.AbstractC1393I m3162j = p129f2.AbstractC1393I.m3162j(arrayList);
                p129f2.C1390F c1390f = new p129f2.C1390F();
                for (int i5 = 0; i5 < m3162j.size(); i5++) {
                    p179q0.C1983Z c1983z = ((p161m0.C1860q) m3162j.get(i5)).f7547c;
                    java.lang.String num = java.lang.Integer.toString(i5);
                    p076T.C0702p m4021q = c1983z.m4021q();
                    p086W.AbstractC0781a.m1419h(m4021q);
                    c1390f.m3147c(new p076T.C0678V(num, m4021q));
                }
                c1861r.f7567u = c1390f.m3157g();
                p179q0.InterfaceC1961C interfaceC1961C = c1861r.f7566t;
                p086W.AbstractC0781a.m1419h(interfaceC1961C);
                interfaceC1961C.mo1920o(c1861r);
                return;
            }
            if (((p161m0.C1860q) arrayList.get(i4)).f7547c.m4021q() == null) {
                return;
            } else {
                i4++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m0.d] */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    /* renamed from: y */
    public static void m3837y(p161m0.C1861r c1861r) {
        c1861r.f7557G = true;
        p161m0.C1856m c1856m = c1861r.f7561o;
        c1856m.getClass();
        try {
            c1856m.close();
            p161m0.C1868y c1868y = new p161m0.C1868y(new p094Y.C0886x(c1856m));
            c1856m.f7531t = c1868y;
            c1868y.m3841a(c1856m.m3817g(c1856m.f7530s));
            c1856m.f7533v = null;
            c1856m.f7520B = false;
            c1856m.f7536y = null;
        } catch (java.io.IOException e4) {
            c1856m.f7524m.m3185B(new java.io.IOException(e4));
        }
        c1861r.f7565s.getClass();
        ?? obj = new java.lang.Object();
        java.util.ArrayList arrayList = c1861r.f7562p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        java.util.ArrayList arrayList3 = c1861r.f7563q;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            p161m0.C1860q c1860q = (p161m0.C1860q) arrayList.get(i4);
            if (c1860q.f7548d) {
                arrayList2.add(c1860q);
            } else {
                p161m0.C1859p c1859p = c1860q.f7545a;
                p161m0.C1860q c1860q2 = new p161m0.C1860q(c1861r, c1859p.f7541a, i4, obj);
                arrayList2.add(c1860q2);
                c1860q2.m3825b();
                if (arrayList3.contains(c1859p)) {
                    arrayList4.add(c1860q2.f7545a);
                }
            }
        }
        p129f2.AbstractC1393I m3162j = p129f2.AbstractC1393I.m3162j(arrayList);
        arrayList.clear();
        arrayList.addAll(arrayList2);
        arrayList3.clear();
        arrayList3.addAll(arrayList4);
        for (int i5 = 0; i5 < m3162j.size(); i5++) {
            ((p161m0.C1860q) m3162j.get(i5)).m3824a();
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: b */
    public final long mo2953b(long j4, p102a0.C0987m0 c0987m0) {
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: c */
    public final boolean mo2954c() {
        int i4;
        return !this.f7551A && ((i4 = this.f7561o.f7537z) == 2 || i4 == 1);
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: e */
    public final p179q0.C2005k0 mo2956e() {
        p086W.AbstractC0781a.m1421j(this.f7554D);
        p129f2.C1415c0 c1415c0 = this.f7567u;
        c1415c0.getClass();
        return new p179q0.C2005k0((p076T.C0678V[]) c1415c0.toArray(new p076T.C0678V[0]));
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: g */
    public final void mo2957g(p179q0.InterfaceC1961C interfaceC1961C, long j4) {
        p161m0.C1856m c1856m = this.f7561o;
        this.f7566t = interfaceC1961C;
        try {
            c1856m.getClass();
            try {
                c1856m.f7531t.m3841a(c1856m.m3817g(c1856m.f7530s));
                android.net.Uri uri = c1856m.f7530s;
                java.lang.String str = c1856m.f7533v;
                p063P2.C0528a c0528a = c1856m.f7529r;
                c0528a.m1031l(c0528a.m1027h(4, str, p129f2.C1425h0.f5764r, uri));
            } catch (java.io.IOException e4) {
                p086W.AbstractC0805y.m1613h(c1856m.f7531t);
                throw e4;
            }
        } catch (java.io.IOException e5) {
            this.f7568v = e5;
            p086W.AbstractC0805y.m1613h(c1856m);
        }
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: h */
    public final long mo2958h() {
        if (!this.f7551A) {
            java.util.ArrayList arrayList = this.f7562p;
            if (!arrayList.isEmpty()) {
                long j4 = this.f7570x;
                if (j4 != -9223372036854775807L) {
                    return j4;
                }
                boolean z4 = true;
                long j5 = Long.MAX_VALUE;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    p161m0.C1860q c1860q = (p161m0.C1860q) arrayList.get(i4);
                    if (!c1860q.f7548d) {
                        j5 = java.lang.Math.min(j5, c1860q.f7547c.m4016l());
                        z4 = false;
                    }
                }
                if (z4 || j5 == Long.MIN_VALUE) {
                    return 0L;
                }
                return j5;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: i */
    public final boolean mo2959i(p102a0.C0953Q c0953q) {
        return mo2954c();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: j */
    public final void mo2960j() {
        java.io.IOException iOException = this.f7568v;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: l */
    public final long mo2961l(long j4) {
        if (mo2958h() == 0 && !this.f7557G) {
            this.f7572z = j4;
            return j4;
        }
        mo2962m(j4);
        this.f7570x = j4;
        if (this.f7571y != -9223372036854775807L) {
            p161m0.C1856m c1856m = this.f7561o;
            int i4 = c1856m.f7537z;
            if (i4 == 1) {
                return j4;
            }
            if (i4 != 2) {
                throw new java.lang.IllegalStateException();
            }
            this.f7571y = j4;
            c1856m.m3818h(j4);
            return j4;
        }
        int i5 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f7562p;
            if (i5 >= arrayList.size()) {
                return j4;
            }
            if (!((p161m0.C1860q) arrayList.get(i5)).f7547c.m4008B(j4, false)) {
                this.f7571y = j4;
                if (this.f7551A) {
                    for (int i6 = 0; i6 < this.f7562p.size(); i6++) {
                        p161m0.C1860q c1860q = (p161m0.C1860q) this.f7562p.get(i6);
                        p086W.AbstractC0781a.m1421j(c1860q.f7548d);
                        c1860q.f7548d = false;
                        m3835v(c1860q.f7550f);
                        c1860q.m3825b();
                    }
                    if (this.f7557G) {
                        this.f7561o.m3819i(p086W.AbstractC0805y.m1605Z(j4));
                    } else {
                        this.f7561o.m3818h(j4);
                    }
                } else {
                    this.f7561o.m3818h(j4);
                }
                for (int i7 = 0; i7 < this.f7562p.size(); i7++) {
                    p161m0.C1860q c1860q2 = (p161m0.C1860q) this.f7562p.get(i7);
                    if (!c1860q2.f7548d) {
                        p161m0.C1850g c1850g = c1860q2.f7545a.f7542b.f7477s;
                        c1850g.getClass();
                        synchronized (c1850g.f7486e) {
                            c1850g.f7492k = true;
                        }
                        c1860q2.f7547c.m4030z(false);
                        c1860q2.f7547c.f8104t = j4;
                    }
                }
                return j4;
            }
            i5++;
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: m */
    public final void mo2962m(long j4) {
        if (this.f7571y != -9223372036854775807L) {
            return;
        }
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f7562p;
            if (i4 >= arrayList.size()) {
                return;
            }
            p161m0.C1860q c1860q = (p161m0.C1860q) arrayList.get(i4);
            if (!c1860q.f7548d) {
                c1860q.f7547c.m4011f(j4, true);
            }
            i4++;
        }
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: p */
    public final long mo2963p(p193t0.InterfaceC2181s[] interfaceC2181sArr, boolean[] zArr, p179q0.InterfaceC1985a0[] interfaceC1985a0Arr, boolean[] zArr2, long j4) {
        java.util.ArrayList arrayList;
        for (int i4 = 0; i4 < interfaceC2181sArr.length; i4++) {
            if (interfaceC1985a0Arr[i4] != null && (interfaceC2181sArr[i4] == null || !zArr[i4])) {
                interfaceC1985a0Arr[i4] = null;
            }
        }
        java.util.ArrayList arrayList2 = this.f7563q;
        arrayList2.clear();
        int i5 = 0;
        while (true) {
            int length = interfaceC2181sArr.length;
            arrayList = this.f7562p;
            if (i5 >= length) {
                break;
            }
            p193t0.InterfaceC2181s interfaceC2181s = interfaceC2181sArr[i5];
            if (interfaceC2181s != null) {
                p076T.C0678V mo3970b = interfaceC2181s.mo3970b();
                p129f2.C1415c0 c1415c0 = this.f7567u;
                c1415c0.getClass();
                int indexOf = c1415c0.indexOf(mo3970b);
                p161m0.C1860q c1860q = (p161m0.C1860q) arrayList.get(indexOf);
                c1860q.getClass();
                arrayList2.add(c1860q.f7545a);
                if (this.f7567u.contains(mo3970b) && interfaceC1985a0Arr[i5] == null) {
                    interfaceC1985a0Arr[i5] = new p006B.C0020c(indexOf, this);
                    zArr2[i5] = true;
                }
            }
            i5++;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            p161m0.C1860q c1860q2 = (p161m0.C1860q) arrayList.get(i6);
            if (!arrayList2.contains(c1860q2.f7545a)) {
                c1860q2.m3824a();
            }
        }
        this.f7555E = true;
        if (j4 != 0) {
            this.f7570x = j4;
            this.f7571y = j4;
            this.f7572z = j4;
        }
        m3838z();
        return j4;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: r */
    public final long mo2964r() {
        return mo2958h();
    }

    @Override // p179q0.InterfaceC1962D
    /* renamed from: u */
    public final long mo2965u() {
        if (!this.f7552B) {
            return -9223372036854775807L;
        }
        this.f7552B = false;
        return 0L;
    }

    @Override // p179q0.InterfaceC1989c0
    /* renamed from: w */
    public final void mo2966w(long j4) {
    }

    /* renamed from: z */
    public final void m3838z() {
        java.util.ArrayList arrayList;
        boolean z4 = true;
        int i4 = 0;
        while (true) {
            arrayList = this.f7563q;
            if (i4 >= arrayList.size()) {
                break;
            }
            z4 &= ((p161m0.C1859p) arrayList.get(i4)).f7543c != null;
            i4++;
        }
        if (z4 && this.f7555E) {
            p161m0.C1856m c1856m = this.f7561o;
            c1856m.f7527p.addAll(arrayList);
            c1856m.m3816f();
        }
    }
}
