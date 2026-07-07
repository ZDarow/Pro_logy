package p117d0;

/* renamed from: d0.e */
/* loaded from: classes.dex */
public final class C1261e extends p076T.AbstractC0677U {

    /* renamed from: b */
    public final long f5020b;

    /* renamed from: c */
    public final long f5021c;

    /* renamed from: d */
    public final long f5022d;

    /* renamed from: e */
    public final int f5023e;

    /* renamed from: f */
    public final long f5024f;

    /* renamed from: g */
    public final long f5025g;

    /* renamed from: h */
    public final long f5026h;

    /* renamed from: i */
    public final p122e0.C1302c f5027i;

    /* renamed from: j */
    public final p076T.C0659B f5028j;

    /* renamed from: k */
    public final p076T.C0710x f5029k;

    public C1261e(long j4, long j5, long j6, int i4, long j7, long j8, long j9, p122e0.C1302c c1302c, p076T.C0659B c0659b, p076T.C0710x c0710x) {
        p086W.AbstractC0781a.m1421j(c1302c.f5220d == (c0710x != null));
        this.f5020b = j4;
        this.f5021c = j5;
        this.f5022d = j6;
        this.f5023e = i4;
        this.f5024f = j7;
        this.f5025g = j8;
        this.f5026h = j9;
        this.f5027i = c1302c;
        this.f5028j = c0659b;
        this.f5029k = c0710x;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: b */
    public final int mo1231b(java.lang.Object obj) {
        int intValue;
        if ((obj instanceof java.lang.Integer) && (intValue = ((java.lang.Integer) obj).intValue() - this.f5023e) >= 0 && intValue < mo1233h()) {
            return intValue;
        }
        return -1;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: f */
    public final p076T.C0675S mo1232f(int i4, p076T.C0675S c0675s, boolean z4) {
        p086W.AbstractC0781a.m1418g(i4, mo1233h());
        p122e0.C1302c c1302c = this.f5027i;
        java.lang.String str = z4 ? c1302c.m3041b(i4).f5249a : null;
        java.lang.Integer valueOf = z4 ? java.lang.Integer.valueOf(this.f5023e + i4) : null;
        long m3043d = c1302c.m3043d(i4);
        long m1592M = p086W.AbstractC0805y.m1592M(c1302c.m3041b(i4).f5250b - c1302c.m3041b(0).f5250b) - this.f5024f;
        c0675s.getClass();
        c0675s.m1244h(str, valueOf, 0, m3043d, m1592M, p076T.C0685b.f2305c, false);
        return c0675s;
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: h */
    public final int mo1233h() {
        return this.f5027i.f5229m.size();
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: l */
    public final java.lang.Object mo1234l(int i4) {
        p086W.AbstractC0781a.m1418g(i4, mo1233h());
        return java.lang.Integer.valueOf(this.f5023e + i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r7 > r21.f5025g) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    @Override // p076T.AbstractC0677U
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p076T.C0676T mo1235m(int r22, p076T.C0676T r23, long r24) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p117d0.C1261e.mo1235m(int, T.T, long):T.T");
    }

    @Override // p076T.AbstractC0677U
    /* renamed from: o */
    public final int mo1236o() {
        return 1;
    }
}
