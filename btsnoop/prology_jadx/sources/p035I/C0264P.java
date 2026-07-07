package p035I;

/* renamed from: I.P */
/* loaded from: classes.dex */
public final class C0264P extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public p154k3.C1809n f784p;

    /* renamed from: q */
    public int f785q;

    /* renamed from: r */
    public /* synthetic */ java.lang.Object f786r;

    /* renamed from: s */
    public final /* synthetic */ p154k3.C1809n f787s;

    /* renamed from: t */
    public final /* synthetic */ p035I.C0265Q f788t;

    /* renamed from: u */
    public final /* synthetic */ java.lang.Object f789u;

    /* renamed from: v */
    public final /* synthetic */ boolean f790v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0264P(p154k3.C1809n c1809n, p035I.C0265Q c0265q, java.lang.Object obj, boolean z4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f787s = c1809n;
        this.f788t = c0265q;
        this.f789u = obj;
        this.f790v = z4;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0264P c0264p = new p035I.C0264P(this.f787s, this.f788t, this.f789u, this.f790v, interfaceC1190d);
        c0264p.f786r = obj;
        return c0264p;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        return ((p035I.C0264P) mo659g((p110b3.InterfaceC1190d) obj2, (p040K.C0321k) obj)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo660k(java.lang.Object r9) {
        /*
            r8 = this;
            c3.a r0 = p115c3.EnumC1252a.f4880l
            int r1 = r8.f785q
            k3.n r2 = r8.f787s
            java.lang.Object r3 = r8.f789u
            I.Q r4 = r8.f788t
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            p176p1.AbstractC1949a.m3913P(r9)
            goto L65
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            k3.n r1 = r8.f784p
            java.lang.Object r6 = r8.f786r
            K.k r6 = (p040K.C0321k) r6
            p176p1.AbstractC1949a.m3913P(r9)
            goto L4f
        L28:
            p176p1.AbstractC1949a.m3913P(r9)
            java.lang.Object r9 = r8.f786r
            K.k r9 = (p040K.C0321k) r9
            I.a0 r1 = r4.m669h()
            r8.f786r = r9
            r8.f784p = r2
            r8.f785q = r6
            B2.r r1 = r1.f828b
            java.lang.Object r1 = r1.f188m
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
            r1.f7372l = r9
            r9 = 0
            r8.f786r = r9
            r8.f784p = r9
            r8.f785q = r5
            java.lang.Object r9 = r6.m715b(r3, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            boolean r9 = r8.f790v
            if (r9 == 0) goto L7d
            B2.r r9 = r4.f798s
            I.c r0 = new I.c
            if (r3 == 0) goto L74
            int r1 = r3.hashCode()
            goto L75
        L74:
            r1 = 0
        L75:
            int r2 = r2.f7372l
            r0.<init>(r1, r2, r3)
            r9.m275n(r0)
        L7d:
            Z2.g r9 = p100Z2.C0934g.f3298a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0264P.mo660k(java.lang.Object):java.lang.Object");
    }
}
