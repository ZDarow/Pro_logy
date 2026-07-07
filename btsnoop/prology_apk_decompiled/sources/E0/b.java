package E0;

import W.r;
import y0.l;
import y0.n;
import y0.o;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final r f508a = new r(4);

    /* renamed from: b, reason: collision with root package name */
    public final r f509b = new r(9);

    /* renamed from: c, reason: collision with root package name */
    public final r f510c = new r(11);

    /* renamed from: d, reason: collision with root package name */
    public final r f511d = new r();

    /* renamed from: e, reason: collision with root package name */
    public final c f512e;

    /* renamed from: f, reason: collision with root package name */
    public q f513f;

    /* renamed from: g, reason: collision with root package name */
    public int f514g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f515h;

    /* renamed from: i, reason: collision with root package name */
    public long f516i;

    /* renamed from: j, reason: collision with root package name */
    public int f517j;

    /* renamed from: k, reason: collision with root package name */
    public int f518k;

    /* renamed from: l, reason: collision with root package name */
    public int f519l;

    /* renamed from: m, reason: collision with root package name */
    public long f520m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f521n;

    /* renamed from: o, reason: collision with root package name */
    public a f522o;

    /* renamed from: p, reason: collision with root package name */
    public f f523p;

    /* JADX WARN: Type inference failed for: r0v4, types: [E0.c, E0.e] */
    public b() {
        ?? eVar = new e(new n());
        eVar.f524b = -9223372036854775807L;
        eVar.f525c = new long[0];
        eVar.f526d = new long[0];
        this.f512e = eVar;
        this.f514g = 1;
    }

    public final r a(l lVar) {
        int i4 = this.f519l;
        r rVar = this.f511d;
        byte[] bArr = rVar.f2694a;
        if (i4 > bArr.length) {
            rVar.E(new byte[Math.max(bArr.length * 2, i4)], 0);
        } else {
            rVar.G(0);
        }
        rVar.F(this.f519l);
        lVar.k(rVar.f2694a, 0, this.f519l, false);
        return rVar;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        if (j4 == 0) {
            this.f514g = 1;
            this.f515h = false;
        } else {
            this.f514g = 3;
        }
        this.f517j = 0;
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f513f = qVar;
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        r rVar = this.f508a;
        l lVar = (l) pVar;
        lVar.p(rVar.f2694a, 0, 3, false);
        rVar.G(0);
        if (rVar.x() != 4607062) {
            return false;
        }
        lVar.p(rVar.f2694a, 0, 2, false);
        rVar.G(0);
        if ((rVar.A() & 250) != 0) {
            return false;
        }
        lVar.p(rVar.f2694a, 0, 4, false);
        rVar.G(0);
        int h4 = rVar.h();
        lVar.f9091q = 0;
        lVar.a(h4, false);
        lVar.p(rVar.f2694a, 0, 4, false);
        rVar.G(0);
        return rVar.h() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x037b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v53, types: [E0.e, E0.a] */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r32, T.C0098t r33) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.b.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }
}
