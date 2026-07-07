package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* loaded from: classes.dex */
class ResultReceiverC1041x50fd9e4a extends android.os.ResultReceiver {

    /* renamed from: l */
    public java.lang.ref.WeakReference f3794l;

    /* JADX WARN: Type inference failed for: r4v2, types: [android.support.v4.media.session.c, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, android.os.Bundle bundle) {
        android.support.v4.media.session.InterfaceC1045d interfaceC1045d;
        android.support.v4.media.session.C1049h c1049h = (android.support.v4.media.session.C1049h) this.f3794l.get();
        if (c1049h == null || bundle == null) {
            return;
        }
        synchronized (c1049h.f3832b) {
            android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = c1049h.f3835e;
            android.os.IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i5 = android.support.v4.media.session.BinderC1055n.f3842d;
            p176p1.InterfaceC1952d interfaceC1952d = null;
            if (binder == null) {
                interfaceC1045d = null;
            } else {
                android.os.IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof android.support.v4.media.session.InterfaceC1045d)) {
                    ?? obj = new java.lang.Object();
                    obj.f3826c = binder;
                    interfaceC1045d = obj;
                } else {
                    interfaceC1045d = (android.support.v4.media.session.InterfaceC1045d) queryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.f3799l) {
                mediaSessionCompat$Token.f3801n = interfaceC1045d;
            }
            android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token2 = c1049h.f3835e;
            try {
                android.os.Bundle bundle2 = (android.os.Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(p176p1.AbstractC1949a.class.getClassLoader());
                    android.os.Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof androidx.versionedparcelable.ParcelImpl)) {
                        throw new java.lang.IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC1952d = ((androidx.versionedparcelable.ParcelImpl) parcelable).f4471l;
                }
            } catch (java.lang.RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.f3799l) {
                mediaSessionCompat$Token2.f3802o = interfaceC1952d;
            }
            c1049h.m2156a();
        }
    }
}
