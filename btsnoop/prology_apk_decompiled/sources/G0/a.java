package G0;

import W.r;
import y0.l;
import y0.o;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    public q f661b;

    /* renamed from: c, reason: collision with root package name */
    public int f662c;

    /* renamed from: d, reason: collision with root package name */
    public int f663d;

    /* renamed from: e, reason: collision with root package name */
    public int f664e;

    /* renamed from: g, reason: collision with root package name */
    public N0.a f666g;

    /* renamed from: h, reason: collision with root package name */
    public l f667h;

    /* renamed from: i, reason: collision with root package name */
    public c f668i;

    /* renamed from: j, reason: collision with root package name */
    public S0.q f669j;

    /* renamed from: a, reason: collision with root package name */
    public final r f660a = new r(6);

    /* renamed from: f, reason: collision with root package name */
    public long f665f = -1;

    public final void a() {
        q qVar = this.f661b;
        qVar.getClass();
        qVar.s();
        this.f661b.t(new A0.b(-9223372036854775807L));
        this.f662c = 6;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        if (j4 == 0) {
            this.f662c = 0;
            this.f669j = null;
        } else if (this.f662c == 5) {
            S0.q qVar = this.f669j;
            qVar.getClass();
            qVar.b(j4, j5);
        }
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f661b = qVar;
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        l lVar = (l) pVar;
        r rVar = this.f660a;
        rVar.D(2);
        lVar.p(rVar.f2694a, 0, 2, false);
        if (rVar.A() != 65496) {
            return false;
        }
        rVar.D(2);
        lVar.p(rVar.f2694a, 0, 2, false);
        int A4 = rVar.A();
        this.f663d = A4;
        if (A4 == 65504) {
            rVar.D(2);
            lVar.p(rVar.f2694a, 0, 2, false);
            lVar.a(rVar.A() - 2, false);
            rVar.D(2);
            lVar.p(rVar.f2694a, 0, 2, false);
            this.f663d = rVar.A();
        }
        if (this.f663d != 65505) {
            return false;
        }
        lVar.a(2, false);
        rVar.D(6);
        lVar.p(rVar.f2694a, 0, 6, false);
        return rVar.w() == 1165519206 && rVar.A() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r27, T.C0098t r28) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.a.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
        S0.q qVar = this.f669j;
        if (qVar != null) {
            qVar.getClass();
        }
    }
}
