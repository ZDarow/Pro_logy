package e1;

/* loaded from: classes.dex */
public final class C implements H {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0256B f5110a;

    /* renamed from: b, reason: collision with root package name */
    public final W.r f5111b = new W.r(32);

    /* renamed from: c, reason: collision with root package name */
    public int f5112c;

    /* renamed from: d, reason: collision with root package name */
    public int f5113d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5114e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5115f;

    public C(InterfaceC0256B interfaceC0256B) {
        this.f5110a = interfaceC0256B;
    }

    @Override // e1.H
    public final void a(W.w wVar, y0.q qVar, G g4) {
        this.f5110a.a(wVar, qVar, g4);
        this.f5115f = true;
    }

    @Override // e1.H
    public final void b() {
        this.f5115f = true;
    }

    @Override // e1.H
    public final void c(int i4, W.r rVar) {
        boolean z4 = (i4 & 1) != 0;
        int u4 = z4 ? rVar.f2695b + rVar.u() : -1;
        if (this.f5115f) {
            if (!z4) {
                return;
            }
            this.f5115f = false;
            rVar.G(u4);
            this.f5113d = 0;
        }
        while (rVar.a() > 0) {
            int i5 = this.f5113d;
            W.r rVar2 = this.f5111b;
            if (i5 < 3) {
                if (i5 == 0) {
                    int u5 = rVar.u();
                    rVar.G(rVar.f2695b - 1);
                    if (u5 == 255) {
                        this.f5115f = true;
                        return;
                    }
                }
                int min = Math.min(rVar.a(), 3 - this.f5113d);
                rVar.f(rVar2.f2694a, this.f5113d, min);
                int i6 = this.f5113d + min;
                this.f5113d = i6;
                if (i6 == 3) {
                    rVar2.G(0);
                    rVar2.F(3);
                    rVar2.H(1);
                    int u6 = rVar2.u();
                    int u7 = rVar2.u();
                    this.f5114e = (u6 & 128) != 0;
                    int i7 = (((u6 & 15) << 8) | u7) + 3;
                    this.f5112c = i7;
                    byte[] bArr = rVar2.f2694a;
                    if (bArr.length < i7) {
                        rVar2.b(Math.min(4098, Math.max(i7, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(rVar.a(), this.f5112c - this.f5113d);
                rVar.f(rVar2.f2694a, this.f5113d, min2);
                int i8 = this.f5113d + min2;
                this.f5113d = i8;
                int i9 = this.f5112c;
                if (i8 != i9) {
                    continue;
                } else {
                    if (!this.f5114e) {
                        rVar2.F(i9);
                    } else {
                        if (W.y.m(0, i9, -1, rVar2.f2694a) != 0) {
                            this.f5115f = true;
                            return;
                        }
                        rVar2.F(this.f5112c - 4);
                    }
                    rVar2.G(0);
                    this.f5110a.d(rVar2);
                    this.f5113d = 0;
                }
            }
        }
    }
}
