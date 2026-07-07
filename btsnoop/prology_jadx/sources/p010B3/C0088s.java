package p010B3;

/* renamed from: B3.s */
/* loaded from: classes.dex */
public final class C0088s extends p010B3.C0071b {

    /* renamed from: p */
    public final transient byte[][] f275p;

    /* renamed from: q */
    public final transient int[] f276q;

    public C0088s(byte[][] bArr, int[] iArr) {
        super(p010B3.C0071b.f230o.f231l);
        this.f275p = bArr;
        this.f276q = iArr;
    }

    @Override // p010B3.C0071b
    /* renamed from: b */
    public final int mo310b() {
        return this.f276q[this.f275p.length - 1];
    }

    @Override // p010B3.C0071b
    /* renamed from: c */
    public final java.lang.String mo311c() {
        return new p010B3.C0071b(m353p()).mo311c();
    }

    @Override // p010B3.C0071b
    /* renamed from: d */
    public final int mo312d(byte[] bArr, int i4) {
        p154k3.AbstractC1803h.m3779e(bArr, "other");
        return new p010B3.C0071b(m353p()).mo312d(bArr, i4);
    }

    @Override // p010B3.C0071b
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p010B3.C0071b) {
            p010B3.C0071b c0071b = (p010B3.C0071b) obj;
            if (c0071b.mo310b() == mo310b() && mo317k(0, c0071b, mo310b())) {
                return true;
            }
        }
        return false;
    }

    @Override // p010B3.C0071b
    /* renamed from: f */
    public final byte[] mo313f() {
        return m353p();
    }

    @Override // p010B3.C0071b
    /* renamed from: g */
    public final byte mo314g(int i4) {
        byte[][] bArr = this.f275p;
        int length = bArr.length - 1;
        int[] iArr = this.f276q;
        p080U1.AbstractC0748a.m1371d(iArr[length], i4, 1L);
        int m494e = p014C3.AbstractC0144a.m494e(this, i4);
        return bArr[m494e][(i4 - (m494e == 0 ? 0 : iArr[m494e - 1])) + iArr[bArr.length + m494e]];
    }

    @Override // p010B3.C0071b
    /* renamed from: h */
    public final int mo315h(byte[] bArr, int i4) {
        p154k3.AbstractC1803h.m3779e(bArr, "other");
        return new p010B3.C0071b(m353p()).mo315h(bArr, i4);
    }

    @Override // p010B3.C0071b
    public final int hashCode() {
        int i4 = this.f232m;
        if (i4 != 0) {
            return i4;
        }
        byte[][] bArr = this.f275p;
        int length = bArr.length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int[] iArr = this.f276q;
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
        this.f232m = i6;
        return i6;
    }

    @Override // p010B3.C0071b
    /* renamed from: j */
    public final boolean mo316j(int i4, int i5, int i6, byte[] bArr) {
        p154k3.AbstractC1803h.m3779e(bArr, "other");
        if (i4 < 0 || i4 > mo310b() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int m494e = p014C3.AbstractC0144a.m494e(this, i4);
        while (i4 < i7) {
            int[] iArr = this.f276q;
            int i8 = m494e == 0 ? 0 : iArr[m494e - 1];
            int i9 = iArr[m494e] - i8;
            byte[][] bArr2 = this.f275p;
            int i10 = iArr[bArr2.length + m494e];
            int min = java.lang.Math.min(i7, i9 + i8) - i4;
            if (!p080U1.AbstractC0748a.m1368a((i4 - i8) + i10, i5, min, bArr2[m494e], bArr)) {
                return false;
            }
            i5 += min;
            i4 += min;
            m494e++;
        }
        return true;
    }

    @Override // p010B3.C0071b
    /* renamed from: k */
    public final boolean mo317k(int i4, p010B3.C0071b c0071b, int i5) {
        p154k3.AbstractC1803h.m3779e(c0071b, "other");
        if (i4 < 0 || i4 > mo310b() - i5) {
            return false;
        }
        int i6 = i5 + i4;
        int m494e = p014C3.AbstractC0144a.m494e(this, i4);
        int i7 = 0;
        while (i4 < i6) {
            int[] iArr = this.f276q;
            int i8 = m494e == 0 ? 0 : iArr[m494e - 1];
            int i9 = iArr[m494e] - i8;
            byte[][] bArr = this.f275p;
            int i10 = iArr[bArr.length + m494e];
            int min = java.lang.Math.min(i6, i9 + i8) - i4;
            if (!c0071b.mo316j(i7, (i4 - i8) + i10, min, bArr[m494e])) {
                return false;
            }
            i7 += min;
            i4 += min;
            m494e++;
        }
        return true;
    }

    @Override // p010B3.C0071b
    /* renamed from: l */
    public final p010B3.C0071b mo318l(int i4, int i5) {
        if (i5 == -1234567890) {
            i5 = mo310b();
        }
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m151j(i4, "beginIndex=", " < 0").toString());
        }
        if (i5 > mo310b()) {
            throw new java.lang.IllegalArgumentException(("endIndex=" + i5 + " > length(" + mo310b() + ')').toString());
        }
        int i6 = i5 - i4;
        if (i6 < 0) {
            throw new java.lang.IllegalArgumentException(p009B2.AbstractC0051h.m150i(i5, i4, "endIndex=", " < beginIndex=").toString());
        }
        if (i4 == 0 && i5 == mo310b()) {
            return this;
        }
        if (i4 == i5) {
            return p010B3.C0071b.f230o;
        }
        int m494e = p014C3.AbstractC0144a.m494e(this, i4);
        int m494e2 = p014C3.AbstractC0144a.m494e(this, i5 - 1);
        int i7 = m494e2 + 1;
        byte[][] bArr = this.f275p;
        p154k3.AbstractC1803h.m3779e(bArr, "<this>");
        p101a.AbstractC0936a.m1807o(i7, bArr.length);
        java.lang.Object[] copyOfRange = java.util.Arrays.copyOfRange(bArr, m494e, i7);
        p154k3.AbstractC1803h.m3778d(copyOfRange, "copyOfRange(...)");
        byte[][] bArr2 = (byte[][]) copyOfRange;
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f276q;
        if (m494e <= m494e2) {
            int i8 = m494e;
            int i9 = 0;
            while (true) {
                iArr[i9] = java.lang.Math.min(iArr2[i8] - i4, i6);
                int i10 = i9 + 1;
                iArr[i9 + bArr2.length] = iArr2[bArr.length + i8];
                if (i8 == m494e2) {
                    break;
                }
                i8++;
                i9 = i10;
            }
        }
        int i11 = m494e != 0 ? iArr2[m494e - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i4 - i11) + iArr[length];
        return new p010B3.C0088s(bArr2, iArr);
    }

    @Override // p010B3.C0071b
    /* renamed from: o */
    public final void mo320o(p010B3.C0070a c0070a, int i4) {
        p154k3.AbstractC1803h.m3779e(c0070a, "buffer");
        int m494e = p014C3.AbstractC0144a.m494e(this, 0);
        int i5 = 0;
        while (i5 < i4) {
            int[] iArr = this.f276q;
            int i6 = m494e == 0 ? 0 : iArr[m494e - 1];
            int i7 = iArr[m494e] - i6;
            byte[][] bArr = this.f275p;
            int i8 = iArr[bArr.length + m494e];
            int min = java.lang.Math.min(i4, i7 + i6) - i5;
            int i9 = (i5 - i6) + i8;
            p010B3.C0086q c0086q = new p010B3.C0086q(bArr[m494e], i9, i9 + min, true);
            p010B3.C0086q c0086q2 = c0070a.f228l;
            if (c0086q2 == null) {
                c0086q.f271g = c0086q;
                c0086q.f270f = c0086q;
                c0070a.f228l = c0086q;
            } else {
                p010B3.C0086q c0086q3 = c0086q2.f271g;
                p154k3.AbstractC1803h.m3776b(c0086q3);
                c0086q3.m348b(c0086q);
            }
            i5 += min;
            m494e++;
        }
        c0070a.f229m += i4;
    }

    /* renamed from: p */
    public final byte[] m353p() {
        byte[] bArr = new byte[mo310b()];
        byte[][] bArr2 = this.f275p;
        int length = bArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int[] iArr = this.f276q;
            int i7 = iArr[length + i4];
            int i8 = iArr[i4];
            int i9 = i8 - i5;
            p105a3.AbstractC1020c.m2045g0(i6, i7, i7 + i9, bArr2[i4], bArr);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    @Override // p010B3.C0071b
    public final java.lang.String toString() {
        return new p010B3.C0071b(m353p()).toString();
    }
}
