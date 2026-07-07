package p188s0;

/* renamed from: s0.b */
/* loaded from: classes.dex */
public final class C2137b implements p188s0.InterfaceC2136a {

    /* renamed from: b */
    public static final p129f2.C1385A f8510b;

    /* renamed from: a */
    public final java.util.ArrayList f8511a = new java.util.ArrayList();

    static {
        p129f2.C1411a0 c1411a0 = p129f2.C1411a0.f5738l;
        p107b0.C1169d c1169d = new p107b0.C1169d(20);
        c1411a0.getClass();
        p129f2.C1442q c1442q = new p129f2.C1442q(c1169d, c1411a0);
        p129f2.C1429j0 c1429j0 = p129f2.C1429j0.f5781l;
        p107b0.C1169d c1169d2 = new p107b0.C1169d(21);
        c1429j0.getClass();
        f8510b = new p129f2.C1385A(c1442q, new p129f2.C1442q(c1169d2, c1429j0));
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: a */
    public final p129f2.AbstractC1393I mo989a(long j4) {
        java.util.ArrayList arrayList = this.f8511a;
        if (!arrayList.isEmpty()) {
            if (j4 >= ((p083V0.C0763a) arrayList.get(0)).f2688b) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    p083V0.C0763a c0763a = (p083V0.C0763a) arrayList.get(i4);
                    if (j4 >= c0763a.f2688b && j4 < c0763a.f2690d) {
                        arrayList2.add(c0763a);
                    }
                    if (j4 < c0763a.f2688b) {
                        break;
                    }
                }
                p129f2.C1415c0 m3169r = p129f2.AbstractC1393I.m3169r(f8510b, arrayList2);
                p129f2.C1390F m3161i = p129f2.AbstractC1393I.m3161i();
                for (int i5 = 0; i5 < m3169r.size(); i5++) {
                    m3161i.m3148d(((p083V0.C0763a) m3169r.get(i5)).f2687a);
                }
                return m3161i.m3157g();
            }
        }
        return p129f2.AbstractC1393I.m3164m();
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: b */
    public final long mo990b(long j4) {
        java.util.ArrayList arrayList = this.f8511a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j4 < ((p083V0.C0763a) arrayList.get(0)).f2688b) {
            return -9223372036854775807L;
        }
        long j5 = ((p083V0.C0763a) arrayList.get(0)).f2688b;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            long j6 = ((p083V0.C0763a) arrayList.get(i4)).f2688b;
            long j7 = ((p083V0.C0763a) arrayList.get(i4)).f2690d;
            if (j7 > j4) {
                if (j6 > j4) {
                    break;
                }
                j5 = java.lang.Math.max(j5, j6);
            } else {
                j5 = java.lang.Math.max(j5, j7);
            }
        }
        return j5;
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: c */
    public final long mo991c(long j4) {
        int i4 = 0;
        long j5 = -9223372036854775807L;
        while (true) {
            java.util.ArrayList arrayList = this.f8511a;
            if (i4 >= arrayList.size()) {
                break;
            }
            long j6 = ((p083V0.C0763a) arrayList.get(i4)).f2688b;
            long j7 = ((p083V0.C0763a) arrayList.get(i4)).f2690d;
            if (j4 < j6) {
                j5 = j5 == -9223372036854775807L ? j6 : java.lang.Math.min(j5, j6);
            } else {
                if (j4 < j7) {
                    j5 = j5 == -9223372036854775807L ? j7 : java.lang.Math.min(j5, j7);
                }
                i4++;
            }
        }
        if (j5 != -9223372036854775807L) {
            return j5;
        }
        return Long.MIN_VALUE;
    }

    @Override // p188s0.InterfaceC2136a
    public final void clear() {
        this.f8511a.clear();
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: d */
    public final boolean mo992d(p083V0.C0763a c0763a, long j4) {
        long j5 = c0763a.f2688b;
        p086W.AbstractC0781a.m1416e(j5 != -9223372036854775807L);
        p086W.AbstractC0781a.m1416e(c0763a.f2689c != -9223372036854775807L);
        boolean z4 = j5 <= j4 && j4 < c0763a.f2690d;
        java.util.ArrayList arrayList = this.f8511a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j5 >= ((p083V0.C0763a) arrayList.get(size)).f2688b) {
                arrayList.add(size + 1, c0763a);
                return z4;
            }
        }
        arrayList.add(0, c0763a);
        return z4;
    }

    @Override // p188s0.InterfaceC2136a
    /* renamed from: e */
    public final void mo993e(long j4) {
        int i4 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f8511a;
            if (i4 >= arrayList.size()) {
                return;
            }
            long j5 = ((p083V0.C0763a) arrayList.get(i4)).f2688b;
            if (j4 > j5 && j4 > ((p083V0.C0763a) arrayList.get(i4)).f2690d) {
                arrayList.remove(i4);
                i4--;
            } else if (j4 < j5) {
                return;
            }
            i4++;
        }
    }
}
