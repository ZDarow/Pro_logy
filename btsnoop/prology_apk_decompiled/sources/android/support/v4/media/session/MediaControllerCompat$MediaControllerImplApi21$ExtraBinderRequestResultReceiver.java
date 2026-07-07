package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import p1.AbstractC0462a;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f3669l;

    /* JADX WARN: Type inference failed for: r4v2, types: [android.support.v4.media.session.c, java.lang.Object] */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i4, Bundle bundle) {
        d dVar;
        h hVar = (h) this.f3669l.get();
        if (hVar == null || bundle == null) {
            return;
        }
        synchronized (hVar.f3705b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = hVar.f3708e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i5 = n.f3715d;
            p1.d dVar2 = null;
            if (binder == null) {
                dVar = null;
            } else {
                IInterface queryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    ?? obj = new Object();
                    obj.f3699c = binder;
                    dVar = obj;
                } else {
                    dVar = (d) queryLocalInterface;
                }
            }
            synchronized (mediaSessionCompat$Token.f3674l) {
                mediaSessionCompat$Token.f3676n = dVar;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.f3708e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(AbstractC0462a.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    dVar2 = ((ParcelImpl) parcelable).f4315l;
                }
            } catch (RuntimeException unused) {
            }
            synchronized (mediaSessionCompat$Token2.f3674l) {
                mediaSessionCompat$Token2.f3677o = dVar2;
            }
            hVar.a();
        }
    }
}
