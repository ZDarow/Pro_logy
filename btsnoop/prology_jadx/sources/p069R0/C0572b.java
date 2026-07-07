package p069R0;

/* renamed from: R0.b */
/* loaded from: classes.dex */
public final class C0572b implements p069R0.InterfaceC0576f {

    /* renamed from: a */
    public final long f1775a;

    /* renamed from: b */
    public final p006B.C0020c f1776b;

    /* renamed from: c */
    public final p006B.C0020c f1777c;

    /* renamed from: d */
    public final int f1778d;

    /* renamed from: e */
    public long f1779e;

    public C0572b(long j4, long j5, long j6) {
        this.f1779e = j4;
        this.f1775a = j6;
        p006B.C0020c c0020c = new p006B.C0020c(4, false);
        this.f1776b = c0020c;
        p006B.C0020c c0020c2 = new p006B.C0020c(4, false);
        this.f1777c = c0020c2;
        c0020c.m53e(0L);
        c0020c2.m53e(j5);
        int i4 = -2147483647;
        if (j4 == -9223372036854775807L) {
            this.f1778d = -2147483647;
            return;
        }
        long m1600U = p086W.AbstractC0805y.m1600U(j5 - j6, 8L, j4, java.math.RoundingMode.HALF_UP);
        if (m1600U > 0 && m1600U <= 2147483647L) {
            i4 = (int) m1600U;
        }
        this.f1778d = i4;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: a */
    public final long mo1092a(long j4) {
        return this.f1776b.m55g(p086W.AbstractC0805y.m1608c(this.f1777c, j4));
    }

    /* renamed from: b */
    public final boolean m1095b(long j4) {
        p006B.C0020c c0020c = this.f1776b;
        return j4 - c0020c.m55g(c0020c.f87l - 1) < 100000;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: c */
    public final boolean mo31c() {
        return true;
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: e */
    public final long mo1093e() {
        return this.f1775a;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: f */
    public final p215y0.C2413y mo32f(long j4) {
        p006B.C0020c c0020c = this.f1776b;
        int m1608c = p086W.AbstractC0805y.m1608c(c0020c, j4);
        long m55g = c0020c.m55g(m1608c);
        p006B.C0020c c0020c2 = this.f1777c;
        p215y0.C2382A c2382a = new p215y0.C2382A(m55g, c0020c2.m55g(m1608c));
        if (m55g == j4 || m1608c == c0020c.f87l - 1) {
            return new p215y0.C2413y(c2382a, c2382a);
        }
        int i4 = m1608c + 1;
        return new p215y0.C2413y(c2382a, new p215y0.C2382A(c0020c.m55g(i4), c0020c2.m55g(i4)));
    }

    @Override // p069R0.InterfaceC0576f
    /* renamed from: h */
    public final int mo1094h() {
        return this.f1778d;
    }

    @Override // p215y0.InterfaceC2414z
    /* renamed from: i */
    public final long mo33i() {
        return this.f1779e;
    }
}
