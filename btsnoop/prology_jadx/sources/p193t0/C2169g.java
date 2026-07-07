package p193t0;

/* renamed from: t0.g */
/* loaded from: classes.dex */
public final class C2169g extends p193t0.AbstractC2177o implements java.lang.Comparable {

    /* renamed from: A */
    public final int f8637A;

    /* renamed from: B */
    public final boolean f8638B;

    /* renamed from: C */
    public final int f8639C;

    /* renamed from: D */
    public final int f8640D;

    /* renamed from: E */
    public final int f8641E;

    /* renamed from: F */
    public final int f8642F;

    /* renamed from: G */
    public final boolean f8643G;

    /* renamed from: H */
    public final boolean f8644H;

    /* renamed from: p */
    public final int f8645p;

    /* renamed from: q */
    public final boolean f8646q;

    /* renamed from: r */
    public final java.lang.String f8647r;

    /* renamed from: s */
    public final p193t0.C2173k f8648s;

    /* renamed from: t */
    public final boolean f8649t;

    /* renamed from: u */
    public final int f8650u;

    /* renamed from: v */
    public final int f8651v;

    /* renamed from: w */
    public final int f8652w;

    /* renamed from: x */
    public final boolean f8653x;

    /* renamed from: y */
    public final boolean f8654y;

    /* renamed from: z */
    public final int f8655z;

