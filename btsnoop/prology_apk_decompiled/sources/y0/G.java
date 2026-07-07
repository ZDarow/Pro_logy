package y0;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f9004a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f9005b;

    /* renamed from: c, reason: collision with root package name */
    public int f9006c;

    /* renamed from: d, reason: collision with root package name */
    public long f9007d;

    /* renamed from: e, reason: collision with root package name */
    public int f9008e;

    /* renamed from: f, reason: collision with root package name */
    public int f9009f;

    /* renamed from: g, reason: collision with root package name */
    public int f9010g;

    public final void a(F f4, E e4) {
        if (this.f9006c > 0) {
            f4.b(this.f9007d, this.f9008e, this.f9009f, this.f9010g, e4);
            this.f9006c = 0;
        }
    }

    public final void b(F f4, long j4, int i4, int i5, int i6, E e4) {
        W.a.i("TrueHD chunk samples must be contiguous in the sample queue.", this.f9010g <= i5 + i6);
        if (this.f9005b) {
            int i7 = this.f9006c;
            int i8 = i7 + 1;
            this.f9006c = i8;
            if (i7 == 0) {
                this.f9007d = j4;
                this.f9008e = i4;
                this.f9009f = 0;
            }
            this.f9009f += i5;
            this.f9010g = i6;
            if (i8 >= 16) {
                a(f4, e4);
            }
        }
    }

    public final void c(p pVar) {
        if (this.f9005b) {
            return;
        }
        byte[] bArr = this.f9004a;
        int i4 = 0;
        pVar.z(bArr, 0, 10);
        pVar.d();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b4 = bArr[7];
            if ((b4 & 254) == 186) {
                i4 = 40 << ((bArr[(b4 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i4 == 0) {
            return;
        }
        this.f9005b = true;
    }
}
