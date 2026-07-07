package android.support.v4.media;

import Y.x;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.n;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3656a;

    public b(c cVar) {
        this.f3656a = cVar;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.support.v4.media.session.c, java.lang.Object] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.d dVar;
        int i4 = 6;
        char c4 = 0;
        c cVar = this.f3656a;
        d dVar2 = cVar.f3658b;
        if (dVar2 != null) {
            MediaBrowser mediaBrowser = dVar2.f3660b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        x xVar = new x(c4, i4);
                        xVar.f3065m = new Messenger(binder);
                        xVar.f3066n = dVar2.f3661c;
                        dVar2.f3664f = xVar;
                        a aVar = dVar2.f3662d;
                        Messenger messenger = new Messenger(aVar);
                        dVar2.f3665g = messenger;
                        aVar.getClass();
                        aVar.f3655b = new WeakReference(messenger);
                        try {
                            x xVar2 = dVar2.f3664f;
                            Context context = dVar2.f3659a;
                            Messenger messenger2 = dVar2.f3665g;
                            xVar2.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) xVar2.f3066n);
                            xVar2.Z(6, bundle, messenger2);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i5 = n.f3715d;
                    if (binder2 == null) {
                        dVar = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.media.session.d)) {
                            ?? obj = new Object();
                            obj.f3699c = binder2;
                            dVar = obj;
                        } else {
                            dVar = (android.support.v4.media.session.d) queryLocalInterface;
                        }
                    }
                    if (dVar != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        dVar2.f3666h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, dVar) : null;
                    }
                }
            } catch (IllegalStateException e4) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e4);
            }
        }
        cVar.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        c cVar = this.f3656a;
        d dVar = cVar.f3658b;
        cVar.b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        c cVar = this.f3656a;
        d dVar = cVar.f3658b;
        if (dVar != null) {
            dVar.f3664f = null;
            dVar.f3665g = null;
            dVar.f3666h = null;
            a aVar = dVar.f3662d;
            aVar.getClass();
            aVar.f3655b = new WeakReference(null);
        }
        cVar.c();
    }
}
