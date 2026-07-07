package p035I;

/* renamed from: I.G */
/* loaded from: classes.dex */
public final class C0255G extends p120d3.AbstractC1297g implements p149j3.InterfaceC1741p {

    /* renamed from: p */
    public java.lang.Object f754p;

    /* renamed from: q */
    public int f755q;

    /* renamed from: r */
    public /* synthetic */ boolean f756r;

    /* renamed from: s */
    public final /* synthetic */ p035I.C0265Q f757s;

    /* renamed from: t */
    public final /* synthetic */ int f758t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0255G(p035I.C0265Q c0265q, int i4, p110b3.InterfaceC1190d interfaceC1190d) {
        super(2, interfaceC1190d);
        this.f757s = c0265q;
        this.f758t = i4;
    }

    @Override // p120d3.AbstractC1292b
    /* renamed from: g */
    public final p110b3.InterfaceC1190d mo659g(p110b3.InterfaceC1190d interfaceC1190d, java.lang.Object obj) {
        p035I.C0255G c0255g = new p035I.C0255G(this.f757s, this.f758t, interfaceC1190d);
        c0255g.f756r = ((java.lang.Boolean) obj).booleanValue();
        return c0255g;
    }

    @Override // p149j3.InterfaceC1741p
    /* renamed from: h */
    public final java.lang.Object mo502h(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        bool.booleanValue();
        return ((p035I.C0255G) mo659g((p110b3.InterfaceC1190d) obj2, bool)).mo660k(p100Z2.C0934g.f3298a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // p120d3.AbstractC1292b
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo660k(java.lang.Object r7) {
        /*
            r6 = this;
            c3.a r0 = p115c3.EnumC1252a.f4880l
            int r1 = r6.f755q
            I.Q r2 = r6.f757s
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f754p
            p176p1.AbstractC1949a.m3913P(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f756r
            p176p1.AbstractC1949a.m3913P(r7)
            goto L32
        L22:
            p176p1.AbstractC1949a.m3913P(r7)
            boolean r1 = r6.f756r
            r6.f756r = r1
            r6.f755q = r4
            java.lang.Object r7 = r2.m671j(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            I.a0 r1 = r2.m669h()
            r6.f754p = r7
            r6.f755q = r3
            java.lang.Integer r1 = r1.m673a()
            if (r1 != r0) goto L43
            return r0
        L43:
            r0 = r7
            r7 = r1
        L45:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            goto L51
        L4c:
            int r0 = r6.f758t
            r5 = r0
            r0 = r7
            r7 = r5
        L51:
            I.c r1 = new I.c
            if (r0 == 0) goto L5a
            int r2 = r0.hashCode()
            goto L5b
        L5a:
            r2 = 0
        L5b:
            r1.<init>(r2, r7, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p035I.C0255G.mo660k(java.lang.Object):java.lang.Object");
    }
}
