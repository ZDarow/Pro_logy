package e1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final y0.F f5251a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5252b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5253c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5254d;

    /* renamed from: e, reason: collision with root package name */
    public int f5255e;

    /* renamed from: f, reason: collision with root package name */
    public int f5256f;

    /* renamed from: g, reason: collision with root package name */
    public long f5257g;

    /* renamed from: h, reason: collision with root package name */
    public long f5258h;

    public m(y0.F f4) {
        this.f5251a = f4;
    }

    public final void a(byte[] bArr, int i4, int i5) {
        if (this.f5253c) {
            int i6 = this.f5256f;
            int i7 = (i4 + 1) - i6;
            if (i7 >= i5) {
                this.f5256f = (i5 - i4) + i6;
            } else {
                this.f5254d = ((bArr[i7] & 192) >> 6) == 0;
                this.f5253c = false;
            }
        }
    }

    public final void b(int i4, long j4, boolean z4) {
        W.a.j(this.f5258h != -9223372036854775807L);
        if (this.f5255e == 182 && z4 && this.f5252b) {
            this.f5251a.b(this.f5258h, this.f5254d ? 1 : 0, (int) (j4 - this.f5257g), i4, null);
        }
        if (this.f5255e != 179) {
            this.f5257g = j4;
        }
    }
}
