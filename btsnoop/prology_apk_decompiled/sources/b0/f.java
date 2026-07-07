package b0;

import T.U;
import q0.F;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4349a;

    /* renamed from: b, reason: collision with root package name */
    public int f4350b;

    /* renamed from: c, reason: collision with root package name */
    public long f4351c;

    /* renamed from: d, reason: collision with root package name */
    public final F f4352d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4353e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f4355g;

    public f(g gVar, String str, int i4, F f4) {
        this.f4355g = gVar;
        this.f4349a = str;
        this.f4350b = i4;
        this.f4351c = f4 == null ? -1L : f4.f7671d;
        if (f4 == null || !f4.b()) {
            return;
        }
        this.f4352d = f4;
    }

    public final boolean a(C0177a c0177a) {
        F f4 = c0177a.f4329d;
        if (f4 == null) {
            return this.f4350b != c0177a.f4328c;
        }
        long j4 = this.f4351c;
        if (j4 == -1) {
            return false;
        }
        if (f4.f7671d > j4) {
            return true;
        }
        F f5 = this.f4352d;
        if (f5 == null) {
            return false;
        }
        U u4 = c0177a.f4327b;
        int b4 = u4.b(f4.f7668a);
        int b5 = u4.b(f5.f7668a);
        if (f4.f7671d < f5.f7671d || b4 < b5) {
            return false;
        }
        if (b4 > b5) {
            return true;
        }
        boolean b6 = f4.b();
        int i4 = f5.f7669b;
        if (!b6) {
            int i5 = f4.f7672e;
            return i5 == -1 || i5 > i4;
        }
        int i6 = f4.f7669b;
        if (i6 > i4) {
            return true;
        }
        if (i6 == i4) {
            if (f4.f7670c > f5.f7670c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 < r8.o()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(T.U r7, T.U r8) {
        /*
            r6 = this;
            int r0 = r6.f4350b
            int r1 = r7.o()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L11
            int r7 = r8.o()
            if (r0 >= r7) goto L36
            goto L37
        L11:
            b0.g r1 = r6.f4355g
            T.T r4 = r1.f4358a
            r7.n(r0, r4)
            T.T r0 = r1.f4358a
            int r4 = r0.f2165n
        L1c:
            int r5 = r0.f2166o
            if (r4 > r5) goto L36
            java.lang.Object r5 = r7.l(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L33
            T.S r7 = r1.f4359b
            T.S r7 = r8.f(r5, r7, r2)
            int r0 = r7.f2145c
            goto L37
        L33:
            int r4 = r4 + 1
            goto L1c
        L36:
            r0 = r3
        L37:
            r6.f4350b = r0
            if (r0 != r3) goto L3c
            return r2
        L3c:
            q0.F r7 = r6.f4352d
            r0 = 1
            if (r7 != 0) goto L42
            return r0
        L42:
            java.lang.Object r7 = r7.f7668a
            int r7 = r8.b(r7)
            if (r7 == r3) goto L4b
            r2 = r0
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.b(T.U, T.U):boolean");
    }
}
