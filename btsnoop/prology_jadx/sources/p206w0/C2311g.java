package p206w0;

/* renamed from: w0.g */
/* loaded from: classes.dex */
public final class C2311g {

    /* renamed from: m */
    public static final p142i1.ExecutorC1537b f9123m = new p142i1.ExecutorC1537b(1);

    /* renamed from: a */
    public final p206w0.C2310f f9124a;

    /* renamed from: b */
    public final p206w0.C2320p f9125b;

    /* renamed from: c */
    public final p206w0.C2324t f9126c;

    /* renamed from: d */
    public final p206w0.C2307c f9127d;

    /* renamed from: e */
    public final p086W.C0800t f9128e;

    /* renamed from: f */
    public final java.util.concurrent.CopyOnWriteArraySet f9129f;

    /* renamed from: g */
    public p076T.C0702p f9130g;

    /* renamed from: h */
    public p102a0.C0942F f9131h;

    /* renamed from: i */
    public p086W.C0802v f9132i;

    /* renamed from: j */
    public android.util.Pair f9133j;

    /* renamed from: k */
    public int f9134k;

    /* renamed from: l */
    public int f9135l;

    public C2311g(p054N1.C0463r c0463r) {
        p206w0.C2310f c2310f = new p206w0.C2310f(this, (android.content.Context) c0463r.f1352b);
        this.f9124a = c2310f;
        p086W.C0800t c0800t = (p086W.C0800t) c0463r.f1356f;
        this.f9128e = c0800t;
        p206w0.C2320p c2320p = (p206w0.C2320p) c0463r.f1353c;
        this.f9125b = c2320p;
        c2320p.f9206k = c0800t;
        this.f9126c = new p206w0.C2324t(new p206w0.C2305a(this), c2320p);
        p206w0.C2307c c2307c = (p206w0.C2307c) c0463r.f1355e;
        p086W.AbstractC0781a.m1422k(c2307c);
        this.f9127d = c2307c;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        this.f9129f = copyOnWriteArraySet;
        this.f9135l = 0;
        copyOnWriteArraySet.add(c2310f);
    }

    /* renamed from: a */
    public final void m4493a(long j4, long j5) {
        p206w0.C2324t c2324t;
        p086W.C0792l c0792l;
        int i4;
        if (this.f9134k != 0 || (i4 = (c0792l = (c2324t = this.f9126c).f9234f).f2766b) == 0) {
            return;
        }
        if (i4 == 0) {
            throw new java.util.NoSuchElementException();
        }
        long j6 = ((long[]) c0792l.f2768d)[c0792l.f2765a];
        java.lang.Long l4 = (java.lang.Long) c2324t.f9233e.m1149g(j6);
        p206w0.C2320p c2320p = c2324t.f9230b;
        if (l4 != null && l4.longValue() != c2324t.f9237i) {
            c2324t.f9237i = l4.longValue();
            c2320p.m4519c(2);
        }
        int m4517a = c2324t.f9230b.m4517a(j6, j4, j5, c2324t.f9237i, false, c2324t.f9231c);
        p206w0.C2311g c2311g = (p206w0.C2311g) c2324t.f9229a.f9102l;
        if (m4517a != 0 && m4517a != 1) {
            if (m4517a != 2 && m4517a != 3 && m4517a != 4) {
                if (m4517a != 5) {
                    throw new java.lang.IllegalStateException(java.lang.String.valueOf(m4517a));
                }
                return;
            }
            c2324t.f9238j = j6;
            c0792l.m1474z();
            java.util.Iterator it = c2311g.f9129f.iterator();
            while (it.hasNext()) {
                p206w0.C2310f c2310f = (p206w0.C2310f) it.next();
                c2310f.f9121i.execute(new p206w0.RunnableC2309e(c2310f, c2310f.f9120h, 1));
            }
            p086W.AbstractC0781a.m1422k(null);
            throw null;
        }
        c2324t.f9238j = j6;
        long m1474z = c0792l.m1474z();
        p076T.C0690d0 c0690d0 = (p076T.C0690d0) c2324t.f9232d.m1149g(m1474z);
        if (c0690d0 != null && !c0690d0.equals(p076T.C0690d0.f2310e) && !c0690d0.equals(c2324t.f9236h)) {
            c2324t.f9236h = c0690d0;
            p076T.C0701o c0701o = new p076T.C0701o();
            c0701o.f2376r = c0690d0.f2311a;
            c0701o.f2377s = c0690d0.f2312b;
            c0701o.f2370l = p076T.AbstractC0665H.m1201l("video/raw");
            c2311g.f9130g = new p076T.C0702p(c0701o);
            java.util.Iterator it2 = c2311g.f9129f.iterator();
            while (it2.hasNext()) {
                p206w0.C2310f c2310f2 = (p206w0.C2310f) it2.next();
                c2310f2.f9121i.execute(new p206w0.RunnableC2309e(c2310f2, c2310f2.f9120h, c0690d0));
            }
        }
        boolean z4 = c2320p.f9199d != 3;
        c2320p.f9199d = 3;
        c2320p.f9206k.getClass();
        c2320p.f9201f = p086W.AbstractC0805y.m1592M(android.os.SystemClock.elapsedRealtime());
        if (z4 && c2311g.f9133j != null) {
            java.util.Iterator it3 = c2311g.f9129f.iterator();
            while (it3.hasNext()) {
                p206w0.C2310f c2310f3 = (p206w0.C2310f) it3.next();
                c2310f3.f9121i.execute(new p206w0.RunnableC2309e(c2310f3, c2310f3.f9120h, 2));
            }
        }
        if (c2311g.f9131h != null) {
            if (c2311g.f9130g == null) {
                new p076T.C0701o().m1287a();
            }
            p102a0.C0942F c0942f = c2311g.f9131h;
            c2311g.f9128e.getClass();
            c0942f.m1823c(m1474z, java.lang.System.nanoTime());
        }
        p086W.AbstractC0781a.m1422k(null);
        throw null;
    }
}
