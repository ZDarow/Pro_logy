package d0;

import T.B;
import T.C0081b;
import T.C0102x;
import T.S;
import T.U;
import W.y;
import e0.C0251c;

/* loaded from: classes.dex */
public final class e extends U {

    /* renamed from: b, reason: collision with root package name */
    public final long f4838b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4839c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4840d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4841e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4842f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4843g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4844h;

    /* renamed from: i, reason: collision with root package name */
    public final C0251c f4845i;

    /* renamed from: j, reason: collision with root package name */
    public final B f4846j;

    /* renamed from: k, reason: collision with root package name */
    public final C0102x f4847k;

    public e(long j4, long j5, long j6, int i4, long j7, long j8, long j9, C0251c c0251c, B b4, C0102x c0102x) {
        W.a.j(c0251c.f5032d == (c0102x != null));
        this.f4838b = j4;
        this.f4839c = j5;
        this.f4840d = j6;
        this.f4841e = i4;
        this.f4842f = j7;
        this.f4843g = j8;
        this.f4844h = j9;
        this.f4845i = c0251c;
        this.f4846j = b4;
        this.f4847k = c0102x;
    }

    @Override // T.U
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f4841e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // T.U
    public final S f(int i4, S s, boolean z4) {
        W.a.g(i4, h());
        C0251c c0251c = this.f4845i;
        String str = z4 ? c0251c.b(i4).f5061a : null;
        Integer valueOf = z4 ? Integer.valueOf(this.f4841e + i4) : null;
        long d4 = c0251c.d(i4);
        long M3 = y.M(c0251c.b(i4).f5062b - c0251c.b(0).f5062b) - this.f4842f;
        s.getClass();
        s.h(str, valueOf, 0, d4, M3, C0081b.f2225c, false);
        return s;
    }

    @Override // T.U
    public final int h() {
        return this.f4845i.f5041m.size();
    }

    @Override // T.U
    public final Object l(int i4) {
        W.a.g(i4, h());
        return Integer.valueOf(this.f4841e + i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r7 > r21.f4843g) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    @Override // T.U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T.T m(int r22, T.T r23, long r24) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.e.m(int, T.T, long):T.T");
    }

    @Override // T.U
    public final int o() {
        return 1;
    }
}
