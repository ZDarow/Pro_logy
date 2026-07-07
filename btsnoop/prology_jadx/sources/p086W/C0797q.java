package p086W;

/* renamed from: W.q */
/* loaded from: classes.dex */
public final class C0797q {

    /* renamed from: a */
    public final /* synthetic */ int f2778a;

    /* renamed from: b */
    public int f2779b;

    /* renamed from: c */
    public int f2780c;

    /* renamed from: d */
    public byte[] f2781d;

    /* renamed from: e */
    public int f2782e;

    public C0797q() {
        this.f2778a = 0;
        this.f2781d = p086W.AbstractC0805y.f2806f;
    }

    /* renamed from: a */
    public void m1510a() {
        int i4;
        int i5;
        switch (this.f2778a) {
            case 0:
                int i6 = this.f2779b;
                p086W.AbstractC0781a.m1421j(i6 >= 0 && (i6 < (i4 = this.f2782e) || (i6 == i4 && this.f2780c == 0)));
                return;
            default:
                int i7 = this.f2780c;
                p086W.AbstractC0781a.m1421j(i7 >= 0 && (i7 < (i5 = this.f2779b) || (i7 == i5 && this.f2782e == 0)));
                return;
        }
    }

    /* renamed from: b */
    public int m1511b() {
        return ((this.f2782e - this.f2779b) * 8) - this.f2780c;
    }

    /* renamed from: c */
    public void m1512c() {
        if (this.f2780c == 0) {
            return;
        }
        this.f2780c = 0;
        this.f2779b++;
        m1510a();
    }

    /* renamed from: d */
    public boolean m1513d(int i4) {
        int i5 = this.f2780c;
        int i6 = i4 / 8;
        int i7 = i5 + i6;
        int i8 = (this.f2782e + i4) - (i6 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            i5++;
            if (i5 > i7 || i7 >= this.f2779b) {
                break;
            }
            if (m1527r(i5)) {
                i7++;
                i5 += 2;
            }
        }
        int i9 = this.f2779b;
        if (i7 >= i9) {
            return i7 == i9 && i8 == 0;
        }
        return true;
    }

    /* renamed from: e */
    public boolean m1514e() {
        int i4 = this.f2780c;
        int i5 = this.f2782e;
        int i6 = 0;
        while (this.f2780c < this.f2779b && !m1517h()) {
            i6++;
        }
        boolean z4 = this.f2780c == this.f2779b;
        this.f2780c = i4;
        this.f2782e = i5;
        return !z4 && m1513d((i6 * 2) + 1);
    }

    /* renamed from: f */
    public int m1515f() {
        p086W.AbstractC0781a.m1421j(this.f2780c == 0);
        return this.f2779b;
    }

    /* renamed from: g */
    public int m1516g() {
        return (this.f2779b * 8) + this.f2780c;
    }

    /* renamed from: h */
    public boolean m1517h() {
        switch (this.f2778a) {
            case 0:
                boolean z4 = (this.f2781d[this.f2779b] & (128 >> this.f2780c)) != 0;
                m1528s();
                return z4;
            case 1:
            default:
                boolean z5 = (((this.f2781d[this.f2780c] & 255) >> this.f2782e) & 1) == 1;
                m1529t(1);
                return z5;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                boolean z6 = (this.f2781d[this.f2780c] & (128 >> this.f2782e)) != 0;
                m1528s();
                return z6;
        }
    }

