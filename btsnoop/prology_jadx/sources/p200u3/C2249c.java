package p200u3;

/* renamed from: u3.c */
/* loaded from: classes.dex */
public final class C2249c extends p205v3.AbstractC2290f {

    /* renamed from: o */
    public final p198u1.C2241i f8947o;

    /* renamed from: p */
    public final p198u1.C2241i f8948p;

    public C2249c(p198u1.C2241i c2241i, p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5) {
        super(interfaceC1195i, i4, i5);
        this.f8947o = c2241i;
        this.f8948p = c2241i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // p205v3.AbstractC2290f
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4445a(p195t3.InterfaceC2202o r6, p110b3.InterfaceC1190d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p200u3.C2248b
            if (r0 == 0) goto L13
            r0 = r7
            u3.b r0 = (p200u3.C2248b) r0
            int r1 = r0.f8946r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8946r = r1
            goto L1a
        L13:
            u3.b r0 = new u3.b
            d3.b r7 = (p120d3.AbstractC1292b) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f8944p
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f8946r
            Z2.g r3 = p100Z2.C0934g.f3298a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            t3.o r6 = r0.f8943o
            p176p1.AbstractC1949a.m3913P(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p176p1.AbstractC1949a.m3913P(r7)
            r0.f8943o = r6
            r0.f8946r = r4
            u1.i r7 = r5.f8947o
            java.lang.Object r7 = r7.mo502h(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            t3.n r6 = (p195t3.C2201n) r6
            t3.b r6 = r6.f8806o
            boolean r6 = r6.m4365s()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p200u3.C2249c.mo4445a(t3.o, b3.d):java.lang.Object");
    }

    @Override // p205v3.AbstractC2290f
    /* renamed from: b */
    public final p205v3.AbstractC2290f mo4446b(p110b3.InterfaceC1195i interfaceC1195i, int i4, int i5) {
        return new p200u3.C2249c(this.f8948p, interfaceC1195i, i4, i5);
    }

    @Override // p205v3.AbstractC2290f
    public final java.lang.String toString() {
        return "block[" + this.f8947o + "] -> " + super.toString();
    }
}
