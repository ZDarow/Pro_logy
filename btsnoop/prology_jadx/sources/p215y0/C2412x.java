package p215y0;

/* renamed from: y0.x */
/* loaded from: classes.dex */
public final class C2412x {

    /* renamed from: a */
    public int f9496a;

    /* renamed from: b */
    public int f9497b;

    /* renamed from: c */
    public int f9498c;

    /* renamed from: d */
    public int f9499d;

    /* renamed from: e */
    public int f9500e;

    /* renamed from: f */
    public int f9501f;

    /* renamed from: g */
    public java.io.Serializable f9502g;

    /* renamed from: a */
    public boolean m4646a(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!((i4 & (-2097152)) == -2097152) || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return false;
        }
        this.f9496a = i5;
        this.f9502g = p215y0.AbstractC2390b.f9391s[3 - i6];
        int i9 = p215y0.AbstractC2390b.f9392t[i8];
        this.f9498c = i9;
        if (i5 == 2) {
            this.f9498c = i9 / 2;
        } else if (i5 == 0) {
            this.f9498c = i9 / 4;
        }
        int i10 = (i4 >>> 9) & 1;
        int i11 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new java.lang.IllegalArgumentException();
                }
                i11 = 384;
            }
        } else if (i5 != 3) {
            i11 = 576;
        }
        this.f9501f = i11;
        if (i6 == 3) {
            int i12 = i5 == 3 ? p215y0.AbstractC2390b.f9393u[i7 - 1] : p215y0.AbstractC2390b.f9394v[i7 - 1];
            this.f9500e = i12;
            this.f9497b = (((i12 * 12) / this.f9498c) + i10) * 4;
        } else {
            if (i5 == 3) {
                int i13 = i6 == 2 ? p215y0.AbstractC2390b.f9395w[i7 - 1] : p215y0.AbstractC2390b.f9396x[i7 - 1];
                this.f9500e = i13;
                this.f9497b = ((i13 * 144) / this.f9498c) + i10;
            } else {
                int i14 = p215y0.AbstractC2390b.f9397y[i7 - 1];
                this.f9500e = i14;
                this.f9497b = (((i6 == 1 ? 72 : 144) * i14) / this.f9498c) + i10;
            }
        }
        this.f9499d = ((i4 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