    /* renamed from: i */
    public int m1518i(int i4) {
        switch (this.f2778a) {
            case 0:
                if (i4 == 0) {
                    return 0;
                }
                this.f2780c += i4;
                int i5 = 0;
                while (true) {
                    int i6 = this.f2780c;
                    if (i6 <= 8) {
                        byte[] bArr = this.f2781d;
                        int i7 = this.f2779b;
                        int i8 = ((-1) >>> (32 - i4)) & (i5 | ((bArr[i7] & 255) >> (8 - i6)));
                        if (i6 == 8) {
                            this.f2780c = 0;
                            this.f2779b = i7 + 1;
                        }
                        m1510a();
                        return i8;
                    }
                    int i9 = i6 - 8;
                    this.f2780c = i9;
                    byte[] bArr2 = this.f2781d;
                    int i10 = this.f2779b;
                    this.f2779b = i10 + 1;
                    i5 |= (bArr2[i10] & 255) << i9;
                }
            case 1:
            default:
                int i11 = this.f2780c;
                int min = java.lang.Math.min(i4, 8 - this.f2782e);
                int i12 = i11 + 1;
                byte[] bArr3 = this.f2781d;
                int i13 = ((bArr3[i11] & 255) >> this.f2782e) & (255 >> (8 - min));
                while (min < i4) {
                    i13 |= (bArr3[i12] & 255) << min;
                    min += 8;
                    i12++;
                }
                int i14 = i13 & ((-1) >>> (32 - i4));
                m1529t(i4);
                return i14;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f2782e += i4;
                int i15 = 0;
                while (true) {
                    int i16 = this.f2782e;
                    if (i16 <= 8) {
                        byte[] bArr4 = this.f2781d;
                        int i17 = this.f2780c;
                        int i18 = ((-1) >>> (32 - i4)) & (i15 | ((bArr4[i17] & 255) >> (8 - i16)));
                        if (i16 == 8) {
                            this.f2782e = 0;
                            this.f2780c = i17 + (m1527r(i17 + 1) ? 2 : 1);
                        }
                        m1510a();
                        return i18;
                    }
                    int i19 = i16 - 8;
                    this.f2782e = i19;
                    byte[] bArr5 = this.f2781d;
                    int i20 = this.f2780c;
                    i15 |= (bArr5[i20] & 255) << i19;
                    if (!m1527r(i20 + 1)) {
                        r3 = 1;
                    }
                    this.f2780c = i20 + r3;
                }
        }
    }

