package O1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class B implements Handler.Callback {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C f1402l;

    public /* synthetic */ B(C c4) {
        this.f1402l = c4;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == 0) {
            synchronized (this.f1402l.f1406a) {
                try {
                    z zVar = (z) message.obj;
                    A a4 = (A) this.f1402l.f1406a.get(zVar);
                    if (a4 != null && a4.f1395l.isEmpty()) {
                        if (a4.f1397n) {
                            a4.f1401r.f1408c.removeMessages(1, a4.f1399p);
                            C c4 = a4.f1401r;
                            c4.f1409d.a(c4.f1407b, a4);
                            a4.f1397n = false;
                            a4.f1396m = 2;
                        }
                        this.f1402l.f1406a.remove(zVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i4 != 1) {
            return false;
        }
        synchronized (this.f1402l.f1406a) {
            try {
                z zVar2 = (z) message.obj;
                A a5 = (A) this.f1402l.f1406a.get(zVar2);
                if (a5 != null && a5.f1396m == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(zVar2)), new Exception());
                    ComponentName componentName = a5.f1400q;
                    if (componentName == null) {
                        zVar2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = zVar2.f1493b;
                        s.d(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    a5.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
