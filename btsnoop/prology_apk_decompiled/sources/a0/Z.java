package a0;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class Z implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y.x f3380m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Pair f3381n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n0.g f3382o;

    public /* synthetic */ Z(Y.x xVar, Pair pair, n0.g gVar, int i4) {
        this.f3379l = i4;
        this.f3380m = xVar;
        this.f3381n = pair;
        this.f3382o = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3379l) {
            case 0:
                b0.e eVar = ((e0) this.f3380m.f3066n).f3441h;
                Pair pair = this.f3381n;
                int intValue = ((Integer) pair.first).intValue();
                q0.F f4 = (q0.F) pair.second;
                f4.getClass();
                eVar.x(intValue, f4, this.f3382o);
                return;
            default:
                b0.e eVar2 = ((e0) this.f3380m.f3066n).f3441h;
                Pair pair2 = this.f3381n;
                eVar2.z(((Integer) pair2.first).intValue(), (q0.F) pair2.second, this.f3382o);
                return;
        }
    }
}
