package I;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class P extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public k3.n f765p;

    /* renamed from: q, reason: collision with root package name */
    public int f766q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f767r;
    public final /* synthetic */ k3.n s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Q f768t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f769u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f770v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(k3.n nVar, Q q4, Object obj, boolean z4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.s = nVar;
        this.f768t = q4;
        this.f769u = obj;
        this.f770v = z4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        P p2 = new P(this.s, this.f768t, this.f769u, this.f770v, interfaceC0190d);
        p2.f767r = obj;
        return p2;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        return ((P) g((InterfaceC0190d) obj2, (K.k) obj)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // d3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r9) {
        /*
            r8 = this;
            c3.a r0 = c3.EnumC0225a.f4710l
            int r1 = r8.f766q
            k3.n r2 = r8.s
            java.lang.Object r3 = r8.f769u
            I.Q r4 = r8.f768t
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            p1.AbstractC0462a.P(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            k3.n r1 = r8.f765p
            java.lang.Object r6 = r8.f767r
            K.k r6 = (K.k) r6
            p1.AbstractC0462a.P(r9)
            goto L4f
        L28:
            p1.AbstractC0462a.P(r9)
            java.lang.Object r9 = r8.f767r
            K.k r9 = (K.k) r9
            I.a0 r1 = r4.h()
            r8.f767r = r9
            r8.f765p = r2
            r8.f766q = r6
            B2.r r1 = r1.f803b
            java.lang.Object r1 = r1.f185m
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r1)
            if (r6 != r0) goto L4b
            return r0
        L4b:
            r1 = r2
            r7 = r6
            r6 = r9
            r9 = r7
        L4f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.f7102l = r9
            r9 = 0
            r8.f767r = r9
            r8.f765p = r9
            r8.f766q = r5
            java.lang.Object r9 = r6.b(r3, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r9 = r8.f770v
            if (r9 == 0) goto L7d
            B2.r r9 = r4.s
            I.c r0 = new I.c
            if (r3 == 0) goto L74
            int r1 = r3.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r2 = r2.f7102l
            r0.<init>(r1, r2, r3)
            r9.n(r0)
        L7d:
            Z2.g r9 = Z2.g.f3186a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: I.P.k(java.lang.Object):java.lang.Object");
    }
}
