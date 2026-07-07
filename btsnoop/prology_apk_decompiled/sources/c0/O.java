package c0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class O extends U.e {

    /* renamed from: n, reason: collision with root package name */
    public int f4581n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4582o;

    /* renamed from: p, reason: collision with root package name */
    public int f4583p;

    /* renamed from: q, reason: collision with root package name */
    public long f4584q;
    public byte[] s;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f4588v;

    /* renamed from: r, reason: collision with root package name */
    public int f4585r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f4586t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f4587u = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f4579l = 100000;

    /* renamed from: i, reason: collision with root package name */
    public final float f4576i = 0.2f;

    /* renamed from: m, reason: collision with root package name */
    public final long f4580m = 2000000;

    /* renamed from: k, reason: collision with root package name */
    public final int f4578k = 10;

    /* renamed from: j, reason: collision with root package name */
    public final short f4577j = 1024;

    public O() {
        byte[] bArr = W.y.f2714f;
        this.s = bArr;
        this.f4588v = bArr;
    }

    @Override // U.e, U.d
    public final boolean a() {
        return super.a() && this.f4582o;
    }

    @Override // U.d
    public final void f(ByteBuffer byteBuffer) {
        int limit;
        int position;
        while (byteBuffer.hasRemaining() && !this.f2476g.hasRemaining()) {
            int i4 = this.f4583p;
            short s = this.f4577j;
            if (i4 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & 255)) > s) {
                        int i5 = this.f4581n;
                        position = ((limit3 / i5) * i5) + i5;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.f4583p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    l(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException();
                }
                W.a.j(this.f4586t < this.s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & 255)) > s) {
                        int i6 = this.f4581n;
                        limit = (position2 / i6) * i6;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i7 = this.f4586t;
                int i8 = this.f4587u;
                int i9 = i7 + i8;
                byte[] bArr = this.s;
                if (i9 < bArr.length) {
                    i7 = bArr.length;
                } else {
                    i9 = i8 - (bArr.length - i7);
                }
                int i10 = i7 - i9;
                boolean z4 = limit < limit4;
                int min = Math.min(position3, i10);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.s, i9, min);
                int i11 = this.f4587u + min;
                this.f4587u = i11;
                W.a.j(i11 <= this.s.length);
                boolean z5 = z4 && position3 < i10;
                n(z5);
                if (z5) {
                    this.f4583p = 0;
                    this.f4585r = 0;
                }
                byteBuffer.limit(limit4);
            }
        }
    }

    @Override // U.e
    public final U.b h(U.b bVar) {
        if (bVar.f2468c == 2) {
            return bVar.f2466a == -1 ? U.b.f2465e : bVar;
        }
        throw new U.c(bVar);
    }

    @Override // U.e
    public final void i() {
        if (a()) {
            int i4 = this.f2471b.f2467b * 2;
            this.f4581n = i4;
            int i5 = ((((int) ((this.f4579l * r0.f2466a) / 1000000)) / 2) / i4) * i4 * 2;
            if (this.s.length != i5) {
                this.s = new byte[i5];
                this.f4588v = new byte[i5];
            }
        }
        this.f4583p = 0;
        this.f4584q = 0L;
        this.f4585r = 0;
        this.f4586t = 0;
        this.f4587u = 0;
    }

    @Override // U.e
    public final void j() {
        if (this.f4587u > 0) {
            n(true);
            this.f4585r = 0;
        }
    }

    @Override // U.e
    public final void k() {
        this.f4582o = false;
        byte[] bArr = W.y.f2714f;
        this.s = bArr;
        this.f4588v = bArr;
    }

    public final int m(int i4) {
        int length = ((((int) ((this.f4580m * this.f2471b.f2466a) / 1000000)) - this.f4585r) * this.f4581n) - (this.s.length / 2);
        W.a.j(length >= 0);
        int min = (int) Math.min((i4 * this.f4576i) + 0.5f, length);
        int i5 = this.f4581n;
        return (min / i5) * i5;
    }

    public final void n(boolean z4) {
        int length;
        int m4;
        int i4 = this.f4587u;
        byte[] bArr = this.s;
        if (i4 == bArr.length || z4) {
            if (this.f4585r == 0) {
                if (z4) {
                    o(i4, 3);
                    length = i4;
                } else {
                    W.a.j(i4 >= bArr.length / 2);
                    length = this.s.length / 2;
                    o(length, 0);
                }
                m4 = length;
            } else if (z4) {
                int length2 = i4 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int m5 = m(length2) + (this.s.length / 2);
                o(m5, 2);
                m4 = m5;
                length = length3;
            } else {
                length = i4 - (bArr.length / 2);
                m4 = m(length);
                o(m4, 1);
            }
            W.a.i("bytesConsumed is not aligned to frame size: %s" + length, length % this.f4581n == 0);
            W.a.j(i4 >= m4);
            this.f4587u -= length;
            int i5 = this.f4586t + length;
            this.f4586t = i5;
            this.f4586t = i5 % this.s.length;
            this.f4585r = (m4 / this.f4581n) + this.f4585r;
            this.f4584q += (length - m4) / r2;
        }
    }

    public final void o(int i4, int i5) {
        if (i4 == 0) {
            return;
        }
        W.a.e(this.f4587u >= i4);
        if (i5 == 2) {
            int i6 = this.f4586t;
            int i7 = this.f4587u;
            int i8 = i6 + i7;
            byte[] bArr = this.s;
            if (i8 <= bArr.length) {
                System.arraycopy(bArr, i8 - i4, this.f4588v, 0, i4);
            } else {
                int length = i7 - (bArr.length - i6);
                if (length >= i4) {
                    System.arraycopy(bArr, length - i4, this.f4588v, 0, i4);
                } else {
                    int i9 = i4 - length;
                    System.arraycopy(bArr, bArr.length - i9, this.f4588v, 0, i9);
                    System.arraycopy(this.s, 0, this.f4588v, i9, length);
                }
            }
        } else {
            int i10 = this.f4586t;
            int i11 = i10 + i4;
            byte[] bArr2 = this.s;
            if (i11 <= bArr2.length) {
                System.arraycopy(bArr2, i10, this.f4588v, 0, i4);
            } else {
                int length2 = bArr2.length - i10;
                System.arraycopy(bArr2, i10, this.f4588v, 0, length2);
                System.arraycopy(this.s, 0, this.f4588v, length2, i4 - length2);
            }
        }
        W.a.d("sizeToOutput is not aligned to frame size: " + i4, i4 % this.f4581n == 0);
        W.a.j(this.f4586t < this.s.length);
        byte[] bArr3 = this.f4588v;
        W.a.d("byteOutput size is not aligned to frame size " + i4, i4 % this.f4581n == 0);
        if (i5 != 3) {
            for (int i12 = 0; i12 < i4; i12 += 2) {
                int i13 = i12 + 1;
                int i14 = (bArr3[i13] << 8) | (bArr3[i12] & 255);
                int i15 = this.f4578k;
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
        l(i4).put(bArr3, 0, i4).flip();
    }
}
