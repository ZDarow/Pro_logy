package a0;

import android.util.Pair;
import q0.C0491x;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3386l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y.x f3387m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Pair f3388n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0491x f3389o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ n0.g f3390p;

    public /* synthetic */ a0(Y.x xVar, Pair pair, C0491x c0491x, n0.g gVar, int i4) {
        this.f3386l = i4;
        this.f3387m = xVar;
        this.f3388n = pair;
        this.f3389o = c0491x;
        this.f3390p = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3386l) {
            case 0:
                b0.e eVar = ((e0) this.f3387m.f3066n).f3441h;
                Pair pair = this.f3388n;
                eVar.H(((Integer) pair.first).intValue(), (q0.F) pair.second, this.f3389o, this.f3390p);
                return;
            case 1:
                b0.e eVar2 = ((e0) this.f3387m.f3066n).f3441h;
                Pair pair2 = this.f3388n;
                eVar2.g(((Integer) pair2.first).intValue(), (q0.F) pair2.second, this.f3389o, this.f3390p);
                return;
            default:
                b0.e eVar3 = ((e0) this.f3387m.f3066n).f3441h;
                Pair pair3 = this.f3388n;
                eVar3.D(((Integer) pair3.first).intValue(), (q0.F) pair3.second, this.f3389o, this.f3390p);
                return;
        }
    }
}
