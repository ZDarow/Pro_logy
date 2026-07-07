package n0;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0095p;
import W.r;
import W.y;
import java.util.Locale;
import m0.C0428i;
import m0.C0430k;
import y0.F;
import y0.q;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: l, reason: collision with root package name */
    public final C0430k f7435l;

    /* renamed from: m, reason: collision with root package name */
    public F f7436m;

    /* renamed from: n, reason: collision with root package name */
    public long f7437n = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public int f7438o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f7439p = -1;

    /* renamed from: q, reason: collision with root package name */
    public long f7440q = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public long f7441r = 0;
    public boolean s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7442t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7443u;

    public j(C0430k c0430k) {
        this.f7435l = c0430k;
    }

    @Override // n0.i
    public final void b(long j4, long j5) {
        this.f7437n = j4;
        this.f7439p = -1;
        this.f7441r = j5;
    }

    @Override // n0.i
    public final void c(r rVar, long j4, int i4, boolean z4) {
        W.a.k(this.f7436m);
        int u4 = rVar.u();
        if ((u4 & 16) == 16 && (u4 & 7) == 0) {
            if (this.s && this.f7439p > 0) {
                F f4 = this.f7436m;
                f4.getClass();
                f4.b(this.f7440q, this.f7442t ? 1 : 0, this.f7439p, 0, null);
                this.f7439p = -1;
                this.f7440q = -9223372036854775807L;
                this.s = false;
            }
            this.s = true;
        } else {
            if (!this.s) {
                W.a.A("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return;
            }
            int a4 = C0428i.a(this.f7438o);
            if (i4 < a4) {
                int i5 = y.f2709a;
                Locale locale = Locale.US;
                W.a.A("RtpVP8Reader", "Received RTP packet with unexpected sequence number. Expected: " + a4 + "; received: " + i4 + ". Dropping packet.");
                return;
            }
        }
        if ((u4 & 128) != 0) {
            int u5 = rVar.u();
            if ((u5 & 128) != 0 && (rVar.u() & 128) != 0) {
                rVar.H(1);
            }
            if ((u5 & 64) != 0) {
                rVar.H(1);
            }
            if ((u5 & 32) != 0 || (16 & u5) != 0) {
                rVar.H(1);
            }
        }
        if (this.f7439p == -1 && this.s) {
            this.f7442t = (rVar.e() & 1) == 0;
        }
        if (!this.f7443u) {
            int i6 = rVar.f2695b;
            rVar.G(i6 + 6);
            int n4 = rVar.n() & 16383;
            int n5 = rVar.n() & 16383;
            rVar.G(i6);
            C0095p c0095p = this.f7435l.f7239c;
            if (n4 != c0095p.s || n5 != c0095p.f2331t) {
                F f5 = this.f7436m;
                C0094o a5 = c0095p.a();
                a5.f2296r = n4;
                a5.s = n5;
                AbstractC0007h.q(a5, f5);
            }
            this.f7443u = true;
        }
        int a6 = rVar.a();
        this.f7436m.a(rVar, a6, 0);
        int i7 = this.f7439p;
        if (i7 == -1) {
            this.f7439p = a6;
        } else {
            this.f7439p = i7 + a6;
        }
        this.f7440q = U1.a.K(this.f7441r, j4, this.f7437n, 90000);
        if (z4) {
            F f6 = this.f7436m;
            f6.getClass();
            f6.b(this.f7440q, this.f7442t ? 1 : 0, this.f7439p, 0, null);
            this.f7439p = -1;
            this.f7440q = -9223372036854775807L;
            this.s = false;
        }
        this.f7438o = i4;
    }

    @Override // n0.i
    public final void d(q qVar, int i4) {
        F v4 = qVar.v(i4, 2);
        this.f7436m = v4;
        v4.c(this.f7435l.f7239c);
    }

    @Override // n0.i
    public final void e(long j4) {
        W.a.j(this.f7437n == -9223372036854775807L);
        this.f7437n = j4;
    }
}
