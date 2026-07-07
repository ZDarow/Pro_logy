package O;

import android.support.v4.media.session.t;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1331l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f1332m;

    public /* synthetic */ a(d dVar, int i4) {
        this.f1331l = i4;
        this.f1332m = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1331l) {
            case 0:
                this.f1332m.f1344u.onDismiss(null);
                return;
            default:
                d dVar = this.f1332m;
                if (dVar.f1339o != null) {
                    if (dVar.f1339o == null) {
                        t tVar = new t(8, false);
                        Object obj = d.f1335y;
                        tVar.f3734m = obj;
                        tVar.f3735n = obj;
                        tVar.f3736o = obj;
                        dVar.f1339o = tVar;
                    }
                    dVar.f1339o.getClass();
                    return;
                }
                return;
        }
    }
}
