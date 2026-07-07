package p179q0;

/* renamed from: q0.t */
/* loaded from: classes.dex */
public final class C2015t implements p179q0.InterfaceC1963E {

    /* renamed from: a */
    public final p054N1.C0463r f8223a;

    /* renamed from: b */
    public p008B1.C0026d f8224b;

    /* renamed from: c */
    public final long f8225c;

    /* renamed from: d */
    public final long f8226d;

    /* renamed from: e */
    public final long f8227e;

    /* renamed from: f */
    public final float f8228f;

    /* renamed from: g */
    public final float f8229g;

    /* renamed from: h */
    public boolean f8230h;

    public C2015t(android.content.Context context) {
        this(new p008B1.C0026d(context), new p215y0.C2401m());
    }

    /* renamed from: d */
    public static p179q0.InterfaceC1963E m4068d(java.lang.Class cls, p008B1.C0026d c0026d) {
        try {
            return (p179q0.InterfaceC1963E) cls.getConstructor(p094Y.InterfaceC0869g.class).newInstance(c0026d);
        } catch (java.lang.Exception e4) {
            throw new java.lang.IllegalStateException(e4);
        }
    }

    @Override // p179q0.InterfaceC1963E
    /* renamed from: a */
    public final void mo2671a(p046L1.C0363g c0363g) {
        p054N1.C0463r c0463r = this.f8223a;
        c0463r.f1356f = c0363g;
        p215y0.C2401m c2401m = (p215y0.C2401m) c0463r.f1352b;
        synchronized (c2401m) {
            c2401m.f9462q = c0363g;
        }
        java.util.Iterator it = ((java.util.HashMap) c0463r.f1354d).values().iterator();
        while (it.hasNext()) {
            ((p179q0.InterfaceC1963E) it.next()).mo2671a(c0363g);
        }
    }

    @Override // p179q0.InterfaceC1963E
    /* renamed from: b */
    public final void mo2672b(boolean z4) {
        this.f8230h = z4;
        p054N1.C0463r c0463r = this.f8223a;
        c0463r.f1351a = z4;
        p215y0.C2401m c2401m = (p215y0.C2401m) c0463r.f1352b;
        synchronized (c2401m) {
            c2401m.f9461p = z4;
        }
        java.util.Iterator it = ((java.util.HashMap) c0463r.f1354d).values().iterator();
        while (it.hasNext()) {
            ((p179q0.InterfaceC1963E) it.next()).mo2672b(z4);
        }
    }

