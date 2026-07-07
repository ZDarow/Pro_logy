package p065Q0;

/* renamed from: Q0.e */
/* loaded from: classes.dex */
public final class C0559e {

    /* renamed from: d */
    public static final long[] f1758d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f1759a = new byte[8];

    /* renamed from: b */
    public int f1760b;

    /* renamed from: c */
    public int f1761c;

    /* renamed from: a */
    public static long m1073a(int i4, boolean z4, byte[] bArr) {
        long j4 = bArr[0] & 255;
        if (z4) {
            j4 &= ~f1758d[i4 - 1];
        }
        for (int i5 = 1; i5 < i4; i5++) {
            j4 = (j4 << 8) | (bArr[i5] & 255);
        }
        return j4;
    }

    /* renamed from: b */
    public static int m1074b(int i4) {
        for (int i5 = 0; i5 < 8; i5++) {
            if ((f1758d[i5] & i4) != 0) {
                return i5 + 1;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public final long m1075c(p215y0.C2400l c2400l, boolean z4, boolean z5, int i4) {
        int i5 = this.f1760b;
        byte[] bArr = this.f1759a;
        if (i5 == 0) {
            if (!c2400l.mo631k(bArr, 0, 1, z4)) {
                return -1L;
            }
            int m1074b = m1074b(bArr[0] & 255);
            this.f1761c = m1074b;
            if (m1074b == -1) {
                throw new java.lang.IllegalStateException("No valid varint length mask found");
            }
            this.f1760b = 1;
        }
        int i6 = this.f1761c;
        if (i6 > i4) {
            this.f1760b = 0;
            return -2L;
        }
        if (i6 != 1) {
            c2400l.mo631k(bArr, 1, i6 - 1, false);
        }
        this.f1760b = 0;
        return m1073a(this.f1761c, z5, bArr);
    }
}
