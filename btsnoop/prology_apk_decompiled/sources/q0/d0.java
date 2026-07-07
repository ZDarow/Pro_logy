package q0;

import java.util.Arrays;
import java.util.Random;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Random f7825a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7826b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7827c;

    public d0() {
        this(new Random());
    }

    public final d0 a() {
        return new d0(new Random(this.f7825a.nextLong()));
    }

    public final d0 b(int i4, int i5) {
        int[] iArr;
        Random random;
        int[] iArr2 = new int[i5];
        int[] iArr3 = new int[i5];
        int i6 = 0;
        while (true) {
            iArr = this.f7826b;
            random = this.f7825a;
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
        Arrays.sort(iArr2);
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
        return new d0(iArr4, new Random(random.nextLong()));
    }

    public final d0 c(int i4, int i5) {
        int i6 = i5 - i4;
        int[] iArr = this.f7826b;
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
        return new d0(iArr2, new Random(this.f7825a.nextLong()));
    }

    public d0(int[] iArr, Random random) {
        this.f7826b = iArr;
        this.f7825a = random;
        this.f7827c = new int[iArr.length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f7827c[iArr[i4]] = i4;
        }
    }

    public d0(Random random) {
        this(new int[0], random);
    }
}
