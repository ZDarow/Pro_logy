package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;

/* loaded from: classes.dex */
public final class l extends MediaSession.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f3709a;

    public l(m mVar) {
        this.f3709a = mVar;
    }

    public static void b(o oVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        MediaSession mediaSession = oVar.f3717a;
        String str = null;
        try {
            str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (Exception e4) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e4);
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        oVar.f(new Q.u(-1, -1, str));
    }

    public final o a() {
        o oVar;
        synchronized (this.f3709a.f3710a) {
            oVar = (o) this.f3709a.f3713d.get();
        }
        if (oVar == null || this.f3709a != oVar.b()) {
            return null;
        }
        return oVar;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        p1.d dVar;
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = a4.f3719c;
                d d4 = mediaSessionCompat$Token.d();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", d4 == null ? null : d4.asBinder());
                synchronized (mediaSessionCompat$Token.f3674l) {
                    dVar = mediaSessionCompat$Token.f3677o;
                }
                if (dVar != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(dVar));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                this.f3709a.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                this.f3709a.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                this.f3709a.p((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f3709a.getClass();
            } else if (a4.f3723g != null) {
                int i4 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i4 < 0 || i4 >= a4.f3723g.size()) ? null : (MediaSessionCompat$QueueItem) a4.f3723g.get(i4);
                if (mediaSessionCompat$QueueItem != null) {
                    this.f3709a.p(mediaSessionCompat$QueueItem.f3670l);
                }
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            m mVar = this.f3709a;
            if (equals) {
                Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.b0(bundle2);
                mVar.k(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                mVar.l();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.b0(bundle3);
                mVar.m(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.b0(bundle4);
                mVar.n(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.b0(bundle5);
                mVar.o(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                mVar.s(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                mVar.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                mVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                t.b0(bundle6);
                mVar.v(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                mVar.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                mVar.d(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.e();
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        o a4 = a();
        if (a4 == null) {
            return false;
        }
        b(a4);
        boolean f4 = this.f3709a.f(intent);
        a4.f(null);
        return f4 || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.g();
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.h();
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        this.f3709a.i(str, bundle);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        this.f3709a.j(str, bundle);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        this.f3709a.k(uri, bundle);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.l();
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        this.f3709a.m(str, bundle);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        this.f3709a.n(str, bundle);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        t.b0(bundle);
        b(a4);
        this.f3709a.o(uri, bundle);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.q();
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j4) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.r(j4);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f4) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.t(f4);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.u(RatingCompat.d(rating));
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.y();
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.z();
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j4) {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.A(j4);
        a4.f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        o a4 = a();
        if (a4 == null) {
            return;
        }
        b(a4);
        this.f3709a.B();
        a4.f(null);
    }
}