    /* renamed from: j */
    public void m1519j(byte[] bArr, int i4) {
        int i5 = i4 >> 3;
        for (int i6 = 0; i6 < i5; i6++) {
            byte[] bArr2 = this.f2781d;
            int i7 = this.f2779b;
            int i8 = i7 + 1;
            this.f2779b = i8;
            byte b4 = bArr2[i7];
            int i9 = this.f2780c;
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
        int i11 = this.f2780c;
        if (i11 + i10 > 8) {
            byte[] bArr3 = this.f2781d;
            int i12 = this.f2779b;
            this.f2779b = i12 + 1;
            bArr[i5] = (byte) (b6 | ((bArr3[i12] & 255) << i11));
            this.f2780c = i11 - 8;
        }
        int i13 = this.f2780c + i10;
        this.f2780c = i13;
        byte[] bArr4 = this.f2781d;
        int i14 = this.f2779b;
        bArr[i5] = (byte) (((byte) (((255 & bArr4[i14]) >> (8 - i13)) << (8 - i10))) | bArr[i5]);
        if (i13 == 8) {
            this.f2780c = 0;
            this.f2779b = i14 + 1;
        }
        m1510a();
    }

    /* renamed from: k */
    public long m1520k(int i4) {
        if (i4 <= 32) {
            int m1518i = m1518i(i4);
            int i5 = p086W.AbstractC0805y.f2801a;
            return 4294967295L & m1518i;
        }
        int m1518i2 = m1518i(i4 - 32);
        int m1518i3 = m1518i(32);
        int i6 = p086W.AbstractC0805y.f2801a;
        return (4294967295L & m1518i3) | ((m1518i2 & 4294967295L) << 32);
    }

    /* renamed from: l */
    public void m1521l(byte[] bArr, int i4) {
        p086W.AbstractC0781a.m1421j(this.f2780c == 0);
        java.lang.System.arraycopy(this.f2781d, this.f2779b, bArr, 0, i4);
        this.f2779b += i4;
        m1510a();
    }

    /* renamed from: m */
    public int m1522m() {
        int i4 = 0;
        while (!m1517h()) {
            i4++;
        }
        return ((1 << i4) - 1) + (i4 > 0 ? m1518i(i4) : 0);
    }

    /* renamed from: n */
    public int m1523n() {
        int m1522m = m1522m();
        return ((m1522m + 1) / 2) * (m1522m % 2 == 0 ? -1 : 1);
    }

    /* renamed from: o */
    public void m1524o(p086W.C0798r c0798r) {
        m1525p(c0798r.f2786a, c0798r.f2788c);
        m1526q(c0798r.f2787b * 8);
    }

    /* renamed from: p */
    public void m1525p(byte[] bArr, int i4) {
        this.f2781d = bArr;
        this.f2779b = 0;
        this.f2780c = 0;
        this.f2782e = i4;
    }

    /* renamed from: q */
    public void m1526q(int i4) {
        int i5 = i4 / 8;
        this.f2779b = i5;
        this.f2780c = i4 - (i5 * 8);
        m1510a();
    }

    /* renamed from: r */
    public boolean m1527r(int i4) {
        if (2 <= i4 && i4 < this.f2779b) {
            byte[] bArr = this.f2781d;
            if (bArr[i4] == 3 && bArr[i4 - 2] == 0 && bArr[i4 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public void m1528s() {
        switch (this.f2778a) {
            case 0:
                int i4 = this.f2780c + 1;
                this.f2780c = i4;
                if (i4 == 8) {
                    this.f2780c = 0;
                    this.f2779b++;
                }
                m1510a();
                return;
            default:
                int i5 = this.f2782e + 1;
                this.f2782e = i5;
                if (i5 == 8) {
                    this.f2782e = 0;
                    int i6 = this.f2780c;
                    this.f2780c = i6 + (m1527r(i6 + 1) ? 2 : 1);
                }
                m1510a();
                return;
        }
    }

    /* renamed from: t */
    public void m1529t(int i4) {
        int i5;
        switch (this.f2778a) {
            case 0:
                int i6 = i4 / 8;
                int i7 = this.f2779b + i6;
                this.f2779b = i7;
                int i8 = (i4 - (i6 * 8)) + this.f2780c;
                this.f2780c = i8;
                if (i8 > 7) {
                    this.f2779b = i7 + 1;
                    this.f2780c = i8 - 8;
                }
                m1510a();
                return;
            case 1:
            default:
                int i9 = i4 / 8;
                int i10 = this.f2780c + i9;
                this.f2780c = i10;
                int i11 = (i4 - (i9 * 8)) + this.f2782e;
                this.f2782e = i11;
                boolean z4 = true;
                if (i11 > 7) {
                    this.f2780c = i10 + 1;
                    this.f2782e = i11 - 8;
                }
                int i12 = this.f2780c;
                if (i12 < 0 || (i12 >= (i5 = this.f2779b) && (i12 != i5 || this.f2782e != 0))) {
                    z4 = false;
                }
                p086W.AbstractC0781a.m1421j(z4);
                return;
            case p044L.C0353k.FLOAT_FIELD_NUMBER /* 2 */:
                int i13 = this.f2780c;
                int i14 = i4 / 8;
                int i15 = i13 + i14;
                this.f2780c = i15;
                int i16 = (i4 - (i14 * 8)) + this.f2782e;
                this.f2782e = i16;
                if (i16 > 7) {
                    this.f2780c = i15 + 1;
                    this.f2782e = i16 - 8;
                }
                while (true) {
                    i13++;
                    if (i13 > this.f2780c) {
                        m1510a();
                        return;
                    } else if (m1527r(i13)) {
                        this.f2780c++;
                        i13 += 2;
                    }
                }
        }
    }

    /* renamed from: u */
    public void m1530u(int i4) {
        p086W.AbstractC0781a.m1421j(this.f2780c == 0);
        this.f2779b += i4;
        m1510a();
    }

    public C0797q(byte[] bArr) {
        this.f2778a = 3;
        this.f2781d = bArr;
        this.f2779b = bArr.length;
    }

    public C0797q(byte[] bArr, int i4, int i5) {
        this.f2778a = 2;
        this.f2781d = bArr;
        this.f2780c = i4;
        this.f2779b = i5;
        this.f2782e = 0;
        m1510a();
    }

    public C0797q(byte[] bArr, int i4) {
        this.f2778a = 0;
        this.f2781d = bArr;
        this.f2782e = i4;
    }

    public C0797q(int i4, int i5) {
        this.f2778a = 1;
        this.f2779b = i4;
        this.f2780c = i5;
        this.f2781d = new byte[(i5 * 2) - 1];
        this.f2782e = 0;
    }
}
