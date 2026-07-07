package Q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K2.o f1557l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1558m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f1559n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1560o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ K2.o f1561p;

    public q(int i4, int i5, K2.o oVar, K2.o oVar2, Bundle bundle, String str) {
        this.f1561p = oVar;
        this.f1557l = oVar2;
        this.f1558m = i4;
        this.f1559n = str;
        this.f1560o = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar;
        K2.o oVar = this.f1557l;
        IBinder binder = ((Messenger) oVar.f1009m).getBinder();
        K2.o oVar2 = this.f1561p;
        ((t) oVar2.f1009m).f1574p.remove(binder);
        t tVar = (t) oVar2.f1009m;
        Iterator it = tVar.f1573o.iterator();
        while (true) {
            fVar = null;
            if (!it.hasNext()) {
                break;
            }
            f fVar2 = (f) it.next();
            if (fVar2.f1519c == this.f1558m) {
                if (TextUtils.isEmpty(this.f1559n) || this.f1560o <= 0) {
                    fVar = new f((t) oVar2.f1009m, fVar2.f1517a, fVar2.f1518b, fVar2.f1519c, oVar);
                }
                it.remove();
            }
        }
        if (fVar == null) {
            fVar = new f((t) oVar2.f1009m, this.f1559n, this.f1560o, this.f1558m, oVar);
        }
        tVar.f1574p.put(binder, fVar);
        try {
            binder.linkToDeath(fVar, 0);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "IBinder is already dead.");
        }
    }
}
