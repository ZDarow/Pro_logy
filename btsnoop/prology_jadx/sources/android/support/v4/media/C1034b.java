package android.support.v4.media;

/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public final class C1034b extends android.media.browse.MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    public final /* synthetic */ android.support.v4.media.AbstractC1035c f3781a;

    public C1034b(android.support.v4.media.AbstractC1035c abstractC1035c) {
        this.f3781a = abstractC1035c;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [android.support.v4.media.session.c, java.lang.Object] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        android.support.v4.media.session.InterfaceC1045d interfaceC1045d;
        int i4 = 6;
        char c4 = 0;
        android.support.v4.media.AbstractC1035c abstractC1035c = this.f3781a;
        android.support.v4.media.C1036d c1036d = abstractC1035c.f3783b;
        if (c1036d != null) {
            android.media.browse.MediaBrowser mediaBrowser = c1036d.f3785b;
            try {
                android.os.Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    android.os.IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        p094Y.C0886x c0886x = new p094Y.C0886x(c4, i4);
                        c0886x.f3175m = new android.os.Messenger(binder);
                        c0886x.f3176n = c1036d.f3786c;
                        c1036d.f3789f = c0886x;
                        android.support.v4.media.HandlerC1033a handlerC1033a = c1036d.f3787d;
                        android.os.Messenger messenger = new android.os.Messenger(handlerC1033a);
                        c1036d.f3790g = messenger;
                        handlerC1033a.getClass();
                        handlerC1033a.f3780b = new java.lang.ref.WeakReference(messenger);
                        try {
                            p094Y.C0886x c0886x2 = c1036d.f3789f;
                            android.content.Context context = c1036d.f3784a;
                            android.os.Messenger messenger2 = c1036d.f3790g;
                            c0886x2.getClass();
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", android.os.Process.myPid());
                            bundle.putBundle("data_root_hints", (android.os.Bundle) c0886x2.f3176n);
                            c0886x2.m1722Z(6, bundle, messenger2);
                        } catch (android.os.RemoteException unused) {
                            android.util.Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    android.os.IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i5 = android.support.v4.media.session.BinderC1055n.f3842d;
                    if (binder2 == null) {
                        interfaceC1045d = null;
                    } else {
                        android.os.IInterface queryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.media.session.InterfaceC1045d)) {
                            ?? obj = new java.lang.Object();
                            obj.f3826c = binder2;
                            interfaceC1045d = obj;
                        } else {
                            interfaceC1045d = (android.support.v4.media.session.InterfaceC1045d) queryLocalInterface;
                        }
                    }
                    if (interfaceC1045d != null) {
                        android.media.session.MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        c1036d.f3791h = sessionToken != null ? new android.support.v4.media.session.MediaSessionCompat$Token(sessionToken, interfaceC1045d) : null;
                    }
                }
            } catch (java.lang.IllegalStateException e4) {
                android.util.Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e4);
            }
        }
        abstractC1035c.mo1130a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        android.support.v4.media.AbstractC1035c abstractC1035c = this.f3781a;
        android.support.v4.media.C1036d c1036d = abstractC1035c.f3783b;
        abstractC1035c.mo1131b();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        android.support.v4.media.AbstractC1035c abstractC1035c = this.f3781a;
        android.support.v4.media.C1036d c1036d = abstractC1035c.f3783b;
        if (c1036d != null) {
            c1036d.f3789f = null;
            c1036d.f3790g = null;
            c1036d.f3791h = null;
            android.support.v4.media.HandlerC1033a handlerC1033a = c1036d.f3787d;
            handlerC1033a.getClass();
            handlerC1033a.f3780b = new java.lang.ref.WeakReference(null);
        }
        abstractC1035c.mo1132c();
    }
}
