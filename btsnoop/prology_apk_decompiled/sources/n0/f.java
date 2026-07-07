package n0;

import B2.AbstractC0007h;
import T.I;
import W.q;
import W.r;
import W.y;
import f2.h0;
import m0.C0428i;
import m0.C0430k;
import y0.F;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: l, reason: collision with root package name */
    public final C0430k f7414l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7415m;

    /* renamed from: n, reason: collision with root package name */
    public F f7416n;

    /* renamed from: o, reason: collision with root package name */
    public long f7417o;

    /* renamed from: p, reason: collision with root package name */
    public int f7418p;

    /* renamed from: q, reason: collision with root package name */
    public int f7419q;

    /* renamed from: r, reason: collision with root package name */
    public long f7420r;
    public long s;

    public f(C0430k c0430k) {
        this.f7414l = c0430k;
        try {
            this.f7415m = a(c0430k.f7240d);
            this.f7417o = -9223372036854775807L;
            this.f7418p = -1;
            this.f7419q = 0;
            this.f7420r = 0L;
            this.s = -9223372036854775807L;
        } catch (I e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int a(h0 h0Var) {
        String str = (String) h0Var.get("config");
        int i4 = 0;
        i4 = 0;
        if (str != null && str.length() % 2 == 0) {
            byte[] t4 = y.t(str);
            q qVar = new q(t4, t4.length);
            int i5 = qVar.i(1);
            if (i5 != 0) {
                throw new I(AbstractC0007h.k("unsupported audio mux version: ", i5), null, true, 0);
            }
            W.a.d("Only supports allStreamsSameTimeFraming.", qVar.i(1) == 1);
            int i6 = qVar.i(6);
            W.a.d("Only suppors one program.", qVar.i(4) == 0);
            W.a.d("Only suppors one layer.", qVar.i(3) == 0);
            i4 = i6;
        }
        return i4 + 1;
    }

    @Override // n0.i
    public final void b(long j4, long j5) {
        this.f7417o = j4;
        this.f7419q = 0;
        this.f7420r = j5;
    }

    @Override // n0.i
    public final void c(r rVar, long j4, int i4, boolean z4) {
        W.a.k(this.f7416n);
        int a4 = C0428i.a(this.f7418p);
        if (this.f7419q > 0 && a4 < i4) {
            F f4 = this.f7416n;
            f4.getClass();
            f4.b(this.s, 1, this.f7419q, 0, null);
            this.f7419q = 0;
            this.s = -9223372036854775807L;
        }
        for (int i5 = 0; i5 < this.f7415m; i5++) {
            int i6 = 0;
            while (rVar.f2695b < rVar.f2696c) {
                int u4 = rVar.u();
                i6 += u4;
                if (u4 != 255) {
                    break;
                }
            }
            this.f7416n.a(rVar, i6, 0);
            this.f7419q += i6;
        }
        this.s = U1.a.K(this.f7420r, j4, this.f7417o, this.f7414l.f7238b);
        if (z4) {
            F f5 = this.f7416n;
            f5.getClass();
            f5.b(this.s, 1, this.f7419q, 0, null);
            this.f7419q = 0;
            this.s = -9223372036854775807L;
        }
        this.f7418p = i4;
    }

    @Override // n0.i
    public final void d(y0.q qVar, int i4) {
        F v4 = qVar.v(i4, 2);
        this.f7416n = v4;
        int i5 = y.f2709a;
        v4.c(this.f7414l.f7239c);
    }

    @Override // n0.i
    public final void e(long j4) {
        W.a.j(this.f7417o == -9223372036854775807L);
        this.f7417o = j4;
    }
}
