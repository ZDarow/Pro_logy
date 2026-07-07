package B0;

import L.k;
import T.C0098t;
import W.r;
import y0.B;
import y0.l;
import y0.o;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88a;

    /* renamed from: b, reason: collision with root package name */
    public final r f89b;

    /* renamed from: c, reason: collision with root package name */
    public final B f90c;

    public a(int i4) {
        this.f88a = i4;
        switch (i4) {
            case 1:
                this.f89b = new r(4);
                this.f90c = new B(-1, -1, "image/heif");
                return;
            case k.FLOAT_FIELD_NUMBER /* 2 */:
                this.f89b = new r(4);
                this.f90c = new B(-1, -1, "image/webp");
                return;
            default:
                this.f89b = new r(4);
                this.f90c = new B(-1, -1, "image/avif");
                return;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void e() {
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        switch (this.f88a) {
            case 0:
                this.f90c.b(j4, j5);
                return;
            case 1:
                this.f90c.b(j4, j5);
                return;
            default:
                this.f90c.b(j4, j5);
                return;
        }
    }

    @Override // y0.o
    public final void g(q qVar) {
        switch (this.f88a) {
            case 0:
                this.f90c.g(qVar);
                return;
            case 1:
                this.f90c.g(qVar);
                return;
            default:
                this.f90c.g(qVar);
                return;
        }
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        switch (this.f88a) {
            case 0:
                l lVar = (l) pVar;
                lVar.a(4, false);
                r rVar = this.f89b;
                rVar.D(4);
                lVar.p(rVar.f2694a, 0, 4, false);
                if (rVar.w() != 1718909296) {
                    return false;
                }
                rVar.D(4);
                lVar.p(rVar.f2694a, 0, 4, false);
                return rVar.w() == ((long) 1635150182);
            case 1:
                l lVar2 = (l) pVar;
                lVar2.a(4, false);
                r rVar2 = this.f89b;
                rVar2.D(4);
                lVar2.p(rVar2.f2694a, 0, 4, false);
                if (rVar2.w() != 1718909296) {
                    return false;
                }
                rVar2.D(4);
                lVar2.p(rVar2.f2694a, 0, 4, false);
                return rVar2.w() == ((long) 1751476579);
            default:
                r rVar3 = this.f89b;
                rVar3.D(4);
                l lVar3 = (l) pVar;
                lVar3.p(rVar3.f2694a, 0, 4, false);
                if (rVar3.w() != 1380533830) {
                    return false;
                }
                lVar3.a(4, false);
                rVar3.D(4);
                lVar3.p(rVar3.f2694a, 0, 4, false);
                return rVar3.w() == 1464156752;
        }
    }

    @Override // y0.o
    public final int l(p pVar, C0098t c0098t) {
        switch (this.f88a) {
            case 0:
                return this.f90c.l(pVar, c0098t);
            case 1:
                return this.f90c.l(pVar, c0098t);
            default:
                return this.f90c.l(pVar, c0098t);
        }
    }

    @Override // y0.o
    public final void release() {
        int i4 = this.f88a;
    }
}
