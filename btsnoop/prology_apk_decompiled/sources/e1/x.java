package e1;

import B2.AbstractC0007h;

/* loaded from: classes.dex */
public final class x implements H {

    /* renamed from: a, reason: collision with root package name */
    public final i f5404a;

    /* renamed from: b, reason: collision with root package name */
    public final W.q f5405b = new W.q(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f5406c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f5407d;

    /* renamed from: e, reason: collision with root package name */
    public W.w f5408e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5410g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5411h;

    /* renamed from: i, reason: collision with root package name */
    public int f5412i;

    /* renamed from: j, reason: collision with root package name */
    public int f5413j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5414k;

    /* renamed from: l, reason: collision with root package name */
    public long f5415l;

    public x(i iVar) {
        this.f5404a = iVar;
    }

    @Override // e1.H
    public final void a(W.w wVar, y0.q qVar, G g4) {
        this.f5408e = wVar;
        this.f5404a.f(qVar, g4);
    }

    @Override // e1.H
    public final void b() {
        this.f5406c = 0;
        this.f5407d = 0;
        this.f5411h = false;
        this.f5404a.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [W.q] */
    /* JADX WARN: Type inference failed for: r3v0, types: [e1.i] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // e1.H
    public final void c(int i4, W.r rVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        W.a.k(this.f5408e);
        int i10 = i4 & 1;
        ?? r32 = this.f5404a;
        int i11 = -1;
        int i12 = 3;
        int i13 = 2;
        ?? r9 = 0;
        if (i10 != 0) {
            int i14 = this.f5406c;
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    W.a.A("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f5413j != -1) {
                        W.a.A("PesReader", "Unexpected start indicator: expected " + this.f5413j + " more bytes");
                    }
                    r32.e(rVar.f2696c == 0);
                }
            }
            this.f5406c = 1;
            this.f5407d = 0;
        }
        int i15 = i4;
        while (rVar.a() > 0) {
            int i16 = this.f5406c;
            if (i16 != 0) {
                ?? r11 = this.f5405b;
                if (i16 == 1) {
                    i6 = i12;
                    int i17 = r9;
                    if (d(rVar, r11.f2689d, 9)) {
                        r11.q(i17);
                        int i18 = r11.i(24);
                        if (i18 != 1) {
                            AbstractC0007h.o(i18, "Unexpected start code prefix: ", "PesReader");
                            this.f5413j = -1;
                            i5 = -1;
                            i9 = 0;
                            i7 = 2;
                        } else {
                            r11.t(8);
                            int i19 = r11.i(16);
                            r11.t(5);
                            this.f5414k = r11.h();
                            i7 = 2;
                            r11.t(2);
                            this.f5409f = r11.h();
                            this.f5410g = r11.h();
                            r11.t(6);
                            int i20 = r11.i(8);
                            this.f5412i = i20;
                            if (i19 == 0) {
                                this.f5413j = -1;
                                i5 = -1;
                            } else {
                                int i21 = (i19 - 3) - i20;
                                this.f5413j = i21;
                                if (i21 < 0) {
                                    W.a.A("PesReader", "Found negative packet payload size: " + this.f5413j);
                                    i5 = -1;
                                    this.f5413j = -1;
                                } else {
                                    i5 = -1;
                                }
                            }
                            i9 = 2;
                        }
                        this.f5406c = i9;
                        i8 = 0;
                        this.f5407d = 0;
                    } else {
                        i8 = i17;
                        i5 = -1;
                        i7 = 2;
                    }
                } else if (i16 == i13) {
                    if (d(rVar, r11.f2689d, Math.min(10, this.f5412i)) && d(rVar, null, this.f5412i)) {
                        r11.q(r9);
                        this.f5415l = -9223372036854775807L;
                        if (this.f5409f) {
                            r11.t(4);
                            r11.t(1);
                            r11.t(1);
                            long i22 = (r11.i(i12) << 30) | (r11.i(15) << 15) | r11.i(15);
                            r11.t(1);
                            if (!this.f5411h && this.f5410g) {
                                r11.t(4);
                                r11.t(1);
                                r11.t(1);
                                r11.t(1);
                                this.f5408e.b((r11.i(15) << 15) | (r11.i(i12) << 30) | r11.i(15));
                                this.f5411h = true;
                            }
                            this.f5415l = this.f5408e.b(i22);
                        }
                        i15 |= this.f5414k ? 4 : 0;
                        r32.g(this.f5415l, i15);
                        this.f5406c = 3;
                        this.f5407d = 0;
                        r9 = 0;
                        i13 = 2;
                        i12 = 3;
                        i11 = -1;
                    } else {
                        i6 = i12;
                        i5 = -1;
                        int i23 = r9;
                        i7 = i13;
                        i8 = i23;
                    }
                } else {
                    if (i16 != i12) {
                        throw new IllegalStateException();
                    }
                    int a4 = rVar.a();
                    int i24 = this.f5413j;
                    int i25 = i24 == i11 ? r9 : a4 - i24;
                    if (i25 > 0) {
                        a4 -= i25;
                        rVar.F(rVar.f2695b + a4);
                    }
                    r32.d(rVar);
                    int i26 = this.f5413j;
                    if (i26 != i11) {
                        int i27 = i26 - a4;
                        this.f5413j = i27;
                        if (i27 == 0) {
                            r32.e(r9);
                            this.f5406c = 1;
                            this.f5407d = r9;
                        }
                    }
                    int i28 = i12;
                    i5 = i11;
                    i6 = i28;
                    int i29 = r9;
                    i7 = i13;
                    i8 = i29;
                }
            } else {
                int i30 = i12;
                i5 = i11;
                i6 = i30;
                int i31 = r9;
                i7 = i13;
                i8 = i31;
                rVar.H(rVar.a());
            }
            int i32 = i5;
            i12 = i6;
            i11 = i32;
            int i33 = i7;
            r9 = i8;
            i13 = i33;
        }
    }

    public final boolean d(W.r rVar, byte[] bArr, int i4) {
        int min = Math.min(rVar.a(), i4 - this.f5407d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            rVar.H(min);
        } else {
            rVar.f(bArr, this.f5407d, min);
        }
        int i5 = this.f5407d + min;
        this.f5407d = i5;
        return i5 == i4;
    }
}
