package V0;

import T.C0098t;
import android.support.v4.media.session.t;
import android.util.SparseArray;
import y0.p;
import y0.q;

/* loaded from: classes.dex */
public final class m implements y0.o {

    /* renamed from: a, reason: collision with root package name */
    public final y0.o f2623a;

    /* renamed from: b, reason: collision with root package name */
    public final L1.g f2624b;

    /* renamed from: c, reason: collision with root package name */
    public t f2625c;

    public m(y0.o oVar, L1.g gVar) {
        this.f2623a = oVar;
        this.f2624b = gVar;
    }

    @Override // y0.o
    public final void b(long j4, long j5) {
        t tVar = this.f2625c;
        if (tVar != null) {
            int i4 = 0;
            while (true) {
                SparseArray sparseArray = (SparseArray) tVar.f3736o;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                l lVar = ((o) sparseArray.valueAt(i4)).f2635g;
                if (lVar != null) {
                    lVar.b();
                }
                i4++;
            }
        }
        this.f2623a.b(j4, j5);
    }

    @Override // y0.o
    public final y0.o d() {
        return this.f2623a;
    }

    @Override // y0.o
    public final void g(q qVar) {
        t tVar = new t(qVar, this.f2624b);
        this.f2625c = tVar;
        this.f2623a.g(tVar);
    }

    @Override // y0.o
    public final boolean k(p pVar) {
        return this.f2623a.k(pVar);
    }

    @Override // y0.o
    public final int l(p pVar, C0098t c0098t) {
        return this.f2623a.l(pVar, c0098t);
    }

    @Override // y0.o
    public final void release() {
        this.f2623a.release();
    }
}
