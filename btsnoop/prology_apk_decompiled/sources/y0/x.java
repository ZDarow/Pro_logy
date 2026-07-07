package y0;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public int f9134a;

    /* renamed from: b, reason: collision with root package name */
    public int f9135b;

    /* renamed from: c, reason: collision with root package name */
    public int f9136c;

    /* renamed from: d, reason: collision with root package name */
    public int f9137d;

    /* renamed from: e, reason: collision with root package name */
    public int f9138e;

    /* renamed from: f, reason: collision with root package name */
    public int f9139f;

    /* renamed from: g, reason: collision with root package name */
    public Serializable f9140g;

    public boolean a(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!((i4 & (-2097152)) == -2097152) || (i5 = (i4 >>> 19) & 3) == 1 || (i6 = (i4 >>> 17) & 3) == 0 || (i7 = (i4 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i4 >>> 10) & 3) == 3) {
            return false;
        }
        this.f9134a = i5;
        this.f9140g = AbstractC0619b.s[3 - i6];
        int i9 = AbstractC0619b.f9032t[i8];
        this.f9136c = i9;
        if (i5 == 2) {
            this.f9136c = i9 / 2;
        } else if (i5 == 0) {
            this.f9136c = i9 / 4;
        }
        int i10 = (i4 >>> 9) & 1;
        int i11 = 1152;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    throw new IllegalArgumentException();
                }
                i11 = 384;
            }
        } else if (i5 != 3) {
            i11 = 576;
        }
        this.f9139f = i11;
        if (i6 == 3) {
            int i12 = i5 == 3 ? AbstractC0619b.f9033u[i7 - 1] : AbstractC0619b.f9034v[i7 - 1];
            this.f9138e = i12;
            this.f9135b = (((i12 * 12) / this.f9136c) + i10) * 4;
        } else {
            if (i5 == 3) {
                int i13 = i6 == 2 ? AbstractC0619b.w[i7 - 1] : AbstractC0619b.f9035x[i7 - 1];
                this.f9138e = i13;
                this.f9135b = ((i13 * 144) / this.f9136c) + i10;
            } else {
                int i14 = AbstractC0619b.f9036y[i7 - 1];
                this.f9138e = i14;
                this.f9135b = (((i6 == 1 ? 72 : 144) * i14) / this.f9136c) + i10;
            }
        }
        this.f9137d = ((i4 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
