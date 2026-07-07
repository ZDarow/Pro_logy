package O1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class v implements ServiceConnection {

    /* renamed from: l, reason: collision with root package name */
    public final int f1482l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f1483m;

    public v(com.google.android.gms.common.internal.a aVar, int i4) {
        this.f1483m = aVar;
        this.f1482l = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i4;
        int i5;
        com.google.android.gms.common.internal.a aVar = this.f1483m;
        if (iBinder == null) {
            synchronized (aVar.f4755q) {
                i4 = aVar.f4760x;
            }
            if (i4 == 3) {
                aVar.f4746E = true;
                i5 = 5;
            } else {
                i5 = 4;
            }
            t tVar = aVar.f4754p;
            tVar.sendMessage(tVar.obtainMessage(i5, aVar.f4748G.get(), 16));
            return;
        }
        synchronized (aVar.f4756r) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f1483m;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.s = (queryLocalInterface == null || !(queryLocalInterface instanceof r)) ? new r(iBinder) : (r) queryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f1483m;
        int i6 = this.f1482l;
        aVar3.getClass();
        x xVar = new x(aVar3, 0);
        t tVar2 = aVar3.f4754p;
        tVar2.sendMessage(tVar2.obtainMessage(7, i6, -1, xVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f1483m.f4756r) {
            aVar = this.f1483m;
            aVar.s = null;
        }
        int i4 = this.f1482l;
        t tVar = aVar.f4754p;
        tVar.sendMessage(tVar.obtainMessage(6, i4, 1));
    }
}
