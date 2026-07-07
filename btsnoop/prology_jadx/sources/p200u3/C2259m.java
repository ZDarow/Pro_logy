package p200u3;

/* renamed from: u3.m */
/* loaded from: classes.dex */
public final class C2259m implements p200u3.InterfaceC2250d {

    /* renamed from: l */
    public final java.lang.Object f8980l;

    /* renamed from: m */
    public final java.lang.Object f8981m;

    public /* synthetic */ C2259m(java.lang.Object obj, java.lang.Object obj2) {
        this.f8980l = obj;
        this.f8981m = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // p200u3.InterfaceC2250d
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo266C(p200u3.InterfaceC2251e r6, p110b3.InterfaceC1190d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p200u3.C2258l
            if (r0 == 0) goto L13
            r0 = r7
            u3.l r0 = (p200u3.C2258l) r0
            int r1 = r0.f8977p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8977p = r1
            goto L18
        L13:
            u3.l r0 = new u3.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f8976o
            c3.a r1 = p115c3.EnumC1252a.f4880l
            int r2 = r0.f8977p
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            R2.n r6 = r0.f8979r
            p176p1.AbstractC1949a.m3913P(r7)     // Catch: p205v3.C2285a -> L29
            goto L54
        L29:
            r7 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            p176p1.AbstractC1949a.m3913P(r7)
            java.lang.Object r7 = r5.f8980l
            Y.x r7 = (p094Y.C0886x) r7
            R2.n r2 = new R2.n
            java.lang.Object r4 = r5.f8981m
            I.p r4 = (p035I.C0294p) r4
            r2.<init>(r4, r6)
            r0.f8979r = r2     // Catch: p205v3.C2285a -> L4e
            r0.f8977p = r3     // Catch: p205v3.C2285a -> L4e
            java.lang.Object r6 = r7.mo266C(r2, r0)     // Catch: p205v3.C2285a -> L4e
            if (r6 != r1) goto L54
            return r1
        L4e:
            r7 = move-exception
            r6 = r2
        L50:
            u3.e r0 = r7.f9065l
            if (r0 != r6) goto L57
        L54:
            Z2.g r6 = p100Z2.C0934g.f3298a
            return r6
        L57:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p200u3.C2259m.mo266C(u3.e, b3.d):java.lang.Object");
    }

    /* renamed from: a */
    public p215y0.InterfaceC2403o m4447a(java.lang.Object... objArr) {
        java.lang.reflect.Constructor m2737e;
        synchronized (((java.util.concurrent.atomic.AtomicBoolean) this.f8981m)) {
            if (!((java.util.concurrent.atomic.AtomicBoolean) this.f8981m).get()) {
                try {
                    m2737e = ((p107b0.C1169d) this.f8980l).m2737e();
                } catch (java.lang.ClassNotFoundException unused) {
                    ((java.util.concurrent.atomic.AtomicBoolean) this.f8981m).set(true);
                } catch (java.lang.Exception e4) {
                    throw new java.lang.RuntimeException("Error instantiating extension", e4);
                }
            }
            m2737e = null;
        }
        if (m2737e == null) {
            return null;
        }
        try {
            return (p215y0.InterfaceC2403o) m2737e.newInstance(objArr);
        } catch (java.lang.Exception e5) {
            throw new java.lang.IllegalStateException("Unexpected error creating extractor", e5);
        }
    }

    /* renamed from: b */
    public void m4448b(p219z.C2435f c2435f) {
        int i4 = c2435f.f9568b;
        p214y.ExecutorC2379a executorC2379a = (p214y.ExecutorC2379a) this.f8981m;
        p129f2.C1408Y c1408y = (p129f2.C1408Y) this.f8980l;
        if (i4 == 0) {
            executorC2379a.execute(new p054N1.RunnableC0462q(c1408y, c2435f.f9567a, 10, false));
        } else {
            executorC2379a.execute(new p024F.RunnableC0199b(c1408y, i4));
        }
    }

    public C2259m(p107b0.C1169d c1169d) {
        this.f8980l = c1169d;
        this.f8981m = new java.util.concurrent.atomic.AtomicBoolean(false);
    }
}
