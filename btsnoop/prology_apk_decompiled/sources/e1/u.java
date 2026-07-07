package e1;

import T.C0094o;
import T.C0095p;

/* loaded from: classes.dex */
public final class u implements i {

    /* renamed from: a, reason: collision with root package name */
    public final W.r f5368a;

    /* renamed from: b, reason: collision with root package name */
    public final y0.x f5369b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5370c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5371d;

    /* renamed from: e, reason: collision with root package name */
    public y0.F f5372e;

    /* renamed from: f, reason: collision with root package name */
    public String f5373f;

    /* renamed from: g, reason: collision with root package name */
    public int f5374g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f5375h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5376i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5377j;

    /* renamed from: k, reason: collision with root package name */
    public long f5378k;

    /* renamed from: l, reason: collision with root package name */
    public int f5379l;

    /* renamed from: m, reason: collision with root package name */
    public long f5380m;

    /* JADX WARN: Type inference failed for: r0v1, types: [y0.x, java.lang.Object] */
    public u(String str, int i4) {
        W.r rVar = new W.r(4);
        this.f5368a = rVar;
        rVar.f2694a[0] = -1;
        this.f5369b = new Object();
        this.f5380m = -9223372036854775807L;
        this.f5370c = str;
        this.f5371d = i4;
    }

    @Override // e1.i
    public final void b() {
        this.f5374g = 0;
        this.f5375h = 0;
        this.f5377j = false;
        this.f5380m = -9223372036854775807L;
    }

    @Override // e1.i
    public final void d(W.r rVar) {
        W.a.k(this.f5372e);
        while (rVar.a() > 0) {
            int i4 = this.f5374g;
            W.r rVar2 = this.f5368a;
            if (i4 == 0) {
                byte[] bArr = rVar.f2694a;
                int i5 = rVar.f2695b;
                int i6 = rVar.f2696c;
                while (true) {
                    if (i5 >= i6) {
                        rVar.G(i6);
                        break;
                    }
                    byte b4 = bArr[i5];
                    boolean z4 = (b4 & 255) == 255;
                    boolean z5 = this.f5377j && (b4 & 224) == 224;
                    this.f5377j = z4;
                    if (z5) {
                        rVar.G(i5 + 1);
                        this.f5377j = false;
                        rVar2.f2694a[1] = bArr[i5];
                        this.f5375h = 2;
                        this.f5374g = 1;
                        break;
                    }
                    i5++;
                }
            } else if (i4 == 1) {
                int min = Math.min(rVar.a(), 4 - this.f5375h);
                rVar.f(rVar2.f2694a, this.f5375h, min);
                int i7 = this.f5375h + min;
                this.f5375h = i7;
                if (i7 >= 4) {
                    rVar2.G(0);
                    int h4 = rVar2.h();
                    y0.x xVar = this.f5369b;
                    if (xVar.a(h4)) {
                        this.f5379l = xVar.f9135b;
                        if (!this.f5376i) {
                            this.f5378k = (xVar.f9139f * 1000000) / xVar.f9136c;
                            C0094o c0094o = new C0094o();
                            c0094o.f2279a = this.f5373f;
                            c0094o.f2290l = T.H.l((String) xVar.f9140g);
                            c0094o.f2291m = 4096;
                            c0094o.f2302z = xVar.f9137d;
                            c0094o.f2270A = xVar.f9136c;
                            c0094o.f2282d = this.f5370c;
                            c0094o.f2284f = this.f5371d;
                            this.f5372e.c(new C0095p(c0094o));
                            this.f5376i = true;
                        }
                        rVar2.G(0);
                        this.f5372e.a(rVar2, 4, 0);
                        this.f5374g = 2;
                    } else {
                        this.f5375h = 0;
                        this.f5374g = 1;
                    }
                }
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(rVar.a(), this.f5379l - this.f5375h);
                this.f5372e.a(rVar, min2, 0);
                int i8 = this.f5375h + min2;
                this.f5375h = i8;
                if (i8 >= this.f5379l) {
                    W.a.j(this.f5380m != -9223372036854775807L);
                    this.f5372e.b(this.f5380m, 1, this.f5379l, 0, null);
                    this.f5380m += this.f5378k;
                    this.f5375h = 0;
                    this.f5374g = 0;
                }
            }
        }
    }

    @Override // e1.i
    public final void e(boolean z4) {
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5373f = (String) g4.f5144e;
        g4.c();
        this.f5372e = qVar.v(g4.f5142c, 1);
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5380m = j4;
    }
}
