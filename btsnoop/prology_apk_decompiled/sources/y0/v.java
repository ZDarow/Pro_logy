package y0;

import T.I;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final List f9120a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9121b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9122c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9123d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9124e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9125f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9126g;

    /* renamed from: h, reason: collision with root package name */
    public final float f9127h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9128i;

    /* renamed from: j, reason: collision with root package name */
    public final String f9129j;

    public v(List list, int i4, int i5, int i6, int i7, int i8, int i9, float f4, int i10, String str) {
        this.f9120a = list;
        this.f9121b = i4;
        this.f9122c = i5;
        this.f9123d = i6;
        this.f9124e = i7;
        this.f9125f = i8;
        this.f9126g = i9;
        this.f9127h = f4;
        this.f9128i = i10;
        this.f9129j = str;
    }

    public static v a(W.r rVar) {
        int i4;
        int i5;
        try {
            rVar.H(21);
            int u4 = rVar.u() & 3;
            int u5 = rVar.u();
            int i6 = rVar.f2695b;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < u5; i9++) {
                rVar.H(1);
                int A4 = rVar.A();
                for (int i10 = 0; i10 < A4; i10++) {
                    int A5 = rVar.A();
                    i8 += A5 + 4;
                    rVar.H(A5);
                }
            }
            rVar.G(i6);
            byte[] bArr = new byte[i8];
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f4 = 1.0f;
            String str = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < u5) {
                int u6 = rVar.u() & 63;
                int A6 = rVar.A();
                int i19 = i7;
                while (i19 < A6) {
                    int A7 = rVar.A();
                    int i20 = u5;
                    System.arraycopy(X.g.f2863a, i7, bArr, i18, 4);
                    int i21 = i18 + 4;
                    System.arraycopy(rVar.f2694a, rVar.f2695b, bArr, i21, A7);
                    if (u6 == 33 && i19 == 0) {
                        X.d c4 = X.g.c(bArr, i21, i21 + A7);
                        int i22 = c4.f2832e + 8;
                        i12 = c4.f2833f + 8;
                        i13 = c4.f2840m;
                        int i23 = c4.f2841n;
                        int i24 = c4.f2842o;
                        float f5 = c4.f2838k;
                        int i25 = c4.f2839l;
                        i4 = u6;
                        i5 = A6;
                        i11 = i22;
                        str = W.a.c(c4.f2828a, c4.f2829b, c4.f2830c, c4.f2831d, c4.f2834g, c4.f2835h);
                        i15 = i24;
                        i14 = i23;
                        i16 = i25;
                        f4 = f5;
                    } else {
                        i4 = u6;
                        i5 = A6;
                    }
                    i18 = i21 + A7;
                    rVar.H(A7);
                    i19++;
                    u5 = i20;
                    u6 = i4;
                    A6 = i5;
                    i7 = 0;
                }
                i17++;
                i7 = 0;
            }
            return new v(i8 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), u4 + 1, i11, i12, i13, i14, i15, f4, i16, str);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw I.a(e4, "Error parsing HEVC config");
        }
    }
}
