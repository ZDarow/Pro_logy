package I;

import b3.InterfaceC0190d;

/* loaded from: classes.dex */
public final class G extends d3.g implements j3.p {

    /* renamed from: p, reason: collision with root package name */
    public Object f738p;

    /* renamed from: q, reason: collision with root package name */
    public int f739q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f740r;
    public final /* synthetic */ Q s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f741t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Q q4, int i4, InterfaceC0190d interfaceC0190d) {
        super(2, interfaceC0190d);
        this.s = q4;
        this.f741t = i4;
    }

    @Override // d3.b
    public final InterfaceC0190d g(InterfaceC0190d interfaceC0190d, Object obj) {
        G g4 = new G(this.s, this.f741t, interfaceC0190d);
        g4.f740r = ((Boolean) obj).booleanValue();
        return g4;
    }

    @Override // j3.p
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) g((InterfaceC0190d) obj2, bool)).k(Z2.g.f3186a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // d3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r7) {
        /*
            r6 = this;
            c3.a r0 = c3.EnumC0225a.f4710l
            int r1 = r6.f739q
            I.Q r2 = r6.s
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r6.f738p
            p1.AbstractC0462a.P(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            boolean r1 = r6.f740r
            p1.AbstractC0462a.P(r7)
            goto L32
        L22:
            p1.AbstractC0462a.P(r7)
            boolean r1 = r6.f740r
            r6.f740r = r1
            r6.f739q = r4
            java.lang.Object r7 = r2.j(r6)
            if (r7 != r0) goto L32
            return r0
        L32:
            if (r1 == 0) goto L4c
            I.a0 r1 = r2.h()
            r6.f738p = r7
            r6.f739q = r3
            java.lang.Integer r1 = r1.a()
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
            int r0 = r6.f741t
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
        throw new UnsupportedOperationException("Method not decompiled: I.G.k(java.lang.Object):java.lang.Object");
    }
}
