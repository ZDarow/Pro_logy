package p215y0;

/* renamed from: y0.l */
/* loaded from: classes.dex */
public final class C2400l implements p215y0.InterfaceC2404p {

    /* renamed from: m */
    public final p076T.InterfaceC0696j f9448m;

    /* renamed from: n */
    public final long f9449n;

    /* renamed from: o */
    public long f9450o;

    /* renamed from: q */
    public int f9452q;

    /* renamed from: r */
    public int f9453r;

    /* renamed from: p */
    public byte[] f9451p = new byte[65536];

    /* renamed from: l */
    public final byte[] f9447l = new byte[4096];

    static {
        p076T.AbstractC0660C.m1179a("media3.extractor");
    }

    public C2400l(p076T.InterfaceC0696j interfaceC0696j, long j4, long j5) {
        this.f9448m = interfaceC0696j;
        this.f9450o = j4;
        this.f9449n = j5;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: A */
    public final void mo617A(int i4) {
        m4631a(i4, false);
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: B */
    public final long mo618B() {
        return this.f9450o;
    }

    /* renamed from: a */
    public final boolean m4631a(int i4, boolean z4) {
        m4632c(i4);
        int i5 = this.f9453r - this.f9452q;
        while (i5 < i4) {
            i5 = m4634i(this.f9451p, this.f9452q, i4, i5, z4);
            if (i5 == -1) {
                return false;
            }
            this.f9453r = this.f9452q + i5;
        }
        this.f9452q += i4;
        return true;
    }

    /* renamed from: c */
    public final void m4632c(int i4) {
        int i5 = this.f9452q + i4;
        byte[] bArr = this.f9451p;
        if (i5 > bArr.length) {
            this.f9451p = java.util.Arrays.copyOf(this.f9451p, p086W.AbstractC0805y.m1615j(bArr.length * 2, 65536 + i5, i5 + 524288));
        }
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: d */
    public final void mo627d() {
        this.f9452q = 0;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: e */
    public final void mo628e(int i4) {
        int min = java.lang.Math.min(this.f9453r, i4);
        m4636q(min);
        int i5 = min;
        while (i5 < i4 && i5 != -1) {
            byte[] bArr = this.f9447l;
            i5 = m4634i(bArr, -i5, java.lang.Math.min(i4, bArr.length + i5), i5, false);
        }
        if (i5 != -1) {
            this.f9450o += i5;
        }
    }

    /* renamed from: f */
    public final int m4633f(byte[] bArr, int i4, int i5) {
        int min;
        m4632c(i5);
        int i6 = this.f9453r;
        int i7 = this.f9452q;
        int i8 = i6 - i7;
        if (i8 == 0) {
            min = m4634i(this.f9451p, i7, i5, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f9453r += min;
        } else {
            min = java.lang.Math.min(i5, i8);
        }
        java.lang.System.arraycopy(this.f9451p, this.f9452q, bArr, i4, min);
        this.f9452q += min;
        return min;
    }

    /* renamed from: i */
    public final int m4634i(byte[] bArr, int i4, int i5, int i6, boolean z4) {
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException();
        }
        int read = this.f9448m.read(bArr, i4 + i6, i5 - i6);
        if (read != -1) {
            return i6 + read;
        }
        if (i6 == 0 && z4) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: k */
    public final boolean mo631k(byte[] bArr, int i4, int i5, boolean z4) {
        int min;
        int i6 = this.f9453r;
        if (i6 == 0) {
            min = 0;
        } else {
            min = java.lang.Math.min(i6, i5);
            java.lang.System.arraycopy(this.f9451p, 0, bArr, i4, min);
            m4636q(min);
        }
        int i7 = min;
        while (i7 < i5 && i7 != -1) {
            i7 = m4634i(bArr, i4, i5, i7, z4);
        }
        if (i7 != -1) {
            this.f9450o += i7;
        }
        return i7 != -1;
    }

    /* renamed from: l */
    public final int m4635l(int i4) {
        int min = java.lang.Math.min(this.f9453r, i4);
        m4636q(min);
        if (min == 0) {
            byte[] bArr = this.f9447l;
            min = m4634i(bArr, 0, java.lang.Math.min(i4, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f9450o += min;
        }
        return min;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: n */
    public final long mo633n() {
        return this.f9449n;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: p */
    public final boolean mo634p(byte[] bArr, int i4, int i5, boolean z4) {
        if (!m4631a(i5, z4)) {
            return false;
        }
        java.lang.System.arraycopy(this.f9451p, this.f9452q - i5, bArr, i4, i5);
        return true;
    }

    /* renamed from: q */
    public final void m4636q(int i4) {
        int i5 = this.f9453r - i4;
        this.f9453r = i5;
        this.f9452q = 0;
        byte[] bArr = this.f9451p;
        byte[] bArr2 = i5 < bArr.length - 524288 ? new byte[65536 + i5] : bArr;
        java.lang.System.arraycopy(bArr, i4, bArr2, 0, i5);
        this.f9451p = bArr2;
    }

    @Override // p076T.InterfaceC0696j
    public final int read(byte[] bArr, int i4, int i5) {
        int i6 = this.f9453r;
        int i7 = 0;
        if (i6 != 0) {
            int min = java.lang.Math.min(i6, i5);
            java.lang.System.arraycopy(this.f9451p, 0, bArr, i4, min);
            m4636q(min);
            i7 = min;
        }
        if (i7 == 0) {
            i7 = m4634i(bArr, i4, i5, 0, true);
        }
        if (i7 != -1) {
            this.f9450o += i7;
        }
        return i7;
    }

    @Override // p215y0.InterfaceC2404p
    public final void readFully(byte[] bArr, int i4, int i5) {
        mo631k(bArr, i4, i5, false);
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: w */
    public final long mo641w() {
        return this.f9450o + this.f9452q;
    }

    @Override // p215y0.InterfaceC2404p
    /* renamed from: z */
    public final void mo642z(byte[] bArr, int i4, int i5) {
        mo634p(bArr, i4, i5, false);
    }
}
