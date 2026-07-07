package p123e1;

/* renamed from: e1.g */
/* loaded from: classes.dex */
public final class C1333g implements p123e1.InterfaceC1335i {

    /* renamed from: a */
    public final p086W.C0798r f5391a;

    /* renamed from: c */
    public final java.lang.String f5393c;

    /* renamed from: d */
    public final int f5394d;

    /* renamed from: e */
    public java.lang.String f5395e;

    /* renamed from: f */
    public p215y0.InterfaceC2387F f5396f;

    /* renamed from: h */
    public int f5398h;

    /* renamed from: i */
    public int f5399i;

    /* renamed from: j */
    public long f5400j;

    /* renamed from: k */
    public p076T.C0702p f5401k;

    /* renamed from: l */
    public int f5402l;

    /* renamed from: m */
    public int f5403m;

    /* renamed from: g */
    public int f5397g = 0;

    /* renamed from: p */
    public long f5406p = -9223372036854775807L;

    /* renamed from: b */
    public final java.util.concurrent.atomic.AtomicInteger f5392b = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: n */
    public int f5404n = -1;

    /* renamed from: o */
    public int f5405o = -1;

    public C1333g(int i4, int i5, java.lang.String str) {
        this.f5391a = new p086W.C0798r(new byte[i5]);
        this.f5393c = str;
        this.f5394d = i4;
    }

    /* renamed from: a */
    public final boolean m3098a(p086W.C0798r c0798r, byte[] bArr, int i4) {
        int min = java.lang.Math.min(c0798r.m1539a(), i4 - this.f5398h);
        c0798r.m1544f(bArr, this.f5398h, min);
        int i5 = this.f5398h + min;
        this.f5398h = i5;
        return i5 == i4;
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: b */
    public final void mo3089b() {
        this.f5397g = 0;
        this.f5398h = 0;
        this.f5399i = 0;
        this.f5406p = -9223372036854775807L;
        this.f5392b.set(0);
    }

    /* renamed from: c */
    public final void m3099c(p215y0.C2389a c2389a) {
        int i4;
        int i5 = c2389a.f9371b;
        if (i5 == -2147483647 || (i4 = c2389a.f9372c) == -1) {
            return;
        }
        p076T.C0702p c0702p = this.f5401k;
        java.lang.String str = c2389a.f9370a;
        if (c0702p != null && i4 == c0702p.f2385A && i5 == c0702p.f2386B && str.equals(c0702p.f2408m)) {
            return;
        }
        p076T.C0702p c0702p2 = this.f5401k;
        p076T.C0701o c0701o = c0702p2 == null ? new p076T.C0701o() : c0702p2.m1295a();
        c0701o.f2359a = this.f5395e;
        c0701o.f2370l = p076T.AbstractC0665H.m1201l(str);
        c0701o.f2384z = i4;
        c0701o.f2350A = i5;
        c0701o.f2362d = this.f5393c;
        c0701o.f2364f = this.f5394d;
        p076T.C0702p c0702p3 = new p076T.C0702p(c0701o);
        this.f5401k = c0702p3;
        this.f5396f.mo1407c(c0702p3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04a0  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v0, types: [y0.F] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [int] */
    /* JADX WARN: Type inference failed for: r18v3 */
    @Override // p123e1.InterfaceC1335i
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3090d(p086W.C0798r r38) {
        /*
            Method dump skipped, instructions count: 1402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p123e1.C1333g.mo3090d(W.r):void");
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: e */
    public final void mo3091e(boolean z4) {
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: f */
    public final void mo3092f(p215y0.InterfaceC2405q interfaceC2405q, p123e1.C1325G c1325g) {
        c1325g.m3084a();
        c1325g.m3086c();
        this.f5395e = (java.lang.String) c1325g.f5333e;
        c1325g.m3086c();
        this.f5396f = interfaceC2405q.mo640v(c1325g.f5331c, 1);
    }

    @Override // p123e1.InterfaceC1335i
    /* renamed from: g */
    public final void mo3093g(long j4, int i4) {
        this.f5406p = j4;
    }
}
