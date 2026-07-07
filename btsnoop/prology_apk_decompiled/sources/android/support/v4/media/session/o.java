package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import com.ryanheise.audioservice.AudioService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final MediaSession f3717a;

    /* renamed from: b, reason: collision with root package name */
    public final n f3718b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaSessionCompat$Token f3719c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3720d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final RemoteCallbackList f3721e = new RemoteCallbackList();

    /* renamed from: f, reason: collision with root package name */
    public PlaybackStateCompat f3722f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f3723g;

    /* renamed from: h, reason: collision with root package name */
    public MediaMetadataCompat f3724h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3725i;

    /* renamed from: j, reason: collision with root package name */
    public int f3726j;

    /* renamed from: k, reason: collision with root package name */
    public int f3727k;

    /* renamed from: l, reason: collision with root package name */
    public m f3728l;

    /* renamed from: m, reason: collision with root package name */
    public Q.u f3729m;

    public o(AudioService audioService) {
        MediaSession a4 = a(audioService);
        this.f3717a = a4;
        n nVar = new n(this);
        this.f3718b = nVar;
        this.f3719c = new MediaSessionCompat$Token(a4.getSessionToken(), nVar);
        a4.setFlags(3);
    }

    public MediaSession a(AudioService audioService) {
        return new MediaSession(audioService, "media-session");
    }

    public final m b() {
        m mVar;
        synchronized (this.f3720d) {
            mVar = this.f3728l;
        }
        return mVar;
    }

    public Q.u c() {
        Q.u uVar;
        synchronized (this.f3720d) {
            uVar = this.f3729m;
        }
        return uVar;
    }

    public final PlaybackStateCompat d() {
        return this.f3722f;
    }

    public final void e(m mVar, Handler handler) {
        synchronized (this.f3720d) {
            this.f3728l = mVar;
            this.f3717a.setCallback(mVar == null ? null : mVar.f3711b, handler);
            if (mVar != null) {
                synchronized (mVar.f3710a) {
                    try {
                        mVar.f3713d = new WeakReference(this);
                        Q.s sVar = mVar.f3714e;
                        Q.s sVar2 = null;
                        if (sVar != null) {
                            sVar.removeCallbacksAndMessages(null);
                        }
                        if (handler != null) {
                            sVar2 = new Q.s(mVar, handler.getLooper(), 1);
                        }
                        mVar.f3714e = sVar2;
                    } finally {
                    }
                }
            }
        }
    }

    public void f(Q.u uVar) {
        synchronized (this.f3720d) {
            this.f3729m = uVar;
        }
    }
}
