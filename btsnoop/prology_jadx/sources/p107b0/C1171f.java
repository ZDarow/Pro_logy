package p107b0;

/* renamed from: b0.f */
/* loaded from: classes.dex */
public final class C1171f {

    /* renamed from: a */
    public final java.lang.String f4506a;

    /* renamed from: b */
    public int f4507b;

    /* renamed from: c */
    public long f4508c;

    /* renamed from: d */
    public final p179q0.C1964F f4509d;

    /* renamed from: e */
    public boolean f4510e;

    /* renamed from: f */
    public boolean f4511f;

    /* renamed from: g */
    public final /* synthetic */ p107b0.C1172g f4512g;

    public C1171f(p107b0.C1172g c1172g, java.lang.String str, int i4, p179q0.C1964F c1964f) {
        this.f4512g = c1172g;
        this.f4506a = str;
        this.f4507b = i4;
        this.f4508c = c1964f == null ? -1L : c1964f.f7963d;
        if (c1964f == null || !c1964f.m3968b()) {
            return;
        }
        this.f4509d = c1964f;
    }

    /* renamed from: a */
    public final boolean m2745a(p107b0.C1166a c1166a) {
        p179q0.C1964F c1964f = c1166a.f4485d;
        if (c1964f == null) {
            return this.f4507b != c1166a.f4484c;
        }
        long j4 = this.f4508c;
        if (j4 == -1) {
            return false;
        }
        if (c1964f.f7963d > j4) {
            return true;
        }
        p179q0.C1964F c1964f2 = this.f4509d;
        if (c1964f2 == null) {
            return false;
        }
        p076T.AbstractC0677U abstractC0677U = c1166a.f4483b;
        int mo1231b = abstractC0677U.mo1231b(c1964f.f7960a);
        int mo1231b2 = abstractC0677U.mo1231b(c1964f2.f7960a);
        if (c1964f.f7963d < c1964f2.f7963d || mo1231b < mo1231b2) {
            return false;
        }
        if (mo1231b > mo1231b2) {
            return true;
        }
        boolean m3968b = c1964f.m3968b();
        int i4 = c1964f2.f7961b;
        if (!m3968b) {
            int i5 = c1964f.f7964e;
            return i5 == -1 || i5 > i4;
        }
        int i6 = c1964f.f7961b;
        if (i6 > i4) {
            return true;
        }
        if (i6 == i4) {
            if (c1964f.f7962c > c1964f2.f7962c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.mo1236o()) goto L15;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2746b(p076T.AbstractC0677U r7, p076T.AbstractC0677U r8) {
        /*
            r6 = this;
            int r0 = r6.f4507b
            int r1 = r7.mo1236o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r7 = r8.mo1236o()
            if (r0 >= r7) goto L36
            goto L37
        L11:
            b0.g r1 = r6.f4512g
            T.T r4 = r1.f4515a
            r7.m1255n(r0, r4)
            T.T r0 = r1.f4515a
            int r4 = r0.f2245n
        L1c:
            int r5 = r0.f2246o
            if (r4 > r5) goto L36
            java.lang.Object r5 = r7.mo1234l(r4)
            int r5 = r8.mo1231b(r5)
            if (r5 == r3) goto L33
            T.S r7 = r1.f4516b
            T.S r7 = r8.mo1232f(r5, r7, r2)
            int r0 = r7.f2225c
            goto L37
        L33:
            int r4 = r4 + 1
            goto L1c
        L36:
            r0 = r3
        L37:
            r6.f4507b = r0
            if (r0 != r3) goto L3c
            return r2
        L3c:
            q0.F r7 = r6.f4509d
            r0 = 1
            if (r7 != 0) goto L42
            return r0
        L42:
            java.lang.Object r7 = r7.f7960a
            int r7 = r8.mo1231b(r7)
            if (r7 == r3) goto L4b
            r2 = r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p107b0.C1171f.m2746b(T.U, T.U):boolean");
    }
}
