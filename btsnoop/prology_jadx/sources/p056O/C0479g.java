package p056O;

/* renamed from: O.g */
/* loaded from: classes.dex */
public final class C0479g implements p188s0.InterfaceC2136a {

    /* renamed from: a */
    public java.util.ArrayList f1395a;

    public C0479g(int i4) {
        switch (i4) {
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f1395a = new java.util.ArrayList();
                return;
            default:
                this.f1395a = new java.util.ArrayList();
                new java.util.HashMap();
                new java.util.HashMap();
                return;
        }
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: a */
    public p129f2.AbstractC1393I mo989a(long j4) {
        int m995g = m995g(j4);
        if (m995g == 0) {
            p129f2.C1391G c1391g = p129f2.AbstractC1393I.f5704m;
            return p129f2.C1415c0.f5744p;
        }
        p083V0.C0763a c0763a = (p083V0.C0763a) this.f1395a.get(m995g - 1);
        long j5 = c0763a.f2690d;
        if (j5 == -9223372036854775807L || j4 < j5) {
            return c0763a.f2687a;
        }
        p129f2.C1391G c1391g2 = p129f2.AbstractC1393I.f5704m;
        return p129f2.C1415c0.f5744p;
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: b */
    public long mo990b(long j4) {
        java.util.ArrayList arrayList = this.f1395a;
        if (arrayList.isEmpty() || j4 < ((p083V0.C0763a) arrayList.get(0)).f2688b) {
            return -9223372036854775807L;
        }
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            long j5 = ((p083V0.C0763a) arrayList.get(i4)).f2688b;
            if (j4 == j5) {
                return j5;
            }
            if (j4 < j5) {
                p083V0.C0763a c0763a = (p083V0.C0763a) arrayList.get(i4 - 1);
                long j6 = c0763a.f2690d;
                return (j6 == -9223372036854775807L || j6 > j4) ? c0763a.f2688b : j6;
            }
        }
        p083V0.C0763a c0763a2 = (p083V0.C0763a) p129f2.AbstractC1444r.m3232l(arrayList);
        long j7 = c0763a2.f2690d;
        return (j7 == -9223372036854775807L || j4 < j7) ? c0763a2.f2688b : j7;
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: c */
    public long mo991c(long j4) {
        java.util.ArrayList arrayList = this.f1395a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j4 < ((p083V0.C0763a) arrayList.get(0)).f2688b) {
            return ((p083V0.C0763a) arrayList.get(0)).f2688b;
        }
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            p083V0.C0763a c0763a = (p083V0.C0763a) arrayList.get(i4);
            if (j4 < c0763a.f2688b) {
                long j5 = ((p083V0.C0763a) arrayList.get(i4 - 1)).f2690d;
                long j6 = c0763a.f2688b;
                return (j5 == -9223372036854775807L || j5 <= j4 || j5 >= j6) ? j6 : j5;
            }
        }
        long j7 = ((p083V0.C0763a) p129f2.AbstractC1444r.m3232l(arrayList)).f2690d;
        if (j7 == -9223372036854775807L || j4 >= j7) {
            return Long.MIN_VALUE;
        }
        return j7;
    }

    @Override // p188s0.InterfaceC2136a
    public void clear() {
        this.f1395a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // p188s0.InterfaceC2136a
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo992d(p083V0.C0763a r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f2688b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto Lf
            r4 = r6
            goto L10
        Lf:
            r4 = r5
        L10:
            p086W.AbstractC0781a.m1416e(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L23
            long r7 = r10.f2690d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L23
        L21:
            r2 = r6
            goto L24
        L23:
            r2 = r5
        L24:
            java.util.ArrayList r3 = r9.f1395a
            int r4 = r3.size()
            int r4 = r4 - r6
        L2b:
            if (r4 < 0) goto L4e
            java.lang.Object r7 = r3.get(r4)
            V0.a r7 = (p083V0.C0763a) r7
            long r7 = r7.f2688b
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 < 0) goto L3e
            int r4 = r4 + r6
            r3.add(r4, r10)
            return r2
        L3e:
            java.lang.Object r7 = r3.get(r4)
            V0.a r7 = (p083V0.C0763a) r7
            long r7 = r7.f2688b
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 > 0) goto L4b
            r2 = r5
        L4b:
            int r4 = r4 + (-1)
            goto L2b
        L4e:
            r3.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p056O.C0479g.mo992d(V0.a, long):boolean");
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: e */
    public void mo993e(long j4) {
        int m995g = m995g(j4);
        if (m995g > 0) {
            this.f1395a.subList(0, m995g).clear();
        }
    }

    /* renamed from: f */
    public java.util.List m994f() {
        java.util.ArrayList arrayList;
        if (this.f1395a.isEmpty()) {
            return java.util.Collections.emptyList();
        }
        synchronized (this.f1395a) {
            arrayList = new java.util.ArrayList(this.f1395a);
        }
        return arrayList;
    }

    /* renamed from: g */
    public int m995g(long j4) {
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f1395a;
            if (i4 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j4 < ((p083V0.C0763a) arrayList.get(i4)).f2688b) {
                return i4;
            }
            i4++;
        }
    }
}
