package p193t0;

/* renamed from: t0.m */
/* loaded from: classes.dex */
public final class C2175m extends p193t0.AbstractC2177o implements java.lang.Comparable {

    /* renamed from: p */
    public final int f8680p;

    /* renamed from: q */
    public final boolean f8681q;

    /* renamed from: r */
    public final boolean f8682r;

    /* renamed from: s */
    public final boolean f8683s;

    /* renamed from: t */
    public final int f8684t;

    /* renamed from: u */
    public final int f8685u;

    /* renamed from: v */
    public final int f8686v;

    /* renamed from: w */
    public final int f8687w;

    /* renamed from: x */
    public final boolean f8688x;

    public C2175m(int i4, p076T.C0678V c0678v, int i5, p193t0.C2173k c2173k, int i6, java.lang.String str) {
        super(i4, c0678v, i5);
        int i7;
        int i8 = 0;
        this.f8681q = p102a0.AbstractC0970e.m1979o(i6, false);
        int i9 = this.f8692o.f2400e;
        c2173k.getClass();
        this.f8682r = (i9 & 1) != 0;
        this.f8683s = (i9 & 2) != 0;
        p129f2.C1415c0 c1415c0 = c2173k.f2288n;
        p129f2.C1415c0 m3166o = c1415c0.isEmpty() ? p129f2.AbstractC1393I.m3166o("") : c1415c0;
        int i10 = 0;
        while (true) {
            if (i10 >= m3166o.size()) {
                i10 = Integer.MAX_VALUE;
                i7 = 0;
                break;
            } else {
                i7 = p193t0.C2179q.m4297c(this.f8692o, (java.lang.String) m3166o.get(i10), false);
                if (i7 > 0) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        this.f8684t = i10;
        this.f8685u = i7;
        int m4296b = p193t0.C2179q.m4296b(this.f8692o.f2401f, c2173k.f2289o);
        this.f8686v = m4296b;
        this.f8688x = (this.f8692o.f2401f & 1088) != 0;
        int m4297c = p193t0.C2179q.m4297c(this.f8692o, str, p193t0.C2179q.m4298f(str) == null);
        this.f8687w = m4297c;
        boolean z4 = i7 > 0 || (c1415c0.isEmpty() && m4296b > 0) || this.f8682r || (this.f8683s && m4297c > 0);
        if (p102a0.AbstractC0970e.m1979o(i6, c2173k.f8675w) && z4) {
            i8 = 1;
        }
        this.f8680p = i8;
    }

    @Override // p193t0.AbstractC2177o
    /* renamed from: a */
    public final int mo4290a() {
        return this.f8680p;
    }

    @Override // p193t0.AbstractC2177o
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo4291b(p193t0.AbstractC2177o abstractC2177o) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p193t0.C2175m c2175m) {
        p129f2.AbstractC1453z mo3261c = p129f2.AbstractC1453z.f5826a.mo3261c(this.f8681q, c2175m.f8681q);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f8684t);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c2175m.f8684t);
        java.util.Comparator comparator = p129f2.C1411a0.f5738l;
        comparator.getClass();
        p129f2.C1429j0 c1429j0 = p129f2.C1429j0.f5781l;
        p129f2.AbstractC1453z mo3260b = mo3261c.mo3260b(valueOf, valueOf2, c1429j0);
        int i4 = this.f8685u;
        p129f2.AbstractC1453z mo3259a = mo3260b.mo3259a(i4, c2175m.f8685u);
        int i5 = this.f8686v;
        p129f2.AbstractC1453z mo3261c2 = mo3259a.mo3259a(i5, c2175m.f8686v).mo3261c(this.f8682r, c2175m.f8682r);
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(this.f8683s);
        java.lang.Boolean valueOf4 = java.lang.Boolean.valueOf(c2175m.f8683s);
        if (i4 != 0) {
            comparator = c1429j0;
        }
        p129f2.AbstractC1453z mo3259a2 = mo3261c2.mo3260b(valueOf3, valueOf4, comparator).mo3259a(this.f8687w, c2175m.f8687w);
        if (i5 == 0) {
            mo3259a2 = mo3259a2.mo3262d(this.f8688x, c2175m.f8688x);
        }
        return mo3259a2.mo3263e();
    }
}
