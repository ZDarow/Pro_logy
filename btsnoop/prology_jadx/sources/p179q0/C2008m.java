package p179q0;

/* renamed from: q0.m */
/* loaded from: classes.dex */
public final class C2008m extends p102a0.AbstractC0962a {

    /* renamed from: e */
    public final int f8190e;

    /* renamed from: f */
    public final int f8191f;

    /* renamed from: g */
    public final int[] f8192g;

    /* renamed from: h */
    public final int[] f8193h;

    /* renamed from: i */
    public final p076T.AbstractC0677U[] f8194i;

    /* renamed from: j */
    public final java.lang.Object[] f8195j;

    /* renamed from: k */
    public final java.util.HashMap f8196k;

    public C2008m(java.util.ArrayList arrayList, p179q0.C1991d0 c1991d0) {
        super(c1991d0);
        int size = arrayList.size();
        this.f8192g = new int[size];
        this.f8193h = new int[size];
        this.f8194i = new p076T.AbstractC0677U[size];
        this.f8195j = new java.lang.Object[size];
        this.f8196k = new java.util.HashMap();
        java.util.Iterator it = arrayList.iterator();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (it.hasNext()) {
            p179q0.C2011p c2011p = (p179q0.C2011p) it.next();
            p076T.AbstractC0677U[] abstractC0677UArr = this.f8194i;
            p179q0.C2021z c2021z = c2011p.f8199a.f7959z;
            abstractC0677UArr[i6] = c2021z;
            this.f8193h[i6] = i4;
            this.f8192g[i6] = i5;
            i4 += c2021z.f8231b.mo1236o();
            i5 += this.f8194i[i6].mo1233h();
            java.lang.Object[] objArr = this.f8195j;
            java.lang.Object obj = c2011p.f8200b;
            objArr[i6] = obj;
            this.f8196k.put(obj, java.lang.Integer.valueOf(i6));
            i6++;
        }
        this.f8190e = i4;
        this.f8191f = i5;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: h */
    public final int mo1233h() {
        return this.f8191f;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: o */
    public final int mo1236o() {
        return this.f8190e;
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: q */
    public final int mo1963q(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.f8196k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: r */
    public final int mo1964r(int i4) {
        return p086W.AbstractC0805y.m1610e(this.f8192g, i4 + 1, false, false);
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: s */
    public final int mo1965s(int i4) {
        return p086W.AbstractC0805y.m1610e(this.f8193h, i4 + 1, false, false);
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: t */
    public final java.lang.Object mo1966t(int i4) {
        return this.f8195j[i4];
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: u */
    public final int mo1967u(int i4) {
        return this.f8192g[i4];
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: v */
    public final int mo1968v(int i4) {
        return this.f8193h[i4];
    }

    @Override // p102a0.AbstractC0962a
    /* renamed from: y */
    public final p076T.AbstractC0677U mo1971y(int i4) {
        return this.f8194i[i4];
    }
}
