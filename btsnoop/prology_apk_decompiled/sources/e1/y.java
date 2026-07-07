package e1;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5416a;

    /* renamed from: b, reason: collision with root package name */
    public final W.w f5417b;

    /* renamed from: c, reason: collision with root package name */
    public final W.r f5418c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5419d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5420e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5421f;

    /* renamed from: g, reason: collision with root package name */
    public long f5422g;

    /* renamed from: h, reason: collision with root package name */
    public long f5423h;

    /* renamed from: i, reason: collision with root package name */
    public long f5424i;

    public y(int i4) {
        this.f5416a = i4;
        switch (i4) {
            case 1:
                this.f5417b = new W.w(0L);
                this.f5422g = -9223372036854775807L;
                this.f5423h = -9223372036854775807L;
                this.f5424i = -9223372036854775807L;
                this.f5418c = new W.r();
                return;
            default:
                this.f5417b = new W.w(0L);
                this.f5422g = -9223372036854775807L;
                this.f5423h = -9223372036854775807L;
                this.f5424i = -9223372036854775807L;
                this.f5418c = new W.r();
                return;
        }
    }

    public static int b(byte[] bArr, int i4) {
        return (bArr[i4 + 3] & 255) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4 + 2] & 255) << 8);
    }

    public static long c(W.r rVar) {
        int i4 = rVar.f2695b;
        if (rVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        rVar.f(bArr, 0, 9);
        rVar.G(i4);
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

    public final void a(y0.l lVar) {
        switch (this.f5416a) {
            case 0:
                byte[] bArr = W.y.f2714f;
                W.r rVar = this.f5418c;
                rVar.getClass();
                rVar.E(bArr, bArr.length);
                this.f5419d = true;
                lVar.f9091q = 0;
                return;
            default:
                byte[] bArr2 = W.y.f2714f;
                W.r rVar2 = this.f5418c;
                rVar2.getClass();
                rVar2.E(bArr2, bArr2.length);
                this.f5419d = true;
                lVar.f9091q = 0;
                return;
        }
    }
}
