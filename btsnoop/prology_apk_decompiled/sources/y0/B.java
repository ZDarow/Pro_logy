package y0;

import B2.AbstractC0007h;
import T.C0094o;
import T.C0098t;
import T.H;

/* loaded from: classes.dex */
public final class B implements o {

    /* renamed from: a, reason: collision with root package name */
    public final int f8993a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8994b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8995c;

    /* renamed from: d, reason: collision with root package name */
    public int f8996d;

    /* renamed from: e, reason: collision with root package name */
    public int f8997e;

    /* renamed from: f, reason: collision with root package name */
    public q f8998f;

    /* renamed from: g, reason: collision with root package name */
    public F f8999g;

    public B(int i4, int i5, String str) {
        this.f8993a = i4;
        this.f8994b = i5;
        this.f8995c = str;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        if (j4 == 0 || this.f8997e == 1) {
            this.f8997e = 1;
            this.f8996d = 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [y0.z, java.lang.Object] */
    @Override // y0.o
    public final void g(q qVar) {
        this.f8998f = qVar;
        F v4 = qVar.v(1024, 4);
        this.f8999g = v4;
        C0094o c0094o = new C0094o();
        c0094o.f2290l = H.l(this.f8995c);
        AbstractC0007h.q(c0094o, v4);
        this.f8998f.s();
        this.f8998f.t(new Object());
        this.f8997e = 1;
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        int i4 = this.f8994b;
        int i5 = this.f8993a;
        W.a.j((i5 == -1 || i4 == -1) ? false : true);
        W.r rVar = new W.r(i4);
        ((l) pVar).p(rVar.f2694a, 0, i4, false);
        return rVar.A() == i5;
    }

    @Override // y0.o
    public final int l(p pVar, C0098t c0098t) {
        int i4 = this.f8997e;
        if (i4 != 1) {
            if (i4 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        F f4 = this.f8999g;
        f4.getClass();
        int d4 = f4.d(pVar, 1024, true);
        if (d4 == -1) {
            this.f8997e = 2;
            this.f8999g.b(0L, 1, this.f8996d, 0, null);
            this.f8996d = 0;
        } else {
            this.f8996d += d4;
        }
        return 0;
    }

    @Override // y0.o
    public final void release() {
    }
}
