package W;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2686a;

    /* renamed from: b, reason: collision with root package name */
    public int f2687b;

    /* renamed from: c, reason: collision with root package name */
    public int f2688c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f2689d;

    /* renamed from: e, reason: collision with root package name */
    public int f2690e;

    public q() {
        this.f2686a = 0;
        this.f2689d = y.f2714f;
    }

    public void a() {
        int i4;
        int i5;
        switch (this.f2686a) {
            case 0:
                int i6 = this.f2687b;
                a.j(i6 >= 0 && (i6 < (i4 = this.f2690e) || (i6 == i4 && this.f2688c == 0)));
                return;
            default:
                int i7 = this.f2688c;
                a.j(i7 >= 0 && (i7 < (i5 = this.f2687b) || (i7 == i5 && this.f2690e == 0)));
                return;
        }
    }

    public int b() {
        return ((this.f2690e - this.f2687b) * 8) - this.f2688c;
    }

    public void c() {
        if (this.f2688c == 0) {
            return;
        }
        this.f2688c = 0;
        this.f2687b++;
        a();
    }

    public boolean d(int i4) {
        int i5 = this.f2688c;
        int i6 = i4 / 8;
        int i7 = i5 + i6;
        int i8 = (this.f2690e + i4) - (i6 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            i5++;
            if (i5 > i7 || i7 >= this.f2687b) {
                break;
            }
            if (r(i5)) {
                i7++;
                i5 += 2;
            }
        }
        int i9 = this.f2687b;
        if (i7 >= i9) {
            return i7 == i9 && i8 == 0;
        }
        return true;
    }

    public boolean e() {
        int i4 = this.f2688c;
        int i5 = this.f2690e;
        int i6 = 0;
        while (this.f2688c < this.f2687b && !h()) {
            i6++;
        }
        boolean z4 = this.f2688c == this.f2687b;
        this.f2688c = i4;
        this.f2690e = i5;
        return !z4 && d((i6 * 2) + 1);
    }

    public int f() {
        a.j(this.f2688c == 0);
        return this.f2687b;
    }

    public int g() {
        return (this.f2687b * 8) + this.f2688c;
    }

    public boolean h() {
        switch (this.f2686a) {
            case 0:
                boolean z4 = (this.f2689d[this.f2687b] & (128 >> this.f2688c)) != 0;
                s();
                return z4;
            case 1:
            default:
                boolean z5 = (((this.f2689d[this.f2688c] & 255) >> this.f2690e) & 1) == 1;
                t(1);
                return z5;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                boolean z6 = (this.f2689d[this.f2688c] & (128 >> this.f2690e)) != 0;
                s();
                return z6;
        }
    }

    public int i(int i4) {
        switch (this.f2686a) {
            case 0:
                if (i4 == 0) {
                    return 0;
                }
                this.f2688c += i4;
                int i5 = 0;
                while (true) {
                    int i6 = this.f2688c;
                    if (i6 <= 8) {
                        byte[] bArr = this.f2689d;
                        int i7 = this.f2687b;
                        int i8 = ((-1) >>> (32 - i4)) & (i5 | ((bArr[i7] & 255) >> (8 - i6)));
                        if (i6 == 8) {
                            this.f2688c = 0;
                            this.f2687b = i7 + 1;
                        }
                        a();
                        return i8;
                    }
                    int i9 = i6 - 8;
                    this.f2688c = i9;
                    byte[] bArr2 = this.f2689d;
                    int i10 = this.f2687b;
                    this.f2687b = i10 + 1;
                    i5 |= (bArr2[i10] & 255) << i9;
                }
            case 1:
            default:
                int i11 = this.f2688c;
                int min = Math.min(i4, 8 - this.f2690e);
                int i12 = i11 + 1;
                byte[] bArr3 = this.f2689d;
                int i13 = ((bArr3[i11] & 255) >> this.f2690e) & (255 >> (8 - min));
                while (min < i4) {
                    i13 |= (bArr3[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i4));
                t(i4);
                return i14;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2690e += i4;
                int i15 = 0;
                while (true) {
                    int i16 = this.f2690e;
                    if (i16 <= 8) {
                        byte[] bArr4 = this.f2689d;
                        int i17 = this.f2688c;
                        int i18 = ((-1) >>> (32 - i4)) & (i15 | ((bArr4[i17] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.f2690e = 0;
                            this.f2688c = i17 + (r(i17 + 1) ? 2 : 1);
                        }
                        a();
                        return i18;
                    }
                    int i19 = i16 - 8;
                    this.f2690e = i19;
                    byte[] bArr5 = this.f2689d;
                    int i20 = this.f2688c;
                    i15 |= (bArr5[i20] & 255) << i19;
                    if (!r(i20 + 1)) {
                        r3 = 1;
                    }
                    this.f2688c = i20 + r3;
                }
        }
    }

    public void j(byte[] bArr, int i4) {
        int i5 = i4 >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            byte[] bArr2 = this.f2689d;
            int i7 = this.f2687b;
            int i8 = i7 + 1;
            this.f2687b = i8;
            byte b4 = bArr2[i7];
            int i9 = this.f2688c;
            byte b5 = (byte) (b4 << i9);
            bArr[i6] = b5;
            bArr[i6] = (byte) (((255 & bArr2[i8]) >> (8 - i9)) | b5);
        }
        int i10 = i4 & 7;
        if (i10 == 0) {
            return;
        }
        byte b6 = (byte) (bArr[i5] & (255 >> i10));
        bArr[i5] = b6;
        int i11 = this.f2688c;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f2689d;
            int i12 = this.f2687b;
            this.f2687b = i12 + 1;
            bArr[i5] = (byte) (b6 | ((bArr3[i12] & 255) << i11));
            this.f2688c = i11 - 8;
        }
        int i13 = this.f2688c + i10;
        this.f2688c = i13;
        byte[] bArr4 = this.f2689d;
        int i14 = this.f2687b;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | bArr[i5]);
        if (i13 == 8) {
            this.f2688c = 0;
            this.f2687b = i14 + 1;
        }
        a();
    }

    public long k(int i4) {
        if (i4 <= 32) {
            int i5 = i(i4);
            int i6 = y.f2709a;
            return 4294967295L & i5;
        }
        int i7 = i(i4 - 32);
        int i8 = i(32);
        int i9 = y.f2709a;
        return (4294967295L & i8) | ((i7 & 4294967295L) << 32);
    }

    public void l(byte[] bArr, int i4) {
        a.j(this.f2688c == 0);
        System.arraycopy(this.f2689d, this.f2687b, bArr, 0, i4);
        this.f2687b += i4;
        a();
    }

    public int m() {
        int i4 = 0;
        while (!h()) {
            i4++;
        }
        return ((1 << i4) - 1) + (i4 > 0 ? i(i4) : 0);
    }

    public int n() {
        int m4 = m();
        return ((m4 + 1) / 2) * (m4 % 2 == 0 ? -1 : 1);
    }

    public void o(r rVar) {
        p(rVar.f2694a, rVar.f2696c);
        q(rVar.f2695b * 8);
    }

    public void p(byte[] bArr, int i4) {
        this.f2689d = bArr;
        this.f2687b = 0;
        this.f2688c = 0;
        this.f2690e = i4;
    }

    public void q(int i4) {
        int i5 = i4 / 8;
        this.f2687b = i5;
        this.f2688c = i4 - (i5 * 8);
        a();
    }

    public boolean r(int i4) {
        if (2 <= i4 && i4 < this.f2687b) {
            byte[] bArr = this.f2689d;
            if (bArr[i4] == 3 && bArr[i4 - 2] == 0 && bArr[i4 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void s() {
        switch (this.f2686a) {
            case 0:
                int i4 = this.f2688c + 1;
                this.f2688c = i4;
                if (i4 == 8) {
                    this.f2688c = 0;
                    this.f2687b++;
                }
                a();
                return;
            default:
                int i5 = this.f2690e + 1;
                this.f2690e = i5;
                if (i5 == 8) {
                    this.f2690e = 0;
                    int i6 = this.f2688c;
                    this.f2688c = i6 + (r(i6 + 1) ? 2 : 1);
                }
                a();
                return;
        }
    }

    public void t(int i4) {
        int i5;
        switch (this.f2686a) {
            case 0:
                int i6 = i4 / 8;
                int i7 = this.f2687b + i6;
                this.f2687b = i7;
                int i8 = (i4 - (i6 * 8)) + this.f2688c;
                this.f2688c = i8;
                if (i8 > 7) {
                    this.f2687b = i7 + 1;
                    this.f2688c = i8 - 8;
                }
                a();
                return;
            case 1:
            default:
                int i9 = i4 / 8;
                int i10 = this.f2688c + i9;
                this.f2688c = i10;
                int i11 = (i4 - (i9 * 8)) + this.f2690e;
                this.f2690e = i11;
                boolean z4 = true;
                if (i11 > 7) {
                    this.f2688c = i10 + 1;
                    this.f2690e = i11 - 8;
                }
                int i12 = this.f2688c;
                if (i12 < 0 || (i12 >= (i5 = this.f2687b) && (i12 != i5 || this.f2690e != 0))) {
                    z4 = false;
                }
                a.j(z4);
                return;
            case L.k.FLOAT_FIELD_NUMBER /* 2 */:
                int i13 = this.f2688c;
                int i14 = i4 / 8;
                int i15 = i13 + i14;
                this.f2688c = i15;
                int i16 = (i4 - (i14 * 8)) + this.f2690e;
                this.f2690e = i16;
                if (i16 > 7) {
                    this.f2688c = i15 + 1;
                    this.f2690e = i16 - 8;
                }
                while (true) {
                    i13++;
                    if (i13 > this.f2688c) {
                        a();
                        return;
                    } else if (r(i13)) {
                        this.f2688c++;
                        i13 += 2;
                    }
                }
        }
    }

    public void u(int i4) {
        a.j(this.f2688c == 0);
        this.f2687b += i4;
        a();
    }

    public q(byte[] bArr) {
        this.f2686a = 3;
        this.f2689d = bArr;
        this.f2687b = bArr.length;
    }

    public q(byte[] bArr, int i4, int i5) {
        this.f2686a = 2;
        this.f2689d = bArr;
        this.f2688c = i4;
        this.f2687b = i5;
        this.f2690e = 0;
        a();
    }

    public q(byte[] bArr, int i4) {
        this.f2686a = 0;
        this.f2689d = bArr;
        this.f2690e = i4;
    }

    public q(int i4, int i5) {
        this.f2686a = 1;
        this.f2687b = i4;
        this.f2688c = i5;
        this.f2689d = new byte[(i5 * 2) - 1];
        this.f2690e = 0;
    }
}