    @Override // p179q0.InterfaceC1963E
    /* renamed from: c */
    public final p179q0.AbstractC1984a mo2673c(p076T.C0659B c0659b) {
        c0659b.f2143b.getClass();
        java.lang.String scheme = c0659b.f2143b.f2449a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (java.util.Objects.equals(c0659b.f2143b.f2450b, "application/x-image-uri")) {
            long j4 = c0659b.f2143b.f2454f;
            int i4 = p086W.AbstractC0805y.f2801a;
            throw null;
        }
        p076T.C0711y c0711y = c0659b.f2143b;
        int m1586G = p086W.AbstractC0805y.m1586G(c0711y.f2450b, c0711y.f2449a);
        if (c0659b.f2143b.f2454f != -9223372036854775807L) {
            p215y0.C2401m c2401m = (p215y0.C2401m) this.f8223a.f1352b;
            synchronized (c2401m) {
                c2401m.f9463r = 1;
            }
        }
        try {
            p054N1.C0463r c0463r = this.f8223a;
            java.util.HashMap hashMap = (java.util.HashMap) c0463r.f1354d;
            p179q0.InterfaceC1963E interfaceC1963E = (p179q0.InterfaceC1963E) hashMap.get(java.lang.Integer.valueOf(m1586G));
            if (interfaceC1963E == null) {
                interfaceC1963E = (p179q0.InterfaceC1963E) c0463r.m978b(m1586G).get();
                interfaceC1963E.mo2671a((p046L1.C0363g) c0463r.f1356f);
                interfaceC1963E.mo2672b(c0463r.f1351a);
                hashMap.put(java.lang.Integer.valueOf(m1586G), interfaceC1963E);
            }
            p076T.C0709w m1302a = c0659b.f2144c.m1302a();
            p076T.C0710x c0710x = c0659b.f2144c;
            if (c0710x.f2444a == -9223372036854775807L) {
                m1302a.f2439a = this.f8225c;
            }
            if (c0710x.f2447d == -3.4028235E38f) {
                m1302a.f2442d = this.f8228f;
            }
            if (c0710x.f2448e == -3.4028235E38f) {
                m1302a.f2443e = this.f8229g;
            }
            if (c0710x.f2445b == -9223372036854775807L) {
                m1302a.f2440b = this.f8226d;
            }
            if (c0710x.f2446c == -9223372036854775807L) {
                m1302a.f2441c = this.f8227e;
            }
            p076T.C0710x c0710x2 = new p076T.C0710x(m1302a);
            if (!c0710x2.equals(c0659b.f2144c)) {
                p076T.C0705s m1178a = c0659b.m1178a();
                m1178a.f2435k = c0710x2.m1302a();
                c0659b = m1178a.m1299a();
            }
            p179q0.AbstractC1984a mo2673c = interfaceC1963E.mo2673c(c0659b);
            p129f2.AbstractC1393I abstractC1393I = c0659b.f2143b.f2452d;
            if (!abstractC1393I.isEmpty()) {
                p179q0.AbstractC1984a[] abstractC1984aArr = new p179q0.AbstractC1984a[abstractC1393I.size() + 1];
                abstractC1984aArr[0] = mo2673c;
                if (abstractC1393I.size() > 0) {
                    if (!this.f8230h) {
                        this.f8224b.getClass();
                        p076T.C0658A c0658a = (p076T.C0658A) abstractC1393I.get(0);
                        new java.util.ArrayList(1);
                        new java.util.HashSet(1);
                        new java.util.concurrent.CopyOnWriteArrayList();
                        new java.util.concurrent.CopyOnWriteArrayList();
                        p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
                        p129f2.C1415c0 c1415c0 = p129f2.C1415c0.f5744p;
                        java.util.Collections.emptyList();
                        p129f2.C1415c0 c1415c02 = p129f2.C1415c0.f5744p;
                        p076T.C0712z c0712z = p076T.C0712z.f2455a;
                        android.net.Uri uri = android.net.Uri.EMPTY;
                        c0658a.getClass();
                        throw null;
                    }
                    p076T.C0701o c0701o = new p076T.C0701o();
                    ((p076T.C0658A) abstractC1393I.get(0)).getClass();
                    java.util.ArrayList arrayList = p076T.AbstractC0665H.f2200a;
                    c0701o.f2370l = null;
                    ((p076T.C0658A) abstractC1393I.get(0)).getClass();
                    c0701o.f2362d = null;
                    ((p076T.C0658A) abstractC1393I.get(0)).getClass();
                    c0701o.f2363e = 0;
                    ((p076T.C0658A) abstractC1393I.get(0)).getClass();
                    c0701o.f2364f = 0;
                    ((p076T.C0658A) abstractC1393I.get(0)).getClass();
                    c0701o.f2360b = null;
                    ((p076T.C0658A) abstractC1393I.get(0)).getClass();
                    c0701o.f2359a = null;
                    new p076T.C0702p(c0701o);
                    ((p076T.C0658A) abstractC1393I.get(0)).getClass();
                    throw null;
                }
                mo2673c = new p179q0.C1971M(abstractC1984aArr);
            }
            p179q0.AbstractC1984a abstractC1984a = mo2673c;
            long j5 = c0659b.f2146e.f2438a;
            if (j5 != Long.MIN_VALUE) {
                abstractC1984a = new p179q0.C1996g(abstractC1984a, 0L, j5, true);
            }
            c0659b.f2143b.getClass();
            c0659b.f2143b.getClass();
            return abstractC1984a;
        } catch (java.lang.ClassNotFoundException e4) {
            throw new java.lang.IllegalStateException(e4);
        }
    }

    public C2015t(p008B1.C0026d c0026d, p215y0.C2401m c2401m) {
        this.f8224b = c0026d;
        p054N1.C0463r c0463r = new p054N1.C0463r(c2401m, new p046L1.C0363g(15, false));
        this.f8223a = c0463r;
        if (c0026d != ((p008B1.C0026d) c0463r.f1355e)) {
            c0463r.f1355e = c0026d;
            ((java.util.HashMap) c0463r.f1353c).clear();
            ((java.util.HashMap) c0463r.f1354d).clear();
        }
        this.f8225c = -9223372036854775807L;
        this.f8226d = -9223372036854775807L;
        this.f8227e = -9223372036854775807L;
        this.f8228f = -3.4028235E38f;
        this.f8229g = -3.4028235E38f;
        this.f8230h = true;
    }
}
