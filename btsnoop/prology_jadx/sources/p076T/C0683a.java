package p076T;

/* renamed from: T.a */
/* loaded from: classes.dex */
public final class C0683a {

    /* renamed from: a */
    public final int f2297a;

    /* renamed from: b */
    public final int f2298b;

    /* renamed from: c */
    public final android.net.Uri[] f2299c;

    /* renamed from: d */
    public final p076T.C0659B[] f2300d;

    /* renamed from: e */
    public final int[] f2301e;

    /* renamed from: f */
    public final long[] f2302f;

    static {
        p009B2.AbstractC0051h.m155n(0, 1, 2, 3, 4);
        p086W.AbstractC0805y.m1587H(5);
        p086W.AbstractC0805y.m1587H(6);
        p086W.AbstractC0805y.m1587H(7);
        p086W.AbstractC0805y.m1587H(8);
    }

    public C0683a(int i4, int i5, int[] iArr, p076T.C0659B[] c0659bArr, long[] jArr) {
        android.net.Uri uri;
        int i6 = 0;
        p086W.AbstractC0781a.m1416e(iArr.length == c0659bArr.length);
        this.f2297a = i4;
        this.f2298b = i5;
        this.f2301e = iArr;
        this.f2300d = c0659bArr;
        this.f2302f = jArr;
        this.f2299c = new android.net.Uri[c0659bArr.length];
        while (true) {
            android.net.Uri[] uriArr = this.f2299c;
            if (i6 >= uriArr.length) {
                return;
            }
            p076T.C0659B c0659b = c0659bArr[i6];
            if (c0659b == null) {
                uri = null;
            } else {
                p076T.C0711y c0711y = c0659b.f2143b;
                c0711y.getClass();
                uri = c0711y.f2449a;
            }
            uriArr[i6] = uri;
            i6++;
        }
    }

    /* renamed from: a */
    public final int m1262a(int i4) {
        int i5;
        int i6 = i4 + 1;
        while (true) {
            int[] iArr = this.f2301e;
            if (i6 >= iArr.length || (i5 = iArr[i6]) == 0 || i5 == 1) {
                break;
            }
            i6++;
        }
        return i6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p076T.C0683a.class != obj.getClass()) {
            return false;
        }
        p076T.C0683a c0683a = (p076T.C0683a) obj;
        return this.f2297a == c0683a.f2297a && this.f2298b == c0683a.f2298b && java.util.Arrays.equals(this.f2300d, c0683a.f2300d) && java.util.Arrays.equals(this.f2301e, c0683a.f2301e) && java.util.Arrays.equals(this.f2302f, c0683a.f2302f);
    }

    public final int hashCode() {
        int i4 = ((this.f2297a * 31) + this.f2298b) * 31;
        int i5 = (int) 0;
        return (((java.util.Arrays.hashCode(this.f2302f) + ((java.util.Arrays.hashCode(this.f2301e) + ((java.util.Arrays.hashCode(this.f2300d) + ((i4 + i5) * 31)) * 31)) * 31)) * 31) + i5) * 31;
    }
}
