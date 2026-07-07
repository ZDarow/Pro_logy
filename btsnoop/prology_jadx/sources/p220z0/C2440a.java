package p220z0;

/* renamed from: z0.a */
/* loaded from: classes.dex */
public final class C2440a implements p215y0.InterfaceC2403o {

    /* renamed from: p */
    public static final int[] f9579p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q */
    public static final int[] f9580q;

    /* renamed from: r */
    public static final byte[] f9581r;

    /* renamed from: s */
    public static final byte[] f9582s;

    /* renamed from: t */
    public static final int f9583t;

    /* renamed from: a */
    public final byte[] f9584a;

    /* renamed from: b */
    public final int f9585b;

    /* renamed from: c */
    public boolean f9586c;

    /* renamed from: d */
    public long f9587d;

    /* renamed from: e */
    public int f9588e;

    /* renamed from: f */
    public int f9589f;

    /* renamed from: g */
    public boolean f9590g;

    /* renamed from: h */
    public long f9591h;

    /* renamed from: i */
    public int f9592i;

    /* renamed from: j */
    public int f9593j;

    /* renamed from: k */
    public long f9594k;

    /* renamed from: l */
    public p215y0.InterfaceC2405q f9595l;

    /* renamed from: m */
    public p215y0.InterfaceC2387F f9596m;

    /* renamed from: n */
    public p215y0.InterfaceC2414z f9597n;

    /* renamed from: o */
    public boolean f9598o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f9580q = iArr;
        int i4 = p086W.AbstractC0805y.f2801a;
        java.nio.charset.Charset charset = p124e2.AbstractC1356d.f5630c;
        f9581r = "#!AMR\n".getBytes(charset);
        f9582s = "#!AMR-WB\n".getBytes(charset);
        f9583t = iArr[8];
    }

    public C2440a(int i4) {
        this.f9585b = (i4 & 2) != 0 ? i4 | 1 : i4;
        this.f9584a = new byte[1];
        this.f9592i = -1;
    }

    /* renamed from: a */
    public final int m4678a(p215y0.C2400l c2400l) {
        boolean z4;
        c2400l.f9452q = 0;
        byte[] bArr = this.f9584a;
        c2400l.mo634p(bArr, 0, 1, false);
        byte b4 = bArr[0];
        if ((b4 & 131) > 0) {
            throw p076T.C0666I.m1202a(null, "Invalid padding bits for frame header " + ((int) b4));
        }
        int i4 = (b4 >> 3) & 15;
        if (i4 >= 0 && i4 <= 15 && (((z4 = this.f9586c) && (i4 < 10 || i4 > 13)) || (!z4 && (i4 < 12 || i4 > 14)))) {
            return z4 ? f9580q[i4] : f9579p[i4];
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal AMR ");
        sb.append(this.f9586c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i4);
        throw p076T.C0666I.m1202a(null, sb.toString());
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: b */
    public final void mo34b(long j4, long j5) {
        this.f9587d = 0L;
        this.f9588e = 0;
        this.f9589f = 0;
        if (j4 != 0) {
            p215y0.InterfaceC2414z interfaceC2414z = this.f9597n;
            if (interfaceC2414z instanceof p215y0.C2399k) {
                this.f9594k = (java.lang.Math.max(0L, j4 - ((p215y0.C2399k) interfaceC2414z).f9441b) * 8000000) / r0.f9444e;
                return;
            }
        }
        this.f9594k = 0L;
    }

    /* renamed from: c */
    public final boolean m4679c(p215y0.C2400l c2400l) {
        c2400l.f9452q = 0;
        byte[] bArr = f9581r;
        byte[] bArr2 = new byte[bArr.length];
        c2400l.mo634p(bArr2, 0, bArr.length, false);
        if (java.util.Arrays.equals(bArr2, bArr)) {
            this.f9586c = false;
            c2400l.mo628e(bArr.length);
            return true;
        }
        c2400l.f9452q = 0;
        byte[] bArr3 = f9582s;
        byte[] bArr4 = new byte[bArr3.length];
        c2400l.mo634p(bArr4, 0, bArr3.length, false);
        if (!java.util.Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f9586c = true;
        c2400l.mo628e(bArr3.length);
        return true;
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: g */
    public final void mo35g(p215y0.InterfaceC2405q interfaceC2405q) {
        this.f9595l = interfaceC2405q;
        this.f9596m = interfaceC2405q.mo640v(0, 1);
        interfaceC2405q.mo637s();
    }

    @Override // p215y0.InterfaceC2403o
    /* renamed from: k */
    public final boolean mo36k(p215y0.InterfaceC2404p interfaceC2404p) {
        return m4679c((p215y0.C2400l) interfaceC2404p);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    @Override // p215y0.InterfaceC2403o
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo37l(p215y0.InterfaceC2404p r20, p076T.C0706t r21) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p220z0.C2440a.mo37l(y0.p, T.t):int");
    }

    @Override // p215y0.InterfaceC2403o
    public final void release() {
    }
}
