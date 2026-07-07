package e1;

import T.C0094o;
import T.C0095p;
import y0.AbstractC0619b;
import y0.C0620c;

/* renamed from: e1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5148a;

    /* renamed from: b, reason: collision with root package name */
    public final W.q f5149b;

    /* renamed from: c, reason: collision with root package name */
    public final W.r f5150c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5151d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5152e;

    /* renamed from: f, reason: collision with root package name */
    public String f5153f;

    /* renamed from: g, reason: collision with root package name */
    public y0.F f5154g;

    /* renamed from: h, reason: collision with root package name */
    public int f5155h;

    /* renamed from: i, reason: collision with root package name */
    public int f5156i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5157j;

    /* renamed from: k, reason: collision with root package name */
    public long f5158k;

    /* renamed from: l, reason: collision with root package name */
    public C0095p f5159l;

    /* renamed from: m, reason: collision with root package name */
    public int f5160m;

    /* renamed from: n, reason: collision with root package name */
    public long f5161n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0258b() {
        this(0, 0, null);
        this.f5148a = 0;
    }

    private final void a(boolean z4) {
    }

    private final void c(boolean z4) {
    }

    @Override // e1.i
    public final void b() {
        switch (this.f5148a) {
            case 0:
                this.f5155h = 0;
                this.f5156i = 0;
                this.f5157j = false;
                this.f5161n = -9223372036854775807L;
                return;
            default:
                this.f5155h = 0;
                this.f5156i = 0;
                this.f5157j = false;
                this.f5161n = -9223372036854775807L;
                return;
        }
    }

    @Override // e1.i
    public final void d(W.r rVar) {
        switch (this.f5148a) {
            case 0:
                W.a.k(this.f5154g);
                while (rVar.a() > 0) {
                    int i4 = this.f5155h;
                    W.r rVar2 = this.f5150c;
                    if (i4 == 0) {
                        while (true) {
                            if (rVar.a() <= 0) {
                                break;
                            }
                            if (this.f5157j) {
                                int u4 = rVar.u();
                                if (u4 == 119) {
                                    this.f5157j = false;
                                    this.f5155h = 1;
                                    byte[] bArr = rVar2.f2694a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f5156i = 2;
                                } else {
                                    this.f5157j = u4 == 11;
                                }
                            } else {
                                this.f5157j = rVar.u() == 11;
                            }
                        }
                    } else if (i4 == 1) {
                        byte[] bArr2 = rVar2.f2694a;
                        int min = Math.min(rVar.a(), 128 - this.f5156i);
                        rVar.f(bArr2, this.f5156i, min);
                        int i5 = this.f5156i + min;
                        this.f5156i = i5;
                        if (i5 == 128) {
                            W.q qVar = this.f5149b;
                            qVar.q(0);
                            C0620c o2 = AbstractC0619b.o(qVar);
                            C0095p c0095p = this.f5159l;
                            int i6 = o2.f9038b;
                            int i7 = o2.f9039c;
                            String str = o2.f9037a;
                            if (c0095p == null || i7 != c0095p.f2303A || i6 != c0095p.f2304B || !W.y.a(str, c0095p.f2325m)) {
                                C0094o c0094o = new C0094o();
                                c0094o.f2279a = this.f5153f;
                                c0094o.f2290l = T.H.l(str);
                                c0094o.f2302z = i7;
                                c0094o.f2270A = i6;
                                c0094o.f2282d = this.f5151d;
                                c0094o.f2284f = this.f5152e;
                                int i8 = o2.f9042f;
                                c0094o.f2286h = i8;
                                if ("audio/ac3".equals(str)) {
                                    c0094o.f2285g = i8;
                                }
                                C0095p c0095p2 = new C0095p(c0094o);
                                this.f5159l = c0095p2;
                                this.f5154g.c(c0095p2);
                            }
                            this.f5160m = o2.f9040d;
                            this.f5158k = (o2.f9041e * 1000000) / this.f5159l.f2304B;
                            rVar2.G(0);
                            this.f5154g.a(rVar2, 128, 0);
                            this.f5155h = 2;
                        }
                    } else if (i4 == 2) {
                        int min2 = Math.min(rVar.a(), this.f5160m - this.f5156i);
                        this.f5154g.a(rVar, min2, 0);
                        int i9 = this.f5156i + min2;
                        this.f5156i = i9;
                        if (i9 == this.f5160m) {
                            W.a.j(this.f5161n != -9223372036854775807L);
                            this.f5154g.b(this.f5161n, 1, this.f5160m, 0, null);
                            this.f5161n += this.f5158k;
                            this.f5155h = 0;
                        }
                    }
                }
                return;
            default:
                W.a.k(this.f5154g);
                while (rVar.a() > 0) {
                    int i10 = this.f5155h;
                    W.r rVar3 = this.f5150c;
                    if (i10 == 0) {
                        while (rVar.a() > 0) {
                            if (this.f5157j) {
                                int u5 = rVar.u();
                                this.f5157j = u5 == 172;
                                if (u5 == 64 || u5 == 65) {
                                    boolean z4 = u5 == 65;
                                    this.f5155h = 1;
                                    byte[] bArr3 = rVar3.f2694a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (z4 ? 65 : 64);
                                    this.f5156i = 2;
                                }
                            } else {
                                this.f5157j = rVar.u() == 172;
                            }
                        }
                    } else if (i10 == 1) {
                        byte[] bArr4 = rVar3.f2694a;
                        int min3 = Math.min(rVar.a(), 16 - this.f5156i);
                        rVar.f(bArr4, this.f5156i, min3);
                        int i11 = this.f5156i + min3;
                        this.f5156i = i11;
                        if (i11 == 16) {
                            W.q qVar2 = this.f5149b;
                            qVar2.q(0);
                            A0.c p2 = AbstractC0619b.p(qVar2);
                            C0095p c0095p3 = this.f5159l;
                            int i12 = p2.f7a;
                            if (c0095p3 == null || 2 != c0095p3.f2303A || i12 != c0095p3.f2304B || !"audio/ac4".equals(c0095p3.f2325m)) {
                                C0094o c0094o2 = new C0094o();
                                c0094o2.f2279a = this.f5153f;
                                c0094o2.f2290l = T.H.l("audio/ac4");
                                c0094o2.f2302z = 2;
                                c0094o2.f2270A = i12;
                                c0094o2.f2282d = this.f5151d;
                                c0094o2.f2284f = this.f5152e;
                                C0095p c0095p4 = new C0095p(c0094o2);
                                this.f5159l = c0095p4;
                                this.f5154g.c(c0095p4);
                            }
                            this.f5160m = p2.f8b;
                            this.f5158k = (p2.f9c * 1000000) / this.f5159l.f2304B;
                            rVar3.G(0);
                            this.f5154g.a(rVar3, 16, 0);
                            this.f5155h = 2;
                        }
                    } else if (i10 == 2) {
                        int min4 = Math.min(rVar.a(), this.f5160m - this.f5156i);
                        this.f5154g.a(rVar, min4, 0);
                        int i13 = this.f5156i + min4;
                        this.f5156i = i13;
                        if (i13 == this.f5160m) {
                            W.a.j(this.f5161n != -9223372036854775807L);
                            this.f5154g.b(this.f5161n, 1, this.f5160m, 0, null);
                            this.f5161n += this.f5158k;
                            this.f5155h = 0;
                        }
                    }
                }
                return;
        }
    }

    @Override // e1.i
    public final void e(boolean z4) {
        int i4 = this.f5148a;
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        switch (this.f5148a) {
            case 0:
                g4.a();
                g4.c();
                this.f5153f = (String) g4.f5144e;
                g4.c();
                this.f5154g = qVar.v(g4.f5142c, 1);
                return;
            default:
                g4.a();
                g4.c();
                this.f5153f = (String) g4.f5144e;
                g4.c();
                this.f5154g = qVar.v(g4.f5142c, 1);
                return;
        }
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        switch (this.f5148a) {
            case 0:
                this.f5161n = j4;
                return;
            default:
                this.f5161n = j4;
                return;
        }
    }

    public C0258b(int i4, int i5, String str) {
        this.f5148a = i5;
        switch (i5) {
            case 1:
                W.q qVar = new W.q(new byte[16], 16);
                this.f5149b = qVar;
                this.f5150c = new W.r(qVar.f2689d);
                this.f5155h = 0;
                this.f5156i = 0;
                this.f5157j = false;
                this.f5161n = -9223372036854775807L;
                this.f5151d = str;
                this.f5152e = i4;
                return;
            default:
                W.q qVar2 = new W.q(new byte[128], 128);
                this.f5149b = qVar2;
                this.f5150c = new W.r(qVar2.f2689d);
                this.f5155h = 0;
                this.f5161n = -9223372036854775807L;
                this.f5151d = str;
                this.f5152e = i4;
                return;
        }
    }
}
