package e1;

import B2.AbstractC0007h;
import T.C0094o;
import java.util.Arrays;

/* renamed from: e1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261e implements i {
    public static final byte[] w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5177a;

    /* renamed from: d, reason: collision with root package name */
    public final String f5180d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5181e;

    /* renamed from: f, reason: collision with root package name */
    public String f5182f;

    /* renamed from: g, reason: collision with root package name */
    public y0.F f5183g;

    /* renamed from: h, reason: collision with root package name */
    public y0.F f5184h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5188l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5189m;

    /* renamed from: p, reason: collision with root package name */
    public int f5192p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5193q;
    public int s;

    /* renamed from: u, reason: collision with root package name */
    public y0.F f5196u;

    /* renamed from: v, reason: collision with root package name */
    public long f5197v;

    /* renamed from: b, reason: collision with root package name */
    public final W.q f5178b = new W.q(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final W.r f5179c = new W.r(Arrays.copyOf(w, 10));

    /* renamed from: i, reason: collision with root package name */
    public int f5185i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f5186j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f5187k = 256;

    /* renamed from: n, reason: collision with root package name */
    public int f5190n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f5191o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f5194r = -9223372036854775807L;

    /* renamed from: t, reason: collision with root package name */
    public long f5195t = -9223372036854775807L;

    public C0261e(int i4, String str, boolean z4) {
        this.f5177a = z4;
        this.f5180d = str;
        this.f5181e = i4;
    }

    @Override // e1.i
    public final void b() {
        this.f5195t = -9223372036854775807L;
        this.f5189m = false;
        this.f5185i = 0;
        this.f5186j = 0;
        this.f5187k = 256;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02f7  */
    @Override // e1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(W.r r24) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C0261e.d(W.r):void");
    }

    @Override // e1.i
    public final void e(boolean z4) {
    }

    @Override // e1.i
    public final void f(y0.q qVar, G g4) {
        g4.a();
        g4.c();
        this.f5182f = (String) g4.f5144e;
        g4.c();
        y0.F v4 = qVar.v(g4.f5142c, 1);
        this.f5183g = v4;
        this.f5196u = v4;
        if (!this.f5177a) {
            this.f5184h = new y0.n();
            return;
        }
        g4.a();
        g4.c();
        y0.F v5 = qVar.v(g4.f5142c, 5);
        this.f5184h = v5;
        C0094o c0094o = new C0094o();
        g4.c();
        c0094o.f2279a = (String) g4.f5144e;
        c0094o.f2290l = T.H.l("application/id3");
        AbstractC0007h.q(c0094o, v5);
    }

    @Override // e1.i
    public final void g(long j4, int i4) {
        this.f5195t = j4;
    }
}
