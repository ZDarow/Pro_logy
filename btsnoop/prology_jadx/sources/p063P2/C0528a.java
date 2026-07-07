package p063P2;

/* renamed from: P2.a */
/* loaded from: classes.dex */
public final class C0528a implements p215y0.InterfaceC2397i, p204v2.InterfaceC2279i {

    /* renamed from: l */
    public int f1551l;

    /* renamed from: m */
    public java.lang.Object f1552m;

    /* renamed from: n */
    public java.lang.Object f1553n;

    public C0528a(int i4, p161m0.C1857n c1857n, java.lang.String str) {
        this.f1551l = i4;
        this.f1552m = c1857n;
        this.f1553n = str;
    }

    @Override // p215y0.InterfaceC2397i
    /* renamed from: B */
    public p215y0.C2396h mo523B(p215y0.C2400l c2400l, long j4) {
        long j5 = c2400l.f9450o;
        int min = (int) java.lang.Math.min(112800, c2400l.f9449n - j5);
        p086W.C0798r c0798r = (p086W.C0798r) this.f1553n;
        c0798r.m1534D(min);
        c2400l.mo634p(c0798r.f2786a, 0, min, false);
        int i4 = c0798r.f2788c;
        long j6 = -1;
        long j7 = -1;
        long j8 = -9223372036854775807L;
        while (c0798r.m1539a() >= 188) {
            byte[] bArr = c0798r.f2786a;
            int i5 = c0798r.f2787b;
            while (i5 < i4 && bArr[i5] != 71) {
                i5++;
            }
            int i6 = i5 + 188;
            if (i6 > i4) {
                break;
            }
            long m3906I = p176p1.AbstractC1949a.m3906I(c0798r, i5, this.f1551l);
            if (m3906I != -9223372036854775807L) {
                long m1574b = ((p086W.C0803w) this.f1552m).m1574b(m3906I);
                if (m1574b > j4) {
                    return j8 == -9223372036854775807L ? new p215y0.C2396h(-1, m1574b, j5) : new p215y0.C2396h(0, -9223372036854775807L, j5 + j7);
                }
                if (100000 + m1574b > j4) {
                    return new p215y0.C2396h(0, -9223372036854775807L, j5 + i5);
                }
                j7 = i5;
                j8 = m1574b;
            }
            c0798r.m1537G(i6);
            j6 = i6;
        }
        return j8 != -9223372036854775807L ? new p215y0.C2396h(-2, j8, j5 + j6) : p215y0.C2396h.f9430d;
    }

    @Override // p215y0.InterfaceC2397i
    /* renamed from: E */
    public void mo1023E() {
        byte[] bArr = p086W.AbstractC0805y.f2806f;
        p086W.C0798r c0798r = (p086W.C0798r) this.f1553n;
        c0798r.getClass();
        c0798r.m1535E(bArr, bArr.length);
    }

    @Override // p204v2.InterfaceC2279i
    /* renamed from: a */
    public void mo726a(p204v2.C2277g c2277g) {
        ((android.os.Handler) this.f1553n).post(c2277g.f9029b);
    }

