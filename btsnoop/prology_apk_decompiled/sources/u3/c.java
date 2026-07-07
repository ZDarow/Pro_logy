package u3;

import b3.InterfaceC0195i;

/* loaded from: classes.dex */
public final class c extends v3.f {

    /* renamed from: o, reason: collision with root package name */
    public final u1.i f8603o;

    /* renamed from: p, reason: collision with root package name */
    public final u1.i f8604p;

    public c(u1.i iVar, InterfaceC0195i interfaceC0195i, int i4, int i5) {
        super(interfaceC0195i, i4, i5);
        this.f8603o = iVar;
        this.f8604p = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // v3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(t3.o r6, b3.InterfaceC0190d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof u3.b
            if (r0 == 0) goto L13
            r0 = r7
            u3.b r0 = (u3.b) r0
            int r1 = r0.f8602r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8602r = r1
            goto L1a
        L13:
            u3.b r0 = new u3.b
            d3.b r7 = (d3.b) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f8600p
            c3.a r1 = c3.EnumC0225a.f4710l
            int r2 = r0.f8602r
            Z2.g r3 = Z2.g.f3186a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            t3.o r6 = r0.f8599o
            p1.AbstractC0462a.P(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            p1.AbstractC0462a.P(r7)
            r0.f8599o = r6
            r0.f8602r = r4
            u1.i r7 = r5.f8603o
            java.lang.Object r7 = r7.h(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            t3.n r6 = (t3.n) r6
            t3.b r6 = r6.f8468o
            boolean r6 = r6.s()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.c.a(t3.o, b3.d):java.lang.Object");
    }

    @Override // v3.f
    public final v3.f b(InterfaceC0195i interfaceC0195i, int i4, int i5) {
        return new c(this.f8604p, interfaceC0195i, i4, i5);
    }

    @Override // v3.f
    public final String toString() {
        return "block[" + this.f8603o + "] -> " + super.toString();
    }
}
