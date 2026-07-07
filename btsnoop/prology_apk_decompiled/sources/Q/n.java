package Q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;

/* loaded from: classes.dex */
public final class n implements Runnable {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K2.o f1543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f1544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1545n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1546o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bundle f1547p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ K2.o f1548q;

    public n(int i4, int i5, K2.o oVar, K2.o oVar2, Bundle bundle, String str) {
        this.f1548q = oVar;
        this.f1543l = oVar2;
        this.f1544m = str;
        this.f1545n = i4;
        this.f1546o = i5;
        this.f1547p = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K2.o oVar = this.f1543l;
        IBinder binder = ((Messenger) oVar.f1009m).getBinder();
        K2.o oVar2 = this.f1548q;
        ((t) oVar2.f1009m).f1574p.remove(binder);
        String str = this.f1544m;
        f fVar = new f((t) oVar2.f1009m, str, this.f1545n, this.f1546o, oVar);
        t tVar = (t) oVar2.f1009m;
        tVar.getClass();
        fVar.f1522f = tVar.b(this.f1547p);
        tVar.getClass();
        if (fVar.f1522f == null) {
            Log.i("MBServiceCompat", "No root for client " + str + " from service " + n.class.getName());
            try {
                oVar.M(2, null);
                return;
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=".concat(str));
                return;
            }
        }
        try {
            tVar.f1574p.put(binder, fVar);
            binder.linkToDeath(fVar, 0);
            MediaSessionCompat$Token mediaSessionCompat$Token = tVar.f1576r;
            if (mediaSessionCompat$Token != null) {
                B1.d dVar = fVar.f1522f;
                String str2 = (String) dVar.f96m;
                Bundle bundle = (Bundle) dVar.f97n;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putInt("extra_service_version", 2);
                Bundle bundle2 = new Bundle();
                bundle2.putString("data_media_item_id", str2);
                bundle2.putParcelable("data_media_session_token", mediaSessionCompat$Token);
                bundle2.putBundle("data_root_hints", bundle);
                oVar.M(1, bundle2);
            }
        } catch (RemoteException unused2) {
            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=".concat(str));
            tVar.f1574p.remove(binder);
        }
    }
}
