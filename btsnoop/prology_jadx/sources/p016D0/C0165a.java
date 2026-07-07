package p016D0;

/* renamed from: D0.a */
/* loaded from: classes.dex */
public final class C0165a implements p215y0.InterfaceC2397i {

    /* renamed from: l */
    public final p215y0.C2407s f426l;

    /* renamed from: m */
    public final int f427m;

    /* renamed from: n */
    public final p076T.C0706t f428n = new java.lang.Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, T.t] */
    public C0165a(p215y0.C2407s c2407s, int i4) {
        this.f426l = c2407s;
        this.f427m = i4;
    }

    @Override // p215y0.InterfaceC2397i
    /* renamed from: B */
    public final p215y0.C2396h mo523B(p215y0.C2400l c2400l, long j4) {
        long j5 = c2400l.f9450o;
        long m524a = m524a(c2400l);
        long mo641w = c2400l.mo641w();
        c2400l.m4631a(java.lang.Math.max(6, this.f426l.f9468c), false);
        long m524a2 = m524a(c2400l);
        return (m524a > j4 || m524a2 <= j4) ? m524a2 <= j4 ? new p215y0.C2396h(-2, m524a2, c2400l.mo641w()) : new p215y0.C2396h(-1, m524a, j5) : new p215y0.C2396h(0, -9223372036854775807L, mo641w);
    }

    /* renamed from: a */
    public final long m524a(p215y0.C2400l c2400l) {
        long j4;
        p076T.C0706t c0706t;
        p215y0.C2407s c2407s;
        boolean m4609d;
        int m4633f;
        while (true) {
            long mo641w = c2400l.mo641w();
            j4 = c2400l.f9449n;
            long j5 = j4 - 6;
            c0706t = this.f428n;
            c2407s = this.f426l;
            if (mo641w >= j5) {
                break;
            }
            long mo641w2 = c2400l.mo641w();
            byte[] bArr = new byte[2];
            c2400l.mo634p(bArr, 0, 2, false);
            int i4 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i5 = this.f427m;
            if (i4 != i5) {
                c2400l.f9452q = 0;
                c2400l.m4631a((int) (mo641w2 - c2400l.f9450o), false);
                m4609d = false;
            } else {
                p086W.C0798r c0798r = new p086W.C0798r(16);
                java.lang.System.arraycopy(bArr, 0, c0798r.f2786a, 0, 2);
                byte[] bArr2 = c0798r.f2786a;
                int i6 = 0;
                for (int i7 = 2; i6 < 14 && (m4633f = c2400l.m4633f(bArr2, i7 + i6, 14 - i6)) != -1; i7 = 2) {
                    i6 += m4633f;
                }
                c0798r.m1536F(i6);
                c2400l.f9452q = 0;
                c2400l.m4631a((int) (mo641w2 - c2400l.f9450o), false);
                m4609d = p215y0.AbstractC2390b.m4609d(c0798r, c2407s, i5, c0706t);
            }
            if (m4609d) {
                break;
            }
            c2400l.m4631a(1, false);
        }
        if (c2400l.mo641w() < j4 - 6) {
            return c0706t.f2437a;
        }
        c2400l.m4631a((int) (j4 - c2400l.mo641w()), false);
        return c2407s.f9475j;
    }
}
