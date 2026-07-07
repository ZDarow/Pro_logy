package n0;

import W.r;
import W.y;
import java.util.Locale;
import m0.C0428i;
import m0.C0430k;
import y0.F;
import y0.q;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449c implements i {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f7386t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: l, reason: collision with root package name */
    public final C0430k f7387l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f7388m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7389n;

    /* renamed from: o, reason: collision with root package name */
    public F f7390o;

    /* renamed from: p, reason: collision with root package name */
    public long f7391p;

    /* renamed from: q, reason: collision with root package name */
    public long f7392q;

    /* renamed from: r, reason: collision with root package name */
    public int f7393r;

    public C0449c(C0430k c0430k) {
        this.f7387l = c0430k;
        String str = c0430k.f7239c.f2325m;
        str.getClass();
        this.f7388m = "audio/amr-wb".equals(str);
        this.f7389n = c0430k.f7238b;
        this.f7391p = -9223372036854775807L;
        this.f7393r = -1;
        this.f7392q = 0L;
    }

    @Override // n0.i
    public final void b(long j4, long j5) {
        this.f7391p = j4;
        this.f7392q = j5;
    }

    @Override // n0.i
    public final void c(r rVar, long j4, int i4, boolean z4) {
        int a4;
        W.a.k(this.f7390o);
        int i5 = this.f7393r;
        if (i5 != -1 && i4 != (a4 = C0428i.a(i5))) {
            int i6 = y.f2709a;
            Locale locale = Locale.US;
            W.a.A("RtpAmrReader", "Received RTP packet with unexpected sequence number. Expected: " + a4 + "; received: " + i4 + ".");
        }
        rVar.H(1);
        int e4 = (rVar.e() >> 3) & 15;
        boolean z5 = (e4 >= 0 && e4 <= 8) || e4 == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z6 = this.f7388m;
        sb.append(z6 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(e4);
        W.a.d(sb.toString(), z5);
        int i7 = z6 ? f7386t[e4] : s[e4];
        int a5 = rVar.a();
        W.a.d("compound payload not supported currently", a5 == i7);
        this.f7390o.a(rVar, a5, 0);
        this.f7390o.b(U1.a.K(this.f7392q, j4, this.f7391p, this.f7389n), 1, a5, 0, null);
        this.f7393r = i4;
    }

    @Override // n0.i
    public final void d(q qVar, int i4) {
        F v4 = qVar.v(i4, 1);
        this.f7390o = v4;
        v4.c(this.f7387l.f7239c);
    }

    @Override // n0.i
    public final void e(long j4) {
        this.f7391p = j4;
    }
}