    public C2169g(int i4, p076T.C0678V c0678v, int i5, p193t0.C2173k c2173k, int i6, boolean z4, p193t0.C2168f c2168f, int i7) {
        super(i4, c0678v, i5);
        int i8;
        int i9;
        int i10;
        boolean z5;
        this.f8648s = c2173k;
        int i11 = c2173k.f8673u ? 24 : 16;
        int i12 = 0;
        this.f8653x = false;
        this.f8647r = p193t0.C2179q.m4298f(this.f8692o.f2399d);
        this.f8649t = p102a0.AbstractC0970e.m1979o(i6, false);
        int i13 = 0;
        while (true) {
            p129f2.C1415c0 c1415c0 = c2173k.f2283i;
            i8 = Integer.MAX_VALUE;
            if (i13 >= c1415c0.size()) {
                i9 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                i9 = p193t0.C2179q.m4297c(this.f8692o, (java.lang.String) c1415c0.get(i13), false);
                if (i9 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.f8651v = i13;
        this.f8650u = i9;
        this.f8652w = p193t0.C2179q.m4296b(this.f8692o.f2401f, 0);
        p076T.C0702p c0702p = this.f8692o;
        int i14 = c0702p.f2401f;
        this.f8654y = i14 == 0 || (i14 & 1) != 0;
        this.f8638B = (c0702p.f2400e & 1) != 0;
        int i15 = c0702p.f2385A;
        this.f8639C = i15;
        this.f8640D = c0702p.f2386B;
        int i16 = c0702p.f2404i;
        this.f8641E = i16;
        this.f8646q = (i16 == -1 || i16 <= c2173k.f2285k) && (i15 == -1 || i15 <= c2173k.f2284j) && c2168f.apply(c0702p);
        java.lang.String[] m1583D = p086W.AbstractC0805y.m1583D();
        int i17 = 0;
        while (true) {
            if (i17 >= m1583D.length) {
                i10 = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                i10 = p193t0.C2179q.m4297c(this.f8692o, m1583D[i17], false);
                if (i10 > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f8655z = i17;
        this.f8637A = i10;
        int i18 = 0;
        while (true) {
            p129f2.C1415c0 c1415c02 = c2173k.f2286l;
            if (i18 < c1415c02.size()) {
                java.lang.String str = this.f8692o.f2408m;
                if (str != null && str.equals(c1415c02.get(i18))) {
                    i8 = i18;
                    break;
                }
                i18++;
            } else {
                break;
            }
        }
        this.f8642F = i8;
        this.f8643G = p102a0.AbstractC0970e.m1977i(i6) == 128;
        this.f8644H = p102a0.AbstractC0970e.m1978j(i6) == 64;
        p193t0.C2173k c2173k2 = this.f8648s;
        if (p102a0.AbstractC0970e.m1979o(i6, c2173k2.f8675w) && ((z5 = this.f8646q) || c2173k2.f8672t)) {
            p076T.C0679W c0679w = c2173k2.f2287m;
            int i19 = c0679w.f2255a;
            p076T.C0702p c0702p2 = this.f8692o;
            if (i19 != 2 || p193t0.C2179q.m4299g(c2173k2, i6, c0702p2)) {
                i12 = (!p102a0.AbstractC0970e.m1979o(i6, false) || !z5 || c0702p2.f2404i == -1 || (!c2173k2.f8676x && z4) || c0679w.f2255a == 2 || (i11 & i6) == 0) ? 1 : 2;
            }
        }
        this.f8645p = i12;
    }

    @Override // p193t0.AbstractC2177o
    /* renamed from: a */
    public final int mo4290a() {
        return this.f8645p;
    }

    @Override // p193t0.AbstractC2177o
    /* renamed from: b */
    public final boolean mo4291b(p193t0.AbstractC2177o abstractC2177o) {
        int i4;
        java.lang.String str;
        p193t0.C2169g c2169g = (p193t0.C2169g) abstractC2177o;
        this.f8648s.getClass();
        p076T.C0702p c0702p = this.f8692o;
        int i5 = c0702p.f2385A;
        if (i5 != -1) {
            p076T.C0702p c0702p2 = c2169g.f8692o;
            if (i5 == c0702p2.f2385A && ((this.f8653x || ((str = c0702p.f2408m) != null && android.text.TextUtils.equals(str, c0702p2.f2408m))) && (i4 = c0702p.f2386B) != -1 && i4 == c0702p2.f2386B)) {
                if (this.f8643G == c2169g.f8643G && this.f8644H == c2169g.f8644H) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p193t0.C2169g c2169g) {
        boolean z4 = this.f8649t;
        boolean z5 = this.f8646q;
        p129f2.AbstractC1413b0 mo3204a = (z5 && z4) ? p193t0.C2179q.f8708j : p193t0.C2179q.f8708j.mo3204a();
        p129f2.AbstractC1453z mo3261c = p129f2.AbstractC1453z.f5826a.mo3261c(z4, c2169g.f8649t);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f8651v);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(c2169g.f8651v);
        p129f2.C1411a0.f5738l.getClass();
        p129f2.C1429j0 c1429j0 = p129f2.C1429j0.f5781l;
        p129f2.AbstractC1453z mo3260b = mo3261c.mo3260b(valueOf, valueOf2, c1429j0).mo3259a(this.f8650u, c2169g.f8650u).mo3259a(this.f8652w, c2169g.f8652w).mo3261c(this.f8638B, c2169g.f8638B).mo3261c(this.f8654y, c2169g.f8654y).mo3260b(java.lang.Integer.valueOf(this.f8655z), java.lang.Integer.valueOf(c2169g.f8655z), c1429j0).mo3259a(this.f8637A, c2169g.f8637A).mo3261c(z5, c2169g.f8646q).mo3260b(java.lang.Integer.valueOf(this.f8642F), java.lang.Integer.valueOf(c2169g.f8642F), c1429j0);
        this.f8648s.getClass();
        p129f2.AbstractC1453z mo3260b2 = mo3260b.mo3261c(this.f8643G, c2169g.f8643G).mo3261c(this.f8644H, c2169g.f8644H).mo3260b(java.lang.Integer.valueOf(this.f8639C), java.lang.Integer.valueOf(c2169g.f8639C), mo3204a).mo3260b(java.lang.Integer.valueOf(this.f8640D), java.lang.Integer.valueOf(c2169g.f8640D), mo3204a);
        if (p086W.AbstractC0805y.m1606a(this.f8647r, c2169g.f8647r)) {
            mo3260b2 = mo3260b2.mo3260b(java.lang.Integer.valueOf(this.f8641E), java.lang.Integer.valueOf(c2169g.f8641E), mo3204a);
        }
        return mo3260b2.mo3263e();
    }
}
