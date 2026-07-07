package T0;

import T.I;
import W.r;
import W.y;
import y0.AbstractC0619b;
import y0.l;
import y0.o;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class d implements o {

    /* renamed from: a, reason: collision with root package name */
    public q f2384a;

    /* renamed from: b, reason: collision with root package name */
    public i f2385b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2386c;

    public final boolean a(l lVar) {
        boolean z4;
        f fVar = new f();
        if (fVar.a(lVar, true) && (fVar.f2392a & 2) == 2) {
            int min = Math.min(fVar.f2396e, 8);
            r rVar = new r(min);
            lVar.p(rVar.f2694a, 0, min, false);
            rVar.G(0);
            if (rVar.a() >= 5 && rVar.u() == 127 && rVar.w() == 1179402563) {
                this.f2385b = new i();
            } else {
                rVar.G(0);
                try {
                    z4 = AbstractC0619b.w(1, rVar, true);
                } catch (I unused) {
                    z4 = false;
                }
                if (z4) {
                    this.f2385b = new i();
                } else {
                    rVar.G(0);
                    if (h.e(rVar, h.f2399o)) {
                        this.f2385b = new i();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        i iVar = this.f2385b;
        if (iVar != null) {
            e eVar = iVar.f2402a;
            f fVar = (f) eVar.f2390o;
            fVar.f2392a = 0;
            fVar.f2393b = 0L;
            fVar.f2394c = 0;
            fVar.f2395d = 0;
            fVar.f2396e = 0;
            ((r) eVar.f2391p).D(0);
            eVar.f2387l = -1;
            eVar.f2389n = false;
            if (j4 == 0) {
                iVar.d(!iVar.f2413l);
                return;
            }
            if (iVar.f2409h != 0) {
                long j6 = (iVar.f2410i * j5) / 1000000;
                iVar.f2406e = j6;
                g gVar = iVar.f2405d;
                int i4 = y.f2709a;
                gVar.n(j6);
                iVar.f2409h = 2;
            }
        }
    }

    @Override // y0.o
    public final void g(q qVar) {
        this.f2384a = qVar;
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        try {
            return a((l) pVar);
        } catch (I unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Type inference failed for: r3v2, types: [T0.g, java.lang.Object] */
    @Override // y0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(y0.p r21, T.C0098t r22) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.d.l(y0.p, T.t):int");
    }

    @Override // y0.o
    public final void release() {
    }
}
