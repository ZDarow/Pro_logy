package A0;

import W.r;
import W.y;
import android.support.v4.media.session.t;
import y0.l;
import y0.o;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public final r f10a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12c;

    /* renamed from: d, reason: collision with root package name */
    public final L1.g f13d;

    /* renamed from: e, reason: collision with root package name */
    public int f14e;

    /* renamed from: f, reason: collision with root package name */
    public q f15f;

    /* renamed from: g, reason: collision with root package name */
    public e f16g;

    /* renamed from: h, reason: collision with root package name */
    public long f17h;

    /* renamed from: i, reason: collision with root package name */
    public g[] f18i;

    /* renamed from: j, reason: collision with root package name */
    public long f19j;

    /* renamed from: k, reason: collision with root package name */
    public g f20k;

    /* renamed from: l, reason: collision with root package name */
    public int f21l;

    /* renamed from: m, reason: collision with root package name */
    public long f22m;

    /* renamed from: n, reason: collision with root package name */
    public long f23n;

    /* renamed from: o, reason: collision with root package name */
    public int f24o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f25p;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, A0.c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, y0.q] */
    public d(int i4, L1.g gVar) {
        this.f13d = gVar;
        this.f12c = (i4 & 1) == 0;
        this.f10a = new r(12);
        this.f11b = new Object();
        this.f15f = new Object();
        this.f18i = new g[0];
        this.f22m = -1L;
        this.f23n = -1L;
        this.f21l = -1;
        this.f17h = -9223372036854775807L;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        this.f19j = -1L;
        this.f20k = null;
        for (g gVar : this.f18i) {
            if (gVar.f43j == 0) {
                gVar.f41h = 0;
            } else {
                gVar.f41h = gVar.f45l[y.f(gVar.f44k, j4, true)];
            }
        }
        if (j4 != 0) {
            this.f14e = 6;
        } else if (this.f18i.length == 0) {
            this.f14e = 0;
        } else {
            this.f14e = 3;
        }
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f14e = 0;
        if (this.f12c) {
            qVar = new t(qVar, this.f13d);
        }
        this.f15f = qVar;
        this.f19j = -1L;
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        r rVar = this.f10a;
        ((l) pVar).p(rVar.f2694a, 0, 12, false);
        rVar.G(0);
        if (rVar.j() != 1179011410) {
            return false;
        }
        rVar.H(4);
        return rVar.j() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r29, T.C0098t r30) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.d.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }
}
