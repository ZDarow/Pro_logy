package p112c0;

/* renamed from: c0.O */
/* loaded from: classes.dex */
public final class C1216O extends p079U.AbstractC0744e {

    /* renamed from: n */
    public int f4746n;

    /* renamed from: o */
    public boolean f4747o;

    /* renamed from: p */
    public int f4748p;

    /* renamed from: q */
    public long f4749q;

    /* renamed from: s */
    public byte[] f4751s;

    /* renamed from: v */
    public byte[] f4754v;

    /* renamed from: r */
    public int f4750r = 0;

    /* renamed from: t */
    public int f4752t = 0;

    /* renamed from: u */
    public int f4753u = 0;

    /* renamed from: l */
    public final long f4744l = 100000;

    /* renamed from: i */
    public final float f4741i = 0.2f;

    /* renamed from: m */
    public final long f4745m = 2000000;

    /* renamed from: k */
    public final int f4743k = 10;

    /* renamed from: j */
    public final short f4742j = 1024;

    public C1216O() {
        byte[] bArr = p086W.AbstractC0805y.f2806f;
        this.f4751s = bArr;
        this.f4754v = bArr;
    }

    @Override // p079U.AbstractC0744e, p079U.InterfaceC0743d
    /* renamed from: a */
    public final boolean mo1337a() {
        return super.mo1337a() && this.f4747o;
    }

