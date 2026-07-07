package n0;

import B2.AbstractC0007h;
import T.C0094o;
import W.r;
import W.y;
import java.util.ArrayList;
import java.util.Locale;
import m0.C0428i;
import m0.C0430k;
import y0.AbstractC0619b;
import y0.F;
import y0.q;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: l, reason: collision with root package name */
    public final C0430k f7428l;

    /* renamed from: m, reason: collision with root package name */
    public F f7429m;

    /* renamed from: o, reason: collision with root package name */
    public long f7431o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7433q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7434r;

    /* renamed from: n, reason: collision with root package name */
    public long f7430n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f7432p = -1;

    public h(C0430k c0430k) {
        this.f7428l = c0430k;
    }

    @Override // n0.i
    public final void b(long j4, long j5) {
        this.f7430n = j4;
        this.f7431o = j5;
    }

    @Override // n0.i
    public final void c(r rVar, long j4, int i4, boolean z4) {
        W.a.k(this.f7429m);
        if (!this.f7433q) {
            int i5 = rVar.f2695b;
            W.a.d("ID Header has insufficient data", rVar.f2696c > 18);
            W.a.d("ID Header missing", rVar.s(8, e2.d.f5436c).equals("OpusHead"));
            W.a.d("version number must always be 1", rVar.u() == 1);
            rVar.G(i5);
            ArrayList c4 = AbstractC0619b.c(rVar.f2694a);
            C0094o a4 = this.f7428l.f7239c.a();
            a4.f2293o = c4;
            AbstractC0007h.q(a4, this.f7429m);
            this.f7433q = true;
        } else if (this.f7434r) {
            int a5 = C0428i.a(this.f7432p);
            if (i4 != a5) {
                int i6 = y.f2709a;
                Locale locale = Locale.US;
                W.a.A("RtpOpusReader", "Received RTP packet with unexpected sequence number. Expected: " + a5 + "; received: " + i4 + ".");
            }
            int a6 = rVar.a();
            this.f7429m.a(rVar, a6, 0);
            this.f7429m.b(U1.a.K(this.f7431o, j4, this.f7430n, 48000), 1, a6, 0, null);
        } else {
            W.a.d("Comment Header has insufficient data", rVar.f2696c >= 8);
            W.a.d("Comment Header should follow ID Header", rVar.s(8, e2.d.f5436c).equals("OpusTags"));
            this.f7434r = true;
        }
        this.f7432p = i4;
    }

    @Override // n0.i
    public final void d(q qVar, int i4) {
        F v4 = qVar.v(i4, 1);
        this.f7429m = v4;
        v4.c(this.f7428l.f7239c);
    }

    @Override // n0.i
    public final void e(long j4) {
        this.f7430n = j4;
    }
}
