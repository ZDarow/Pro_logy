package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s2.C0548e;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final MediaController f3704a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3705b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3706c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3707d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final MediaSessionCompat$Token f3708e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, android.os.ResultReceiver] */
    public h(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f3708e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f3675m);
        this.f3704a = mediaController;
        if (mediaSessionCompat$Token.d() == null) {
            ?? resultReceiver = new ResultReceiver(null);
            resultReceiver.f3669l = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, resultReceiver);
        }
    }

    public final void a() {
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f3708e;
        if (mediaSessionCompat$Token.d() == null) {
            return;
        }
        ArrayList arrayList = this.f3706c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0548e c0548e = (C0548e) it.next();
            g gVar = new g(c0548e);
            this.f3707d.put(c0548e, gVar);
            c0548e.f8236c = gVar;
            try {
                mediaSessionCompat$Token.d().k(gVar);
                c0548e.a(13, null, null);
            } catch (RemoteException e4) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e4);
            }
        }
        arrayList.clear();
    }

    public final void b(C0548e c0548e) {
        this.f3704a.unregisterCallback(c0548e.f8234a);
        synchronized (this.f3705b) {
            if (this.f3708e.d() != null) {
                try {
                    g gVar = (g) this.f3707d.remove(c0548e);
                    if (gVar != null) {
                        c0548e.f8236c = null;
                        this.f3708e.d().r(gVar);
                    }
                } catch (RemoteException e4) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e4);
                }
            } else {
                this.f3706c.remove(c0548e);
            }
        }
    }
}
