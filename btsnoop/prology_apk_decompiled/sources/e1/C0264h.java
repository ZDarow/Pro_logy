package e1;

import B2.AbstractC0007h;
import T.C0094o;
import java.util.Collections;
import java.util.List;

/* renamed from: e1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0264h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5216a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5217b;

    /* renamed from: c, reason: collision with root package name */
    public long f5218c;

    /* renamed from: d, reason: collision with root package name */
    public int f5219d;

    /* renamed from: e, reason: collision with root package name */
    public int f5220e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5221f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5222g;

    public C0264h(List list) {
        this.f5216a = 0;
        this.f5221f = list;
        this.f5222g = new y0.F[list.size()];
        this.f5218c = -9223372036854775807L;
    }

    @Override // e1.i
    public final void b() {
        switch (this.f5216a) {
            case 0:
                this.f5217b = false;
                this.f5218c = -9223372036854775807L;
                return;
            default:
                this.f5217b = false;
                this.f5218c = -9223372036854775807L;
                return;
        }
    }

    @Override // e1.i
    public final void d(W.r rVar) {
        boolean z4;
        boolean z5;
        switch (this.f5216a) {
            case 0:
                if (this.f5217b) {
                    if (this.f5219d == 2) {
                        if (rVar.a() == 0) {
                            z5 = false;
                        } else {
                            if (rVar.u() != 32) {
                                this.f5217b = false;
                            }
                            this.f5219d--;
                            z5 = this.f5217b;
                        }
                        if (!z5) {
                            return;
                        }
                    }
                    if (this.f5219d == 1) {
                        if (rVar.a() == 0) {
                            z4 = false;
                        } else {
                            if (rVar.u() != 0) {
                                this.f5217b = false;
                            }
                            this.f5219d--;
                            z4 = this.f5217b;
                        }
                        if (!z4) {
                            return;
                        }
                    }
                    int i4 = rVar.f2695b;
                    int a4 = rVar.a();
                    for (y0.F f4 : (y0.F[]) this.f5222g) {
                        rVar.G(i4);
                        f4.a(rVar, a4, 0);
                    }
                    this.f5220e += a4;
                    return;
                }
                return;
            default:
                W.a.k((y0.F) this.f5222g);
                if (this.f5217b) {
                    int a5 = rVar.a();
                    int i5 = this.f5220e;
                    if (i5 < 10) {
                        int min = Math.min(a5, 10 - i5);
                        byte[] bArr = rVar.f2694a;
                        int i6 = rVar.f2695b;
                        W.r rVar2 = (W.r) this.f5221f;
                        System.arraycopy(bArr, i6, rVar2.f2694a, this.f5220e, min);
                        if (this.f5220e + min == 10) {
                            rVar2.G(0);
                            if (73 != rVar2.u() || 68 != rVar2.u() || 51 != rVar2.u()) {
                                W.a.A("Id3Reader", "Discarding invalid ID3 tag");
                                this.f5217b = false;
                                return;
                            } else {
                                rVar2.H(3);
                                this.f5219d = rVar2.t() + 10;
                            }
                        }
                    }
                    int min2 = Math.min(a5, this.f5219d - this.f5220e);
                    ((y0.F) this.f5222g).a(rVar, min2, 0);
                    this.f5220e += min2;
                    return;
                }
                return;
        }
    }

    @Override // e1.i
    public final void e(boolean z4) {
        int i4;
        switch (this.f5216a) {
            case 0:
                if (this.f5217b) {
                    W.a.j(this.f5218c != -9223372036854775807L);
                    for (y0.F f4 : (y0.F[]) this.f5222g) {
                        f4.b(this.f5218c, 1, this.f5220e, 0, null);
                    }
                    this.f5217b = false;
                    return;
                }
                return;
            default:
                W.a.k((y0.F) this.f5222g);
                if (this.f5217b && (i4 = this.f5219d) != 0 && this.f5220e == i4) {
                    W.a.j(this.f5218c != -9223372036854775807L);
                    ((y0.F) this.f5222g).b(this.f5218c, 1, this.f5219d, 0, null);
                    this.f5217b = false;
                    return;
                }
                return;
        }
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        switch (this.f5216a) {
            case 0:
                int i4 = 0;
                while (true) {
                    y0.F[] fArr = (y0.F[]) this.f5222g;
                    if (i4 >= fArr.length) {
                        return;
                    }
                    F f4 = (F) ((List) this.f5221f).get(i4);
                    g4.a();
                    g4.c();
                    y0.F v4 = qVar.v(g4.f5142c, 3);
                    C0094o c0094o = new C0094o();
                    g4.c();
                    c0094o.f2279a = (String) g4.f5144e;
                    c0094o.f2290l = T.H.l("application/dvbsubs");
                    c0094o.f2293o = Collections.singletonList(f4.f5139b);
                    c0094o.f2282d = f4.f5138a;
                    AbstractC0007h.q(c0094o, v4);
                    fArr[i4] = v4;
                    i4++;
                }
            default:
                g4.a();
                g4.c();
                y0.F v5 = qVar.v(g4.f5142c, 5);
                this.f5222g = v5;
                C0094o c0094o2 = new C0094o();
                g4.c();
                c0094o2.f2279a = (String) g4.f5144e;
                c0094o2.f2290l = T.H.l("application/id3");
                AbstractC0007h.q(c0094o2, v5);
                return;
        }
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        switch (this.f5216a) {
            case 0:
                if ((i4 & 4) == 0) {
                    return;
                }
                this.f5217b = true;
                this.f5218c = j4;
                this.f5220e = 0;
                this.f5219d = 2;
                return;
            default:
                if ((i4 & 4) == 0) {
                    return;
                }
                this.f5217b = true;
                this.f5218c = j4;
                this.f5219d = 0;
                this.f5220e = 0;
                return;
        }
    }

    public C0264h() {
        this.f5216a = 1;
        this.f5221f = new W.r(10);
        this.f5218c = -9223372036854775807L;
    }
}
