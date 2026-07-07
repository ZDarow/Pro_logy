package p028G0;

/* renamed from: G0.c */
/* loaded from: classes.dex */
public final class C0235c implements p215y0.InterfaceC2404p, p215y0.InterfaceC2405q, p117d0.InterfaceC1264h {

    /* renamed from: l */
    public final /* synthetic */ int f683l;

    /* renamed from: m */
    public long f684m;

    /* renamed from: n */
    public java.lang.Object f685n;

    public /* synthetic */ C0235c(long j4, java.lang.Object obj, int i4) {
        this.f683l = i4;
        this.f684m = j4;
        this.f685n = obj;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: A */
    public void mo617A(int i4) {
        ((p215y0.C2400l) this.f685n).m4631a(i4, false);
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: B */
    public long mo618B() {
        return ((p215y0.C2400l) this.f685n).f9450o - this.f684m;
    }

    /* renamed from: C */
    public int m619C(int i4) {
        p028G0.C0235c c0235c = (p028G0.C0235c) this.f685n;
        if (c0235c == null) {
            return i4 >= 64 ? java.lang.Long.bitCount(this.f684m) : java.lang.Long.bitCount(this.f684m & ((1 << i4) - 1));
        }
        if (i4 < 64) {
            return java.lang.Long.bitCount(this.f684m & ((1 << i4) - 1));
        }
        return java.lang.Long.bitCount(this.f684m) + c0235c.m619C(i4 - 64);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: D */
    public long mo620D(long j4, long j5) {
        return -9223372036854775807L;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: E */
    public p122e0.C1309j mo621E(long j4) {
        return new p122e0.C1309j(((p215y0.C2398j) this.f685n).f9436c[(int) j4], r0.f9435b[r8], null);
    }

    /* renamed from: F */
    public boolean m622F(int i4) {
        if (i4 < 64) {
            return (this.f684m & (1 << i4)) != 0;
        }
        if (((p028G0.C0235c) this.f685n) == null) {
            this.f685n = new p028G0.C0235c(5);
        }
        return ((p028G0.C0235c) this.f685n).m622F(i4 - 64);
    }

    /* renamed from: G */
    public void m623G() {
        this.f684m = 0L;
        p028G0.C0235c c0235c = (p028G0.C0235c) this.f685n;
        if (c0235c != null) {
            c0235c.m623G();
        }
    }

    /* renamed from: H */
    public void m624H(java.lang.Exception exc) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (((java.lang.Exception) this.f685n) == null) {
            this.f685n = exc;
            this.f684m = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f684m) {
            java.lang.Exception exc2 = (java.lang.Exception) this.f685n;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            java.lang.Exception exc3 = (java.lang.Exception) this.f685n;
            this.f685n = null;
            throw exc3;
        }
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: a */
    public long mo625a(long j4) {
        return ((p215y0.C2398j) this.f685n).f9438e[(int) j4] - this.f684m;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: c */
    public long mo626c(long j4, long j5) {
        return p086W.AbstractC0805y.m1611f(((p215y0.C2398j) this.f685n).f9438e, j4 + this.f684m, true);
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: d */
    public void mo627d() {
        ((p215y0.C2400l) this.f685n).f9452q = 0;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: e */
    public void mo628e(int i4) {
        ((p215y0.C2400l) this.f685n).mo628e(i4);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: f */
    public boolean mo629f() {
        return true;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: i */
    public long mo630i(long j4, long j5) {
        return ((p215y0.C2398j) this.f685n).f9437d[(int) j4];
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: k */
    public boolean mo631k(byte[] bArr, int i4, int i5, boolean z4) {
        return ((p215y0.C2400l) this.f685n).mo631k(bArr, 0, i5, z4);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: l */
    public long mo632l() {
        return 0L;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: n */
    public long mo633n() {
        return ((p215y0.C2400l) this.f685n).f9449n - this.f684m;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: p */
    public boolean mo634p(byte[] bArr, int i4, int i5, boolean z4) {
        return ((p215y0.C2400l) this.f685n).mo634p(bArr, i4, i5, z4);
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: q */
    public long mo635q(long j4) {
        return ((p215y0.C2398j) this.f685n).f9434a;
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: r */
    public long mo636r(long j4, long j5) {
        return ((p215y0.C2398j) this.f685n).f9434a;
    }

    @Override // p076T.InterfaceC0696j
    public int read(byte[] bArr, int i4, int i5) {
        return ((p215y0.C2400l) this.f685n).read(bArr, i4, i5);
    }

    @Override // p215y0.InterfaceC2404p
    public void readFully(byte[] bArr, int i4, int i5) {
        ((p215y0.C2400l) this.f685n).mo631k(bArr, i4, i5, false);
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: s */
    public void mo637s() {
        ((p215y0.InterfaceC2405q) this.f685n).mo637s();
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: t */
    public void mo638t(p215y0.InterfaceC2414z interfaceC2414z) {
        ((p215y0.InterfaceC2405q) this.f685n).mo638t(new p028G0.C0236d(this, interfaceC2414z, interfaceC2414z));
    }

    public java.lang.String toString() {
        switch (this.f683l) {
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                if (((p028G0.C0235c) this.f685n) == null) {
                    return java.lang.Long.toBinaryString(this.f684m);
                }
                return ((p028G0.C0235c) this.f685n).toString() + "xx" + java.lang.Long.toBinaryString(this.f684m);
            default:
                return super.toString();
        }
    }

    @Override // p117d0.InterfaceC1264h
    /* renamed from: u */
    public long mo639u(long j4, long j5) {
        return 0L;
    }

    @Override // p215y0.InterfaceC2405q
    /* renamed from: v */
    public p215y0.InterfaceC2387F mo640v(int i4, int i5) {
        return ((p215y0.InterfaceC2405q) this.f685n).mo640v(i4, i5);
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: w */
    public long mo641w() {
        return ((p215y0.C2400l) this.f685n).mo641w() - this.f684m;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: z */
    public void mo642z(byte[] bArr, int i4, int i5) {
        ((p215y0.C2400l) this.f685n).mo634p(bArr, i4, i5, false);
    }

    public /* synthetic */ C0235c(java.lang.Object obj, long j4, int i4) {
        this.f683l = i4;
        this.f685n = obj;
        this.f684m = j4;
    }

    public C0235c(p215y0.C2400l c2400l, long j4) {
        this.f683l = 1;
        this.f685n = c2400l;
        p086W.AbstractC0781a.m1416e(c2400l.f9450o >= j4);
        this.f684m = j4;
    }

    public C0235c(int i4) {
        this.f683l = i4;
        switch (i4) {
            case p044L.C0353k.STRING_FIELD_NUMBER /* 5 */:
                this.f684m = 0L;
                return;
            default:
                return;
        }
    }
}
