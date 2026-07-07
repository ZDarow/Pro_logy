package n0;

import W.q;
import W.r;
import W.y;
import java.math.RoundingMode;
import m0.C0430k;
import y0.F;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0447a implements i {

    /* renamed from: l, reason: collision with root package name */
    public final C0430k f7371l;

    /* renamed from: m, reason: collision with root package name */
    public final q f7372m = new q();

    /* renamed from: n, reason: collision with root package name */
    public final int f7373n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7374o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7375p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7376q;

    /* renamed from: r, reason: collision with root package name */
    public long f7377r;
    public F s;

    /* renamed from: t, reason: collision with root package name */
    public long f7378t;

    public C0447a(C0430k c0430k) {
        this.f7371l = c0430k;
        this.f7373n = c0430k.f7238b;
        String str = (String) c0430k.f7240d.get("mode");
        str.getClass();
        if (U1.a.o(str, "AAC-hbr")) {
            this.f7374o = 13;
            this.f7375p = 3;
        } else {
            if (!U1.a.o(str, "AAC-lbr")) {
                throw new UnsupportedOperationException("AAC mode not supported");
            }
            this.f7374o = 6;
            this.f7375p = 2;
        }
        this.f7376q = this.f7375p + this.f7374o;
    }

    @Override // n0.i
    public final void b(long j4, long j5) {
        this.f7377r = j4;
        this.f7378t = j5;
    }

    @Override // n0.i
    public final void c(r rVar, long j4, int i4, boolean z4) {
        this.s.getClass();
        short r4 = rVar.r();
        int i5 = r4 / this.f7376q;
        long K3 = U1.a.K(this.f7378t, j4, this.f7377r, this.f7373n);
        q qVar = this.f7372m;
        qVar.o(rVar);
        int i6 = this.f7375p;
        int i7 = this.f7374o;
        if (i5 == 1) {
            int i8 = qVar.i(i7);
            qVar.t(i6);
            this.s.a(rVar, rVar.a(), 0);
            if (z4) {
                this.s.b(K3, 1, i8, 0, null);
                return;
            }
            return;
        }
        rVar.H((r4 + 7) / 8);
        for (int i9 = 0; i9 < i5; i9++) {
            int i10 = qVar.i(i7);
            qVar.t(i6);
            this.s.a(rVar, i10, 0);
            this.s.b(K3, 1, i10, 0, null);
            K3 += y.U(i5, 1000000L, this.f7373n, RoundingMode.FLOOR);
        }
    }

    @Override // n0.i
    public final void d(y0.q qVar, int i4) {
        F v4 = qVar.v(i4, 1);
        this.s = v4;
        v4.c(this.f7371l.f7239c);
    }

    @Override // n0.i
    public final void e(long j4) {
        this.f7377r = j4;
    }
}
