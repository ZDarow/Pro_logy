package p083V0;

/* renamed from: V0.b */
/* loaded from: classes.dex */
public final class C0764b implements p083V0.InterfaceC0766d {

    /* renamed from: n */
    public static final p129f2.C1442q f2691n;

    /* renamed from: l */
    public final p129f2.AbstractC1393I f2692l;

    /* renamed from: m */
    public final long[] f2693m;

    static {
        p129f2.C1411a0 c1411a0 = p129f2.C1411a0.f5738l;
        p011C.C0111c c0111c = new p011C.C0111c(12);
        c1411a0.getClass();
        f2691n = new p129f2.C1442q(c0111c, c1411a0);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0764b(p129f2.C1415c0 r20) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p083V0.C0764b.<init>(f2.c0):void");
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: B */
    public final long mo654B(int i4) {
        p086W.AbstractC0781a.m1416e(i4 < this.f2692l.size());
        return this.f2693m[i4];
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: Q */
    public final int mo655Q() {
        return this.f2692l.size();
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: g */
    public final int mo657g(long j4) {
        int m1607b = p086W.AbstractC0805y.m1607b(this.f2693m, j4, false);
        if (m1607b < this.f2692l.size()) {
            return m1607b;
        }
        return -1;
    }

    @Override // p083V0.InterfaceC0766d
    /* renamed from: w */
    public final java.util.List mo658w(long j4) {
        int m1611f = p086W.AbstractC0805y.m1611f(this.f2693m, j4, false);
        return m1611f == -1 ? p129f2.AbstractC1393I.m3164m() : (p129f2.AbstractC1393I) this.f2692l.get(m1611f);
    }
}
