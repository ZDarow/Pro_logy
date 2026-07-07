package B3;

import B2.AbstractC0007h;
import a.AbstractC0110a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends b {

    /* renamed from: p, reason: collision with root package name */
    public final transient byte[][] f270p;

    /* renamed from: q, reason: collision with root package name */
    public final transient int[] f271q;

    public s(byte[][] bArr, int[] iArr) {
        super(b.f225o.f226l);
        this.f270p = bArr;
        this.f271q = iArr;
    }

    @Override // B3.b
    public final int b() {
        return this.f271q[this.f270p.length - 1];
    }

    @Override // B3.b
    public final String c() {
        return new b(p()).c();
    }

    @Override // B3.b
    public final int d(byte[] bArr, int i4) {
        k3.h.e(bArr, "other");
        return new b(p()).d(bArr, i4);
    }

    @Override // B3.b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == b() && k(0, bVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // B3.b
    public final byte[] f() {
        return p();
    }

    @Override // B3.b
    public final byte g(int i4) {
        byte[][] bArr = this.f270p;
        int length = bArr.length - 1;
        int[] iArr = this.f271q;
        U1.a.d(iArr[length], i4, 1L);
        int e4 = C3.a.e(this, i4);
        return bArr[e4][(i4 - (e4 == 0 ? 0 : iArr[e4 - 1])) + iArr[bArr.length + e4]];
    }

    @Override // B3.b
    public final int h(byte[] bArr, int i4) {
        k3.h.e(bArr, "other");
        return new b(p()).h(bArr, i4);
    }

    @Override // B3.b
    public final int hashCode() {
        int i4 = this.f227m;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.f270p;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f271q;
            int i8 = iArr[length + i5];
            int i9 = iArr[i5];
            byte[] bArr2 = bArr[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr2[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        this.f227m = i6;
        return i6;
    }

    @Override // B3.b
    public final boolean j(int i4, int i5, int i6, byte[] bArr) {
        k3.h.e(bArr, "other");
        if (i4 < 0 || i4 > b() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int e4 = C3.a.e(this, i4);
        while (i4 < i7) {
            int[] iArr = this.f271q;
            int i8 = e4 == 0 ? 0 : iArr[e4 - 1];
            int i9 = iArr[e4] - i8;
            byte[][] bArr2 = this.f270p;
            int i10 = iArr[bArr2.length + e4];
            int min = Math.min(i7, i9 + i8) - i4;
            if (!U1.a.a((i4 - i8) + i10, i5, min, bArr2[e4], bArr)) {
                return false;
            }
            i5 += min;
            i4 += min;
            e4++;
        }
        return true;
    }

    @Override // B3.b
    public final boolean k(int i4, b bVar, int i5) {
        k3.h.e(bVar, "other");
        if (i4 < 0 || i4 > b() - i5) {
            return false;
        }
        int i6 = i5 + i4;
        int e4 = C3.a.e(this, i4);
        int i7 = 0;
        while (i4 < i6) {
            int[] iArr = this.f271q;
            int i8 = e4 == 0 ? 0 : iArr[e4 - 1];
            int i9 = iArr[e4] - i8;
            byte[][] bArr = this.f270p;
            int i10 = iArr[bArr.length + e4];
            int min = Math.min(i6, i9 + i8) - i4;
            if (!bVar.j(i7, (i4 - i8) + i10, min, bArr[e4])) {
                return false;
            }
            i7 += min;
            i4 += min;
            e4++;
        }
        return true;
    }

    @Override // B3.b
    public final b l(int i4, int i5) {
        if (i5 == -1234567890) {
            i5 = b();
        }
        if (i4 < 0) {
            throw new IllegalArgumentException(AbstractC0007h.j(i4, "beginIndex=", " < 0").toString());
        }
        if (i5 > b()) {
            throw new IllegalArgumentException(("endIndex=" + i5 + " > length(" + b() + ')').toString());
        }
        int i6 = i5 - i4;
        if (i6 < 0) {
            throw new IllegalArgumentException(AbstractC0007h.i(i5, i4, "endIndex=", " < beginIndex=").toString());
        }
        if (i4 == 0 && i5 == b()) {
            return this;
        }
        if (i4 == i5) {
            return b.f225o;
        }
        int e4 = C3.a.e(this, i4);
        int e5 = C3.a.e(this, i5 - 1);
        int i7 = e5 + 1;
        byte[][] bArr = this.f270p;
        k3.h.e(bArr, "<this>");
        AbstractC0110a.o(i7, bArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(bArr, e4, i7);
        k3.h.d(copyOfRange, "copyOfRange(...)");
        byte[][] bArr2 = (byte[][]) copyOfRange;
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f271q;
        if (e4 <= e5) {
            int i8 = e4;
            int i9 = 0;
            while (true) {
                iArr[i9] = Math.min(iArr2[i8] - i4, i6);
                int i10 = i9 + 1;
                iArr[i9 + bArr2.length] = iArr2[bArr.length + i8];
                if (i8 == e5) {
                    break;
                }
                i8++;
                i9 = i10;
            }
        }
        int i11 = e4 != 0 ? iArr2[e4 - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i4 - i11) + iArr[length];
        return new s(bArr2, iArr);
    }

    @Override // B3.b
    public final void o(a aVar, int i4) {
        k3.h.e(aVar, "buffer");
        int e4 = C3.a.e(this, 0);
        int i5 = 0;
        while (i5 < i4) {
            int[] iArr = this.f271q;
            int i6 = e4 == 0 ? 0 : iArr[e4 - 1];
            int i7 = iArr[e4] - i6;
            byte[][] bArr = this.f270p;
            int i8 = iArr[bArr.length + e4];
            int min = Math.min(i4, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            q qVar = new q(bArr[e4], i9, i9 + min, true);
            q qVar2 = aVar.f223l;
            if (qVar2 == null) {
                qVar.f266g = qVar;
                qVar.f265f = qVar;
                aVar.f223l = qVar;
            } else {
                q qVar3 = qVar2.f266g;
                k3.h.b(qVar3);
                qVar3.b(qVar);
            }
            i5 += min;
            e4++;
        }
        aVar.f224m += i4;
    }

    public final byte[] p() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f270p;
        int length = bArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f271q;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            int i9 = i8 - i5;
            a3.c.g0(i6, i7, i7 + i9, bArr2[i4], bArr);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // B3.b
    public final String toString() {
        return new b(p()).toString();
    }
}
