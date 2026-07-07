package p215y0;

/* renamed from: y0.d */
/* loaded from: classes.dex */
public final class C2392d {

    /* renamed from: a */
    public final java.util.ArrayList f9404a;

    /* renamed from: b */
    public final int f9405b;

    /* renamed from: c */
    public final int f9406c;

    /* renamed from: d */
    public final int f9407d;

    /* renamed from: e */
    public final int f9408e;

    /* renamed from: f */
    public final int f9409f;

    /* renamed from: g */
    public final int f9410g;

    /* renamed from: h */
    public final int f9411h;

    /* renamed from: i */
    public final int f9412i;

    /* renamed from: j */
    public final int f9413j;

    /* renamed from: k */
    public final float f9414k;

    /* renamed from: l */
    public final java.lang.String f9415l;

    public C2392d(java.util.ArrayList arrayList, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, float f4, java.lang.String str) {
        this.f9404a = arrayList;
        this.f9405b = i4;
        this.f9406c = i5;
        this.f9407d = i6;
        this.f9408e = i7;
        this.f9409f = i8;
        this.f9410g = i9;
        this.f9411h = i10;
        this.f9412i = i11;
        this.f9413j = i12;
        this.f9414k = f4;
        this.f9415l = str;
    }

    /* renamed from: a */
    public static p215y0.C2392d m4629a(p086W.C0798r c0798r) {
        byte[] bArr;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f4;
        java.lang.String str;
        int i11;
        try {
            c0798r.m1538H(4);
            int m1559u = (c0798r.m1559u() & 3) + 1;
            if (m1559u == 3) {
                throw new java.lang.IllegalStateException();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int m1559u2 = c0798r.m1559u() & 31;
            int i12 = 0;
            while (true) {
                bArr = p086W.AbstractC0781a.f2732a;
                if (i12 >= m1559u2) {
                    break;
                }
                int m1531A = c0798r.m1531A();
                int i13 = c0798r.f2787b;
                c0798r.m1538H(m1531A);
                byte[] bArr2 = c0798r.f2786a;
                byte[] bArr3 = new byte[m1531A + 4];
                java.lang.System.arraycopy(bArr, 0, bArr3, 0, 4);
                java.lang.System.arraycopy(bArr2, i13, bArr3, 4, m1531A);
                arrayList.add(bArr3);
                i12++;
            }
            int m1559u3 = c0798r.m1559u();
            for (int i14 = 0; i14 < m1559u3; i14++) {
                int m1531A2 = c0798r.m1531A();
                int i15 = c0798r.f2787b;
                c0798r.m1538H(m1531A2);
                byte[] bArr4 = c0798r.f2786a;
                byte[] bArr5 = new byte[m1531A2 + 4];
                java.lang.System.arraycopy(bArr, 0, bArr5, 0, 4);
                java.lang.System.arraycopy(bArr4, i15, bArr5, 4, m1531A2);
                arrayList.add(bArr5);
            }
            if (m1559u2 > 0) {
                p090X.C0829f m1668d = p090X.AbstractC0830g.m1668d((byte[]) arrayList.get(0), m1559u, ((byte[]) arrayList.get(0)).length);
                int i16 = m1668d.f2945e;
                int i17 = m1668d.f2946f;
                int i18 = m1668d.f2948h + 8;
                int i19 = m1668d.f2949i + 8;
                int i20 = m1668d.f2956p;
                int i21 = m1668d.f2957q;
                int i22 = m1668d.f2958r;
                int i23 = m1668d.f2959s;
                float f5 = m1668d.f2947g;
                str = p086W.AbstractC0781a.m1413b(m1668d.f2941a, m1668d.f2942b, m1668d.f2943c);
                i9 = i21;
                i10 = i22;
                i11 = i23;
                f4 = f5;
                i5 = i17;
                i6 = i18;
                i7 = i19;
                i8 = i20;
                i4 = i16;
            } else {
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = -1;
                f4 = 1.0f;
                str = null;
                i11 = 16;
            }
            return new p215y0.C2392d(arrayList, m1559u, i4, i5, i6, i7, i8, i9, i10, i11, f4, str);
        } catch (java.lang.ArrayIndexOutOfBoundsException e4) {
            throw p076T.C0666I.m1202a(e4, "Error parsing AVC config");
        }
    }
}
