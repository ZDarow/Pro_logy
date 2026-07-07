package p010B3;

/* renamed from: B3.b */
/* loaded from: classes.dex */
public class C0071b implements java.io.Serializable, java.lang.Comparable {

    /* renamed from: o */
    public static final p010B3.C0071b f230o = new p010B3.C0071b(new byte[0]);

    /* renamed from: l */
    public final byte[] f231l;

    /* renamed from: m */
    public transient int f232m;

    /* renamed from: n */
    public transient java.lang.String f233n;

    public C0071b(byte[] bArr) {
        p154k3.AbstractC1803h.m3779e(bArr, "data");
        this.f231l = bArr;
    }

    /* renamed from: e */
    public static int m306e(p010B3.C0071b c0071b, p010B3.C0071b c0071b2) {
        c0071b.getClass();
        p154k3.AbstractC1803h.m3779e(c0071b2, "other");
        return c0071b.mo312d(c0071b2.f231l, 0);
    }

    /* renamed from: i */
    public static int m307i(p010B3.C0071b c0071b, p010B3.C0071b c0071b2) {
        c0071b.getClass();
        p154k3.AbstractC1803h.m3779e(c0071b2, "other");
        return c0071b.mo315h(c0071b2.f231l, -1234567890);
    }

    /* renamed from: m */
    public static /* synthetic */ p010B3.C0071b m308m(p010B3.C0071b c0071b, int i4, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = -1234567890;
        }
        return c0071b.mo318l(i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(p010B3.C0071b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            p154k3.AbstractC1803h.m3779e(r10, r0)
            int r0 = r9.mo310b()
            int r1 = r10.mo310b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.mo314g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.mo314g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p010B3.C0071b.compareTo(B3.b):int");
    }

    /* renamed from: b */
    public int mo310b() {
        return this.f231l.length;
    }

    /* renamed from: c */
    public java.lang.String mo311c() {
        byte[] bArr = this.f231l;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = p014C3.AbstractC0144a.f389a;
            cArr[i4] = cArr2[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new java.lang.String(cArr);
    }

    /* renamed from: d */
    public int mo312d(byte[] bArr, int i4) {
        p154k3.AbstractC1803h.m3779e(bArr, "other");
        byte[] bArr2 = this.f231l;
        int length = bArr2.length - bArr.length;
        int max = java.lang.Math.max(i4, 0);
        if (max <= length) {
            while (!p080U1.AbstractC0748a.m1368a(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p010B3.C0071b) {
            p010B3.C0071b c0071b = (p010B3.C0071b) obj;
            int mo310b = c0071b.mo310b();
            byte[] bArr = this.f231l;
            if (mo310b == bArr.length && c0071b.mo316j(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public byte[] mo313f() {
        return this.f231l;
    }

    /* renamed from: g */
    public byte mo314g(int i4) {
        return this.f231l[i4];
    }

    /* renamed from: h */
    public int mo315h(byte[] bArr, int i4) {
        p154k3.AbstractC1803h.m3779e(bArr, "other");
        if (i4 == -1234567890) {
            i4 = mo310b();
        }
        byte[] bArr2 = this.f231l;
        for (int min = java.lang.Math.min(i4, bArr2.length - bArr.length); -1 < min; min--) {
            if (p080U1.AbstractC0748a.m1368a(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i4 = this.f232m;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = java.util.Arrays.hashCode(this.f231l);
        this.f232m = hashCode;
        return hashCode;
    }

    /* renamed from: j */
    public boolean mo316j(int i4, int i5, int i6, byte[] bArr) {
        p154k3.AbstractC1803h.m3779e(bArr, "other");
        if (i4 >= 0) {
            byte[] bArr2 = this.f231l;
            if (i4 <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && p080U1.AbstractC0748a.m1368a(i4, i5, i6, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo317k(int i4, p010B3.C0071b c0071b, int i5) {
        p154k3.AbstractC1803h.m3779e(c0071b, "other");
        return c0071b.mo316j(0, i4, i5, this.f231l);
    }

    /* renamed from: l */
    public p010B3.C0071b mo318l(int i4, int i5) {
        if (i5 == -1234567890) {
            i5 = mo310b();
        }
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f231l;
        if (i5 > bArr.length) {
            throw new java.lang.IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (i5 - i4 < 0) {
            throw new java.lang.IllegalArgumentException("endIndex < beginIndex");
        }
        if (i4 == 0 && i5 == bArr.length) {
            return this;
        }
        p101a.AbstractC0936a.m1807o(i5, bArr.length);
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, i4, i5);
        p154k3.AbstractC1803h.m3778d(copyOfRange, "copyOfRange(...)");
        return new p010B3.C0071b(copyOfRange);
    }

    /* renamed from: n */
    public final java.lang.String m319n() {
        java.lang.String str = this.f233n;
        if (str != null) {
            return str;
        }
        byte[] mo313f = mo313f();
        p154k3.AbstractC1803h.m3779e(mo313f, "<this>");
        java.lang.String str2 = new java.lang.String(mo313f, p182q3.AbstractC2024a.f8253a);
        this.f233n = str2;
        return str2;
    }

    /* renamed from: o */
    public void mo320o(p010B3.C0070a c0070a, int i4) {
        p154k3.AbstractC1803h.m3779e(c0070a, "buffer");
        c0070a.m303n(this.f231l, 0, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00e8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0120, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0124, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00c8, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0163, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x016a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x015c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x019b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x019e, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01a1, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x01a4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008b, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p010B3.C0071b.toString():java.lang.String");
    }
}
