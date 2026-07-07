package android.support.v4.media.session;

/* renamed from: android.support.v4.media.session.l */
/* loaded from: classes.dex */
public final class C1053l extends android.media.session.MediaSession.Callback {

    /* renamed from: a */
    public final /* synthetic */ android.support.v4.media.session.AbstractC1054m f3836a;

    public C1053l(android.support.v4.media.session.AbstractC1054m abstractC1054m) {
        this.f3836a = abstractC1054m;
    }

    /* renamed from: b */
    public static void m2158b(android.support.v4.media.session.C1056o c1056o) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return;
        }
        android.media.session.MediaSession mediaSession = c1056o.f3844a;
        java.lang.String str = null;
        try {
            str = (java.lang.String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (java.lang.Exception e4) {
            android.util.Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e4);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c1056o.mo2193f(new p064Q.C0549u(-1, -1, str));
    }

    /* renamed from: a */
    public final android.support.v4.media.session.C1056o m2159a() {
        android.support.v4.media.session.C1056o c1056o;
        synchronized (this.f3836a.f3837a) {
            c1056o = (android.support.v4.media.session.C1056o) this.f3836a.f3840d.get();
        }
        if (c1056o == null || this.f3836a != c1056o.m2189b()) {
            return null;
        }
        return c1056o;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(java.lang.String str, android.os.Bundle bundle, android.os.ResultReceiver resultReceiver) {
        p176p1.InterfaceC1952d interfaceC1952d;
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = m2159a.f3846c;
                android.support.v4.media.session.InterfaceC1045d m2098d = mediaSessionCompat$Token.m2098d();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", m2098d == null ? null : m2098d.asBinder());
                synchronized (mediaSessionCompat$Token.f3799l) {
                    interfaceC1952d = mediaSessionCompat$Token.f3802o;
                }
                if (interfaceC1952d != null) {
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putParcelable("a", new androidx.versionedparcelable.ParcelImpl(interfaceC1952d));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                this.f3836a.mo2163b((android.support.v4.media.MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                this.f3836a.mo2164c((android.support.v4.media.MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                this.f3836a.mo2177p((android.support.v4.media.MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f3836a.getClass();
            } else if (m2159a.f3850g != null) {
                int i4 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                android.support.v4.media.session.MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = (i4 < 0 || i4 >= m2159a.f3850g.size()) ? null : (android.support.v4.media.session.MediaSessionCompat$QueueItem) m2159a.f3850g.get(i4);
                if (mediaSessionCompat$QueueItem != null) {
                    this.f3836a.mo2177p(mediaSessionCompat$QueueItem.f3795l);
                }
            }
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            android.support.v4.media.session.AbstractC1054m abstractC1054m = this.f3836a;
            if (equals) {
                android.net.Uri uri = (android.net.Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                android.os.Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                android.support.v4.media.session.C1061t.m2199b0(bundle2);
                abstractC1054m.mo2172k(uri, bundle2);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                abstractC1054m.mo2173l();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                java.lang.String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                android.os.Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                android.support.v4.media.session.C1061t.m2199b0(bundle3);
                abstractC1054m.mo2174m(string, bundle3);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                java.lang.String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                android.os.Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                android.support.v4.media.session.C1061t.m2199b0(bundle4);
                abstractC1054m.mo2175n(string2, bundle4);
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                android.net.Uri uri2 = (android.net.Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                android.os.Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                android.support.v4.media.session.C1061t.m2199b0(bundle5);
                abstractC1054m.mo2176o(uri2, bundle5);
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                abstractC1054m.mo2180s(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                abstractC1054m.mo2184w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                abstractC1054m.mo2185x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                android.support.v4.media.RatingCompat ratingCompat = (android.support.v4.media.RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                android.os.Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                android.support.v4.media.session.C1061t.m2199b0(bundle6);
                abstractC1054m.mo2183v(ratingCompat, bundle6);
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                abstractC1054m.mo2181t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
            } else {
                abstractC1054m.mo2165d(str, bundle);
            }
        } catch (android.os.BadParcelableException unused) {
            android.util.Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2166e();
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(android.content.Intent intent) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return false;
        }
        m2158b(m2159a);
        boolean mo2167f = this.f3836a.mo2167f(intent);
        m2159a.mo2193f(null);
        return mo2167f || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2168g();
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2169h();
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        this.f3836a.mo2170i(str, bundle);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        this.f3836a.mo2171j(str, bundle);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        this.f3836a.mo2172k(uri, bundle);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2173l();
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        this.f3836a.mo2174m(str, bundle);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(java.lang.String str, android.os.Bundle bundle) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        this.f3836a.mo2175n(str, bundle);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(android.net.Uri uri, android.os.Bundle bundle) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        android.support.v4.media.session.C1061t.m2199b0(bundle);
        m2158b(m2159a);
        this.f3836a.mo2176o(uri, bundle);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2178q();
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j4) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2179r(j4);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f4) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2181t(f4);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(android.media.Rating rating) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2182u(android.support.v4.media.RatingCompat.m2064d(rating));
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2186y();
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2187z();
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j4) {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2160A(j4);
        m2159a.mo2193f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        android.support.v4.media.session.C1056o m2159a = m2159a();
        if (m2159a == null) {
            return;
        }
        m2158b(m2159a);
        this.f3836a.mo2161B();
        m2159a.mo2193f(null);
    }
}