    @Override // p204v2.InterfaceC2279i
    /* renamed from: c */
    public void mo727c() {
        android.os.HandlerThread handlerThread = (android.os.HandlerThread) this.f1552m;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f1552m = null;
            this.f1553n = null;
        }
    }

    @Override // p204v2.InterfaceC2279i
    /* renamed from: d */
    public void mo728d() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("Sqflite", this.f1551l);
        this.f1552m = handlerThread;
        handlerThread.start();
        this.f1553n = new android.os.Handler(((android.os.HandlerThread) this.f1552m).getLooper());
    }

    /* renamed from: e */
    public p129f2.C1425h0 m1024e() {
        p129f2.C1395K c1395k = (p129f2.C1395K) this.f1553n;
        if (c1395k != null) {
            throw c1395k.m3174a();
        }
        p129f2.C1425h0 m3215b = p129f2.C1425h0.m3215b(this.f1551l, (java.lang.Object[]) this.f1552m, this);
        p129f2.C1395K c1395k2 = (p129f2.C1395K) this.f1553n;
        if (c1395k2 == null) {
            return m3215b;
        }
        throw c1395k2.m3174a();
    }

    /* renamed from: f */
    public java.lang.Object m1025f(int i4) {
        android.util.SparseArray sparseArray;
        if (this.f1551l == -1) {
            this.f1551l = 0;
        }
        while (true) {
            int i5 = this.f1551l;
            sparseArray = (android.util.SparseArray) this.f1552m;
            if (i5 <= 0 || i4 >= sparseArray.keyAt(i5)) {
                break;
            }
            this.f1551l--;
        }
        while (this.f1551l < sparseArray.size() - 1 && i4 >= sparseArray.keyAt(this.f1551l + 1)) {
            this.f1551l++;
        }
        return sparseArray.valueAt(this.f1551l);
    }

    /* renamed from: g */
    public int m1026g() {
        int contentSensitivity;
        if (android.os.Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) this.f1552m;
        int i4 = this.f1551l;
        android.view.View findViewById = abstractActivityC0047d.findViewById(i4);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new java.lang.IllegalArgumentException("FlutterView with ID " + i4 + "not found");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.datastore.preferences.protobuf.k, java.io.IOException] */
    /* renamed from: h */
    public p161m0.C1836A m1027h(int i4, java.lang.String str, java.util.Map map, android.net.Uri uri) {
        p161m0.C1856m c1856m = (p161m0.C1856m) this.f1553n;
        java.lang.String str2 = c1856m.f7525n;
        int i5 = this.f1551l;
        this.f1551l = i5 + 1;
        p129f2.C1408Y c1408y = new p129f2.C1408Y(i5, str2, str);
        if (c1856m.f7536y != null) {
            p086W.AbstractC0781a.m1422k(c1856m.f7532u);
            try {
                c1408y.m3198s("Authorization", c1856m.f7536y.m1507b(c1856m.f7532u, uri, i4));
            } catch (p076T.C0666I e4) {
                p161m0.C1856m.m3814c(c1856m, new java.io.IOException(e4));
            }
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            c1408y.m3198s((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        return new p161m0.C1836A(uri, i4, new p161m0.C1857n(c1408y), "");
    }

    /* renamed from: i */
    public void m1028i(java.lang.Object obj, java.lang.Object obj2) {
        int i4 = (this.f1551l + 1) * 2;
        java.lang.Object[] objArr = (java.lang.Object[]) this.f1552m;
        if (i4 > objArr.length) {
            this.f1552m = java.util.Arrays.copyOf(objArr, p129f2.AbstractC1387C.m3144e(objArr.length, i4));
        }
        p129f2.AbstractC1444r.m3225d(obj, obj2);
        java.lang.Object[] objArr2 = (java.lang.Object[]) this.f1552m;
        int i5 = this.f1551l;
        int i6 = i5 * 2;
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        this.f1551l = i5 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public void m1029j() {
        p086W.AbstractC0781a.m1422k((p161m0.C1836A) this.f1552m);
        p161m0.C1857n c1857n = ((p161m0.C1836A) this.f1552m).f7404c;
        java.util.HashMap hashMap = new java.util.HashMap();
        p129f2.C1394J c1394j = c1857n.f7538a;
        p129f2.AbstractC1445r0 it = ((p129f2.C1421f0) c1394j.f5705o.keySet()).iterator();
        while (true) {
            p129f2.C1391G c1391g = (p129f2.C1391G) it;
            if (!c1391g.hasNext()) {
                p161m0.C1836A c1836a = (p161m0.C1836A) this.f1552m;
                m1031l(m1027h(c1836a.f7403b, ((p161m0.C1856m) this.f1553n).f7533v, hashMap, c1836a.f7402a));
                return;
            }
            java.lang.String str = (java.lang.String) c1391g.next();
            if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                hashMap.put(str, (java.lang.String) p129f2.AbstractC1444r.m3232l(c1394j.m3172d(str)));
            }
        }
    }

    /* renamed from: k */
    public void m1030k(java.lang.String str, android.net.Uri uri) {
        m1031l(m1027h(2, str, p129f2.C1425h0.f5764r, uri));
    }

    /* renamed from: l */
    public void m1031l(p161m0.C1836A c1836a) {
        java.lang.String m3822c = c1836a.f7404c.m3822c("CSeq");
        m3822c.getClass();
        int parseInt = java.lang.Integer.parseInt(m3822c);
        p161m0.C1856m c1856m = (p161m0.C1856m) this.f1553n;
        p086W.AbstractC0781a.m1421j(c1856m.f7528q.get(parseInt) == null);
        c1856m.f7528q.append(parseInt, c1836a);
        c1856m.f7531t.m3842b(p161m0.AbstractC1869z.m3849g(c1836a));
        this.f1552m = c1836a;
    }

    /* renamed from: m */
    public void m1032m(int i4) {
        int contentSensitivity;
        if (android.os.Build.VERSION.SDK_INT < 35) {
            throw new java.lang.IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        p009B2.AbstractActivityC0047d abstractActivityC0047d = (p009B2.AbstractActivityC0047d) this.f1552m;
        int i5 = this.f1551l;
        android.view.View findViewById = abstractActivityC0047d.findViewById(i5);
        if (findViewById == null) {
            throw new java.lang.IllegalArgumentException("FlutterView with ID " + i5 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i4) {
            return;
        }
        findViewById.setContentSensitivity(i4);
        findViewById.invalidate();
    }

    /* renamed from: n */
    public java.util.List m1033n(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        p043K2.C0339o c0339o = (p043K2.C0339o) this.f1553n;
        c0339o.getClass();
        p124e2.C1361i c1361i = new p124e2.C1361i(c0339o, this, charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (c1361i.hasNext()) {
            arrayList.add((java.lang.String) c1361i.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public C0528a(p043K2.C0339o c0339o) {
        this.f1553n = c0339o;
        this.f1552m = p124e2.C1355c.f5627l;
        this.f1551l = Integer.MAX_VALUE;
    }

    public C0528a(int i4, int i5) {
        switch (i5) {
            case 9:
                this.f1551l = i4;
                return;
            default:
                this.f1552m = new java.lang.Object[i4 * 2];
                this.f1551l = 0;
                return;
        }
    }

    public C0528a(p076T.C0702p c0702p, int i4, java.lang.String str) {
        this.f1552m = c0702p;
        this.f1551l = i4;
        this.f1553n = str;
    }
}
