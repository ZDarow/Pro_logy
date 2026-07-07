package p211x0;

/* renamed from: x0.a */
/* loaded from: classes.dex */
public final class C2367a extends p102a0.AbstractC0970e {

    /* renamed from: C */
    public final p098Z.C0921f f9323C;

    /* renamed from: D */
    public final p086W.C0798r f9324D;

    /* renamed from: E */
    public long f9325E;

    /* renamed from: F */
    public p102a0.C0942F f9326F;

    /* renamed from: G */
    public long f9327G;

    public C2367a() {
        super(6);
        this.f9323C = new p098Z.C0921f(1);
        this.f9324D = new p086W.C0798r();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: D */
    public final int mo1983D(p076T.C0702p c0702p) {
        return "application/x-camera-motion".equals(c0702p.f2408m) ? p102a0.AbstractC0970e.m1976f(4, 0, 0, 0) : p102a0.AbstractC0970e.m1976f(0, 0, 0, 0);
    }

    @Override // p102a0.AbstractC0970e, p102a0.InterfaceC0977h0
    /* renamed from: d */
    public final void mo1824d(int i4, java.lang.Object obj) {
        if (i4 == 8) {
            this.f9326F = (p102a0.C0942F) obj;
        }
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: l */
    public final java.lang.String mo1988l() {
        return "CameraMotionRenderer";
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: n */
    public final boolean mo1990n() {
        return m1989m();
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: p */
    public final boolean mo1991p() {
        return true;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: q */
    public final void mo1992q() {
        p102a0.C0942F c0942f = this.f9326F;
        if (c0942f != null) {
            c0942f.m1822b();
        }
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: s */
    public final void mo1994s(long j4, boolean z4) {
        this.f9327G = Long.MIN_VALUE;
        p102a0.C0942F c0942f = this.f9326F;
        if (c0942f != null) {
            c0942f.m1822b();
        }
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: x */
    public final void mo1999x(p076T.C0702p[] c0702pArr, long j4, long j5) {
        this.f9325E = j5;
    }

    @Override // p102a0.AbstractC0970e
    /* renamed from: z */
    public final void mo2001z(long j4, long j5) {
        float[] fArr;
        while (!m1989m() && this.f9327G < 100000 + j4) {
            p098Z.C0921f c0921f = this.f9323C;
            c0921f.mo1750e();
            p094Y.C0886x c0886x = this.f3541n;
            c0886x.m1710N();
            if (m2000y(c0886x, c0921f, 0) != -4 || c0921f.m1138c(4)) {
                return;
            }
            long j6 = c0921f.f3253r;
            this.f9327G = j6;
            boolean z4 = j6 < this.f3550w;
            if (this.f9326F != null && !z4) {
                c0921f.m1753i();
                java.nio.ByteBuffer byteBuffer = c0921f.f3251p;
                int i4 = p086W.AbstractC0805y.f2801a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] array = byteBuffer.array();
                    int limit = byteBuffer.limit();
                    p086W.C0798r c0798r = this.f9324D;
                    c0798r.m1535E(array, limit);
                    c0798r.m1537G(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i5 = 0; i5 < 3; i5++) {
                        fArr2[i5] = java.lang.Float.intBitsToFloat(c0798r.m1548j());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f9326F.m1821a(this.f9327G - this.f9325E, fArr);
                }
            }
        }
    }
}
