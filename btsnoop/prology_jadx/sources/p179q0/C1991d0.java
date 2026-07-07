package p179q0;

/* renamed from: q0.d0 */
/* loaded from: classes.dex */
public final class C1991d0 {

    /* renamed from: a */
    public final java.util.Random f8128a;

    /* renamed from: b */
    public final int[] f8129b;

    /* renamed from: c */
    public final int[] f8130c;

    public C1991d0() {
        this(new java.util.Random());
    }

    /* renamed from: a */
    public final p179q0.C1991d0 m4044a() {
        return new p179q0.C1991d0(new java.util.Random(this.f8128a.nextLong()));
    }

    /* renamed from: b */
    public final p179q0.C1991d0 m4045b(int i4, int i5) {
        int[] iArr;
        java.util.Random random;
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int i6 = 0;
        while (true) {
            iArr = this.f8129b;
            random = this.f8128a;
            if (i6 >= i5) {
                break;
            }
            iArr2[i6] = random.nextInt(iArr.length + 1);
            int i7 = i6 + 1;
            int nextInt = random.nextInt(i7);
            iArr3[i6] = iArr3[nextInt];
            iArr3[nextInt] = i6 + i4;
            i6 = i7;
        }
        java.util.Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i5];
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < iArr.length + i5; i10++) {
            if (i8 >= i5 || i9 != iArr2[i8]) {
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                iArr4[i10] = i12;
                if (i12 >= i4) {
                    iArr4[i10] = i12 + i5;
                }
                i9 = i11;
            } else {
                iArr4[i10] = iArr3[i8];
                i8++;
            }
        }
        return new p179q0.C1991d0(iArr4, new java.util.Random(random.nextLong()));
    }

    /* renamed from: c */
    public final p179q0.C1991d0 m4046c(int i4, int i5) {
        int i6 = i5 - i4;
        int[] iArr = this.f8129b;
        int[] iArr2 = new int[iArr.length - i6];
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            if (i9 < i4 || i9 >= i5) {
                int i10 = i8 - i7;
                if (i9 >= i4) {
                    i9 -= i6;
                }
                iArr2[i10] = i9;
            } else {
                i7++;
            }
        }
        return new p179q0.C1991d0(iArr2, new java.util.Random(this.f8128a.nextLong()));
    }

    public C1991d0(int[] iArr, java.util.Random random) {
        this.f8129b = iArr;
        this.f8128a = random;
        this.f8130c = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f8130c[iArr[i4]] = i4;
        }
    }

    public C1991d0(java.util.Random random) {
        this(new int[0], random);
    }
}
