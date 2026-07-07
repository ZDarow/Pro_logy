package p197u0;

/* renamed from: u0.g */
/* loaded from: classes.dex */
public final class C2220g implements p197u0.InterfaceC2217d, p094Y.InterfaceC0860C {

    /* renamed from: n */
    public static final p129f2.C1415c0 f8847n = p129f2.AbstractC1393I.m3165n(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: o */
    public static final p129f2.C1415c0 f8848o = p129f2.AbstractC1393I.m3165n(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: p */
    public static final p129f2.C1415c0 f8849p = p129f2.AbstractC1393I.m3165n(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: q */
    public static final p129f2.C1415c0 f8850q = p129f2.AbstractC1393I.m3165n(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: r */
    public static final p129f2.C1415c0 f8851r = p129f2.AbstractC1393I.m3165n(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: s */
    public static final p129f2.C1415c0 f8852s = p129f2.AbstractC1393I.m3165n(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: t */
    public static p197u0.C2220g f8853t;

    /* renamed from: a */
    public final p129f2.C1425h0 f8854a;

    /* renamed from: b */
    public final p129f2.C1408Y f8855b = new p129f2.C1408Y(26);

    /* renamed from: c */
    public final p086W.C0800t f8856c;

    /* renamed from: d */
    public final boolean f8857d;

    /* renamed from: e */
    public final p197u0.C2232s f8858e;

    /* renamed from: f */
    public int f8859f;

    /* renamed from: g */
    public long f8860g;

    /* renamed from: h */
    public long f8861h;

    /* renamed from: i */
    public long f8862i;

    /* renamed from: j */
    public long f8863j;

    /* renamed from: k */
    public long f8864k;

    /* renamed from: l */
    public long f8865l;

    /* renamed from: m */
    public int f8866m;

    public C2220g(android.content.Context context, java.util.HashMap hashMap, int i4, p086W.C0800t c0800t, boolean z4) {
        this.f8854a = p129f2.C1425h0.m3214a(hashMap);
        this.f8858e = new p197u0.C2232s(i4);
        this.f8856c = c0800t;
        this.f8857d = z4;
        if (context == null) {
            this.f8866m = 0;
            this.f8864k = m4426b(0);
            return;
        }
        p086W.C0796p m1506c = p086W.C0796p.m1506c(context);
        int m1508d = m1506c.m1508d();
        this.f8866m = m1508d;
        this.f8864k = m4426b(m1508d);
        p197u0.C2219f c2219f = new p197u0.C2219f(this);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) m1506c.f2776c;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new java.lang.ref.WeakReference(c2219f));
        ((android.os.Handler) m1506c.f2775b).post(new p086W.RunnableC0793m(0, m1506c, c2219f));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1041:0x0cd7, code lost:
    
        if (r8.equals("AI") == false) goto L4;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] m4425a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p197u0.C2220g.m4425a(java.lang.String):int[]");
    }

    /* renamed from: b */
    public final long m4426b(int i4) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i4);
        p129f2.C1425h0 c1425h0 = this.f8854a;
        java.lang.Long l4 = (java.lang.Long) c1425h0.get(valueOf);
        if (l4 == null) {
            l4 = (java.lang.Long) c1425h0.get(0);
        }
        if (l4 == null) {
            l4 = 1000000L;
        }
        return l4.longValue();
    }

    /* renamed from: c */
    public final void m4427c(final int i4, final long j4, final long j5) {
        if (i4 == 0 && j4 == 0 && j5 == this.f8865l) {
            return;
        }
        this.f8865l = j5;
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.f8855b.f5729m).iterator();
        while (it.hasNext()) {
            final p197u0.C2216c c2216c = (p197u0.C2216c) it.next();
            if (!c2216c.f8839c) {
                c2216c.f8837a.post(new java.lang.Runnable() { // from class: u0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        p107b0.C1170e c1170e = p197u0.C2216c.this.f8838b;
                        p013C2.C0139d c0139d = c1170e.f4500o;
                        p107b0.C1166a m2739G = c1170e.m2739G(((p129f2.AbstractC1393I) c0139d.f376b).isEmpty() ? null : (p179q0.C1964F) p129f2.AbstractC1444r.m3232l((p129f2.AbstractC1393I) c0139d.f376b));
                        c1170e.m2742K(m2739G, 1006, new p083V0.C0776n(m2739G, i4, j4, j5));
                    }
                });
            }
        }
    }
}
