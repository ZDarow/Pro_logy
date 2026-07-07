package Q0;

import y0.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f1700d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1701a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f1702b;

    /* renamed from: c, reason: collision with root package name */
    public int f1703c;

    public static long a(int i4, boolean z4, byte[] bArr) {
        long j4 = bArr[0] & 255;
        if (z4) {
            j4 &= ~f1700d[i4 - 1];
        }
        for (int i5 = 1; i5 < i4; i5++) {
            j4 = (j4 << 8) | (bArr[i5] & 255);
        }
        return j4;
    }

    public static int b(int i4) {
        for (int i5 = 0; i5 < 8; i5++) {
            if ((f1700d[i5] & i4) != 0) {
                return i5 + 1;
            }
        }
        return -1;
    }

    public final long c(l lVar, boolean z4, boolean z5, int i4) {
        int i5 = this.f1702b;
        byte[] bArr = this.f1701a;
        if (i5 == 0) {
            if (!lVar.k(bArr, 0, 1, z4)) {
                return -1L;
            }
            int b4 = b(bArr[0] & 255);
            this.f1703c = b4;
            if (b4 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f1702b = 1;
        }
        int i6 = this.f1703c;
        if (i6 > i4) {
            this.f1702b = 0;
            return -2L;
        }
        if (i6 != 1) {
            lVar.k(bArr, 1, i6 - 1, false);
        }
        this.f1702b = 0;
        return a(this.f1703c, z5, bArr);
    }
}
