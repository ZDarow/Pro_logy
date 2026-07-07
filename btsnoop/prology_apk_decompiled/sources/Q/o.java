package Q;

import android.os.IBinder;
import android.os.Messenger;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1549l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ K2.o f1550m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ K2.o f1551n;

    public /* synthetic */ o(K2.o oVar, K2.o oVar2, int i4) {
        this.f1549l = i4;
        this.f1551n = oVar;
        this.f1550m = oVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1549l) {
            case 0:
                f fVar = (f) ((t) this.f1551n.f1009m).f1574p.remove(((Messenger) this.f1550m.f1009m).getBinder());
                if (fVar != null) {
                    ((Messenger) fVar.f1520d.f1009m).getBinder().unlinkToDeath(fVar, 0);
                    return;
                }
                return;
            default:
                IBinder binder = ((Messenger) this.f1550m.f1009m).getBinder();
                f fVar2 = (f) ((t) this.f1551n.f1009m).f1574p.remove(binder);
                if (fVar2 != null) {
                    binder.unlinkToDeath(fVar2, 0);
                    return;
                }
                return;
        }
    }
}
