package android.support.v4.media;

import Y.x;
import android.content.ComponentName;
import android.content.Context;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3667b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    public final d f3668a;

    public e(Context context, ComponentName componentName, c cVar) {
        this.f3668a = new d(context, componentName, cVar);
    }

    public final void a() {
        Messenger messenger;
        d dVar = this.f3668a;
        x xVar = dVar.f3664f;
        if (xVar != null && (messenger = dVar.f3665g) != null) {
            try {
                xVar.Z(7, null, messenger);
            } catch (RemoteException unused) {
                Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
            }
        }
        dVar.f3660b.disconnect();
    }
}
