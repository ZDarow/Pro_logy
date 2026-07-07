package p123e1;

/* renamed from: e1.y */
/* loaded from: classes.dex */
public final class C1351y {

    /* renamed from: a */
    public final /* synthetic */ int f5610a;

    /* renamed from: b */
    public final p086W.C0803w f5611b;

    /* renamed from: c */
    public final p086W.C0798r f5612c;

    /* renamed from: d */
    public boolean f5613d;

    /* renamed from: e */
    public boolean f5614e;

    /* renamed from: f */
    public boolean f5615f;

    /* renamed from: g */
    public long f5616g;

    /* renamed from: h */
    public long f5617h;

    /* renamed from: i */
    public long f5618i;

    public C1351y(int i4) {
        this.f5610a = i4;
        switch (i4) {
            case 1:
                this.f5611b = new p086W.C0803w(0L);
                this.f5616g = -9223372036854775807L;
                this.f5617h = -9223372036854775807L;
                this.f5618i = -9223372036854775807L;
                this.f5612c = new p086W.C0798r();
                return;
            default:
                this.f5611b = new p086W.C0803w(0L);
                this.f5616g = -9223372036854775807L;
                this.f5617h = -9223372036854775807L;
                this.f5618i = -9223372036854775807L;
                this.f5612c = new p086W.C0798r();
                return;
        }
    }

    /* renamed from: b */
    public static int m3109b(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    /* renamed from: c */
    public static long m3110c(p086W.C0798r c0798r) {
        int i4 = c0798r.f2787b;
        if (c0798r.m1539a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c0798r.m1544f(bArr, 0, 9);
        c0798r.m1537G(i4);
        byte b4 = bArr[0];
        if ((b4 & 196) == 68) {
            byte b5 = bArr[2];
            if ((b5 & 4) == 4) {
                byte b6 = bArr[4];
                if ((b6 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j4 = b4;
                    long j5 = b5;
                    return ((j5 & 3) << 13) | ((j4 & 3) << 28) | (((56 & j4) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j5 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b6 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m3111a(p215y0.C2400l c2400l) {
        switch (this.f5610a) {
            case 0:
                byte[] bArr = p086W.AbstractC0805y.f2806f;
                p086W.C0798r c0798r = this.f5612c;
                c0798r.getClass();
                c0798r.m1535E(bArr, bArr.length);
                this.f5613d = true;
                c2400l.f9452q = 0;
                return;
            default:
                byte[] bArr2 = p086W.AbstractC0805y.f2806f;
                p086W.C0798r c0798r2 = this.f5612c;
                c0798r2.getClass();
                c0798r2.m1535E(bArr2, bArr2.length);
                this.f5613d = true;
                c2400l.f9452q = 0;
                return;
        }
    }
}
