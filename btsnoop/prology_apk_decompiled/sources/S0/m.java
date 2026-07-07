package S0;

import W.y;
import y0.F;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final F f1920a;

    /* renamed from: d, reason: collision with root package name */
    public x f1923d;

    /* renamed from: e, reason: collision with root package name */
    public k f1924e;

    /* renamed from: f, reason: collision with root package name */
    public int f1925f;

    /* renamed from: g, reason: collision with root package name */
    public int f1926g;

    /* renamed from: h, reason: collision with root package name */
    public int f1927h;

    /* renamed from: i, reason: collision with root package name */
    public int f1928i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1931l;

    /* renamed from: b, reason: collision with root package name */
    public final w f1921b = new w();

    /* renamed from: c, reason: collision with root package name */
    public final W.r f1922c = new W.r();

    /* renamed from: j, reason: collision with root package name */
    public final W.r f1929j = new W.r(1);

    /* renamed from: k, reason: collision with root package name */
    public final W.r f1930k = new W.r();

    public m(F f4, x xVar, k kVar) {
        this.f1920a = f4;
        this.f1923d = xVar;
        this.f1924e = kVar;
        this.f1923d = xVar;
        this.f1924e = kVar;
        f4.c(xVar.f2041a.f2013f);
        d();
    }

    public final v a() {
        if (!this.f1931l) {
            return null;
        }
        w wVar = this.f1921b;
        k kVar = wVar.f2024a;
        int i4 = y.f2709a;
        int i5 = kVar.f1913a;
        v vVar = wVar.f2036m;
        if (vVar == null) {
            v[] vVarArr = this.f1923d.f2041a.f2018k;
            vVar = vVarArr == null ? null : vVarArr[i5];
        }
        if (vVar == null || !vVar.f2019a) {
            return null;
        }
        return vVar;
    }

    public final boolean b() {
        this.f1925f++;
        if (!this.f1931l) {
            return false;
        }
        int i4 = this.f1926g + 1;
        this.f1926g = i4;
        int[] iArr = this.f1921b.f2030g;
        int i5 = this.f1927h;
        if (i4 != iArr[i5]) {
            return true;
        }
        this.f1927h = i5 + 1;
        this.f1926g = 0;
        return false;
    }

    public final int c(int i4, int i5) {
        W.r rVar;
        v a4 = a();
        if (a4 == null) {
            return 0;
        }
        w wVar = this.f1921b;
        int i6 = a4.f2022d;
        if (i6 != 0) {
            rVar = wVar.f2037n;
        } else {
            int i7 = y.f2709a;
            byte[] bArr = a4.f2023e;
            int length = bArr.length;
            W.r rVar2 = this.f1930k;
            rVar2.E(bArr, length);
            i6 = bArr.length;
            rVar = rVar2;
        }
        boolean z4 = wVar.f2034k && wVar.f2035l[this.f1925f];
        boolean z5 = z4 || i5 != 0;
        W.r rVar3 = this.f1929j;
        rVar3.f2694a[0] = (byte) ((z5 ? 128 : 0) | i6);
        rVar3.G(0);
        F f4 = this.f1920a;
        f4.a(rVar3, 1, 1);
        f4.a(rVar, i6, 1);
        if (!z5) {
            return i6 + 1;
        }
        W.r rVar4 = this.f1922c;
        if (!z4) {
            rVar4.D(8);
            byte[] bArr2 = rVar4.f2694a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i5 & 255);
            bArr2[4] = (byte) ((i4 >> 24) & 255);
            bArr2[5] = (byte) ((i4 >> 16) & 255);
            bArr2[6] = (byte) ((i4 >> 8) & 255);
            bArr2[7] = (byte) (i4 & 255);
            f4.a(rVar4, 8, 1);
            return i6 + 9;
        }
        W.r rVar5 = wVar.f2037n;
        int A4 = rVar5.A();
        rVar5.H(-2);
        int i8 = (A4 * 6) + 2;
        if (i5 != 0) {
            rVar4.D(i8);
            byte[] bArr3 = rVar4.f2694a;
            rVar5.f(bArr3, 0, i8);
            int i9 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i5;
            bArr3[2] = (byte) ((i9 >> 8) & 255);
            bArr3[3] = (byte) (i9 & 255);
        } else {
            rVar4 = rVar5;
        }
        f4.a(rVar4, i8, 1);
        return i6 + 1 + i8;
    }

    public final void d() {
        w wVar = this.f1921b;
        wVar.f2027d = 0;
        wVar.f2039p = 0L;
        wVar.f2040q = false;
        wVar.f2034k = false;
        wVar.f2038o = false;
        wVar.f2036m = null;
        this.f1925f = 0;
        this.f1927h = 0;
        this.f1926g = 0;
        this.f1928i = 0;
        this.f1931l = false;
    }
}
