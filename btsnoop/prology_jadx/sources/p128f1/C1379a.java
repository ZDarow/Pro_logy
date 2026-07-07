package p128f1;

/* renamed from: f1.a */
/* loaded from: classes.dex */
public final class C1379a implements p128f1.InterfaceC1380b {

    /* renamed from: m */
    public static final int[] f5654m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    public static final int[] f5655n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    public final p215y0.InterfaceC2405q f5656a;

    /* renamed from: b */
    public final p215y0.InterfaceC2387F f5657b;

    /* renamed from: c */
    public final p073S0.C0631i f5658c;

    /* renamed from: d */
    public final int f5659d;

    /* renamed from: e */
    public final byte[] f5660e;

    /* renamed from: f */
    public final p086W.C0798r f5661f;

    /* renamed from: g */
    public final int f5662g;

    /* renamed from: h */
    public final p076T.C0702p f5663h;

    /* renamed from: i */
    public int f5664i;

    /* renamed from: j */
    public long f5665j;

    /* renamed from: k */
    public int f5666k;

    /* renamed from: l */
    public long f5667l;

    public C1379a(p215y0.InterfaceC2405q interfaceC2405q, p215y0.InterfaceC2387F interfaceC2387F, p073S0.C0631i c0631i) {
        this.f5656a = interfaceC2405q;
        this.f5657b = interfaceC2387F;
        this.f5658c = c0631i;
        int i4 = c0631i.f1979b;
        int max = java.lang.Math.max(1, i4 / 10);
        this.f5662g = max;
        p086W.C0798r c0798r = new p086W.C0798r((byte[]) c0631i.f1982e);
        c0798r.m1552n();
        int m1552n = c0798r.m1552n();
        this.f5659d = m1552n;
        int i5 = c0631i.f1978a;
        int i6 = c0631i.f1980c;
        int i7 = (((i6 - (i5 * 4)) * 8) / (c0631i.f1981d * i5)) + 1;
        if (m1552n != i7) {
            throw p076T.C0666I.m1202a(null, "Expected frames per block: " + i7 + "; got: " + m1552n);
        }
        int m1612g = p086W.AbstractC0805y.m1612g(max, m1552n);
        this.f5660e = new byte[m1612g * i6];
        this.f5661f = new p086W.C0798r(m1552n * 2 * i5 * m1612g);
        int i8 = ((i6 * i4) * 8) / m1552n;
        p076T.C0701o c0701o = new p076T.C0701o();
        c0701o.f2370l = p076T.AbstractC0665H.m1201l("audio/raw");
        c0701o.f2365g = i8;
        c0701o.f2366h = i8;
        c0701o.f2371m = max * 2 * i5;
        c0701o.f2384z = i5;
        c0701o.f2350A = i4;
        c0701o.f2351B = 2;
        this.f5663h = new p076T.C0702p(c0701o);
    }

    @Override // p128f1.InterfaceC1380b
    /* renamed from: a */
    public final void mo3135a(long j4) {
        this.f5664i = 0;
        this.f5665j = j4;
        this.f5666k = 0;
        this.f5667l = 0L;
    }

    @Override // p128f1.InterfaceC1380b
    /* renamed from: b */
    public final void mo3136b(long j4, int i4) {
        this.f5656a.mo638t(new p128f1.C1384f(this.f5658c, this.f5659d, i4, j4));
        this.f5657b.mo1407c(this.f5663h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:50:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:5:0x0023->B:11:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x003c -> B:3:0x0020). Please report as a decompilation issue!!! */
    @Override // p128f1.InterfaceC1380b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo3137c(p215y0.C2400l r26, long r27) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p128f1.C1379a.mo3137c(y0.l, long):boolean");
    }

    /* renamed from: d */
    public final void m3138d(int i4) {
        long j4 = this.f5665j;
        long j5 = this.f5667l;
        p073S0.C0631i c0631i = this.f5658c;
        long j6 = c0631i.f1979b;
        int i5 = p086W.AbstractC0805y.f2801a;
        long m1600U = j4 + p086W.AbstractC0805y.m1600U(j5, 1000000L, j6, java.math.RoundingMode.FLOOR);
        int i6 = i4 * 2 * c0631i.f1978a;
        this.f5657b.mo1406b(m1600U, 1, i6, this.f5666k - i6, null);
        this.f5667l += i4;
        this.f5666k -= i6;
    }
}