    @Override // p079U.InterfaceC0743d
    /* renamed from: f */
    public final void mo1342f(java.nio.ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.f2563g.hasRemaining()) {
            int i4 = this.f4748p;
            short s = this.f4742j;
            if (i4 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(java.lang.Math.min(limit2, byteBuffer.position() + this.f4751s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (java.lang.Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i5 = this.f4746n;
                        position = ((limit3 / i5) * i5) + i5;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f4748p = 1;
                } else {
                    byteBuffer.limit(java.lang.Math.min(position, byteBuffer.capacity()));
                    m1348l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException();
                }
                p086W.AbstractC0781a.m1421j(this.f4752t < this.f4751s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (java.lang.Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i6 = this.f4746n;
                        limit = (position2 / i6) * i6;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i7 = this.f4752t;
                int i8 = this.f4753u;
                int i9 = i7 + i8;
                byte[] bArr = this.f4751s;
                if (i9 < bArr.length) {
                    i7 = bArr.length;
                } else {
                    i9 = i8 - (bArr.length - i7);
                }
                int i10 = i7 - i9;
                boolean z4 = limit < limit4;
                int min = java.lang.Math.min(position3, i10);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.f4751s, i9, min);
                int i11 = this.f4753u + min;
                this.f4753u = i11;
                p086W.AbstractC0781a.m1421j(i11 <= this.f4751s.length);
                boolean z5 = z4 && position3 < i10;
                m2893n(z5);
                if (z5) {
                    this.f4748p = 0;
                    this.f4750r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: h */
    public final p079U.C0741b mo1344h(p079U.C0741b c0741b) {
        if (c0741b.f2555c == 2) {
            return c0741b.f2553a == -1 ? p079U.C0741b.f2552e : c0741b;
        }
        throw new p079U.C0742c(c0741b);
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: i */
    public final void mo1345i() {
        if (mo1337a()) {
            int i4 = this.f2558b.f2554b * 2;
            this.f4746n = i4;
            int i5 = ((((int) ((this.f4744l * r0.f2553a) / 1000000)) / 2) / i4) * i4 * 2;
            if (this.f4751s.length != i5) {
                this.f4751s = new byte[i5];
                this.f4754v = new byte[i5];
            }
        }
        this.f4748p = 0;
        this.f4749q = 0L;
        this.f4750r = 0;
        this.f4752t = 0;
        this.f4753u = 0;
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: j */
    public final void mo1346j() {
        if (this.f4753u > 0) {
            m2893n(true);
            this.f4750r = 0;
        }
    }

    @Override // p079U.AbstractC0744e
    /* renamed from: k */
    public final void mo1347k() {
        this.f4747o = false;
        byte[] bArr = p086W.AbstractC0805y.f2806f;
        this.f4751s = bArr;
        this.f4754v = bArr;
    }

    /* renamed from: m */
    public final int m2892m(int i4) {
        int length = ((((int) ((this.f4745m * this.f2558b.f2553a) / 1000000)) - this.f4750r) * this.f4746n) - (this.f4751s.length / 2);
        p086W.AbstractC0781a.m1421j(length >= 0);
        int min = (int) java.lang.Math.min((i4 * this.f4741i) + 0.5f, length);
        int i5 = this.f4746n;
        return (min / i5) * i5;
    }

    /* renamed from: n */
    public final void m2893n(boolean z4) {
        int length;
        int m2892m;
        int i4 = this.f4753u;
        byte[] bArr = this.f4751s;
        if (i4 == bArr.length || z4) {
            if (this.f4750r == 0) {
                if (z4) {
                    m2894o(i4, 3);
                    length = i4;
                } else {
                    p086W.AbstractC0781a.m1421j(i4 >= bArr.length / 2);
                    length = this.f4751s.length / 2;
                    m2894o(length, 0);
                }
                m2892m = length;
            } else if (z4) {
                int length2 = i4 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m2892m2 = m2892m(length2) + (this.f4751s.length / 2);
                m2894o(m2892m2, 2);
                m2892m = m2892m2;
                length = length3;
            } else {
                length = i4 - (bArr.length / 2);
                m2892m = m2892m(length);
                m2894o(m2892m, 1);
            }
            p086W.AbstractC0781a.m1420i("bytesConsumed is not aligned to frame size: %s" + length, length % this.f4746n == 0);
            p086W.AbstractC0781a.m1421j(i4 >= m2892m);
            this.f4753u -= length;
            int i5 = this.f4752t + length;
            this.f4752t = i5;
            this.f4752t = i5 % this.f4751s.length;
            this.f4750r = (m2892m / this.f4746n) + this.f4750r;
            this.f4749q += (length - m2892m) / r2;
        }
    }

    /* renamed from: o */
    public final void m2894o(int i4, int i5) {
        if (i4 == 0) {
            return;
        }
        p086W.AbstractC0781a.m1416e(this.f4753u >= i4);
        if (i5 == 2) {
            int i6 = this.f4752t;
            int i7 = this.f4753u;
            int i8 = i6 + i7;
            byte[] bArr = this.f4751s;
            if (i8 <= bArr.length) {
                java.lang.System.arraycopy(bArr, i8 - i4, this.f4754v, 0, i4);
            } else {
                int length = i7 - (bArr.length - i6);
                if (length >= i4) {
                    java.lang.System.arraycopy(bArr, length - i4, this.f4754v, 0, i4);
                } else {
                    int i9 = i4 - length;
                    java.lang.System.arraycopy(bArr, bArr.length - i9, this.f4754v, 0, i9);
                    java.lang.System.arraycopy(this.f4751s, 0, this.f4754v, i9, length);
                }
            }
        } else {
            int i10 = this.f4752t;
            int i11 = i10 + i4;
            byte[] bArr2 = this.f4751s;
            if (i11 <= bArr2.length) {
                java.lang.System.arraycopy(bArr2, i10, this.f4754v, 0, i4);
            } else {
                int length2 = bArr2.length - i10;
                java.lang.System.arraycopy(bArr2, i10, this.f4754v, 0, length2);
                java.lang.System.arraycopy(this.f4751s, 0, this.f4754v, length2, i4 - length2);
            }
        }
        p086W.AbstractC0781a.m1415d("sizeToOutput is not aligned to frame size: " + i4, i4 % this.f4746n == 0);
        p086W.AbstractC0781a.m1421j(this.f4752t < this.f4751s.length);
        byte[] bArr3 = this.f4754v;
        p086W.AbstractC0781a.m1415d("byteOutput size is not aligned to frame size " + i4, i4 % this.f4746n == 0);
        if (i5 != 3) {
            for (int i12 = 0; i12 < i4; i12 += 2) {
                int i13 = i12 + 1;
                int i14 = (bArr3[i13] << 8) | (bArr3[i12] & 255);
                int i15 = this.f4743k;
                if (i5 == 0) {
                    i15 = ((((i12 * 1000) / (i4 - 1)) * (i15 - 100)) / 1000) + 100;
                } else if (i5 == 2) {
                    i15 += (((i12 * 1000) * (100 - i15)) / (i4 - 1)) / 1000;
                }
                int i16 = (i14 * i15) / 100;
                if (i16 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i16 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = Byte.MIN_VALUE;
                } else {
                    bArr3[i12] = (byte) (i16 & 255);
                    bArr3[i13] = (byte) (i16 >> 8);
                }
            }
        }
        m1348l(i4).put(bArr3, 0, i4).flip();
    }
}
