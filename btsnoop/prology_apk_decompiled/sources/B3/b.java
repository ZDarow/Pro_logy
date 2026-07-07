package B3;

import a.AbstractC0110a;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class b implements Serializable, Comparable {

    /* renamed from: o, reason: collision with root package name */
    public static final b f225o = new b(new byte[0]);

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f226l;

    /* renamed from: m, reason: collision with root package name */
    public transient int f227m;

    /* renamed from: n, reason: collision with root package name */
    public transient String f228n;

    public b(byte[] bArr) {
        k3.h.e(bArr, "data");
        this.f226l = bArr;
    }

    public static int e(b bVar, b bVar2) {
        bVar.getClass();
        k3.h.e(bVar2, "other");
        return bVar.d(bVar2.f226l, 0);
    }

    public static int i(b bVar, b bVar2) {
        bVar.getClass();
        k3.h.e(bVar2, "other");
        return bVar.h(bVar2.f226l, -1234567890);
    }

    public static /* synthetic */ b m(b bVar, int i4, int i5, int i6) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = -1234567890;
        }
        return bVar.l(i4, i5);
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
    public final int compareTo(B3.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            k3.h.e(r10, r0)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
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
        throw new UnsupportedOperationException("Method not decompiled: B3.b.compareTo(B3.b):int");
    }

    public int b() {
        return this.f226l.length;
    }

    public String c() {
        byte[] bArr = this.f226l;
        char[] cArr = new char[bArr.length * 2];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            char[] cArr2 = C3.a.f381a;
            cArr[i4] = cArr2[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = cArr2[b4 & 15];
        }
        return new String(cArr);
    }

    public int d(byte[] bArr, int i4) {
        k3.h.e(bArr, "other");
        byte[] bArr2 = this.f226l;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i4, 0);
        if (max <= length) {
            while (!U1.a.a(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int b4 = bVar.b();
            byte[] bArr = this.f226l;
            if (b4 == bArr.length && bVar.j(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f226l;
    }

    public byte g(int i4) {
        return this.f226l[i4];
    }

    public int h(byte[] bArr, int i4) {
        k3.h.e(bArr, "other");
        if (i4 == -1234567890) {
            i4 = b();
        }
        byte[] bArr2 = this.f226l;
        for (int min = Math.min(i4, bArr2.length - bArr.length); -1 < min; min--) {
            if (U1.a.a(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int i4 = this.f227m;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = Arrays.hashCode(this.f226l);
        this.f227m = hashCode;
        return hashCode;
    }

    public boolean j(int i4, int i5, int i6, byte[] bArr) {
        k3.h.e(bArr, "other");
        if (i4 >= 0) {
            byte[] bArr2 = this.f226l;
            if (i4 <= bArr2.length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && U1.a.a(i4, i5, i6, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean k(int i4, b bVar, int i5) {
        k3.h.e(bVar, "other");
        return bVar.j(0, i4, i5, this.f226l);
    }

    public b l(int i4, int i5) {
        if (i5 == -1234567890) {
            i5 = b();
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f226l;
        if (i5 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (i5 - i4 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i4 == 0 && i5 == bArr.length) {
            return this;
        }
        AbstractC0110a.o(i5, bArr.length);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        k3.h.d(copyOfRange, "copyOfRange(...)");
        return new b(copyOfRange);
    }

    public final String n() {
        String str = this.f228n;
        if (str != null) {
            return str;
        }
        byte[] f4 = f();
        k3.h.e(f4, "<this>");
        String str2 = new String(f4, q3.a.f7945a);
        this.f228n = str2;
        return str2;
    }

    public void o(a aVar, int i4) {
        k3.h.e(aVar, "buffer");
        aVar.n(this.f226l, 0, i4);
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
        throw new UnsupportedOperationException("Method not decompiled: B3.b.toString():java.lang.String");
    }
}
