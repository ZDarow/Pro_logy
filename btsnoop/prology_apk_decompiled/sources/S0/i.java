package S0;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final int f1907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1908b;

    /* renamed from: c, reason: collision with root package name */
    public int f1909c;

    /* renamed from: d, reason: collision with root package name */
    public int f1910d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1911e;

    public i(int i4, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f1907a = i5;
        this.f1908b = i6;
        this.f1909c = i7;
        this.f1910d = i8;
        this.f1911e = bArr;
    }

    @Override // S0.f
    public int a() {
        return -1;
    }

    @Override // S0.f
    public int b() {
        return this.f1907a;
    }

    @Override // S0.f
    public int c() {
        W.r rVar = (W.r) this.f1911e;
        int i4 = this.f1908b;
        if (i4 == 8) {
            return rVar.u();
        }
        if (i4 == 16) {
            return rVar.A();
        }
        int i5 = this.f1909c;
        this.f1909c = i5 + 1;
        if (i5 % 2 != 0) {
            return this.f1910d & 15;
        }
        int u4 = rVar.u();
        this.f1910d = u4;
        return (u4 & 240) >> 4;
    }

    public i(b bVar) {
        W.r rVar = bVar.f1884n;
        this.f1911e = rVar;
        rVar.G(12);
        this.f1908b = rVar.y() & 255;
        this.f1907a = rVar.y();
    }
}
