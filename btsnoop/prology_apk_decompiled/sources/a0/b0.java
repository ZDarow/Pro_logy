package a0;

import android.util.Pair;
import java.io.IOException;
import q0.C0491x;

/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3394l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0491x f3395m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n0.g f3396n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ IOException f3397o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f3398p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f3399q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3400r;

    public /* synthetic */ b0(Object obj, Object obj2, C0491x c0491x, n0.g gVar, IOException iOException, boolean z4, int i4) {
        this.f3394l = i4;
        this.f3399q = obj;
        this.f3400r = obj2;
        this.f3395m = c0491x;
        this.f3396n = gVar;
        this.f3397o = iOException;
        this.f3398p = z4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, q0.J] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3394l) {
            case 0:
                b0.e eVar = ((e0) ((Y.x) this.f3399q).f3066n).f3441h;
                Pair pair = (Pair) this.f3400r;
                eVar.L(((Integer) pair.first).intValue(), (q0.F) pair.second, this.f3395m, this.f3396n, this.f3397o, this.f3398p);
                return;
            default:
                f0.e eVar2 = (f0.e) this.f3399q;
                int i4 = eVar2.f5454a;
                this.f3400r.L(i4, eVar2.f5455b, this.f3395m, this.f3396n, this.f3397o, this.f3398p);
                return;
        }
    }
}
